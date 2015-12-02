// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.g;


// Referenced classes of package com.qihoo.security.g:
//            b

class a extends Thread
{

    final b a;

    public void run()
    {
        if (b.a(a) != null)
        {
            b.a(a).a();
        }
        if (b.b(a) != 0) goto _L2; else goto _L1
_L1:
        int i = b.a(a, b.c(a), b.d(a));
        if (b.a(a) != null)
        {
            b.a(a).a(i);
        }
_L4:
        this;
        JVM INSTR monitorenter ;
        b.a(a, false);
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (1 == b.b(a))
        {
            int j = b.a(a, b.c(a), b.e(a));
            if (b.a(a) != null)
            {
                b.a(a).a(j);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
