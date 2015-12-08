// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.zzk;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzo;

// Referenced classes of package com.google.android.gms.internal:
//            zzeu, zzid, zzbq, zzhl, 
//            zzie, zzes

public class zzet extends zzeu
{

    private final Context mContext;
    private final zzid zzoA;
    private final WindowManager zzqF;
    private final zzbq zzyT;
    DisplayMetrics zzyU;
    private float zzyV;
    int zzyW;
    int zzyX;
    private int zzyY;
    int zzyZ;
    int zzza;
    int zzzb;
    int zzzc;

    public zzet(zzid zzid1, Context context, zzbq zzbq1)
    {
        super(zzid1);
        zzyW = -1;
        zzyX = -1;
        zzyZ = -1;
        zzza = -1;
        zzzb = -1;
        zzzc = -1;
        zzoA = zzid1;
        mContext = context;
        zzyT = zzbq1;
        zzqF = (WindowManager)context.getSystemService("window");
    }

    private void zzeh()
    {
        zzyU = new DisplayMetrics();
        Display display = zzqF.getDefaultDisplay();
        display.getMetrics(zzyU);
        zzyV = zzyU.density;
        zzyY = display.getRotation();
    }

    private void zzem()
    {
        int ai[] = new int[2];
        zzoA.getLocationOnScreen(ai);
        zze(zzk.zzcA().zzc(mContext, ai[0]), zzk.zzcA().zzc(mContext, ai[1]));
    }

    private zzes zzep()
    {
        return (new zzes.zza()).zzp(zzyT.zzcQ()).zzo(zzyT.zzcR()).zzq(zzyT.zzcV()).zzr(zzyT.zzcS()).zzs(zzyT.zzcT()).zzeg();
    }

    public void zze(int i, int j)
    {
        int k;
        if (mContext instanceof Activity)
        {
            k = zzo.zzbv().zzj((Activity)mContext)[0];
        } else
        {
            k = 0;
        }
        zzc(i, j - k, zzzb, zzzc);
        zzoA.zzgF().zzd(i, j);
    }

    void zzei()
    {
        zzyW = zzk.zzcA().zzb(zzyU, zzyU.widthPixels);
        zzyX = zzk.zzcA().zzb(zzyU, zzyU.heightPixels);
        Activity activity = zzoA.zzgB();
        if (activity == null || activity.getWindow() == null)
        {
            zzyZ = zzyW;
            zzza = zzyX;
            return;
        } else
        {
            int ai[] = zzo.zzbv().zzg(activity);
            zzyZ = zzk.zzcA().zzb(zzyU, ai[0]);
            zzza = zzk.zzcA().zzb(zzyU, ai[1]);
            return;
        }
    }

    void zzej()
    {
        if (zzoA.zzaN().zzsn)
        {
            zzzb = zzyW;
            zzzc = zzyX;
            return;
        } else
        {
            zzoA.measure(0, 0);
            zzzb = zzk.zzcA().zzc(mContext, zzoA.getMeasuredWidth());
            zzzc = zzk.zzcA().zzc(mContext, zzoA.getMeasuredHeight());
            return;
        }
    }

    public void zzek()
    {
        zzeh();
        zzei();
        zzej();
        zzen();
        zzeo();
        zzem();
        zzel();
    }

    void zzel()
    {
        if (zzb.zzL(2))
        {
            zzb.zzaA("Dispatching Ready Event.");
        }
        zzaf(zzoA.zzgI().zzGG);
    }

    void zzen()
    {
        zza(zzyW, zzyX, zzyZ, zzza, zzyV, zzyY);
    }

    void zzeo()
    {
        zzes zzes1 = zzep();
        zzoA.zzb("onDeviceFeaturesReceived", zzes1.toJson());
    }
}
