// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.os.Handler;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.pa;
import com.google.android.gms.internal.pj;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.ry;

// Referenced classes of package com.google.android.gms.ads.internal:
//            zzk, zzq, zzp, InterstitialAdParameterParcel, 
//            k

final class j extends pj
{

    final zzk a;
    private final Bitmap b;
    private final String c;

    public j(zzk zzk1, Bitmap bitmap, String s)
    {
        a = zzk1;
        super();
        b = bitmap;
        c = s;
    }

    public final void onStop()
    {
    }

    public final void zzbn()
    {
        Object obj;
        int i;
        int l;
        boolean flag;
        boolean flag1;
        boolean flag2;
        if (a.f.t)
        {
            zzp.zzbv();
            flag = qa.a(a.f.context, b, c);
        } else
        {
            flag = false;
        }
        flag1 = a.f.t;
        flag2 = a.e();
        if (flag)
        {
            obj = c;
        } else
        {
            obj = null;
        }
        obj = new InterstitialAdParameterParcel(flag1, flag2, ((String) (obj)), zzk.a(a), zzk.b(a));
        l = a.f.zzqo.b.p();
        i = l;
        if (l == -1)
        {
            i = a.f.zzqo.g;
        }
        obj = new AdOverlayInfoParcel(a, a, a, a.f.zzqo.b, i, a.f.zzqj, a.f.zzqo.v, ((InterstitialAdParameterParcel) (obj)));
        qa.a.post(new k(this, ((AdOverlayInfoParcel) (obj))));
    }
}
