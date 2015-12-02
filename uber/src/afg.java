// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;

public final class afg extends afh
{

    DisplayMetrics a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private final akk h;
    private final Context i;
    private final WindowManager j;
    private final abe k;
    private float l;
    private int m;

    public afg(akk akk1, Context context, abe abe1)
    {
        super(akk1);
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = -1;
        h = akk1;
        i = context;
        k = abe1;
        j = (WindowManager)context.getSystemService("window");
    }

    private void b()
    {
        a = new DisplayMetrics();
        Display display = j.getDefaultDisplay();
        display.getMetrics(a);
        l = a.density;
        m = display.getRotation();
    }

    private void c()
    {
        kx.a();
        b = oe.b(a, a.widthPixels);
        kx.a();
        c = oe.b(a, a.heightPixels);
        Activity activity = h.d();
        if (activity == null || activity.getWindow() == null)
        {
            d = b;
            e = c;
            return;
        } else
        {
            ot.e();
            int ai[] = ajc.a(activity);
            kx.a();
            d = oe.b(a, ai[0]);
            kx.a();
            e = oe.b(a, ai[1]);
            return;
        }
    }

    private void d()
    {
        if (h.h().e)
        {
            f = b;
            g = c;
            return;
        } else
        {
            h.measure(0, 0);
            kx.a();
            f = oe.b(i, h.getMeasuredWidth());
            kx.a();
            g = oe.b(i, h.getMeasuredHeight());
            return;
        }
    }

    private void e()
    {
        if (of.a(2))
        {
            of.c("Dispatching Ready Event.");
        }
        b(h.l().b);
    }

    private void f()
    {
        int ai[] = new int[2];
        h.getLocationOnScreen(ai);
        kx.a();
        int i1 = oe.b(i, ai[0]);
        kx.a();
        a(i1, oe.b(i, ai[1]));
    }

    private void g()
    {
        a(b, c, d, e, l, m);
    }

    private void h()
    {
        afe afe1 = i();
        h.a("onDeviceFeaturesReceived", afe1.a());
    }

    private afe i()
    {
        return (new aff()).b(k.a()).a(k.b()).c(k.d()).d(k.c()).a().b();
    }

    public final void a()
    {
        b();
        c();
        d();
        g();
        h();
        f();
        e();
    }

    public final void a(int i1, int j1)
    {
        int k1;
        if (i instanceof Activity)
        {
            ot.e();
            k1 = ajc.c((Activity)i)[0];
        } else
        {
            k1 = 0;
        }
        b(i1, j1 - k1, f, g);
        h.i().a(i1, j1);
    }
}
