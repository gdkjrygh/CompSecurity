// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.model.leafs.SocialEvidence;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.MovieDetails;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchMovieDetailsRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_MOVIES = "movies";
    private static final String TAG = "nf_service_browse_fetchmoviedetailsrequest";
    private final int fromVideo;
    private final String mMovieId;
    private final String pqlQuery;
    private final String pqlQuery2;
    private final String pqlQuery3;
    private final BrowseAgentCallback responseCallback;
    private final int toVideo;
    private final boolean userConnectedToFacebook;

    public FetchMovieDetailsRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, int i, int j, boolean flag, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        mMovieId = s;
        fromVideo = i;
        toVideo = j;
        userConnectedToFacebook = flag;
        pqlQuery = (new StringBuilder("['movies','")).append(mMovieId).append("',['summary','detail', 'rating', 'inQueue', 'bookmark', 'socialEvidence']]").toString();
        pqlQuery2 = (new StringBuilder("['movies','")).append(mMovieId).append("','similars").append("', {'to':").append(j).append(",'from':").append(i).append("}, 'summary']").toString();
        pqlQuery3 = (new StringBuilder("['movies','")).append(mMovieId).append("','similars', 'summary']").toString();
        if (Log.isLoggable("nf_service_browse_fetchmoviedetailsrequest", 2))
        {
            Log.v("nf_service_browse_fetchmoviedetailsrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).append(" ").append(pqlQuery2).append(" ").append(pqlQuery3).toString());
        }
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery, pqlQuery2, pqlQuery3
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onMovieDetailsFetched(null, i);
        }
    }

    protected void onSuccess(MovieDetails moviedetails)
    {
        if (responseCallback != null)
        {
            responseCallback.onMovieDetailsFetched(moviedetails, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((MovieDetails)obj);
    }

    protected MovieDetails parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (!Log.isLoggable("nf_service_browse_fetchmoviedetailsrequest", 2));
        Object obj = new com.netflix.mediaclient.service.webclient.model.MovieDetails();
        ArrayList arraylist = new ArrayList();
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchmoviedetailsrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("MovieDetails empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("movies").getAsJsonObject(mMovieId);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_fetchmoviedetailsrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        obj.summary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
        obj.detail = (com.netflix.mediaclient.service.webclient.model.branches.Video.Detail)FalcorParseUtils.getPropertyObject(jsonobject, "detail", com/netflix/mediaclient/service/webclient/model/branches/Video$Detail);
        obj.rating = (com.netflix.mediaclient.service.webclient.model.branches.Video.Rating)FalcorParseUtils.getPropertyObject(jsonobject, "rating", com/netflix/mediaclient/service/webclient/model/branches/Video$Rating);
        obj.inQueue = (com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue)FalcorParseUtils.getPropertyObject(jsonobject, "inQueue", com/netflix/mediaclient/service/webclient/model/branches/Video$InQueue);
        obj.bookmark = (com.netflix.mediaclient.service.webclient.model.branches.Video.Bookmark)FalcorParseUtils.getPropertyObject(jsonobject, "bookmark", com/netflix/mediaclient/service/webclient/model/branches/Video$Bookmark);
        obj.socialEvidence = (SocialEvidence)FalcorParseUtils.getPropertyObject(jsonobject, "socialEvidence", com/netflix/mediaclient/service/webclient/model/leafs/SocialEvidence);
        if (jsonobject.has("similars"))
        {
            s = jsonobject.getAsJsonObject("similars");
            for (int i = fromVideo; i <= toVideo; i++)
            {
                String s1 = Integer.toString(i);
                if (s.has(s1))
                {
                    arraylist.add((com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(s.getAsJsonObject(s1), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary));
                }
            }

            obj.similarListSummary = (TrackableListSummary)FalcorParseUtils.getPropertyObject(s, "summary", com/netflix/mediaclient/service/webclient/model/leafs/TrackableListSummary);
        }
        obj.similarVideos = arraylist;
        obj.userConnectedToFacebook = userConnectedToFacebook;
        return ((MovieDetails) (obj));
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }
}
