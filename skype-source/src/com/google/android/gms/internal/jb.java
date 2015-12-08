// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.y;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            jc, jd, je, io

public final class jb
{

    private final jd a;
    private final io b;
    private boolean c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private final Map j;
    private final List k;

    private jb(jb jb1)
    {
        a = jb1.a;
        b = jb1.b;
        d = jb1.d;
        e = jb1.e;
        f = jb1.f;
        g = jb1.g;
        h = jb1.h;
        k = new ArrayList(jb1.k);
        j = new HashMap(jb1.j.size());
        java.util.Map.Entry entry;
        jc jc1;
        for (jb1 = jb1.j.entrySet().iterator(); jb1.hasNext(); j.put(entry.getKey(), jc1))
        {
            entry = (java.util.Map.Entry)jb1.next();
            jc1 = c((Class)entry.getKey());
            ((jc)entry.getValue()).a(jc1);
        }

    }

    jb(jd jd1, io io1)
    {
        y.a(jd1);
        y.a(io1);
        a = jd1;
        b = io1;
        g = 0x1b7740L;
        h = 0xb43e9400L;
        j = new HashMap();
        k = new ArrayList();
    }

    private static jc c(Class class1)
    {
        try
        {
            class1 = (jc)class1.newInstance();
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

    public final jb a()
    {
        return new jb(this);
    }

    public final jc a(Class class1)
    {
        return (jc)j.get(class1);
    }

    public final void a(long l)
    {
        e = l;
    }

    public final void a(jc jc1)
    {
        y.a(jc1);
        Class class1 = jc1.getClass();
        if (class1.getSuperclass() != com/google/android/gms/internal/jc)
        {
            throw new IllegalArgumentException();
        } else
        {
            jc1.a(b(class1));
            return;
        }
    }

    public final jc b(Class class1)
    {
        jc jc2 = (jc)j.get(class1);
        jc jc1 = jc2;
        if (jc2 == null)
        {
            jc1 = c(class1);
            j.put(class1, jc1);
        }
        return jc1;
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
        a.n().a(this);
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

    final jd h()
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
