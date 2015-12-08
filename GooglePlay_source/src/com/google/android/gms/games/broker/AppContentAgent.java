// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import android.util.SparseArray;
import com.android.volley.VolleyError;
import com.google.android.gms.auth.GoogleAuthException;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.server.BaseApiaryServer;
import com.google.android.gms.common.server.error.ErrorUtils;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.server.response.FastMapJsonResponse;
import com.google.android.gms.games.cache.AppContentActionCache;
import com.google.android.gms.games.cache.AppContentAnnotationCache;
import com.google.android.gms.games.cache.AppContentConditionCache;
import com.google.android.gms.games.cache.AppContentSectionAndCardCache;
import com.google.android.gms.games.cache.AppContentTupleCache;
import com.google.android.gms.games.constants.DeviceType;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.server.api.AppContentsApiInternal;
import com.google.android.gms.games.server.api.Card;
import com.google.android.gms.games.server.api.CardAction;
import com.google.android.gms.games.server.api.CardAnnotation;
import com.google.android.gms.games.server.api.CardCondition;
import com.google.android.gms.games.server.api.ContentEntry;
import com.google.android.gms.games.server.api.GamesCardScreenFirstPartyResponse;
import com.google.android.gms.games.server.api.ImageAsset;
import com.google.android.gms.games.server.api.Section;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            Lockable, GamesClientContext, Agents, AppContentContext

public final class AppContentAgent extends Lockable
{
    private final class CardImageInsertHelper
    {

        private final Context mContext;
        final Map mGroupImageCount = new ArrayMap();
        final Uri mImageContentUri;
        final ArrayList mImageIdIndex = new ArrayList();
        final ArrayList mOps = new ArrayList();
        final SparseArray mUriRowAndColumnMap = new SparseArray();
        final AppContentAgent this$0;

        public final void applyOperationsAndInsertUris()
        {
            ArrayList arraylist = Agents.applyContentOperationsWithResult(mContext.getContentResolver(), mOps, "AppContentAgent");
            if (arraylist != null)
            {
                int i = 0;
                int j = arraylist.size();
                while (i < j) 
                {
                    Integer integer = (Integer)mImageIdIndex.get(i);
                    Pair pair = (Pair)mUriRowAndColumnMap.get(integer.intValue());
                    ((ContentValues)pair.first).put((String)pair.second, ((ContentProviderResult)arraylist.get(integer.intValue())).uri.toString());
                    i++;
                }
            }
        }

        CardImageInsertHelper(Context context, ClientContext clientcontext)
        {
            this$0 = AppContentAgent.this;
            super();
            mContext = context;
            mImageContentUri = com.google.android.gms.games.provider.GamesContractInternal.Images.getContentUri(clientcontext);
        }
    }

    static interface ServerCookieQuery
    {

        public static final String PROJECTION[] = {
            "server_cookie"
        };

    }


    private static final Lockable.LockableLock LOCK = new Lockable.LockableLock();
    private final AppContentActionCache mActionCache = new AppContentActionCache();
    private final AppContentAnnotationCache mAnnotationCache = new AppContentAnnotationCache();
    private final AppContentsApiInternal mAppContentApi;
    private ContentValues mCachedSectionValues;
    public final AppContentSectionAndCardCache mCardStreamCache = new AppContentSectionAndCardCache();
    private final AppContentConditionCache mConditionCache = new AppContentConditionCache();
    private final AppContentTupleCache mTupleCache = new AppContentTupleCache();

    public AppContentAgent(Lockable lockable, BaseApiaryServer baseapiaryserver)
    {
        super("AppContentAgent", LOCK, lockable);
        mAppContentApi = new AppContentsApiInternal(baseapiaryserver);
        mCachedSectionValues = null;
    }

    private void buildCacheValues(GamesClientContext gamesclientcontext, ArrayList arraylist, ArrayList arraylist1)
    {
        CardImageInsertHelper cardimageinserthelper = new CardImageInsertHelper(gamesclientcontext.mContext, gamesclientcontext.mClientContext);
        ArrayList arraylist2 = (ArrayList)arraylist1.get(1);
        ArrayList arraylist3 = (ArrayList)arraylist1.get(2);
        ArrayList arraylist4 = (ArrayList)arraylist1.get(0);
        ArrayList arraylist5 = (ArrayList)arraylist1.get(3);
        int k = arraylist.size();
        int i = 0;
        while (i < k) 
        {
            Object obj = ((ContentEntry)arraylist.get(i)).getSection();
            Preconditions.checkNotNull(obj, "Top-level card entries, must be sections.");
            gamesclientcontext = new ContentValues(((FastContentValuesJsonResponse) (obj)).mValues);
            String s = gamesclientcontext.getAsString("section_id");
            boolean flag1 = "CONTINUES".equals((String)((FastContentValuesJsonResponse) (obj)).mValues.get("section_type"));
            if (flag1)
            {
                boolean flag;
                if (mCachedSectionValues != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Preconditions.checkState(flag, "Continuing a previous section, but didn't have a previous section cached");
                gamesclientcontext = new ContentValues(mCachedSectionValues);
            }
            if (!flag1)
            {
                gamesclientcontext.put("section_id", s);
                buildCacheValuesForGenericResponse("section_data", s, "tuple_id", "TUPLE", safeFastContent(((Section) (obj)).getSectionData()), gamesclientcontext, arraylist5, arraylist1, cardimageinserthelper);
                buildCacheValuesForGenericResponse("section_actions", s, "action_id", "ACTION", safeFastContent(((Section) (obj)).getActions()), gamesclientcontext, arraylist2, arraylist1, cardimageinserthelper);
                buildCacheValuesForGenericResponse("section_annotations", s, "annotation_id", "ANNOTATION", safeFastContent(((Section) (obj)).getAnnotations()), gamesclientcontext, arraylist3, arraylist1, cardimageinserthelper);
            }
            obj = ((Section) (obj)).getEntries();
            if (obj == null || ((ArrayList) (obj)).size() == 0)
            {
                arraylist4.add(gamesclientcontext);
            } else
            {
                int j = 0;
                int l = ((ArrayList) (obj)).size();
                while (j < l) 
                {
                    Card card = ((ContentEntry)((ArrayList) (obj)).get(j)).getCard();
                    Preconditions.checkNotNull(card, "2nd-level card entries, must be cards.");
                    ContentValues contentvalues = new ContentValues(gamesclientcontext);
                    ArrayList arraylist6 = (ArrayList)arraylist1.get(1);
                    ArrayList arraylist7 = (ArrayList)arraylist1.get(2);
                    ArrayList arraylist8 = (ArrayList)arraylist1.get(4);
                    ArrayList arraylist9 = (ArrayList)arraylist1.get(3);
                    String s1 = ((FastContentValuesJsonResponse) (card)).mValues.getAsString("card_id");
                    contentvalues.put("card_id", s1);
                    contentvalues.putAll(((FastContentValuesJsonResponse) (card)).mValues);
                    buildCacheValuesForGenericResponse("card_actions", s1, "action_id", "ACTION", safeFastContent(card.getActions()), contentvalues, arraylist6, arraylist1, cardimageinserthelper);
                    buildCacheValuesForGenericResponse("card_annotations", s1, "annotation_id", "ANNOTATION", safeFastContent(card.getAnnotations()), contentvalues, arraylist7, arraylist1, cardimageinserthelper);
                    buildCacheValuesForGenericResponse("card_conditions", s1, "condition_id", "CONDITION", safeFastContent(card.getConditions()), contentvalues, arraylist8, arraylist1, cardimageinserthelper);
                    buildCacheValuesForGenericResponse("card_data", s1, "tuple_id", "TUPLE", safeFastContent(card.getCardData()), contentvalues, arraylist9, arraylist1, cardimageinserthelper);
                    arraylist4.add(contentvalues);
                    j++;
                }
            }
            mCachedSectionValues = gamesclientcontext;
            i++;
        }
        cardimageinserthelper.applyOperationsAndInsertUris();
    }

    private void buildCacheValuesForGenericResponse(String s, String s1, String s2, String s3, ArrayList arraylist, ContentValues contentvalues, ArrayList arraylist1, 
            ArrayList arraylist2, CardImageInsertHelper cardimageinserthelper)
    {
        String s4;
        ArrayList arraylist4;
        ArrayList arraylist5;
        ArrayList arraylist6;
        StringBuilder stringbuilder;
        ContentValues contentvalues1;
        FastContentValuesJsonResponse fastcontentvaluesjsonresponse;
        int i;
        boolean flag;
        if (arraylist == null)
        {
            return;
        }
        Object obj;
        Object obj1;
        CardAnnotation cardannotation;
        int j;
        int k;
        boolean flag1;
        boolean flag2;
        if (cardimageinserthelper != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The image insertion helper should never be null.");
        if (arraylist1 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "The values list to insert into should never be null.");
        if (arraylist2 != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Must provide the content value collection.");
        flag = "action_id".equals(s2);
        flag1 = "annotation_id".equals(s2);
        flag2 = "condition_id".equals(s2);
        arraylist4 = (ArrayList)arraylist2.get(2);
        arraylist5 = (ArrayList)arraylist2.get(3);
        arraylist6 = (ArrayList)arraylist2.get(4);
        stringbuilder = new StringBuilder();
        i = 0;
        j = arraylist.size();
_L7:
        if (i >= j) goto _L2; else goto _L1
_L1:
        if (i != 0)
        {
            stringbuilder.append(",");
        }
        fastcontentvaluesjsonresponse = (FastContentValuesJsonResponse)arraylist.get(i);
        contentvalues1 = fastcontentvaluesjsonresponse.mValues;
        arraylist1.add(contentvalues1);
        if (flag || flag1)
        {
            s4 = contentvalues1.getAsString(s2);
        } else
        {
            if (TextUtils.isEmpty(s1))
            {
                s4 = String.format("%s%s%d", new Object[] {
                    s3, "/", Integer.valueOf(i)
                });
            } else
            {
                s4 = String.format("%s%s%s%s%d", new Object[] {
                    s1, "/", s3, "/", Integer.valueOf(i)
                });
            }
            contentvalues1.put(s2, s4);
        }
        stringbuilder.append(s4);
        if (flag1 && (fastcontentvaluesjsonresponse instanceof CardAnnotation))
        {
            cardannotation = (CardAnnotation)fastcontentvaluesjsonresponse;
            obj = cardannotation.getImage();
            if (obj != null)
            {
                obj1 = ((ImageAsset) (obj)).getUrl();
                obj1 = Agents.addInsertImageOp(cardimageinserthelper.mImageContentUri, ((String) (obj1)), cardimageinserthelper.mOps);
                cardimageinserthelper.mImageIdIndex.add(obj1);
                cardimageinserthelper.mUriRowAndColumnMap.put(((Integer) (obj1)).intValue(), new Pair(contentvalues1, "annotation_image_uri"));
                contentvalues1.put("annotation_image_height", (Integer)((FastMapJsonResponse) (obj)).mValues.get("height"));
                contentvalues1.put("annotation_image_width", (Integer)((FastMapJsonResponse) (obj)).mValues.get("width"));
                obj1 = (Integer)cardimageinserthelper.mGroupImageCount.get(s4);
                obj = obj1;
                if (obj1 == null)
                {
                    obj = Integer.valueOf(0);
                }
                k = ((Integer) (obj)).intValue();
                cardimageinserthelper.mGroupImageCount.put(s4, Integer.valueOf(k + 1));
            }
            buildCacheValuesForGenericResponse("annotation_modifiers", s4, "tuple_id", "TUPLE", safeFastContent(cardannotation.getModifiers()), contentvalues1, arraylist5, arraylist2, cardimageinserthelper);
        }
        if (!flag2 || !(fastcontentvaluesjsonresponse instanceof CardCondition)) goto _L4; else goto _L3
_L3:
        buildCacheValuesForGenericResponse("condition_predicate_parameters", s4, "tuple_id", "TUPLE", safeFastContent(((CardCondition)fastcontentvaluesjsonresponse).getPredicateParameters()), contentvalues1, arraylist5, arraylist2, cardimageinserthelper);
_L5:
        i++;
        continue; /* Loop/switch isn't completed */
_L4:
        if (flag && (fastcontentvaluesjsonresponse instanceof CardAction))
        {
            CardAction cardaction = (CardAction)fastcontentvaluesjsonresponse;
            ArrayList arraylist3 = new ArrayList();
            if (cardaction.getAnnotation() != null)
            {
                arraylist3.add(cardaction.getAnnotation());
            }
            buildCacheValuesForGenericResponse("action_annotation", s4, "annotation_id", "ANNOTATION", arraylist3, contentvalues1, arraylist4, arraylist2, cardimageinserthelper);
            buildCacheValuesForGenericResponse("action_conditions", s4, "condition_id", "CONDITION", safeFastContent(cardaction.getConditions()), contentvalues1, arraylist6, arraylist2, cardimageinserthelper);
            buildCacheValuesForGenericResponse("action_data", s4, "tuple_id", "TUPLE", safeFastContent(cardaction.getActionParameters()), contentvalues1, arraylist5, arraylist2, cardimageinserthelper);
        }
        if (true) goto _L5; else goto _L2
_L2:
        contentvalues.put(s, stringbuilder.toString());
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static void clearDBCache(Context context, ClientContext clientcontext, String s)
    {
        clientcontext = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.AppContents.getContentUri(clientcontext));
        if (!TextUtils.isEmpty(s))
        {
            clientcontext.addWhere("screen_name", s);
        }
        context.getContentResolver().delete(((QuerySpec) (clientcontext)).mUri, clientcontext.getSelection(), ((QuerySpec) (clientcontext)).mSelectionArgs);
    }

    private GamesCardScreenFirstPartyResponse getResponseFromCache(Context context, ClientContext clientcontext, AppContentContext appcontentcontext, String s, long l)
    {
        Object obj;
        Object obj1;
        Object obj2;
        byte abyte0[];
        String s1;
        s1 = appcontentcontext.screenName;
        obj1 = null;
        obj2 = null;
        obj = null;
        s = null;
        abyte0 = null;
        if (!mCardStreamCache.hasData(s1, l)) goto _L2; else goto _L1
_L1:
        mCardStreamCache.setStatusCode(s1, 0);
        context = abyte0;
_L4:
        return context;
_L2:
        QuerySpec queryspec = new QuerySpec(com.google.android.gms.games.provider.GamesContractInternal.AppContents.getContentUri(clientcontext));
        queryspec.addWhere("experiments", appcontentcontext.getExperimentOverrideString());
        queryspec.addWhere("screen_name", s1);
        clientcontext = obj1;
        if (Agents.getCount(context, queryspec) <= 0L)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        queryspec = Agents.queryBytes$aa0bbb8(context, queryspec.mUri, "json");
        clientcontext = obj1;
        if (queryspec == null)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        context = obj2;
        appcontentcontext = obj;
        clientcontext = (GamesCardScreenFirstPartyResponse)com/google/android/gms/games/server/api/GamesCardScreenFirstPartyResponse.newInstance();
        context = clientcontext;
        appcontentcontext = clientcontext;
        s = clientcontext;
        clientcontext.parseNetworkResponse(200, queryspec);
        context = clientcontext;
        appcontentcontext = clientcontext;
        s = clientcontext;
        try
        {
            mCardStreamCache.setStatusCode(s1, 3);
        }
        // Misplaced declaration of an exception variable
        catch (ClientContext clientcontext)
        {
            GamesLog.e("AppContentAgent", "Unable to recreate the App Content Response", clientcontext);
            clientcontext = context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("AppContentAgent", "Unable to recreate the App Content Response", context);
            clientcontext = appcontentcontext;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("AppContentAgent", "Unable to recreate the App Content Response", context);
            clientcontext = s;
        }
        context = clientcontext;
        if (clientcontext == null)
        {
            mCardStreamCache.setStatusCode(s1, 4);
            return clientcontext;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static ArrayList safeFastContent(ArrayList arraylist)
    {
        if (arraylist == null)
        {
            return null;
        } else
        {
            return new ArrayList(arraylist);
        }
    }

    DataHolder[] buildResponseFromCache(GamesClientContext gamesclientcontext, String s)
    {
        DataHolder dataholder = mCardStreamCache.getData(s, null);
        DataHolder dataholder1 = mActionCache.getData(s, null);
        DataHolder dataholder2 = mAnnotationCache.getData(s, null);
        DataHolder dataholder3 = mTupleCache.getData(s, null);
        DataHolder dataholder4 = mConditionCache.getData(s, null);
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.AppContents.getContentUri(gamesclientcontext.mClientContext);
        gamesclientcontext = (new Agents.QueryBuilder(gamesclientcontext)).setQuerySpec(uri, "screen_name=?", new String[] {
            s
        });
        gamesclientcontext.mProjection = ServerCookieQuery.PROJECTION;
        gamesclientcontext.mStatusCode = 0;
        return (new DataHolder[] {
            dataholder, dataholder1, dataholder2, dataholder3, dataholder4, gamesclientcontext.query()
        });
    }

    public final void enableCaches(String s)
    {
        mCardStreamCache.enableCaching(s);
        mActionCache.enableCaching(s);
        mAnnotationCache.enableCaching(s);
        mConditionCache.enableCaching(s);
        mTupleCache.enableCaching(s);
    }

    DataHolder[] loadCardStream$3489344c(GamesClientContext gamesclientcontext, AppContentContext appcontentcontext, long l)
        throws GoogleAuthException
    {
        String s;
        Context context;
        ClientContext clientcontext;
        context = gamesclientcontext.mContext;
        clientcontext = gamesclientcontext.mClientContext;
        s = appcontentcontext.screenName;
        Object obj;
        String s2;
        String s3;
        String s4;
        String s5;
        Boolean boolean1;
        StringBuilder stringbuilder;
        obj = mAppContentApi;
        int i = appcontentcontext.clientVersion;
        String s1 = appcontentcontext.screenName;
        s2 = Agents.getCurrentRevision();
        s3 = DeviceType.fromContext(context);
        s4 = appcontentcontext.getExperimentOverrideString();
        s5 = Agents.getLocaleString(context);
        boolean1 = Boolean.valueOf(Agents.isPlusRequired$9c10cfc());
        stringbuilder = new StringBuilder();
        (new Formatter(stringbuilder)).format("appContents/%1$s/screen/%2$s", new Object[] {
            String.valueOf(Integer.valueOf(i)), AppContentsApiInternal.enc(s1)
        });
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_135;
        }
        AppContentsApiInternal.append(stringbuilder, "clientRevision", AppContentsApiInternal.enc(s2));
        if (s3 == null)
        {
            break MISSING_BLOCK_LABEL_153;
        }
        AppContentsApiInternal.append(stringbuilder, "deviceType", AppContentsApiInternal.enc(s3));
        if (s4 == null)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        AppContentsApiInternal.append(stringbuilder, "experimentOverride", AppContentsApiInternal.enc(s4));
        if (s5 == null)
        {
            break MISSING_BLOCK_LABEL_189;
        }
        AppContentsApiInternal.append(stringbuilder, "language", AppContentsApiInternal.enc(s5));
        if (boolean1 == null)
        {
            break MISSING_BLOCK_LABEL_207;
        }
        AppContentsApiInternal.append(stringbuilder, "plusRequired", String.valueOf(boolean1));
        Object obj1 = stringbuilder.toString();
        obj = (GamesCardScreenFirstPartyResponse)((AppContentsApiInternal) (obj)).mServer.getResponseBlocking(clientcontext, 0, ((String) (obj1)), null, com/google/android/gms/games/server/api/GamesCardScreenFirstPartyResponse);
        clearDBCache(context, clientcontext, appcontentcontext.screenName);
        obj1 = new ContentValues();
        ((ContentValues) (obj1)).put("experiments", appcontentcontext.getExperimentOverrideString());
        ((ContentValues) (obj1)).put("json", ((GamesCardScreenFirstPartyResponse) (obj)).getResponseBody());
        ((ContentValues) (obj1)).put("page_token", null);
        ((ContentValues) (obj1)).put("screen_name", appcontentcontext.screenName);
        ((ContentValues) (obj1)).put("server_cookie", (byte[])((FastMapJsonResponse) (obj)).mValues.get("serverCookie"));
        context.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.AppContents.getContentUri(clientcontext), ((ContentValues) (obj1)));
        appcontentcontext = ((AppContentContext) (obj));
_L2:
        ArrayList arraylist = new ArrayList(6);
        arraylist.add(0, new ArrayList());
        arraylist.add(1, new ArrayList());
        arraylist.add(2, new ArrayList());
        arraylist.add(3, new ArrayList());
        arraylist.add(4, new ArrayList());
        buildCacheValues(gamesclientcontext, appcontentcontext.getItems(), arraylist);
        mActionCache.addCacheData(s, (ArrayList)arraylist.get(1), 0, null, appcontentcontext.getNextPageToken(), 0, l);
        mAnnotationCache.addCacheData(s, (ArrayList)arraylist.get(2), 0, null, appcontentcontext.getNextPageToken(), 0, l);
        mConditionCache.addCacheData(s, (ArrayList)arraylist.get(4), 0, null, appcontentcontext.getNextPageToken(), 0, l);
        mTupleCache.addCacheData(s, (ArrayList)arraylist.get(3), 0, null, appcontentcontext.getNextPageToken(), 0, l);
        mCardStreamCache.addCacheData(s, (ArrayList)arraylist.get(0), 0, null, appcontentcontext.getNextPageToken(), 0, l);
        return buildResponseFromCache(gamesclientcontext, s);
        VolleyError volleyerror;
        volleyerror;
        ErrorUtils.parseAndLogErrorResponse(volleyerror, "AppContentAgent");
        GamesCardScreenFirstPartyResponse gamescardscreenfirstpartyresponse = getResponseFromCache(context, clientcontext, appcontentcontext, null, l);
        appcontentcontext = gamescardscreenfirstpartyresponse;
        if (gamescardscreenfirstpartyresponse == null)
        {
            return buildResponseFromCache(gamesclientcontext, s);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

}
