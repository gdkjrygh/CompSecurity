// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.paypal.android.sdk:
//            ax, bg, ay

public class aw
{

    private static final String a = com/paypal/android/sdk/aw.getSimpleName();
    private final List b = new ArrayList();

    public aw()
    {
    }

    public final void a()
    {
        List list = b;
        list;
        JVM INSTR monitorenter ;
        ax ax1;
        for (Iterator iterator = b.iterator(); iterator.hasNext(); b.remove(ax1))
        {
            ax1 = (ax)iterator.next();
        }

        break MISSING_BLOCK_LABEL_55;
        Exception exception;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        list;
        JVM INSTR monitorexit ;
    }

    public final void a(ay ay1)
    {
label0:
        {
            synchronized (b)
            {
                Iterator iterator = b.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                } while (((ax)iterator.next()).a != ay1);
                (new StringBuilder("Ignoring attempt to re-register listener ")).append(ay1);
            }
            return;
        }
        b.add(new ax(this, ay1));
        list;
        JVM INSTR monitorexit ;
        return;
        ay1;
        list;
        JVM INSTR monitorexit ;
        throw ay1;
    }

    public final void a(bg bg1, long l)
    {
        (new StringBuilder("dispatching ")).append(bg1.o());
        if (bg1.p() >= 0L) goto _L2; else goto _L1
_L1:
        (new StringBuilder("discarding ")).append(bg1.o());
_L4:
        return;
_L2:
        ArrayList arraylist = new ArrayList();
        List list = b;
        list;
        JVM INSTR monitorenter ;
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); arraylist.add(0, (ax)iterator1.next())) { }
        break MISSING_BLOCK_LABEL_110;
        bg1;
        list;
        JVM INSTR monitorexit ;
        throw bg1;
        list;
        JVM INSTR monitorexit ;
        Iterator iterator = arraylist.iterator();
        while (iterator.hasNext()) 
        {
            ((ax)iterator.next()).a.a(bg1);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

}
