// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bcb
{

    public int a;
    public long b[];
    public int c[];
    public int d;
    public int e;
    int f;
    public int g;
    private int h[];
    private long i[];
    private byte j[][];

    public bcb()
    {
        a = 1000;
        b = new long[a];
        i = new long[a];
        h = new int[a];
        c = new int[a];
        j = new byte[a][];
    }

    public final int a()
    {
        return e + d;
    }

    public final long a(long l)
    {
        long l2 = -1L;
        this;
        JVM INSTR monitorenter ;
        long l1 = l2;
        if (d == 0) goto _L2; else goto _L1
_L1:
        l1 = i[f];
        if (l >= l1) goto _L4; else goto _L3
_L3:
        l1 = l2;
_L2:
        this;
        JVM INSTR monitorexit ;
        return l1;
_L4:
        if (g != 0) goto _L6; else goto _L5
_L5:
        int k = a;
_L10:
        l1 = l2;
        if (l > i[k - 1])
        {
            continue; /* Loop/switch isn't completed */
        }
        k = 0;
        int i1 = f;
        int j1 = -1;
_L8:
        if (i1 == g || i[i1] > l)
        {
            break; /* Loop/switch isn't completed */
        }
        if ((h[i1] & 1) != 0)
        {
            j1 = k;
        }
        i1 = (i1 + 1) % a;
        k++;
        if (true) goto _L8; else goto _L7
_L7:
        break; /* Loop/switch isn't completed */
_L6:
        k = g;
        if (true) goto _L10; else goto _L9
_L9:
        l1 = l2;
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        d = d - j1;
        f = (f + j1) % a;
        e = e + j1;
        l1 = b[f];
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
        i[g] = l;
        b[g] = l1;
        c[g] = i1;
        h[g] = k;
        j[g] = abyte0;
        d = d + 1;
        if (d != a) goto _L2; else goto _L1
_L1:
        k = a + 1000;
        abyte0 = new long[k];
        long al[] = new long[k];
        int ai[] = new int[k];
        int ai1[] = new int[k];
        byte abyte1[][] = new byte[k][];
        i1 = a - f;
        System.arraycopy(b, f, abyte0, 0, i1);
        System.arraycopy(i, f, al, 0, i1);
        System.arraycopy(h, f, ai, 0, i1);
        System.arraycopy(c, f, ai1, 0, i1);
        System.arraycopy(j, f, abyte1, 0, i1);
        int j1 = f;
        System.arraycopy(b, 0, abyte0, i1, j1);
        System.arraycopy(i, 0, al, i1, j1);
        System.arraycopy(h, 0, ai, i1, j1);
        System.arraycopy(c, 0, ai1, i1, j1);
        System.arraycopy(j, 0, abyte1, i1, j1);
        b = abyte0;
        i = al;
        h = ai;
        c = ai1;
        j = abyte1;
        f = 0;
        g = a;
        d = a;
        a = k;
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        g = g + 1;
        if (g == a)
        {
            g = 0;
        }
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    public final boolean a(azk azk1, bcc bcc1)
    {
        this;
        JVM INSTR monitorenter ;
        int k = d;
        if (k != 0) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        azk1.e = i[f];
        azk1.c = c[f];
        azk1.d = h[f];
        bcc1.a = b[f];
        bcc1.b = j[f];
        flag = true;
        if (true) goto _L4; else goto _L3
_L3:
        azk1;
        throw azk1;
    }

    public final long b()
    {
        this;
        JVM INSTR monitorenter ;
        int k;
        d = d - 1;
        k = f;
        f = k + 1;
        e = e + 1;
        if (f == a)
        {
            f = 0;
        }
        if (d <= 0) goto _L2; else goto _L1
_L1:
        long l = b[f];
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
}
