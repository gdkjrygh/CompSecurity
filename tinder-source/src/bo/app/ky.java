// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class ky extends Enum
{

    public static final ky a;
    public static final ky b;
    public static final ky c;
    public static final ky d;
    private static final ky g[];
    public final boolean e;
    public final boolean f;

    private ky(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        e = flag;
        f = flag1;
    }

    public static ky valueOf(String s)
    {
        return (ky)Enum.valueOf(bo/app/ky, s);
    }

    public static ky[] values()
    {
        return (ky[])g.clone();
    }

    static 
    {
        a = new ky("STRICT", 0, false, true);
        b = new ky("LENIENT", 1, true, false);
        c = new ky("NON_EXTENSIBLE", 2, false, false);
        d = new ky("STRICT_ORDER", 3, true, true);
        g = (new ky[] {
            a, b, c, d
        });
    }
}
