// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class jlx
{

    long a;
    private final long b = 0L;
    private long c;

    public jlx(long l)
    {
        a = 0x8000000000000000L;
    }

    public final long a(long l)
    {
        if (a != 0x8000000000000000L)
        {
            long l3 = (a + 0x100000000L) / 0x200000000L;
            long l1 = (l3 - 1L) * 0x200000000L + l;
            l = l3 * 0x200000000L + l;
            if (Math.abs(l1 - a) < Math.abs(l - a))
            {
                l = l1;
            }
        }
        long l2 = (0xf4240L * l) / 0x15f90L;
        if (a == 0x8000000000000000L)
        {
            c = b - l2;
        }
        a = l;
        return c + l2;
    }
}
