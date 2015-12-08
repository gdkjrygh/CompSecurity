// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.registration;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class SetActivationTokens extends BaseInvoke
{

    private static final String METHOD = "setActivationTokens";
    private static final String PROPERTY_NetflixId = "NetflixId";
    private static final String PROPERTY_SecureNetflixId = "SecureNetflixId";
    private static final String TARGET = "registration";

    public SetActivationTokens(String s, String s1)
    {
        super("registration", "setActivationTokens");
        setArguments(s, s1);
    }

    private void setArguments(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("NetflixId", s);
            jsonobject.put("SecureNetflixId", s1);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_34;
        s;
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
    }
}
