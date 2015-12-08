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
//            AsArrayTypeSerializer

public class AsPropertyTypeSerializer extends AsArrayTypeSerializer
{

    protected final String _typePropertyName;

    public AsPropertyTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
    {
        super(typeidresolver, beanproperty);
        _typePropertyName = s;
    }

    public volatile TypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public volatile AsArrayTypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public AsPropertyTypeSerializer forProperty(BeanProperty beanproperty)
    {
        if (_property == beanproperty)
        {
            return this;
        } else
        {
            return new AsPropertyTypeSerializer(_idResolver, beanproperty, _typePropertyName);
        }
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeStringField(_typePropertyName, s);
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeEndObject();
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeStartObject();
        jsongenerator.writeStringField(_typePropertyName, idFromValue(obj));
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeEndObject();
    }
}
