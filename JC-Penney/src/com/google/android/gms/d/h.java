// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.os.Binder;

// Referenced classes of package com.google.android.gms.d:
//            l, k, j, m, 
//            i, n

public abstract class h
{

    private static final Object c = new Object();
    private static n d = null;
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String a;
    protected final Object b;
    private Object g;

    protected h(String s, Object obj)
    {
        g = null;
        a = s;
        b = obj;
    }

    public static int a()
    {
        return e;
    }

    public static h a(String s, Float float1)
    {
        return new l(s, float1);
    }

    public static h a(String s, Integer integer)
    {
        return new k(s, integer);
    }

    public static h a(String s, Long long1)
    {
        return new j(s, long1);
    }

    public static h a(String s, String s1)
    {
        return new m(s, s1);
    }

    public static h a(String s, boolean flag)
    {
        return new i(s, Boolean.valueOf(flag));
    }

    public static boolean b()
    {
        return d != null;
    }

    static n e()
    {
        return d;
    }

    protected abstract Object a(String s);

    public final Object c()
    {
        if (g != null)
        {
            return g;
        } else
        {
            return a(a);
        }
    }

    public final Object d()
    {
        long l1 = Binder.clearCallingIdentity();
        Object obj = c();
        Binder.restoreCallingIdentity(l1);
        return obj;
        Exception exception;
        exception;
        Binder.restoreCallingIdentity(l1);
        throw exception;
    }

}
