// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.exoplayer.extractor;

import com.google.android.exoplayer.SampleHolder;
import com.google.android.exoplayer.util.Assertions;

final class a
{

    private int a;
    private long b[];
    private int c[];
    private int d[];
    private long e[];
    private byte f[][];
    private int g;
    private int h;
    private int i;
    private int j;

    public final long a(int k)
    {
        k = b() - k;
        boolean flag;
        if (k >= 0 && k <= g)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Assertions.a(flag);
        if (k == 0)
        {
            if (h == 0)
            {
                return 0L;
            }
            long l;
            if (j == 0)
            {
                k = a;
            } else
            {
                k = j;
            }
            k--;
            l = b[k];
            return (long)c[k] + l;
        } else
        {
            g = g - k;
            j = ((j + a) - k) % a;
            return b[j];
        }
    }

    public final long a(long l)
    {
        long l2 = -1L;
        this;
        JVM INSTR monitorenter ;
        long l1 = l2;
        if (g == 0) goto _L2; else goto _L1
_L1:
        l1 = e[i];
        if (l >= l1) goto _L4; else goto _L3
_L3:
        l1 = l2;
_L2:
        this;
        JVM INSTR monitorexit ;
        return l1;
_L4:
        if (j != 0) goto _L6; else goto _L5
_L5:
        int k = a;
_L10:
        l1 = l2;
        if (l > e[k - 1])
        {
            continue; /* Loop/switch isn't completed */
        }
        k = 0;
        int i1 = i;
        int j1 = -1;
_L8:
        if (i1 == j || e[i1] > l)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((d[i1] & 1) != 0)
        {
            j1 = k;
        }
        i1 = (i1 + 1) % a;
        k++;
        if (true) goto _L8; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        k = j;
        if (true) goto _L10; else goto _L9
_L9:
        l1 = l2;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        g = g - j1;
        i = (i + j1) % a;
        h = h + j1;
        l1 = b[i];
        if (true) goto _L2; else goto _L11
_L11:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a()
    {
        h = 0;
        i = 0;
        j = 0;
        g = 0;
    }

    public final void a(long l, int k, long l1, int i1, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        e[j] = l;
        b[j] = l1;
        c[j] = i1;
        d[j] = k;
        f[j] = abyte0;
        g = g + 1;
        if (g != a) goto _L2; else goto _L1
_L1:
        k = a + 1000;
        abyte0 = new long[k];
        long al[] = new long[k];
        int ai[] = new int[k];
        int ai1[] = new int[k];
        byte abyte1[][] = new byte[k][];
        i1 = a - i;
        System.arraycopy(b, i, abyte0, 0, i1);
        System.arraycopy(e, i, al, 0, i1);
        System.arraycopy(d, i, ai, 0, i1);
        System.arraycopy(c, i, ai1, 0, i1);
        System.arraycopy(f, i, abyte1, 0, i1);
        int j1 = i;
        System.arraycopy(b, 0, abyte0, i1, j1);
        System.arraycopy(e, 0, al, i1, j1);
        System.arraycopy(d, 0, ai, i1, j1);
        System.arraycopy(c, 0, ai1, i1, j1);
        System.arraycopy(f, 0, abyte1, i1, j1);
        b = abyte0;
        e = al;
        d = ai;
        c = ai1;
        f = abyte1;
        i = 0;
        j = a;
        g = a;
        a = k;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        j = j + 1;
        if (j == a)
        {
            j = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    public final boolean a(SampleHolder sampleholder, asHolder asholder)
    {
        this;
        JVM INSTR monitorenter ;
        int k = g;
        if (k != 0) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        sampleholder.e = e[i];
        sampleholder.c = c[i];
        sampleholder.d = d[i];
        asholder.a = b[i];
        asholder.b = f[i];
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        sampleholder;
        throw sampleholder;
    }

    public final int b()
    {
        return h + g;
    }

    public final int c()
    {
        return h;
    }

    public final long d()
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        g = g - 1;
        k = i;
        i = k + 1;
        h = h + 1;
        if (i == a)
        {
            i = 0;
        }
        if (g <= 0) goto _L2; else goto _L1
_L1:
        long l = b[i];
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        long l1;
        l = c[k];
        l1 = b[k];
        l = l1 + l;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public asHolder()
    {
        a = 1000;
        b = new long[a];
        e = new long[a];
        d = new int[a];
        c = new int[a];
        f = new byte[a][];
    }
}
