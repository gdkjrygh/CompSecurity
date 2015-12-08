// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ftl
    implements fsq
{

    private final nud a = new ntz(this);
    private final aen b;
    private final int c;
    private final int d;
    private final int e;

    public ftl(aen aen1, int i, int j, int k)
    {
        c = i;
        d = j;
        e = k;
        b = aen1;
        aen1.a(new ftm(this));
    }

    static nud a(ftl ftl1)
    {
        return ftl1.a;
    }

    public final int a(int i)
    {
        i /= e;
        int j = c;
        return Math.max(i - 1, 0) * d + j * i;
    }

    public final nud a()
    {
        return a;
    }

    public final int b()
    {
        int i = b.a() / e;
        int j = c;
        return Math.max(i - 1, 0) * d + j * i;
    }

    public final int b(int i)
    {
        return (i / (c + d)) * e;
    }
}
