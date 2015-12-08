// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.BaseWebClient;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

public class FetchConnectWithFacebookRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_USER = "user";
    private static final String TAG = "nf_service_user_fetchwebuserrequest";
    private final String mAccessToken;
    private final String pqlQuery;
    private final UserAgentWebCallback responseCallback;

    public FetchConnectWithFacebookRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, UserAgentWebCallback useragentwebcallback)
    {
        super(context, configurationagentinterface);
        mAccessToken = s;
        responseCallback = useragentwebcallback;
        pqlQuery = (new StringBuilder("['connectWithFacebook', '")).append(mAccessToken).append("']").toString();
        if (Log.isLoggable("nf_service_user_fetchwebuserrequest", 2))
        {
            Log.v("nf_service_user_fetchwebuserrequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
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
            responseCallback.onConnectWithFacebook(i, null);
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
            responseCallback.onConnectWithFacebook(BaseWebClient.getFBConnectStatusCode(s), s);
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
        if (Log.isLoggable("nf_service_user_fetchwebuserrequest", 2))
        {
            Log.v("nf_service_user_fetchwebuserrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_user_fetchwebuserrequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("UserConnectWith empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("user");
        }
        catch (Exception exception)
        {
            Log.v("nf_service_user_fetchwebuserrequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing user json objects", exception);
        }
        s = (com.netflix.mediaclient.service.webclient.model.leafs.UserProfile.Operation)FalcorParseUtils.getPropertyObject(jsonobject, "operation", com/netflix/mediaclient/service/webclient/model/leafs/UserProfile$Operation);
        if (s != null)
        {
            return ((com.netflix.mediaclient.service.webclient.model.leafs.UserProfile.Operation) (s)).status;
        } else
        {
            return new String("400");
        }
    }

    protected boolean shouldSkipProcessingOnInvalidUser()
    {
        return false;
    }
}
