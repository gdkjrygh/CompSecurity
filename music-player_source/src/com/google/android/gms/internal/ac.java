// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ah, em, ek, bp

final class ac
    implements ah
{

    ac()
    {
    }

    public final void a(em em1, Map map)
    {
        em1 = em1.c();
        if (em1 == null)
        {
            ek.d("A GMSG tried to use a custom close button on something that wasn't an overlay.");
            return;
        } else
        {
            em1.a("1".equals(map.get("custom_close")));
            return;
        }
    }
}
