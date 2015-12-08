// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package c;


// Referenced classes of package c:
//            z

final class aa
{

    static z a;
    static long b;

    private aa()
    {
    }

    static z a()
    {
        c/aa;
        JVM INSTR monitorenter ;
        z z1;
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        z1 = a;
        a = z1.f;
        z1.f = null;
        b -= 2048L;
        c/aa;
        JVM INSTR monitorexit ;
        return z1;
        c/aa;
        JVM INSTR monitorexit ;
        return new z();
        Exception exception;
        exception;
        c/aa;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static void a(z z1)
    {
        if (z1.f != null || z1.g != null)
        {
            throw new IllegalArgumentException();
        }
        if (z1.d)
        {
            return;
        }
        c/aa;
        JVM INSTR monitorenter ;
        if (b + 2048L <= 0x10000L)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        c/aa;
        JVM INSTR monitorexit ;
        return;
        z1;
        c/aa;
        JVM INSTR monitorexit ;
        throw z1;
        b += 2048L;
        z1.f = a;
        z1.c = 0;
        z1.b = 0;
        a = z1;
        c/aa;
        JVM INSTR monitorexit ;
    }
}
