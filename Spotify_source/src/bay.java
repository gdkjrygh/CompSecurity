// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public abstract class bay
{

    public final bad a;
    public final long b;
    public final long c;
    public final long d;
    public final bax e;
    private String f;
    private long g;

    bay(long l, long l1, bad bad1, bbb bbb1)
    {
        this(l, l1, null, bad1, bbb1);
    }

    private bay(long l, long l1, String s, bad bad1, bbb bbb1)
    {
        b = l;
        c = l1;
        f = null;
        g = -1L;
        a = bad1;
        e = bbb1.a(this);
        d = bej.a(bbb1.c, 0xf4240L, bbb1.b);
    }

    public final bax d()
    {
        return e;
    }

    public abstract bax e();

    public abstract bao f();

    public final String g()
    {
        return (new StringBuilder()).append(f).append(".").append(a.a).append(".").append(g).toString();
    }
}
