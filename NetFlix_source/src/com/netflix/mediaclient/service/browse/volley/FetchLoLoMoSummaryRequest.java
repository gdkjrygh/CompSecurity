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
import com.netflix.mediaclient.service.webclient.model.leafs.LoLoMoSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.LoLoMo;
import java.util.Arrays;
import java.util.List;

public class FetchLoLoMoSummaryRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_GENRE_LOLOMO = "genreLolomo";
    private static final String FIELD_TOP_GENRE = "topGenre";
    private static final String TAG = "nf_service_browse_fetchlolomosummaryrequest";
    private final String lolomoCategoryId;
    private final String lolomoId;
    private final boolean lolomoIdInCache;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;

    public FetchLoLoMoSummaryRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, String s, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        lolomoCategoryId = s;
        lolomoId = BrowseAgent.getGenreLoLoMoId(hardcache, s);
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
            pqlQuery = (new StringBuilder("['genreLolomo','")).append(lolomoId).append("','summary']").toString();
        } else
        {
            pqlQuery = (new StringBuilder("['topGenre','")).append(s).append("','summary']").toString();
        }
        if (Log.isLoggable("nf_service_browse_fetchlolomosummaryrequest", 2))
        {
            Log.v("nf_service_browse_fetchlolomosummaryrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onLoLoMoSummaryFetched(null, i);
        }
    }

    protected void onSuccess(LoLoMo lolomo)
    {
        if (responseCallback != null)
        {
            responseCallback.onLoLoMoSummaryFetched(lolomo, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((LoLoMo)obj);
    }

    protected LoLoMo parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        JsonObject jsonobject;
        if (Log.isLoggable("nf_service_browse_fetchlolomosummaryrequest", 2))
        {
            Log.v("nf_service_browse_fetchlolomosummaryrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchlolomosummaryrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException(String.format("lolomo %s summary empty!!!", new Object[] {
                lolomoCategoryId
            }));
        }
        if (!lolomoIdInCache) goto _L2; else goto _L1
_L1:
        jsonobject = jsonobject.getAsJsonObject("genreLolomo").getAsJsonObject(lolomoId);
        s = jsonobject;
_L4:
        s = (LoLoMoSummary)FalcorParseUtils.getPropertyObject(s, "summary", com/netflix/mediaclient/service/webclient/model/leafs/LoLoMoSummary);
        s.setId(lolomoCategoryId);
        return s;
_L2:
        try
        {
            jsonobject = jsonobject.getAsJsonObject("topGenre").getAsJsonObject(lolomoCategoryId);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_fetchlolomosummaryrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        s = jsonobject;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }
}
