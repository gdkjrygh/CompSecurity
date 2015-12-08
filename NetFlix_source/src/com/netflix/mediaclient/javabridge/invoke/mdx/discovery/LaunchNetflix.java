// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.javabridge.invoke.mdx.discovery;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.javabridge.invoke.BaseInvoke;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class LaunchNetflix extends BaseInvoke
{

    private static final String METHOD = "launchNetflix";
    private static final String PROPERTY_launchArgs = "launchArgs";
    private static final String PROPERTY_usn = "usn";
    private static final String TARGET = "mdx";

    public LaunchNetflix(String s, Map map)
    {
        super("mdx", "launchNetflix");
        setArguments(s, map);
    }

    private void setArguments(String s, Map map)
    {
        JSONObject jsonobject = new JSONObject();
        String s1;
        Iterator iterator;
        s1 = new String();
        iterator = map.keySet().iterator();
_L2:
        String s2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_128;
        }
        s2 = (String)iterator.next();
        s2 = (new StringBuilder()).append(s1).append(s2).append("=").append((String)map.remove(s2)).toString();
        s1 = s2;
        if (map.isEmpty()) goto _L2; else goto _L1
_L1:
        s1 = (new StringBuilder()).append(s2).append("&").toString();
          goto _L2
        try
        {
            jsonobject.put("usn", s);
            jsonobject.put("launchArgs", s1);
            arguments = jsonobject.toString();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_157;
        s;
        Log.e("nf_invoke", "Failed to create JSON object", s);
        return;
    }
}
