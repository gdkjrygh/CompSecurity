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
import com.netflix.mediaclient.servicemgr.VideoList;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Arrays;
import java.util.List;

public class FetchSimilarVideosRequest extends FalcorVolleyWebClientRequest
{
    public static class FetchSimilarVideosForPersonRequest extends FetchSimilarVideosRequest
    {

        protected volatile void onSuccess(Object obj)
        {
            onSuccess((VideoList)obj);
        }

        protected volatile Object parseFalcorResponse(String s)
            throws FalcorParseException, FalcorServerException
        {
            return parseFalcorResponse(s);
        }

        public FetchSimilarVideosForPersonRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, int i, BrowseAgentCallback browseagentcallback)
        {
            super(context, configurationagentinterface, SimilarRequestType.PEOPLE, s, i, browseagentcallback, null);
        }
    }

    public static class FetchSimilarVideosForQuerySuggestionRequest extends FetchSimilarVideosRequest
    {

        protected volatile void onSuccess(Object obj)
        {
            onSuccess((VideoList)obj);
        }

        protected volatile Object parseFalcorResponse(String s)
            throws FalcorParseException, FalcorServerException
        {
            return parseFalcorResponse(s);
        }

        public FetchSimilarVideosForQuerySuggestionRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, int i, BrowseAgentCallback browseagentcallback)
        {
            super(context, configurationagentinterface, SimilarRequestType.QUERY_SUGGESTION, s, i, browseagentcallback, null);
        }
    }

    private static final class SimilarRequestType extends Enum
    {

        private static final SimilarRequestType $VALUES[];
        public static final SimilarRequestType PEOPLE;
        public static final SimilarRequestType QUERY_SUGGESTION;
        public final String keyName;

        public static SimilarRequestType valueOf(String s)
        {
            return (SimilarRequestType)Enum.valueOf(com/netflix/mediaclient/service/browse/volley/FetchSimilarVideosRequest$SimilarRequestType, s);
        }

        public static SimilarRequestType[] values()
        {
            return (SimilarRequestType[])$VALUES.clone();
        }

        static 
        {
            PEOPLE = new SimilarRequestType("PEOPLE", 0, "people");
            QUERY_SUGGESTION = new SimilarRequestType("QUERY_SUGGESTION", 1, "suggestions");
            $VALUES = (new SimilarRequestType[] {
                PEOPLE, QUERY_SUGGESTION
            });
        }

        private SimilarRequestType(String s, int i, String s1)
        {
            super(s, i);
            keyName = s1;
        }
    }


    private static final String TAG = "nf_fetch_sims_request";
    private final int from;
    private final String id;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final int to;
    private final SimilarRequestType type;

    private FetchSimilarVideosRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, SimilarRequestType similarrequesttype, String s, int i, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        id = s;
        context = StringUtils.escapeJsonChars(s);
        type = similarrequesttype;
        from = 0;
        to = i;
        pqlQuery = String.format("['%s', '%s', 'relatedVideos', {'from':%d, 'to':%d}, 'summary']", new Object[] {
            similarrequesttype.keyName, context, Integer.valueOf(from), Integer.valueOf(i)
        });
        if (Log.isLoggable("nf_fetch_sims_request", 2))
        {
            Log.v("nf_fetch_sims_request", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }


    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameGet();
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
            responseCallback.onSimilarVideosFetched(null, i);
        }
    }

    protected void onSuccess(VideoList videolist)
    {
        if (responseCallback != null)
        {
            responseCallback.onSimilarVideosFetched(videolist, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((VideoList)obj);
    }

    protected VideoList parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        com.netflix.mediaclient.service.webclient.model.VideoList videolist;
        JsonObject jsonobject;
        videolist = new com.netflix.mediaclient.service.webclient.model.VideoList();
        jsonobject = FalcorParseUtils.getDataObj("nf_fetch_sims_request", s);
        if (!FalcorParseUtils.isEmpty(jsonobject)) goto _L2; else goto _L1
_L1:
        return videolist;
_L2:
        int i;
        try
        {
            jsonobject = jsonobject.getAsJsonObject(type.keyName).getAsJsonObject(id).getAsJsonObject("relatedVideos");
        }
        catch (Exception exception)
        {
            Log.v("nf_fetch_sims_request", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        i = from;
        while (i <= to) 
        {
            s = Integer.toString(i);
            if (jsonobject.has(s))
            {
                s = (com.netflix.mediaclient.service.webclient.model.branches.Video.Summary)FalcorParseUtils.getPropertyObject(jsonobject.getAsJsonObject(s), "summary", com/netflix/mediaclient/service/webclient/model/branches/Video$Summary);
                videolist.add(s);
                Log.v("nf_fetch_sims_request", (new StringBuilder()).append("Found video: ").append(s.getTitle()).toString());
            }
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }
}
