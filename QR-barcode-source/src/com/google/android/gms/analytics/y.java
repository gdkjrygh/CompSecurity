// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ac, z

class y
    implements ac
{

    private final long AN;
    private final int AO;
    private double AP;
    private long AQ;
    private final Object AR;
    private final String AS;

    public y(int i, long l, String s)
    {
        AR = new Object();
        AO = i;
        AP = AO;
        AN = l;
        AS = s;
    }

    public y(String s)
    {
        this(60, 2000L, s);
    }

    public boolean eJ()
    {
        Object obj = AR;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (AP >= (double)AO)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - AQ) / (double)AN;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        AP = Math.min(AO, d + AP);
        AQ = l;
        if (AP < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        AP = AP - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        z.W((new StringBuilder()).append("Excessive ").append(AS).append(" detected; call ignored.").toString());
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
