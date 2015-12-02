// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.w;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.facebook.common.w:
//            h, g

public class f
{

    public f()
    {
    }

    public static Map a(Class class1, g g1, EnumSet enumset)
    {
        HashMap hashmap = new HashMap();
        a(class1, g1, enumset, ((Map) (hashmap)));
        return hashmap;
    }

    protected static void a(Class class1, g g1, EnumSet enumset, Map map)
    {
        boolean flag = false;
        if (enumset.contains(h.INCLUDE_SUPERCLASSES))
        {
            Class class2 = class1.getSuperclass();
            if (class2 != null)
            {
                a(class2, g1, enumset, map);
            }
        }
        if (enumset.contains(h.INCLUDE_CONSTRUCTORS))
        {
            java.lang.reflect.Constructor aconstructor[] = class1.getDeclaredConstructors();
            for (int i = 0; i < aconstructor.length; i++)
            {
                Object obj = g1.b(aconstructor[i]);
                if (obj != null)
                {
                    map.put(aconstructor[i], obj);
                }
            }

        }
        if (enumset.contains(h.INCLUDE_METHODS))
        {
            java.lang.reflect.Method amethod[] = class1.getDeclaredMethods();
            for (int j = 0; j < amethod.length; j++)
            {
                Object obj1 = g1.b(amethod[j]);
                if (obj1 != null)
                {
                    map.put(amethod[j], obj1);
                }
            }

        }
        if (enumset.contains(h.INCLUDE_FIELDS))
        {
            class1 = class1.getDeclaredFields();
            for (int k = ((flag) ? 1 : 0); k < class1.length; k++)
            {
                enumset = ((EnumSet) (g1.b(class1[k])));
                if (enumset != null)
                {
                    map.put(class1[k], enumset);
                }
            }

        }
    }
}
