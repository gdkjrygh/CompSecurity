// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.moa;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class i
{

    private int a[] = {
        1, 1
    };
    private int b[] = {
        -1, -1
    };
    private int c[] = {
        0, 0
    };
    private int d;

    public i()
    {
        d = 0;
    }

    public int a()
    {
        return b[0];
    }

    public void a(int j, int k)
    {
        a[0] = j;
        a[1] = k;
    }

    public int b()
    {
        return b[1];
    }

    public int c()
    {
        return c[0];
    }

    public int d()
    {
        return c[1];
    }

    public JSONObject e()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        JSONArray jsonarray = new JSONArray();
        jsonarray.put(a[0]);
        jsonarray.put(a[1]);
        jsonobject.put("imageorigsize", jsonarray);
        jsonobject.put("cellWidth", a());
        jsonobject.put("cellHeight", b());
        jsonobject.put("cols", c());
        jsonobject.put("rows", d());
        jsonobject.put("inplace", d);
        jsonobject.put("version", "2.0.0");
        return jsonobject;
    }
}
