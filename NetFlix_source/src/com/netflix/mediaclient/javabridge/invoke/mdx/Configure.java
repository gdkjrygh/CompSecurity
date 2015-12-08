// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class Configure extends BaseInvoke
{

    private static final String METHOD = "configure";
    private static final String PROPERTY_config = "config";
    private static final String TAG = "nf_invoke";
    private static final String TARGET = "mdx";

    public Configure(Map map)
    {
        super("mdx", "configure");
        setArguments(map);
    }

    private void setArguments(Map map)
    {
        JSONObject jsonobject = new JSONObject();
        JSONObject jsonobject1;
        jsonobject1 = new JSONObject();
        String s;
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext(); jsonobject1.put(s, map.get(s)))
        {
            s = (String)iterator.next();
        }

          goto _L1
_L3:
        Log.e("nf_invoke", "Failed to create JSON object", map);
        return;
_L1:
        try
        {
            jsonobject.put("config", jsonobject1);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Map map) { }
        continue; /* Loop/switch isn't completed */
        map;
        if (true) goto _L3; else goto _L2
_L2:
    }
}
