// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx.session;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class EndSession extends BaseInvoke
{

    public static final String METHOD = "endSession";
    public static final String PROPERTY_sessionId = "sid";
    private static final String TARGET = "mdx";

    public EndSession(int i)
    {
        super("mdx", "endSession");
        setArguments(i);
    }

    private void setArguments(int i)
    {
        JSONObject jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("sid", i);
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
