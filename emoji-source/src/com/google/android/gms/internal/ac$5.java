// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bc, ac, ex

class lM
    implements bc
{

    final ac lM;

    public void b(ex ex, Map map)
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
        lM.d(Boolean.valueOf(flag).booleanValue());
    }

    (ac ac1)
    {
        lM = ac1;
        super();
    }
}
