// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bc, ac, aa, eu, 
//            ex

class lM
    implements bc
{

    final ac lM;

    public void b(ex ex, Map map)
    {
        if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType")))
        {
            lM.c(ac.b(lM));
            eu.B((new StringBuilder()).append("Unregistered GMSG handlers for: ").append(ac.c(lM).au()).toString());
        }
    }

    (ac ac1)
    {
        lM = ac1;
        super();
    }
}
