// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//            h, v, eu, eo, 
//            ev, ew, k

private static final class run
    implements h, Runnable
{

    private kA kA;
    private final List kH = new Vector();
    private final CountDownLatch kI = new CountDownLatch(1);
    private final AtomicReference kJ = new AtomicReference();

    private void aj()
    {
        try
        {
            kI.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            ev.c("Interrupted during GADSignals creation.", interruptedexception);
        }
    }

    private void ak()
    {
        if (!kH.isEmpty())
        {
            Iterator iterator = kH.iterator();
            while (iterator.hasNext()) 
            {
                Object aobj[] = (Object[])iterator.next();
                if (aobj.length == 1)
                {
                    ((h)kJ.get()).a((MotionEvent)aobj[0]);
                } else
                if (aobj.length == 3)
                {
                    ((h)kJ.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
                }
            }
        }
    }

    public String a(Context context)
    {
        aj();
        ak();
        return ((h)kJ.get()).a(context);
    }

    public String a(Context context, String s)
    {
        aj();
        ak();
        return ((h)kJ.get()).a(context, s);
    }

    public void a(int i, int j, int l)
    {
        h h1 = (h)kJ.get();
        if (h1 != null)
        {
            ak();
            h1.a(i, j, l);
            return;
        } else
        {
            kH.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(l)
            })));
            return;
        }
    }

    public void a(MotionEvent motionevent)
    {
        h h1 = (h)kJ.get();
        if (h1 != null)
        {
            ak();
            h1.a(motionevent);
            return;
        } else
        {
            kH.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    public void run()
    {
        kJ.set(k.a(kA.kO.st, kA.kM));
        kI.countDown();
        kA = null;
        return;
        Exception exception;
        exception;
        kI.countDown();
        kA = null;
        throw exception;
    }

    public ference(ference ference)
    {
        kA = ference;
        if (eu.bR())
        {
            eo.execute(this);
            return;
        } else
        {
            run();
            return;
        }
    }
}
