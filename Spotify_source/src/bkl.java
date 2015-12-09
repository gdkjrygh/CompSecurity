// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class bkl
    implements bzh, Runnable
{

    private final List a = new Vector();
    private final AtomicReference b = new AtomicReference();
    private bkw c;
    private CountDownLatch d;

    public bkl(bkw bkw1)
    {
        d = new CountDownLatch(1);
        c = bkw1;
        bfq.a();
        if (bjz.b())
        {
            cji.a(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private boolean a()
    {
        try
        {
            d.await();
        }
        catch (InterruptedException interruptedexception)
        {
            bka.c("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }

    private static Context b(Context context)
    {
        Object obj = cbb.f;
        if (((Boolean)bkv.n().a(((cax) (obj)))).booleanValue())
        {
            if ((obj = context.getApplicationContext()) != null)
            {
                return ((Context) (obj));
            }
        }
        return context;
    }

    private void b()
    {
        if (a.isEmpty())
        {
            return;
        }
        Iterator iterator = a.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object aobj[] = (Object[])iterator.next();
            if (aobj.length == 1)
            {
                ((bzh)b.get()).a((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((bzh)b.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        a.clear();
    }

    public final String a(Context context)
    {
        if (a())
        {
            bzh bzh1 = (bzh)b.get();
            if (bzh1 != null)
            {
                b();
                return bzh1.a(b(context));
            }
        }
        return "";
    }

    public final String a(Context context, String s)
    {
        if (a())
        {
            bzh bzh1 = (bzh)b.get();
            if (bzh1 != null)
            {
                b();
                return bzh1.a(b(context), s);
            }
        }
        return "";
    }

    public final void a(int i, int j, int k)
    {
        bzh bzh1 = (bzh)b.get();
        if (bzh1 != null)
        {
            b();
            bzh1.a(i, j, k);
            return;
        } else
        {
            a.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            })));
            return;
        }
    }

    public final void a(MotionEvent motionevent)
    {
        bzh bzh1 = (bzh)b.get();
        if (bzh1 != null)
        {
            b();
            bzh1.a(motionevent);
            return;
        } else
        {
            a.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    public final void run()
    {
        Object obj = cbb.o;
        Exception exception;
        boolean flag;
        if (((Boolean)bkv.n().a(((cax) (obj)))).booleanValue() && !c.e.e)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj = bzj.a(c.e.b, b(c.c), flag);
        b.set(obj);
        d.countDown();
        c = null;
        return;
        exception;
        d.countDown();
        c = null;
        throw exception;
    }
}
