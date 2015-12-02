// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public abstract class SimpleBeanPropertyFilter
    implements BeanPropertyFilter
{

    protected SimpleBeanPropertyFilter()
    {
    }

    public static SimpleBeanPropertyFilter filterOutAllExcept(Set set)
    {
        return new FilterExceptFilter(set);
    }

    public static transient SimpleBeanPropertyFilter filterOutAllExcept(String as[])
    {
        HashSet hashset = new HashSet(as.length);
        Collections.addAll(hashset, as);
        return new FilterExceptFilter(hashset);
    }

    public static SimpleBeanPropertyFilter serializeAllExcept(Set set)
    {
        return new SerializeExceptFilter(set);
    }

    public static transient SimpleBeanPropertyFilter serializeAllExcept(String as[])
    {
        HashSet hashset = new HashSet(as.length);
        Collections.addAll(hashset, as);
        return new SerializeExceptFilter(hashset);
    }

    private class FilterExceptFilter extends SimpleBeanPropertyFilter
    {

        protected final Set _propertiesToInclude;

        public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
        {
            if (_propertiesToInclude.contains(beanpropertywriter.getName()))
            {
                beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
            }
        }

        public FilterExceptFilter(Set set)
        {
            _propertiesToInclude = set;
        }
    }


    private class SerializeExceptFilter extends SimpleBeanPropertyFilter
    {

        protected final Set _propertiesToExclude;

        public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
        {
            if (!_propertiesToExclude.contains(beanpropertywriter.getName()))
            {
                beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
            }
        }

        public SerializeExceptFilter(Set set)
        {
            _propertiesToExclude = set;
        }
    }

}
