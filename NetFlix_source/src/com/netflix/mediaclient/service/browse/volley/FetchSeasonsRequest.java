// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.BrowseVideoSentinels;
import com.netflix.mediaclient.service.webclient.model.SeasonDetails;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FetchSeasonsRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_SEASONS = "seasons";
    private static final String FIELD_VIDEOS = "videos";
    private static final String TAG = "nf_service_browse_fetchseasonsrequest";
    private final int fromSeason;
    private final String mShowId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final int toSeason;

    public FetchSeasonsRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mShowId = s;
        fromSeason = i;
        toSeason = j;
        pqlQuery = (new StringBuilder("['videos', '")).append(mShowId).append("', 'seasons',{'to':").append(j).append(",'from':").append(i).append("},'detail']").toString();
        if (Log.isLoggable("nf_service_browse_fetchseasonsrequest", 2))
        {
            Log.v("nf_service_browse_fetchseasonsrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onSeasonsFetched(Collections.emptyList(), i);
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
            responseCallback.onSeasonsFetched(list, 0);
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
        if (!Log.isLoggable("nf_service_browse_fetchseasonsrequest", 2));
        Object obj = new ArrayList();
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchseasonsrequest", s);
        if (!FalcorParseUtils.isEmpty(jsonobject))
        {
            int i;
            boolean flag;
            try
            {
                jsonobject = jsonobject.getAsJsonObject("videos").getAsJsonObject(mShowId).getAsJsonObject("seasons");
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                Log.v("nf_service_browse_fetchseasonsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
                throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
            }
            flag = false;
            i = toSeason;
            while (i >= fromSeason) 
            {
                s = Integer.toString(i);
                boolean flag1;
                if (jsonobject.has(s))
                {
                    flag1 = true;
                    s = jsonobject.getAsJsonObject(s);
                    SeasonDetails seasondetails = new SeasonDetails();
                    seasondetails.detail = (com.netflix.mediaclient.service.webclient.model.branches.Season.Detail)FalcorParseUtils.getPropertyObject(s, "detail", com/netflix/mediaclient/service/webclient/model/branches/Season$Detail);
                    ((List) (obj)).add(0, seasondetails);
                } else
                {
                    flag1 = flag;
                    if (flag)
                    {
                        Log.d("nf_service_browse_fetchseasonsrequest", String.format("Adding sentinel at index %s", new Object[] {
                            s
                        }));
                        ((List) (obj)).add(0, BrowseVideoSentinels.getUnavailableSeasonsDetails());
                        flag1 = flag;
                    }
                }
                i--;
                flag = flag1;
            }
        }
        return ((List) (obj));
    }
}
