// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype.impl:
//            TypeSerializerBase

public class AsWrapperTypeSerializer extends TypeSerializerBase
{

    public AsWrapperTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty)
    {
        super(typeidresolver, beanproperty);
    }

    public volatile TypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public AsWrapperTypeSerializer forProperty(BeanProperty beanproperty)
    {
        if (_property == beanproperty)
        {
            return this;
        } else
        {
            return new AsWrapperTypeSerializer(_idResolver, beanproperty);
        }
    }

    public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
    {
        return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_OBJECT;
    }

    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeArrayFieldStart(s);
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeObjectFieldStart(s);
    }

    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeFieldName(s);
    }

    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s)
    {
        writeTypeSuffixForArray(obj, jsongenerator);
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
    {
        writeTypeSuffixForObject(obj, jsongenerator);
    }

    public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator, String s)
    {
        writeTypeSuffixForScalar(obj, jsongenerator);
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeArrayFieldStart(idFromValue(obj));
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeArrayFieldStart(idFromValueAndType(obj, class1));
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeObjectFieldStart(idFromValue(obj));
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeObjectFieldStart(idFromValueAndType(obj, class1));
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeFieldName(idFromValue(obj));
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeFieldName(idFromValueAndType(obj, class1));
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndArray();
        jsongenerator.writeEndObject();
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndObject();
        jsongenerator.writeEndObject();
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndObject();
    }
}
