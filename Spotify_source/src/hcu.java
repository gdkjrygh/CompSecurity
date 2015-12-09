// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class hcu
{

    private static hct a;
    private static long b;

    private hcu()
    {
    }

    static hct a()
    {
        hcu;
        JVM INSTR monitorenter ;
        hct hct1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        hct1 = a;
        a = hct1.f;
        hct1.f = null;
        b -= 2048L;
        hcu;
        JVM INSTR monitorexit ;
        return hct1;
        hcu;
        JVM INSTR monitorexit ;
        return new hct();
        Exception exception;
        exception;
        hcu;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(hct hct1)
    {
        if (hct1.f != null || hct1.g != null)
        {
            throw new IllegalArgumentException();
        }
        if (hct1.d)
        {
            return;
        }
        hcu;
        JVM INSTR monitorenter ;
        if (b + 2048L <= 0x10000L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        hcu;
        JVM INSTR monitorexit ;
        return;
        hct1;
        hcu;
        JVM INSTR monitorexit ;
        throw hct1;
        b += 2048L;
        hct1.f = a;
        hct1.c = 0;
        hct1.b = 0;
        a = hct1;
        hcu;
        JVM INSTR monitorexit ;
    }
}
