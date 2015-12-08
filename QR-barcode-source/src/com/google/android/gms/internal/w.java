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
//            g, gr, gi, gs, 
//            gt, j

class w
    implements g, Runnable
{

    private u.b lr;
    private final List me = new Vector();
    private final AtomicReference mf = new AtomicReference();
    CountDownLatch mg;

    public w(u.b b)
    {
        mg = new CountDownLatch(1);
        lr = b;
        if (gr.ds())
        {
            gi.a(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private void ax()
    {
        if (!me.isEmpty())
        {
            Iterator iterator = me.iterator();
            while (iterator.hasNext()) 
            {
                Object aobj[] = (Object[])iterator.next();
                if (aobj.length == 1)
                {
                    ((g)mf.get()).a((MotionEvent)aobj[0]);
                } else
                if (aobj.length == 3)
                {
                    ((g)mf.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
                }
            }
        }
    }

    public String a(Context context)
    {
        aw();
        g g1 = (g)mf.get();
        if (g1 != null)
        {
            ax();
            return g1.a(context);
        } else
        {
            return "";
        }
    }

    public String a(Context context, String s)
    {
        aw();
        g g1 = (g)mf.get();
        if (g1 != null)
        {
            ax();
            return g1.a(context, s);
        } else
        {
            return "";
        }
    }

    public void a(int i, int k, int l)
    {
        g g1 = (g)mf.get();
        if (g1 != null)
        {
            ax();
            g1.a(i, k, l);
            return;
        } else
        {
            me.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(k), Integer.valueOf(l)
            })));
            return;
        }
    }

    public void a(MotionEvent motionevent)
    {
        g g1 = (g)mf.get();
        if (g1 != null)
        {
            ax();
            g1.a(motionevent);
            return;
        } else
        {
            me.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    protected void a(g g1)
    {
        mf.set(g1);
    }

    protected void aw()
    {
        try
        {
            mg.await();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            gs.d("Interrupted during GADSignals creation.", interruptedexception);
        }
    }

    public void run()
    {
        a(j.a(lr.lD.wD, lr.lB));
        mg.countDown();
        lr = null;
        return;
        Exception exception;
        exception;
        mg.countDown();
        lr = null;
        throw exception;
    }
}
