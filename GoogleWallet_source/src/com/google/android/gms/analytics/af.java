// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            ac

class af
{

    private final long BD;
    private final int BE;
    private double BF;
    private long BG;
    private final Object BH;
    private final String mAction;

    public af(int i, long l, String s)
    {
        BH = new Object();
        BE = i;
        BF = BE;
        BD = l;
        mAction = s;
    }

    public af(String s)
    {
        this(60, 2000L, s);
    }

    public boolean eZ()
    {
        Object obj = BH;
        obj;
        JVM INSTR monitorenter ;
        double d;
        long l;
        l = System.currentTimeMillis();
        if (BF >= (double)BE)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        d = (double)(l - BG) / (double)BD;
        if (d <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        BF = Math.min(BE, d + BF);
        BG = l;
        if (BF < 1.0D)
        {
            break MISSING_BLOCK_LABEL_93;
        }
        BF = BF - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        ac.w((new StringBuilder("Excessive ")).append(mAction).append(" detected; call ignored.").toString());
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
