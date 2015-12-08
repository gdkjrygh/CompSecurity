// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.broker;

import android.accounts.Account;
import android.content.ContentProviderClient;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.provider.QuerySpec;
import com.google.android.gms.common.provider.SelectionArgs;
import com.google.android.gms.common.server.response.FastContentValuesJsonResponse;
import com.google.android.gms.common.util.AndroidUtils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.PlayerBuffer;
import com.google.android.gms.games.PlayerRef;
import com.google.android.gms.games.config.G;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.data.GamesDataChangeUris;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.server.api.ApplicationFetchContext;
import com.google.android.gms.games.server.api.ApplicationFetchList;
import com.google.android.gms.games.server.api.FirstPartyNotification;
import com.google.android.gms.games.server.converter.ImageUrlBuilder;
import com.google.android.gms.games.service.GamesSyncAdapter;
import com.google.android.gms.games.util.AccountUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;

// Referenced classes of package com.google.android.gms.games.broker:
//            GamesClientContext

public final class Agents
{
    public static final class QueryBuilder
    {

        private final Context mContext;
        String mProjection[];
        QuerySpec mQuery;
        String mSortOrder;
        int mStatusCode;

        public final DataHolder query()
        {
            AbstractWindowedCursor abstractwindowedcursor = queryCursor();
            return new DataHolder(abstractwindowedcursor, Agents.resolveStatusCode(abstractwindowedcursor, mStatusCode));
        }

        public final AbstractWindowedCursor queryCursor()
        {
            ContentProviderClient contentproviderclient;
            if (mQuery == null)
            {
                throw new IllegalArgumentException("You must call setQuerySpec before querying.");
            }
            contentproviderclient = mContext.getContentResolver().acquireContentProviderClient("com.google.android.gms.games.background");
            AbstractWindowedCursor abstractwindowedcursor = (AbstractWindowedCursor)contentproviderclient.query(mQuery.mUri, mProjection, mQuery.getSelection(), mQuery.mSelectionArgs, mSortOrder);
            contentproviderclient.release();
            return abstractwindowedcursor;
            Object obj;
            obj;
            throw new RuntimeException(((Throwable) (obj)));
            obj;
            contentproviderclient.release();
            throw obj;
        }

        public final QueryBuilder setQuerySpec(Uri uri)
        {
            mQuery = new QuerySpec(uri);
            return this;
        }

        public final QueryBuilder setQuerySpec(Uri uri, String s, String as[])
        {
            mQuery = new QuerySpec(uri, s, as);
            return this;
        }

        public QueryBuilder(Context context)
        {
            mContext = context;
            mQuery = null;
            mProjection = null;
            mSortOrder = null;
            mStatusCode = 0;
        }

        public QueryBuilder(GamesClientContext gamesclientcontext)
        {
            this(gamesclientcontext.mContext);
        }
    }

    public static interface TwoColumnMapper
    {

        public abstract void put(Map map, Cursor cursor);
    }


    private static final String COUNT_PROJECTION[] = {
        "_count"
    };
    private static final String ID_PROJECTION[] = {
        "_id"
    };
    private static final String PACKAGE_PROJECTION[] = {
        "package_name"
    };
    public static final TwoColumnMapper STRING_TO_LONG_MAPPER = new TwoColumnMapper() {

        public final void put(Map map, Cursor cursor)
        {
            map.put(cursor.getString(0), Long.valueOf(cursor.getLong(1)));
        }

    };
    private static final TwoColumnMapper STRING_TO_STRING_MAPPER = new TwoColumnMapper() {

        public final void put(Map map, Cursor cursor)
        {
            map.put(cursor.getString(0), cursor.getString(1));
        }

    };

    public static ContentValues addHiResProfileImageUrl(Context context, ContentValues contentvalues, String s, String s1)
    {
        if (s != null)
        {
            s = new ImageUrlBuilder(s);
            s.mAllowSilhouette = false;
            contentvalues.put(s1, s.setSize(context, 0x7f0c00de).build());
        }
        return contentvalues;
    }

    public static void addImageUriColumn(ContentValues contentvalues, String s, String s1, ArrayList arraylist, Integer integer)
    {
        if (integer != null && contentvalues.containsKey(s))
        {
            contentvalues.put(s1, ((ContentProviderResult)arraylist.get(integer.intValue())).uri.toString());
        }
    }

    public static void addImageUriColumn(ContentValues contentvalues, String s, String s1, ArrayList arraylist, ArrayList arraylist1)
    {
        if (arraylist1 != null && arraylist1.size() > 0 && contentvalues.containsKey(s))
        {
            int j = arraylist1.size();
            s = new String[j];
            for (int i = 0; i < j; i++)
            {
                s[i] = ((ContentProviderResult)arraylist.get(((Integer)arraylist1.get(i)).intValue())).uri.toString();
            }

            contentvalues.put(s1, TextUtils.join(",", s));
        }
    }

    public static Integer addInsertImageOp(Uri uri, String s, ArrayList arraylist)
    {
        Integer integer = null;
        if (s != null)
        {
            integer = Integer.valueOf(arraylist.size());
            boolean flag;
            if (integer.intValue() > 0 && integer.intValue() % 100 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            arraylist.add(ContentProviderOperation.newInsert(uri).withValue("url", s).withYieldAllowed(flag).build());
        }
        return integer;
    }

    public static ArrayList addInsertImageOps(Uri uri, String s, ArrayList arraylist)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        s = new ArrayList(0);
_L4:
        return s;
_L2:
        String as[] = TextUtils.split(s, "\\s*,\\s*");
        int j = as.length;
        ArrayList arraylist1 = new ArrayList(j);
        int i = 0;
        do
        {
            s = arraylist1;
            if (i >= j)
            {
                continue;
            }
            arraylist1.add(i, addInsertImageOp(uri, as[i], arraylist));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static boolean applyContentOperations(ContentResolver contentresolver, ArrayList arraylist, String s)
    {
        return applyContentOperationsWithResult(contentresolver, arraylist, s) != null;
    }

    public static ArrayList applyContentOperationsWithResult(ContentResolver contentresolver, ArrayList arraylist, String s)
    {
        if (arraylist.size() >= 500)
        {
            int j = 0;
            int i = 0;
            int k = arraylist.size();
            while (i < k) 
            {
                if (((ContentProviderOperation)arraylist.get(i)).isYieldAllowed())
                {
                    j = i;
                }
                boolean flag;
                if (i - j < 500)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                Asserts.checkState(flag, "Attempting to apply too many operations!");
                i++;
            }
        }
        try
        {
            contentresolver = new ArrayList(Arrays.asList(contentresolver.applyBatch("com.google.android.gms.games.background", arraylist)));
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            throw new AssertionError(contentresolver);
        }
        // Misplaced declaration of an exception variable
        catch (ContentResolver contentresolver)
        {
            GamesLog.e(s, (new StringBuilder("Error applying batch operation: ")).append(contentresolver).toString());
            return null;
        }
        return contentresolver;
    }

    public static Map applyTwoColumnMapper(Context context, Uri uri, String s, String s1, Collection collection, TwoColumnMapper twocolumnmapper)
    {
        String s2 = null;
        String as[] = null;
        if (collection != null)
        {
            collection = SelectionArgs.forObjects((new StringBuilder()).append(s).append(" IN ").toString(), collection);
            s2 = collection.getSelection();
            as = ((SelectionArgs) (collection)).mSelectionArgs;
        }
        uri = context.getContentResolver().query(uri, new String[] {
            s, s1
        }, s2, as, null);
        if (uri.getCount() < ((Integer)G.arrayMapThreshold.get()).intValue())
        {
            context = new ArrayMap();
        } else
        {
            context = new HashMap();
        }
        for (; uri.moveToNext(); twocolumnmapper.put(context, uri)) { }
        break MISSING_BLOCK_LABEL_147;
        context;
        uri.close();
        throw context;
        uri.close();
        return context;
    }

    public static boolean areSameCaller(ClientContext clientcontext, ClientContext clientcontext1)
    {
        while (clientcontext == null || clientcontext1 == null || !Objects.equal(clientcontext.mResolvedAccount, clientcontext1.mResolvedAccount) || !Objects.equal(clientcontext.mAuthPackageName, clientcontext1.mAuthPackageName) || !Objects.equal(Integer.valueOf(clientcontext.mCallingUid), Integer.valueOf(clientcontext1.mCallingUid))) 
        {
            return false;
        }
        return true;
    }

    public static ClientContext buildFirstPartyClientContext(Context context, Account account)
    {
        AndroidUtils.assertMainGmsProcess();
        return restoreClientContext(Process.myUid(), context.getPackageName(), account);
    }

    public static ClientContext buildFirstPartyClientContext(Context context, String s)
    {
        return buildFirstPartyClientContext(context, new Account(s, "com.google"));
    }

    public static ClientContext buildFirstPartyClientContext(ClientContext clientcontext)
    {
        AndroidUtils.assertMainGmsProcess();
        ClientContext clientcontext1 = restoreClientContext(Process.myUid(), "com.google.android.gms", AccountUtils.getResolvedAccountName(clientcontext));
        clientcontext1.mExtras.putAll(clientcontext.mExtras);
        return clientcontext1;
    }

    public static GamesClientContext buildFirstPartyGamesContext(GamesClientContext gamesclientcontext)
    {
        ClientContext clientcontext = buildFirstPartyClientContext(gamesclientcontext.mClientContext);
        return gamesclientcontext.getBuilder(gamesclientcontext.mContext, clientcontext).build();
    }

    public static ClientContext cloneClientContext(ClientContext clientcontext)
    {
        Object obj = clientcontext.mResolvedAccount;
        obj = new ClientContext(clientcontext.mCallingUid, ((Account) (obj)), ((Account) (obj)), clientcontext.mCallingPackageName);
        ((ClientContext) (obj)).setGrantedScopes(clientcontext.getGrantedScopes());
        ((ClientContext) (obj)).mExtras.putAll(clientcontext.mExtras);
        return ((ClientContext) (obj));
    }

    public static transient ContentValues extractValues(ContentValues contentvalues, String as[])
    {
        ContentValues contentvalues1 = new ContentValues();
        int j = as.length;
        int i = 0;
        while (i < j) 
        {
            String s = as[i];
            if (contentvalues.containsKey(s))
            {
                Object obj = contentvalues.get(s);
                if (obj == null)
                {
                    contentvalues1.putNull(s);
                } else
                if (obj instanceof String)
                {
                    contentvalues1.put(s, contentvalues.getAsString(s));
                } else
                if (obj instanceof Integer)
                {
                    contentvalues1.put(s, contentvalues.getAsInteger(s));
                } else
                if (obj instanceof Long)
                {
                    contentvalues1.put(s, contentvalues.getAsLong(s));
                } else
                if (obj instanceof Float)
                {
                    contentvalues1.put(s, contentvalues.getAsFloat(s));
                } else
                if (obj instanceof Double)
                {
                    contentvalues1.put(s, contentvalues.getAsDouble(s));
                } else
                if (obj instanceof Boolean)
                {
                    contentvalues1.put(s, contentvalues.getAsBoolean(s));
                } else
                if (obj instanceof byte[])
                {
                    contentvalues1.put(s, contentvalues.getAsByteArray(s));
                } else
                {
                    throw new IllegalArgumentException("Unsupported value type for ContentValues");
                }
            }
            i++;
        }
        return contentvalues1;
    }

    public static long forceResolveExternalGameId(Context context, ClientContext clientcontext, String s)
    {
        long l1 = resolveExternalGameId(context, clientcontext, s);
        long l = l1;
        if (l1 < 0L)
        {
            l = insertPlaceholderGame(context, com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext), s);
            GamesSyncAdapter.requestSync$1221cb0a(clientcontext);
        }
        return l;
    }

    public static long forceResolveExternalGameIdNoSync(Context context, Uri uri, String s)
    {
        long l1 = resolveExternalId(context, com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(uri, s), null, null);
        long l = l1;
        if (l1 < 0L)
        {
            l = insertPlaceholderGame(context, com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(uri), s);
        }
        return l;
    }

    public static Map forceResolveExternalGameIds(Context context, ClientContext clientcontext, Collection collection)
    {
        Map map = getExternalIdToInternalIdMap(context, com.google.android.gms.games.provider.GamesContractInternal.Games.getContentUri(clientcontext), "external_game_id", collection);
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            String s = (String)collection.next();
            if (!map.containsKey(s))
            {
                map.put(s, Long.valueOf(forceResolveExternalGameId(context, clientcontext, s)));
            }
        } while (true);
        return map;
    }

    public static HashSet getColumnValues(Context context, Uri uri, String s)
    {
        return getColumnValues(context, new QuerySpec(uri), s);
    }

    public static HashSet getColumnValues(Context context, QuerySpec queryspec, String s)
    {
        HashSet hashset;
        hashset = new HashSet();
        context = new QueryBuilder(context);
        context.mQuery = queryspec;
        context.mProjection = (new String[] {
            s
        });
        context = context.queryCursor();
_L1:
        do
        {
            if (!context.moveToNext())
            {
                break MISSING_BLOCK_LABEL_78;
            }
            queryspec = context.getString(0);
        } while (queryspec == null);
        hashset.add(queryspec);
          goto _L1
        queryspec;
        context.close();
        throw queryspec;
        context.close();
        return hashset;
    }

    public static long getCount(Context context, Uri uri)
    {
        return getCount(context, uri, null, null);
    }

    public static long getCount(Context context, Uri uri, String s, String as[])
    {
        context = context.getContentResolver().query(uri, COUNT_PROJECTION, s, as, null);
        long l;
        context.moveToFirst();
        l = context.getLong(0);
        context.close();
        return l;
        uri;
        context.close();
        throw uri;
    }

    public static long getCount(Context context, QuerySpec queryspec)
    {
        return getCount(context, queryspec.mUri, queryspec.getSelection(), queryspec.mSelectionArgs);
    }

    public static String getCurrentRevision()
    {
        String s = (String)G.forcedAgentVersion.get();
        if (!TextUtils.isEmpty(s))
        {
            return s;
        } else
        {
            return "android:18";
        }
    }

    public static Map getExternalIdToInternalIdMap(Context context, Uri uri, String s)
    {
        return getExternalIdToInternalIdMap(context, uri, s, null);
    }

    public static Map getExternalIdToInternalIdMap(Context context, Uri uri, String s, Collection collection)
    {
        return applyTwoColumnMapper(context, uri, s, "_id", collection, STRING_TO_LONG_MAPPER);
    }

    public static ApplicationFetchList getFetchList(String s)
    {
        ArrayList arraylist = new ArrayList(1);
        arraylist.add(s);
        return getFetchList(arraylist);
    }

    public static ApplicationFetchList getFetchList(ArrayList arraylist)
    {
        ArrayList arraylist1 = new ArrayList();
        int i = 0;
        for (int j = arraylist.size(); i < j; i++)
        {
            arraylist1.add(new ApplicationFetchContext((String)arraylist.get(i)));
        }

        return new ApplicationFetchList(arraylist1);
    }

    public static Locale getLocale(Context context)
    {
        return context.getResources().getConfiguration().locale;
    }

    public static String getLocaleString(Context context)
    {
        return context.getResources().getConfiguration().locale.toString();
    }

    public static ContentProviderOperation getNotificationOp(Context context, ClientContext clientcontext, FirstPartyNotification firstpartynotification, long l, String s, int i)
    {
        Uri uri = com.google.android.gms.games.provider.GamesContractInternal.Notifications.getContentUri(clientcontext);
        boolean flag;
        if (firstpartynotification == null || firstpartynotification.getType() == null)
        {
            flag = true;
        } else
        if (firstpartynotification.getType().intValue() == 0)
        {
            if (!PlatformVersion.checkVersion(16))
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        if (flag)
        {
            GamesLog.d("Agents", (new StringBuilder("Clearing notification for ")).append(s).toString());
            context = new QuerySpec(uri);
            context.addWhereById("game_id", l);
            context.addWhere("external_sub_id", s);
            return ContentProviderOperation.newDelete(((QuerySpec) (context)).mUri).withSelection(context.getSelection(), ((QuerySpec) (context)).mSelectionArgs).build();
        } else
        {
            GamesLog.d("Agents", (new StringBuilder("Adding notification for ")).append(s).toString());
            GamesPlayLogger.logNotificationAction(context, queryString$109728a1(context, com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForId(clientcontext, l), "external_game_id", null), AccountUtils.getResolvedAccountName(clientcontext), i, 1, firstpartynotification.getId());
            context = new ContentValues(((FastContentValuesJsonResponse) (firstpartynotification)).mValues);
            context.put("game_id", Long.valueOf(l));
            context.put("external_sub_id", s);
            context.put("type", Integer.valueOf(i));
            context.put("timestamp", Long.valueOf(System.currentTimeMillis()));
            context.put("acknowledged", Integer.valueOf(0));
            return ContentProviderOperation.newInsert(uri).withValues(context).build();
        }
    }

    public static ContentValues getOwningPlayerValues(Context context, ClientContext clientcontext)
    {
        String s = queryString$109728a1(context, com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext), "external_player_id", null);
        if (s == null)
        {
            return null;
        }
        Object obj = null;
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(clientcontext, s);
        clientcontext = new PlayerBuffer((new QueryBuilder(context)).setQuerySpec(clientcontext).query());
        context = obj;
        if (clientcontext.getCount() > 0)
        {
            context = PlayerRef.toContentValues(clientcontext.get(0));
        }
        clientcontext.release();
        return context;
        context;
        clientcontext.release();
        throw context;
    }

    public static ContentProviderOperation getPlayerUpsertOp(ClientContext clientcontext, ContentValues contentvalues, long l)
    {
        return ContentProviderOperation.newInsert(com.google.android.gms.games.provider.GamesContractInternal.Players.getContentUri(clientcontext)).withValues(contentvalues).withValue("last_updated", Long.valueOf(l)).build();
    }

    public static String getSyncToken(Context context, ClientContext clientcontext, String as[])
    {
        Object obj = null;
        clientcontext = com.google.android.gms.games.provider.GamesContractInternal.AccountMetadata.getContentUri(clientcontext);
        clientcontext = context.getContentResolver().query(clientcontext, as, null, null, null);
        context = obj;
        if (clientcontext.moveToFirst())
        {
            context = clientcontext.getString(0);
        }
        clientcontext.close();
        return context;
        context;
        clientcontext.close();
        throw context;
    }

    public static Map getTwoColumnMap(Context context, Uri uri, String s, String s1, Collection collection)
    {
        return applyTwoColumnMapper(context, uri, s, s1, collection, STRING_TO_STRING_MAPPER);
    }

    private static long insertPlaceholderGame(Context context, Uri uri, String s)
    {
        ContentValues contentvalues = new ContentValues();
        contentvalues.put("external_game_id", s);
        contentvalues.put("display_name", "");
        contentvalues.put("game_description", context.getResources().getString(0x7f1002cc));
        contentvalues.put("primary_category", "unknown");
        contentvalues.put("metadata_version", Integer.valueOf(-1));
        contentvalues.put("metadata_sync_requested", Integer.valueOf(1));
        return ContentUris.parseId(context.getContentResolver().insert(uri, contentvalues));
    }

    public static boolean isPlusRequired$9c10cfc()
    {
        return true;
    }

    public static void notifyDataChangeUri(Context context, Uri uri)
    {
        GamesDataChangeUris.validateUri(uri);
        context.getContentResolver().notifyChange(uri, null);
    }

    private static byte[] queryBytes$1e80083f(Context context, Uri uri, String s, byte abyte0[])
    {
        abyte0 = null;
        uri = context.getContentResolver().query(uri, new String[] {
            s
        }, null, null, null);
        context = abyte0;
        if (uri.moveToFirst())
        {
            context = uri.getBlob(0);
        }
        uri.close();
        return context;
        context;
        uri.close();
        throw context;
    }

    public static byte[] queryBytes$aa0bbb8(Context context, Uri uri, String s)
    {
        return queryBytes$1e80083f(context, uri, s, null);
    }

    public static int queryInt(Context context, Uri uri, String s, int i)
    {
        return queryInt$65ca947f(context, uri, s, i);
    }

    private static int queryInt$65ca947f(Context context, Uri uri, String s, int i)
    {
        context = context.getContentResolver().query(uri, new String[] {
            s
        }, null, null, null);
        if (context.moveToFirst())
        {
            i = context.getInt(0);
        }
        context.close();
        return i;
        uri;
        context.close();
        throw uri;
    }

    public static long queryLong(Context context, Uri uri, String s, String s1, String as[], long l)
    {
        l = -1L;
        context = context.getContentResolver().query(uri, new String[] {
            s
        }, s1, as, null);
        if (context.moveToFirst())
        {
            l = context.getLong(0);
        }
        context.close();
        return l;
        uri;
        context.close();
        throw uri;
    }

    public static long queryLong$34bc2a06(Context context, Uri uri, String s)
    {
        return queryLong(context, uri, s, null, null, -1L);
    }

    public static AbstractWindowedCursor queryPendingOpCursor$97f12e7(Context context, ClientContext clientcontext, Uri uri, String as[], String s, String as1[])
    {
        context = context.getContentResolver().acquireContentProviderClient("com.google.android.gms.games.background");
        s = new QuerySpec(uri, s, as1);
        s.addWhere("package_name", clientcontext.mAuthPackageName);
        s.addWhere("package_uid", String.valueOf(clientcontext.mCallingUid));
        s.addWhere("account_name", AccountUtils.getResolvedAccountName(clientcontext));
        clientcontext = (AbstractWindowedCursor)context.query(uri, as, s.getSelection(), ((QuerySpec) (s)).mSelectionArgs, null);
        context.release();
        return clientcontext;
        clientcontext;
        throw new RuntimeException(clientcontext);
        clientcontext;
        context.release();
        throw clientcontext;
    }

    private static String queryString$109728a1(Context context, Uri uri, String s, String s1)
    {
        s1 = null;
        uri = context.getContentResolver().query(uri, new String[] {
            s
        }, null, null, null);
        context = s1;
        if (uri.moveToFirst())
        {
            context = uri.getString(0);
        }
        uri.close();
        return context;
        context;
        uri.close();
        throw context;
    }

    public static String queryString$510a9928(Context context, Uri uri, String s)
    {
        return queryString$109728a1(context, uri, s, null);
    }

    public static void remapField(ContentValues contentvalues, String s, ContentValues contentvalues1, String s1)
    {
        Object obj = contentvalues.get(s);
        if (obj == null)
        {
            contentvalues1.putNull(s1);
            return;
        }
        if (obj instanceof String)
        {
            contentvalues1.put(s1, contentvalues.getAsString(s));
            return;
        }
        if (obj instanceof Integer)
        {
            contentvalues1.put(s1, contentvalues.getAsInteger(s));
            return;
        }
        if (obj instanceof Long)
        {
            contentvalues1.put(s1, contentvalues.getAsLong(s));
            return;
        }
        if (obj instanceof Float)
        {
            contentvalues1.put(s1, contentvalues.getAsFloat(s));
            return;
        }
        if (obj instanceof Double)
        {
            contentvalues1.put(s1, contentvalues.getAsDouble(s));
            return;
        }
        if (obj instanceof Boolean)
        {
            contentvalues1.put(s1, contentvalues.getAsBoolean(s));
            return;
        }
        if (obj instanceof byte[])
        {
            contentvalues1.put(s1, contentvalues.getAsByteArray(s));
            return;
        } else
        {
            throw new IllegalArgumentException("Unsupported value type for ContentValues");
        }
    }

    public static void replaceImageColumn(ContentValues contentvalues, String s, String s1, ArrayList arraylist, Integer integer)
    {
        if (integer != null && contentvalues.containsKey(s))
        {
            contentvalues.remove(s);
            contentvalues.put(s1, ((ContentProviderResult)arraylist.get(integer.intValue())).uri.toString());
        }
    }

    public static long resolveClientContextId(Context context, ClientContext clientcontext)
    {
        ContentValues contentvalues;
        boolean flag;
        if (clientcontext.hasScope("https://www.googleapis.com/auth/games") || clientcontext.hasScope("https://www.googleapis.com/auth/games.firstparty"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag);
        contentvalues = new ContentValues();
        contentvalues.put("package_name", clientcontext.mAuthPackageName);
        contentvalues.put("package_uid", Integer.valueOf(clientcontext.mCallingUid));
        contentvalues.put("account_name", AccountUtils.getResolvedAccountName(clientcontext));
        return ContentUris.parseId(context.getContentResolver().insert(com.google.android.gms.games.provider.GamesContractInternal.ClientContexts.getContentUri(clientcontext), contentvalues));
    }

    public static long resolveExternalGameId(Context context, ClientContext clientcontext, String s)
    {
        return resolveExternalId(context, com.google.android.gms.games.provider.GamesContractInternal.Games.getUriForExternalGameId(clientcontext, s), null, null);
    }

    public static long resolveExternalId(Context context, Uri uri)
    {
        return resolveExternalId(context, uri, null, null);
    }

    public static long resolveExternalId(Context context, Uri uri, String s, String as[])
    {
        context = context.getContentResolver().query(uri, ID_PROJECTION, s, as, null);
        long l;
        if (!context.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_42;
        }
        l = context.getLong(0);
        context.close();
        return l;
        context.close();
        return -1L;
        uri;
        context.close();
        throw uri;
    }

    protected static long resolveExternalPlayerId(Context context, ClientContext clientcontext, String s)
    {
        return resolveExternalId(context, com.google.android.gms.games.provider.GamesContractInternal.Players.getUriForExternalPlayerId(clientcontext, s), null, null);
    }

    public static int resolveStatusCode(int i, int j)
    {
        if (j != 500)
        {
            return j;
        }
        return i != 0 ? 3 : 4;
    }

    public static int resolveStatusCode(Cursor cursor, int i)
    {
        return resolveStatusCode(cursor.getCount(), i);
    }

    private static ClientContext restoreClientContext(int i, String s, Account account)
    {
        AndroidUtils.assertMainGmsProcess();
        Preconditions.checkNotNull(s);
        Preconditions.checkNotNull(account);
        account = new ClientContext(i, account, account, s);
        if (account.isCurrentContext())
        {
            s = "https://www.googleapis.com/auth/games.firstparty";
        } else
        {
            s = "https://www.googleapis.com/auth/games";
        }
        account.addGrantedScope(s);
        return account;
    }

    public static ClientContext restoreClientContext(int i, String s, String s1)
    {
        return restoreClientContext(i, s, new Account(s1, "com.google"));
    }

    public static boolean shouldAllowYieldAtIndex(int i)
    {
        return i > 0 && i % 250 == 0;
    }

    public static void validatePlayerName(Context context, ContentValues contentvalues)
    {
        if (contentvalues.getAsString("profile_name") == null)
        {
            contentvalues.put("profile_name", context.getResources().getString(0x7f1002cd));
        }
    }

}
