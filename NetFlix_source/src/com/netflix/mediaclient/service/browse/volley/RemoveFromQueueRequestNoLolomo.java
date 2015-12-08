// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.browse.volley;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.browse.BrowseAgentCallback;
import com.netflix.mediaclient.service.browse.cache.HardCache;
import com.netflix.mediaclient.service.browse.cache.SoftCache;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.service.browse.volley:
//            FetchIQVideosRequest

public class RemoveFromQueueRequestNoLolomo extends FalcorVolleyWebClientRequest
{

    public static final String TAG = "nf_service_browse_removefromqueuerequest";
    private final HardCache hardCache;
    private final String mVideoId;
    private final String pqlQuery;
    private final BrowseAgentCallback responseCallback;
    private final SoftCache softCache;

    public RemoveFromQueueRequestNoLolomo(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, HardCache hardcache, SoftCache softcache, String s, BrowseAgentCallback browseagentcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = browseagentcallback;
        hardCache = hardcache;
        softCache = softcache;
        mVideoId = s;
        pqlQuery = String.format("['videos', '%s', 'removeFromQueue']", new Object[] {
            s
        });
        if (Log.isLoggable("nf_service_browse_removefromqueuerequest", 2))
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameCall();
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
            Log.d("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("RemoveFromQueueRequestNoLolomo finished onFailure statusCode=").append(i).toString());
            responseCallback.onQueueRemove(i);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((String)obj);
    }

    protected void onSuccess(String s)
    {
        if (responseCallback != null)
        {
            Log.d("nf_service_browse_removefromqueuerequest", "RemoveFromQueueRequestNoLolomo finished onSuccess");
            responseCallback.onQueueRemove(0);
        }
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected String parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_service_browse_removefromqueuerequest", 2))
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        Object obj;
        try
        {
            obj = (new JsonParser()).parse(s).getAsJsonObject();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("Error in creating JsonObject", ((Throwable) (obj)));
        }
        if (FalcorParseUtils.containsErrors(((JsonObject) (obj))))
        {
            if (FalcorParseUtils.getErrorMessage(((JsonObject) (obj))).contains("NotInQueue"))
            {
                return Integer.toString(0);
            } else
            {
                throw new FalcorServerException(FalcorParseUtils.getErrorMessage(((JsonObject) (obj))));
            }
        }
        obj = ((JsonObject) (obj)).getAsJsonObject("value");
        if (FalcorParseUtils.isEmpty(((JsonObject) (obj))))
        {
            return Integer.toString(0);
        }
        try
        {
            obj = (com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)).getAsJsonObject("videos").getAsJsonObject(mVideoId), "inQueue", com/netflix/mediaclient/service/webclient/model/branches/Video$InQueue);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_browse_removefromqueuerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing expected json objects", exception);
        }
        FetchIQVideosRequest.updateMdpWithIQInfo(hardCache, softCache, mVideoId, ((com.netflix.mediaclient.service.webclient.model.branches.Video.InQueue) (obj)).inQueue);
        return Integer.toString(0);
    }
}
