// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.c;

import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wg;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.c:
//            d, e, f

public final class c
{

    private final e a;
    private final wg b;
    private boolean c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private final Map j;
    private final List k;

    private c(c c1)
    {
        a = c1.a;
        b = c1.b;
        d = c1.d;
        e = c1.e;
        f = c1.f;
        g = c1.g;
        h = c1.h;
        k = new ArrayList(c1.k);
        j = new HashMap(c1.j.size());
        java.util.Map.Entry entry;
        d d1;
        for (c1 = c1.j.entrySet().iterator(); c1.hasNext(); j.put(entry.getKey(), d1))
        {
            entry = (java.util.Map.Entry)c1.next();
            d1 = c((Class)entry.getKey());
            ((d)entry.getValue()).a(d1);
        }

    }

    c(e e1, wg wg1)
    {
        bl.a(e1);
        bl.a(wg1);
        a = e1;
        b = wg1;
        g = 0x1b7740L;
        h = 0xb43e9400L;
        j = new HashMap();
        k = new ArrayList();
    }

    private static d c(Class class1)
    {
        try
        {
            class1 = (d)class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType doesn't have default constructor", class1);
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new IllegalArgumentException("dataType default constructor is not accessible", class1);
        }
        return class1;
    }

    public final c a()
    {
        return new c(this);
    }

    public final d a(Class class1)
    {
        return (d)j.get(class1);
    }

    public final void a(long l)
    {
        e = l;
    }

    public final void a(d d1)
    {
        bl.a(d1);
        Class class1 = d1.getClass();
        if (class1.getSuperclass() != com/google/android/gms/c/d)
        {
            throw new IllegalArgumentException();
        } else
        {
            d1.a(b(class1));
            return;
        }
    }

    public final d b(Class class1)
    {
        d d2 = (d)j.get(class1);
        d d1 = d2;
        if (d2 == null)
        {
            d1 = c(class1);
            j.put(class1, d1);
        }
        return d1;
    }

    public final Collection b()
    {
        return j.values();
    }

    public final List c()
    {
        return k;
    }

    public final long d()
    {
        return d;
    }

    public final void e()
    {
        a.k().a(this);
    }

    public final boolean f()
    {
        return c;
    }

    final void g()
    {
        f = b.b();
        if (e != 0L)
        {
            d = e;
        } else
        {
            d = b.a();
        }
        c = true;
    }

    final e h()
    {
        return a;
    }

    final boolean i()
    {
        return i;
    }

    final void j()
    {
        i = true;
    }
}
