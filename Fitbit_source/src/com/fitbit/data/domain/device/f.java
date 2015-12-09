// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain.device;

import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

public class f
    implements b
{

    private String a;
    private String b;

    public f()
    {
    }

    public f(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public String a()
    {
        return a;
    }

    public void a(String s)
    {
        b = s;
    }

    public String b()
    {
        return b;
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass().equals(com/fitbit/data/domain/device/f))
        {
            return a.equals(((f)obj).a);
        } else
        {
            return false;
        }
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a = jsonobject.optString("name");
        b = jsonobject.optString("displayName");
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
