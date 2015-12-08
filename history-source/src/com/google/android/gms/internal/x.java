// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.view.MotionEvent;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.internal:
//            g, gq, gh, gr, 
//            ga, gs, j

class x
    implements g, Runnable
{

    private u.b lB;
    private final List mp = new Vector();
    private final AtomicReference mq = new AtomicReference();
    CountDownLatch mr;

    public x(u.b b)
    {
        mr = new CountDownLatch(1);
        lB = b;
        if (gq.dB())
        {
            gh.a(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private void aB()
    {
        if (!mp.isEmpty())
        {
            Iterator iterator = mp.iterator();
            while (iterator.hasNext()) 
            {
                Object aobj[] = (Object[])iterator.next();
                if (aobj.length == 1)
                {
                    ((g)mq.get()).a((MotionEvent)aobj[0]);
                } else
                if (aobj.length == 3)
                {
                    ((g)mq.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
                }
            }
        }
    }

    private Context i(Context context)
    {
        Context context1;
        if (aC())
        {
            if ((context1 = context.getApplicationContext()) != null)
            {
                return context1;
            }
        }
        return context;
    }

    public String a(Context context)
    {
        if (aA())
        {
            g g1 = (g)mq.get();
            if (g1 != null)
            {
                aB();
                return g1.a(i(context));
            }
        }
        return "";
    }

    public String a(Context context, String s)
    {
        if (aA())
        {
            g g1 = (g)mq.get();
            if (g1 != null)
            {
                aB();
                return g1.a(i(context), s);
            }
        }
        return "";
    }

    public void a(int k, int l, int i1)
    {
        g g1 = (g)mq.get();
        if (g1 != null)
        {
            aB();
            g1.a(k, l, i1);
            return;
        } else
        {
            mp.add(((Object) (new Object[] {
                Integer.valueOf(k), Integer.valueOf(l), Integer.valueOf(i1)
            })));
            return;
        }
    }

    public void a(MotionEvent motionevent)
    {
        g g1 = (g)mq.get();
        if (g1 != null)
        {
            aB();
            g1.a(motionevent);
            return;
        } else
        {
            mp.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    protected void a(g g1)
    {
        mq.set(g1);
    }

    protected boolean aA()
    {
        try
        {
            mr.await();
        }
        catch (InterruptedException interruptedexception)
        {
            gr.d("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }

    protected boolean aC()
    {
        return ga.bN().getBoolean("gads:spam_app_context:enabled", false);
    }

    public void run()
    {
        a(j.a(lB.lO.wS, i(lB.lM)));
        mr.countDown();
        lB = null;
        return;
        Exception exception;
        exception;
        mr.countDown();
        lB = null;
        throw exception;
    }
}
