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
import com.google.android.gms.internal.zzaj;
import com.google.android.gms.internal.zzam;
import com.google.android.gms.internal.zzbv;
import com.google.android.gms.internal.zzbz;
import com.google.android.gms.internal.zzhk;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzp

class zzg
    implements zzaj, Runnable
{

    private final List zzoB = new Vector();
    private final AtomicReference zzoC = new AtomicReference();
    CountDownLatch zzoD;
    private zzp zzon;

    public zzg(zzp zzp1)
    {
        zzoD = new CountDownLatch(1);
        zzon = zzp1;
        if (zzk.zzcA().zzgw())
        {
            zzhk.zza(this);
            return;
        } else
        {
            run();
            return;
        }
    }

    private void zzbf()
    {
        if (zzoB.isEmpty())
        {
            return;
        }
        Iterator iterator = zzoB.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object aobj[] = (Object[])iterator.next();
            if (aobj.length == 1)
            {
                ((zzaj)zzoC.get()).zza((MotionEvent)aobj[0]);
            } else
            if (aobj.length == 3)
            {
                ((zzaj)zzoC.get()).zza(((Integer)aobj[0]).intValue(), ((Integer)aobj[1]).intValue(), ((Integer)aobj[2]).intValue());
            }
        } while (true);
        zzoB.clear();
    }

    private Context zzp(Context context)
    {
        Context context1;
        if (((Boolean)zzbz.zztM.get()).booleanValue())
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
        if (((Boolean)zzbz.zztU.get()).booleanValue() && !zzon.zzpJ.zzGJ)
        {
            flag = false;
        } else
        {
            flag = true;
        }
        zza(zzb(zzon.zzpJ.zzGG, zzp(zzon.zzpH), flag));
        zzoD.countDown();
        zzon = null;
        return;
        exception;
        zzoD.countDown();
        zzon = null;
        throw exception;
    }

    public String zza(Context context, String s)
    {
        if (zzbe())
        {
            zzaj zzaj1 = (zzaj)zzoC.get();
            if (zzaj1 != null)
            {
                zzbf();
                return zzaj1.zza(zzp(context), s);
            }
        }
        return "";
    }

    public void zza(int i, int j, int k)
    {
        zzaj zzaj1 = (zzaj)zzoC.get();
        if (zzaj1 != null)
        {
            zzbf();
            zzaj1.zza(i, j, k);
            return;
        } else
        {
            zzoB.add(((Object) (new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k)
            })));
            return;
        }
    }

    public void zza(MotionEvent motionevent)
    {
        zzaj zzaj1 = (zzaj)zzoC.get();
        if (zzaj1 != null)
        {
            zzbf();
            zzaj1.zza(motionevent);
            return;
        } else
        {
            zzoB.add(((Object) (new Object[] {
                motionevent
            })));
            return;
        }
    }

    protected void zza(zzaj zzaj1)
    {
        zzoC.set(zzaj1);
    }

    protected zzaj zzb(String s, Context context, boolean flag)
    {
        return zzam.zza(s, context, flag);
    }

    public String zzb(Context context)
    {
        if (zzbe())
        {
            zzaj zzaj1 = (zzaj)zzoC.get();
            if (zzaj1 != null)
            {
                zzbf();
                return zzaj1.zzb(zzp(context));
            }
        }
        return "";
    }

    protected boolean zzbe()
    {
        try
        {
            zzoD.await();
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzd("Interrupted during GADSignals creation.", interruptedexception);
            return false;
        }
        return true;
    }
}
