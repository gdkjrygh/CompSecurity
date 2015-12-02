// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.enginehelper.clean;

import android.util.Log;

// Referenced classes of package com.qihoo.security.enginehelper.clean:
//            a

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        if (com.qihoo.security.enginehelper.clean.a.h())
        {
            Log.i(com.qihoo.security.enginehelper.clean.a.i(), "target stop");
        }
        com.qihoo.security.enginehelper.clean.a.b(a);
        com.qihoo.security.enginehelper.clean.a.a(a, 22);
        if (com.qihoo.security.enginehelper.clean.a.a(a))
        {
            synchronized (com.qihoo.security.enginehelper.clean.a.e(a))
            {
                com.qihoo.security.enginehelper.clean.a.b(a, 15);
                com.qihoo.security.enginehelper.clean.a.f(a);
            }
            com.qihoo.security.enginehelper.clean.a.c(a);
            return;
        } else
        {
            com.qihoo.security.enginehelper.clean.a.a(a, 0);
            return;
        }
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
