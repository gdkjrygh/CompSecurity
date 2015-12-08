// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
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
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class MapSerializer extends ContainerSerializer
    implements ContextualSerializer
{

    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final HashSet _ignoredEntries;
    protected JsonSerializer _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected JsonSerializer _valueSerializer;
    protected final JavaType _valueType;
    protected final boolean _valueTypeIsStatic;
    protected final TypeSerializer _valueTypeSerializer;

    protected MapSerializer(MapSerializer mapserializer, BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, HashSet hashset)
    {
        super(java/util/Map, false);
        _ignoredEntries = hashset;
        _keyType = mapserializer._keyType;
        _valueType = mapserializer._valueType;
        _valueTypeIsStatic = mapserializer._valueTypeIsStatic;
        _valueTypeSerializer = mapserializer._valueTypeSerializer;
        _keySerializer = jsonserializer;
        _valueSerializer = jsonserializer1;
        _dynamicValueSerializers = mapserializer._dynamicValueSerializers;
        _property = beanproperty;
    }

    protected MapSerializer(MapSerializer mapserializer, TypeSerializer typeserializer)
    {
        super(java/util/Map, false);
        _ignoredEntries = mapserializer._ignoredEntries;
        _keyType = mapserializer._keyType;
        _valueType = mapserializer._valueType;
        _valueTypeIsStatic = mapserializer._valueTypeIsStatic;
        _valueTypeSerializer = typeserializer;
        _keySerializer = mapserializer._keySerializer;
        _valueSerializer = mapserializer._valueSerializer;
        _dynamicValueSerializers = mapserializer._dynamicValueSerializers;
        _property = mapserializer._property;
    }

    protected MapSerializer(HashSet hashset, JavaType javatype, JavaType javatype1, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
    {
        super(java/util/Map, false);
        _ignoredEntries = hashset;
        _keyType = javatype;
        _valueType = javatype1;
        _valueTypeIsStatic = flag;
        _valueTypeSerializer = typeserializer;
        _keySerializer = jsonserializer;
        _valueSerializer = jsonserializer1;
        _dynamicValueSerializers = PropertySerializerMap.emptyMap();
        _property = null;
    }

    public static MapSerializer construct(String as[], JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1)
    {
        HashSet hashset = toSet(as);
        if (javatype == null)
        {
            as = UNSPECIFIED_TYPE;
            javatype = as;
        } else
        {
            as = javatype.getKeyType();
            javatype = javatype.getContentType();
        }
        if (!flag)
        {
            if (javatype != null && javatype.isFinal())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        return new MapSerializer(hashset, as, javatype, flag, typeserializer, jsonserializer, jsonserializer1);
    }

    private static HashSet toSet(String as[])
    {
        if (as != null && as.length != 0) goto _L2; else goto _L1
_L1:
        HashSet hashset = null;
_L4:
        return hashset;
_L2:
        HashSet hashset1 = new HashSet(as.length);
        int j = as.length;
        int i = 0;
        do
        {
            hashset = hashset1;
            if (i >= j)
            {
                continue;
            }
            hashset1.add(as[i]);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        javatype = propertyserializermap.findAndAddSerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        class1 = propertyserializermap.findAndAddSerializer(class1, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map)
        {
            _dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (class1)).serializer;
    }

    protected Map _orderEntries(Map map)
    {
        if (map instanceof SortedMap)
        {
            return map;
        } else
        {
            return new TreeMap(map);
        }
    }

    public volatile ContainerSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return _withValueTypeSerializer(typeserializer);
    }

    public MapSerializer _withValueTypeSerializer(TypeSerializer typeserializer)
    {
        return new MapSerializer(this, typeserializer);
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj = null;
        if (beanproperty == null) goto _L2; else goto _L1
_L1:
        Object obj1 = beanproperty.getMember();
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        Object obj2 = serializerprovider.getAnnotationIntrospector();
        obj = ((AnnotationIntrospector) (obj2)).findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        String as[];
        int i;
        int j;
        if (obj != null)
        {
            obj = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), obj);
        } else
        {
            obj = null;
        }
        obj2 = ((AnnotationIntrospector) (obj2)).findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)));
        if (obj2 != null)
        {
            obj1 = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj1)), obj2);
        } else
        {
            obj1 = null;
        }
_L7:
        obj2 = obj1;
        if (obj1 == null)
        {
            obj2 = _valueSerializer;
        }
        if (obj2 == null)
        {
            if (_valueTypeIsStatic || hasContentTypeAnnotation(serializerprovider, beanproperty))
            {
                obj1 = serializerprovider.findValueSerializer(_valueType, beanproperty);
                break MISSING_BLOCK_LABEL_116;
            }
        } else
        if (obj2 instanceof ContextualSerializer)
        {
            obj1 = ((ContextualSerializer)obj2).createContextual(serializerprovider, beanproperty);
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj2;
          goto _L4
_L5:
        if (obj == null)
        {
            obj2 = _keySerializer;
        } else
        {
            obj2 = obj;
        }
        if (obj2 == null)
        {
            obj = serializerprovider.findKeySerializer(_keyType, beanproperty);
        } else
        {
            obj = obj2;
            if (obj2 instanceof ContextualSerializer)
            {
                obj = ((ContextualSerializer)obj2).createContextual(serializerprovider, beanproperty);
            }
        }
        obj2 = _ignoredEntries;
        serializerprovider = serializerprovider.getAnnotationIntrospector();
        if (serializerprovider != null && beanproperty != null)
        {
            as = serializerprovider.findPropertiesToIgnore(beanproperty.getMember());
            if (as != null)
            {
                if (obj2 == null)
                {
                    serializerprovider = new HashSet();
                } else
                {
                    serializerprovider = new HashSet(((java.util.Collection) (obj2)));
                }
                j = as.length;
                i = 0;
                do
                {
                    obj2 = serializerprovider;
                    if (i >= j)
                    {
                        break;
                    }
                    serializerprovider.add(as[i]);
                    i++;
                } while (true);
            }
        }
        return withResolved(beanproperty, ((JsonSerializer) (obj)), ((JsonSerializer) (obj1)), ((HashSet) (obj2)));
_L4:
        if (true) goto _L5; else goto _L2
_L2:
        obj1 = null;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((Map)obj);
    }

    public boolean hasSingleElement(Map map)
    {
        return map.size() == 1;
    }

    public volatile boolean isEmpty(Object obj)
    {
        return isEmpty((Map)obj);
    }

    public boolean isEmpty(Map map)
    {
        return map == null || map.isEmpty();
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Map)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        jsongenerator.writeStartObject();
        if (!map.isEmpty())
        {
            Map map1 = map;
            if (serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
            {
                map1 = _orderEntries(map);
            }
            if (_valueSerializer != null)
            {
                serializeFieldsUsing(map1, jsongenerator, serializerprovider, _valueSerializer);
            } else
            {
                serializeFields(map1, jsongenerator, serializerprovider);
            }
        }
        jsongenerator.writeEndObject();
    }

    public void serializeFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (_valueTypeSerializer == null) goto _L2; else goto _L1
_L1:
        serializeTypedFields(map, jsongenerator, serializerprovider);
_L4:
        return;
_L2:
        Object obj;
        JsonSerializer jsonserializer;
        HashSet hashset;
        Object obj3;
        Object obj4;
        boolean flag;
        jsonserializer = _keySerializer;
        hashset = _ignoredEntries;
        java.util.Map.Entry entry;
        Iterator iterator;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = _dynamicValueSerializers;
        iterator = map.entrySet().iterator();
_L5:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        entry = (java.util.Map.Entry)iterator.next();
        obj3 = entry.getValue();
        obj4 = entry.getKey();
        if (obj4 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
_L7:
        if (obj3 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
        } else
        {
            Object obj2 = obj3.getClass();
            Object obj1 = ((PropertySerializerMap) (obj)).serializerFor(((Class) (obj2)));
            if (obj1 == null)
            {
                if (_valueType.hasGenericTypes())
                {
                    obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_valueType, ((Class) (obj2))), serializerprovider);
                } else
                {
                    obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), ((Class) (obj2)), serializerprovider);
                }
                obj2 = _dynamicValueSerializers;
                obj1 = obj;
                obj = obj2;
            }
            try
            {
                ((JsonSerializer) (obj1)).serialize(obj3, jsongenerator, serializerprovider);
            }
            catch (Exception exception)
            {
                wrapAndThrow(serializerprovider, exception, map, String.valueOf(obj4));
            }
        }
          goto _L5
          goto _L4
        if (flag && obj3 == null || hashset != null && hashset.contains(obj4)) goto _L5; else goto _L6
_L6:
        jsonserializer.serialize(obj4, jsongenerator, serializerprovider);
          goto _L7
    }

    protected void serializeFieldsUsing(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException, JsonGenerationException
    {
        JsonSerializer jsonserializer1;
        HashSet hashset;
        TypeSerializer typeserializer;
        Object obj;
        Object obj1;
        boolean flag;
        jsonserializer1 = _keySerializer;
        hashset = _ignoredEntries;
        typeserializer = _valueTypeSerializer;
        Iterator iterator;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterator = map.entrySet().iterator();
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (java.util.Map.Entry)iterator.next();
        obj = ((java.util.Map.Entry) (obj1)).getValue();
        obj1 = ((java.util.Map.Entry) (obj1)).getKey();
        if (obj1 == null)
        {
            serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
        } else
        {
            if (flag && obj == null || hashset != null && hashset.contains(obj1))
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
        }
        if (obj == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            continue; /* Loop/switch isn't completed */
        }
        if (typeserializer == null)
        {
            try
            {
                jsonserializer.serialize(obj, jsongenerator, serializerprovider);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                wrapAndThrow(serializerprovider, ((Throwable) (obj)), map, String.valueOf(obj1));
            }
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer.serializeWithType(obj, jsongenerator, serializerprovider, typeserializer);
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void serializeTypedFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        Object obj;
        Object obj1;
        JsonSerializer jsonserializer;
        HashSet hashset;
        Object obj5;
        Object obj6;
        boolean flag;
        jsonserializer = _keySerializer;
        hashset = _ignoredEntries;
        java.util.Map.Entry entry;
        Iterator iterator;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        iterator = map.entrySet().iterator();
        obj1 = null;
        obj = null;
_L2:
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        entry = (java.util.Map.Entry)iterator.next();
        obj5 = entry.getValue();
        obj6 = entry.getKey();
        if (obj6 == null)
        {
            serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
        } else
        {
            if (flag && obj5 == null || hashset != null && hashset.contains(obj6))
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonserializer.serialize(obj6, jsongenerator, serializerprovider);
        }
        if (obj5 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            continue; /* Loop/switch isn't completed */
        }
        Object obj2 = obj5.getClass();
        Object obj4;
        if (obj2 == obj1)
        {
            obj2 = obj1;
            obj1 = obj;
            obj4 = obj;
            obj = obj2;
        } else
        {
            obj4 = serializerprovider.findValueSerializer(((Class) (obj2)), _property);
            obj1 = obj4;
            obj = obj2;
        }
        ((JsonSerializer) (obj4)).serializeWithType(obj5, jsongenerator, serializerprovider, _valueTypeSerializer);
        obj2 = obj1;
        obj1 = obj;
        obj = obj2;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        wrapAndThrow(serializerprovider, exception, map, String.valueOf(obj6));
        Object obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonProcessingException
    {
        serializeWithType((Map)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException, JsonGenerationException
    {
        typeserializer.writeTypePrefixForObject(map, jsongenerator);
        Map map1 = map;
        if (!map.isEmpty())
        {
            map1 = map;
            if (serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
            {
                map1 = _orderEntries(map);
            }
            if (_valueSerializer != null)
            {
                serializeFieldsUsing(map1, jsongenerator, serializerprovider, _valueSerializer);
            } else
            {
                serializeFields(map1, jsongenerator, serializerprovider);
            }
        }
        typeserializer.writeTypeSuffixForObject(map1, jsongenerator);
    }

    public MapSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, HashSet hashset)
    {
        return new MapSerializer(this, beanproperty, jsonserializer, jsonserializer1, hashset);
    }

}
