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
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.ads.internal.zzp;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            kp, fz, qa, ry, 
//            zzja, km, kn, cm

public final class ko extends kp
    implements fz
{

    DisplayMetrics a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private final ry h;
    private final Context i;
    private final WindowManager j;
    private final cm k;
    private float l;
    private int m;

    public ko(ry ry1, Context context, cm cm1)
    {
        super(ry1);
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = -1;
        h = ry1;
        i = context;
        k = cm1;
        j = (WindowManager)context.getSystemService("window");
    }

    public final void a(int i1, int j1)
    {
        int k1;
        if (i instanceof Activity)
        {
            zzp.zzbv();
            k1 = qa.c((Activity)i)[0];
        } else
        {
            k1 = 0;
        }
        b(i1, j1 - k1, f, g);
        h.k().zzd(i1, j1);
    }

    public final void zza(ry ry1, Map map)
    {
        a = new DisplayMetrics();
        ry1 = j.getDefaultDisplay();
        ry1.getMetrics(a);
        l = a.density;
        m = ry1.getRotation();
        b = zzl.zzcF().zzb(a, a.widthPixels);
        c = zzl.zzcF().zzb(a, a.heightPixels);
        ry1 = h.e();
        if (ry1 == null || ry1.getWindow() == null)
        {
            d = b;
            e = c;
        } else
        {
            zzp.zzbv();
            ry1 = qa.a(ry1);
            d = zzl.zzcF().zzb(a, ry1[0]);
            e = zzl.zzcF().zzb(a, ry1[1]);
        }
        if (h.j().zztf)
        {
            f = b;
            g = c;
        } else
        {
            h.measure(0, 0);
            f = zzl.zzcF().zzc(i, h.getMeasuredWidth());
            g = zzl.zzcF().zzc(i, h.getMeasuredHeight());
        }
        a(b, c, d, e, l, m);
        ry1 = new km((new kn()).b(k.a()).a(k.b()).c(k.d()).d(k.c()).a(), (byte)0);
        h.a("onDeviceFeaturesReceived", ry1.a());
        ry1 = new int[2];
        h.getLocationOnScreen(ry1);
        a(zzl.zzcF().zzc(i, ry1[0]), zzl.zzcF().zzc(i, ry1[1]));
        if (zzb.zzN(2))
        {
            zzb.zzaG("Dispatching Ready Event.");
        }
        b(h.n().zzJu);
    }
}
