// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user.volley;

import android.content.Context;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

public class FetchDummyWebRequest extends FalcorVolleyWebClientRequest
{

    private static final String TAG = "nf_service_user_fetchdummywebrequest";
    private final String pqlQuery = (new StringBuilder("['dummy']")).toString();
    private final UserAgentWebCallback responseCallback;

    public FetchDummyWebRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, UserAgentWebCallback useragentwebcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = useragentwebcallback;
        if (Log.isLoggable("nf_service_user_fetchdummywebrequest", 2))
        {
            Log.v("nf_service_user_fetchdummywebrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onDummyWebCallDone(i);
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
            responseCallback.onDummyWebCallDone(0);
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
        if (!Log.isLoggable("nf_service_user_fetchdummywebrequest", 2));
        return Integer.toString(0);
    }

    protected boolean shouldSkipProcessingOnInvalidUser()
    {
        return false;
    }
}
