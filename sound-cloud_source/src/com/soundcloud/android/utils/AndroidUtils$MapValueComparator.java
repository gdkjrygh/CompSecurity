// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import java.util.Comparator;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.utils:
//            AndroidUtils

private static class map
    implements Comparator
{

    Map map;

    public volatile int compare(Object obj, Object obj1)
    {
        return compare((String)obj, (String)obj1);
    }

    public int compare(String s, String s1)
    {
        return ((Integer)map.get(s)).intValue() < ((Integer)map.get(s1)).intValue() ? 1 : -1;
    }

    public (Map map1)
    {
        map = map1;
    }
}
