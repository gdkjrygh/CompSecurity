// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ah, em, kz, iv, 
//            ek

final class ag
    implements ah
{

    ag()
    {
    }

    public final void a(em em1, Map map)
    {
        String s = (String)map.get("tx");
        String s1 = (String)map.get("ty");
        map = (String)map.get("td");
        int i;
        int j;
        int k;
        try
        {
            i = Integer.parseInt(s);
            j = Integer.parseInt(s1);
            k = Integer.parseInt(map);
            em1 = em1.f();
        }
        // Misplaced declaration of an exception variable
        catch (em em1)
        {
            ek.d("Could not parse touch parameters from gmsg.");
            return;
        }
        if (em1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        em1.a().a(i, j, k);
    }
}
