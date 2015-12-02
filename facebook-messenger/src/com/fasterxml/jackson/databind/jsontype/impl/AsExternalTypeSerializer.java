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

public class AsExternalTypeSerializer extends TypeSerializerBase
{

    protected final String _typePropertyName;

    public AsExternalTypeSerializer(TypeIdResolver typeidresolver, BeanProperty beanproperty, String s)
    {
        super(typeidresolver, beanproperty);
        _typePropertyName = s;
    }

    protected final void _writePrefix(Object obj, JsonGenerator jsongenerator)
    {
        jsongenerator.writeStartObject();
    }

    protected final void _writePrefix(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        jsongenerator.writeStartObject();
    }

    protected final void _writeSuffix(Object obj, JsonGenerator jsongenerator, String s)
    {
        jsongenerator.writeEndObject();
        jsongenerator.writeStringField(_typePropertyName, s);
    }

    public volatile TypeSerializer forProperty(BeanProperty beanproperty)
    {
        return forProperty(beanproperty);
    }

    public AsExternalTypeSerializer forProperty(BeanProperty beanproperty)
    {
        if (_property == beanproperty)
        {
            return this;
        } else
        {
            return new AsExternalTypeSerializer(_idResolver, beanproperty, _typePropertyName);
        }
    }

    public String getPropertyName()
    {
        return _typePropertyName;
    }

    public com.fasterxml.jackson.annotation.JsonTypeInfo.As getTypeInclusion()
    {
        return com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY;
    }

    public void writeCustomTypePrefixForArray(Object obj, JsonGenerator jsongenerator, String s)
    {
        _writePrefix(obj, jsongenerator);
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
    {
        _writePrefix(obj, jsongenerator);
    }

    public void writeCustomTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, String s)
    {
        _writePrefix(obj, jsongenerator);
    }

    public void writeCustomTypeSuffixForArray(Object obj, JsonGenerator jsongenerator, String s)
    {
        _writeSuffix(obj, jsongenerator, s);
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
    {
        _writeSuffix(obj, jsongenerator, s);
    }

    public void writeCustomTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator, String s)
    {
        _writeSuffix(obj, jsongenerator, s);
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
    {
        _writePrefix(obj, jsongenerator);
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        _writePrefix(obj, jsongenerator, class1);
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
    {
        _writePrefix(obj, jsongenerator);
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        _writePrefix(obj, jsongenerator, class1);
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        _writePrefix(obj, jsongenerator);
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator, Class class1)
    {
        _writePrefix(obj, jsongenerator, class1);
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
    {
        _writeSuffix(obj, jsongenerator, idFromValue(obj));
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
    {
        _writeSuffix(obj, jsongenerator, idFromValue(obj));
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
    {
        _writeSuffix(obj, jsongenerator, idFromValue(obj));
    }
}
