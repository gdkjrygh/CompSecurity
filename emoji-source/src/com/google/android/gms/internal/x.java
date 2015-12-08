// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            z, ex, ac

class x
    implements z
{

    private ex le;

    public x(ex ex1)
    {
        le = ex1;
    }

    public void a(ac ac, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            ac = "1";
        } else
        {
            ac = "0";
        }
        hashmap.put("isVisible", ac);
        le.a("onAdVisibilityChanged", hashmap);
    }
}
