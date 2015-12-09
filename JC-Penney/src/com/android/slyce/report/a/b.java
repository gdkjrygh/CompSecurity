// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.a;


public final class b extends Enum
{

    public static final b a;
    public static final b b;
    public static final b c;
    public static final b d;
    public static final b e;
    private static final b f[];

    private b(String s, int i)
    {
        super(s, i);
    }

    public static b valueOf(String s)
    {
        return (b)Enum.valueOf(com/android/slyce/report/a/b, s);
    }

    public static b[] values()
    {
        return (b[])f.clone();
    }

    static 
    {
        a = new b("NOT_YET_CONNECTED", 0);
        b = new b("CONNECTING", 1);
        c = new b("OPEN", 2);
        d = new b("CLOSING", 3);
        e = new b("CLOSED", 4);
        f = (new b[] {
            a, b, c, d, e
        });
    }
}
