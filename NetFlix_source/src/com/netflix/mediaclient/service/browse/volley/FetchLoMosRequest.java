// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgent;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfMoviesSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.LoMoType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            PrefetchHomeLoLoMoRequest

public class FetchLoMosRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_LOLOMO = "lolomo";
    private static final String FIELD_LOLOMOS = "lolomos";
    private static final String TAG = "nf_service_browse_fetchlomosrequest";
    private final int fromLoMo;
    private final HardCache hardCache;
    private final String lolomoId;
    private final boolean lolomoIdInCache;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final int toLoMo;

    public FetchLoMosRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        fromLoMo = i;
        toLoMo = j;
        hardCache = hardcache;
        lolomoId = BrowseAgent.getLoLoMoId(hardcache);
        boolean flag;
        if (lolomoId != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lolomoIdInCache = flag;
        if (lolomoIdInCache)
        {
            pqlQuery = (new StringBuilder("['lolomos','")).append(lolomoId).append("',{'from':").append(i).append(",'to':").append(j).append("},'summary']").toString();
        } else
        {
            pqlQuery = (new StringBuilder("['lolomo'")).append(",{'from':").append(i).append(",'to':").append(j).append("},'summary']").toString();
        }
        if (Log.isLoggable("nf_service_browse_fetchlomosrequest", 2))
        {
            Log.v("nf_service_browse_fetchlomosrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
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
            responseCallback.onLoMosFetched(Collections.emptyList(), i);
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
            responseCallback.onLoMosFetched(list, 0);
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
        if (!Log.isLoggable("nf_service_browse_fetchlomosrequest", 2));
        arraylist = new ArrayList();
        obj = FalcorParseUtils.getDataObj("nf_service_browse_fetchlomosrequest", s);
        if (!FalcorParseUtils.isEmpty(((JsonObject) (obj)))) goto _L2; else goto _L1
_L1:
        return arraylist;
_L2:
        ListOfMoviesSummary listofmoviessummary;
        int i;
        try
        {
            if (!lolomoIdInCache)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = ((JsonObject) (obj)).getAsJsonObject("lolomos").getAsJsonObject(lolomoId);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_fetchlomosrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        s = ((String) (obj));
        if (!lolomoIdInCache)
        {
            PrefetchHomeLoLoMoRequest.putLoLoMoIdInBrowseCache(hardCache, s);
        }
        i = fromLoMo;
        while (i <= toLoMo) 
        {
            obj = Integer.toString(i);
            if (s.has(((String) (obj))))
            {
                listofmoviessummary = (ListOfMoviesSummary)FalcorParseUtils.getPropertyObject(s.getAsJsonObject(((String) (obj))), "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListOfMoviesSummary);
                if (listofmoviessummary != null)
                {
                    listofmoviessummary.setListPos(i);
                }
                arraylist.add(listofmoviessummary);
                if (!lolomoIdInCache)
                {
                    if (listofmoviessummary.getType() == LoMoType.CONTINUE_WATCHING)
                    {
                        PrefetchHomeLoLoMoRequest.putCWIdsInCache(hardCache, listofmoviessummary, ((String) (obj)));
                    }
                    if (listofmoviessummary.getType() == LoMoType.INSTANT_QUEUE)
                    {
                        PrefetchHomeLoLoMoRequest.putIQIdsInCache(hardCache, listofmoviessummary, ((String) (obj)));
                    }
                }
            }
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj = ((JsonObject) (obj)).getAsJsonObject("lolomo");
        s = ((String) (obj));
        break MISSING_BLOCK_LABEL_56;
    }
}
