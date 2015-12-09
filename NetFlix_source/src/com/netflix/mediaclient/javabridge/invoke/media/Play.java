// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public final class Play extends BaseInvoke
{

    private static final String METHOD = "play";
    private static final String PROPERTY_TIME = "ms";
    private static final String TARGET = "media";

    public Play()
    {
        super("media", "play");
    }

    public Play(long l)
    {
        super("media", "play");
        setArguments(l);
    }

    private void setArguments(long l)
    {
        JSONObject jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("ms", l);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        break MISSING_BLOCK_LABEL_26;
        jsonexception;
        Log.e("nf_invoke", "Failed to create JSON object", jsonexception);
        return;
    }
}
