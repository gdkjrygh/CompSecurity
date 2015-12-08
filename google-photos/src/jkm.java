// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class jkm
{

    int a;
    int b;
    int c;
    int d;
    private int e;
    private long f[];
    private int g[];
    private int h[];
    private long i[];
    private byte j[][];

    public jkm()
    {
        e = 1000;
        f = new long[e];
        i = new long[e];
        h = new int[e];
        g = new int[e];
        j = new byte[e][];
    }

    public final long a()
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        a = a - 1;
        k = c;
        c = k + 1;
        b = b + 1;
        if (c == e)
        {
            c = 0;
        }
        if (a <= 0) goto _L2; else goto _L1
_L1:
        long l = f[c];
_L4:
        this;
        JVM INSTR monitorexit ;
        return l;
_L2:
        long l1;
        l = g[k];
        l1 = f[k];
        l = l1 + l;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final long a(long l)
    {
        long l2 = -1L;
        this;
        JVM INSTR monitorenter ;
        long l1 = l2;
        if (a == 0) goto _L2; else goto _L1
_L1:
        l1 = i[c];
        if (l >= l1) goto _L4; else goto _L3
_L3:
        l1 = l2;
_L2:
        this;
        JVM INSTR monitorexit ;
        return l1;
_L4:
        if (d != 0) goto _L6; else goto _L5
_L5:
        int k = e;
_L10:
        l1 = l2;
        if (l > i[k - 1])
        {
            continue; /* Loop/switch isn't completed */
        }
        k = 0;
        int i1 = c;
        int j1 = -1;
_L8:
        if (i1 == d || i[i1] > l)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((h[i1] & 1) != 0)
        {
            j1 = k;
        }
        i1 = (i1 + 1) % e;
        k++;
        if (true) goto _L8; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        k = d;
        if (true) goto _L10; else goto _L9
_L9:
        l1 = l2;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        a = a - j1;
        c = (c + j1) % e;
        b = b + j1;
        l1 = f[c];
        if (true) goto _L2; else goto _L11
_L11:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(long l, int k, long l1, int i1, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        i[d] = l;
        f[d] = l1;
        g[d] = i1;
        h[d] = k;
        j[d] = abyte0;
        a = a + 1;
        if (a != e) goto _L2; else goto _L1
_L1:
        k = e + 1000;
        abyte0 = new long[k];
        long al[] = new long[k];
        int ai[] = new int[k];
        int ai1[] = new int[k];
        byte abyte1[][] = new byte[k][];
        i1 = e - c;
        System.arraycopy(f, c, abyte0, 0, i1);
        System.arraycopy(i, c, al, 0, i1);
        System.arraycopy(h, c, ai, 0, i1);
        System.arraycopy(g, c, ai1, 0, i1);
        System.arraycopy(j, c, abyte1, 0, i1);
        int j1 = c;
        System.arraycopy(f, 0, abyte0, i1, j1);
        System.arraycopy(i, 0, al, i1, j1);
        System.arraycopy(h, 0, ai, i1, j1);
        System.arraycopy(g, 0, ai1, i1, j1);
        System.arraycopy(j, 0, abyte1, i1, j1);
        f = abyte0;
        i = al;
        h = ai;
        g = ai1;
        j = abyte1;
        c = 0;
        d = e;
        a = e;
        e = k;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        d = d + 1;
        if (d == e)
        {
            d = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    public final boolean a(jjk jjk1, jkn jkn1)
    {
        this;
        JVM INSTR monitorenter ;
        int k = a;
        if (k != 0) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        jjk1.e = i[c];
        jjk1.c = g[c];
        jjk1.d = h[c];
        jkn1.a = f[c];
        jkn1.b = j[c];
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        jjk1;
        throw jjk1;
    }
}
