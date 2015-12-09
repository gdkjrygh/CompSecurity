// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartAxisScale

public static final class Field extends Enum
{

    public static final h a;
    public static final h b;
    public static final h c;
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    private static final h i[];
    protected final int Field;

    public static Field valueOf(String s)
    {
        return (Field)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxisScale$IntervalType, s);
    }

    public static Field[] values()
    {
        return (Field[])i.clone();
    }

    static 
    {
        a = new <init>("Double", 0, -1);
        b = new <init>("Milliseconds", 1, 14);
        c = new <init>("Seconds", 2, 13);
        d = new <init>("Minutes", 3, 12);
        e = new <init>("Hours", 4, 10);
        f = new <init>("Days", 5, 5);
        g = new <init>("Month", 6, 2);
        h = new <init>("Years", 7, 1);
        i = (new i[] {
            a, b, c, d, e, f, g, h
        });
    }

    private (String s, int j, int k)
    {
        super(s, j);
        Field = k;
    }
}
