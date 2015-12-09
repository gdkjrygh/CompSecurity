// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class bdf
    implements bda
{

    private int a;
    private int b;
    private bcz c[];

    public bdf()
    {
        this((byte)0);
    }

    private bdf(byte byte0)
    {
        bds.a(true);
        bds.a(true);
        b = 0;
        c = new bcz[100];
    }

    public final bcz a()
    {
        this;
        JVM INSTR monitorenter ;
        a = a + 1;
        if (b <= 0) goto _L2; else goto _L1
_L1:
        bcz abcz[];
        int i;
        abcz = c;
        i = b - 1;
        b = i;
        bcz bcz1 = abcz[i];
        c[b] = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return bcz1;
_L2:
        bcz1 = new bcz(new byte[0x10000]);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j;
        i = Math.max(0, bej.a(i) - a);
        j = b;
        if (i < j) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Arrays.fill(c, i, b, null);
        b = i;
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(bcz bcz1)
    {
        this;
        JVM INSTR monitorenter ;
        bcz abcz[];
        int i;
        boolean flag;
        if (bcz1.a != null && bcz1.a.length != 0x10000)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        bds.a(flag);
        a = a - 1;
        if (b == c.length)
        {
            c = (bcz[])Arrays.copyOf(c, c.length << 1);
        }
        abcz = c;
        i = b;
        b = i + 1;
        abcz[i] = bcz1;
        notifyAll();
        this;
        JVM INSTR monitorexit ;
        return;
        bcz1;
        throw bcz1;
    }

    public final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i = a;
        this;
        JVM INSTR monitorexit ;
        return i << 16;
        Exception exception;
        exception;
        throw exception;
    }
}
