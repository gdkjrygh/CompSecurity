// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;


// Referenced classes of package com.android.slyce.report.mpmetrics:
//            y, z, aa, w

public class x extends Enum
{

    public static final x a;
    public static final x b;
    public static final x c;
    private static final x d[];

    private x(String s, int i)
    {
        super(s, i);
    }

    x(String s, int i, w w)
    {
        this(s, i);
    }

    public static x valueOf(String s)
    {
        return (x)Enum.valueOf(com/android/slyce/report/mpmetrics/x, s);
    }

    public static x[] values()
    {
        return (x[])d.clone();
    }

    static 
    {
        a = new y("UNKNOWN", 0);
        b = new z("MINI", 1);
        c = new aa("TAKEOVER", 2);
        d = (new x[] {
            a, b, c
        });
    }
}
