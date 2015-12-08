// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.aa;
import com.google.a.a.ad;
import com.google.a.a.w;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.a.b:
//            z, y, cb, cc, 
//            bl, ap, di

public final class ca
{

    static final aa a;

    static int a(int i)
    {
        if (i < 3)
        {
            y.a(i, "expectedSize");
            return i + 1;
        }
        if (i < 0x40000000)
        {
            return i / 3 + i;
        } else
        {
            return 0x7fffffff;
        }
    }

    static di a(di di)
    {
        return new cb(di);
    }

    static Object a(Map map, Object obj)
    {
        ad.a(map);
        try
        {
            map = ((Map) (map.get(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static String a(Map map)
    {
        StringBuilder stringbuilder = z.a(map.size()).append('{');
        a.a(stringbuilder, map.entrySet().iterator());
        return stringbuilder.append('}').toString();
    }

    static Iterator a(Iterator iterator)
    {
        return bl.a(iterator, cc.a);
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new ap(obj, obj1);
    }

    static Iterator b(Iterator iterator)
    {
        return bl.a(iterator, cc.b);
    }

    static boolean b(Map map, Object obj)
    {
        ad.a(map);
        boolean flag;
        try
        {
            flag = map.containsKey(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return false;
        }
        return flag;
    }

    static Object c(Map map, Object obj)
    {
        ad.a(map);
        try
        {
            map = ((Map) (map.remove(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            return null;
        }
        return map;
    }

    static boolean d(Map map, Object obj)
    {
        if (map == obj)
        {
            return true;
        }
        if (obj instanceof Map)
        {
            obj = (Map)obj;
            return map.entrySet().equals(((Map) (obj)).entrySet());
        } else
        {
            return false;
        }
    }

    static 
    {
        a = z.a.c("=");
    }
}
