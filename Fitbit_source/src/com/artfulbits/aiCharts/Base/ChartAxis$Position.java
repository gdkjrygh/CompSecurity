// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.artfulbits.aiCharts.Base;


// Referenced classes of package com.artfulbits.aiCharts.Base:
//            ChartAxis

public static final class IsVertical extends Enum
{

    public static final f a;
    public static final f b;
    public static final f c;
    public static final f d;
    public static final f e;
    public static final f f;
    private static final f g[];
    protected final boolean IsOpposed;
    protected final boolean IsVertical;

    public static IsVertical valueOf(String s)
    {
        return (IsVertical)Enum.valueOf(com/artfulbits/aiCharts/Base/ChartAxis$Position, s);
    }

    public static IsVertical[] values()
    {
        return (IsVertical[])g.clone();
    }

    static 
    {
        a = new <init>("Left", 0, false, true);
        b = new <init>("Top", 1, false, false);
        c = new <init>("HorizontalCenter", 2, true, false);
        d = new <init>("VerticalCenter", 3, false, true);
        e = new <init>("Right", 4, true, true);
        f = new <init>("Bottom", 5, true, false);
        g = (new g[] {
            a, b, c, d, e, f
        });
    }

    private (String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        IsOpposed = flag;
        IsVertical = flag1;
    }
}
