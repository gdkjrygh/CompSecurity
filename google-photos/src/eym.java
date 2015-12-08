// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class eym
    implements eyq
{

    private final dty a;

    eym(dty dty1)
    {
        a = dty1;
    }

    public final int a()
    {
        return a.c;
    }

    public final int a(long l)
    {
        dty dty1 = a;
        return dtx.a(dty1.a, dty1.c, l);
    }

    public final long a(int i)
    {
        return (long)a.b[i];
    }

    public final long a(long l, long l1)
    {
        return (long)a.a(l, 0);
    }

    public final long b(int i)
    {
        return a.a[i];
    }
}
