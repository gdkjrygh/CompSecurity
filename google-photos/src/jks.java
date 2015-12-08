// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jks
    implements jku
{

    private final long b;
    private final int c;
    private final long d;

    public jks(long l, int i, long l1)
    {
        long l2 = -1L;
        super();
        b = l;
        c = i;
        if (l1 == -1L)
        {
            l = l2;
        } else
        {
            l = b(l1);
        }
        d = l;
    }

    public final long a(long l)
    {
        if (d == -1L)
        {
            return 0L;
        } else
        {
            return b + ((long)c * l) / 0x7a1200L;
        }
    }

    public final boolean a()
    {
        return d != -1L;
    }

    public final long b()
    {
        return d;
    }

    public final long b(long l)
    {
        return ((l - b) * 0xf4240L << 3) / (long)c;
    }
}
