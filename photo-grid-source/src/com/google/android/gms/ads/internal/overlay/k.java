// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.os.Handler;
import com.google.android.gms.ads.internal.InterstitialAdParameterParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qd;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzd, AdOverlayInfoParcel, l

final class k extends pj
{

    final zzd a;

    private k(zzd zzd1)
    {
        a = zzd1;
        super();
    }

    k(zzd zzd1, byte byte0)
    {
        this(zzd1);
    }

    public final void onStop()
    {
    }

    public final void zzbn()
    {
        zzp.zzbv();
        Object obj = qa.b(zzd.a(a), a.b.zzBM.zzpv);
        if (obj != null)
        {
            obj = zzp.zzbx().a(zzd.a(a), ((android.graphics.Bitmap) (obj)), a.b.zzBM.zzpw, a.b.zzBM.zzpx);
            qa.a.post(new l(this, ((android.graphics.drawable.Drawable) (obj))));
        }
    }
}
