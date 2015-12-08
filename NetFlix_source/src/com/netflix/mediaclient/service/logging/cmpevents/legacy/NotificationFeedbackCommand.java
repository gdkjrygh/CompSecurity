// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.logging.cmpevents.legacy;

import android.util.Pair;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.webapi.AuthorizationCredentials;
import com.netflix.mediaclient.webapi.CommonRequestParameters;
import com.netflix.mediaclient.webapi.ResponseWebApiPostCommand;
import java.io.UnsupportedEncodingException;
import org.apache.http.HttpEntity;
import org.apache.http.entity.StringEntity;
import org.json.JSONObject;

public class NotificationFeedbackCommand extends ResponseWebApiPostCommand
{

    protected static final String PATH = "/log";
    private String mPayload;

    public NotificationFeedbackCommand(String s, AuthorizationCredentials authorizationcredentials, CommonRequestParameters commonrequestparameters, JSONObject jsonobject, String s1)
    {
        super(s, authorizationcredentials, commonrequestparameters);
        mPayload = jsonobject.toString();
        if (Log.isLoggable("nf_rest", 3))
        {
            Log.d("nf_rest", (new StringBuilder()).append("Payload: ").append(mPayload).toString());
        }
    }

    public String getCommandPath()
    {
        return "/log";
    }

    protected HttpEntity getEntity()
        throws UnsupportedEncodingException
    {
        return new StringEntity(mPayload, "UTF-8");
    }

    public Pair[] getHeaders()
    {
        return (new Pair[] {
            new Pair("X-Netflix.ichnaea.request.type", "CMPMessageFeedbackRequest"), new Pair("Content-Type", "application/json")
        });
    }

    protected StringBuilder getUrl()
    {
        return getBaseCmsBeaconUrl();
    }
}
