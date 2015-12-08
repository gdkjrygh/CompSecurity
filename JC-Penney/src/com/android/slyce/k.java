// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceView;
import com.android.a.f;
import com.android.slyce.e.a;
import com.android.slyce.i.b;
import com.android.slyce.k.c;
import com.android.slyce.k.g;
import com.android.slyce.k.h;
import com.android.slyce.k.i;
import com.android.slyce.report.mpmetrics.af;
import com.moodstocks.android.MoodstocksError;
import com.moodstocks.android.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.android.slyce:
//            a, p, t, r, 
//            m, n, j, l, 
//            u, o

public class k extends Handler
{

    private final String a = com/android/slyce/k.getSimpleName();
    private a b;
    private b c;
    private Activity d;
    private com.android.slyce.a e;
    private com.android.slyce.b.a f;
    private JSONObject g;
    private af h;
    private List i;
    private u j;
    private boolean k;
    private boolean l;
    private String m;
    private long n;

    public k(Activity activity, com.android.slyce.a a1, SurfaceView surfaceview, JSONObject jsonobject, com.android.slyce.f.a a2)
    {
        k = true;
        l = true;
        m = null;
        n = 0L;
        if (a1 == null)
        {
            com.android.slyce.k.h.b(a, "Slyce object is null");
        } else
        {
            i = new ArrayList();
            d = activity;
            e = a1;
            b = new a(a2);
            g = jsonobject;
            h = af.a(d, "712a9f5c14895edaa8b27dc59ec2af9f");
            if (a1.b())
            {
                try
                {
                    a1 = new p(this);
                    c = new b(activity, Scanner.get(), a1, surfaceview);
                    c.a(0x8000000f);
                }
                // Misplaced declaration of an exception variable
                catch (Activity activity)
                {
                    activity.printStackTrace();
                }
            } else
            {
                f = new com.android.slyce.b.a(activity, surfaceview, new r(this, null));
            }
            if (surfaceview != null)
            {
                surfaceview.setOnTouchListener(new t(this, null));
                return;
            }
        }
    }

    static String a(k k1)
    {
        return k1.a;
    }

    private void a(Bitmap bitmap)
    {
        b.a(bitmap);
        obtainMessage(1, bitmap).sendToTarget();
        h.a("Image.Snapped", null);
    }

    private void a(j j1)
    {
        com.android.slyce.k.c.a().a(d, f.slyce_detection_sound, e.g(), e.h());
        b.a(j1);
    }

    static void a(k k1, Bitmap bitmap)
    {
        k1.a(bitmap);
    }

    static void a(k k1, j j1)
    {
        k1.a(j1);
    }

    static void a(k k1, String s)
    {
        k1.a(s);
    }

    static void a(k k1, String s, String s1, com.android.slyce.k.b b1)
    {
        k1.a(s, s1, b1);
    }

    static void a(k k1, boolean flag, float f1, float f2)
    {
        k1.a(flag, f1, f2);
    }

    private void a(String s)
    {
        if (b(s))
        {
            return;
        }
        if (!TextUtils.isEmpty(s))
        {
            com.android.slyce.k.c.a().a(d, f.slyce_detection_sound, e.g(), e.h());
        }
        String s1 = com.android.slyce.k.i.a(s);
        String s2 = com.android.slyce.k.i.a("p", s1);
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("detectionType", "2D");
            jsonobject.put("irID", s);
            jsonobject.put("Promotion", s2);
            h = af.a(d, "712a9f5c14895edaa8b27dc59ec2af9f");
            h.a("Image.Detected", jsonobject);
        }
        catch (JSONException jsonexception) { }
        b.a(s1);
        com.android.slyce.c.a.a(d).b(s, new m(this), new n(this));
    }

    private void a(String s, String s1, com.android.slyce.k.b b1)
    {
        s = com.android.slyce.k.a.a(s, b1, s1);
        a(((j) (s)));
        if (e.a())
        {
            com.android.slyce.c.a.a(d).a(s.b(), e.c(), new l(this));
        }
        try
        {
            s1 = new JSONObject();
            s1.put("barcodeFormat", s.a().a());
            s1.put("data", s.b());
            h = af.a(d, "712a9f5c14895edaa8b27dc59ec2af9f");
            h.a("Barcode.Detected", s1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return;
        }
    }

    private void a(boolean flag, float f1, float f2)
    {
        Rect rect = new Rect((int)(f1 - 100F), (int)(f2 - 100F), (int)(f1 + 100F), (int)(100F + f2));
        if (c != null)
        {
            c.a(flag, rect);
        }
        if (f != null)
        {
            f.a(flag, rect);
        }
    }

    static boolean b(k k1)
    {
        return k1.k;
    }

    private boolean b(String s)
    {
        if (!TextUtils.equals(s, m))
        {
            n = System.currentTimeMillis();
            m = s;
            return false;
        }
        long l1 = System.currentTimeMillis() - n;
        if (l1 < 15000L)
        {
            com.android.slyce.k.h.a(a, (new StringBuilder()).append("Abort 2D detection for two identical images, time difference = ").append(l1).toString());
            return true;
        } else
        {
            n = System.currentTimeMillis();
            m = s;
            return false;
        }
    }

    static boolean c(k k1)
    {
        return k1.l;
    }

    static com.android.slyce.b.a d(k k1)
    {
        return k1.f;
    }

    static a e(k k1)
    {
        return k1.b;
    }

    static b f(k k1)
    {
        return k1.c;
    }

    static af g(k k1)
    {
        return k1.h;
    }

    static Activity h(k k1)
    {
        return k1.d;
    }

    static com.android.slyce.a i(k k1)
    {
        return k1.e;
    }

    public void a()
    {
        if (c != null)
        {
            c.f();
        } else
        if (f != null)
        {
            f.a();
            return;
        }
    }

    public void a(boolean flag)
    {
        k = flag;
    }

    public void b()
    {
        if (c != null)
        {
            c.a(true, true);
        }
        if (f != null)
        {
            f.a(true, true);
        }
    }

    public void b(boolean flag)
    {
label0:
        {
            l = flag;
            if (c != null)
            {
                if (flag)
                {
                    c.e();
                } else
                {
                    c.d();
                }
            }
            if (f != null)
            {
                if (!flag)
                {
                    break label0;
                }
                f.f();
            }
            return;
        }
        f.e();
    }

    public void c()
    {
        if (c != null)
        {
            c.c();
        }
        if (f != null)
        {
            f.b();
        }
    }

    public void d()
    {
        if (c != null)
        {
            c.a();
        }
        if (f != null)
        {
            f.d();
        }
    }

    public void e()
    {
        if (c != null)
        {
            c.b();
        }
        if (f != null)
        {
            f.c();
        }
    }

    public void f()
    {
        for (Iterator iterator = i.iterator(); iterator.hasNext(); ((u)iterator.next()).a()) { }
    }

    public void g()
    {
        if (f != null)
        {
            f.g();
        }
        if (c != null)
        {
            c.g();
        }
    }

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 1: default 24
    //                   1 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        j = new u(e, new o(this), g);
        if (!com.android.slyce.k.g.a(d.getApplicationContext()).i())
        {
            i.add(j);
            j.a((Bitmap)message.obj);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
