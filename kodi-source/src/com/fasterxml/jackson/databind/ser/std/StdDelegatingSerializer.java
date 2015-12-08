// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.ResolvableSerializer;
import com.fasterxml.jackson.databind.util.Converter;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdSerializer

public class StdDelegatingSerializer extends StdSerializer
    implements ContextualSerializer, ResolvableSerializer
{

    protected final Converter _converter;
    protected final JsonSerializer _delegateSerializer;
    protected final JavaType _delegateType;

    public StdDelegatingSerializer(Converter converter, JavaType javatype, JsonSerializer jsonserializer)
    {
        super(javatype);
        _converter = converter;
        _delegateType = javatype;
        _delegateSerializer = jsonserializer;
    }

    protected Object convertValue(Object obj)
    {
        return _converter.convert(obj);
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer = _delegateSerializer;
        Object obj2 = _delegateType;
        Object obj = jsonserializer;
        Object obj1 = obj2;
        if (jsonserializer == null)
        {
            obj = obj2;
            if (obj2 == null)
            {
                obj = _converter.getOutputType(serializerprovider.getTypeFactory());
            }
            obj2 = serializerprovider.findValueSerializer(((JavaType) (obj)));
            obj1 = obj;
            obj = obj2;
        }
        obj2 = obj;
        if (obj instanceof ContextualSerializer)
        {
            obj2 = serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj)), beanproperty);
        }
        if (obj2 == _delegateSerializer)
        {
            return this;
        } else
        {
            return withDelegate(_converter, ((JavaType) (obj1)), ((JsonSerializer) (obj2)));
        }
    }

    public boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        obj = convertValue(obj);
        return _delegateSerializer.isEmpty(serializerprovider, obj);
    }

    public boolean isEmpty(Object obj)
    {
        obj = convertValue(obj);
        return _delegateSerializer.isEmpty(obj);
    }

    public void resolve(SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        if (_delegateSerializer != null && (_delegateSerializer instanceof ResolvableSerializer))
        {
            ((ResolvableSerializer)_delegateSerializer).resolve(serializerprovider);
        }
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        obj = convertValue(obj);
        if (obj == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            return;
        } else
        {
            _delegateSerializer.serialize(obj, jsongenerator, serializerprovider);
            return;
        }
    }

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        obj = convertValue(obj);
        _delegateSerializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
    }

    protected StdDelegatingSerializer withDelegate(Converter converter, JavaType javatype, JsonSerializer jsonserializer)
    {
        if (getClass() != com/fasterxml/jackson/databind/ser/std/StdDelegatingSerializer)
        {
            throw new IllegalStateException((new StringBuilder()).append("Sub-class ").append(getClass().getName()).append(" must override 'withDelegate'").toString());
        } else
        {
            return new StdDelegatingSerializer(converter, javatype, jsonserializer);
        }
    }
}
