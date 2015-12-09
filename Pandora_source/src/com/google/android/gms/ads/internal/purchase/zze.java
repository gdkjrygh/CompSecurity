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
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.zzdq;
import com.google.android.gms.internal.zzfm;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzh, zzi, zzk, GInAppPurchaseManagerInfoParcel, 
//            zzb, zzf, zzj

public class zze extends com.google.android.gms.internal.zzds.zza
    implements ServiceConnection
{

    private final Activity zzpf;
    private Context zzxB;
    private zzdq zzxC;
    private zzf zzxD;
    private zzj zzxE;
    private String zzxF;
    private com.google.android.gms.ads.internal.purchase.zzb zzxs;
    com.google.android.gms.ads.internal.purchase.zzh zzxt;
    private zzk zzxv;

    public zze(Activity activity)
    {
        zzxF = null;
        zzpf = activity;
        zzxt = zzh.zzq(zzpf.getApplicationContext());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        i = zzh.zzaZ().zzd(intent);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        zzh.zzaZ();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzxv.zza(zzxF, j, intent))
        {
            flag = true;
        }
_L3:
        zzxC.recordPlayBillingResolution(i);
        zzpf.finish();
        zza(zzxC.getProductId(), flag, j, intent);
        zzxF = null;
_L2:
        return;
        zzxt.zza(zzxD);
          goto _L3
        intent;
        zzb.zzan("Fail to process purchase result.");
        zzpf.finish();
        zzxF = null;
        return;
        intent;
        zzxF = null;
        throw intent;
    }

    public void onCreate()
    {
        Object obj = GInAppPurchaseManagerInfoParcel.zzc(zzpf.getIntent());
        zzxE = ((GInAppPurchaseManagerInfoParcel) (obj)).zzxo;
        zzxv = ((GInAppPurchaseManagerInfoParcel) (obj)).zzna;
        zzxC = ((GInAppPurchaseManagerInfoParcel) (obj)).zzxm;
        zzxs = new com.google.android.gms.ads.internal.purchase.zzb(zzpf.getApplicationContext());
        zzxB = ((GInAppPurchaseManagerInfoParcel) (obj)).zzxn;
        if (zzpf.getResources().getConfiguration().orientation == 2)
        {
            zzpf.setRequestedOrientation(zzh.zzaS().zzfe());
        } else
        {
            zzpf.setRequestedOrientation(zzh.zzaS().zzff());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        zzpf.bindService(((Intent) (obj)), this, 1);
    }

    public void onDestroy()
    {
        zzpf.unbindService(this);
        zzxs.destroy();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzxs.zzu(ibinder);
        zzxF = zzxv.zzeb();
        componentname = zzxs.zzb(zzpf.getPackageName(), zzxC.getProductId(), zzxF);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                int i = zzh.zzaZ().zzb(componentname);
                zzxC.recordPlayBillingResolution(i);
                zza(zzxC.getProductId(), false, i, null);
                zzpf.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_182;
        }
        zzxD = new zzf(zzxC.getProductId(), zzxF);
        zzxt.zzb(zzxD);
        zzpf.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        zzb.zzd("Error when connecting in-app billing service", componentname);
        zzpf.finish();
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzb.zzal("In-app billing service disconnected.");
        zzxs.destroy();
    }

    protected void zza(String s, boolean flag, int i, Intent intent)
    {
        if (zzxE != null)
        {
            zzxE.zza(s, flag, i, intent, zzxD);
        }
    }
}
