// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import com.google.common.collect.ImmutableList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class ggi
{

    public static int a(Map map)
    {
        if (map == null)
        {
            return 0;
        }
        map = map.entrySet().iterator();
        java.util.Map.Entry entry;
        int i;
        for (i = 0; map.hasNext(); i = Arrays.hashCode(new Object[] {
    entry.getKey(), entry.getValue()
}) + i)
        {
            entry = (java.util.Map.Entry)map.next();
        }

        return i;
    }

    public static ImmutableList a(List list)
    {
        if (list != null)
        {
            return ImmutableList.a(list);
        } else
        {
            return ImmutableList.d();
        }
    }

    public static boolean a(Context context)
    {
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static boolean a(Object obj, Object obj1)
    {
        return obj == obj1;
    }

    public static boolean a(Map map, Map map1)
    {
        if (map == null && map1 == null)
        {
            return true;
        }
        if (map == null)
        {
            return false;
        }
        if (map1 == null)
        {
            return false;
        }
        if (map.size() != map1.size())
        {
            return false;
        }
        for (map = map.entrySet().iterator(); map.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
            if (!map1.containsKey(entry.getKey()))
            {
                return false;
            }
            if (!cty.a(entry.getValue(), map1.get(entry.getKey())))
            {
                return false;
            }
        }

        return true;
    }

    public static boolean b(Context context)
    {
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static boolean c(Context context)
    {
        return context.getResources().getBoolean(0x7f0a0009);
    }
}
