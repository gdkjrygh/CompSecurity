// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.taplytics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.taplytics:
//            wallaby, ht, hu, hs, 
//            hv, hr

public final class hq
{

    wallaby a;
    private final List b = new ArrayList();
    private final Object c = new Object();
    private Object d;
    private boolean e;
    private Exception f;

    public hq()
    {
        a = wallaby.d;
        e = false;
    }

    private static void a(hu hu1, wallaby wallaby1)
    {
        switch (ht.a[wallaby1.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            hu1.c();
            return;

        case 2: // '\002'
            hu1.a();
            // fall through

        case 3: // '\003'
            hu1.b();
            break;
        }
    }

    private void a(wallaby wallaby1, Exception exception)
    {
label0:
        {
            ArrayList arraylist = new ArrayList(b);
            synchronized (c)
            {
                if (e)
                {
                    break label0;
                }
                b.clear();
                a = wallaby1;
                f = exception;
                e = true;
                d = null;
            }
            for (exception = arraylist.iterator(); exception.hasNext(); a((hu)exception.next(), wallaby1)) { }
            break MISSING_BLOCK_LABEL_99;
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        wallaby1;
        obj;
        JVM INSTR monitorexit ;
        throw wallaby1;
    }

    public final hu a(hu hu1)
    {
        if (e)
        {
            a(hu1, a);
            return hu1;
        } else
        {
            b.add(hu1);
            return hu1;
        }
    }

    public final void a()
    {
        a(wallaby.a, ((Exception) (null)));
    }

    public final void a(int i)
    {
        a(((hu) (new hs(this, hv.a().schedule(new hr(this), i, TimeUnit.MILLISECONDS)))));
    }

    final void a(Exception exception)
    {
        a(wallaby.b, exception);
    }

    public final void b()
    {
        a(wallaby.c, ((Exception) (null)));
    }

    public final boolean c()
    {
        return a == wallaby.a;
    }
}
