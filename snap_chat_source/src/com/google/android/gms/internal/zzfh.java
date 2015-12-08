// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.google.android.gms.internal:
//            zzab, zzfj, zzfc, zzlo, 
//            zzhx, zzfi, zzfg

public final class zzfh extends zzfr.zza
    implements ServiceConnection
{

    private Context mContext;
    zzfc zzuY;
    private String zzvf;
    private zzfg zzvj;
    private boolean zzvp;
    private int zzvq;
    private Intent zzvr;

    public zzfh(Context context, String s, boolean flag, int i, Intent intent, zzfg zzfg)
    {
        zzvp = false;
        zzvf = s;
        zzvq = i;
        zzvr = intent;
        zzvp = flag;
        mContext = context;
        zzvj = zzfg;
    }

    public final void finishPurchase()
    {
        int i = zzab.zzaU().zzd(zzvr);
        if (zzvq != -1 || i != 0)
        {
            return;
        } else
        {
            zzuY = new zzfc(mContext);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            zzlo.zzka().zza(mContext, intent, this, 1);
            return;
        }
    }

    public final String getProductId()
    {
        return zzvf;
    }

    public final Intent getPurchaseData()
    {
        return zzvr;
    }

    public final int getResultCode()
    {
        return zzvq;
    }

    public final boolean isVerified()
    {
        return zzvp;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzhx.zzaa("In-app billing service connected.");
        zzuY.zzx(ibinder);
        componentname = zzab.zzaU().zze(zzvr);
        componentname = zzab.zzaU().zzM(componentname);
        if (componentname == null)
        {
            return;
        }
        if (zzuY.zzg(mContext.getPackageName(), componentname) == 0)
        {
            zzfi.zzm(mContext).zza(zzvj);
        }
        zzlo.zzka().zza(mContext, this);
        zzuY.destroy();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        zzhx.zzaa("In-app billing service disconnected.");
        zzuY.destroy();
    }
}
