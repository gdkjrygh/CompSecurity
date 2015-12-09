// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class SetNetworkParameters extends BaseInvoke
{

    private static final String METHOD = "setNetworkParameters";
    private static final String PROPERTY_carrier = "carrier";
    private static final String PROPERTY_countryCode = "countryCode";
    private static final String PROPERTY_lastBytesReceived = "lastBytesReceived";
    private static final String PROPERTY_networkCode = "networkCode";
    private static final String PROPERTY_networkSpec = "networkSpec";
    private static final String PROPERTY_networkType = "networkType";
    private static final String TARGET = "media";

    public SetNetworkParameters(String s, String s1, String s2, String s3, String s4, int i)
    {
        super("media", "setNetworkParameters");
        setArguments(s, s1, s2, s3, s4, i);
    }

    private void setArguments(String s, String s1, String s2, String s3, String s4, int i)
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("carrier", s);
            jsonobject.put("countryCode", s1);
            jsonobject.put("networkCode", s2);
            jsonobject.put("networkType", s3);
            jsonobject.put("networkSpec", s4);
            jsonobject.put("lastBytesReceived", i);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_77;
        s;
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
    }
}
