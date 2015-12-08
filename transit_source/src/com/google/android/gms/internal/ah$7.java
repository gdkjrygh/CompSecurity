// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ai, ah, cq, h, 
//            d, cn

static final class 
    implements ai
{

    public void a(cq cq1, Map map)
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
            cq1 = cq1.ax();
        }
        // Misplaced declaration of an exception variable
        catch (cq cq1)
        {
            cn.q("Could not parse touch parameters from gmsg.");
            return;
        }
        if (cq1 == null)
        {
            break MISSING_BLOCK_LABEL_80;
        }
        cq1.g().a(i, j, k);
    }

    ()
    {
    }
}
