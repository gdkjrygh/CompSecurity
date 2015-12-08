// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bh;


public final class r extends Enum
{

    public static final r a;
    public static final r b;
    public static final r c;
    public static final r d;
    public static final r e;
    public static final r f;
    private static final r g[];

    private r(String s, int i)
    {
        super(s, i);
    }

    public static r a(String s)
    {
        return valueOf(s);
    }

    public static r valueOf(String s)
    {
        return (r)Enum.valueOf(p/bh/r, s);
    }

    public static r[] values()
    {
        return (r[])g.clone();
    }

    static 
    {
        a = new r("HTTP", 0);
        b = new r("FILE_RESUME", 1);
        c = new r("AUTH_REQUEST", 2);
        d = new r("AUTH_CHALLENGE", 3);
        e = new r("AUTH_ACK", 4);
        f = new r("PROPRIETARY", 5);
        g = (new r[] {
            a, b, c, d, e, f
        });
    }
}
