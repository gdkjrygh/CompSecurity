// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.rebound;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.rebound:
//            j

public final class k
{

    private static final k b = new k();
    public final Map a = new HashMap();

    private k()
    {
        j j1 = j.c;
        if (j1 == null)
        {
            throw new IllegalArgumentException("springConfig is required");
        }
        if (!a.containsKey(j1))
        {
            a.put(j1, "default config");
        }
    }

    public static k a()
    {
        return b;
    }

}
