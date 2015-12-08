// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class bap
    implements bao
{

    private final bbu a;
    private final String b;
    private final long c;

    public bap(bbu bbu1, String s, long l)
    {
        a = bbu1;
        b = s;
        c = l;
    }

    public final int a()
    {
        return 0;
    }

    public final int a(long l)
    {
        bbu bbu1 = a;
        long l1 = c;
        return bej.a(bbu1.e, l - l1);
    }

    public final long a(int i)
    {
        return a.e[i] + c;
    }

    public final int b()
    {
        return a.a - 1;
    }

    public final long b(int i)
    {
        return a.d[i];
    }

    public final bax c(int i)
    {
        return new bax(b, null, a.c[i], a.b[i]);
    }

    public final boolean c()
    {
        return true;
    }
}
