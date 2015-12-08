// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Binder;

public abstract class kzu
{

    private static k c = null;
    private static int d = 0;
    public final String a;
    public final Object b;
    private Object e;

    protected kzu(String s, Object obj)
    {
        e = null;
        a = s;
        b = obj;
    }

    public static int a()
    {
        return 0;
    }

    public static kzu a(String s, Float float1)
    {
        return new kzy(s, float1);
    }

    public static kzu a(String s, Integer integer)
    {
        return new kzx(s, integer);
    }

    public static kzu a(String s, Long long1)
    {
        return new kzw(s, long1);
    }

    public static kzu a(String s, String s1)
    {
        return new kzz(s, s1);
    }

    public static kzu a(String s, boolean flag)
    {
        return new kzv(s, Boolean.valueOf(flag));
    }

    public static boolean b()
    {
        return false;
    }

    protected abstract Object a(String s);

    public final Object c()
    {
        return a(a);
    }

    public final Object d()
    {
        long l = Binder.clearCallingIdentity();
        Object obj = c();
        Binder.restoreCallingIdentity(l);
        return obj;
        Exception exception;
        exception;
        Binder.restoreCallingIdentity(l);
        throw exception;
    }

}
