// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;


public final class gw extends Enum
{

    public static final gw a;
    public static final gw b;
    public static final gw c;
    public static final gw d;
    public static final gw e;
    public static final gw f;
    private static final gw g[];

    private gw(String s, int i)
    {
        super(s, i);
    }

    public static gw valueOf(String s)
    {
        return (gw)Enum.valueOf(b/a/gw, s);
    }

    public static gw[] values()
    {
        return (gw[])g.clone();
    }

    static 
    {
        a = new gw("START", 0);
        b = new gw("END_SIMPLY", 1);
        c = new gw("END_REPLACED", 2);
        d = new gw("END_MOVED", 3);
        e = new gw("END_CLOBBERED_BY_PREV", 4);
        f = new gw("END_CLOBBERED_BY_NEXT", 5);
        g = (new gw[] {
            a, b, c, d, e, f
        });
    }
}
