// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.jsontype;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.BeanProperty;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.jsontype:
//            TypeSerializer

public class TypeSerializerWrapper extends TypeSerializer
{

    protected final TypeSerializer _delegate;
    protected final Object _value;

    public TypeSerializerWrapper(TypeSerializer typeserializer, Object obj)
    {
        _delegate = typeserializer;
        _value = obj;
    }

    public TypeSerializer forProperty(BeanProperty beanproperty)
    {
        beanproperty = _delegate.forProperty(beanproperty);
        if (beanproperty == _delegate)
        {
            return this;
        } else
        {
            return new TypeSerializerWrapper(beanproperty, _value);
        }
    }

    public void writeCustomTypePrefixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException
    {
        _delegate.writeCustomTypePrefixForObject(_value, jsongenerator, s);
    }

    public void writeCustomTypeSuffixForObject(Object obj, JsonGenerator jsongenerator, String s)
        throws IOException, JsonProcessingException
    {
        _delegate.writeCustomTypeSuffixForObject(_value, jsongenerator, s);
    }

    public void writeTypePrefixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        _delegate.writeTypePrefixForArray(_value, jsongenerator);
    }

    public void writeTypePrefixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        _delegate.writeTypePrefixForObject(_value, jsongenerator);
    }

    public void writeTypePrefixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        _delegate.writeTypePrefixForScalar(_value, jsongenerator);
    }

    public void writeTypeSuffixForArray(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        _delegate.writeTypeSuffixForArray(_value, jsongenerator);
    }

    public void writeTypeSuffixForObject(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        _delegate.writeTypeSuffixForObject(_value, jsongenerator);
    }

    public void writeTypeSuffixForScalar(Object obj, JsonGenerator jsongenerator)
        throws IOException, JsonProcessingException
    {
        _delegate.writeTypeSuffixForScalar(_value, jsongenerator);
    }
}
