// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.BrowseVideoSentinels;
import com.netflix.mediaclient.service.webclient.model.EpisodeDetails;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FetchEpisodesRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_VIDEOS = "videos";
    private static final String TAG = "nf_service_browse_fetchepisodesrequest";
    private final int fromEpisodes;
    private final String mVideoId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final int toEpisodes;
    private final boolean userConnectedToFacebook;

    public FetchEpisodesRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, int i, int j, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mVideoId = s;
        fromEpisodes = i;
        toEpisodes = j;
        userConnectedToFacebook = flag;
        pqlQuery = (new StringBuilder("['videos', '")).append(mVideoId).append("', 'episodes', {'to':").append(j).append(",'from':").append(i).append("},['detail', 'summary', 'bookmark']]").toString();
        if (Log.isLoggable("nf_service_browse_fetchepisodesrequest", 2))
        {
            Log.v("nf_service_browse_fetchepisodesrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onEpisodesFetched(Collections.emptyList(), i);
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
            responseCallback.onEpisodesFetched(list, 0);
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
        ArrayList arraylist = new ArrayList();
        JsonObject jsonobject1 = FalcorParseUtils.getDataObj("nf_service_browse_fetchepisodesrequest", s);
        if (!FalcorParseUtils.isEmpty(jsonobject1))
        {
            JsonObject jsonobject = null;
            try
            {
                jsonobject1 = jsonobject1.getAsJsonObject("videos").getAsJsonObject(mVideoId);
                if (jsonobject1.has("episodes"))
                {
                    jsonobject = jsonobject1.getAsJsonObject("episodes");
                }
            }
            catch (Exception exception)
            {
                Log.v("nf_service_browse_fetchepisodesrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
                throw new FalcorParseException("Does not contain required fields", exception);
            }
            if (jsonobject != null)
            {
                boolean flag = false;
                int i = toEpisodes;
                while (i >= fromEpisodes) 
                {
                    s = Integer.toString(i);
                    boolean flag1;
                    if (jsonobject.has(s))
                    {
                        flag1 = true;
                        s = jsonobject.getAsJsonObject(s);
                        EpisodeDetails episodedetails = new EpisodeDetails();
                        episodedetails.summary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(s, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                        episodedetails.detail = (com.netflix.mediaclient.service.webclient.model.branches.Episode.Detail)FalcorParseUtils.getPropertyObject(s, "detail", com/netflix/mediaclient/service/webclient/model/branches/Episode$Detail);
                        episodedetails.bookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(s, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
                        episodedetails.userConnectedToFacebook = userConnectedToFacebook;
                        arraylist.add(0, episodedetails);
                    } else
                    {
                        flag1 = flag;
                        if (flag)
                        {
                            Log.d("nf_service_browse_fetchepisodesrequest", String.format("Adding sentinel at index %s", new Object[] {
                                s
                            }));
                            arraylist.add(0, BrowseVideoSentinels.getUnavailableEpisodeDetails());
                            flag1 = flag;
                        }
                    }
                    i--;
                    flag = flag1;
                }
            }
        }
        return arraylist;
    }
}
