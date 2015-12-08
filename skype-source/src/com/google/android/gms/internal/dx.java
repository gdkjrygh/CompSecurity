// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.p;
import com.google.android.gms.ads.internal.util.client.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            gn, hi

public final class dx
{

    private final hi a;
    private final boolean b;
    private final String c;

    public dx(hi hi1, Map map)
    {
        a = hi1;
        c = (String)map.get("forceOrientation");
        if (map.containsKey("allowOrientationChange"))
        {
            b = Boolean.parseBoolean((String)map.get("allowOrientationChange"));
            return;
        } else
        {
            b = true;
            return;
        }
    }

    public final void a()
    {
        if (a == null)
        {
            com.google.android.gms.ads.internal.util.client.b.c("AdWebView is null");
            return;
        }
        int i;
        if ("portrait".equalsIgnoreCase(c))
        {
            i = p.g().b();
        } else
        if ("landscape".equalsIgnoreCase(c))
        {
            i = p.g().a();
        } else
        if (b)
        {
            i = -1;
        } else
        {
            i = p.g().c();
        }
        a.setRequestedOrientation(i);
    }
}
