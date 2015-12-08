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
//            g, u, et, en, 
//            eu, ev, j

private static final class run
    implements g, Runnable
{

    private kC kC;
    private final List kJ = new Vector();
    private final CountDownLatch kK = new CountDownLatch(1);
    private final AtomicReference kL = new AtomicReference();

    private void ao()
    {
        try
        {
            kK.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            eu.c("Interrupted during GADSignals creation.", interruptedexception);
        }
    }

    private void ap()
    {
        if (!kJ.isEmpty())
        {
            Iterator iterator = kJ.iterator();
            while (iterator.hasNext()) 
            {
                Object aobj[] = (Object[])iterator.next();
                if (aobj.length == 1)
                {
                    ((g)kL.get()).a((MotionEvent)aobj[0]);
                } else
                if (aobj.length == 3)
                {
                    ((g)kL.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
                }
            }
        }
    }

    public String a(Context context)
    {
        ao();
        if (kL.get() != null)
        {
            ap();
            return ((g)kL.get()).a(context);
        } else
        {
            return "";
        }
    }

    public String a(Context context, String s)
    {
        ao();
        if (kL.get() != null)
        {
            ap();
            return ((g)kL.get()).a(context, s);
        } else
        {
            return "";
        }
    }

    public void a(int i, int k, int l)
    {
        g g1 = (g)kL.get();
        if (g1 != null)
        {
            ap();
            g1.a(i, k, l);
            return;
        } else
        {
            kJ.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(l)
            })));
            return;
        }
    }

    public void a(MotionEvent motionevent)
    {
        g g1 = (g)kL.get();
        if (g1 != null)
        {
            ap();
            g1.a(motionevent);
            return;
        } else
        {
            kJ.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    public String b(Context context)
    {
        ao();
        if (kL.get() != null)
        {
            ap();
            return ((g)kL.get()).b(context);
        } else
        {
            return "";
        }
    }

    public void run()
    {
        kL.set(j.a(kC.kQ.sw, kC.kO));
        kK.countDown();
        kC = null;
        return;
        Exception exception;
        exception;
        kK.countDown();
        kC = null;
        throw exception;
    }

    public ference(ference ference)
    {
        kC = ference;
        if (et.bW())
        {
            en.execute(this);
            return;
        } else
        {
            run();
            return;
        }
    }
}
