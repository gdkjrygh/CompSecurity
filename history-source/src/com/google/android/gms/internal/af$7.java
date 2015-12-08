// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cd, af, gu

class nd
    implements cd
{

    final af nd;

    public void a(gu gu, Map map)
    {
        while (!nd.a(map) || !map.containsKey("isVisible")) 
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
        nd.f(Boolean.valueOf(flag).booleanValue());
    }

    (af af1)
    {
        nd = af1;
        super();
    }
}
