// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.client.j;
import com.google.android.gms.ads.internal.d;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.google.android.gms.internal:
//            bq, aq, cw, q, 
//            bo, cl, cx, bl

public final class bp extends bq
    implements aq
{

    DisplayMetrics a;
    int b;
    int c;
    int d;
    int e;
    int f;
    int g;
    private final cw h;
    private final Context i;
    private final WindowManager j;
    private final q k;
    private float l;
    private int m;

    public bp(cw cw1, Context context, q q1)
    {
        super(cw1);
        b = -1;
        c = -1;
        d = -1;
        e = -1;
        f = -1;
        g = -1;
        h = cw1;
        i = context;
        k = q1;
        j = (WindowManager)context.getSystemService("window");
    }

    public final void a(cw cw1, Map map)
    {
        a = new DisplayMetrics();
        cw1 = j.getDefaultDisplay();
        cw1.getMetrics(a);
        l = a.density;
        m = cw1.getRotation();
        com.google.android.gms.ads.internal.client.j.a();
        b = com.google.android.gms.ads.internal.util.client.a.b(a, a.widthPixels);
        com.google.android.gms.ads.internal.client.j.a();
        c = com.google.android.gms.ads.internal.util.client.a.b(a, a.heightPixels);
        cw1 = h.c();
        Intent intent;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        if (cw1 == null || cw1.getWindow() == null)
        {
            d = b;
            e = c;
        } else
        {
            com.google.android.gms.ads.internal.d.c();
            cw1 = com.google.android.gms.internal.cl.a(cw1);
            com.google.android.gms.ads.internal.client.j.a();
            d = com.google.android.gms.ads.internal.util.client.a.b(a, cw1[0]);
            com.google.android.gms.ads.internal.client.j.a();
            e = com.google.android.gms.ads.internal.util.client.a.b(a, cw1[1]);
        }
        if (h.h().e)
        {
            f = b;
            g = c;
        } else
        {
            h.measure(0, 0);
            com.google.android.gms.ads.internal.client.j.a();
            f = com.google.android.gms.ads.internal.util.client.a.b(i, h.getMeasuredWidth());
            com.google.android.gms.ads.internal.client.j.a();
            g = com.google.android.gms.ads.internal.util.client.a.b(i, h.getMeasuredHeight());
        }
        a(b, c, d, e, l, m);
        cw1 = new bo.a();
        map = k;
        intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        cw1.b = map.a(intent);
        map = k;
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        cw1.a = map.a(intent);
        cw1.c = k.b();
        cw1.d = k.a();
        cw1.e = true;
        cw1 = new bo(cw1, (byte)0);
        h.a("onDeviceFeaturesReceived", cw1.a());
        cw1 = new int[2];
        h.getLocationOnScreen(cw1);
        com.google.android.gms.ads.internal.client.j.a();
        j1 = com.google.android.gms.ads.internal.util.client.a.b(i, cw1[0]);
        com.google.android.gms.ads.internal.client.j.a();
        k1 = com.google.android.gms.ads.internal.util.client.a.b(i, cw1[1]);
        if (i instanceof Activity)
        {
            com.google.android.gms.ads.internal.d.c();
            i1 = cl.c((Activity)i)[0];
        } else
        {
            i1 = 0;
        }
        l1 = f;
        i2 = g;
        try
        {
            cw1 = (new JSONObject()).put("x", j1).put("y", k1 - i1).put("width", l1).put("height", i2);
            super.s.a("onDefaultPositionReceived", cw1);
        }
        // Misplaced declaration of an exception variable
        catch (cw cw1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching default position.", cw1);
        }
        cw1 = h.i();
        if (((cx) (cw1)).o != null)
        {
            cw1 = ((cx) (cw1)).o;
            cw1.d = j1;
            cw1.e = k1;
        }
        if (com.google.android.gms.ads.internal.util.client.b.a(2))
        {
            com.google.android.gms.ads.internal.util.client.b.c("Dispatching Ready Event.");
        }
        cw1 = h.l().b;
        try
        {
            cw1 = (new JSONObject()).put("js", cw1);
            super.s.a("onReadyEventReceived", cw1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (cw cw1)
        {
            com.google.android.gms.ads.internal.util.client.b.b("Error occured while dispatching ready Event.", cw1);
        }
    }
}
