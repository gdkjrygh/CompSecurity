// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Binder;

public abstract class ib
{
    private static interface a
    {

        public abstract Boolean a();

        public abstract Long b();

        public abstract Integer c();

        public abstract Float d();

        public abstract String e();
    }


    private static final Object c = new Object();
    private static a d = null;
    private static int e = 0;
    private static String f = "com.google.android.providers.gsf.permission.READ_GSERVICES";
    protected final String a;
    protected final Object b;
    private Object g;

    protected ib(String s, Object obj)
    {
        g = null;
        a = s;
        b = obj;
    }

    public static int a()
    {
        return e;
    }

    public static ib a(String s, Float float1)
    {
        return new ib(s, float1) {

            protected final Object c()
            {
                return ib.f().d();
            }

        };
    }

    public static ib a(String s, Integer integer)
    {
        return new ib(s, integer) {

            protected final Object c()
            {
                return ib.f().c();
            }

        };
    }

    public static ib a(String s, Long long1)
    {
        return new ib(s, long1) {

            protected final Object c()
            {
                return ib.f().b();
            }

        };
    }

    public static ib a(String s, String s1)
    {
        return new ib(s, s1) {

            protected final Object c()
            {
                return ib.f().e();
            }

        };
    }

    public static ib a(String s, boolean flag)
    {
        return new ib(s, Boolean.valueOf(flag)) {

            protected final Object c()
            {
                return ib.f().a();
            }

        };
    }

    public static boolean b()
    {
        return d != null;
    }

    static a f()
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
