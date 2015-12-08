// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import java.util.ArrayList;

// Referenced classes of package com.google.android.apps.unveil.env:
//            af, ImageUtils

public final class c
{

    private static final af b = new af();
    private static final ArrayList c = new ArrayList();
    public final byte a[];
    private final long d;
    private int e;

    private c(byte abyte0[], long l)
    {
        a = abyte0;
        d = l;
    }

    public static int a(int i, int j)
    {
        return ((i + j) - 1) / j;
    }

    public static c a(byte abyte0[], int i, int j, long l)
    {
        byte abyte1[] = d(i, j);
        ImageUtils.downsampleImageNative(i, j, abyte0, c(i, j), abyte1);
        return new c(abyte1, l);
    }

    public static int b(int i, int j)
    {
        return ((i + j) - 1) / j;
    }

    public static int c(int i, int j)
    {
        int k;
        for (k = 1; (((j + k) - 1) / k) * (((i + k) - 1) / k) > 25680; k <<= 1) { }
        return k;
    }

    private static byte[] d(int i, int j)
    {
        int k = c(i, j);
        i = (((i + k) - 1) / k) * (((j + k) - 1) / k);
        ArrayList arraylist = c;
        arraylist;
        JVM INSTR monitorenter ;
        byte abyte0[] = null;
_L2:
        if (c.isEmpty() || abyte0 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        byte abyte1[] = (byte[])c.remove(0);
        abyte0 = abyte1;
        if (abyte1.length != i)
        {
            abyte0 = null;
        }
        if (true) goto _L2; else goto _L1
_L1:
        arraylist;
        JVM INSTR monitorexit ;
        byte abyte2[] = abyte0;
        if (abyte0 == null)
        {
            abyte2 = new byte[i];
        }
        return abyte2;
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        e = e + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        e = e - 1;
        if (e != 0) goto _L2; else goto _L1
_L1:
        byte abyte0[] = a;
        synchronized (c)
        {
            if (c.size() < 2)
            {
                c.add(abyte0);
            }
        }
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
        exception1;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception1;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        if (e >= 0) goto _L4; else goto _L3
_L3:
        throw new AssertionError("Negative reference count.");
    }

    protected final void finalize()
    {
        if (e != 0)
        {
            b.e("DownsampledImage garbage collected with a non-zero reference count.", new Object[0]);
        }
    }

}
