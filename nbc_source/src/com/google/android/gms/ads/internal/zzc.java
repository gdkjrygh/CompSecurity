// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.RemoteException;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzci;
import com.google.android.gms.internal.zzef;
import com.google.android.gms.internal.zzev;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzha;
import com.google.android.gms.internal.zzhl;
import com.google.android.gms.internal.zzhn;
import com.google.android.gms.internal.zzid;
import com.google.android.gms.internal.zzie;
import com.google.android.gms.internal.zzif;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzb, zzf, zzp, zzo, 
//            zzd

public abstract class zzc extends com.google.android.gms.ads.internal.zzb
    implements zzf, zzev
{

    public zzc(Context context, AdSizeParcel adsizeparcel, String s, zzef zzef, VersionInfoParcel versioninfoparcel)
    {
        super(context, adsizeparcel, s, zzef, versioninfoparcel);
    }

    public void recordClick()
    {
        onAdClicked();
    }

    public void recordImpression()
    {
        zza(zzon.zzpO, false);
    }

    protected zzid zza(zzd zzd1)
    {
        Object obj = zzon.zzpK.getNextView();
        if (!(obj instanceof zzid)) goto _L2; else goto _L1
_L1:
        obj = (zzid)obj;
        ((zzid) (obj)).zza(zzon.zzpH, zzon.zzpN);
_L4:
        ((zzid) (obj)).zzgF().zzb(this, this, this, this, false, this, null, zzd1, this);
        return ((zzid) (obj));
_L2:
        if (obj != null)
        {
            zzon.zzpK.removeView(((View) (obj)));
        }
        zzid zzid1 = zzo.zzbw().zza(zzon.zzpH, zzon.zzpN, false, false, zzon.zzpI, zzon.zzpJ);
        obj = zzid1;
        if (zzon.zzpN.zzso == null)
        {
            zzb(zzid1.getWebView());
            obj = zzid1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void zza(int i, int j, int k, int l)
    {
        zzaS();
    }

    public void zza(zzci zzci1)
    {
        zzu.zzbY("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
        zzon.zzqc = zzci1;
    }

    protected boolean zza(zzha zzha1, zzha zzha2)
    {
        if (zzon.zzbM() && zzon.zzpK != null)
        {
            zzon.zzpK.zzbP().zzaw(zzha2.zzCP);
        }
        return super.zza(zzha1, zzha2);
    }

    protected boolean zzb(com.google.android.gms.internal.zzha.zza zza1)
    {
        Object obj;
        zzid zzid1;
        obj = null;
        zzd zzd1 = new zzd();
        zzid1 = zza(zzd1);
        zzd1.zza(new zzd.zzb(zza1, zzid1));
        zzid1.setOnTouchListener(new android.view.View.OnTouchListener(zzd1) {

            final zzd zzou;
            final zzc zzov;

            public boolean onTouch(View view, MotionEvent motionevent)
            {
                zzou.recordClick();
                return false;
            }

            
            {
                zzov = zzc.this;
                zzou = zzd1;
                super();
            }
        });
        zzid1.setOnClickListener(new android.view.View.OnClickListener(zzd1) {

            final zzd zzou;
            final zzc zzov;

            public void onClick(View view)
            {
                zzou.recordClick();
            }

            
            {
                zzov = zzc.this;
                zzou = zzd1;
                super();
            }
        });
        if (zza1.zzpN != null)
        {
            zzon.zzpN = zza1.zzpN;
        }
        if (zza1.errorCode != -2)
        {
            zzb(new zzha(zza1, zzid1, null, null, null, null, null));
            return false;
        }
        if (zza1.zzFs.zzCK || !zza1.zzFs.zzCT)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (zza1.zzFs.zzzG != null)
        {
            obj = zzo.zzbv().zzat(zza1.zzFs.zzzG);
        }
        obj = new zzcf(this, ((String) (obj)), zza1.zzFs.zzCI);
        if (zzon.zzqc == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        zzon.zzqh = 1;
        zzon.zzqc.zza(((com.google.android.gms.internal.zzch) (obj)));
        return false;
        RemoteException remoteexception;
        remoteexception;
        com.google.android.gms.ads.internal.util.client.zzb.zzd("Could not call the onCustomRenderedAdLoadedListener.", remoteexception);
        zzon.zzqh = 0;
        zzon.zzpM = zzo.zzbu().zza(zzon.zzpH, this, zza1, zzon.zzpI, zzid1, zzoq, this);
        return true;
    }

    public void zzbc()
    {
        zzaQ();
    }

    public void zzc(View view)
    {
        zzon.zzqg = view;
        zzb(new zzha(zzon.zzpP, null, null, null, null, null, null));
    }
}
