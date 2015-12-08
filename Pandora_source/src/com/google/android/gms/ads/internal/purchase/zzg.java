// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.common.stats.zzb;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzb, zzh, zzf

public final class zzg extends com.google.android.gms.internal.zzdu.zza
    implements ServiceConnection
{

    private Context mContext;
    private zzf zzxD;
    private boolean zzxJ;
    private int zzxK;
    private Intent zzxL;
    com.google.android.gms.ads.internal.purchase.zzb zzxs;
    private String zzxz;

    public zzg(Context context, String s, boolean flag, int i, Intent intent, zzf zzf)
    {
        zzxJ = false;
        zzxz = s;
        zzxK = i;
        zzxL = intent;
        zzxJ = flag;
        mContext = context;
        zzxD = zzf;
    }

    public void finishPurchase()
    {
        int i = zzh.zzaZ().zzd(zzxL);
        if (zzxK != -1 || i != 0)
        {
            return;
        } else
        {
            zzxs = new com.google.android.gms.ads.internal.purchase.zzb(mContext);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            zzb.zznb().zza(mContext, intent, this, 1);
            return;
        }
    }

    public String getProductId()
    {
        return zzxz;
    }

    public Intent getPurchaseData()
    {
        return zzxL;
    }

    public int getResultCode()
    {
        return zzxK;
    }

    public boolean isVerified()
    {
        return zzxJ;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("In-app billing service connected.");
        zzxs.zzu(ibinder);
        componentname = zzh.zzaZ().zze(zzxL);
        componentname = zzh.zzaZ().zzV(componentname);
        if (componentname == null)
        {
            return;
        }
        if (zzxs.zzh(mContext.getPackageName(), componentname) == 0)
        {
            zzh.zzq(mContext).zza(zzxD);
        }
        zzb.zznb().zza(mContext, this);
        zzxs.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        com.google.android.gms.ads.internal.util.client.zzb.zzal("In-app billing service disconnected.");
        zzxs.destroy();
    }
}
