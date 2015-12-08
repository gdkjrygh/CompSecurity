// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crittercism.app;

import java.util.LinkedList;
import java.util.List;

public class CrittercismConfig
{

    protected String a;
    private String b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    private boolean g;
    private String h;
    private String i;
    private List j;
    private List k;

    public CrittercismConfig()
    {
        b = null;
        c = false;
        d = false;
        e = true;
        f = false;
        g = k();
        a = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
        k = new LinkedList();
    }

    public CrittercismConfig(CrittercismConfig crittercismconfig)
    {
        b = null;
        c = false;
        d = false;
        e = true;
        f = false;
        g = k();
        a = "com.crittercism/dumps";
        h = "Developer Reply";
        i = null;
        j = new LinkedList();
        k = new LinkedList();
        b = crittercismconfig.b;
        c = crittercismconfig.c;
        d = crittercismconfig.d;
        e = crittercismconfig.e;
        f = crittercismconfig.f;
        g = crittercismconfig.g;
        a = crittercismconfig.a;
        h = crittercismconfig.h;
        a(crittercismconfig.j);
        b(crittercismconfig.k);
        i = crittercismconfig.i;
    }

    private static int a(String s)
    {
        int l = 0;
        if (s != null)
        {
            l = s.hashCode();
        }
        return l;
    }

    protected static boolean a(String s, String s1)
    {
        if (s == null)
        {
            return s1 == null;
        } else
        {
            return s.equals(s1);
        }
    }

    private static final boolean k()
    {
        return android.os.Build.VERSION.SDK_INT >= 10 && android.os.Build.VERSION.SDK_INT <= 21;
    }

    public List a()
    {
        return new LinkedList(j);
    }

    public void a(List list)
    {
        j.clear();
        if (list != null)
        {
            j.addAll(list);
        }
    }

    public final void a(boolean flag)
    {
        f = flag;
    }

    public List b()
    {
        return new LinkedList(k);
    }

    public void b(List list)
    {
        k.clear();
        if (list != null)
        {
            k.addAll(list);
        }
    }

    public final String c()
    {
        return b;
    }

    public final boolean d()
    {
        return c;
    }

    public final boolean e()
    {
        return d;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof CrittercismConfig)
        {
            if (c == ((CrittercismConfig) (obj = (CrittercismConfig)obj)).c && f == ((CrittercismConfig) (obj)).f && f() == ((CrittercismConfig) (obj)).f() && i() == ((CrittercismConfig) (obj)).i() && e() == ((CrittercismConfig) (obj)).e() && a(b, ((CrittercismConfig) (obj)).b) && a(h, ((CrittercismConfig) (obj)).h) && a(a, ((CrittercismConfig) (obj)).a) && j.equals(((CrittercismConfig) (obj)).j) && k.equals(((CrittercismConfig) (obj)).k) && a(i, ((CrittercismConfig) (obj)).i))
            {
                return true;
            }
        }
        return false;
    }

    public final boolean f()
    {
        return e;
    }

    public final boolean g()
    {
        return f;
    }

    public final boolean h()
    {
        return i();
    }

    public int hashCode()
    {
        int l1 = 1;
        int i2 = a(b);
        int j2 = a(h);
        int k2 = a(a);
        int l2 = a(i);
        int i3 = j.hashCode();
        int j3 = k.hashCode();
        int l;
        int i1;
        int j1;
        int k1;
        if (c)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        if (f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (f())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (i())
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (!e())
        {
            l1 = 0;
        }
        return Integer.valueOf((k1 + (j1 + (i1 + (l + 0 << 1) << 1) << 1) << 1) + l1).hashCode() + (j3 + (((((i2 + 0) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31) * 31;
    }

    public final boolean i()
    {
        return g;
    }

    public List j()
    {
        return a();
    }
}
