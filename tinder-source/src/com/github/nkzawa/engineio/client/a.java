// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.engineio.client;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{

    public String a;
    public String b[];
    public long c;
    public long d;

    a(String s)
        throws JSONException
    {
        this(new JSONObject(s));
    }

    private a(JSONObject jsonobject)
        throws JSONException
    {
        JSONArray jsonarray = jsonobject.getJSONArray("upgrades");
        int j = jsonarray.length();
        String as[] = new String[j];
        for (int i = 0; i < j; i++)
        {
            as[i] = jsonarray.getString(i);
        }

        a = jsonobject.getString("sid");
        b = as;
        c = jsonobject.getLong("pingInterval");
        d = jsonobject.getLong("pingTimeout");
    }
}
