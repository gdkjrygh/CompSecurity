// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.mobilesafe.support.a;


// Referenced classes of package com.qihoo360.mobilesafe.support.a:
//            c

class c extends Thread
{

    final c a;
    private final boolean b;
    private final c c;

    public void run()
    {
        if (com.qihoo360.mobilesafe.support.a.c.a(a, b))
        {
            c.a = 0;
        }
        synchronized (c)
        {
            c.d = false;
            c.notify();
        }
        return;
        exception;
        c1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (c c1, boolean flag,  )
    {
        a = c1;
        b = flag;
        c = ;
        super();
    }
}
