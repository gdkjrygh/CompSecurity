// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class g extends Enum
{

    public static final g a;
    public static final g b;
    private static final g c[];

    private g(String s, int i)
    {
        super(s, i);
    }

    public static g a(String s)
    {
        return valueOf(s);
    }

    public static g valueOf(String s)
    {
        return (g)Enum.valueOf(p/bh/g, s);
    }

    public static g[] values()
    {
        return (g[])c.clone();
    }

    static 
    {
        a = new g("DD_ON", 0);
        b = new g("DD_OFF", 1);
        c = (new g[] {
            a, b
        });
    }
}
