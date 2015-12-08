// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.g;

import org.json.JSONException;
import org.json.JSONObject;

public class b
{

    public static String a(String s, String s1, String s2, JSONObject jsonobject)
    {
        JSONObject jsonobject1 = new JSONObject();
        JSONObject jsonobject2;
        jsonobject2 = new JSONObject();
        jsonobject2.put(s1, s2);
        if (jsonobject == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        jsonobject2.put("options", jsonobject);
        jsonobject1.put("event", s);
        jsonobject1.put("data", jsonobject2);
_L2:
        return jsonobject1.toString();
        s;
        s.printStackTrace();
        if (true) goto _L2; else goto _L1
_L1:
    }
}
