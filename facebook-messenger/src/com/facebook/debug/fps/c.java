// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.debug.fps;

import java.util.concurrent.ConcurrentMap;

// Referenced classes of package com.facebook.debug.fps:
//            a, i

class c extends Thread
{

    volatile boolean a;
    final a b;

    c(a a1)
    {
        b = a1;
        super("FPS");
    }

    public void run()
    {
_L2:
        if (a)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        Object obj;
        Thread.sleep(10L);
        obj = com.facebook.debug.fps.a.b(b);
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = (i)com.facebook.debug.fps.a.f(b).get(obj);
        if (obj == null) goto _L2; else goto _L3
_L3:
        ((i) (obj)).postInvalidate();
          goto _L2
        InterruptedException interruptedexception;
        interruptedexception;
        Thread.currentThread().interrupt();
    }
}
