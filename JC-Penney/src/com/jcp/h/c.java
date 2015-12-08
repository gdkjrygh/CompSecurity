// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import android.content.Context;
import android.support.v4.f.a;
import android.text.TextUtils;
import com.digitalanalytics.api.DigitalAnalytics;
import com.jcp.util.ae;
import com.jcp.util.bt;
import java.util.Map;

// Referenced classes of package com.jcp.h:
//            m, e, l

public final class c
{

    private static final String a = com/jcp/h/c.getName();

    private c()
    {
    }

    public static void a(Context context, String s)
    {
        context = bt.b(context);
        String as[] = e(s);
        a a1 = new a();
        a1.put("Page", s);
        a("ScreenOrientation", null, ((String) (context)), as, ((Map) (a1)));
    }

    public static void a(m m1)
    {
        String as[] = b(m1);
        Map map = c(m1);
        a(m1.d(), m1.b(), m1.e(), as, map);
    }

    public static void a(String s)
    {
        a(s, null, "Social Share", null, null);
    }

    public static void a(String s, String s1, l l1)
    {
        a(s, null, s1, a(l1), b(l1));
    }

    private static void a(String s, String s1, String s2, String as[], Map map)
    {
        ae.d(a, "Fire Element Tag:");
        ae.d(a, (new StringBuilder()).append("id = ").append(s).toString());
        ae.d(a, (new StringBuilder()).append("elementCategory = ").append(s2).toString());
        if (as != null && as.length > 0)
        {
            for (int i = 0; i < as.length; i++)
            {
                ae.d(a, (new StringBuilder()).append("attr[").append(i).append("] = ").append(as[i]).toString());
            }

        }
        DigitalAnalytics.fireElement(s, s2, as);
        com.jcp.h.e.a(s, s1, s2, map);
    }

    private static String[] a(l l1)
    {
        String as[] = new String[8];
        for (int i = 0; i < as.length; i++)
        {
            as[i] = "";
        }

        as[6] = l1.a();
        as[7] = l1.b();
        return as;
    }

    private static Map b(l l1)
    {
        a a1 = new a(2);
        a1.put("Channel", l1.a());
        a1.put("Page Id", l1.b());
        return a1;
    }

    public static void b(String s)
    {
        a("SephoraAltMessageText", null, "OnsiteSearch", d(s), c(s));
    }

    private static String[] b(m m1)
    {
        String as[] = new String[17];
        for (int i = 0; i < as.length; i++)
        {
            as[i] = "";
        }

        as[12] = m1.b();
        as[13] = m1.c();
        as[14] = m1.a();
        as[16] = m1.f();
        return as;
    }

    private static Map c(m m1)
    {
        a a1 = new a(3);
        a1.put("Time Stamp", m1.c());
        a1.put("Video Length", m1.a());
        a1.put("Page ID", m1.f());
        return a1;
    }

    private static Map c(String s)
    {
        a a1 = new a(1);
        a1.put("OnSiteSearchTerm", s);
        return a1;
    }

    private static String[] d(String s)
    {
        String as[] = new String[16];
        if (!TextUtils.isEmpty(s))
        {
            for (int i = 0; i < 16; i++)
            {
                as[i] = "";
            }

            as[15] = s;
        }
        return as;
    }

    private static String[] e(String s)
    {
        String as[] = new String[8];
        for (int i = 0; i < as.length; i++)
        {
            as[i] = "";
        }

        as[7] = s;
        return as;
    }

}
