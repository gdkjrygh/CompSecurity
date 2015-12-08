// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.b;

import android.os.Binder;

// Referenced classes of package com.google.android.gms.b:
//            v, u, t, w, 
//            s

public abstract class r
{
    private static interface a
    {

        public abstract Boolean a();

        public abstract Long b();

        public abstract Integer c();

        public abstract Float d();

        public abstract String e();
    }


    static a a = null;
    private static final Object d = new Object();
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String b;
    protected final Object c;
    private Object g;

    protected r(String s1, Object obj)
    {
        g = null;
        b = s1;
        c = obj;
    }

    public static int a()
    {
        return e;
    }

    public static r a(String s1, Float float1)
    {
        return new v(s1, float1);
    }

    public static r a(String s1, Integer integer)
    {
        return new u(s1, integer);
    }

    public static r a(String s1, Long long1)
    {
        return new t(s1, long1);
    }

    public static r a(String s1, String s2)
    {
        return new w(s1, s2);
    }

    public static r a(String s1, boolean flag)
    {
        return new s(s1, Boolean.valueOf(flag));
    }

    public static boolean b()
    {
        return a != null;
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
