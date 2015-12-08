// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user.volley;

import android.content.Context;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.model.leafs.AccountData;
import com.netflix.mediaclient.service.webclient.model.leafs.ListSummary;
import com.netflix.mediaclient.service.webclient.model.leafs.SubtitlePreference;
import com.netflix.mediaclient.service.webclient.model.leafs.User;
import com.netflix.mediaclient.service.webclient.model.leafs.UserProfile;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import com.netflix.mediaclient.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FetchAccountDataRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_PROFILES = "profilesList";
    private static final String FIELD_USER = "user";
    private static final int MAX_PROFILES = 20;
    private static final String TAG = "nf_service_user_fetchaccountdatarequest";
    private final String pqlQuery1 = (new StringBuilder("['profilesList', 'summary']")).toString();
    private final String pqlQuery2 = (new StringBuilder("['profilesList', {'to':")).append(20).append("}, ['summary', 'subtitlePreference']]").toString();
    private final String pqlQuery3 = (new StringBuilder("['user', ['summary', 'subtitleDefaults']]")).toString();
    private final UserAgentWebCallback responseCallback;

    public FetchAccountDataRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, UserAgentWebCallback useragentwebcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = useragentwebcallback;
        if (Log.isLoggable("nf_service_user_fetchaccountdatarequest", 2))
        {
            Log.v("nf_service_user_fetchaccountdatarequest", (new StringBuilder()).append("PQL = ").append(pqlQuery1).toString());
            Log.v("nf_service_user_fetchaccountdatarequest", (new StringBuilder()).append("PQL = ").append(pqlQuery2).toString());
            Log.v("nf_service_user_fetchaccountdatarequest", (new StringBuilder()).append("PQL = ").append(pqlQuery3).toString());
        }
    }

    protected List getPQLQueries()
    {
        return Arrays.asList(new String[] {
            pqlQuery1, pqlQuery2, pqlQuery3
        });
    }

    protected void onFailure(int i)
    {
        if (responseCallback != null)
        {
            responseCallback.onAccountDataFetched(null, i);
        }
    }

    protected void onSuccess(AccountData accountdata)
    {
        if (responseCallback != null)
        {
            responseCallback.onAccountDataFetched(accountdata, 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((AccountData)obj);
    }

    protected AccountData parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_service_user_fetchaccountdatarequest", 2))
        {
            Log.v("nf_service_user_fetchaccountdatarequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_service_user_fetchaccountdatarequest", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("UserProfiles empty!!!");
        }
        Object obj;
        Object obj1;
        int i;
        try
        {
            obj1 = jsonobject.getAsJsonObject("profilesList");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_user_fetchaccountdatarequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing user json objects", ((Throwable) (obj)));
        }
        i = 20;
        if (((JsonObject) (obj1)).has("summary"))
        {
            i = ((ListSummary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj1)), "summary", com/netflix/mediaclient/service/webclient/model/leafs/ListSummary)).getLength();
        }
        obj = new ArrayList();
        for (int j = 0; j <= i; j++)
        {
            Object obj2 = Integer.toString(j);
            if (!((JsonObject) (obj1)).has(((String) (obj2))))
            {
                continue;
            }
            obj2 = ((JsonObject) (obj1)).getAsJsonObject(((String) (obj2)));
            UserProfile userprofile = new UserProfile();
            userprofile.summary = (com.netflix.mediaclient.service.webclient.model.leafs.UserProfile.Summary)FalcorParseUtils.getPropertyObject(((JsonObject) (obj2)), "summary", com/netflix/mediaclient/service/webclient/model/leafs/UserProfile$Summary);
            if (userprofile.summary == null || StringUtils.isEmpty(userprofile.getUserId()))
            {
                throw new FalcorParseException((new StringBuilder()).append("response missing summary").append(s).toString());
            }
            userprofile.subtitlePreference = (SubtitlePreference)FalcorParseUtils.getPropertyObject(((JsonObject) (obj2)), "subtitlePreference", com/netflix/mediaclient/service/webclient/model/leafs/SubtitlePreference);
            ((List) (obj)).add(userprofile);
        }

        obj1 = new User();
        try
        {
            jsonobject = jsonobject.getAsJsonObject("user");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.v("nf_service_user_fetchaccountdatarequest", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing user json objects", ((Throwable) (obj)));
        }
        obj1.summary = (com.netflix.mediaclient.service.webclient.model.leafs.User.Summary)FalcorParseUtils.getPropertyObject(jsonobject, "summary", com/netflix/mediaclient/service/webclient/model/leafs/User$Summary);
        if (((User) (obj1)).summary == null || StringUtils.isEmpty(((User) (obj1)).getUserId()))
        {
            throw new FalcorParseException((new StringBuilder()).append("response missing summary").append(s).toString());
        } else
        {
            obj1.subtitleDefaults = (SubtitlePreference)FalcorParseUtils.getPropertyObject(jsonobject, "subtitleDefaults", com/netflix/mediaclient/service/webclient/model/leafs/SubtitlePreference);
            s = new AccountData();
            s.setUser(((User) (obj1)));
            s.setUserProfiles(((List) (obj)));
            return s;
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
