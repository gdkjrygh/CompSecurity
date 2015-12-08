// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class eyl
    implements eyq
{

    private final dtz a;

    eyl(dtz dtz1)
    {
        a = dtz1;
    }

    public final int a()
    {
        return a.c;
    }

    public final int a(long l)
    {
        dtz dtz1 = a;
        int i = (int)l;
        return dtx.a(dtz1.a, dtz1.c, i);
    }

    public final long a(int i)
    {
        return a.b[i];
    }

    public final long a(long l, long l1)
    {
        dtz dtz1 = a;
        int i = (int)l;
        i = dtx.a(dtz1.a, dtz1.c, i);
        if (i < 0)
        {
            return 0x8000000000000000L;
        } else
        {
            return dtz1.b[i];
        }
    }

    public final long b(int i)
    {
        return (long)a.a[i];
    }
}
