// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;


public final class jx extends Enum
{

    public static final jx a;
    public static final jx b;
    public static final jx c;
    public static final jx d;
    private static final jx g[];
    public final boolean e;
    public final boolean f;

    private jx(String s, int i, boolean flag, boolean flag1)
    {
        super(s, i);
        e = flag;
        f = flag1;
    }

    public static jx valueOf(String s)
    {
        return (jx)Enum.valueOf(a/a/jx, s);
    }

    public static jx[] values()
    {
        return (jx[])g.clone();
    }

    static 
    {
        a = new jx("STRICT", 0, false, true);
        b = new jx("LENIENT", 1, true, false);
        c = new jx("NON_EXTENSIBLE", 2, false, false);
        d = new jx("STRICT_ORDER", 3, true, true);
        g = (new jx[] {
            a, b, c, d
        });
    }
}
