// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.gms.internal:
//            bg, fm, fl

final class fp
    implements bg
{

    final fm a;

    private fp(fm fm1)
    {
        a = fm1;
        super();
    }

    fp(fm fm1, byte byte0)
    {
        this(fm1);
    }

    public final void a(fl fl, Map map)
    {
        if (map.keySet().contains("start"))
        {
            fm.a(a);
        } else
        {
            if (map.keySet().contains("stop"))
            {
                fm.b(a);
                return;
            }
            if (map.keySet().contains("cancel"))
            {
                fm.c(a);
                return;
            }
        }
    }
}
