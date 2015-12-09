// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.model.leafs.SubtitlePreference;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.util.StringUtils;
import java.util.Arrays;
import java.util.List;

public class FetchProfileDataRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_PROFILES = "profiles";
    private static final String TAG = "nf_service_user_fetchprofiledatarequest";
    private final String mProfileId;
    private final String pqlQuery1;
    private final UserAgentWebCallback responseCallback;

    public FetchProfileDataRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, UserAgentWebCallback useragentwebcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = useragentwebcallback;
        mProfileId = s;
        pqlQuery1 = (new StringBuilder("['profiles','")).append(s).append("',['summary', 'subtitlePreference']]").toString();
        if (Log.isLoggable("nf_service_user_fetchprofiledatarequest", 2))
        {
            Log.v("nf_service_user_fetchprofiledatarequest", (new StringBuilder()).append("PQL = ").append(pqlQuery1).toString());
        }
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery1
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onProfileDataFetched(null, i);
        }
    }

    protected void onSuccess(UserProfile userprofile)
    {
        if (responseCallback != null)
        {
            responseCallback.onProfileDataFetched(userprofile, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((UserProfile)obj);
    }

    protected UserProfile parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_service_user_fetchprofiledatarequest", 2))
        {
            Log.v("nf_service_user_fetchprofiledatarequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        Object obj = FalcorParseUtils.getDataObj("nf_service_user_fetchprofiledatarequest", s);
        if (FalcorParseUtils.isEmpty(((JsonObject) (obj))))
        {
            throw new FalcorParseException("UserProfile empty!!!");
        }
        UserProfile userprofile;
        try
        {
            obj = ((JsonObject) (obj)).getAsJsonObject("profiles");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_user_fetchprofiledatarequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing profiles json objects", ((Throwable) (obj)));
        }
        obj = ((JsonObject) (obj)).getAsJsonObject(mProfileId);
        userprofile = new UserProfile();
        userprofile.summary = (com.netflix.mediaclient.service.webclient.model.leafs.UserProfile.Summary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "summary", com/netflix/mediaclient/service/webclient/model/leafs/UserProfile$Summary);
        if (userprofile.summary == null || StringUtils.isEmpty(userprofile.getUserId()))
        {
            throw new FalcorParseException((new StringBuilder()).append("response missing summary").append(s).toString());
        } else
        {
            userprofile.subtitlePreference = (SubtitlePreference)FalcorParseUtils.getPropertyObject(((JsonObject) (obj)), "subtitlePreference", com/netflix/mediaclient/service/webclient/model/leafs/SubtitlePreference);
            return userprofile;
        }
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
