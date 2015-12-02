// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class adf
    implements acu
{

    private final ada a;
    private final ok b;
    private final afb c;

    public adf(ada ada1, ok ok1, afb afb1)
    {
        a = ada1;
        b = ok1;
        c = afb1;
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
                return ot.g().b();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return ot.g().a();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return ot.g().c();
            }
        }
        return -1;
    }

    public final void a(akk akk1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            of.e("Action missing from an open GMSG.");
        } else
        {
            if (b != null && !b.b())
            {
                b.a((String)map.get("u"));
                return;
            }
            akl akl1 = akk1.i();
            if ("expand".equalsIgnoreCase(s))
            {
                if (akk1.m())
                {
                    of.e("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    a(false);
                    akl1.a(a(map), b(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                akk1 = (String)map.get("u");
                a(false);
                if (akk1 != null)
                {
                    akl1.a(a(map), b(map), akk1);
                    return;
                } else
                {
                    akl1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                akk1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (a != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        a.a(akk1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        a.a(akk1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                a(true);
                String s1 = (String)map.get("u");
                if (!TextUtils.isEmpty(s1))
                {
                    ot.e();
                    akk1 = ajc.a(akk1, s1);
                } else
                {
                    akk1 = s1;
                }
                akl1.a(new AdLauncherIntentInfoParcel((String)map.get("i"), akk1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
