// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

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

    protected PropertySerializerMap _dynamicSerializers;
    protected final JsonSerializer _elementSerializer;
    protected final JavaType _elementType;
    protected final BeanProperty _property;
    protected final boolean _staticTyping;
    protected final TypeSerializer _valueTypeSerializer;

    protected AsArraySerializerBase(AsArraySerializerBase asarrayserializerbase, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        super(asarrayserializerbase);
        _elementType = asarrayserializerbase._elementType;
        _staticTyping = asarrayserializerbase._staticTyping;
        _valueTypeSerializer = typeserializer;
        _property = beanproperty;
        _elementSerializer = jsonserializer;
        _dynamicSerializers = asarrayserializerbase._dynamicSerializers;
    }

    protected AsArraySerializerBase(Class class1, JavaType javatype, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty, JsonSerializer jsonserializer)
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
        _dynamicSerializers = PropertySerializerMap.emptyForProperties();
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        javatype = propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        class1 = propertyserializermap.findAndAddSecondarySerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        TypeSerializer typeserializer;
        JsonSerializer jsonserializer1;
        Object obj = _valueTypeSerializer;
        typeserializer = ((TypeSerializer) (obj));
        if (obj != null)
        {
            typeserializer = ((TypeSerializer) (obj)).forProperty(beanproperty);
        }
        jsonserializer1 = null;
        obj = jsonserializer1;
        if (beanproperty != null)
        {
            com.fasterxml.jackson.databind.introspect.AnnotatedMember annotatedmember = beanproperty.getMember();
            obj = jsonserializer1;
            if (annotatedmember != null)
            {
                Object obj1 = serializerprovider.getAnnotationIntrospector().findContentSerializer(annotatedmember);
                obj = jsonserializer1;
                if (obj1 != null)
                {
                    obj = serializerprovider.serializerInstance(annotatedmember, obj1);
                }
            }
        }
        jsonserializer1 = ((JsonSerializer) (obj));
        if (obj == null)
        {
            jsonserializer1 = _elementSerializer;
        }
        jsonserializer1 = findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer1);
        if (jsonserializer1 != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer;
label0:
        {
            jsonserializer = jsonserializer1;
            if (_elementType == null)
            {
                break label0;
            }
            if (!_staticTyping || _elementType.getRawClass() == java/lang/Object)
            {
                jsonserializer = jsonserializer1;
                if (!hasContentTypeAnnotation(serializerprovider, beanproperty))
                {
                    break label0;
                }
            }
            jsonserializer = serializerprovider.findValueSerializer(_elementType, beanproperty);
        }
_L4:
label1:
        {
            if (jsonserializer == _elementSerializer && beanproperty == _property)
            {
                serializerprovider = this;
                if (_valueTypeSerializer == typeserializer)
                {
                    break label1;
                }
            }
            serializerprovider = withResolved(beanproperty, typeserializer, jsonserializer);
        }
        return serializerprovider;
_L2:
        jsonserializer = serializerprovider.handleSecondaryContextualization(jsonserializer1, beanproperty);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (serializerprovider.isEnabled(SerializationFeature.WRITE_SINGLE_ELEM_ARRAYS_UNWRAPPED) && hasSingleElement(obj))
        {
            serializeContents(obj, jsongenerator, serializerprovider);
            return;
        } else
        {
            jsongenerator.writeStartArray();
            jsongenerator.setCurrentValue(obj);
            serializeContents(obj, jsongenerator, serializerprovider);
            jsongenerator.writeEndArray();
            return;
        }
    }

    protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException;

    public void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        typeserializer.writeTypePrefixForArray(obj, jsongenerator);
        jsongenerator.setCurrentValue(obj);
        serializeContents(obj, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
    }

    public abstract AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer);
}
