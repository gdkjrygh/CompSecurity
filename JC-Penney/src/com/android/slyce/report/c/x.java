// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;

import org.json.JSONException;
import org.json.JSONObject;

public class x
{

    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final String e;
    public final String f;

    public x(int i, String s, int j, int k, String s1, String s2)
    {
        a = i;
        b = s;
        c = j;
        d = k;
        e = s1;
        f = s2;
    }

    public String toString()
    {
        Object obj;
        try
        {
            obj = new JSONObject();
            if (a == 1)
            {
                ((JSONObject) (obj)).put("prefix", "shortest");
            }
            if (b != null)
            {
                ((JSONObject) (obj)).put("view_class", b);
            }
            if (c > -1)
            {
                ((JSONObject) (obj)).put("index", c);
            }
            if (d > -1)
            {
                ((JSONObject) (obj)).put("id", d);
            }
            if (e != null)
            {
                ((JSONObject) (obj)).put("contentDescription", e);
            }
            if (f != null)
            {
                ((JSONObject) (obj)).put("tag", f);
            }
            obj = ((JSONObject) (obj)).toString();
        }
        catch (JSONException jsonexception)
        {
            throw new RuntimeException("Can't serialize PathElement to String", jsonexception);
        }
        return ((String) (obj));
    }
}
