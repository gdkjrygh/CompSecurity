// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            zzhl, zzfc, zzfi, zzhx, 
//            zzlo, zzab, zzhw, zzfg, 
//            zzfj, zzfs, zzfl, zzfh

public class zzfd extends zzhl
    implements ServiceConnection
{

    private Context mContext;
    private final Object zznh;
    private boolean zzuW;
    private zzfs zzuX;
    private zzfc zzuY;
    private zzfi zzuZ;
    private List zzva;
    private zzfl zzvb;

    public zzfd(Context context, zzfs zzfs, zzfl zzfl)
    {
        this(context, zzfs, zzfl, new zzfc(context), zzfi.zzm(context.getApplicationContext()));
    }

    zzfd(Context context, zzfs zzfs, zzfl zzfl, zzfc zzfc1, zzfi zzfi1)
    {
        zznh = new Object();
        zzuW = false;
        zzva = null;
        mContext = context;
        zzuX = zzfs;
        zzvb = zzfl;
        zzuY = zzfc1;
        zzuZ = zzfi1;
        zzva = zzuZ.zze(10L);
    }

    static zzfl zza(zzfd zzfd1)
    {
        return zzfd1.zzvb;
    }

    static Context zzb(zzfd zzfd1)
    {
        return zzfd1.mContext;
    }

    static zzfs zzc(zzfd zzfd1)
    {
        return zzfd1.zzuX;
    }

    private void zzc(long l)
    {
        do
        {
            if (!zzd(l))
            {
                zzhx.zzab("Timeout waiting for pending transaction to be processed.");
            }
        } while (!zzuW);
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
            zznh.wait(l);
        }
        catch (InterruptedException interruptedexception)
        {
            zzhx.zzac("waitWithTimeout_lock interrupted");
        }
        return true;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        synchronized (zznh)
        {
            zzuY.zzx(ibinder);
            zzdx();
            zzuW = true;
            zznh.notify();
        }
        return;
        ibinder;
        componentname;
        JVM INSTR monitorexit ;
        throw ibinder;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzhx.zzaa("In-app billing service disconnected.");
        zzuY.destroy();
    }

    public void onStop()
    {
        synchronized (zznh)
        {
            zzlo.zzka().zza(mContext, this);
            zzuY.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zza(zzfg zzfg1, String s, String s1)
    {
        Intent intent = new Intent();
        zzab.zzaU();
        intent.putExtra("RESPONSE_CODE", 0);
        zzab.zzaU();
        intent.putExtra("INAPP_PURCHASE_DATA", s);
        zzab.zzaU();
        intent.putExtra("INAPP_DATA_SIGNATURE", s1);
        zzhw.zzzG.post(new Runnable(zzfg1, intent) {

            final zzfg zzvc;
            final Intent zzvd;
            final zzfd zzve;

            public void run()
            {
                if (zzfd.zza(zzve).zza(zzvc.zzvn, -1, zzvd))
                {
                    zzfd.zzc(zzve).zza(new zzfh(zzfd.zzb(zzve), zzvc.zzvo, true, -1, zzvd, zzvc));
                    return;
                }
                try
                {
                    zzfd.zzc(zzve).zza(new zzfh(zzfd.zzb(zzve), zzvc.zzvo, false, -1, zzvd, zzvc));
                    return;
                }
                catch (RemoteException remoteexception)
                {
                    zzhx.zzac("Fail to verify and dispatch pending transaction");
                }
                return;
            }

            
            {
                zzve = zzfd.this;
                zzvc = zzfg1;
                zzvd = intent;
                super();
            }
        });
    }

    public void zzdw()
    {
        synchronized (zznh)
        {
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            zzlo.zzka().zza(mContext, intent, this, 1);
            zzc(SystemClock.elapsedRealtime());
            zzlo.zzka().zza(mContext, this);
            zzuY.destroy();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void zzdx()
    {
        if (!zzva.isEmpty())
        {
            HashMap hashmap = new HashMap();
            zzfg zzfg1;
            for (Iterator iterator = zzva.iterator(); iterator.hasNext(); hashmap.put(zzfg1.zzvo, zzfg1))
            {
                zzfg1 = (zzfg)iterator.next();
            }

            Object obj = null;
            do
            {
                obj = zzuY.zzh(mContext.getPackageName(), ((String) (obj)));
                if (obj == null || zzab.zzaU().zzf(((Bundle) (obj))) != 0)
                {
                    break;
                }
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
                    zzfg zzfg2 = (zzfg)hashmap.get(s1);
                    String s4 = zzab.zzaU().zzL(s2);
                    if (zzfg2.zzvn.equals(s4))
                    {
                        zza(zzfg2, s2, s3);
                        hashmap.remove(s1);
                    }
                }

            } while (obj != null && !hashmap.isEmpty());
            obj = hashmap.keySet().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                String s = (String)((Iterator) (obj)).next();
                zzuZ.zza((zzfg)hashmap.get(s));
            }
        }
    }
}
