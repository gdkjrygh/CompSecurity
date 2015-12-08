// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.a;

import bo.app.bx;
import bo.app.ct;
import bo.app.ec;
import bo.app.ed;
import bo.app.eo;
import bo.app.eq;
import com.appboy.b.b;
import com.appboy.d.e;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Observable;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

public class c extends Observable
    implements e
{

    private static final String a = String.format("%s.%s", new Object[] {
        "Appboy", com/appboy/d/a/c.getName()
    });
    private final bx b;
    private final ec c;
    protected final JSONObject g;
    protected final Map h;
    protected final String i;
    protected boolean j;
    protected boolean k;
    protected final long l;
    protected final long m;
    protected final long n;
    protected final EnumSet o;

    public c(JSONObject jsonobject, bx bx1, ec ec1)
    {
        g = jsonobject;
        h = eo.a(jsonobject.optJSONObject("extras"), new HashMap());
        b = bx1;
        c = ec1;
        i = jsonobject.getString("id");
        j = jsonobject.getBoolean("viewed");
        k = j;
        l = jsonobject.getLong("created");
        m = jsonobject.getLong("updated");
        n = jsonobject.optLong("expires_at", -1L);
        jsonobject = jsonobject.optJSONArray("categories");
        if (jsonobject == null || jsonobject.length() == 0)
        {
            o = EnumSet.of(b.e);
        } else
        {
            o = EnumSet.noneOf(com/appboy/b/b);
            int i1 = 0;
            while (i1 < jsonobject.length()) 
            {
                bx1 = com.appboy.b.b.a(jsonobject.getString(i1));
                if (bx1 != null)
                {
                    o.add(bx1);
                }
                i1++;
            }
        }
    }

    private boolean i()
    {
        return !eq.c(i);
    }

    public final boolean a()
    {
        if (b == null || c == null || !i())
        {
            break MISSING_BLOCK_LABEL_52;
        }
        b.a(ct.c(i));
        c.a(i);
        return true;
        Exception exception;
        exception;
        return false;
    }

    public final boolean a(c c1)
    {
        return i.equals(c1.i) && m == c1.m && b == c1.b;
    }

    public final boolean a(EnumSet enumset)
    {
        for (enumset = enumset.iterator(); enumset.hasNext();)
        {
            b b1 = (b)enumset.next();
            if (o.contains(b1))
            {
                return true;
            }
        }

        return false;
    }

    public final boolean b()
    {
        if (b == null || !i())
        {
            break MISSING_BLOCK_LABEL_34;
        }
        b.a(ct.d(i));
        return true;
        Exception exception;
        exception;
        return false;
    }

    public final String c()
    {
        return i;
    }

    public final boolean d()
    {
        return j;
    }

    public final void e()
    {
        j = true;
    }

    public final boolean f()
    {
        return k;
    }

    public volatile Object forJsonPut()
    {
        return g;
    }

    public final void g()
    {
        k = true;
        setChanged();
        notifyObservers();
        try
        {
            ec ec1 = c;
            String s = i;
            if (!ec1.d.contains(s))
            {
                ec1.d.add(s);
                ec1.a(ec1.d, ed.a);
            }
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public final long h()
    {
        return n;
    }

}
