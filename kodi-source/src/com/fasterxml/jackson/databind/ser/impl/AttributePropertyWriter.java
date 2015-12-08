// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.ser.VirtualBeanPropertyWriter;
import com.fasterxml.jackson.databind.util.Annotations;

public class AttributePropertyWriter extends VirtualBeanPropertyWriter
{

    protected final String _attrName;

    protected AttributePropertyWriter(String s, BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype)
    {
        this(s, beanpropertydefinition, annotations, javatype, beanpropertydefinition.findInclusion());
    }

    protected AttributePropertyWriter(String s, BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        super(beanpropertydefinition, annotations, javatype, null, null, null, include);
        _attrName = s;
    }

    public static AttributePropertyWriter construct(String s, BeanPropertyDefinition beanpropertydefinition, Annotations annotations, JavaType javatype)
    {
        return new AttributePropertyWriter(s, beanpropertydefinition, annotations, javatype);
    }

    protected Object value(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws Exception
    {
        return serializerprovider.getAttribute(_attrName);
    }

    public VirtualBeanPropertyWriter withConfig(MapperConfig mapperconfig, AnnotatedClass annotatedclass, BeanPropertyDefinition beanpropertydefinition, JavaType javatype)
    {
        throw new IllegalStateException("Should not be called on this type");
    }
}
