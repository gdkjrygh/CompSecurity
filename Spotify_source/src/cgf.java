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
import org.json.JSONException;
import org.json.JSONObject;

public final class cgf extends cgg
    implements cdi
{

    private final ckw a;
    private final Context b;
    private final WindowManager c;
    private final cat d;
    private DisplayMetrics e;
    private float f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;

    public cgf(ckw ckw1, Context context, cat cat1)
    {
        super(ckw1);
        g = -1;
        h = -1;
        j = -1;
        k = -1;
        l = -1;
        m = -1;
        a = ckw1;
        b = context;
        d = cat1;
        c = (WindowManager)context.getSystemService("window");
    }

    public final void a(int i1, int j1)
    {
        Object obj;
        int k1;
        int l1;
        int i2;
        if (b instanceof Activity)
        {
            bkv.e();
            k1 = cjj.c((Activity)b)[0];
        } else
        {
            k1 = 0;
        }
        l1 = l;
        i2 = m;
        try
        {
            JSONObject jsonobject = (new JSONObject()).put("x", i1).put("y", j1 - k1).put("width", l1).put("height", i2);
            super.s.a("onDefaultPositionReceived", jsonobject);
        }
        catch (JSONException jsonexception)
        {
            bka.b("Error occured while dispatching default position.", jsonexception);
        }
        obj = a.k();
        if (((ckx) (obj)).j != null)
        {
            obj = ((ckx) (obj)).j;
            obj.c = i1;
            obj.d = j1;
        }
    }

    public final void a(ckw ckw1, Map map)
    {
        e = new DisplayMetrics();
        ckw1 = c.getDefaultDisplay();
        ckw1.getMetrics(e);
        f = e.density;
        i = ckw1.getRotation();
        bfq.a();
        g = bjz.b(e, e.widthPixels);
        bfq.a();
        h = bjz.b(e, e.heightPixels);
        ckw1 = a.e();
        Intent intent;
        int i1;
        if (ckw1 == null || ckw1.getWindow() == null)
        {
            j = g;
            k = h;
        } else
        {
            bkv.e();
            ckw1 = cjj.a(ckw1);
            bfq.a();
            j = bjz.b(e, ckw1[0]);
            bfq.a();
            k = bjz.b(e, ckw1[1]);
        }
        if (a.j().e)
        {
            l = g;
            m = h;
        } else
        {
            a.measure(0, 0);
            bfq.a();
            l = bjz.b(b, a.getMeasuredWidth());
            bfq.a();
            m = bjz.b(b, a.getMeasuredHeight());
        }
        a(g, h, j, k, f, i);
        ckw1 = new cge();
        map = d;
        intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:"));
        ckw1.b = map.a(intent);
        map = d;
        intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse("sms:"));
        ckw1.a = map.a(intent);
        ckw1.c = d.b();
        ckw1.d = d.a();
        ckw1.e = true;
        ckw1 = new cgd(ckw1, (byte)0);
        a.a("onDeviceFeaturesReceived", ckw1.a());
        ckw1 = new int[2];
        a.getLocationOnScreen(ckw1);
        bfq.a();
        i1 = bjz.b(b, ckw1[0]);
        bfq.a();
        a(i1, bjz.b(b, ckw1[1]));
        if (bka.a(2))
        {
            bka.c("Dispatching Ready Event.");
        }
        ckw1 = a.n().b;
        try
        {
            ckw1 = (new JSONObject()).put("js", ckw1);
            super.s.a("onReadyEventReceived", ckw1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ckw ckw1)
        {
            bka.b("Error occured while dispatching ready Event.", ckw1);
        }
    }
}
