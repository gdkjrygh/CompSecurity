// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            bb, ba, dz, l, 
//            h, dw

static final class 
    implements bb
{

    public void b(dz dz1, Map map)
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
            dz1 = dz1.bJ();
        }
        // Misplaced declaration of an exception variable
        catch (dz dz1)
        {
            dw.z("Could not parse touch parameters from gmsg.");
            return;
        }
        if (dz1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        dz1.y().a(i, j, k);
    }

    ()
    {
    }
}
