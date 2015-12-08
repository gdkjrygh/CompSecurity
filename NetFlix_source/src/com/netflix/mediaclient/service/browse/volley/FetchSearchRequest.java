// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.model.SearchPerson;
import com.netflix.mediaclient.service.webclient.model.SearchSuggestion;
import com.netflix.mediaclient.service.webclient.model.SearchVideo;
import com.netflix.mediaclient.service.webclient.model.leafs.TrackableListSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.servicemgr.ProfileType;
import com.netflix.mediaclient.servicemgr.SearchResults;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FetchSearchRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_RESULT_TYPES_STRING = "videos,people,suggestions";
    private static final String FIELD_SEARCH = "search";
    private static final String TAG = "nf_service_browse_fetchsearchrequest";
    private static final Set VIDEO_TYPES_SET = new HashSet(Arrays.asList(new String[] {
        "shows", "movies", "seasons", "series", "episodes"
    }));
    private final int fromIndex;
    private final String pqlQuery;
    private final String pqlQuery1;
    private final ProfileType profileType;
    private final BrowseAgentCallback responseCallback;
    private final int toIndex;

    public FetchSearchRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, int i, int j, ProfileType profiletype, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        fromIndex = i;
        toIndex = j;
        profileType = profiletype;
        context = StringUtils.escapeJsonChars(s);
        pqlQuery = String.format("['search', '%s', '%s', '%s', {'from':%d,'to':%d}, ['summary', 'searchTitle']]", new Object[] {
            "videos,people,suggestions", context, profiletype, Integer.valueOf(i), Integer.valueOf(j)
        });
        pqlQuery1 = String.format("['search', '%s', '%s', '%s', 'summary']", new Object[] {
            "videos,people,suggestions", context, profiletype
        });
        if (Log.isLoggable("nf_service_browse_fetchsearchrequest", 2))
        {
            Log.v("nf_service_browse_fetchsearchrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).append(", ").append(pqlQuery1).toString());
        }
    }

    private void handlePersonResult(com.netflix.mediaclient.service.webclient.model.SearchResults.Builder builder, JsonObject jsonobject)
    {
        new SearchPerson();
        jsonobject = (SearchPerson)FalcorParseUtils.getPropertyObject(jsonobject, "searchTitle", com/netflix/mediaclient/service/webclient/model/SearchPerson);
        builder.addPerson(jsonobject);
        Log.v("nf_service_browse_fetchsearchrequest", (new StringBuilder()).append("Found person: ").append(jsonobject).toString());
    }

    private void handleSuggestionResult(com.netflix.mediaclient.service.webclient.model.SearchResults.Builder builder, JsonObject jsonobject)
    {
        new SearchSuggestion();
        jsonobject = (SearchSuggestion)FalcorParseUtils.getPropertyObject(jsonobject, "searchTitle", com/netflix/mediaclient/service/webclient/model/SearchSuggestion);
        builder.addSuggestion(jsonobject);
        Log.v("nf_service_browse_fetchsearchrequest", (new StringBuilder()).append("Found suggestion: ").append(jsonobject).toString());
    }

    private void handleVideoResult(com.netflix.mediaclient.service.webclient.model.SearchResults.Builder builder, JsonObject jsonobject)
    {
        SearchVideo searchvideo = new SearchVideo();
        searchvideo.summary = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
        searchvideo.searchTitle = (com.netflix.mediaclient.service.webclient.model.branches.Video.SearchTitle)FalcorParseUtils.getPropertyObject(jsonobject, "searchTitle", com/netflix/mediaclient/service/webclient/model/branches/Video$SearchTitle);
        builder.addVideo(searchvideo);
        Log.v("nf_service_browse_fetchsearchrequest", (new StringBuilder()).append("Found video: ").append(searchvideo).toString());
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameGet();
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery, pqlQuery1
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onSearchResultsFetched((new com.netflix.mediaclient.service.webclient.model.SearchResults.Builder()).getResults(), i);
        }
    }

    protected void onSuccess(SearchResults searchresults)
    {
        if (responseCallback != null)
        {
            responseCallback.onSearchResultsFetched(searchresults, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((SearchResults)obj);
    }

    protected SearchResults parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        Object obj = new com.netflix.mediaclient.service.webclient.model.SearchResults.Builder();
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_browse_fetchsearchrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            return ((com.netflix.mediaclient.service.webclient.model.SearchResults.Builder) (obj)).getResults();
        }
        int i;
        try
        {
            jsonobject = FalcorParseUtils.getFirstJsonObject(jsonobject.getAsJsonObject("search").getAsJsonObject("videos,people,suggestions")).getAsJsonObject(profileType.toString());
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_fetchsearchrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        i = fromIndex;
        while (i <= toIndex) 
        {
            s = Integer.toString(i);
            if (jsonobject.has(s))
            {
                s = jsonobject.getAsJsonObject(s);
                Object obj1 = s.getAsJsonArray("path");
                if (obj1 == null || ((JsonArray) (obj1)).size() == 0)
                {
                    Log.w("nf_service_browse_fetchsearchrequest", (new StringBuilder()).append("Invalid search path: ").append(obj1).toString());
                } else
                {
                    obj1 = ((JsonArray) (obj1)).get(0).getAsString();
                    if (VIDEO_TYPES_SET.contains(obj1))
                    {
                        handleVideoResult(((com.netflix.mediaclient.service.webclient.model.SearchResults.Builder) (obj)), s);
                    } else
                    if ("people".equals(obj1))
                    {
                        handlePersonResult(((com.netflix.mediaclient.service.webclient.model.SearchResults.Builder) (obj)), s);
                    } else
                    if ("suggestions".equals(obj1))
                    {
                        handleSuggestionResult(((com.netflix.mediaclient.service.webclient.model.SearchResults.Builder) (obj)), s);
                    } else
                    {
                        Log.w("nf_service_browse_fetchsearchrequest", (new StringBuilder()).append("Unknown search result type: ").append(((String) (obj1))).toString());
                    }
                }
            }
            i++;
        }
        ((com.netflix.mediaclient.service.webclient.model.SearchResults.Builder) (obj)).setSummary((TrackableListSummary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/leafs/TrackableListSummary));
        return ((com.netflix.mediaclient.service.webclient.model.SearchResults.Builder) (obj)).getResults();
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

}
