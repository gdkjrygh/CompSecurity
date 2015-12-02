// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.opti.b;

import java.lang.ref.WeakReference;

// Referenced classes of package com.qihoo.security.opti.b:
//            a

public static class nit> extends Thread
{

    private boolean a;
    private int b;
    private WeakReference c;

    public boolean a()
    {
        return a;
    }

    public void b()
    {
        a = true;
    }

    public void run()
    {
        int i = 0;
_L5:
        if (!a) goto _L2; else goto _L1
_L1:
        if (!a && c != null)
        {
            a a1 = (c)c.get();
            if (a1 != null)
            {
                a1.a();
            }
        }
        a = true;
        return;
_L2:
        int j;
        try
        {
            sleep(60000L);
        }
        catch (InterruptedException interruptedexception)
        {
            interruptedexception.printStackTrace();
        }
        if (a) goto _L1; else goto _L3
_L3:
        j = i + 1;
        i = j;
        if (com.qihoo.security.opti.b.a.c())
        {
            break; /* Loop/switch isn't completed */
        }
        i = j;
        if (com.qihoo.security.opti.b.a.d())
        {
            break; /* Loop/switch isn't completed */
        }
        if (j >= b) goto _L1; else goto _L4
_L4:
        i = j;
        if (!com.qihoo.security.opti.b.a.e()) goto _L5; else goto _L1
    }

    public ( )
    {
        b = 20;
        c = new WeakReference();
    }
}
