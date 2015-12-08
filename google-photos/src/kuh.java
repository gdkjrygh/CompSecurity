// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.overlay.AdLauncherIntentInfoParcel;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public final class kuh
    implements kuf
{

    private final k a;
    private final jpz b;
    private final kvl c;

    public kuh(k k, jpz jpz1, kvl kvl1)
    {
        a = k;
        b = jpz1;
        c = kvl1;
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
                return jqc.e().b();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return jqc.e().a();
            }
            if ("c".equalsIgnoreCase(map))
            {
                return jqc.e().c();
            }
        }
        return -1;
    }

    public final void a(kxu kxu1, Map map)
    {
        Object obj = null;
        String s1 = null;
        Object obj1 = (String)map.get("a");
        if (obj1 == null)
        {
            b.m("Action missing from an open GMSG.");
        } else
        {
            if (b != null && !b.a())
            {
                b.a((String)map.get("u"));
                return;
            }
            kxv kxv1 = kxu1.j();
            if ("expand".equalsIgnoreCase(((String) (obj1))))
            {
                if (kxu1.n())
                {
                    b.m("Cannot expand WebView that is already expanded.");
                    return;
                }
                a(false);
                boolean flag = a(map);
                int i = b(map);
                if (kxv1.a.n() && !kxv1.a.i().e)
                {
                    kxu1 = null;
                } else
                {
                    kxu1 = kxv1.d;
                }
                kxv1.a(new AdOverlayInfoParcel(kxu1, kxv1.e, kxv1.l, kxv1.a, flag, i, kxv1.a.m()));
                return;
            }
            if ("webapp".equalsIgnoreCase(((String) (obj1))))
            {
                obj1 = (String)map.get("u");
                a(false);
                if (obj1 != null)
                {
                    boolean flag1 = a(map);
                    int j = b(map);
                    boolean flag3 = kxv1.a.n();
                    if (flag3 && !kxv1.a.i().e)
                    {
                        kxu1 = null;
                    } else
                    {
                        kxu1 = kxv1.d;
                    }
                    if (flag3)
                    {
                        map = s1;
                    } else
                    {
                        map = new jpc(kxv1.a, kxv1.e);
                    }
                    kxv1.a(new AdOverlayInfoParcel(kxu1, map, kxv1.g, kxv1.l, kxv1.a, flag1, j, ((String) (obj1)), kxv1.a.m(), kxv1.j));
                    return;
                }
                boolean flag2 = a(map);
                int k = b(map);
                s1 = (String)map.get("html");
                obj1 = (String)map.get("baseurl");
                boolean flag4 = kxv1.a.n();
                if (flag4 && !kxv1.a.i().e)
                {
                    kxu1 = null;
                } else
                {
                    kxu1 = kxv1.d;
                }
                if (flag4)
                {
                    map = obj;
                } else
                {
                    map = new jpc(kxv1.a, kxv1.e);
                }
                kxv1.a(new AdOverlayInfoParcel(kxu1, map, kxv1.g, kxv1.l, kxv1.a, flag2, k, s1, ((String) (obj1)), kxv1.a.m(), kxv1.j));
                return;
            }
            if ("in_app_purchase".equalsIgnoreCase(((String) (obj1))))
            {
                map.get("product_id");
                kxu1 = (String)map.get("report_urls");
                if (a != null)
                {
                    if (kxu1 != null && !kxu1.isEmpty())
                    {
                        new ArrayList(Arrays.asList(kxu1.split(" ")));
                        return;
                    } else
                    {
                        new ArrayList();
                        return;
                    }
                }
            } else
            {
                if ("app".equalsIgnoreCase(((String) (obj1))) && "true".equalsIgnoreCase((String)map.get("play_store")))
                {
                    map = (String)map.get("u");
                    if (TextUtils.isEmpty(map))
                    {
                        b.m("Destination url cannot be empty.");
                        return;
                    } else
                    {
                        kwv.a(((kwr) (new kui(kxu1, map))).c);
                        return;
                    }
                }
                if ("app".equalsIgnoreCase(((String) (obj1))) && "true".equalsIgnoreCase((String)map.get("system_browser")))
                {
                    kxu1 = kxu1.getContext();
                    if (TextUtils.isEmpty((String)map.get("u")))
                    {
                        b.m("Destination url cannot be empty.");
                        return;
                    }
                    map = (new kuj()).a(kxu1, map);
                    try
                    {
                        kxu1.startActivity(map);
                        return;
                    }
                    // Misplaced declaration of an exception variable
                    catch (kxu kxu1)
                    {
                        b.m(kxu1.getMessage());
                    }
                    return;
                }
                a(true);
                obj1 = kxu1.l();
                String s = (String)map.get("u");
                if (!TextUtils.isEmpty(s))
                {
                    String s2 = s;
                    if (obj1 != null)
                    {
                        s2 = s;
                        if (((ksq) (obj1)).a(Uri.parse(s)))
                        {
                            s2 = jqc.c().a(kxu1.getContext(), s, kxu1.s());
                        }
                    }
                    jqc.c();
                    kxu1 = kwz.a(kxu1.getContext(), kxu1.l(), s2);
                } else
                {
                    kxu1 = s;
                }
                kxv1.a(new AdLauncherIntentInfoParcel((String)map.get("i"), kxu1, (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
