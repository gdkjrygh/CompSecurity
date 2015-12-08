// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.leanplum:
//            aI

final class at extends aI
{

    at()
    {
    }

    public final Object a(String s)
    {
        if (s.equals("ldpi"))
        {
            return Integer.valueOf(120);
        }
        if (s.equals("mdpi"))
        {
            return Integer.valueOf(160);
        }
        if (s.equals("hdpi"))
        {
            return Integer.valueOf(240);
        }
        if (s.equals("xhdpi"))
        {
            return Integer.valueOf(320);
        }
        if (s.equals("nodpi"))
        {
            return Integer.valueOf(0);
        }
        if (s.equals("tvdpi"))
        {
            return Integer.valueOf(213);
        }
        if (s.equals("xxhigh"))
        {
            return Integer.valueOf(480);
        } else
        {
            return null;
        }
    }

    final Map a(Map map, DisplayMetrics displaymetrics)
    {
        HashMap hashmap;
        Iterator iterator;
        int i;
        hashmap = new HashMap();
        iterator = map.keySet().iterator();
        i = 0x7fffffff;
_L5:
        if (iterator.hasNext()) goto _L2; else goto _L1
_L1:
        if (hashmap.size() != 0) goto _L4; else goto _L3
_L3:
        i = 0x80000000;
        displaymetrics = map.keySet().iterator();
_L6:
        if (displaymetrics.hasNext())
        {
            break MISSING_BLOCK_LABEL_171;
        }
_L4:
        return hashmap;
_L2:
        String s1 = (String)iterator.next();
        Integer integer1 = (Integer)map.get(s1);
        int j = i;
        if (integer1.intValue() < i)
        {
            j = i;
            if (integer1.intValue() >= displaymetrics.densityDpi)
            {
                j = integer1.intValue();
                hashmap.clear();
            }
        }
        i = j;
        if (integer1.intValue() == j)
        {
            hashmap.put(s1, integer1);
            i = j;
        }
          goto _L5
        String s = (String)displaymetrics.next();
        Integer integer = (Integer)map.get(s);
        int k = i;
        if (integer.intValue() > i)
        {
            k = integer.intValue();
            hashmap.clear();
        }
        i = k;
        if (integer.intValue() == k)
        {
            hashmap.put(s, integer);
            i = k;
        }
          goto _L6
    }

    public final boolean a(Object obj, Configuration configuration)
    {
        return true;
    }
}
