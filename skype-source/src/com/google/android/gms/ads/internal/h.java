// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import com.google.android.gms.internal.ax;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.gl;
import com.google.android.gms.internal.k;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            p, zzq

final class h
    implements k, Runnable
{

    CountDownLatch a;
    private final List b = new Vector();
    private final AtomicReference c = new AtomicReference();
    private zzq d;

    public h(zzq zzq1)
    {
        a = new CountDownLatch(1);
        d = zzq1;
        n.a();
        if (com.google.android.gms.ads.internal.util.client.a.b())
        {
            gl.a(this);
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
            a.await();
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }

    private static Context b(Context context)
    {
        Object obj = ay.m;
        if (((Boolean)com.google.android.gms.ads.internal.p.n().a(((com.google.android.gms.internal.au) (obj)))).booleanValue())
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
        if (b.isEmpty())
        {
            return;
        }
        Iterator iterator = b.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object aobj[] = (Object[])iterator.next();
            if (aobj.length == 1)
            {
                ((k)c.get()).a((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((k)c.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        b.clear();
    }

    public final String a(Context context)
    {
        if (a())
        {
            k k1 = (k)c.get();
            if (k1 != null)
            {
                b();
                return k1.a(b(context));
            }
        }
        return "";
    }

    public final String a(Context context, String s)
    {
        if (a())
        {
            k k1 = (k)c.get();
            if (k1 != null)
            {
                b();
                return k1.a(b(context), s);
            }
        }
        return "";
    }

    public final void a(int i, int j, int l)
    {
        k k1 = (k)c.get();
        if (k1 != null)
        {
            b();
            k1.a(i, j, l);
            return;
        } else
        {
            b.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(l)
            })));
            return;
        }
    }

    public final void a(MotionEvent motionevent)
    {
        k k1 = (k)c.get();
        if (k1 != null)
        {
            b();
            k1.a(motionevent);
            return;
        } else
        {
            b.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    public final void run()
    {
        Object obj = ay.y;
        Exception exception;
        boolean flag;
        if (((Boolean)com.google.android.gms.ads.internal.p.n().a(((com.google.android.gms.internal.au) (obj)))).booleanValue() && !d.e.e)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj = com.google.android.gms.internal.n.a(d.e.b, b(d.c), flag);
        c.set(obj);
        a.countDown();
        d = null;
        return;
        exception;
        a.countDown();
        d = null;
        throw exception;
    }
}
