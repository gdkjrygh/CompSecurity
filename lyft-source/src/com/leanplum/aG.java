// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.content.res.Configuration;
import android.util.DisplayMetrics;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.leanplum:
//            aI

final class aG extends aI
{

    aG()
    {
    }

    public final Object a(String s)
    {
        if (s.startsWith("h") && s.endsWith("dp"))
        {
            return Integer.getInteger(s.substring(1, s.length() - 2));
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
        int i;
        int j;
        try
        {
            i = ((Integer)configuration.getClass().getField("screenHeightDp").get(configuration)).intValue();
            j = ((Integer)obj).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            ((Exception) (obj)).printStackTrace();
            return false;
        }
        return i >= j;
    }
}
