// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import com.google.android.gms.common.internal.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.d:
//            ab, ad, q, ac

public final class z
{

    private final ac a;
    private final q b;
    private boolean c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private final Map j;
    private final List k;

    z(ac ac1, q q1)
    {
        u.a(ac1);
        u.a(q1);
        a = ac1;
        b = q1;
        g = 0x1b7740L;
        h = 0xb43e9400L;
        j = new HashMap();
        k = new ArrayList();
    }

    z(z z1)
    {
        a = z1.a;
        b = z1.b;
        d = z1.d;
        e = z1.e;
        f = z1.f;
        g = z1.g;
        h = z1.h;
        k = new ArrayList(z1.k);
        j = new HashMap(z1.j.size());
        java.util.Map.Entry entry;
        ab ab1;
        for (z1 = z1.j.entrySet().iterator(); z1.hasNext(); j.put(entry.getKey(), ab1))
        {
            entry = (java.util.Map.Entry)z1.next();
            ab1 = c((Class)entry.getKey());
            ((ab)entry.getValue()).a(ab1);
        }

    }

    private static ab c(Class class1)
    {
        try
        {
            class1 = (ab)class1.newInstance();
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

    public ab a(Class class1)
    {
        return (ab)j.get(class1);
    }

    public z a()
    {
        return new z(this);
    }

    public void a(long l)
    {
        e = l;
    }

    public void a(ab ab1)
    {
        u.a(ab1);
        Class class1 = ab1.getClass();
        if (class1.getSuperclass() != com/google/android/gms/d/ab)
        {
            throw new IllegalArgumentException();
        } else
        {
            ab1.a(b(class1));
            return;
        }
    }

    public ab b(Class class1)
    {
        ab ab2 = (ab)j.get(class1);
        ab ab1 = ab2;
        if (ab2 == null)
        {
            ab1 = c(class1);
            j.put(class1, ab1);
        }
        return ab1;
    }

    public Collection b()
    {
        return j.values();
    }

    public List c()
    {
        return k;
    }

    public long d()
    {
        return d;
    }

    public void e()
    {
        i().a(this);
    }

    public boolean f()
    {
        return c;
    }

    void g()
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

    ac h()
    {
        return a;
    }

    ad i()
    {
        return a.m();
    }

    boolean j()
    {
        return i;
    }

    void k()
    {
        i = true;
    }
}
