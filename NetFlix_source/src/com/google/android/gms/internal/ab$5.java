// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ab, dz

class lB
    implements bb
{

    final ab lB;

    public void b(dz dz, Map map)
    {
        if (!map.containsKey("isVisible"))
        {
            return;
        }
        boolean flag;
        if ("1".equals(map.get("isVisible")) || "true".equals(map.get("isVisible")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        lB.c(Boolean.valueOf(flag).booleanValue());
    }

    (ab ab1)
    {
        lB = ab1;
        super();
    }
}
