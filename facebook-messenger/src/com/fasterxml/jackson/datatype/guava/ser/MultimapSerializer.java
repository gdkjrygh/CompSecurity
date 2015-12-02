// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.datatype.guava.ser;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.google.common.a.hq;
import com.google.common.a.iw;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MultimapSerializer extends JsonSerializer
    implements ContextualSerializer
{

    private final JsonSerializer keySerializer;
    private final BeanProperty property;
    private final MapLikeType type;
    private final JsonSerializer valueSerializer;
    private final TypeSerializer valueTypeSerializer;

    public MultimapSerializer(SerializationConfig serializationconfig, MapLikeType mapliketype, BeanDescription beandescription, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        type = mapliketype;
        property = null;
        keySerializer = jsonserializer;
        valueTypeSerializer = typeserializer;
        valueSerializer = jsonserializer1;
    }

    protected MultimapSerializer(MultimapSerializer multimapserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        type = multimapserializer.type;
        property = beanproperty;
        keySerializer = jsonserializer;
        valueTypeSerializer = typeserializer;
        valueSerializer = jsonserializer1;
    }

    private final void serializeFields(iw iw1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        for (iw1 = iw1.b().entrySet().iterator(); iw1.hasNext();)
        {
            Object obj = (java.util.Map.Entry)iw1.next();
            if (keySerializer != null)
            {
                keySerializer.serialize(((java.util.Map.Entry) (obj)).getKey(), jsongenerator, serializerprovider);
            } else
            {
                serializerprovider.findKeySerializer(serializerprovider.constructType(java/lang/String), property).serialize(((java.util.Map.Entry) (obj)).getKey(), jsongenerator, serializerprovider);
            }
            if (valueSerializer != null)
            {
                jsongenerator.writeStartArray();
                Object obj1;
                for (obj = ((Collection)((java.util.Map.Entry) (obj)).getValue()).iterator(); ((Iterator) (obj)).hasNext(); valueSerializer.serialize(obj1, jsongenerator, serializerprovider))
                {
                    obj1 = ((Iterator) (obj)).next();
                }

                jsongenerator.writeEndArray();
            } else
            {
                serializerprovider.defaultSerializeValue(hq.a((Iterable)((java.util.Map.Entry) (obj)).getValue()), jsongenerator);
            }
        }

    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        JsonSerializer jsonserializer = valueSerializer;
        Object obj;
        Object obj1;
        if (jsonserializer == null)
        {
            JavaType javatype = type.getContentType();
            if (javatype.isFinal())
            {
                jsonserializer = serializerprovider.findValueSerializer(javatype, beanproperty);
            }
        } else
        if (jsonserializer instanceof ContextualSerializer)
        {
            jsonserializer = ((ContextualSerializer)jsonserializer).createContextual(serializerprovider, beanproperty);
        }
        obj1 = keySerializer;
        if (obj1 == null)
        {
            obj = serializerprovider.findKeySerializer(type.getKeyType(), beanproperty);
        } else
        {
            obj = obj1;
            if (obj1 instanceof ContextualSerializer)
            {
                obj = ((ContextualSerializer)obj1).createContextual(serializerprovider, beanproperty);
            }
        }
        obj1 = valueTypeSerializer;
        serializerprovider = ((SerializerProvider) (obj1));
        if (obj1 != null)
        {
            serializerprovider = ((TypeSerializer) (obj1)).forProperty(beanproperty);
        }
        return withResolved(beanproperty, ((JsonSerializer) (obj)), serializerprovider, jsonserializer);
    }

    public void serialize(iw iw1, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeStartObject();
        if (!iw1.e())
        {
            serializeFields(iw1, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        serialize((iw)obj, jsongenerator, serializerprovider);
    }

    public void serializeWithType(iw iw1, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForObject(iw1, jsongenerator);
        serializeFields(iw1, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForObject(iw1, jsongenerator);
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((iw)obj, jsongenerator, serializerprovider, typeserializer);
    }

    protected MultimapSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        return new MultimapSerializer(this, beanproperty, jsonserializer, typeserializer, jsonserializer1);
    }
}
