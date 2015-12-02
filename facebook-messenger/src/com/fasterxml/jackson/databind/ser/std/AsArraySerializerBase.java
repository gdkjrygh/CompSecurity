// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import com.fasterxml.jackson.databind.jsonschema.SchemaAware;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

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
        _property = asarrayserializerbase._property;
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
        _dynamicSerializers = PropertySerializerMap.emptyMap();
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
    {
        javatype = propertyserializermap.findAndAddSerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
    {
        class1 = propertyserializermap.findAndAddSerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
    {
        TypeSerializer typeserializer;
        JsonSerializer jsonserializer1;
        typeserializer = _valueTypeSerializer;
        if (typeserializer != null)
        {
            typeserializer = typeserializer.forProperty(beanproperty);
        }
        jsonserializer1 = _elementSerializer;
        if (jsonserializer1 != null) goto _L2; else goto _L1
_L1:
        JsonSerializer jsonserializer;
        jsonserializer = jsonserializer1;
        if (_staticTyping)
        {
            jsonserializer = jsonserializer1;
            if (_elementType != null)
            {
                jsonserializer = serializerprovider.findValueSerializer(_elementType, beanproperty);
            }
        }
_L4:
label0:
        {
            if (jsonserializer == _elementSerializer && beanproperty == _property)
            {
                serializerprovider = this;
                if (_valueTypeSerializer == typeserializer)
                {
                    break label0;
                }
            }
            serializerprovider = withResolved(beanproperty, typeserializer, jsonserializer);
        }
        return serializerprovider;
_L2:
        jsonserializer = jsonserializer1;
        if (jsonserializer1 instanceof ContextualSerializer)
        {
            jsonserializer = ((ContextualSerializer)jsonserializer1).createContextual(serializerprovider, beanproperty);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonSerializer getContentSerializer()
    {
        return _elementSerializer;
    }

    public JavaType getContentType()
    {
        return _elementType;
    }

    public JsonNode getSchema(SerializerProvider serializerprovider, Type type)
    {
        ObjectNode objectnode = createSchemaNode("array", true);
        JavaType javatype;
        if (type != null)
        {
            JavaType javatype1 = serializerprovider.constructType(type).getContentType();
            javatype = javatype1;
            if (javatype1 == null)
            {
                javatype = javatype1;
                if (type instanceof ParameterizedType)
                {
                    type = ((ParameterizedType)type).getActualTypeArguments();
                    javatype = javatype1;
                    if (type.length == 1)
                    {
                        javatype = serializerprovider.constructType(type[0]);
                    }
                }
            }
        } else
        {
            javatype = null;
        }
        type = javatype;
        if (javatype == null)
        {
            type = javatype;
            if (_elementType != null)
            {
                type = _elementType;
            }
        }
        if (type == null) goto _L2; else goto _L1
_L1:
        if (type.getRawClass() == java/lang/Object) goto _L4; else goto _L3
_L3:
        type = serializerprovider.findValueSerializer(type, _property);
        if (!(type instanceof SchemaAware)) goto _L4; else goto _L5
_L5:
        serializerprovider = ((SchemaAware)type).getSchema(serializerprovider, null);
_L7:
        type = serializerprovider;
        if (serializerprovider == null)
        {
            type = JsonSchema.getDefaultSchemaNode();
        }
        objectnode.put("items", type);
_L2:
        return objectnode;
_L4:
        serializerprovider = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
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

    protected abstract void serializeContents(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider);

    public final void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        typeserializer.writeTypePrefixForArray(obj, jsongenerator);
        serializeContents(obj, jsongenerator, serializerprovider);
        typeserializer.writeTypeSuffixForArray(obj, jsongenerator);
    }

    public abstract AsArraySerializerBase withResolved(BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer);
}
