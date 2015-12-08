// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zznq, zzns, zzlb, zznr

public final class zzno
{

    private final zznr a;
    private final zzlb b;
    private boolean c;
    private long d;
    private long e;
    private long f;
    private long g;
    private long h;
    private boolean i;
    private final Map j;
    private final List k;

    zzno(zzno zzno1)
    {
        a = zzno1.a;
        b = zzno1.b;
        d = zzno1.d;
        e = zzno1.e;
        f = zzno1.f;
        g = zzno1.g;
        h = zzno1.h;
        k = new ArrayList(zzno1.k);
        j = new HashMap(zzno1.j.size());
        java.util.Map.Entry entry;
        zznq zznq1;
        for (zzno1 = zzno1.j.entrySet().iterator(); zzno1.hasNext(); j.put(entry.getKey(), zznq1))
        {
            entry = (java.util.Map.Entry)zzno1.next();
            zznq1 = c((Class)entry.getKey());
            ((zznq)entry.getValue()).a(zznq1);
        }

    }

    zzno(zznr zznr1, zzlb zzlb1)
    {
        zzu.a(zznr1);
        zzu.a(zzlb1);
        a = zznr1;
        b = zzlb1;
        g = 0x1b7740L;
        h = 0xb43e9400L;
        j = new HashMap();
        k = new ArrayList();
    }

    private static zznq c(Class class1)
    {
        try
        {
            class1 = (zznq)class1.newInstance();
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

    public zzno a()
    {
        return new zzno(this);
    }

    public zznq a(Class class1)
    {
        return (zznq)j.get(class1);
    }

    public void a(long l)
    {
        e = l;
    }

    public void a(zznq zznq1)
    {
        zzu.a(zznq1);
        Class class1 = zznq1.getClass();
        if (class1.getSuperclass() != com/google/android/gms/internal/zznq)
        {
            throw new IllegalArgumentException();
        } else
        {
            zznq1.a(b(class1));
            return;
        }
    }

    public zznq b(Class class1)
    {
        zznq zznq2 = (zznq)j.get(class1);
        zznq zznq1 = zznq2;
        if (zznq2 == null)
        {
            zznq1 = c(class1);
            j.put(class1, zznq1);
        }
        return zznq1;
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

    zznr h()
    {
        return a;
    }

    zzns i()
    {
        return a.o();
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
