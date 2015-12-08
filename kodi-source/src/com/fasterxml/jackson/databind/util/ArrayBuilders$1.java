// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

// Referenced classes of package com.fasterxml.jackson.databind.util:
//            ArrayBuilders

static final class val.defaultValue
{

    final Object val$defaultValue;
    final Class val$defaultValueType;
    final int val$length;

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null || obj.getClass() != val$defaultValueType)
            {
                return false;
            }
            if (Array.getLength(obj) != val$length)
            {
                return false;
            }
            int i = 0;
            while (i < val$length) 
            {
                Object obj1 = Array.get(val$defaultValue, i);
                Object obj2 = Array.get(obj, i);
                if (obj1 == obj2 || obj1 == null || obj1.equals(obj2))
                {
                    i++;
                } else
                {
                    return false;
                }
            }
        }
        return true;
    }

    _cls9(Class class1, int i, Object obj)
    {
        val$defaultValueType = class1;
        val$length = i;
        val$defaultValue = obj;
        super();
    }
}
