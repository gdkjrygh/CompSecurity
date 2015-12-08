// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.zzap;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzfk;
import com.google.android.gms.internal.zzg;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

class a
    implements zzg, Runnable
{

    CountDownLatch a;
    private final List b = new Vector();
    private final AtomicReference c = new AtomicReference();
    private zza.a d;

    public a(zza.a a1)
    {
        a = new CountDownLatch(1);
        d = a1;
        if (zzj.zzbJ().zzfk())
        {
            zzfk.zza(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private Context a(Context context)
    {
        Context context1;
        if (((Boolean)zzat.zzrq.get()).booleanValue())
        {
            if ((context1 = context.getApplicationContext()) != null)
            {
                return context1;
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
                ((zzg)c.get()).zza((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((zzg)c.get()).zza(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        b.clear();
    }

    protected zzg a(String s, Context context, boolean flag)
    {
        return com.google.android.gms.internal.zzj.zza(s, context, flag);
    }

    protected void a(zzg zzg1)
    {
        c.set(zzg1);
    }

    protected boolean a()
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

    public void run()
    {
        Exception exception;
        boolean flag;
        if (((Boolean)zzat.zzry.get()).booleanValue() && !d.d.zzCL)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        a(a(d.d.zzCI, a(d.b), flag));
        a.countDown();
        d = null;
        return;
        exception;
        a.countDown();
        d = null;
        throw exception;
    }

    public String zza(Context context)
    {
        if (a())
        {
            zzg zzg1 = (zzg)c.get();
            if (zzg1 != null)
            {
                b();
                return zzg1.zza(a(context));
            }
        }
        return "";
    }

    public String zza(Context context, String s)
    {
        if (a())
        {
            zzg zzg1 = (zzg)c.get();
            if (zzg1 != null)
            {
                b();
                return zzg1.zza(a(context), s);
            }
        }
        return "";
    }

    public void zza(int i, int j, int k)
    {
        zzg zzg1 = (zzg)c.get();
        if (zzg1 != null)
        {
            b();
            zzg1.zza(i, j, k);
            return;
        } else
        {
            b.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            })));
            return;
        }
    }

    public void zza(MotionEvent motionevent)
    {
        zzg zzg1 = (zzg)c.get();
        if (zzg1 != null)
        {
            b();
            zzg1.zza(motionevent);
            return;
        } else
        {
            b.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }
}
