// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Init extends BaseInvoke
{

    private static final String METHOD = "init";
    private static final String PROPERTY_commandMap = "commandMap";
    private static final String PROPERTY_dialBlacklist = "dialBlacklist";
    private static final String PROPERTY_disableWebSocket = "disableWebSocket";
    private static final String PROPERTY_role = "role";
    private static final String TAG = "nf_invoke";
    private static final String TARGET = "mdx";

    public Init(boolean flag, Map map, boolean flag1, JSONArray jsonarray)
    {
        super("mdx", "init");
        setArguments(flag, map, flag1, jsonarray);
    }

    private void setArguments(boolean flag, Map map, boolean flag1, JSONArray jsonarray)
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
        map;
_L5:
        Log.e("nf_invoke", "Failed to create JSON object", map);
        return;
_L1:
        jsonobject.put("commandMap", jsonobject1);
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        jsonobject.put("role", "CONTROLLER");
_L3:
        jsonobject.put("disableWebSocket", flag1);
        jsonobject.put("dialBlacklist", jsonarray);
        arguments = jsonobject.toString();
        return;
        jsonobject.put("role", "TARGET");
        if (true) goto _L3; else goto _L2
_L2:
        map;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
