// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.impl;

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
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.ser.impl:
//            PropertySerializerMap

public class MapEntrySerializer extends ContainerSerializer
    implements ContextualSerializer
{

    protected PropertySerializerMap _dynamicValueSerializers;
    protected final JavaType _entryType;
    protected JsonSerializer _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected JsonSerializer _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    public MapEntrySerializer(JavaType javatype, JavaType javatype1, JavaType javatype2, boolean flag, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        super(javatype);
        _entryType = javatype;
        _keyType = javatype1;
        _valueType = javatype2;
        _valueTypeIsStatic = flag;
        _valueTypeSerializer = typeserializer;
        _property = beanproperty;
        _dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
    }

    protected MapEntrySerializer(MapEntrySerializer mapentryserializer, BeanProperty beanproperty, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
    {
        super(java/util/Map, false);
        _entryType = mapentryserializer._entryType;
        _keyType = mapentryserializer._keyType;
        _valueType = mapentryserializer._valueType;
        _valueTypeIsStatic = mapentryserializer._valueTypeIsStatic;
        _valueTypeSerializer = mapentryserializer._valueTypeSerializer;
        _keySerializer = jsonserializer;
        _valueSerializer = jsonserializer1;
        _dynamicValueSerializers = mapentryserializer._dynamicValueSerializers;
        _property = mapentryserializer._property;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        javatype = propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicValueSerializers = ((PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        class1 = propertyserializermap.findAndAddSecondarySerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicValueSerializers = ((PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    public ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new MapEntrySerializer(this, _property, typeserializer, _keySerializer, _valueSerializer);
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj3 = null;
        Object obj4 = null;
        Object obj1 = null;
        AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
        Object obj;
        JsonSerializer jsonserializer;
        Object obj2;
        if (beanproperty == null)
        {
            obj2 = null;
        } else
        {
            obj2 = beanproperty.getMember();
        }
        obj = obj4;
        jsonserializer = obj3;
        if (obj2 != null)
        {
            obj = obj4;
            jsonserializer = obj3;
            if (annotationintrospector != null)
            {
                obj = annotationintrospector.findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
                if (obj != null)
                {
                    obj1 = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj);
                }
                Object obj5 = annotationintrospector.findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
                obj = obj1;
                jsonserializer = obj3;
                if (obj5 != null)
                {
                    jsonserializer = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj5);
                    obj = obj1;
                }
            }
        }
        obj1 = jsonserializer;
        if (jsonserializer == null)
        {
            obj1 = _valueSerializer;
        }
        jsonserializer = findConvertingContentSerializer(serializerprovider, beanproperty, ((JsonSerializer) (obj1)));
        if (jsonserializer == null)
        {
            if (_valueTypeIsStatic && _valueType.getRawClass() != java/lang/Object || hasContentTypeAnnotation(serializerprovider, beanproperty))
            {
                jsonserializer = serializerprovider.findValueSerializer(_valueType, beanproperty);
            }
        } else
        {
            jsonserializer = serializerprovider.handleSecondaryContextualization(jsonserializer, beanproperty);
        }
        obj1 = obj;
        if (obj == null)
        {
            obj1 = _keySerializer;
        }
        if (obj1 == null)
        {
            serializerprovider = serializerprovider.findKeySerializer(_keyType, beanproperty);
        } else
        {
            serializerprovider = serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj1)), beanproperty);
        }
        return withResolved(beanproperty, serializerprovider, jsonserializer);
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((java.util.Map.Entry)obj);
    }

    public boolean hasSingleElement(java.util.Map.Entry entry)
    {
        return true;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (java.util.Map.Entry)obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, java.util.Map.Entry entry)
    {
        return entry == null;
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((java.util.Map.Entry)obj, jsongenerator, serializerprovider);
    }

    public void serialize(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        jsongenerator.writeStartObject();
        jsongenerator.setCurrentValue(entry);
        if (_valueSerializer != null)
        {
            serializeUsing(entry, jsongenerator, serializerprovider, _valueSerializer);
        } else
        {
            serializeDynamic(entry, jsongenerator, serializerprovider);
        }
        jsongenerator.writeEndObject();
    }

    protected void serializeDynamic(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        JsonSerializer jsonserializer;
        Object obj;
        TypeSerializer typeserializer;
        Object obj1;
        PropertySerializerMap propertyserializermap1;
        boolean flag;
        jsonserializer = _keySerializer;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        typeserializer = _valueTypeSerializer;
        propertyserializermap1 = _dynamicValueSerializers;
        obj1 = entry.getValue();
        obj = entry.getKey();
        if (obj != null) goto _L2; else goto _L1
_L1:
        serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
_L6:
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        serializerprovider.defaultSerializeNull(jsongenerator);
_L4:
        return;
_L2:
        if (flag && obj1 == null) goto _L4; else goto _L3
_L3:
        jsonserializer.serialize(obj, jsongenerator, serializerprovider);
        if (true) goto _L6; else goto _L5
_L5:
        Class class1 = obj1.getClass();
        JsonSerializer jsonserializer1 = propertyserializermap1.serializerFor(class1);
        jsonserializer = jsonserializer1;
        if (jsonserializer1 == null)
        {
            PropertySerializerMap propertyserializermap;
            if (_valueType.hasGenericTypes())
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap1, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
            } else
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap1, class1, serializerprovider);
            }
            propertyserializermap = _dynamicValueSerializers;
        }
        if (typeserializer == null)
        {
            try
            {
                jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, entry, (new StringBuilder()).append("").append(obj).toString());
            }
            return;
        }
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        return;
    }

    protected void serializeUsing(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        Object obj;
        JsonSerializer jsonserializer1;
        TypeSerializer typeserializer;
        Object obj1;
        boolean flag;
        jsonserializer1 = _keySerializer;
        typeserializer = _valueTypeSerializer;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj1 = entry.getValue();
        obj = entry.getKey();
        if (obj != null) goto _L2; else goto _L1
_L1:
        serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
_L6:
        if (obj1 != null)
        {
            break; /* Loop/switch isn't completed */
        }
        serializerprovider.defaultSerializeNull(jsongenerator);
_L4:
        return;
_L2:
        if (flag && obj1 == null) goto _L4; else goto _L3
_L3:
        jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
        if (true) goto _L6; else goto _L5
_L5:
        if (typeserializer == null)
        {
            try
            {
                jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JsonGenerator jsongenerator)
            {
                wrapAndThrow(serializerprovider, jsongenerator, entry, (new StringBuilder()).append("").append(obj).toString());
            }
            return;
        }
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        return;
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        serializeWithType((java.util.Map.Entry)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(java.util.Map.Entry entry, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        typeserializer.writeTypePrefixForObject(entry, jsongenerator);
        jsongenerator.setCurrentValue(entry);
        if (_valueSerializer != null)
        {
            serializeUsing(entry, jsongenerator, serializerprovider, _valueSerializer);
        } else
        {
            serializeDynamic(entry, jsongenerator, serializerprovider);
        }
        typeserializer.writeTypeSuffixForObject(entry, jsongenerator);
    }

    public MapEntrySerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
    {
        return new MapEntrySerializer(this, beanproperty, _valueTypeSerializer, jsonserializer, jsonserializer1);
    }
}
