// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cf, y, hi

final class a
    implements cf
{

    final y a;

    public final void a(hi hi, Map map)
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

    (y y1)
    {
        a = y1;
        super();
    }
}
