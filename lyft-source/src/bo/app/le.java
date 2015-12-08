// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class le extends Enum
{

    public static final le a;
    public static final le b;
    public static final le c;
    public static final le d;
    private static final le g[];
    public final boolean e;
    public final boolean f;

    private le(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        e = flag;
        f = flag1;
    }

    public static le valueOf(String s)
    {
        return (le)Enum.valueOf(bo/app/le, s);
    }

    public static le[] values()
    {
        return (le[])g.clone();
    }

    static 
    {
        a = new le("STRICT", 0, false, true);
        b = new le("LENIENT", 1, true, false);
        c = new le("NON_EXTENSIBLE", 2, false, false);
        d = new le("STRICT_ORDER", 3, true, true);
        g = (new le[] {
            a, b, c, d
        });
    }
}
