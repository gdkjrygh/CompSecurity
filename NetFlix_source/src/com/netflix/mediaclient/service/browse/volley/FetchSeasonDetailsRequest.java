// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import java.util.Arrays;
import java.util.List;

public class FetchSeasonDetailsRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_VIDEOS = "videos";
    private static final String TAG = "nf_service_browse_fetchseasondetailsrequest";
    private final String mSeasonId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;

    public FetchSeasonDetailsRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mSeasonId = s;
        pqlQuery = (new StringBuilder("['videos', '")).append(mSeasonId).append("','detail']").toString();
        if (Log.isLoggable("nf_service_browse_fetchseasondetailsrequest", 2))
        {
            Log.v("nf_service_browse_fetchseasondetailsrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onSeasonDetailsFetched(null, i);
        }
    }

    protected void onSuccess(SeasonDetails seasondetails)
    {
        if (responseCallback != null)
        {
            responseCallback.onSeasonDetailsFetched(seasondetails, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((SeasonDetails)obj);
    }

    protected SeasonDetails parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_service_browse_fetchseasondetailsrequest", 2))
        {
            Log.v("nf_service_browse_fetchseasondetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchseasondetailsrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("SeasonDetails empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("videos").getAsJsonObject(mSeasonId);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_fetchseasondetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        s = new com.netflix.mediaclient.service.webclient.model.SeasonDetails();
        s.detail = (com.netflix.mediaclient.service.webclient.model.branches.Season.Detail)FalcorParseUtils.getPropertyObject(jsonobject, "detail", com/netflix/mediaclient/service/webclient/model/branches/Season$Detail);
        return s;
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }
}
