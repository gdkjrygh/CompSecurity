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
import com.google.android.gms.internal.ls;

// Referenced classes of package com.google.android.gms.ads.internal.purchase:
//            zzi, zzb, zzh, zzf

public final class zzg extends ls
    implements ServiceConnection
{

    com.google.android.gms.ads.internal.purchase.zzb a;
    private boolean b;
    private Context c;
    private int d;
    private Intent e;
    private zzf f;
    private String g;

    public zzg(Context context, String s, boolean flag, int i, Intent intent, zzf zzf)
    {
        b = false;
        g = s;
        d = i;
        e = intent;
        b = flag;
        c = context;
        f = zzf;
    }

    public final void finishPurchase()
    {
        int i = zzp.zzbF().zzd(e);
        if (d != -1 || i != 0)
        {
            return;
        } else
        {
            a = new com.google.android.gms.ads.internal.purchase.zzb(c);
            Intent intent = new Intent("com.android.vending.billing.InAppBillingService.BIND");
            intent.setPackage("com.android.vending");
            com.google.android.gms.common.stats.b.a().a(c, intent, this, 1);
            return;
        }
    }

    public final String getProductId()
    {
        return g;
    }

    public final Intent getPurchaseData()
    {
        return e;
    }

    public final int getResultCode()
    {
        return d;
    }

    public final boolean isVerified()
    {
        return b;
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        zzb.zzaG("In-app billing service connected.");
        a.zzN(ibinder);
        componentname = zzp.zzbF().zze(e);
        componentname = zzp.zzbF().zzap(componentname);
        if (componentname == null)
        {
            return;
        }
        if (a.zzi(c.getPackageName(), componentname) == 0)
        {
            zzh.zzw(c).zza(f);
        }
        com.google.android.gms.common.stats.b.a().a(c, this);
        a.destroy();
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        zzb.zzaG("In-app billing service disconnected.");
        a.destroy();
    }
}
