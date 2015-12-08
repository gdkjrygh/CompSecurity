// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.util.ArrayList;

// Referenced classes of package com.google.api.client.util:
//            ArrayValueMap, Preconditions, Types

static class componentType
{

    final Class componentType;
    final ArrayList values = new ArrayList();

    void addValue(Class class1, Object obj)
    {
        boolean flag;
        if (class1 == componentType)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        values.add(obj);
    }

    Object toArray()
    {
        return Types.toArray(values, componentType);
    }

    _cls9(Class class1)
    {
        componentType = class1;
    }
}
