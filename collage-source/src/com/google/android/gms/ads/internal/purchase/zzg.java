// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.purchase;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.common.stats.b;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzb, zzh, zzf

public final class zzg extends com.google.android.gms.internal.er.a
    implements ServiceConnection
{

    private Context mContext;
    com.google.android.gms.ads.internal.purchase.zzb zzBQ;
    private String zzBW;
    private zzf zzCa;
    private boolean zzCg;
    private int zzCh;
    private Intent zzCi;

    public zzg(Context context, String s, boolean flag, int i, Intent intent, zzf zzf)
    {
        zzCg = false;
        zzBW = s;
        zzCh = i;
        zzCi = intent;
        zzCg = flag;
        mContext = context;
        zzCa = zzf;
    }

    public void finishPurchase()
    {
        int i = zzp.zzbH().zzd(zzCi);
        if (zzCh != -1 || i != 0)
        {
            return;
        } else
        {
            zzBQ = new com.google.android.gms.ads.internal.purchase.zzb(mContext);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            b.a().a(mContext, intent, this, 1);
            return;
        }
    }

    public String getProductId()
    {
        return zzBW;
    }

    public Intent getPurchaseData()
    {
        return zzCi;
    }

    public int getResultCode()
    {
        return zzCh;
    }

    public boolean isVerified()
    {
        return zzCg;
    }

    public void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzb.zzaD("In-app billing service connected.");
        zzBQ.zzM(ibinder);
        componentname = zzp.zzbH().zze(zzCi);
        componentname = zzp.zzbH().zzam(componentname);
        if (componentname == null)
        {
            return;
        }
        if (zzBQ.zzi(mContext.getPackageName(), componentname) == 0)
        {
            zzh.zzx(mContext).zza(zzCa);
        }
        b.a().a(mContext, this);
        zzBQ.destroy();
    }

    public void onServiceDisconnected(ComponentName componentname)
    {
        zzb.zzaD("In-app billing service disconnected.");
        zzBQ.destroy();
    }
}
