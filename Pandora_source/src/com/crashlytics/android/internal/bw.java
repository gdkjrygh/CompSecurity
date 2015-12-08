// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.internal;


public final class bw extends Enum
{

    public static final bw a;
    public static final bw b;
    public static final bw c;
    public static final bw d;
    private static final bw e[];

    private bw(String s, int i)
    {
        super(s, i);
    }

    public static bw valueOf(String s)
    {
        return (bw)Enum.valueOf(com/crashlytics/android/internal/bw, s);
    }

    public static bw[] values()
    {
        return (bw[])e.clone();
    }

    static 
    {
        a = new bw("GET", 0);
        b = new bw("POST", 1);
        c = new bw("PUT", 2);
        d = new bw("DELETE", 3);
        e = (new bw[] {
            a, b, c, d
        });
    }
}
