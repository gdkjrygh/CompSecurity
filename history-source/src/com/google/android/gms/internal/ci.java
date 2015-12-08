// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, gi, gr, v, 
//            gu, gv, ce, do

public final class ci
    implements cd
{

    private final ce qc;
    private final v qd;

    public ci(ce ce1, v v1)
    {
        qc = ce1;
        qd = v1;
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
                return gi.dv();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return gi.du();
            }
        }
        return -1;
    }

    public void a(gu gu1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            gr.W("Action missing from an open GMSG.");
        } else
        {
            if (qd != null && !qd.az())
            {
                qd.d((String)map.get("u"));
                return;
            }
            gv gv1 = gu1.dD();
            if ("expand".equalsIgnoreCase(s))
            {
                if (gu1.dH())
                {
                    gr.W("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    gv1.a(b(map), c(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                gu1 = (String)map.get("u");
                if (gu1 != null)
                {
                    gv1.a(b(map), c(map), gu1);
                    return;
                } else
                {
                    gv1.a(b(map), c(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                gu1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (qc != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        qc.a(gu1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        qc.a(gu1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                gv1.a(new do((String)map.get("i"), (String)map.get("u"), (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
