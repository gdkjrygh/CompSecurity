// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartLegend

public static final class _cls9 extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];

    public static _cls9 valueOf(String s)
    {
        return (_cls9)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartLegend$LayoutMode, s);
    }

    public static _cls9[] values()
    {
        return (_cls9[])e.clone();
    }

    static 
    {
        a = new <init>("Vertical", 0);
        b = new <init>("Horizontal", 1);
        c = new <init>("Auto", 2);
        d = new <init>("Flow", 3);
        e = (new e[] {
            a, b, c, d
        });
    }

    private _cls9(String s, int i)
    {
        super(s, i);
    }
}
