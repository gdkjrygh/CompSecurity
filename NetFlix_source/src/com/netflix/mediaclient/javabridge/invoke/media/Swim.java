// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.media;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import org.json.JSONException;
import org.json.JSONObject;

public class Swim extends BaseInvoke
{

    private static final String METHOD = "swim";
    private static final String PROPERTY_absolute = "absolute";
    private static final String PROPERTY_allowRebuffer = "allowRebuffer";
    private static final String PROPERTY_forceRebuffer = "forceRebuffer";
    private static final String PROPERTY_fuzz = "fuzz";
    private static final String PROPERTY_pts = "pts";
    private static final String TARGET = "media";

    public Swim(int i)
    {
        super("media", "swim");
        setArguments(i, true, 0, true, false);
    }

    public Swim(int i, boolean flag)
    {
        super("media", "swim");
        setArguments(i, true, 0, true, flag);
    }

    public Swim(int i, boolean flag, int j, boolean flag1)
    {
        super("media", "swim");
        setArguments(i, flag, j, flag1, false);
    }

    public Swim(int i, boolean flag, int j, boolean flag1, boolean flag2)
    {
        super("media", "swim");
        setArguments(i, flag, j, flag1, flag2);
    }

    private void setArguments(int i, boolean flag, int j, boolean flag1, boolean flag2)
    {
        JSONObject jsonobject = new JSONObject();
        JSONException jsonexception;
        try
        {
            jsonobject.put("pts", i);
            jsonobject.put("absolute", flag);
            jsonobject.put("fuzz", j);
            jsonobject.put("allowRebuffer", flag1);
            jsonobject.put("forceRebuffer", flag2);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONException jsonexception) { }
        break MISSING_BLOCK_LABEL_68;
        jsonexception;
        Log.e("nf_invoke", "Failed to create JSON object", jsonexception);
        return;
    }
}
