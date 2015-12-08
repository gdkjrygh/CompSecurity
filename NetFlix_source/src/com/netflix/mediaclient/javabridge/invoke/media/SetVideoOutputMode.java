// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class SetVideoOutputMode extends BaseInvoke
{

    private static final String METHOD = "setVideoOutputMode";
    private static final String PROPERTY_mode = "mode";
    private static final String TARGET = "media";

    public SetVideoOutputMode(boolean flag)
    {
        super("media", "setVideoOutputMode");
        setArguments(flag);
    }

    private void setArguments(boolean flag)
    {
        JSONObject jsonobject = new JSONObject();
        String s;
        if (flag)
        {
            s = "internal";
        } else
        {
            s = "external";
        }
        JSONException jsonexception;
        try
        {
            jsonobject.put("mode", s);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        break MISSING_BLOCK_LABEL_39;
        jsonexception;
        Log.e("nf_invoke", "Failed to create JSON object", jsonexception);
        return;
    }
}
