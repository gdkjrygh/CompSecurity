// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.common.content;

import java.util.Arrays;
import java.util.Set;

// Referenced classes of package com.android.common.content:
//            ProjectionMap

public static class mMap
{

    private ProjectionMap mMap;

    public mMap add(String s)
    {
        ProjectionMap.access$000(mMap, s, s);
        return this;
    }

    public mMap add(String s, String s1)
    {
        ProjectionMap.access$000(mMap, s, (new StringBuilder()).append(s1).append(" AS ").append(s).toString());
        return this;
    }

    public mMap addAll(String as[])
    {
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            add(as[i]);
        }

        return this;
    }

    public final ProjectionMap build()
    {
        String as[] = new String[mMap.size()];
        mMap.keySet().toArray(as);
        Arrays.sort(as);
        ProjectionMap.access$102(mMap, as);
        return mMap;
    }

    public ()
    {
        mMap = new ProjectionMap();
    }
}
