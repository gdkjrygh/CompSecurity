// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;

public abstract class ds
{
    private static interface a
    {

        public abstract Boolean a();

        public abstract Long b();

        public abstract Integer c();

        public abstract String d();
    }


    static a a = null;
    private static final Object d = new Object();
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String b;
    protected final Object c;
    private Object g;

    protected ds(String s, Object obj)
    {
        g = null;
        b = s;
        c = obj;
    }

    public static int a()
    {
        return e;
    }

    public static ds a(String s, Integer integer)
    {
        return new ds(s, integer) {

            protected final Object c()
            {
                return ds.a.c();
            }

        };
    }

    public static ds a(String s, Long long1)
    {
        return new ds(s, long1) {

            protected final Object c()
            {
                return ds.a.b();
            }

        };
    }

    public static ds a(String s, String s1)
    {
        return new ds(s, s1) {

            protected final Object c()
            {
                return ds.a.d();
            }

        };
    }

    public static ds a(String s, boolean flag)
    {
        return new ds(s, Boolean.valueOf(flag)) {

            protected final Object c()
            {
                return ds.a.a();
            }

        };
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
