// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bg, cb, a, eu, 
//            fj, lf, fl, fm, 
//            es, zzek, bh

public final class bm
    implements bg
{

    private final bh a;
    private final lf b;
    private final cb c;

    public bm(bh bh, lf lf1, cb cb1)
    {
        a = bh;
        b = lf1;
        c = cb1;
    }

    private void a(boolean flag)
    {
        if (c != null)
        {
            c.a(flag);
        }
    }

    private static boolean a(Map map)
    {
        return "1".equals(map.get("custom_close"));
    }

    private static int b(Map map)
    {
        map = (String)map.get("o");
        if (map != null)
        {
            if ("p".equalsIgnoreCase(map))
            {
                return com.google.android.gms.internal.a.e().b();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return com.google.android.gms.internal.a.e().a();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return com.google.android.gms.internal.a.e().c();
            }
        }
        return -1;
    }

    public final void a(fl fl1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            fj.e("Action missing from an open GMSG.");
        } else
        {
            if (b != null && !b.a())
            {
                map.get("u");
                fj.a("Action was blocked because no click was detected.");
                return;
            }
            fm fm1 = fl1.g();
            if ("expand".equalsIgnoreCase(s))
            {
                if (fl1.k())
                {
                    fj.e("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    a(false);
                    fm1.a(a(map), b(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                fl1 = (String)map.get("u");
                a(false);
                if (fl1 != null)
                {
                    fm1.a(a(map), b(map), fl1);
                    return;
                } else
                {
                    fm1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                map.get("product_id");
                fl1 = (String)map.get("report_urls");
                if (a != null)
                {
                    if (fl1 != null && !fl1.isEmpty())
                    {
                        new ArrayList(Arrays.asList(fl1.split(" ")));
                        return;
                    } else
                    {
                        new ArrayList();
                        return;
                    }
                }
            } else
            {
                a(true);
                String s1 = (String)map.get("u");
                if (!TextUtils.isEmpty(s1))
                {
                    com.google.android.gms.internal.a.c();
                    fl1.getContext();
                    fl1 = es.a(fl1.i(), s1);
                } else
                {
                    fl1 = s1;
                }
                fm1.a(new zzek((String)map.get("i"), fl1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
