// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.ContainerSerializer;
import com.fasterxml.jackson.databind.ser.ContextualSerializer;
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            MapProperty

public class MapSerializer extends ContainerSerializer
    implements ContextualSerializer
{

    protected static final JavaType UNSPECIFIED_TYPE = TypeFactory.unknownType();
    protected PropertySerializerMap _dynamicValueSerializers;
    protected final Object _filterId;
    protected final HashSet _ignoredEntries;
    protected JsonSerializer _keySerializer;
    protected final JavaType _keyType;
    protected final BeanProperty _property;
    protected final boolean _sortKeys;
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
        _filterId = mapserializer._filterId;
        _sortKeys = mapserializer._sortKeys;
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
        _filterId = mapserializer._filterId;
        _sortKeys = mapserializer._sortKeys;
    }

    protected MapSerializer(MapSerializer mapserializer, Object obj, boolean flag)
    {
        super(java/util/Map, false);
        _ignoredEntries = mapserializer._ignoredEntries;
        _keyType = mapserializer._keyType;
        _valueType = mapserializer._valueType;
        _valueTypeIsStatic = mapserializer._valueTypeIsStatic;
        _valueTypeSerializer = mapserializer._valueTypeSerializer;
        _keySerializer = mapserializer._keySerializer;
        _valueSerializer = mapserializer._valueSerializer;
        _dynamicValueSerializers = mapserializer._dynamicValueSerializers;
        _property = mapserializer._property;
        _filterId = obj;
        _sortKeys = flag;
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
        _filterId = null;
        _sortKeys = false;
    }

    public static MapSerializer construct(String as[], JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Object obj)
    {
        boolean flag1 = false;
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
        if (flag) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (javatype != null)
        {
            flag = flag1;
            if (javatype.isFinal())
            {
                flag = true;
            }
        }
_L4:
        javatype = new MapSerializer(hashset, as, javatype, flag, typeserializer, jsonserializer, jsonserializer1);
        as = javatype;
        if (obj != null)
        {
            as = javatype.withFilterId(obj);
        }
        return as;
_L2:
        if (javatype.getRawClass() == java/lang/Object)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
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
    {
        javatype = propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
    {
        class1 = propertyserializermap.findAndAddSecondarySerializer(class1, serializerprovider, _property);
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
    {
        Object obj = null;
        AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
        Object obj1;
        Object obj2;
        if (beanproperty == null)
        {
            obj2 = null;
        } else
        {
            obj2 = beanproperty.getMember();
        }
        if (obj2 != null && annotationintrospector != null)
        {
            obj = annotationintrospector.findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
            JsonSerializer jsonserializer;
            String as[];
            int i;
            int j;
            boolean flag;
            if (obj != null)
            {
                obj = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj);
            } else
            {
                obj = null;
            }
            obj1 = annotationintrospector.findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
            if (obj1 != null)
            {
                obj1 = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj1);
            } else
            {
                obj1 = null;
            }
        } else
        {
            obj1 = null;
        }
        jsonserializer = ((JsonSerializer) (obj1));
        if (obj1 == null)
        {
            jsonserializer = _valueSerializer;
        }
        obj1 = findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer);
        if (obj1 == null)
        {
            if (_valueTypeIsStatic && _valueType.getRawClass() != java/lang/Object || hasContentTypeAnnotation(serializerprovider, beanproperty))
            {
                obj1 = serializerprovider.findValueSerializer(_valueType, beanproperty);
            }
        } else
        {
            obj1 = serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj1)), beanproperty);
        }
        if (obj == null)
        {
            obj = _keySerializer;
        }
        if (obj == null)
        {
            jsonserializer = serializerprovider.findKeySerializer(_keyType, beanproperty);
        } else
        {
            jsonserializer = serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj)), beanproperty);
        }
        serializerprovider = _ignoredEntries;
        if (annotationintrospector != null && obj2 != null)
        {
            as = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
            if (as != null)
            {
                if (serializerprovider == null)
                {
                    obj = new HashSet();
                } else
                {
                    obj = new HashSet(serializerprovider);
                }
                j = as.length;
                i = 0;
                do
                {
                    serializerprovider = ((SerializerProvider) (obj));
                    if (i >= j)
                    {
                        break;
                    }
                    ((HashSet) (obj)).add(as[i]);
                    i++;
                } while (true);
            }
            obj = annotationintrospector.findSerializationSortAlphabetically(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
            if (obj != null && ((Boolean) (obj)).booleanValue())
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            flag = false;
        }
        obj = withResolved(beanproperty, jsonserializer, ((JsonSerializer) (obj1)), serializerprovider, flag);
        serializerprovider = ((SerializerProvider) (obj));
        if (beanproperty != null)
        {
            beanproperty = ((BeanProperty) (annotationintrospector.findFilterId(beanproperty.getMember())));
            serializerprovider = ((SerializerProvider) (obj));
            if (beanproperty != null)
            {
                serializerprovider = ((MapSerializer) (obj)).withFilterId(beanproperty);
            }
        }
        return serializerprovider;
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
    {
        serialize((Map)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
label0:
        {
            Map map1;
label1:
            {
                jsongenerator.writeStartObject();
                if (map.isEmpty())
                {
                    break label0;
                }
                if (_filterId != null)
                {
                    serializeFilteredFields(map, jsongenerator, serializerprovider, findPropertyFilter(serializerprovider, _filterId, map));
                    jsongenerator.writeEndObject();
                    return;
                }
                if (!_sortKeys)
                {
                    map1 = map;
                    if (!serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
                    {
                        break label1;
                    }
                }
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

    public void serializeFilteredFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter)
    {
        HashSet hashset = _ignoredEntries;
        Object obj;
        MapProperty mapproperty;
        Iterator iterator;
        boolean flag;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = _dynamicValueSerializers;
        mapproperty = new MapProperty(_valueTypeSerializer);
        iterator = map.entrySet().iterator();
        do
        {
            if (iterator.hasNext())
            {
                Object obj1 = (java.util.Map.Entry)iterator.next();
                Object obj3 = ((java.util.Map.Entry) (obj1)).getKey();
                Object obj4 = ((java.util.Map.Entry) (obj1)).getValue();
                JsonSerializer jsonserializer;
                if (obj3 == null)
                {
                    jsonserializer = serializerprovider.findNullKeySerializer(_keyType, _property);
                } else
                {
                    if (flag && obj4 == null || hashset != null && hashset.contains(obj3))
                    {
                        continue;
                    }
                    jsonserializer = _keySerializer;
                }
                if (obj4 == null)
                {
                    obj1 = serializerprovider.getDefaultNullValueSerializer();
                } else
                {
                    Object obj2 = obj4.getClass();
                    obj1 = ((PropertySerializerMap) (obj)).serializerFor(((Class) (obj2)));
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
                }
                mapproperty.reset(obj3, obj4, jsonserializer, ((JsonSerializer) (obj1)));
                try
                {
                    propertyfilter.serializeAsField(map, jsongenerator, serializerprovider, mapproperty);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(serializerprovider, exception, map, String.valueOf(obj3));
                }
                continue;
            }
            return;
        } while (true);
    }

    protected void serializeTypedFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        Object obj;
        Object obj1;
        JsonSerializer jsonserializer;
        HashSet hashset;
        Object obj7;
        Object obj8;
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
        obj7 = entry.getValue();
        obj8 = entry.getKey();
        if (obj8 == null)
        {
            serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
        } else
        {
            if (flag && obj7 == null || hashset != null && hashset.contains(obj8))
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonserializer.serialize(obj8, jsongenerator, serializerprovider);
        }
        if (obj7 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            continue; /* Loop/switch isn't completed */
        }
        Object obj6 = obj7.getClass();
        Object obj3;
        if (obj6 == obj1)
        {
            Object obj2 = obj1;
            obj1 = obj;
            obj6 = obj;
            obj = obj2;
        } else
        {
            Object obj4;
            if (_valueType.hasGenericTypes())
            {
                obj = serializerprovider.findValueSerializer(serializerprovider.constructSpecializedType(_valueType, ((Class) (obj6))), _property);
            } else
            {
                obj = serializerprovider.findValueSerializer(((Class) (obj6)), _property);
            }
            obj4 = obj;
            obj1 = obj;
            obj = obj6;
            obj6 = obj4;
        }
        ((JsonSerializer) (obj6)).serializeWithType(obj7, jsongenerator, serializerprovider, _valueTypeSerializer);
        obj3 = obj1;
        obj1 = obj;
        obj = obj3;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        wrapAndThrow(serializerprovider, exception, map, String.valueOf(obj8));
        Object obj5 = obj1;
        obj1 = obj;
        obj = obj5;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
        serializeWithType((Map)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
    {
label0:
        {
            Map map1;
label1:
            {
                typeserializer.writeTypePrefixForObject(map, jsongenerator);
                map1 = map;
                if (map.isEmpty())
                {
                    break label0;
                }
                if (!_sortKeys)
                {
                    map1 = map;
                    if (!serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
                    {
                        break label1;
                    }
                }
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

    public MapSerializer withFilterId(Object obj)
    {
        if (_filterId == obj)
        {
            return this;
        } else
        {
            return new MapSerializer(this, obj, _sortKeys);
        }
    }

    public MapSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, HashSet hashset, boolean flag)
    {
        jsonserializer = new MapSerializer(this, beanproperty, jsonserializer, jsonserializer1, hashset);
        beanproperty = jsonserializer;
        if (flag != ((MapSerializer) (jsonserializer))._sortKeys)
        {
            beanproperty = new MapSerializer(jsonserializer, _filterId, flag);
        }
        return beanproperty;
    }

}
