// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, ad, ey

class lK
    implements bd
{

    final ad lK;

    public void b(ey ey, Map map)
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
        lK.d(Boolean.valueOf(flag).booleanValue());
    }

    (ad ad1)
    {
        lK = ad1;
        super();
    }
}
