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
import com.google.android.gms.ads.internal.client.n;
import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ec, cf, gm, hi, 
//            hj, dz, aq

public final class eb extends ec
    implements cf
{

    DisplayMetrics a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private final hi h;
    private final Context i;
    private final WindowManager j;
    private final aq k;
    private float l;
    private int m;

    public eb(hi hi1, Context context, aq aq1)
    {
        super(hi1);
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = -1;
        h = hi1;
        i = context;
        k = aq1;
        j = (WindowManager)context.getSystemService("window");
    }

    public final void a(int i1, int j1)
    {
        int k1;
        if (i instanceof Activity)
        {
            p.e();
            k1 = gm.c((Activity)i)[0];
        } else
        {
            k1 = 0;
        }
        b(i1, j1 - k1, f, g);
        h.j().a(i1, j1);
    }

    public final void a(hi hi1, Map map)
    {
        a = new DisplayMetrics();
        hi1 = j.getDefaultDisplay();
        hi1.getMetrics(a);
        l = a.density;
        m = hi1.getRotation();
        n.a();
        b = com.google.android.gms.ads.internal.util.client.a.b(a, a.widthPixels);
        n.a();
        c = com.google.android.gms.ads.internal.util.client.a.b(a, a.heightPixels);
        hi1 = h.d();
        int i1;
        if (hi1 == null || hi1.getWindow() == null)
        {
            d = b;
            e = c;
        } else
        {
            p.e();
            hi1 = com.google.android.gms.internal.gm.a(hi1);
            n.a();
            d = com.google.android.gms.ads.internal.util.client.a.b(a, hi1[0]);
            n.a();
            e = com.google.android.gms.ads.internal.util.client.a.b(a, hi1[1]);
        }
        if (h.i().e)
        {
            f = b;
            g = c;
        } else
        {
            h.measure(0, 0);
            n.a();
            f = com.google.android.gms.ads.internal.util.client.a.b(i, h.getMeasuredWidth());
            n.a();
            g = com.google.android.gms.ads.internal.util.client.a.b(i, h.getMeasuredHeight());
        }
        a(b, c, d, e, l, m);
        hi1 = new dz((new dz.a()).b(k.a()).a(k.b()).c(k.d()).d(k.c()).a(), (byte)0);
        h.a("onDeviceFeaturesReceived", hi1.a());
        hi1 = new int[2];
        h.getLocationOnScreen(hi1);
        n.a();
        i1 = com.google.android.gms.ads.internal.util.client.a.b(i, hi1[0]);
        n.a();
        a(i1, com.google.android.gms.ads.internal.util.client.a.b(i, hi1[1]));
        if (com.google.android.gms.ads.internal.util.client.b.a(2))
        {
            com.google.android.gms.ads.internal.util.client.b.b("Dispatching Ready Event.");
        }
        b(h.m().b);
    }
}
