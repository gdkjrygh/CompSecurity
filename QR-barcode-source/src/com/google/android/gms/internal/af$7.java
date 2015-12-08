// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            by, af, gv

class mT
    implements by
{

    final af mT;

    public void a(gv gv, Map map)
    {
        while (!mT.a(map) || !map.containsKey("isVisible")) 
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
        mT.d(Boolean.valueOf(flag).booleanValue());
    }

    (af af1)
    {
        mT = af1;
        super();
    }
}
