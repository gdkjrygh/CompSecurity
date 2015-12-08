// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;


// Referenced classes of package c:
//            v

final class w
{

    static v a;
    static long b;

    private w()
    {
    }

    static v a()
    {
        c/w;
        JVM INSTR monitorenter ;
        v v1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        v1 = a;
        a = v1.f;
        v1.f = null;
        b -= 2048L;
        c/w;
        JVM INSTR monitorexit ;
        return v1;
        c/w;
        JVM INSTR monitorexit ;
        return new v();
        Exception exception;
        exception;
        c/w;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(v v1)
    {
        if (v1.f != null || v1.g != null)
        {
            throw new IllegalArgumentException();
        }
        if (v1.d)
        {
            return;
        }
        c/w;
        JVM INSTR monitorenter ;
        if (b + 2048L <= 0x10000L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        c/w;
        JVM INSTR monitorexit ;
        return;
        v1;
        c/w;
        JVM INSTR monitorexit ;
        throw v1;
        b += 2048L;
        v1.f = a;
        v1.c = 0;
        v1.b = 0;
        a = v1;
        c/w;
        JVM INSTR monitorexit ;
    }
}
