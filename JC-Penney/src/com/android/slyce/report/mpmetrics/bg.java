// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;


// Referenced classes of package com.android.slyce.report.mpmetrics:
//            bh, bi, bj, be

public class bg extends Enum
{

    public static final bg a;
    public static final bg b;
    public static final bg c;
    private static final bg d[];

    private bg(String s, int i)
    {
        super(s, i);
    }

    bg(String s, int i, be be)
    {
        this(s, i);
    }

    public static bg valueOf(String s)
    {
        return (bg)Enum.valueOf(com/android/slyce/report/mpmetrics/bg, s);
    }

    public static bg[] values()
    {
        return (bg[])d.clone();
    }

    static 
    {
        a = new bh("UNKNOWN", 0);
        b = new bi("MULTIPLE_CHOICE", 1);
        c = new bj("TEXT", 2);
        d = (new bg[] {
            a, b, c
        });
    }
}
