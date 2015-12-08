// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.model.leafs.UserBoundCookies;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

public class SwitchUserProfileRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_PROFILE = "profile";
    private static final String TAG = "nf_service_user_switchuserprofilerequest";
    private final String guid;
    private final String pqlQuery = (new StringBuilder("['switchProfile']")).toString();
    private final UserAgentWebCallback responseCallback;

    public SwitchUserProfileRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, UserAgentWebCallback useragentwebcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = useragentwebcallback;
        guid = s;
        if (Log.isLoggable("nf_service_user_switchuserprofilerequest", 2))
        {
            Log.v("nf_service_user_switchuserprofilerequest", (new StringBuilder()).append("PQL = ").append(pqlQuery).toString());
        }
    }

    protected String getMethodType()
    {
        return FalcorParseUtils.getMethodNameCall();
    }

    protected String getOptionalParams()
    {
        Object obj = (new StringBuilder("'")).append(guid).append("'").toString();
        obj = (new StringBuilder()).append(urlEncodPQLParam(FalcorParseUtils.getParamNameParam(), ((String) (obj))));
        Log.d("nf_service_user_switchuserprofilerequest", (new StringBuilder()).append(" getOptionalParams: ").append(((StringBuilder) (obj)).toString()).toString());
        return ((StringBuilder) (obj)).toString();
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
            responseCallback.onUserProfileSwitched(null, i);
        }
    }

    protected void onSuccess(UserBoundCookies userboundcookies)
    {
        if (responseCallback != null)
        {
            responseCallback.onUserProfileSwitched(userboundcookies, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((UserBoundCookies)obj);
    }

    protected UserBoundCookies parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_service_user_switchuserprofilerequest", 2))
        {
            Log.v("nf_service_user_switchuserprofilerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_user_switchuserprofilerequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("User empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("profile").getAsJsonObject(guid);
        }
        catch (Exception exception)
        {
            Log.v("nf_service_user_switchuserprofilerequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing user json objects", exception);
        }
        return (UserBoundCookies)FalcorParseUtils.getPropertyObject(jsonobject, "userTokens", com/netflix/mediaclient/service/webclient/model/leafs/UserBoundCookies);
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }

    protected boolean shouldSkipProcessingOnInvalidUser()
    {
        return false;
    }
}
