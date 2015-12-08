// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

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

// Referenced classes of package com.google.android.gms.internal:
//            zzfi, zzab, zzfj, zzfl, 
//            zzfn, zzhx, zzfb, zzfc, 
//            zzhp, zzfg, zzfk

public class zzff extends zzfp.zza
    implements ServiceConnection
{

    private final Activity zzoi;
    private zzfc zzuY;
    zzfi zzuZ;
    private zzfl zzvb;
    private Context zzvh;
    private zzfn zzvi;
    private zzfg zzvj;
    private zzfk zzvk;
    private String zzvl;

    public zzff(Activity activity)
    {
        zzvl = null;
        zzoi = activity;
        zzuZ = zzfi.zzm(zzoi.getApplicationContext());
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i != 1001) goto _L2; else goto _L1
_L1:
        boolean flag = false;
        i = zzab.zzaU().zzd(intent);
        if (j != -1)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        zzab.zzaU();
        if (i != 0)
        {
            break MISSING_BLOCK_LABEL_90;
        }
        if (zzvb.zza(zzvl, j, intent))
        {
            flag = true;
        }
_L3:
        zzvi.recordPlayBillingResolution(i);
        zzoi.finish();
        zza(zzvi.getProductId(), flag, j, intent);
        zzvl = null;
_L2:
        return;
        zzuZ.zza(zzvj);
          goto _L3
        intent;
        zzhx.zzac("Fail to process purchase result.");
        zzoi.finish();
        zzvl = null;
        return;
        intent;
        zzvl = null;
        throw intent;
    }

    public void onCreate()
    {
        Object obj = zzfb.zzc(zzoi.getIntent());
        zzvk = ((zzfb) (obj)).zzuU;
        zzvb = ((zzfb) (obj)).zzmg;
        zzvi = ((zzfb) (obj)).zzuS;
        zzuY = new zzfc(zzoi.getApplicationContext());
        zzvh = ((zzfb) (obj)).zzuT;
        if (zzoi.getResources().getConfiguration().orientation == 2)
        {
            zzoi.setRequestedOrientation(zzab.zzaO().zzex());
        } else
        {
            zzoi.setRequestedOrientation(zzab.zzaO().zzey());
        }
        obj = new Intent("com.android.vending.billing.InAppBillingService.BIND");
        ((Intent) (obj)).setPackage("com.android.vending");
        zzoi.bindService(((Intent) (obj)), this, 1);
    }

    public void onDestroy()
    {
        zzoi.unbindService(this);
        zzuY.destroy();
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzuY.zzx(ibinder);
        zzvl = zzvb.zzdB();
        componentname = zzuY.zzb(zzoi.getPackageName(), zzvi.getProductId(), zzvl);
        ibinder = (PendingIntent)componentname.getParcelable("BUY_INTENT");
        if (ibinder == null)
        {
            try
            {
                int i = zzab.zzaU().zzf(componentname);
                zzvi.recordPlayBillingResolution(i);
                zza(zzvi.getProductId(), false, i, null);
                zzoi.finish();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            // Misplaced declaration of an exception variable
            catch (ComponentName componentname) { }
            break MISSING_BLOCK_LABEL_182;
        }
        zzvj = new zzfg(zzvi.getProductId(), zzvl);
        zzuZ.zzb(zzvj);
        zzoi.startIntentSenderForResult(ibinder.getIntentSender(), 1001, new Intent(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue(), Integer.valueOf(0).intValue());
        return;
        zzhx.zzd("Error when connecting in-app billing service", componentname);
        zzoi.finish();
        return;
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzhx.zzaa("In-app billing service disconnected.");
        zzuY.destroy();
    }

    protected void zza(String s, boolean flag, int i, Intent intent)
    {
        if (zzvk != null)
        {
            zzvk.zza(s, flag, i, intent, zzvj);
        }
    }
}
