// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import org.json.JSONException;
import org.json.JSONObject;

public class q
{

    public static final String a = "email";
    public static final String b = "password";
    public static final String c = "secret";
    private final String d;
    private final String e;

    public q(String s, String s1)
    {
        d = s;
        e = s1;
    }

    public q(JSONObject jsonobject)
        throws JSONException
    {
        this(jsonobject.getString("fieldName"), jsonobject.getString("message"));
    }

    public static q a(JSONObject jsonobject)
        throws JSONException
    {
        if (b(jsonobject))
        {
            return new q(jsonobject);
        } else
        {
            return null;
        }
    }

    public static boolean b(JSONObject jsonobject)
        throws JSONException
    {
        return jsonobject != null && jsonobject.has("errorType") && jsonobject.getString("errorType").equals("validation");
    }

    public String a()
    {
        return d;
    }

    public String b()
    {
        return e;
    }
}
