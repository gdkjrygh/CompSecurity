// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype.impl;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import java.io.IOException;

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

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(s);
        jsongenerator.writeStartObject();
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException
    {
        writeTypeSuffixForObject(obj, jsongenerator);
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValue(obj));
        jsongenerator.writeStartArray();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValue(obj));
        jsongenerator.writeStartObject();
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValue(obj));
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartArray();
        jsongenerator.writeString(idFromValueAndType(obj, class1));
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeEndArray();
        jsongenerator.writeEndArray();
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeEndObject();
        jsongenerator.writeEndArray();
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeEndArray();
    }
}
