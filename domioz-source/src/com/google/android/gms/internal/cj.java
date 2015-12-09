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
//            ck, x, fi, fl, 
//            zzba, ch, ci, aj, 
//            a, es, fm, fj, 
//            zzhy

public final class cj extends ck
{

    DisplayMetrics a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private final fl h;
    private final Context i;
    private final WindowManager j;
    private final aj k;
    private float l;
    private int m;

    public cj(fl fl1, Context context, aj aj1)
    {
        super(fl1);
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = -1;
        h = fl1;
        i = context;
        k = aj1;
        j = (WindowManager)context.getSystemService("window");
    }

    public final void a()
    {
        a = new DisplayMetrics();
        Object obj = j.getDefaultDisplay();
        ((Display) (obj)).getMetrics(a);
        l = a.density;
        m = ((Display) (obj)).getRotation();
        x.a();
        b = fi.b(a, a.widthPixels);
        x.a();
        c = fi.b(a, a.heightPixels);
        obj = h.c();
        int i1;
        int j1;
        int k1;
        if (obj == null || ((Activity) (obj)).getWindow() == null)
        {
            d = b;
            e = c;
        } else
        {
            com.google.android.gms.internal.a.c();
            int ai[] = es.a(((Activity) (obj)));
            x.a();
            d = fi.b(a, ai[0]);
            x.a();
            e = fi.b(a, ai[1]);
        }
        if (h.f().e)
        {
            f = b;
            g = c;
        } else
        {
            h.measure(0, 0);
            x.a();
            f = fi.b(i, h.getMeasuredWidth());
            x.a();
            g = fi.b(i, h.getMeasuredHeight());
        }
        a(b, c, d, e, l, m);
        obj = new ch((new ci()).b(k.a()).a(k.b()).c(k.d()).d(k.c()).a(), (byte)0);
        h.a("onDeviceFeaturesReceived", ((ch) (obj)).a());
        obj = new int[2];
        h.getLocationOnScreen(((int []) (obj)));
        x.a();
        j1 = fi.b(i, obj[0]);
        x.a();
        k1 = fi.b(i, obj[1]);
        if (i instanceof Activity)
        {
            com.google.android.gms.internal.a.c();
            i1 = es.c((Activity)i)[0];
        } else
        {
            i1 = 0;
        }
        b(j1, k1 - i1, f, g);
        h.g().a(j1, k1);
        if (fj.a(2))
        {
            fj.c("Dispatching Ready Event.");
        }
        b(h.j().b);
    }
}
