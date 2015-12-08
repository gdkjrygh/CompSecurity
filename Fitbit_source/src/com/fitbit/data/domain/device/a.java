// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

public class a
    implements b
{

    private String a;
    private String b;
    private String c;

    public a()
    {
    }

    public a(String s, String s1, String s2)
    {
        b = s1;
        a = s;
        c = s2;
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        c = s;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass().equals(com/fitbit/data/domain/device/a))
        {
            return b.equals(((a)obj).b);
        } else
        {
            return false;
        }
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.optString("imageUrl");
        b = jsonobject.optString("name");
        c = jsonobject.optString("displayName");
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
