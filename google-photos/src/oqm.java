// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class oqm extends Enum
{

    public static final oqm a;
    public static final oqm b;
    public static final oqm c;
    public static final oqm d;
    public static final oqm e;
    private static final oqm g[];
    public long f;

    private oqm(String s, int i, long l)
    {
        super(s, i);
        f = l;
    }

    oqm(String s, int i, long l, byte byte0)
    {
        this(s, i, l);
    }

    public static oqm valueOf(String s)
    {
        return (oqm)Enum.valueOf(oqm, s);
    }

    public static oqm[] values()
    {
        return (oqm[])g.clone();
    }

    public final long a(long l)
    {
        return (f * l) / d.f;
    }

    public abstract long a(long l, oqm oqm1);

    public final long b(long l)
    {
        return (f * l) / c.f;
    }

    public final long c(long l)
    {
        return (f * l) / b.f;
    }

    public final long d(long l)
    {
        return (f * l) / a.f;
    }

    static 
    {
        a = new oqn("TERABYTES", 0, 0x10000000000L);
        b = new oqo("GIGABYTES", 1, 0x40000000L);
        c = new oqp("MEGABYTES", 2, 0x100000L);
        d = new oqq("KILOBYTES", 3, 1024L);
        e = new oqr("BYTES", 4, 1L);
        g = (new oqm[] {
            a, b, c, d, e
        });
    }
}
