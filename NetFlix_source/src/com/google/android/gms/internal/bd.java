// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, dq, dw, dz, 
//            ea, bc, cb

public final class bd
    implements bb
{

    private final bc mP;

    public bd(bc bc1)
    {
        mP = bc1;
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
                return dq.bA();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return dq.bz();
            }
        }
        return -1;
    }

    public void b(dz dz1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            dw.z("Action missing from an open GMSG.");
        } else
        {
            ea ea1 = dz1.bI();
            if ("expand".equalsIgnoreCase(s))
            {
                if (dz1.bL())
                {
                    dw.z("Cannot expand WebView that is already expanded.");
                    return;
                } else
                {
                    ea1.a(a(map), b(map));
                    return;
                }
            }
            if ("webapp".equalsIgnoreCase(s))
            {
                dz1 = (String)map.get("u");
                if (dz1 != null)
                {
                    ea1.a(a(map), b(map), dz1);
                    return;
                } else
                {
                    ea1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                    return;
                }
            }
            if ("in_app_purchase".equalsIgnoreCase(s))
            {
                dz1 = (String)map.get("product_id");
                map = (String)map.get("report_urls");
                if (mP != null)
                {
                    if (map != null && !map.isEmpty())
                    {
                        map = map.split(" ");
                        mP.a(dz1, new ArrayList(Arrays.asList(map)));
                        return;
                    } else
                    {
                        mP.a(dz1, new ArrayList());
                        return;
                    }
                }
            } else
            {
                ea1.a(new cb((String)map.get("i"), (String)map.get("u"), (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
                return;
            }
        }
    }
}
