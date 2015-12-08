// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.lu;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.qa;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzb, zzh, zzf, zzi, 
//            a, zzk

public class zzc extends pj
    implements ServiceConnection
{

    private final Object a;
    private boolean b;
    private Context c;
    private lu d;
    private com.google.android.gms.ads.internal.purchase.zzb e;
    private zzh f;
    private List g;
    private zzk h;

    public zzc(Context context, lu lu, zzk zzk)
    {
        this(context, lu, zzk, new com.google.android.gms.ads.internal.purchase.zzb(context), zzh.zzw(context.getApplicationContext()));
    }

    private zzc(Context context, lu lu, zzk zzk, com.google.android.gms.ads.internal.purchase.zzb zzb1, zzh zzh1)
    {
        a = new Object();
        b = false;
        g = null;
        c = context;
        d = lu;
        h = zzk;
        e = zzb1;
        f = zzh1;
        g = f.zzg(10L);
    }

    static zzk a(zzc zzc1)
    {
        return zzc1.h;
    }

    private void a(long l)
    {
        do
        {
            if (!b(l))
            {
                zzb.v("Timeout waiting for pending transaction to be processed.");
            }
        } while (!b);
    }

    static Context b(zzc zzc1)
    {
        return zzc1.c;
    }

    private boolean b(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            a.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            zzb.zzaH("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    static lu c(zzc zzc1)
    {
        return zzc1.d;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        e.zzN(ibinder);
        if (g.isEmpty()) goto _L2; else goto _L1
_L1:
        ibinder = new HashMap();
        zzf zzf1;
        for (componentname = g.iterator(); componentname.hasNext(); ibinder.put(zzf1.zzCS, zzf1))
        {
            zzf1 = (zzf)componentname.next();
        }

          goto _L3
        componentname;
        obj;
        JVM INSTR monitorexit ;
        throw componentname;
_L3:
        componentname = null;
_L5:
        componentname = e.zzj(c.getPackageName(), componentname);
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ArrayList arraylist;
        ArrayList arraylist1;
        ArrayList arraylist2;
        if (zzp.zzbF().zzc(componentname) != 0)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist = componentname.getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        arraylist1 = componentname.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        arraylist2 = componentname.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        componentname = componentname.getString("INAPP_CONTINUATION_TOKEN");
        int i = 0;
_L6:
        if (i < arraylist.size())
        {
            if (ibinder.containsKey(arraylist.get(i)))
            {
                String s1 = (String)arraylist.get(i);
                String s2 = (String)arraylist1.get(i);
                String s3 = (String)arraylist2.get(i);
                zzf zzf2 = (zzf)ibinder.get(s1);
                String s4 = zzp.zzbF().zzao(s2);
                if (zzf2.zzCR.equals(s4))
                {
                    Intent intent = new Intent();
                    zzp.zzbF();
                    intent.putExtra("RESPONSE_CODE", 0);
                    zzp.zzbF();
                    intent.putExtra("INAPP_PURCHASE_DATA", s2);
                    zzp.zzbF();
                    intent.putExtra("INAPP_DATA_SIGNATURE", s3);
                    qa.a.post(new a(this, zzf2, intent));
                    ibinder.remove(s1);
                }
            }
            break MISSING_BLOCK_LABEL_402;
        }
        if (componentname == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!ibinder.isEmpty()) goto _L5; else goto _L4
_L4:
        String s;
        for (componentname = ibinder.keySet().iterator(); componentname.hasNext(); f.zza((zzf)ibinder.get(s)))
        {
            s = (String)componentname.next();
        }

_L2:
        b = true;
        a.notify();
        obj;
        JVM INSTR monitorexit ;
        return;
        i++;
          goto _L6
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzb.zzaG("In-app billing service disconnected.");
        e.destroy();
    }

    public void onStop()
    {
        synchronized (a)
        {
            com.google.android.gms.common.stats.b.a().a(c, this);
            e.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void zzbn()
    {
        synchronized (a)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.b.a().a(c, intent, this, 1);
            a(SystemClock.elapsedRealtime());
            com.google.android.gms.common.stats.b.a().a(c, this);
            e.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
