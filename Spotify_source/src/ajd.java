// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.comscore.analytics.ApplicationState;
import com.comscore.applications.EventType;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;

public class ajd extends ajg
{

    protected ajd(aif aif1, EventType eventtype, String s)
    {
        this(aif1, eventtype, s, false, false, true);
    }

    protected ajd(aif aif1, EventType eventtype, String s, boolean flag, boolean flag1, boolean flag2)
    {
        super(aif1);
        aif1.o(flag2);
        if (flag2)
        {
            int i = aif1.a(flag1);
            long l1 = aif1.b(flag);
            long l3 = aif1.c(flag1);
            long l4 = aif1.d(flag);
            long l5 = aif1.e(flag1);
            long l6 = aif1.f(flag);
            long l7 = aif1.g(flag1);
            long l8 = aif1.h(flag1);
            long l9 = aif1.i(flag1);
            long l10 = aif1.j(flag1);
            long l11 = aif1.j();
            int k = aif1.k(flag1);
            int i1 = aif1.l(flag1);
            int j1 = aif1.m(flag1);
            int k1 = aif1.n(flag1);
            a(new ajf("ns_ap_fg", String.valueOf(i), Boolean.valueOf(false)));
            a(new ajf("ns_ap_ft", String.valueOf(l1), Boolean.valueOf(false)));
            a(new ajf("ns_ap_dft", String.valueOf(l3), Boolean.valueOf(false)));
            a(new ajf("ns_ap_bt", String.valueOf(l4), Boolean.valueOf(false)));
            a(new ajf("ns_ap_dbt", String.valueOf(l5), Boolean.valueOf(false)));
            a(new ajf("ns_ap_it", String.valueOf(l6), Boolean.valueOf(false)));
            a(new ajf("ns_ap_dit", String.valueOf(l7), Boolean.valueOf(false)));
            if (l11 >= 60000L)
            {
                a(new ajf("ns_ap_ut", String.valueOf(l11), Boolean.valueOf(false)));
            }
            a(new ajf("ns_ap_as", String.valueOf(k), Boolean.valueOf(false)));
            a(new ajf("ns_ap_das", String.valueOf(l8), Boolean.valueOf(false)));
            if (i1 >= 0)
            {
                a(new ajf("ns_ap_aus", String.valueOf(i1), Boolean.valueOf(false)));
                a(new ajf("ns_ap_daus", String.valueOf(l9), Boolean.valueOf(false)));
                a(new ajf("ns_ap_uc", String.valueOf(k1), Boolean.valueOf(false)));
            }
            if (j1 >= 0)
            {
                a(new ajf("ns_ap_us", String.valueOf(j1), Boolean.valueOf(false)));
                a(new ajf("ns_ap_dus", String.valueOf(l10), Boolean.valueOf(false)));
            }
            a(new ajf("ns_ap_usage", Long.toString(c - aif1.w), Boolean.valueOf(false)));
        }
        if (s != null)
        {
            super.b = s;
        }
        a(new ajf("c1", "19", Boolean.valueOf(false)));
        a(new ajf("ns_ap_an", aif1.m(), Boolean.valueOf(false)));
        a(new ajf("ns_ap_pn", "android", Boolean.valueOf(false)));
        a(new ajf("c12", aif1.l(), Boolean.valueOf(false)));
        if (aif1.k() != null)
        {
            a(new ajf("ns_ak", aif1.k(), Boolean.valueOf(false)));
            if (aif1.M.g)
            {
                a(new ajf("ns_ap_ni", "1", Boolean.valueOf(false)));
            }
        }
        if (aif1.M.d() != null)
        {
            b("ns_ap_i3", aif1.M.d());
        }
        a(new ajf("ns_ap_device", Build.DEVICE, Boolean.valueOf(false)));
        Context context;
        Display display;
        int j;
        int l;
        long l2;
        if (eventtype == EventType.a || eventtype == EventType.c || eventtype == EventType.b)
        {
            s = com.comscore.metrics.EventType.a;
        } else
        {
            s = com.comscore.metrics.EventType.b;
        }
        a(new ajf("ns_type", s.toString(), Boolean.valueOf(false)));
        a(new ajf("ns_ts", Long.toString(c), Boolean.valueOf(false)));
        a(new ajf("ns_nc", "1", Boolean.valueOf(false)));
        a(new ajf("ns_ap_pfv", android.os.Build.VERSION.RELEASE, Boolean.valueOf(false)));
        a(new ajf("ns_ap_pfm", "android", Boolean.valueOf(false)));
        a(new ajf("ns_ap_ev", eventtype.toString(), Boolean.valueOf(false)));
        context = aif1.C;
        a(new ajf("ns_ap_ver", aif1.q, Boolean.valueOf(false)));
        s = new Point();
        display = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            Point point = new Point();
            s = point;
            if (android.os.Build.VERSION.SDK_INT >= 13)
            {
                display.getSize(point);
                s = point;
            }
        } else
        {
            s.x = display.getWidth();
            s.y = display.getHeight();
        }
        j = ((Point) (s)).x;
        l = ((Point) (s)).y;
        a(new ajf("ns_ap_res", (new StringBuilder()).append(Integer.toString(j)).append("x").append(Integer.toString(l)).toString(), Boolean.valueOf(false)));
        a(new ajf("ns_ap_lang", Locale.getDefault().getLanguage(), Boolean.valueOf(false)));
        a(new ajf("ns_ap_sv", "2.1409.23", Boolean.valueOf(false)));
        if (eventtype.equals(EventType.f))
        {
            b("ns_ap_oc", String.valueOf(aif1.a.a()));
        }
        l2 = aif1.m;
        j = aif1.n.get();
        a(new ajf("ns_ap_id", String.valueOf(l2), Boolean.valueOf(false)));
        a(new ajf("ns_ap_cs", String.valueOf(j), Boolean.valueOf(false)));
        a(new ajf("ns_ap_bi", aif1.C.getPackageName(), Boolean.valueOf(false)));
    }

    public static ajd a(aif aif1, EventType eventtype, HashMap hashmap, String s)
    {
        Object obj;
label0:
        {
            boolean flag2 = true;
            obj = null;
            boolean flag;
            if (eventtype == EventType.a)
            {
                if (aif1.N)
                {
                    aif1.l.getAndIncrement();
                    aif1.b.a("runs", Long.toString(aif1.l.get()));
                }
                obj = new ajc(aif1, eventtype, s, aif1.b());
            } else
            if (eventtype == EventType.d)
            {
                obj = new ajb(aif1, eventtype, s);
            } else
            if (eventtype != EventType.c)
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
                obj = new ajd(aif1, eventtype, s, false, flag, flag1);
            }
            if (eventtype != EventType.d)
            {
                ((ajg) (obj)).a(aif1.D, false);
            }
            if (eventtype == EventType.d)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            ((ajd) (obj)).a(hashmap, flag);
            if (!Boolean.valueOf(((ajg) (obj)).a.containsKey("name")).booleanValue())
            {
                if (eventtype != EventType.a)
                {
                    break label0;
                }
                ((ajd) (obj)).b("name", "start");
            }
            return ((ajd) (obj));
        }
        if (aif1.h() == ApplicationState.c)
        {
            ((ajd) (obj)).b("name", "foreground");
            return ((ajd) (obj));
        } else
        {
            ((ajd) (obj)).b("name", "background");
            return ((ajd) (obj));
        }
    }
}
