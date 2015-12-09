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
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.model.leafs.ListOfMoviesSummary;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            PrefetchGenreLoLoMoRequest

public class FetchGenresRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_GENRE_LOLOMO = "genreLolomo";
    private static final String FIELD_TOP_GENRE = "topGenre";
    private static final String TAG = "nf_service_browse_fetchgenresrequest";
    private final int fromGenre;
    private final String genreId;
    private final HardCache hardCache;
    private final String lolomoId;
    private final boolean lolomoIdInCache;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final int toGenre;

    public FetchGenresRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, String s, int i, int j, 
            BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        genreId = s;
        fromGenre = i;
        toGenre = j;
        hardCache = hardcache;
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
            pqlQuery = (new StringBuilder("['genreLolomo','")).append(lolomoId).append("',{'from':").append(i).append(",'to':").append(j).append("},'summary']").toString();
        } else
        {
            pqlQuery = (new StringBuilder("['topGenre','")).append(s).append("',{'from':").append(i).append(",'to':").append(j).append("},'summary']").toString();
        }
        if (Log.isLoggable("nf_service_browse_fetchgenresrequest", 2))
        {
            Log.v("nf_service_browse_fetchgenresrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onGenresFetched(Collections.emptyList(), i);
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
            responseCallback.onGenresFetched(list, 0);
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
        if (!Log.isLoggable("nf_service_browse_fetchgenresrequest", 2));
        arraylist = new ArrayList();
        obj = FalcorParseUtils.getDataObj("nf_service_browse_fetchgenresrequest", s);
        if (!FalcorParseUtils.isEmpty(((JsonObject) (obj)))) goto _L2; else goto _L1
_L1:
        return arraylist;
_L2:
        int i;
        try
        {
            if (!lolomoIdInCache)
            {
                break; /* Loop/switch isn't completed */
            }
            obj = ((JsonObject) (obj)).getAsJsonObject("genreLolomo").getAsJsonObject(lolomoId);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_fetchgenresrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        s = ((String) (obj));
        if (!lolomoIdInCache)
        {
            PrefetchGenreLoLoMoRequest.putGenreLoLoMoIdInBrowseCache(hardCache, genreId, s);
        }
        i = fromGenre;
        while (i <= toGenre) 
        {
            obj = Integer.toString(i);
            if (s.has(((String) (obj))))
            {
                obj = (ListOfMoviesSummary)FalcorParseUtils.getPropertyObject(s.getAsJsonObject(((String) (obj))), "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListOfMoviesSummary);
                if (obj != null)
                {
                    ((ListOfMoviesSummary) (obj)).setListPos(i);
                }
                arraylist.add(obj);
            }
            i++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        obj = ((JsonObject) (obj)).getAsJsonObject("topGenre").getAsJsonObject(genreId);
        s = ((String) (obj));
        break MISSING_BLOCK_LABEL_56;
    }
}
