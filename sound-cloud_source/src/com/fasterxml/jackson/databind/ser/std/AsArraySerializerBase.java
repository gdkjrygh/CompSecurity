// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.io.IOException;

public abstract class AsArraySerializerBase extends ContainerSerializer
    implements ContextualSerializer
{

    public PropertySerializerMap _dynamicSerializers;
    public final JsonSerializer _elementSerializer;
    public final JavaType _elementType;
    public final BeanProperty _property;
    public final boolean _staticTyping;
    public final TypeSerializer _valueTypeSerializer;

    public AsArraySerializerBase(AsArraySerializerBase asarrayserializerbase, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super(asarrayserializerbase);
        _elementType = asarrayserializerbase._elementType;
        _staticTyping = asarrayserializerbase._staticTyping;
        _valueTypeSerializer = typeserializer;
        _property = asarrayserializerbase._property;
        _elementSerializer = jsonserializer;
        _dynamicSerializers = asarrayserializerbase._dynamicSerializers;
    }

    public AsArraySerializerBase(Class class1, JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
    {
label0:
        {
            boolean flag1 = false;
            super(class1, false);
            _elementType = javatype;
            if (!flag)
            {
                flag = flag1;
                if (javatype == null)
                {
                    break label0;
                }
                flag = flag1;
                if (!javatype.isFinal())
                {
                    break label0;
                }
            }
            flag = true;
        }
        _staticTyping = flag;
        _valueTypeSerializer = typeserializer;
        _property = beanproperty;
        _elementSerializer = jsonserializer;
        _dynamicSerializers = PropertySerializerMap.emptyMap();
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        javatype = propertyserializermap.findAndAddSerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    public final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        class1 = propertyserializermap.findAndAddSerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        JsonSerializer jsonserializer2;
        TypeSerializer typeserializer;
        typeserializer = _valueTypeSerializer;
        if (typeserializer != null)
        {
            typeserializer = typeserializer.forProperty(beanproperty);
        }
        jsonserializer2 = null;
        JsonSerializer jsonserializer = jsonserializer2;
        if (beanproperty != null)
        {
            com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
            jsonserializer = jsonserializer2;
            if (annotatedmember != null)
            {
                Object obj = serializerprovider.getAnnotationIntrospector().findContentSerializer(annotatedmember);
                jsonserializer = jsonserializer2;
                if (obj != null)
                {
                    jsonserializer = serializerprovider.serializerInstance(annotatedmember, obj);
                }
            }
        }
        jsonserializer2 = jsonserializer;
        if (jsonserializer == null)
        {
            jsonserializer2 = _elementSerializer;
        }
        if (jsonserializer2 != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer1;
label0:
        {
            jsonserializer1 = jsonserializer2;
            if (_elementType == null)
            {
                break label0;
            }
            if (!_staticTyping)
            {
                jsonserializer1 = jsonserializer2;
                if (!hasContentTypeAnnotation(serializerprovider, beanproperty))
                {
                    break label0;
                }
            }
            jsonserializer1 = serializerprovider.findValueSerializer(_elementType, beanproperty);
        }
_L4:
label1:
        {
            if (jsonserializer1 == _elementSerializer && beanproperty == _property)
            {
                serializerprovider = this;
                if (_valueTypeSerializer == typeserializer)
                {
                    break label1;
                }
            }
            serializerprovider = withResolved(beanproperty, typeserializer, jsonserializer1);
        }
        return serializerprovider;
_L2:
        jsonserializer1 = jsonserializer2;
        if (jsonserializer2 instanceof ContextualSerializer)
        {
            jsonserializer1 = ((ContextualSerializer)jsonserializer2).createContextual(serializerprovider, beanproperty);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(obj))
        {
            serializeContents(obj, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray();
            serializeContents(obj, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    public abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException;

    public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForArray(obj, jsongenerator);
        serializeContents(obj, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
    }

    public abstract AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer);
}
