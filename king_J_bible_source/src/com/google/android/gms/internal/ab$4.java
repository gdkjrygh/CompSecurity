// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ab, z, dw, 
//            dz

class lB
    implements bb
{

    final ab lB;

    public void b(dz dz, Map map)
    {
        if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType")))
        {
            lB.c(ab.b(lB));
            dw.x((new StringBuilder()).append("Unregistered GMSG handlers for: ").append(ab.c(lB).ao()).toString());
        }
    }

    (ab ab1)
    {
        lB = ab1;
        super();
    }
}
