// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzh;
import com.google.android.gms.internal.zzic;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, zza

public class zzd
{

    public zzd()
    {
    }

    public void zza(Context context, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        zza(context, adoverlayinfoparcel, true);
    }

    public void zza(Context context, AdOverlayInfoParcel adoverlayinfoparcel, boolean flag)
    {
        if (adoverlayinfoparcel.zzwF == 4 && adoverlayinfoparcel.zzwy == null)
        {
            if (adoverlayinfoparcel.zzwx != null)
            {
                adoverlayinfoparcel.zzwx.onAdClicked();
            }
            zzh.zzaN().zza(context, adoverlayinfoparcel.zzww, adoverlayinfoparcel.zzwE);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adoverlayinfoparcel.zzmJ.zzCL);
        intent.putExtra("shouldCallOnOverlayOpened", flag);
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(intent, adoverlayinfoparcel);
        if (!zzic.zznl())
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }
}
