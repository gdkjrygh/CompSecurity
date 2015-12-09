// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.a;

import com.aviary.android.feather.common.utils.d;
import java.io.IOException;
import java.io.InputStream;
import org.json.JSONException;
import org.json.JSONObject;

public abstract class b
{

    protected int n;
    protected String o;

    public b()
    {
    }

    public int a(InputStream inputstream)
        throws IOException, JSONException
    {
        return a(d.a(inputstream));
    }

    public int a(String s)
        throws JSONException
    {
        return b(new JSONObject(s));
    }

    protected abstract void a(JSONObject jsonobject)
        throws JSONException;

    public int b(JSONObject jsonobject)
        throws JSONException
    {
        n = jsonobject.optInt("code", -1);
        o = jsonobject.optString("status", "none");
        if (n == 0)
        {
            a(jsonobject);
        }
        return n;
    }

    public final int n()
    {
        return n;
    }

    public final String o()
    {
        return o;
    }
}
