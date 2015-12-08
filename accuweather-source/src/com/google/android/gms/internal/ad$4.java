// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bd, ad, ab, ev, 
//            ey

class lK
    implements bd
{

    final ad lK;

    public void b(ey ey, Map map)
    {
        if (map.containsKey("pingType") && "unloadPing".equals(map.get("pingType")))
        {
            lK.c(ad.b(lK));
            ev.B((new StringBuilder()).append("Unregistered GMSG handlers for: ").append(ad.c(lK).ap()).toString());
        }
    }

    (ad ad1)
    {
        lK = ad1;
        super();
    }
}
