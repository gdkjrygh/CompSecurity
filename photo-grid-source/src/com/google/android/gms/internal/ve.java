// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;

// Referenced classes of package com.google.android.gms.internal:
//            vi, vh, vg, vj, 
//            vf, vk

public abstract class ve
{

    private static final Object c = new Object();
    private static vk d = null;
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String a;
    protected final Object b;
    private Object g;

    protected ve(String s, Object obj)
    {
        g = null;
        a = s;
        b = obj;
    }

    public static int a()
    {
        return e;
    }

    public static ve a(String s, Float float1)
    {
        return new vi(s, float1);
    }

    public static ve a(String s, Integer integer)
    {
        return new vh(s, integer);
    }

    public static ve a(String s, Long long1)
    {
        return new vg(s, long1);
    }

    public static ve a(String s, String s1)
    {
        return new vj(s, s1);
    }

    public static ve a(String s, boolean flag)
    {
        return new vf(s, Boolean.valueOf(flag));
    }

    public static boolean b()
    {
        return d != null;
    }

    static vk f()
    {
        return d;
    }

    protected abstract Object c();

    public final Object d()
    {
        if (g != null)
        {
            return g;
        } else
        {
            return c();
        }
    }

    public final Object e()
    {
        long l = Binder.clearCallingIdentity();
        Object obj = d();
        Binder.restoreCallingIdentity(l);
        return obj;
        Exception exception;
        exception;
        Binder.restoreCallingIdentity(l);
        throw exception;
    }

}
