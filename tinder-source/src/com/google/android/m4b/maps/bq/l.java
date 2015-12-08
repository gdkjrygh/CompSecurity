// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bq;

import com.google.android.m4b.maps.bo.ah;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.m4b.maps.bq:
//            j

public final class l
{

    private static final Map a = new HashMap();

    public static void a(ah ah, j j1)
    {
        a.put(ah, j1);
    }

    public static boolean a(ah ah)
    {
        return a.containsKey(ah);
    }

    public static j b(ah ah)
    {
        j j1 = (j)a.get(ah);
        if (j1 == null)
        {
            ah = String.valueOf(ah);
            throw new IllegalStateException((new StringBuilder(String.valueOf(ah).length() + 36)).append("TileStore: ").append(ah).append(" has not been registered ").toString());
        } else
        {
            return j1;
        }
    }

}
