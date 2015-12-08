// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.BrowseVideoSentinels;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.model.MovieDetails;
import com.netflix.mediaclient.service.webclient.model.ShowDetails;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            PrefetchHomeLoLoMoRequest

public class FetchIQVideosRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_LISTS = "lists";
    private static final String FIELD_LOLOMO = "lolomo";
    private static final String FIELD_LOLOMOS = "lolomos";
    private static final String FIELD_QUEUE = "queue";
    private static final String TAG = "nf_service_browse_fetchiqvideosrequest";
    private final int fromVideo;
    private final HardCache hardCache;
    private final String iqId;
    private final boolean iqInCache;
    private final String lolomoId;
    private final boolean lolomoIdInCache;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;
    private final int toVideo;

    public FetchIQVideosRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        boolean flag1 = true;
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        fromVideo = i;
        toVideo = j;
        hardCache = hardcache;
        softCache = softcache;
        iqId = BrowseAgent.getIQLoMoId(hardcache);
        boolean flag;
        if (iqId != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iqInCache = flag;
        lolomoId = BrowseAgent.getLoLoMoId(hardcache);
        if (lolomoId != null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        lolomoIdInCache = flag;
        if (iqInCache)
        {
            context = (new StringBuilder("['lists','")).append(iqId);
        } else
        if (lolomoIdInCache)
        {
            context = (new StringBuilder("['lolomos','")).append(lolomoId).append("','queue");
        } else
        {
            context = (new StringBuilder("['lolomo',")).append("'queue");
        }
        pqlQuery = context.append("', {'to':").append(j).append(",'from':").append(i).append("},'summary']").toString();
        if (Log.isLoggable("nf_service_browse_fetchiqvideosrequest", 2))
        {
            Log.v("nf_service_browse_fetchiqvideosrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    public static void updateMdpWithIQInfo(HardCache hardcache, SoftCache softcache, String s, boolean flag)
    {
        com/netflix/mediaclient/service/browse/volley/FetchIQVideosRequest;
        JVM INSTR monitorenter ;
        Object obj = BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_MDP, s, "0", "0"));
        if (obj == null) goto _L2; else goto _L1
_L1:
        hardcache = (MovieDetails)obj;
        if (((MovieDetails) (hardcache)).inQueue != null)
        {
            ((MovieDetails) (hardcache)).inQueue.inQueue = flag;
        }
_L3:
        com/netflix/mediaclient/service/browse/volley/FetchIQVideosRequest;
        JVM INSTR monitorexit ;
        return;
_L2:
        hardcache = ((HardCache) (BrowseAgent.getFromCaches(hardcache, softcache, BrowseAgent.buildBrowseCacheKey(BrowseAgent.CACHE_KEY_PREFIX_SDP, s, "0", "0"))));
        if (hardcache == null)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        hardcache = (ShowDetails)hardcache;
        if (((ShowDetails) (hardcache)).inQueue != null)
        {
            ((ShowDetails) (hardcache)).inQueue.inQueue = flag;
        }
          goto _L3
        hardcache;
        throw hardcache;
        Log.d("nf_service_browse_fetchiqvideosrequest", (new StringBuilder()).append("updateMdpWithIQInfo !(movie or show) id:").append(s).toString());
          goto _L3
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
            responseCallback.onVideosFetched(Collections.emptyList(), i);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((List)obj);
    }

    protected void onSuccess(List list)
    {
        if (responseCallback != null)
        {
            responseCallback.onVideosFetched(list, 0);
        }
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected List parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        Object obj;
        ArrayList arraylist;
        if (!Log.isLoggable("nf_service_browse_fetchiqvideosrequest", 2));
        arraylist = new ArrayList();
        obj = FalcorParseUtils.getDataObj("nf_service_browse_fetchiqvideosrequest", s);
        if (!FalcorParseUtils.isEmpty(((JsonObject) (obj)))) goto _L2; else goto _L1
_L1:
        return arraylist;
_L2:
        if (!iqInCache) goto _L4; else goto _L3
_L3:
        obj = ((JsonObject) (obj)).getAsJsonObject("lists").getAsJsonObject(iqId);
        s = ((String) (obj));
_L5:
        boolean flag = false;
        int i = toVideo;
        while (i >= fromVideo) 
        {
            obj = Integer.toString(i);
            Object obj1;
            String s1;
            boolean flag1;
            if (s.has(((String) (obj))))
            {
                flag1 = true;
                obj = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(s.getAsJsonObject(((String) (obj))), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                updateMdpWithIQInfo(hardCache, softCache, ((com.netflix.mediaclient.service.webclient.model.branches.Video.Summary) (obj)).getId(), true);
                arraylist.add(0, obj);
            } else
            {
                flag1 = flag;
                if (flag)
                {
                    Log.d("nf_service_browse_fetchiqvideosrequest", String.format("Adding sentinel at index %s", new Object[] {
                        obj
                    }));
                    arraylist.add(0, BrowseVideoSentinels.getUnavailableVideoSummary());
                    flag1 = flag;
                }
            }
            i--;
            flag = flag1;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!lolomoIdInCache)
        {
            break MISSING_BLOCK_LABEL_230;
        }
        obj = ((JsonObject) (obj)).getAsJsonObject("lolomos").getAsJsonObject(lolomoId).getAsJsonObject("queue");
        obj1 = FalcorParseUtils.getIdFromPath("nf_service_browse_fetchiqvideosrequest", ((JsonObject) (obj)));
        BrowseAgent.putIQLoMoId(hardCache, obj1);
        s = ((String) (obj));
          goto _L5
        try
        {
            obj1 = ((JsonObject) (obj)).getAsJsonObject("lolomo");
            obj = ((JsonObject) (obj1)).getAsJsonObject("queue");
            s1 = FalcorParseUtils.getIdFromPath("nf_service_browse_fetchiqvideosrequest", ((JsonObject) (obj)));
            BrowseAgent.putIQLoMoId(hardCache, s1);
            PrefetchHomeLoLoMoRequest.putLoLoMoIdInBrowseCache(hardCache, ((JsonObject) (obj1)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_fetchiqvideosrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        s = ((String) (obj));
          goto _L5
    }
}
