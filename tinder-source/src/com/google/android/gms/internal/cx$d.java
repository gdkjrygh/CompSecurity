// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            aq, cx, cw

private final class <init>
    implements aq
{

    final cx a;

    public final void a(cw cw, Map map)
    {
        if (map.keySet().contains("start"))
        {
            cx.a(a);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                cx.b(a);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                cx.c(a);
                return;
            }
        }
    }

    private (cx cx1)
    {
        a = cx1;
        super();
    }

    a(cx cx1, byte byte0)
    {
        this(cx1);
    }
}
