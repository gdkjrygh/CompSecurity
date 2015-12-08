// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;

// Referenced classes of package com.google.android.gms.internal:
//            zzeg, zzic, zzbe, zzhw, 
//            zzbu, zzab, zzho, zzba, 
//            zzhx, zzhy, zzee, zzid

public class zzef extends zzeg
{

    private final Context mContext;
    private final zzic zzmu;
    private final WindowManager zznu;
    private final zzbu zztF;
    DisplayMetrics zztG;
    private float zztH;
    int zztI;
    int zztJ;
    private int zztK;
    int zztL;
    int zztM;
    int zztN;
    int zztO;

    public zzef(zzic zzic1, Context context, zzbu zzbu1)
    {
        super(zzic1);
        zztI = -1;
        zztJ = -1;
        zztL = -1;
        zztM = -1;
        zztN = -1;
        zztO = -1;
        zzmu = zzic1;
        mContext = context;
        zztF = zzbu1;
        zznu = (WindowManager)context.getSystemService("window");
    }

    private void zzcS()
    {
        zztG = new DisplayMetrics();
        Display display = zznu.getDefaultDisplay();
        display.getMetrics(zztG);
        zztH = zztG.density;
        zztK = display.getRotation();
    }

    private void zzcX()
    {
        int ai[] = new int[2];
        zzmu.getLocationOnScreen(ai);
        zzf(zzbe.zzbD().zzc(mContext, ai[0]), zzbe.zzbD().zzc(mContext, ai[1]));
    }

    private zzee zzda()
    {
        return (new zzee.zza()).zzo(zztF.zzbP()).zzn(zztF.zzbQ()).zzp(zztF.zzbU()).zzq(zztF.zzbR()).zzr(zztF.zzbS()).zzcR();
    }

    void zzcT()
    {
        zztI = zzbe.zzbD().zzb(zztG, zztG.widthPixels);
        zztJ = zzbe.zzbD().zzb(zztG, zztG.heightPixels);
        Activity activity = zzmu.zzeD();
        if (activity == null || activity.getWindow() == null)
        {
            zztL = zztI;
            zztM = zztJ;
            return;
        } else
        {
            int ai[] = zzab.zzaM().zzg(activity);
            zztL = zzbe.zzbD().zzb(zztG, ai[0]);
            zztM = zzbe.zzbD().zzb(zztG, ai[1]);
            return;
        }
    }

    void zzcU()
    {
        if (zzmu.zzad().zzpb)
        {
            zztN = zztI;
            zztO = zztJ;
            return;
        } else
        {
            zzmu.measure(0, 0);
            zztN = zzbe.zzbD().zzc(mContext, zzmu.getMeasuredWidth());
            zztO = zzbe.zzbD().zzc(mContext, zzmu.getMeasuredHeight());
            return;
        }
    }

    public void zzcV()
    {
        zzcS();
        zzcT();
        zzcU();
        zzcY();
        zzcZ();
        zzcX();
        zzcW();
    }

    void zzcW()
    {
        if (zzhx.zzA(2))
        {
            zzhx.zzaa("Dispatching Ready Event.");
        }
        zzI(zzmu.zzeJ().zzzH);
    }

    void zzcY()
    {
        zza(zztI, zztJ, zztL, zztM, zztH, zztK);
    }

    void zzcZ()
    {
        zzee zzee1 = zzda();
        zzmu.zzb("onDeviceFeaturesReceived", zzee1.toJson());
    }

    public void zzf(int i, int j)
    {
        int k;
        if (mContext instanceof Activity)
        {
            k = zzab.zzaM().zzj((Activity)mContext)[0];
        } else
        {
            k = 0;
        }
        zzc(i, j - k, zztN, zztO);
        zzmu.zzeG().zze(i, j);
    }
}
