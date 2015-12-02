// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.qihoo.security.ui.main:
//            HomeActivity

class a
    implements Runnable
{

    final int a;
    final HomeActivity b;

    public void run()
    {
        HomeActivity homeactivity = b;
        homeactivity;
        JVM INSTR monitorenter ;
        Iterator iterator = HomeActivity.h(b).iterator();
_L2:
        a a1;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_67;
            }
            a1 = (b)((WeakReference)iterator.next()).get();
        } while (a1 == null);
        a1.b(a);
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        homeactivity;
        JVM INSTR monitorexit ;
        throw exception;
        homeactivity;
        JVM INSTR monitorexit ;
    }

    (HomeActivity homeactivity, int i)
    {
        b = homeactivity;
        a = i;
        super();
    }
}
