// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.view.MotionEvent;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.ay;
import com.google.android.gms.internal.gv;
import com.google.android.gms.internal.k;
import com.google.android.gms.internal.zzam;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzq

class zzh
    implements k, Runnable
{

    private final List zzoP = new Vector();
    private final AtomicReference zzoQ = new AtomicReference();
    CountDownLatch zzoR;
    private zzq zzos;

    public zzh(zzq zzq1)
    {
        zzoR = new CountDownLatch(1);
        zzos = zzq1;
        if (zzk.zzcE().zzgI())
        {
            gv.a(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private void zzbh()
    {
        if (zzoP.isEmpty())
        {
            return;
        }
        Iterator iterator = zzoP.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object aobj[] = (Object[])iterator.next();
            if (aobj.length == 1)
            {
                ((k)zzoQ.get()).zza((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((k)zzoQ.get()).zza(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        zzoP.clear();
    }

    private Context zzp(Context context)
    {
        Context context1;
        if (((Boolean)ay.m.c()).booleanValue())
        {
            if ((context1 = context.getApplicationContext()) != null)
            {
                return context1;
            }
        }
        return context;
    }

    public void run()
    {
        Exception exception;
        boolean flag;
        if (((Boolean)ay.y.c()).booleanValue() && !zzos.zzqb.zzIC)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        zza(zzb(zzos.zzqb.zzIz, zzp(zzos.context), flag));
        zzoR.countDown();
        zzos = null;
        return;
        exception;
        zzoR.countDown();
        zzos = null;
        throw exception;
    }

    public void zza(int i, int j, int l)
    {
        k k1 = (k)zzoQ.get();
        if (k1 != null)
        {
            zzbh();
            k1.zza(i, j, l);
            return;
        } else
        {
            zzoP.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(l)
            })));
            return;
        }
    }

    public void zza(MotionEvent motionevent)
    {
        k k1 = (k)zzoQ.get();
        if (k1 != null)
        {
            zzbh();
            k1.zza(motionevent);
            return;
        } else
        {
            zzoP.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    protected void zza(k k1)
    {
        zzoQ.set(k1);
    }

    protected k zzb(String s, Context context, boolean flag)
    {
        return zzam.a(s, context, flag);
    }

    public String zzb(Context context)
    {
        if (zzbg())
        {
            k k1 = (k)zzoQ.get();
            if (k1 != null)
            {
                zzbh();
                return k1.zzb(zzp(context));
            }
        }
        return "";
    }

    public String zzb(Context context, String s)
    {
        if (zzbg())
        {
            k k1 = (k)zzoQ.get();
            if (k1 != null)
            {
                zzbh();
                return k1.zzb(zzp(context), s);
            }
        }
        return "";
    }

    protected boolean zzbg()
    {
        try
        {
            zzoR.await();
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }
}
