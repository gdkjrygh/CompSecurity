// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import java.util.HashSet;
import java.util.List;

// Referenced classes of package com.google.android.gms.internal:
//            zzt, zzba, zzab, zzho, 
//            zzk, zzw, zzhp, zzhe, 
//            zzic, zzid, zzbe, zzhw, 
//            zzds, zzhx, zzhl, zzhy, 
//            zzbg, zzbh, zzhf, zzbk, 
//            zzfs, zzfo, zzcq, zzcr, 
//            zzcj, zzfl, zzhj, zzbl

static class zzlO
    implements android.view.Observer.OnGlobalLayoutListener
{

    public final String zzlM;
    public final Context zzlN;
    public final zzk zzlO;
    public final zzhy zzlP;
    public zzhl zzlQ;
    public zzbg zzlR;
    public zzlW zzlS;
    public zzbh zzlT;
    public zzhl zzlU;
    public zzba zzlV;
    public zzhe zzlW;
    public  zzlX;
    public zzhf zzlY;
    public zzbk zzlZ;
    public zzfs zzma;
    public zzfo zzmb;
    public zzcq zzmc;
    public zzcr zzmd;
    public zzcj zzme;
    public List zzmf;
    public zzfl zzmg;
    public zzhj zzmh;
    public View zzmi;
    public int zzmj;
    public boolean zzmk;
    public boolean zzml;
    public zzbl zzmm;
    private HashSet zzmn;
    private int zzmo;
    private int zzmp;

    public void destroy()
    {
        zzlT = null;
        zzlZ = null;
        zzma = null;
        zzmb = null;
        zzme = null;
        zzmm = null;
        if (zzlN != null && (zzlN instanceof Activity) && zzlS != null)
        {
            zzab.zzaO().zzb((Activity)zzlN, this);
        }
        zzf(false);
        if (zzlS != null)
        {
            zzlS.removeAllViews();
        }
        zzay();
        zzaA();
        zzlW = null;
    }

    public void onGlobalLayout()
    {
        if (zzlS != null && zzlW != null && zzlW.zzuq != null && zzlW.zzuq.zzeG().zzba())
        {
            int ai[] = new int[2];
            zzlS.getLocationOnScreen(ai);
            int i = zzbe.zzbD().zzc(zzlN, ai[0]);
            int j = zzbe.zzbD().zzc(zzlN, ai[1]);
            if (i != zzmo || j != zzmp)
            {
                zzmo = i;
                zzmp = j;
                zzlW.zzuq.zzeG().zzb(zzmo, zzmp);
                return;
            }
        }
    }

    public void zza(HashSet hashset)
    {
        zzmn = hashset;
    }

    public void zzaA()
    {
        if (zzlW == null || zzlW.zzsM == null)
        {
            break MISSING_BLOCK_LABEL_29;
        }
        zzlW.zzsM.destroy();
        return;
        RemoteException remoteexception;
        remoteexception;
        zzhx.zzac("Could not destroy mediation adapter.");
        return;
    }

    public HashSet zzax()
    {
        return zzmn;
    }

    public void zzay()
    {
        if (zzlW != null && zzlW.zzuq != null)
        {
            zzlW.zzuq.destroy();
        }
    }

    public void zzaz()
    {
        if (zzlW != null && zzlW.zzuq != null)
        {
            zzlW.zzuq.stopLoading();
        }
    }

    public void zzf(boolean flag)
    {
        if (zzmj == 0)
        {
            zzaz();
        }
        if (zzlQ != null)
        {
            zzlQ.cancel();
        }
        if (zzlU != null)
        {
            zzlU.cancel();
        }
        if (flag)
        {
            zzlW = null;
        }
    }

    public (Context context, zzba zzba1, String s, zzhy zzhy)
    {
        this(context, zzba1, s, zzhy, null);
    }

    ener(Context context, zzba zzba1, String s, zzhy zzhy, zzk zzk1)
    {
        zzmh = null;
        zzmi = null;
        zzmj = 0;
        zzmk = false;
        zzml = false;
        zzmn = null;
        zzmo = -1;
        zzmp = -1;
        if (zzba1.zzpb)
        {
            zzlS = null;
        } else
        {
            zzlS = new <init>(context);
            zzlS.setMinimumWidth(zzba1.widthPixels);
            zzlS.setMinimumHeight(zzba1.heightPixels);
            zzlS.setVisibility(4);
        }
        if (context != null && (context instanceof Activity) && zzlS != null)
        {
            zzab.zzaM().zza((Activity)context, this);
        }
        zzlV = zzba1;
        zzlM = s;
        zzlN = context;
        zzlP = zzhy;
        if (zzk1 == null)
        {
            zzk1 = new zzk(new zzw(this));
        }
        zzlO = zzk1;
    }
}
