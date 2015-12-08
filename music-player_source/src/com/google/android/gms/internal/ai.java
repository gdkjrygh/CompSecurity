// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ah, ea, ek, em, 
//            eo, bn

public final class ai
    implements ah
{

    public ai()
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
                return ea.c();
            }
            if ("l".equalsIgnoreCase(map))
            {
                return ea.b();
            }
        }
        return -1;
    }

    public final void a(em em1, Map map)
    {
        String s = (String)map.get("a");
        if (s == null)
        {
            ek.d("Action missing from an open GMSG.");
            return;
        }
        eo eo1 = em1.e();
        if ("expand".equalsIgnoreCase(s))
        {
            if (em1.h())
            {
                ek.d("Cannot expand WebView that is already expanded.");
                return;
            } else
            {
                eo1.a(a(map), b(map));
                return;
            }
        }
        if ("webapp".equalsIgnoreCase(s))
        {
            em1 = (String)map.get("u");
            if (em1 != null)
            {
                eo1.a(a(map), b(map), em1);
                return;
            } else
            {
                eo1.a(a(map), b(map), (String)map.get("html"), (String)map.get("baseurl"));
                return;
            }
        } else
        {
            eo1.a(new bn((String)map.get("i"), (String)map.get("u"), (String)map.get("m"), (String)map.get("p"), (String)map.get("c"), (String)map.get("f"), (String)map.get("e")));
            return;
        }
    }
}
