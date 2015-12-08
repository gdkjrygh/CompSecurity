// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jkw
    implements jku
{

    private final long b[];
    private final long c;
    private final long d;
    private final long e;
    private final long f;

    private jkw(long l, long l1, long l2)
    {
        this(l, l1, l2, null, 0L);
    }

    private jkw(long l, long l1, long l2, long al[], 
            long l3)
    {
        b = al;
        c = l1;
        d = l3;
        e = l2;
        f = l;
    }

    private long a(int i)
    {
        return (e * (long)(i + 1)) / 100L;
    }

    public static jkw a(jni jni1, jnl jnl1, long l, long l1)
    {
        int i;
        int k;
        int i1;
        int j1;
label0:
        {
            i = jni1.g;
            k = jni1.d;
            l += jni1.c;
            i1 = jnl1.h();
            if ((i1 & 1) == 1)
            {
                j1 = jnl1.j();
                if (j1 != 0)
                {
                    break label0;
                }
            }
            return null;
        }
        long l2 = jno.a(j1, (long)i * 0xf4240L, k);
        if ((i1 & 6) != 6)
        {
            return new jkw(l1, l, l2);
        }
        long l3 = jnl1.j();
        jnl1.c(1);
        jni1 = new long[99];
        for (int j = 0; j < 99; j++)
        {
            jni1[j] = jnl1.d();
        }

        return new jkw(l1, l, l2, jni1, l3);
    }

    public final long a(long l)
    {
        float f2;
        float f3;
        f2 = 256F;
        f3 = 0.0F;
        if (a()) goto _L2; else goto _L1
_L1:
        l = c;
_L4:
        return l;
_L2:
        float f1;
        float f4;
        f4 = ((float)l * 100F) / (float)e;
        if (f4 > 0.0F)
        {
            break; /* Loop/switch isn't completed */
        }
        f1 = 0.0F;
_L5:
        long l1 = (long)((double)f1 * 0.00390625D * (double)d) + c;
        l = l1;
        if (f != -1L)
        {
            return Math.min(l1, f - 1L);
        }
        if (true) goto _L4; else goto _L3
_L3:
        f1 = f2;
        if (f4 < 100F)
        {
            int i = (int)f4;
            if (i == 0)
            {
                f1 = f3;
            } else
            {
                f1 = b[i - 1];
            }
            if (i < 99)
            {
                f2 = b[i];
            }
            f1 = (f2 - f1) * (f4 - (float)i) + f1;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final boolean a()
    {
        return b != null;
    }

    public final long b()
    {
        return e;
    }

    public final long b(long l)
    {
        long l1 = 0L;
        if (!a())
        {
            return 0L;
        }
        double d1 = (256D * (double)(l - c)) / (double)d;
        int i = jno.a(b, (long)d1, true, false);
        long l2 = a(i);
        if (i == 98)
        {
            return l2;
        }
        long l3;
        long l4;
        if (i == -1)
        {
            l = 0L;
        } else
        {
            l = b[i];
        }
        l3 = b[i + 1];
        l4 = a(i + 1);
        if (l3 == l)
        {
            l = l1;
        } else
        {
            l = (long)(((double)(l4 - l2) * (d1 - (double)l)) / (double)(l3 - l));
        }
        return l + l2;
    }
}
