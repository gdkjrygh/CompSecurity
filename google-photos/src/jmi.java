// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jmi
{

    private static final long b[] = {
        128L, 64L, 32L, 16L, 8L, 4L, 2L, 1L
    };
    int a;
    private final byte c[] = new byte[8];
    private int d;

    public jmi()
    {
    }

    public static int a(int i)
    {
        for (int j = 0; j < b.length; j++)
        {
            if ((b[j] & (long)i) != 0L)
            {
                return j + 1;
            }
        }

        return -1;
    }

    public static long a(byte abyte0[], int i, boolean flag)
    {
        long l1 = (long)abyte0[0] & 255L;
        long l = l1;
        if (flag)
        {
            l = l1 & ~b[i - 1];
        }
        for (int j = 1; j < i; j++)
        {
            l = l << 8 | (long)abyte0[j] & 255L;
        }

        return l;
    }

    public final long a(jke jke1, boolean flag, boolean flag1, int i)
    {
        if (d == 0)
        {
            if (!jke1.a(c, 0, 1, flag))
            {
                return -1L;
            }
            a = a(c[0] & 0xff);
            if (a == -1)
            {
                throw new IllegalStateException("No valid varint length mask found");
            }
            d = 1;
        }
        if (a > i)
        {
            d = 0;
            return -2L;
        } else
        {
            jke1.b(c, 1, a - 1);
            d = 0;
            return a(c, a, flag1);
        }
    }

    public final void a()
    {
        d = 0;
        a = 0;
    }

}
