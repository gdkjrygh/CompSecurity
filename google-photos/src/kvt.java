// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.Map;

public final class kvt extends kvu
    implements kuf
{

    private final kxu a;
    private final Context b;
    private final WindowManager c;
    private final kta d;
    private DisplayMetrics e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public kvt(kxu kxu1, Context context, kta kta1)
    {
        super(kxu1);
        g = -1;
        h = -1;
        j = -1;
        k = -1;
        l = -1;
        m = -1;
        a = kxu1;
        b = context;
        d = kta1;
        c = (WindowManager)context.getSystemService("window");
    }

    public final void a(kxu kxu1, Map map)
    {
        e = new DisplayMetrics();
        kxu1 = c.getDefaultDisplay();
        kxu1.getMetrics(e);
        f = e.density;
        i = kxu1.getRotation();
        jof.a();
        g = jpx.b(e, e.widthPixels);
        jof.a();
        h = jpx.b(e, e.heightPixels);
        kxu1 = a.d();
        Intent intent;
        int i1;
        int j1;
        int k1;
        if (kxu1 == null || kxu1.getWindow() == null)
        {
            j = g;
            k = h;
        } else
        {
            kxu1 = jqc.c().a(kxu1);
            jof.a();
            j = jpx.b(e, kxu1[0]);
            jof.a();
            k = jpx.b(e, kxu1[1]);
        }
        if (a.i().e)
        {
            l = g;
            m = h;
        } else
        {
            a.measure(0, 0);
            l = jof.a().b(b, a.getMeasuredWidth());
            m = jof.a().b(b, a.getMeasuredHeight());
        }
        a(g, h, j, k, f, i);
        kxu1 = new kvs();
        map = d;
        intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        kxu1.b = map.a(intent);
        map = d;
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        kxu1.a = map.a(intent);
        kxu1.c = d.b();
        kxu1.d = d.a();
        kxu1.e = true;
        kxu1 = new kvr(kxu1);
        a.a("onDeviceFeaturesReceived", kxu1.a());
        kxu1 = new int[2];
        a.getLocationOnScreen(kxu1);
        j1 = jof.a().b(b, kxu1[0]);
        k1 = jof.a().b(b, kxu1[1]);
        if (b instanceof Activity)
        {
            i1 = jqc.c().c((Activity)b)[0];
        } else
        {
            i1 = 0;
        }
        b(j1, k1 - i1, l, m);
        kxu1 = a.j();
        if (((kxv) (kxu1)).o != null)
        {
            kxu1 = ((kxv) (kxu1)).o;
            kxu1.c = j1;
            kxu1.d = k1;
        }
        if (b.p(2))
        {
            b.p(4);
        }
        b(a.m().b);
    }
}
