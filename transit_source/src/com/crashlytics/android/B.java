// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;


final class B extends Enum
{

    private static B a;
    private static B b;
    private static B c;
    private static B d;
    private static final B f[];
    private final int e;

    private B(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static B a(String s)
    {
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            return d;
        } else
        {
            return a;
        }
    }

    public static B valueOf(String s)
    {
        return (B)Enum.valueOf(com/crashlytics/android/B, s);
    }

    public static B[] values()
    {
        return (B[])f.clone();
    }

    public final int a()
    {
        return e;
    }

    public final String toString()
    {
        return Integer.toString(e);
    }

    static 
    {
        a = new B("DEVELOPER", 0, 1);
        b = new B("USER_SIDELOAD", 1, 2);
        c = new B("TEST_DISTRIBUTION", 2, 3);
        d = new B("APP_STORE", 3, 4);
        f = (new B[] {
            a, b, c, d
        });
    }
}
