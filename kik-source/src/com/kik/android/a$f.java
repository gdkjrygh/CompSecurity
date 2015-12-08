// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.android;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.kik.android:
//            a

public abstract class <init>
{

    private String a;
    protected JSONObject b;
    protected boolean c;
    final a d;
    private String e;

    public final <init> a(String s)
    {
        try
        {
            int i = b.optInt(s, 0);
            b.put(s, i + 1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final put a(String s, double d1)
    {
        try
        {
            b.put(s, d1);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final put a(String s, long l)
    {
        try
        {
            b.put(s, l);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final put a(String s, Object obj)
    {
        try
        {
            b.put(s, obj);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final put a(String s, boolean flag)
    {
        try
        {
            b.put(s, flag);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final put a(String s, Object aobj[])
    {
        JSONArray jsonarray = new JSONArray();
        int j = aobj.length;
        for (int i = 0; i < j; i++)
        {
            jsonarray.put(aobj[i]);
        }

        try
        {
            b.put(s, jsonarray);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    protected final void a(JSONObject jsonobject)
    {
        b = jsonobject;
    }

    public final b b(String s)
    {
        try
        {
            if (!b.has(s))
            {
                b.put(s, false);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final put b(String s, long l)
    {
        try
        {
            if (!b.has(s))
            {
                b.put(s, l);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public final put b(String s, Object obj)
    {
        try
        {
            if (!b.has(s))
            {
                b.put(s, obj);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return this;
        }
        return this;
    }

    public abstract void b();

    public final String d()
    {
        return a;
    }

    public final String e()
    {
        return e;
    }

    public final JSONObject f()
    {
        return b;
    }

    public final b g()
    {
        c = true;
        return this;
    }

    public String toString()
    {
        return (new StringBuilder()).append(a).append(" -> ").append(b.toString()).toString();
    }

    protected on(a a1, String s, String s1)
    {
        d = a1;
        super();
        a = s;
        e = s1;
        b = new JSONObject();
    }
}
