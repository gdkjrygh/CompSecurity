// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jkv
    implements jku
{

    private final long b[];
    private final long c[];
    private final long d;
    private final long e;

    private jkv(long al[], long al1[], long l, long l1)
    {
        b = al;
        c = al1;
        d = l;
        e = l1;
    }

    public static jkv a(jni jni1, jnl jnl1, long l)
    {
        long al[];
        long al1[];
        int k;
        int j1;
        long l1;
        long l2;
        long l3;
        jnl1.c(10);
        int i = jnl1.h();
        if (i <= 0)
        {
            return null;
        }
        k = jni1.d;
        l1 = i;
        int i1;
        int k1;
        if (k >= 32000)
        {
            i = 1152;
        } else
        {
            i = 576;
        }
        l2 = jno.a(l1, (long)i * 0xf4240L, k);
        i1 = jnl1.e();
        j1 = jnl1.e();
        k1 = jnl1.e();
        al = new long[i1];
        al1 = new long[i1];
        l3 = l2 / (long)i1;
        l1 = 0L;
        k = 0;
_L7:
        if (k >= i1)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        k1;
        JVM INSTR tableswitch 1 4: default 144
    //                   1 154
    //                   2 198
    //                   3 207
    //                   4 216;
           goto _L1 _L2 _L3 _L4 _L5
_L5:
        break MISSING_BLOCK_LABEL_216;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        return null;
_L2:
        int j = jnl1.d();
_L8:
        l1 += l3;
        al[k] = l1;
        l += j * j1;
        al1[k] = l;
        k++;
        if (true) goto _L7; else goto _L6
_L6:
        j = jnl1.e();
          goto _L8
_L4:
        j = jnl1.f();
          goto _L8
        j = jnl1.j();
          goto _L8
        return new jkv(al, al1, (long)jni1.c + l, l2);
    }

    public final long a(long l)
    {
        int i = jno.a(b, l, false, false);
        long l1 = d;
        if (i == -1)
        {
            l = 0L;
        } else
        {
            l = c[i];
        }
        return l + l1;
    }

    public final boolean a()
    {
        return true;
    }

    public final long b()
    {
        return e;
    }

    public final long b(long l)
    {
        return b[jno.a(c, l, true, true)];
    }
}
