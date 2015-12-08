// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, ep, ev, ey, 
//            ez, be, cf

public final class bh
    implements bd
{

    private final be nb;

    public bh(be be1)
    {
        nb = be1;
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
                return ep.bN();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return ep.bM();
            }
        }
        return -1;
    }

    public void b(ey ey1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            ev.D("Action missing from an open GMSG.");
        } else
        {
            ez ez1 = ey1.bW();
            if ("expand".equalsIgnoreCase(s))
            {
                if (ey1.bZ())
                {
                    ev.D("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    ez1.a(a(map), b(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                ey1 = (String)map.get("u");
                if (ey1 != null)
                {
                    ez1.a(a(map), b(map), ey1);
                    return;
                } else
                {
                    ez1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                ey1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (nb != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        nb.a(ey1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        nb.a(ey1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                ez1.a(new cf((String)map.get("i"), (String)map.get("u"), (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
