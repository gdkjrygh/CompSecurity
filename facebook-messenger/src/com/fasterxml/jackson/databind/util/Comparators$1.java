// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.util;

import java.lang.reflect.Array;

final class val.length
{

    final Object val$defaultValue;
    final int val$length;

    public boolean equals(Object obj)
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
        if (obj.getClass() != val$defaultValue.getClass()) goto _L4; else goto _L5
_L5:
        flag = flag1;
        if (Array.getLength(obj) != val$length) goto _L4; else goto _L6
_L6:
        int i = 0;
_L9:
        Object obj1;
        Object obj2;
        if (i >= val$length)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = Array.get(val$defaultValue, i);
        obj2 = Array.get(obj, i);
          goto _L7
_L11:
        i++;
        if (true) goto _L9; else goto _L8
_L7:
        if (obj1 == obj2 || obj1 == null || obj1.equals(obj2)) goto _L11; else goto _L10
_L10:
        return false;
_L8:
        return true;
    }

    ()
    {
        val$defaultValue = obj;
        val$length = i;
        super();
    }
}
