// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.aa;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.pu;
import com.google.android.gms.internal.w;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp, zzq

final class g
    implements w, Runnable
{

    CountDownLatch a;
    private final List b = new Vector();
    private final AtomicReference c = new AtomicReference();
    private zzq d;

    public g(zzq zzq1)
    {
        a = new CountDownLatch(1);
        d = zzq1;
        if (zzl.zzcF().zzgT())
        {
            pu.a(this);
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
            zzb.zzd("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }

    private static Context b(Context context)
    {
        Object obj = cy.m;
        if (((Boolean)zzp.zzbE().a(((com.google.android.gms.internal.cq) (obj)))).booleanValue())
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
                ((w)c.get()).a((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((w)c.get()).a(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        b.clear();
    }

    public final String a(Context context)
    {
        if (a())
        {
            w w1 = (w)c.get();
            if (w1 != null)
            {
                b();
                return w1.a(b(context));
            }
        }
        return "";
    }

    public final String a(Context context, String s)
    {
        if (a())
        {
            w w1 = (w)c.get();
            if (w1 != null)
            {
                b();
                return w1.a(b(context), s);
            }
        }
        return "";
    }

    public final void a(int i, int j, int k)
    {
        w w1 = (w)c.get();
        if (w1 != null)
        {
            b();
            w1.a(i, j, k);
            return;
        } else
        {
            b.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            })));
            return;
        }
    }

    public final void a(MotionEvent motionevent)
    {
        w w1 = (w)c.get();
        if (w1 != null)
        {
            b();
            w1.a(motionevent);
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
        Object obj = cy.y;
        Exception exception;
        boolean flag;
        if (((Boolean)zzp.zzbE().a(((com.google.android.gms.internal.cq) (obj)))).booleanValue() && !d.zzqj.zzJx)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        obj = aa.a(d.zzqj.zzJu, b(d.context), flag);
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
