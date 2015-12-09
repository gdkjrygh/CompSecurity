// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class bmn
{

    private double a;
    private long b;
    private final Object c;
    private final String d;

    private bmn(String s)
    {
        c = new Object();
        a = 60D;
        d = s;
    }

    public bmn(String s, byte byte0)
    {
        this(s);
    }

    public final boolean a()
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        double d1;
        long l;
        l = System.currentTimeMillis();
        if (a >= 60D)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        d1 = (double)(l - b) / 2000D;
        if (d1 <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_58;
        }
        a = Math.min(60D, d1 + a);
        b = l;
        if (a < 1.0D)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        a = a - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        bmo.c((new StringBuilder("Excessive ")).append(d).append(" detected; call ignored.").toString());
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
