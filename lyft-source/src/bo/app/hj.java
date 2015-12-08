// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package bo.app:
//            fs, fa, hk, fd, 
//            gf, ib

public final class hj
{

    static final fd a;

    static ib a(ib ib)
    {
        return new hk(ib);
    }

    static Object a(java.util.Map.Entry entry)
    {
        if (entry == null)
        {
            return null;
        } else
        {
            return entry.getKey();
        }
    }

    static String a(Map map)
    {
        StringBuilder stringbuilder = fs.a(map.size()).append('{');
        a.a(stringbuilder, map.entrySet().iterator());
        return stringbuilder.append('}').toString();
    }

    public static HashMap a()
    {
        return new HashMap();
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new gf(obj, obj1);
    }

    static boolean a(Map map, Object obj)
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
        a = fs.a.c("=");
    }
}
