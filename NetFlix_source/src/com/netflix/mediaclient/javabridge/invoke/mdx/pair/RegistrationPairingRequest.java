// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx.pair;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class RegistrationPairingRequest extends BaseInvoke
{

    private static final String METHOD = "regPairRequest";
    private static final String PROPERTY_pin = "pin";
    private static final String PROPERTY_remotedevice = "remotedevice";
    private static final String TARGET = "mdx";

    public RegistrationPairingRequest(String s, String s1)
    {
        super("mdx", "regPairRequest");
        setArguments(s, s1);
    }

    private void setArguments(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("remotedevice", s);
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_28;
        }
        jsonobject.put("pin", s1);
        arguments = jsonobject.toString();
        return;
        s;
_L2:
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
        s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
