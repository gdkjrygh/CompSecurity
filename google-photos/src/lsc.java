// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class lsc
    implements lsq
{

    private final long a = 0xdbba0L;
    private final long b = 5000L;
    private final int c = 30;
    private double d;
    private long e;
    private final Object f = new Object();
    private final String g;
    private final kdh h;

    public lsc(int i, long l, long l1, String s, kdh kdh1)
    {
        d = c;
        g = s;
        h = kdh1;
    }

    public final boolean a()
    {
        long l;
label0:
        {
            synchronized (f)
            {
                l = h.a();
                if (l - e >= b)
                {
                    break label0;
                }
                lqh.b((new StringBuilder("Excessive ")).append(g).append(" detected; call ignored.").toString());
            }
            return false;
        }
        double d1;
        if (d >= (double)c)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        d1 = (double)(l - e) / (double)a;
        if (d1 <= 0.0D)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        d = Math.min(c, d1 + d);
        e = l;
        if (d < 1.0D)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        d = d - 1.0D;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        lqh.b((new StringBuilder("Excessive ")).append(g).append(" detected; call ignored.").toString());
        obj;
        JVM INSTR monitorexit ;
        return false;
    }
}
