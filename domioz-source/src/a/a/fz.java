// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

// Referenced classes of package a.a:
//            ei, dp, gb, ds, 
//            ev, gs

public final class fz
{

    static final ds a;

    static gs a(gs gs)
    {
        return new gb(gs);
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
        StringBuilder stringbuilder = ei.a(map.size()).append('{');
        a.a(stringbuilder, map.entrySet().iterator());
        return stringbuilder.append('}').toString();
    }

    public static HashMap a()
    {
        return new HashMap();
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new ev(obj, obj1);
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
        a = ei.a.c("=");
    }
}
