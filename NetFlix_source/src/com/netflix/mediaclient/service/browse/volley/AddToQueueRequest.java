// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfMoviesSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchIQVideosRequest

public class AddToQueueRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_LOLOMOS = "lolomos";
    public static final String FIELD_VALUE = "value";
    public static final String TAG = "nf_service_browse_addtoqueuerequest";
    public static final String optionalParam = (new StringBuilder("&")).append(FalcorParseUtils.getParamNameParam()).append("=").toString();
    private boolean canMakeRequest;
    private final int fromVideo;
    private final HardCache hardCache;
    private final List iqKeysCache;
    private final String iqLoMoId;
    private final String iqLoMoIndex;
    private final String lolomoId;
    private final String mVideoId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;
    private final int toVideo;
    private final int trackId;

    public AddToQueueRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, List list, String s, int i, 
            int j, int k, BrowseAgentCallback browseagentcallback)
    {
        boolean flag = true;
        super(context, configurationagentinterface);
        canMakeRequest = true;
        responseCallback = browseagentcallback;
        fromVideo = i;
        toVideo = j;
        hardCache = hardcache;
        softCache = softcache;
        iqKeysCache = list;
        mVideoId = s;
        trackId = k;
        if (!BrowseAgent.areIqIdsInCache(hardcache))
        {
            flag = false;
        }
        canMakeRequest = flag;
        if (canMakeRequest);
        iqLoMoId = BrowseAgent.getIQLoMoId(hardcache);
        lolomoId = BrowseAgent.getLoLoMoId(hardcache);
        iqLoMoIndex = BrowseAgent.getIQLoMoIndex(hardcache);
        pqlQuery = (new StringBuilder("['lolomos','")).append(lolomoId).append("','add']").toString();
        if (Log.isLoggable("nf_service_browse_addtoqueuerequest", 2))
        {
            Log.v("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    static void updateIQLoMoSummaryObject(HardCache hardcache, ListOfMoviesSummary listofmoviessummary)
    {
        com/netflix/mediaclient/service/browse/volley/AddToQueueRequest;
        JVM INSTR monitorenter ;
        if (listofmoviessummary != null) goto _L2; else goto _L1
_L1:
        com/netflix/mediaclient/service/browse/volley/AddToQueueRequest;
        JVM INSTR monitorexit ;
        return;
_L2:
        ListOfMoviesSummary listofmoviessummary2;
        Log.d("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("updateIQLoMoSummaryObject newList id:").append(listofmoviessummary.getId()).append(" length:").append(listofmoviessummary.getLength()).toString());
        listofmoviessummary2 = BrowseAgent.getIQLoMoSummary(hardcache);
        ListOfMoviesSummary listofmoviessummary1;
        listofmoviessummary1 = listofmoviessummary2;
        if (listofmoviessummary2 != null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        BrowseAgent.putIQLoMoSummary(hardcache, listofmoviessummary);
        listofmoviessummary1 = listofmoviessummary;
        Log.d("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("updateIQLoMoSummaryObject oldList id:").append(listofmoviessummary1.getId()).append(" length:").append(listofmoviessummary1.getLength()).toString());
        listofmoviessummary1.setId(listofmoviessummary.getId());
        listofmoviessummary1.setLength(listofmoviessummary.getLength());
        if (true) goto _L1; else goto _L3
_L3:
        hardcache;
        throw hardcache;
    }

    static void updateIQVideoLists(HardCache hardcache, SoftCache softcache, List list, int i, int j, ListOfMoviesSummary listofmoviessummary, List list1)
    {
        com/netflix/mediaclient/service/browse/volley/AddToQueueRequest;
        JVM INSTR monitorenter ;
        listofmoviessummary = list.iterator();
        do
        {
            if (!listofmoviessummary.hasNext())
            {
                break;
            }
            String s = (String)listofmoviessummary.next();
            Log.d("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("removing entry for key:").append(s).toString());
            if (softcache.remove(s) == null)
            {
                hardcache.remove(s);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_88;
        hardcache;
        throw hardcache;
        list.clear();
        softcache = BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_IQ_VIDEOS, "queue", String.valueOf(i), String.valueOf(j));
        hardcache.remove(softcache);
        BrowseAgent.putInBrowseCache(hardcache, softcache, list1);
        com/netflix/mediaclient/service/browse/volley/AddToQueueRequest;
        JVM INSTR monitorexit ;
    }

    public boolean canProceed()
    {
        return canMakeRequest;
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameCall();
    }

    protected String getOptionalParams()
    {
        String s = (new StringBuilder("['videos','")).append(mVideoId).append("']").toString();
        String s1 = (new StringBuilder("[{'to':")).append(toVideo).append(",'from':").append(fromVideo).append("},'summary']").toString();
        String s2 = (new StringBuilder("'")).append(iqLoMoId).append("'").toString();
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(urlEncodPQLParam(FalcorParseUtils.getParamNameParam(), s2));
        stringbuilder.append(optionalParam).append(iqLoMoIndex);
        stringbuilder.append(urlEncodPQLParam(FalcorParseUtils.getParamNameParam(), s));
        stringbuilder.append(optionalParam).append(trackId);
        stringbuilder.append(urlEncodPQLParam("pathSuffix", s1));
        stringbuilder.append(urlEncodPQLParam("pathSuffix", "['summary']"));
        Log.d("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append(" getOptionalParams: ").append(stringbuilder.toString()).toString());
        return stringbuilder.toString();
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            Log.d("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("AddToQueueRequest finished onFailure statusCode=").append(i).toString());
            responseCallback.onQueueAdd(i);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    protected void onSuccess(String s)
    {
        if (responseCallback != null)
        {
            Log.d("nf_service_browse_addtoqueuerequest", "AddToQueueRequest finished onSuccess");
            responseCallback.onQueueAdd(0);
        }
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected String parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_service_browse_addtoqueuerequest", 2))
        {
            Log.v("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        Object obj = new ArrayList();
        JsonObject jsonobject;
        try
        {
            jsonobject = (new JsonParser()).parse(s).getAsJsonObject();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("Error in creating JsonObject", ((Throwable) (obj)));
        }
        if (FalcorParseUtils.containsErrors(jsonobject))
        {
            if (FalcorParseUtils.getErrorMessage(jsonobject).contains("AlreadyInQueue"))
            {
                return Integer.toString(0);
            } else
            {
                throw new FalcorServerException(FalcorParseUtils.getErrorMessage(jsonobject));
            }
        }
        jsonobject = jsonobject.getAsJsonObject("value");
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            return Integer.toString(0);
        }
        int i;
        try
        {
            jsonobject = jsonobject.getAsJsonObject("lolomos").getAsJsonObject(lolomoId).getAsJsonObject(iqLoMoIndex);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_addtoqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        for (i = fromVideo; i <= toVideo; i++)
        {
            s = Integer.toString(i);
            if (jsonobject.has(s))
            {
                s = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject.getAsJsonObject(s), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                FetchIQVideosRequest.updateMdpWithIQInfo(hardCache, softCache, s.getId(), true);
                ((List) (obj)).add(s);
            }
        }

        s = (ListOfMoviesSummary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListOfMoviesSummary);
        BrowseAgent.putIQLoMoId(hardCache, s.getId());
        updateIQLoMoSummaryObject(hardCache, s);
        updateIQVideoLists(hardCache, softCache, iqKeysCache, fromVideo, toVideo, s, ((List) (obj)));
        return Integer.toString(0);
    }

}
