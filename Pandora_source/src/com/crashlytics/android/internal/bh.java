// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


public final class bh extends Enum
{

    private static bh a;
    private static bh b;
    private static bh c;
    private static bh d;
    private static final bh f[];
    private final int e;

    private bh(String s, int i, int j)
    {
        super(s, i);
        e = j;
    }

    public static bh a(String s)
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

    public static bh valueOf(String s)
    {
        return (bh)Enum.valueOf(com/crashlytics/android/internal/bh, s);
    }

    public static bh[] values()
    {
        return (bh[])f.clone();
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
        a = new bh("DEVELOPER", 0, 1);
        b = new bh("USER_SIDELOAD", 1, 2);
        c = new bh("TEST_DISTRIBUTION", 2, 3);
        d = new bh("APP_STORE", 3, 4);
        f = (new bh[] {
            a, b, c, d
        });
    }
}
