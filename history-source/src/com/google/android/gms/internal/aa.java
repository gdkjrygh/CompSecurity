// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            ac, gu, af

class aa
    implements ac
{

    private gu mt;

    public aa(gu gu1)
    {
        mt = gu1;
    }

    public void a(af af, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            af = "1";
        } else
        {
            af = "0";
        }
        hashmap.put("isVisible", af);
        mt.a("onAdVisibilityChanged", hashmap);
    }
}
