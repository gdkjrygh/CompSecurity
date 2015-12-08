// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            fz, at, ry

final class bb
    implements fz
{

    final at a;

    bb(at at1)
    {
        a = at1;
        super();
    }

    public final void zza(ry ry, Map map)
    {
        while (!a.a(map) || !map.containsKey("isVisible")) 
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
        a.a(Boolean.valueOf(flag).booleanValue());
    }
}
