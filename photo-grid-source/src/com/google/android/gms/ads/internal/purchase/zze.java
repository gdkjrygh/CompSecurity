// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.lf;
import com.google.android.gms.internal.lm;
import com.google.android.gms.internal.qd;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzh, zzj, zzi, zzk, 
//            GInAppPurchaseManagerInfoParcel, zzb, zzf

public class zze extends lm
    implements ServiceConnection
{

    zzh a;
    private final Activity b;
    private Context c;
    private lf d;
    private com.google.android.gms.ads.internal.purchase.zzb e;
    private zzf f;
    private zzj g;
    private zzk h;
    private String i;

    public zze(Activity activity)
    {
        i = null;
        b = activity;
        a = zzh.zzw(b.getApplicationContext());
    }

    private void a(String s, boolean flag, int j, Intent intent)
    {
        if (g != null)
        {
            g.zza(s, flag, j, intent, f);
        }
    }

    public void onActivityResult(int j, int k, Intent intent)
    {
        if (j != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        j = zzp.zzbF().zzd(intent);
        if (k != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        zzp.zzbF();
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (h.zza(i, k, intent))
        {
            flag = true;
        }
_L3:
        d.recordPlayBillingResolution(j);
        b.finish();
        a(d.getProductId(), flag, k, intent);
        i = null;
_L2:
        return;
        a.zza(f);
          goto _L3
        intent;
        zzb.zzaH("Fail to process purchase result.");
        b.finish();
        i = null;
        return;
        intent;
        i = null;
        throw intent;
    }

    public void onCreate()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.zzc(b.getIntent());
        g = ((GInAppPurchaseManagerInfoParcel) (obj)).zzCy;
        h = ((GInAppPurchaseManagerInfoParcel) (obj)).zzqE;
        d = ((GInAppPurchaseManagerInfoParcel) (obj)).zzCw;
        e = new com.google.android.gms.ads.internal.purchase.zzb(b.getApplicationContext());
        c = ((GInAppPurchaseManagerInfoParcel) (obj)).zzCx;
        if (b.getResources().getConfiguration().orientation == 2)
        {
            b.setRequestedOrientation(zzp.zzbx().a());
        } else
        {
            b.setRequestedOrientation(zzp.zzbx().b());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        b.bindService(((Intent) (obj)), this, 1);
    }

    public void onDestroy()
    {
        b.unbindService(this);
        e.destroy();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        e.zzN(ibinder);
        i = h.zzfq();
        componentname = e.zzb(b.getPackageName(), d.getProductId(), i);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                int j = zzp.zzbF().zzc(componentname);
                d.recordPlayBillingResolution(j);
                a(d.getProductId(), false, j, null);
                b.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_182;
        }
        f = new zzf(d.getProductId(), i);
        a.zzb(f);
        b.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        zzb.zzd("Error when connecting in-app billing service", componentname);
        b.finish();
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzb.zzaG("In-app billing service disconnected.");
        e.destroy();
    }
}
