// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            y, dz, ab

class w
    implements y
{

    private dz kU;

    public w(dz dz1)
    {
        kU = dz1;
    }

    public void a(ab ab, boolean flag)
    {
        HashMap hashmap = new HashMap();
        if (flag)
        {
            ab = "1";
        } else
        {
            ab = "0";
        }
        hashmap.put("isVisible", ab);
        kU.a("onAdVisibilityChanged", hashmap);
    }
}
