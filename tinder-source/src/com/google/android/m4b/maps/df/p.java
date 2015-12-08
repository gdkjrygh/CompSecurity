// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.df;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.google.android.m4b.maps.GoogleMapOptions;
import com.google.android.m4b.maps.StreetViewPanoramaOptions;
import com.google.android.m4b.maps.ab.a;
import com.google.android.m4b.maps.ai.c;
import com.google.android.m4b.maps.ay.ab;
import com.google.android.m4b.maps.ay.ae;
import com.google.android.m4b.maps.ay.ag;
import com.google.android.m4b.maps.ay.w;
import com.google.android.m4b.maps.ay.z;
import com.google.android.m4b.maps.bs.e;
import com.google.android.m4b.maps.cg.am;
import com.google.android.m4b.maps.cg.as;
import com.google.android.m4b.maps.cg.aw;
import com.google.android.m4b.maps.cg.ba;
import com.google.android.m4b.maps.cg.bg;
import com.google.android.m4b.maps.cg.bj;
import com.google.android.m4b.maps.cg.bk;
import com.google.android.m4b.maps.cg.bq;
import com.google.android.m4b.maps.cg.bt;
import com.google.android.m4b.maps.cg.n;
import com.google.android.m4b.maps.cg.r;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;
import com.google.android.m4b.maps.g.g;
import com.google.android.m4b.maps.y.j;
import java.util.ArrayList;
import java.util.Locale;
import java.util.concurrent.Executors;

// Referenced classes of package com.google.android.m4b.maps.df:
//            k, q, y, x, 
//            j

public class p extends s.a
{

    private boolean a;
    private bg b;
    private bj c;
    private Resources d;

    public p()
    {
        a = false;
        b = null;
    }

    private static void a(Context context)
    {
        try
        {
            int i = context.getPackageManager().getPackageInfo("com.google.android.gms", 0).versionCode;
            ab.a(4, (new StringBuilder(49)).append("Google Play services package version: ").append(i).toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException(context);
        }
    }

    private bj b(Context context)
    {
        if (c == null)
        {
            Resources resources = d;
            String s = context.getPackageName();
            bg bg1 = b;
            String as2[] = "en ar bg ca cs da de el en_GB es es_MX et fi fr hr hu it iw ja ko lt lv nl no pl pt_BR pt_PT ro ru sk sl sr sv tl tr uk vi zh zh_CN".split(" ");
            String as1[] = as2;
            if (android.os.Build.VERSION.SDK_INT < 14)
            {
                as1 = new ArrayList(as2.length);
                int k = as2.length;
                int i = 0;
                while (i < k) 
                {
                    String s1 = as2[i];
                    String s2 = z.d(z.a(s1));
                    boolean flag;
                    if (s2.equals("ar") || s2.equals("fa") || s2.equals("iw"))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if (!flag)
                    {
                        as1.add(s1);
                    }
                    i++;
                }
                as1 = (String[])as1.toArray(new String[as1.size()]);
            }
            Object obj2 = new z();
            Object obj3 = Locale.getDefault().toString();
            ((z) (obj2)).b(((String) (obj3)));
            Object obj1 = z.a(((String) (obj3)), as1);
            obj3 = z.e(((String) (obj3)));
            Object obj = obj1;
            if (w.a(z.e(((String) (obj1)))))
            {
                obj = obj1;
                if (!w.a(((String) (obj3))))
                {
                    obj = (new StringBuilder(String.valueOf(obj1).length() + 1 + String.valueOf(obj3).length())).append(((String) (obj1))).append("_").append(((String) (obj3))).toString();
                }
            }
            ((z) (obj2)).c(((String) (obj)));
            w.h = ((z) (obj2));
            obj = context.getPackageManager();
            w.b = ((PackageManager) (obj)).hasSystemFeature("android.hardware.touchscreen.multitouch.distinct");
            w.c = ((PackageManager) (obj)).hasSystemFeature("android.hardware.touchscreen.multitouch");
            obj = context.getResources().getDisplayMetrics();
            w.d = ((DisplayMetrics) (obj)).densityDpi;
            w.e = ((DisplayMetrics) (obj)).density;
            float f = w.d;
            float f1;
            boolean flag1;
            if ((double)(Math.abs(((DisplayMetrics) (obj)).xdpi - f) / f) > 0.25D || (double)(Math.abs(((DisplayMetrics) (obj)).ydpi - f) / f) > 0.25D)
            {
                w.f = f;
                w.g = f;
            } else
            {
                w.f = ((DisplayMetrics) (obj)).xdpi;
                w.g = ((DisplayMetrics) (obj)).ydpi;
            }
            f = (float)((DisplayMetrics) (obj)).widthPixels / w.f;
            f1 = (float)((DisplayMetrics) (obj)).heightPixels / w.g;
            if (Math.hypot(f, f1) >= 7D)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            w.a = flag1;
            w.i = new a(context);
            w.j = context.getPackageManager().hasSystemFeature("android.hardware.type.watch");
            obj1 = com.google.android.m4b.maps.ai.c.a(context, s, Executors.newSingleThreadScheduledExecutor(), "com.google.android.gms");
            if (!com.google.android.m4b.maps.cz.a.a(context) && g.e(context))
            {
                obj = new ae(context, "com.google.android.gms");
            } else
            {
                obj = null;
            }
            obj = new bt(context, bg1, s, ((com.google.android.m4b.maps.ay.l) (obj1)), ((com.google.android.m4b.maps.am.f.a) (obj)));
            obj2 = ((bt) (obj)).a();
            obj3 = ba.a();
            c = new bj(context, resources, s, ((bt) (obj)), bg1, com.google.android.m4b.maps.ay.c.c(), ((java.util.concurrent.Executor) (obj3)), new am(((com.google.android.m4b.maps.ay.u) (obj2)), new com.google.android.m4b.maps.cg.am.b(context.getApplicationContext(), "com.google.android.m4b.maps._m_u")), new e(context, s, ((com.google.android.m4b.maps.ay.m) (obj2))), ((c) (obj1)));
        }
        return c;
    }

    public final k a(b b1, StreetViewPanoramaOptions streetviewpanoramaoptions)
    {
        j.b(a, "CreatorImpl not initialized properly.");
        b1 = (Context)com.google.android.m4b.maps.da.d.a(b1);
        a(((Context) (b1)));
        return new aw(b1, streetviewpanoramaoptions, b(b1.getApplicationContext()));
    }

    public final q a()
    {
        return new bq();
    }

    public final y a(b b1, GoogleMapOptions googlemapoptions)
    {
        j.b(a, "CreatorImpl not initialized properly.");
        b1 = (Context)com.google.android.m4b.maps.da.d.a(b1);
        a(((Context) (b1)));
        return new r(b1, googlemapoptions, b(b1.getApplicationContext()));
    }

    public final void a(b b1)
    {
        a(b1, 0);
    }

    public final void a(b b1, int i)
    {
        ab.a(4, (new StringBuilder(48)).append("Google Play services client version: ").append(i).toString());
        d = (Resources)com.google.android.m4b.maps.da.d.a(b1);
        b = new bg(i);
        com.google.android.m4b.maps.e.a(this);
        a = true;
    }

    public final x b(b b1)
    {
        j.b(a, "CreatorImpl not initialized properly.");
        b1 = (Activity)com.google.android.m4b.maps.da.d.a(b1);
        a(b1);
        return n.a(b1, b(b1.getApplicationContext()));
    }

    public final com.google.android.m4b.maps.model.internal.d b()
    {
        return new bk(d);
    }

    public final com.google.android.m4b.maps.df.j c(b b1)
    {
        j.b(a, "CreatorImpl not initialized properly.");
        b1 = (Activity)com.google.android.m4b.maps.da.d.a(b1);
        a(b1);
        bj bj1 = b(b1.getApplicationContext());
        return new as(new com.google.android.m4b.maps.cg.as._cls1(ag.a(b1), bj1), bj1.a);
    }
}
