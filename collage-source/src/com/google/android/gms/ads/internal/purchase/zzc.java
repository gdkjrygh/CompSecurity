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
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.stats.b;
import com.google.android.gms.internal.es;
import com.google.android.gms.internal.gs;
import com.google.android.gms.internal.gw;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzb, zzh, zzf, zzi, 
//            zzk, zzg

public class zzc extends gs
    implements ServiceConnection
{

    private Context mContext;
    private boolean zzBO;
    private es zzBP;
    private com.google.android.gms.ads.internal.purchase.zzb zzBQ;
    private zzh zzBR;
    private List zzBS;
    private zzk zzBT;
    private final Object zzpc;

    public zzc(Context context, es es, zzk zzk)
    {
        this(context, es, zzk, new com.google.android.gms.ads.internal.purchase.zzb(context), zzh.zzx(context.getApplicationContext()));
    }

    zzc(Context context, es es, zzk zzk, com.google.android.gms.ads.internal.purchase.zzb zzb1, zzh zzh1)
    {
        zzpc = new Object();
        zzBO = false;
        zzBS = null;
        mContext = context;
        zzBP = es;
        zzBT = zzk;
        zzBQ = zzb1;
        zzBR = zzh1;
        zzBS = zzBR.zzf(10L);
    }

    static zzk zza(zzc zzc1)
    {
        return zzc1.zzBT;
    }

    static Context zzb(zzc zzc1)
    {
        return zzc1.mContext;
    }

    static es zzc(zzc zzc1)
    {
        return zzc1.zzBP;
    }

    private void zzd(long l)
    {
        do
        {
            if (!zze(l))
            {
                com.google.android.gms.ads.internal.util.client.zzb.v("Timeout waiting for pending transaction to be processed.");
            }
        } while (!zzBO);
    }

    private boolean zze(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzpc.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzaE("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (zzpc)
        {
            zzBQ.zzM(ibinder);
            zzfg();
            zzBO = true;
            zzpc.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzaD("In-app billing service disconnected.");
        zzBQ.destroy();
    }

    public void onStop()
    {
        synchronized (zzpc)
        {
            b.a().a(mContext, this);
            zzBQ.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zza(final zzf final_zzf1, String s, String s1)
    {
        Intent intent = new Intent();
        zzp.zzbH();
        intent.putExtra("RESPONSE_CODE", 0);
        zzp.zzbH();
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        zzp.zzbH();
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        gw.a.post(new Runnable(intent) {

            final Intent val$intent;
            final zzf zzBU;
            final zzc zzBV;

            public void run()
            {
                if (zzc.zza(zzBV).zza(zzBU.zzCe, -1, intent))
                {
                    zzc.zzc(zzBV).a(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzBV), zzBU.zzCf, true, -1, intent, zzBU));
                    return;
                }
                try
                {
                    zzc.zzc(zzBV).a(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(zzBV), zzBU.zzCf, false, -1, intent, zzBU));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzaE("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                zzBV = zzc.this;
                zzBU = final_zzf1;
                intent = intent1;
                super();
            }
        });
    }

    public void zzdG()
    {
        synchronized (zzpc)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            b.a().a(mContext, intent, this, 1);
            zzd(SystemClock.elapsedRealtime());
            b.a().a(mContext, this);
            zzBQ.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzfg()
    {
        if (!zzBS.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        zzf zzf1;
        for (Iterator iterator = zzBS.iterator(); iterator.hasNext(); hashmap.put(zzf1.zzCf, zzf1))
        {
            zzf1 = (zzf)iterator.next();
        }

        obj = null;
_L6:
        obj = zzBQ.zzj(mContext.getPackageName(), ((String) (obj)));
          goto _L3
_L5:
        obj = hashmap.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            zzBR.zza((zzf)hashmap.get(s));
        }
          goto _L1
_L3:
        if (obj == null || zzp.zzbH().zzc(((Bundle) (obj))) != 0) goto _L5; else goto _L4
_L4:
        ArrayList arraylist = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_ITEM_LIST");
        ArrayList arraylist1 = ((Bundle) (obj)).getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList arraylist2 = ((Bundle) (obj)).getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        obj = ((Bundle) (obj)).getString("INAPP_CONTINUATION_TOKEN");
        for (int i = 0; i < arraylist.size(); i++)
        {
            if (!hashmap.containsKey(arraylist.get(i)))
            {
                continue;
            }
            String s1 = (String)arraylist.get(i);
            String s2 = (String)arraylist1.get(i);
            String s3 = (String)arraylist2.get(i);
            zzf zzf2 = (zzf)hashmap.get(s1);
            String s4 = zzp.zzbH().zzal(s2);
            if (zzf2.zzCe.equals(s4))
            {
                zza(zzf2, s2, s3);
                hashmap.remove(s1);
            }
        }

        if (obj == null || hashmap.isEmpty()) goto _L5; else goto _L6
    }
}
