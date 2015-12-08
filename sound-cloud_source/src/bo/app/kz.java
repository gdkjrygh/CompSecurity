// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;


public final class kz extends Enum
{

    public static final kz a;
    public static final kz b;
    public static final kz c;
    public static final kz d;
    private static final kz g[];
    public final boolean e;
    public final boolean f;

    private kz(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        e = flag;
        f = flag1;
    }

    public static kz valueOf(String s)
    {
        return (kz)Enum.valueOf(bo/app/kz, s);
    }

    public static kz[] values()
    {
        return (kz[])g.clone();
    }

    static 
    {
        a = new kz("STRICT", 0, false, true);
        b = new kz("LENIENT", 1, true, false);
        c = new kz("NON_EXTENSIBLE", 2, false, false);
        d = new kz("STRICT_ORDER", 3, true, true);
        g = (new kz[] {
            a, b, c, d
        });
    }
}
