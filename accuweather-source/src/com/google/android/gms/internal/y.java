// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            aa, ey, ad

class y
    implements aa
{

    private ey lc;

    public y(ey ey1)
    {
        lc = ey1;
    }

    public void a(ad ad, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            ad = "1";
        } else
        {
            ad = "0";
        }
        hashmap.put("isVisible", ad);
        lc.a("onAdVisibilityChanged", hashmap);
    }
}
