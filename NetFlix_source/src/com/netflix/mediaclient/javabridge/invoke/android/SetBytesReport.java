// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.android;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class SetBytesReport extends BaseInvoke
{

    private static final String METHOD = "setBytesReport";
    private static final String PROPERTY_BYTES_RX = "bytesRx";
    private static final String PROPERTY_BYTES_TX = "bytesTx";
    private static final String TARGET = "android";

    public SetBytesReport(int i, int j)
    {
        super("android", "setBytesReport");
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("bytesRx", j);
            jsonobject.put("bytesTx", i);
        }
        catch (JSONException jsonexception)
        {
            Log.e("nf_invoke", "Failed to create JSON object", jsonexception);
        }
        catch (Exception exception)
        {
            Log.e("nf_invoke", "Unable to Log WifiLinkSpeed ", exception);
        }
        arguments = jsonobject.toString();
    }
}
