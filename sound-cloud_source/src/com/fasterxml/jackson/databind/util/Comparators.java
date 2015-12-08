// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

public class Comparators
{

    public static Object getArrayComparator(final Object defaultValue)
    {
        return new _cls1();
    }

    private class _cls1
    {

        final Object val$defaultValue;
        final int val$length;

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            if (obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (obj == null) goto _L4; else goto _L3
_L3:
            flag = flag1;
            if (obj.getClass() != defaultValue.getClass()) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (Array.getLength(obj) != length) goto _L4; else goto _L6
_L6:
            int i = 0;
_L10:
            if (i >= length) goto _L8; else goto _L7
_L7:
            Object obj1;
            Object obj2;
            obj1 = Array.get(defaultValue, i);
            obj2 = Array.get(obj, i);
            if (obj1 == obj2 || obj1 == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (!obj1.equals(obj2)) goto _L4; else goto _L9
_L9:
            i++;
              goto _L10
_L8:
            return true;
        }

        _cls1()
        {
            defaultValue = obj;
            length = i;
            super();
        }
    }

}
