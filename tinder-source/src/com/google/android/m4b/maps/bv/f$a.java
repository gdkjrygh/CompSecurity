// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;


// Referenced classes of package com.google.android.m4b.maps.bv:
//            f

final class d
    implements Runnable
{

    private final boolean a;
    private float b;
    private final boolean c;
    private float d;
    private f e;

    final void a()
    {
        synchronized (f.a(e))
        {
            b = 0.0F;
            d = 0.0F;
            f.a(e).notify();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void run()
    {
        Object obj = f.a(e);
        obj;
        JVM INSTR monitorenter ;
_L7:
        float f1;
        float f2;
        f f3;
        Exception exception;
        try
        {
            f.a(e).wait(30L);
        }
        catch (InterruptedException interruptedexception) { }
        if (f.b(e) == null || b <= 0.0F && d <= 0.0F) goto _L2; else goto _L1
_L1:
        f3 = e;
        if (!a) goto _L4; else goto _L3
_L3:
        f1 = b;
_L8:
        if (!c) goto _L6; else goto _L5
_L5:
        f2 = d;
_L9:
        f3.a(10F * f1, f2);
        b = Math.max(b * 0.87F - 0.005F, 0.0F);
        d = Math.max(d * 0.87F - 0.005F, 0.0F);
          goto _L7
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L4:
        f1 = -b;
          goto _L8
_L6:
        f2 = -d;
          goto _L9
_L2:
        obj;
        JVM INSTR monitorexit ;
          goto _L8
    }

    (f f1, float f2, float f3)
    {
        boolean flag1 = true;
        e = f1;
        super();
        boolean flag;
        if (f2 > 0.0F)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
        if (!a)
        {
            f2 = -f2;
        }
        b = f2;
        if (f3 > 0.0F)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        c = flag;
        if (!c)
        {
            f3 = -f3;
        }
        d = f3;
    }
}
