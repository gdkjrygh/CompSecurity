// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfGenreSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class FetchGenreListsRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_GENRELIST = "genreList";
    private static final String TAG = "nf_service_browse_fetchgenrelistrequest";
    private final String pqlQuery = (new StringBuilder("['genreList']")).toString();
    private long rDurationInMs;
    private long rEnd;
    private final long rStart = System.nanoTime();
    private final BrowseAgentCallback responseCallback;

    public FetchGenreListsRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, int i, int j, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        if (Log.isLoggable("nf_service_browse_fetchgenrelistrequest", 2))
        {
            Log.v("nf_service_browse_fetchgenrelistrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onGenreListsFetched(Collections.emptyList(), i);
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
            responseCallback.onGenreListsFetched(list, 0);
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
        rEnd = System.nanoTime();
        rDurationInMs = TimeUnit.MILLISECONDS.convert(rEnd - rStart, TimeUnit.NANOSECONDS);
        Log.d("nf_service_browse_fetchgenrelistrequest", String.format("genreList request took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        if (Log.isLoggable("nf_service_browse_fetchgenrelistrequest", 2))
        {
            Log.v("nf_service_browse_fetchgenrelistrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        Object obj = new ArrayList();
        Object obj1 = FalcorParseUtils.getDataObj("nf_service_browse_fetchgenrelistrequest", s);
        if (FalcorParseUtils.isEmpty(((JsonObject) (obj1))))
        {
            throw new FalcorParseException("GenreLists empty!!!");
        }
        int i;
        try
        {
            obj1 = ((JsonObject) (obj1)).getAsJsonArray("genreList");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_fetchgenrelistrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", ((Throwable) (obj)));
        }
        for (i = 0; i < ((JsonArray) (obj1)).size(); i++)
        {
            s = ((JsonArray) (obj1)).get(i);
            ((List) (obj)).add((ListOfGenreSummary)FalcorParseUtils.getGson().fromJson(s, com/netflix/mediaclient/service/webclient/model/leafs/ListOfGenreSummary));
        }

        rEnd = System.nanoTime();
        rDurationInMs = TimeUnit.MILLISECONDS.convert(rEnd - rStart, TimeUnit.NANOSECONDS);
        Log.d("nf_service_browse_fetchgenrelistrequest", String.format(" genreList success - took %d ms ", new Object[] {
            Long.valueOf(rDurationInMs)
        }));
        return ((List) (obj));
    }
}
