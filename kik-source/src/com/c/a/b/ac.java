// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.b;

import com.c.a.a.r;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.a.b:
//            e, d, ad, l, 
//            ao

public final class ac
{

    static final com.c.a.a.r.a a;

    static int a()
    {
        d.a(1, "expectedSize");
        return 2;
    }

    static ao a(ao ao)
    {
        return new ad(ao);
    }

    static String a(Map map)
    {
        StringBuilder stringbuilder = e.a(map.size()).append('{');
        a.a(stringbuilder, map.entrySet().iterator());
        return stringbuilder.append('}').toString();
    }

    public static java.util.Map.Entry a(Object obj, Object obj1)
    {
        return new l(obj, obj1);
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
        a = e.a.c("=");
    }
}
