// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ci, cn, cq, 
//            cr, be

public final class aj
    implements ai
{

    public aj()
    {
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
                return ci.ao();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return ci.an();
            }
        }
        return -1;
    }

    public void a(cq cq1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            cn.q("Action missing from an open GMSG.");
            return;
        }
        cr cr1 = cq1.aw();
        if ("expand".equalsIgnoreCase(s))
        {
            if (cq1.az())
            {
                cn.q("Cannot expand WebView that is already expanded.");
                return;
            } else
            {
                cr1.a(a(map), b(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(s))
        {
            cq1 = (String)map.get("u");
            if (cq1 != null)
            {
                cr1.a(a(map), b(map), cq1);
                return;
            } else
            {
                cr1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                return;
            }
        } else
        {
            cr1.a(new be((String)map.get("i"), (String)map.get("u"), (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
            return;
        }
    }
}
