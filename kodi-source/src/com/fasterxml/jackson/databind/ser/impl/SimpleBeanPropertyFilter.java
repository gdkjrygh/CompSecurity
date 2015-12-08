// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.BeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.PropertyWriter;

public class SimpleBeanPropertyFilter
    implements BeanPropertyFilter, PropertyFilter
{

    public static PropertyFilter from(BeanPropertyFilter beanpropertyfilter)
    {
        return new PropertyFilter(beanpropertyfilter) {

            final BeanPropertyFilter val$src;

            public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyWriter propertywriter)
                throws Exception
            {
                src.serializeAsField(obj, jsongenerator, serializerprovider, (BeanPropertyWriter)propertywriter);
            }

            
            {
                src = beanpropertyfilter;
                super();
            }
        };
    }

    protected boolean include(BeanPropertyWriter beanpropertywriter)
    {
        return true;
    }

    protected boolean include(PropertyWriter propertywriter)
    {
        return true;
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, BeanPropertyWriter beanpropertywriter)
        throws Exception
    {
        if (include(beanpropertywriter))
        {
            beanpropertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
        } else
        if (!jsongenerator.canOmitFields())
        {
            beanpropertywriter.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
            return;
        }
    }

    public void serializeAsField(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyWriter propertywriter)
        throws Exception
    {
        if (include(propertywriter))
        {
            propertywriter.serializeAsField(obj, jsongenerator, serializerprovider);
        } else
        if (!jsongenerator.canOmitFields())
        {
            propertywriter.serializeAsOmittedField(obj, jsongenerator, serializerprovider);
            return;
        }
    }
}
