// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.webkit.WebView;

// Referenced classes of package com.google.android.gms.internal:
//            zzgw, zzab, zzba, zzgo, 
//            zzie, zzhg, zzic, zzgy, 
//            zzcf, zzid, zzcu, zzhx, 
//            zzbv, zzce

static final class zzxr
    implements Runnable
{

    final Context zznK;
    final zzgy zzxk;
    final zzcf zzxl;
    final zzce zzxm;
    final String zzxn;
    final zzgo zzxq;
    final zzbv zzxr;

    public final void run()
    {
        zzic zzic1 = zzab.zzaN().zza(zznK, new zzba(), false, false, null, zzxq.zzlP);
        if (zzab.zzaP().zzem())
        {
            zzic1.getWebView().clearCache(true);
        }
        zzic1.setWillNotDraw(true);
        zzxk.zza(zzic1);
        zzxl.zza(zzxm, new String[] {
            "rwc"
        });
        Object obj = zzxl.zzcq();
        obj = zzgw.zzb(zzxn, zzxl, ((zzce) (obj)));
        zzid zzid1 = zzic1.zzeG();
        zzid1.zza("/invalidRequest", zzxk.zzxz);
        zzid1.zza("/loadAdURL", zzxk.zzxA);
        zzid1.zza("/log", zzcu.zzrG);
        zzid1.zza(((a) (obj)));
        zzhx.zzY("Loading the JS library.");
        zzic1.loadUrl(zzxr.zzbV());
    }

    (Context context, zzgo zzgo1, zzgy zzgy1, zzcf zzcf1, zzce zzce, String s, zzbv zzbv1)
    {
        zznK = context;
        zzxq = zzgo1;
        zzxk = zzgy1;
        zzxl = zzcf1;
        zzxm = zzce;
        zzxn = s;
        zzxr = zzbv1;
        super();
    }
}
