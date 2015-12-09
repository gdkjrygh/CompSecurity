// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartLayoutElement

public static final class vertical extends Enum
{

    public static final d a;
    public static final d b;
    public static final d c;
    public static final d d;
    private static final d e[];
    protected final boolean vertical;

    public static vertical valueOf(String s)
    {
        return (vertical)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartLayoutElement$Dock, s);
    }

    public static vertical[] values()
    {
        return (vertical[])e.clone();
    }

    static 
    {
        a = new <init>("Left", 0, true);
        b = new <init>("Right", 1, true);
        c = new <init>("Top", 2, false);
        d = new <init>("Bottom", 3, false);
        e = (new e[] {
            a, b, c, d
        });
    }

    private (String s, int i, boolean flag)
    {
        super(s, i);
        vertical = flag;
    }
}
