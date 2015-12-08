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
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.zzdv;
import com.google.android.gms.internal.zzfh;
import com.google.android.gms.internal.zzfl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzb, zzh, zzf, zzi, 
//            zzk, zzg

public class zzc extends zzfh
    implements ServiceConnection
{

    private Context mContext;
    private final Object zzoe;
    private boolean zzxq;
    private zzdv zzxr;
    private com.google.android.gms.ads.internal.purchase.zzb zzxs;
    private com.google.android.gms.ads.internal.purchase.zzh zzxt;
    private List zzxu;
    private zzk zzxv;

    public zzc(Context context, zzdv zzdv, zzk zzk)
    {
        this(context, zzdv, zzk, new com.google.android.gms.ads.internal.purchase.zzb(context), zzh.zzq(context.getApplicationContext()));
    }

    zzc(Context context, zzdv zzdv, zzk zzk, com.google.android.gms.ads.internal.purchase.zzb zzb1, com.google.android.gms.ads.internal.purchase.zzh zzh1)
    {
        zzoe = new Object();
        zzxq = false;
        zzxu = null;
        mContext = context;
        zzxr = zzdv;
        zzxv = zzk;
        zzxs = zzb1;
        zzxt = zzh1;
        zzxu = zzxt.zze(10L);
    }

    static zzk zza(zzc zzc1)
    {
        return zzc1.zzxv;
    }

    static Context zzb(zzc zzc1)
    {
        return zzc1.mContext;
    }

    static zzdv zzc(zzc zzc1)
    {
        return zzc1.zzxr;
    }

    private void zzc(long l)
    {
        do
        {
            if (!zzd(l))
            {
                com.google.android.gms.ads.internal.util.client.zzb.zzam("Timeout waiting for pending transaction to be processed.");
            }
        } while (!zzxq);
    }

    private boolean zzd(long l)
    {
        l = 60000L - (SystemClock.elapsedRealtime() - l);
        if (l <= 0L)
        {
            return false;
        }
        try
        {
            zzoe.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            com.google.android.gms.ads.internal.util.client.zzb.zzan("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (zzoe)
        {
            zzxs.zzu(ibinder);
            zzdX();
            zzxq = true;
            zzoe.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("In-app billing service disconnected.");
        zzxs.destroy();
    }

    public void onStop()
    {
        synchronized (zzoe)
        {
            com.google.android.gms.common.stats.zzb.zznb().zza(mContext, this);
            zzxs.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zza(zzf zzf1, String s, String s1)
    {
        Intent intent = new Intent();
        zzh.zzaZ();
        intent.putExtra("RESPONSE_CODE", 0);
        zzh.zzaZ();
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        zzh.zzaZ();
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        zzfl.zzCr.post(new Runnable(zzf1, intent) {

            final zzf a;
            final Intent b;
            final zzc c;

            public void run()
            {
                if (zzc.zza(c).zza(a.zzxH, -1, b))
                {
                    zzc.zzc(c).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(c), a.zzxI, true, -1, b, a));
                    return;
                }
                try
                {
                    zzc.zzc(c).zza(new zzg(com.google.android.gms.ads.internal.purchase.zzc.zzb(c), a.zzxI, false, -1, b, a));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzan("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                c = zzc.this;
                a = zzf1;
                b = intent;
                super();
            }
        });
    }

    public void zzcX()
    {
        synchronized (zzoe)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.zzb.zznb().zza(mContext, intent, this, 1);
            zzc(SystemClock.elapsedRealtime());
            com.google.android.gms.common.stats.zzb.zznb().zza(mContext, this);
            zzxs.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzdX()
    {
        if (!zzxu.isEmpty()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        HashMap hashmap;
        hashmap = new HashMap();
        zzf zzf1;
        for (Iterator iterator = zzxu.iterator(); iterator.hasNext(); hashmap.put(zzf1.zzxI, zzf1))
        {
            zzf1 = (zzf)iterator.next();
        }

        obj = null;
_L6:
        obj = zzxs.zzi(mContext.getPackageName(), ((String) (obj)));
          goto _L3
_L5:
        obj = hashmap.keySet().iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            String s = (String)((Iterator) (obj)).next();
            zzxt.zza((zzf)hashmap.get(s));
        }
          goto _L1
_L3:
        if (obj == null || zzh.zzaZ().zzb(((Bundle) (obj))) != 0) goto _L5; else goto _L4
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
            String s4 = zzh.zzaZ().zzU(s2);
            if (zzf2.zzxH.equals(s4))
            {
                zza(zzf2, s2, s3);
                hashmap.remove(s1);
            }
        }

        if (obj == null || hashmap.isEmpty()) goto _L5; else goto _L6
    }
}
