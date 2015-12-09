// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class ckd
{

    private long a;
    private long b;
    private Object c;

    public ckd(long l)
    {
        b = 0x8000000000000000L;
        c = new Object();
        a = l;
    }

    public final boolean a()
    {
        long l;
label0:
        {
            synchronized (c)
            {
                l = bkv.i().b();
                if (b + a <= l)
                {
                    break label0;
                }
            }
            return false;
        }
        b = l;
        obj;
        JVM INSTR monitorexit ;
        return true;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
