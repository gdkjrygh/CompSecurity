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
//            zzg, zzbe, zzhw, zzhn, 
//            zzca, zzbx, zzhy, zzj, 
//            zzhx

class zzw
    implements zzg, Runnable
{

    private zzt.zzb zzlE;
    private final List zzmv = new Vector();
    private final AtomicReference zzmw = new AtomicReference();
    CountDownLatch zzmx;

    public zzw(zzt.zzb zzb)
    {
        zzmx = new CountDownLatch(1);
        zzlE = zzb;
        if (zzbe.zzbD().zzeC())
        {
            zzhn.zzb(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private void zzaD()
    {
        if (zzmv.isEmpty())
        {
            return;
        }
        Iterator iterator = zzmv.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object aobj[] = (Object[])iterator.next();
            if (aobj.length == 1)
            {
                ((zzg)zzmw.get()).zza((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((zzg)zzmw.get()).zza(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        zzmv.clear();
    }

    private Context zzi(Context context)
    {
        Context context1;
        if (((Boolean)zzca.zzqu.get()).booleanValue())
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
        zza(zzj.zza(zzlE.zzlP.zzzH, zzi(zzlE.zzlN)));
        zzmx.countDown();
        zzlE = null;
        return;
        Exception exception;
        exception;
        zzmx.countDown();
        zzlE = null;
        throw exception;
    }

    public String zza(Context context)
    {
        if (zzaC())
        {
            zzg zzg1 = (zzg)zzmw.get();
            if (zzg1 != null)
            {
                zzaD();
                return zzg1.zza(zzi(context));
            }
        }
        return "";
    }

    public String zza(Context context, String s)
    {
        if (zzaC())
        {
            zzg zzg1 = (zzg)zzmw.get();
            if (zzg1 != null)
            {
                zzaD();
                return zzg1.zza(zzi(context), s);
            }
        }
        return "";
    }

    public void zza(int i, int j, int k)
    {
        zzg zzg1 = (zzg)zzmw.get();
        if (zzg1 != null)
        {
            zzaD();
            zzg1.zza(i, j, k);
            return;
        } else
        {
            zzmv.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            })));
            return;
        }
    }

    public void zza(MotionEvent motionevent)
    {
        zzg zzg1 = (zzg)zzmw.get();
        if (zzg1 != null)
        {
            zzaD();
            zzg1.zza(motionevent);
            return;
        } else
        {
            zzmv.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    protected void zza(zzg zzg1)
    {
        zzmw.set(zzg1);
    }

    protected boolean zzaC()
    {
        try
        {
            zzmx.await();
        }
        catch (InterruptedException interruptedexception)
        {
            zzhx.zzd("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }
}
