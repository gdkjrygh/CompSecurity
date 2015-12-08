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

final class aH extends aI
{

    aH()
    {
    }

    public final Object a(String s)
    {
        if (s.equals("small"))
        {
            return Integer.valueOf(1);
        }
        if (s.equals("normal"))
        {
            return Integer.valueOf(2);
        }
        if (s.equals("large"))
        {
            return Integer.valueOf(3);
        }
        if (s.equals("xlarge"))
        {
            return Integer.valueOf(4);
        } else
        {
            return null;
        }
    }

    final Map a(Map map, DisplayMetrics displaymetrics)
    {
        displaymetrics = new HashMap();
        Iterator iterator = map.keySet().iterator();
        int i = 0x80000000;
        do
        {
            String s;
            Integer integer;
            int j;
            do
            {
                if (!iterator.hasNext())
                {
                    return displaymetrics;
                }
                s = (String)iterator.next();
                integer = (Integer)map.get(s);
                j = i;
                if (integer.intValue() > i)
                {
                    j = integer.intValue();
                    displaymetrics.clear();
                }
                i = j;
            } while (integer.intValue() != j);
            displaymetrics.put(s, integer);
            i = j;
        } while (true);
    }

    public final boolean a(Object obj, Configuration configuration)
    {
        return (configuration.screenLayout & 0xf) <= ((Integer)obj).intValue();
    }
}
