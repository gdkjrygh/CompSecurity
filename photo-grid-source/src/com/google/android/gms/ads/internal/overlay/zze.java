// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.wn;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            AdOverlayInfoParcel, zza

public class zze
{

    public zze()
    {
    }

    public void zza(Context context, AdOverlayInfoParcel adoverlayinfoparcel)
    {
        zza(context, adoverlayinfoparcel, true);
    }

    public void zza(Context context, AdOverlayInfoParcel adoverlayinfoparcel, boolean flag)
    {
        if (adoverlayinfoparcel.zzBJ == 4 && adoverlayinfoparcel.zzBC == null)
        {
            if (adoverlayinfoparcel.zzBB != null)
            {
                adoverlayinfoparcel.zzBB.onAdClicked();
            }
            zzp.zzbs().zza(context, adoverlayinfoparcel.zzBA, adoverlayinfoparcel.zzBI);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adoverlayinfoparcel.zzqj.zzJx);
        intent.putExtra("shouldCallOnOverlayOpened", flag);
        com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel.zza(intent, adoverlayinfoparcel);
        if (!wn.i())
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        zzp.zzbv();
        qa.a(context, intent);
    }
}
