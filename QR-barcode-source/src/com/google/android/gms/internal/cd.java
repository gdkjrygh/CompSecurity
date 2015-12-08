// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, gj, gs, v, 
//            gv, gw, bz, dj

public final class cd
    implements by
{

    private final bz pL;
    private final v pM;

    public cd(bz bz1, v v1)
    {
        pL = bz1;
        pM = v1;
    }

    private static boolean b(Map map)
    {
        return "1".equals(map.get("custom_close"));
    }

    private static int c(Map map)
    {
        map = (String)map.get("o");
        if (map != null)
        {
            if ("p".equalsIgnoreCase(map))
            {
                return gj.dm();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return gj.dl();
            }
        }
        return -1;
    }

    public void a(gv gv1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            gs.W("Action missing from an open GMSG.");
        } else
        {
            if (pM != null && !pM.av())
            {
                pM.d((String)map.get("u"));
                return;
            }
            gw gw1 = gv1.du();
            if ("expand".equalsIgnoreCase(s))
            {
                if (gv1.dy())
                {
                    gs.W("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    gw1.a(b(map), c(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                gv1 = (String)map.get("u");
                if (gv1 != null)
                {
                    gw1.a(b(map), c(map), gv1);
                    return;
                } else
                {
                    gw1.a(b(map), c(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                gv1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (pL != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        pL.a(gv1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        pL.a(gv1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                gw1.a(new dj((String)map.get("i"), (String)map.get("u"), (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
