// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            cf, hj, hi

private final class <init>
    implements cf
{

    final hj a;

    public final void a(hi hi, Map map)
    {
        if (map.keySet().contains("start"))
        {
            hj.a(a);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                hj.b(a);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                hj.c(a);
                return;
            }
        }
    }

    private (hj hj1)
    {
        a = hj1;
        super();
    }

    a(hj hj1, byte byte0)
    {
        this(hj1);
    }
}
