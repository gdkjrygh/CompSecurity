// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.user.volley;

import android.content.Context;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.user.UserAgentWebCallback;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseException;
import com.netflix.mediaclient.service.webclient.volley.FalcorParseUtils;
import com.netflix.mediaclient.service.webclient.volley.FalcorServerException;
import com.netflix.mediaclient.service.webclient.volley.FalcorVolleyWebClientRequest;
import java.util.Arrays;
import java.util.List;

public class VerifyPinRequest extends FalcorVolleyWebClientRequest
{

    private static final String FIELD_IS_PIN_VALID = "isPinValid";
    private static final String FIELD_USER = "user";
    private static final String FIELD_VERIFY_PIN = "verifyPin";
    private static final String TAG = "nf_pin";
    private final String enteredPin;
    private final String pqlQuery1;
    private final UserAgentWebCallback responseCallback;

    protected VerifyPinRequest(Context context, com.netflix.mediaclient.service.ServiceAgent.ConfigurationAgentInterface configurationagentinterface, String s, UserAgentWebCallback useragentwebcallback)
    {
        super(context, configurationagentinterface);
        responseCallback = useragentwebcallback;
        enteredPin = s;
        pqlQuery1 = String.format("['user', 'verifyPin', '%s']", new Object[] {
            s
        });
        if (Log.isLoggable("nf_pin", 2))
        {
            Log.v("nf_pin", (new StringBuilder()).append("PQL = ").append(pqlQuery1).toString());
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
            responseCallback.onPinVerified(false, i);
        }
    }

    protected void onSuccess(Boolean boolean1)
    {
        if (responseCallback != null)
        {
            responseCallback.onPinVerified(boolean1.booleanValue(), 0);
        }
    }

    protected volatile void onSuccess(Object obj)
    {
        onSuccess((Boolean)obj);
    }

    protected Boolean parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        if (Log.isLoggable("nf_pin", 2))
        {
            Log.v("nf_pin", (new StringBuilder()).append("String response to parse = ").append(s).toString());
        }
        JsonObject jsonobject = FalcorParseUtils.getDataObj("nf_pin", s);
        if (FalcorParseUtils.isEmpty(jsonobject))
        {
            throw new FalcorParseException("verifyPinResponse empty!!!");
        }
        try
        {
            jsonobject = jsonobject.getAsJsonObject("user");
        }
        catch (Exception exception)
        {
            Log.v("nf_pin", (new StringBuilder()).append("String response to parse = ").append(s).toString());
            throw new FalcorParseException("response missing user json objects", exception);
        }
        return Boolean.valueOf(jsonobject.getAsJsonObject("verifyPin").getAsJsonObject(enteredPin).get("isPinValid").getAsBoolean());
    }

    protected volatile Object parseFalcorResponse(String s)
        throws FalcorParseException, FalcorServerException
    {
        return parseFalcorResponse(s);
    }
}
