// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class cdt
    implements cdi
{

    private final cdo a;
    private final bkg b;
    private final cga c;

    public cdt(cdo cdo1, bkg bkg1, cga cga1)
    {
        a = cdo1;
        b = bkg1;
        c = cga1;
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
                return bkv.g().b();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return bkv.g().a();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return bkv.g().c();
            }
        }
        return -1;
    }

    public final void a(ckw ckw1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            bka.e("Action missing from an open GMSG.");
        } else
        {
            if (b != null && !b.a())
            {
                b.a((String)map.get("u"));
                return;
            }
            ckx ckx1 = ckw1.k();
            if ("expand".equalsIgnoreCase(s))
            {
                if (ckw1.o())
                {
                    bka.e("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    a(false);
                    ckx1.a(a(map), b(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                ckw1 = (String)map.get("u");
                a(false);
                if (ckw1 != null)
                {
                    ckx1.a(a(map), b(map), ckw1);
                    return;
                } else
                {
                    ckx1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                ckw1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (a != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        a.a(ckw1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        a.a(ckw1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                if ("app".equalsIgnoreCase(s) && "true".equalsIgnoreCase((String)map.get("play_store")))
                {
                    map = (String)map.get("u");
                    if (TextUtils.isEmpty(map))
                    {
                        bka.e("Destination url cannot be empty.");
                        return;
                    } else
                    {
                        (new cdu(ckw1, map)).e();
                        return;
                    }
                }
                if ("app".equalsIgnoreCase(s) && "true".equalsIgnoreCase((String)map.get("system_browser")))
                {
                    ckw1 = ckw1.getContext();
                    if (TextUtils.isEmpty((String)map.get("u")))
                    {
                        bka.e("Destination url cannot be empty.");
                        return;
                    }
                    new cdv();
                    map = cdv.a(ckw1, map);
                    try
                    {
                        bkv.e();
                        cjj.a(ckw1, map);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (ckw ckw1)
                    {
                        bka.e(ckw1.getMessage());
                    }
                    return;
                }
                a(true);
                s = (String)map.get("u");
                if (!TextUtils.isEmpty(s))
                {
                    bkv.e();
                    ckw1 = cjj.a(ckw1.getContext(), ckw1.m(), s);
                } else
                {
                    ckw1 = s;
                }
                ckx1.a(new AdLauncherIntentInfoParcel((String)map.get("i"), ckw1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
