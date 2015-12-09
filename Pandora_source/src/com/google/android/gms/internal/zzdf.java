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
import com.google.android.gms.ads.internal.client.zzj;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzh;

// Referenced classes of package com.google.android.gms.internal:
//            zzdg, zzgd, zzak, zzfl, 
//            zzde, zzge

public class zzdf extends zzdg
{

    private final Context mContext;
    private final zzgd zznp;
    private final WindowManager zzor;
    private final zzak zzvO;
    DisplayMetrics zzvP;
    private float zzvQ;
    int zzvR;
    int zzvS;
    private int zzvT;
    int zzvU;
    int zzvV;
    int zzvW;
    int zzvX;

    public zzdf(zzgd zzgd1, Context context, zzak zzak1)
    {
        super(zzgd1);
        zzvR = -1;
        zzvS = -1;
        zzvU = -1;
        zzvV = -1;
        zzvW = -1;
        zzvX = -1;
        zznp = zzgd1;
        mContext = context;
        zzvO = zzak1;
        zzor = (WindowManager)context.getSystemService("window");
    }

    private void zzdj()
    {
        zzvP = new DisplayMetrics();
        Display display = zzor.getDefaultDisplay();
        display.getMetrics(zzvP);
        zzvQ = zzvP.density;
        zzvT = display.getRotation();
    }

    private void zzdo()
    {
        int ai[] = new int[2];
        zznp.getLocationOnScreen(ai);
        zze(zzj.zzbJ().zzc(mContext, ai[0]), zzj.zzbJ().zzc(mContext, ai[1]));
    }

    private zzde zzdr()
    {
        return (new zzde.zza()).zzp(zzvO.zzbV()).zzo(zzvO.zzbW()).zzq(zzvO.zzca()).zzr(zzvO.zzbX()).zzs(zzvO.zzbY()).zzdi();
    }

    void zzdk()
    {
        zzvR = zzj.zzbJ().zzb(zzvP, zzvP.widthPixels);
        zzvS = zzj.zzbJ().zzb(zzvP, zzvP.heightPixels);
        Activity activity = zznp.zzfp();
        if (activity == null || activity.getWindow() == null)
        {
            zzvU = zzvR;
            zzvV = zzvS;
            return;
        } else
        {
            int ai[] = zzh.zzaQ().zzg(activity);
            zzvU = zzj.zzbJ().zzb(zzvP, ai[0]);
            zzvV = zzj.zzbJ().zzb(zzvP, ai[1]);
            return;
        }
    }

    void zzdl()
    {
        if (zznp.zzah().zzpY)
        {
            zzvW = zzvR;
            zzvX = zzvS;
            return;
        } else
        {
            zznp.measure(0, 0);
            zzvW = zzj.zzbJ().zzc(mContext, zznp.getMeasuredWidth());
            zzvX = zzj.zzbJ().zzc(mContext, zznp.getMeasuredHeight());
            return;
        }
    }

    public void zzdm()
    {
        zzdj();
        zzdk();
        zzdl();
        zzdp();
        zzdq();
        zzdo();
        zzdn();
    }

    void zzdn()
    {
        if (zzb.zzC(2))
        {
            zzb.zzal("Dispatching Ready Event.");
        }
        zzR(zznp.zzfw().zzCI);
    }

    void zzdp()
    {
        zza(zzvR, zzvS, zzvU, zzvV, zzvQ, zzvT);
    }

    void zzdq()
    {
        zzde zzde1 = zzdr();
        zznp.zzb("onDeviceFeaturesReceived", zzde1.toJson());
    }

    public void zze(int i, int j)
    {
        int k;
        if (mContext instanceof Activity)
        {
            k = zzh.zzaQ().zzj((Activity)mContext)[0];
        } else
        {
            k = 0;
        }
        zzc(i, j - k, zzvW, zzvX);
        zznp.zzft().zzd(i, j);
    }
}
