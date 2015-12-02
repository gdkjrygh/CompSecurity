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

public class AsArrayTypeSerializer extends TypeSerializerBase
{

    public AsArrayTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty)
    {
        super(typeidresolver, beanproperty);
    }

    public volatile TypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public AsArrayTypeSerializer forProperty(BeanProperty beanproperty)
    {
        if (_property == beanproperty)
        {
            return this;
        } else
        {
            return new AsArrayTypeSerializer(_idResolver, beanproperty);
        }
    }

    public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
    {
        return com.fasterxml.jackson.annotation.JsonTypeInfo.As.WRAPPER_ARRAY;
    }

    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(s);
        jsongenerator.writeStartArray();
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(s);
        jsongenerator.writeStartObject();
    }

    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(s);
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
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValue(obj));
        jsongenerator.writeStartArray();
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValueAndType(obj, class1));
        jsongenerator.writeStartArray();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValue(obj));
        jsongenerator.writeStartObject();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValueAndType(obj, class1));
        jsongenerator.writeStartObject();
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValue(obj));
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValueAndType(obj, class1));
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndArray();
        jsongenerator.writeEndArray();
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndObject();
        jsongenerator.writeEndArray();
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeEndArray();
    }
}
