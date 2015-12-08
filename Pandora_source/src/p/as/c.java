// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.as;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.comscore.utils.k;
import java.util.HashMap;
import java.util.Locale;
import p.at.a;
import p.at.b;

// Referenced classes of package p.as:
//            d, b, a

public class c extends b
{

    protected c(p.aq.b b1, d d1, String s)
    {
        this(b1, d1, s, false, false, true);
    }

    protected c(p.aq.b b1, d d1, String s, boolean flag, boolean flag1, boolean flag2)
    {
        super(b1);
        b1.s(flag2);
        if (flag2)
        {
            int i = b1.c(flag1);
            long l2 = b1.d(flag);
            long l4 = b1.e(flag1);
            long l5 = b1.f(flag);
            long l6 = b1.g(flag1);
            long l7 = b1.h(flag);
            long l8 = b1.i(flag1);
            long l9 = b1.j(flag1);
            long l10 = b1.k(flag1);
            long l11 = b1.l(flag1);
            long l12 = b1.O();
            int l = b1.m(flag1);
            int j1 = b1.n(flag1);
            int k1 = b1.o(flag1);
            int l1 = b1.p(flag1);
            b(new a("ns_ap_fg", String.valueOf(i), Boolean.valueOf(false)));
            b(new a("ns_ap_ft", String.valueOf(l2), Boolean.valueOf(false)));
            b(new a("ns_ap_dft", String.valueOf(l4), Boolean.valueOf(false)));
            b(new a("ns_ap_bt", String.valueOf(l5), Boolean.valueOf(false)));
            b(new a("ns_ap_dbt", String.valueOf(l6), Boolean.valueOf(false)));
            b(new a("ns_ap_it", String.valueOf(l7), Boolean.valueOf(false)));
            b(new a("ns_ap_dit", String.valueOf(l8), Boolean.valueOf(false)));
            if (l12 >= 60000L)
            {
                b(new a("ns_ap_ut", String.valueOf(l12), Boolean.valueOf(false)));
            }
            b(new a("ns_ap_as", String.valueOf(l), Boolean.valueOf(false)));
            b(new a("ns_ap_das", String.valueOf(l9), Boolean.valueOf(false)));
            if (j1 >= 0)
            {
                b(new a("ns_ap_aus", String.valueOf(j1), Boolean.valueOf(false)));
                b(new a("ns_ap_daus", String.valueOf(l10), Boolean.valueOf(false)));
                b(new a("ns_ap_uc", String.valueOf(l1), Boolean.valueOf(false)));
            }
            if (k1 >= 0)
            {
                b(new a("ns_ap_us", String.valueOf(k1), Boolean.valueOf(false)));
                b(new a("ns_ap_dus", String.valueOf(l11), Boolean.valueOf(false)));
            }
            b(new a("ns_ap_usage", Long.toString(c - b1.Z()), Boolean.valueOf(false)));
        }
        if (s != null)
        {
            b(s);
        }
        b(new a("c1", "19", Boolean.valueOf(false)));
        b(new a("ns_ap_an", b1.X(), Boolean.valueOf(false)));
        b(new a("ns_ap_pn", "android", Boolean.valueOf(false)));
        b(new a("c12", b1.U(), Boolean.valueOf(false)));
        if (b1.T() != null)
        {
            b(new a("ns_ak", b1.T(), Boolean.valueOf(false)));
            if (b1.V().a())
            {
                b(new a("ns_ap_ni", "1", Boolean.valueOf(false)));
            }
        }
        if (b1.V().g() != null)
        {
            a("ns_ap_i3", b1.V().g());
        }
        b(new a("ns_ap_device", Build.DEVICE, Boolean.valueOf(false)));
        b(new a("ns_type", a(d1).toString(), Boolean.valueOf(false)));
        b(new a("ns_ts", Long.toString(c), Boolean.valueOf(false)));
        b(new a("ns_nc", "1", Boolean.valueOf(false)));
        b(new a("ns_ap_pfv", android.os.Build.VERSION.RELEASE, Boolean.valueOf(false)));
        b(new a("ns_ap_pv", android.os.Build.VERSION.RELEASE, Boolean.valueOf(false)));
        b(new a("ns_ap_pfm", "android", Boolean.valueOf(false)));
        b(new a("ns_ap_ar", System.getProperty("os.arch"), Boolean.valueOf(false)));
        b(new a("ns_ap_ev", d1.toString(), Boolean.valueOf(false)));
        s = b1.P();
        b(new a("ns_ap_ver", b1.M(), Boolean.valueOf(false)));
        s = a(s);
        int j = ((Point) (s)).x;
        int i1 = ((Point) (s)).y;
        b(new a("ns_ap_res", (new StringBuilder()).append(Integer.toString(j)).append("x").append(Integer.toString(i1)).toString(), Boolean.valueOf(false)));
        b(new a("ns_ap_lang", Locale.getDefault().getLanguage(), Boolean.valueOf(false)));
        b(new a("ns_ap_sv", b1.Y(), Boolean.valueOf(false)));
        if (d1.equals(d.f))
        {
            a("ns_ap_oc", String.valueOf(b1.p().c()));
        }
        long l3 = b1.K();
        j = b1.L();
        b(new a("ns_ap_id", String.valueOf(l3), Boolean.valueOf(false)));
        b(new a("ns_ap_cs", String.valueOf(j), Boolean.valueOf(false)));
        b(new a("ns_ap_bi", b1.P().getPackageName(), Boolean.valueOf(false)));
    }

    private Point a(Context context)
    {
        Point point = new Point();
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return com.comscore.utils.a.a(context);
        } else
        {
            point.x = context.getWidth();
            point.y = context.getHeight();
            return point;
        }
    }

    public static c a(p.aq.b b1, d d1, HashMap hashmap, String s)
    {
        Object obj;
label0:
        {
            boolean flag2 = true;
            obj = null;
            boolean flag;
            if (d1 == p.as.d.a)
            {
                b1.l();
                obj = new p.as.b(b1, d1, s, b1.n());
            } else
            if (d1 == d.d)
            {
                obj = new p.as.a(b1, d1, s);
            } else
            if (d1 != d.c)
            {
                boolean flag1;
                if (hashmap == null || hashmap.get("ns_st_ev") != "hb")
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (hashmap == null || !hashmap.containsKey("ns_st_ev"))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = new c(b1, d1, s, false, flag, flag1);
            }
            if (d1 != d.d)
            {
                ((c) (obj)).a(b1.ab());
            }
            if (d1 == d.d)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            ((c) (obj)).a(hashmap, flag);
            if (!((c) (obj)).a("name").booleanValue())
            {
                if (b1.Q() == null)
                {
                    break label0;
                }
                ((c) (obj)).a("name", b1.Q());
            }
            return ((c) (obj));
        }
        if (d1 == p.as.d.a)
        {
            ((c) (obj)).a("name", "start");
            return ((c) (obj));
        }
        if (b1.G() == p.aq.a.c)
        {
            ((c) (obj)).a("name", "foreground");
            return ((c) (obj));
        } else
        {
            ((c) (obj)).a("name", "background");
            return ((c) (obj));
        }
    }

    private static p.au.a a(d d1)
    {
        if (d1 == p.as.d.a || d1 == d.c || d1 == p.as.d.b)
        {
            return p.au.a.a;
        } else
        {
            return p.au.a.b;
        }
    }
}
