// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;


// Referenced classes of package com.google.android.gms.analytics.internal:
//            f

public class e
{

    private final long a;
    private final int b;
    private double c;
    private long d;
    private final Object e;
    private final String f;

    public e(int i, long l, String s)
    {
        e = new Object();
        b = i;
        c = b;
        a = l;
        f = s;
    }

    public e(String s)
    {
        this(60, 2000L, s);
    }

    public boolean a()
    {
        Object obj = e;
        obj;
        JVM INSTR monitorenter ;
        double d1;
        long l;
        l = System.currentTimeMillis();
        if (c >= (double)b)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d1 = (double)(l - d) / (double)a;
        if (d1 <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        c = Math.min(b, d1 + c);
        d = l;
        if (c < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        c = c - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        com.google.android.gms.analytics.internal.f.c((new StringBuilder()).append("Excessive ").append(f).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
