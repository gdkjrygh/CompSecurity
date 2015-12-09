// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class SetStreamingBuffer extends BaseInvoke
{

    private static final String METHOD = "setStreamingBuffer";
    private static final String PROPERTY_maxBufferLen = "maxBufferLen";
    private static final String PROPERTY_minBufferLen = "minBufferLen";
    private static final String PROPERTY_powerSaving = "powerSaving";
    private static final String TARGET = "media";

    public SetStreamingBuffer(boolean flag, int i, int j)
    {
        super("media", "setStreamingBuffer");
        JSONObject jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("powerSaving", flag);
            jsonobject.put("maxBufferLen", i);
            jsonobject.put("minBufferLen", j);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        break MISSING_BLOCK_LABEL_56;
        jsonexception;
        Log.e("nf_invoke", "Failed to create JSON object", jsonexception);
        return;
    }
}
