// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package okio;


// Referenced classes of package okio:
//            o

final class p
{

    static o a;
    static long b;

    private p()
    {
    }

    static o a()
    {
        okio/p;
        JVM INSTR monitorenter ;
        o o1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        o1 = a;
        a = o1.f;
        o1.f = null;
        b -= 2048L;
        okio/p;
        JVM INSTR monitorexit ;
        return o1;
        okio/p;
        JVM INSTR monitorexit ;
        return new o();
        Exception exception;
        exception;
        okio/p;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(o o1)
    {
        if (o1.f != null || o1.g != null)
        {
            throw new IllegalArgumentException();
        }
        if (o1.d)
        {
            return;
        }
        okio/p;
        JVM INSTR monitorenter ;
        if (b + 2048L <= 0x10000L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        okio/p;
        JVM INSTR monitorexit ;
        return;
        o1;
        okio/p;
        JVM INSTR monitorexit ;
        throw o1;
        b += 2048L;
        o1.f = a;
        o1.c = 0;
        o1.b = 0;
        a = o1;
        okio/p;
        JVM INSTR monitorexit ;
    }
}
