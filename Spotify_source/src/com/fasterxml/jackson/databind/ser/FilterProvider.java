// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanPropertyFilter, PropertyFilter

public abstract class FilterProvider
{

    public abstract BeanPropertyFilter findFilter(Object obj);

    public PropertyFilter findPropertyFilter(Object obj, Object obj1)
    {
        obj = findFilter(obj);
        if (obj == null)
        {
            return null;
        } else
        {
            return SimpleBeanPropertyFilter.from(((BeanPropertyFilter) (obj)));
        }
    }
}
