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
import com.fasterxml.jackson.databind.ser.PropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;
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
    protected final Object _suppressableValue;
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
        _suppressableValue = mapserializer._suppressableValue;
    }

    protected MapSerializer(MapSerializer mapserializer, TypeSerializer typeserializer, Object obj)
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
        _suppressableValue = obj;
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
        _suppressableValue = mapserializer._suppressableValue;
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
        _dynamicValueSerializers = PropertySerializerMap.emptyForProperties();
        _property = null;
        _filterId = null;
        _sortKeys = false;
        _suppressableValue = null;
    }

    public static MapSerializer construct(String as[], JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, Object obj)
    {
        JavaType javatype1;
        if (as == null || as.length == 0)
        {
            as = null;
        } else
        {
            as = ArrayBuilders.arrayToSet(as);
        }
        if (javatype == null)
        {
            javatype1 = UNSPECIFIED_TYPE;
            javatype = javatype1;
        } else
        {
            javatype1 = javatype.getKeyType();
            JavaType javatype2 = javatype.getContentType();
            javatype = javatype1;
            javatype1 = javatype2;
        }
        if (flag) goto _L2; else goto _L1
_L1:
        if (javatype1 != null && javatype1.isFinal())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L4:
        javatype = new MapSerializer(as, javatype, javatype1, flag, typeserializer, jsonserializer, jsonserializer1);
        as = javatype;
        if (obj != null)
        {
            as = javatype.withFilterId(obj);
        }
        return as;
_L2:
        if (javatype1.getRawClass() == java/lang/Object)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void _ensureOverride()
    {
        if (getClass() != com/fasterxml/jackson/databind/ser/std/MapSerializer)
        {
            throw new IllegalStateException((new StringBuilder()).append("Missing override in class ").append(getClass().getName()).toString());
        } else
        {
            return;
        }
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, JavaType javatype, SerializerProvider serializerprovider)
        throws JsonMappingException
    {
        javatype = propertyserializermap.findAndAddSecondarySerializer(javatype, serializerprovider, _property);
        if (propertyserializermap != ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map)
        {
            _dynamicValueSerializers = ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).map;
        }
        return ((com.fasterxml.jackson.databind.ser.impl.PropertySerializerMap.SerializerAndMapResult) (javatype)).serializer;
    }

    protected final JsonSerializer _findAndAddDynamic(PropertySerializerMap propertyserializermap, Class class1, SerializerProvider serializerprovider)
        throws JsonMappingException
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
        if (_valueTypeSerializer == typeserializer)
        {
            return this;
        } else
        {
            _ensureOverride();
            return new MapSerializer(this, typeserializer, null);
        }
    }

    public JsonSerializer createContextual(SerializerProvider serializerprovider, BeanProperty beanproperty)
        throws JsonMappingException
    {
        Object obj5 = null;
        JsonSerializer jsonserializer1 = null;
        Object obj6 = null;
        JsonSerializer jsonserializer = null;
        AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        boolean flag;
        boolean flag1;
        if (beanproperty == null)
        {
            obj2 = null;
        } else
        {
            obj2 = beanproperty.getMember();
        }
        obj4 = _suppressableValue;
        obj = obj6;
        obj1 = obj5;
        obj3 = obj4;
        if (obj2 != null)
        {
            obj = obj6;
            obj1 = obj5;
            obj3 = obj4;
            if (annotationintrospector != null)
            {
                obj = annotationintrospector.findKeySerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
                if (obj != null)
                {
                    jsonserializer = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj);
                }
                obj = annotationintrospector.findContentSerializer(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
                if (obj != null)
                {
                    jsonserializer1 = serializerprovider.serializerInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), obj);
                }
                com.fasterxml.jackson.annotation.JsonInclude.Include include = annotationintrospector.findSerializationInclusionForContent(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)), null);
                obj = jsonserializer;
                obj1 = jsonserializer1;
                obj3 = obj4;
                if (include != null)
                {
                    obj3 = include;
                    obj1 = jsonserializer1;
                    obj = jsonserializer;
                }
            }
        }
        jsonserializer = ((JsonSerializer) (obj1));
        if (obj1 == null)
        {
            jsonserializer = _valueSerializer;
        }
        jsonserializer = findConvertingContentSerializer(serializerprovider, beanproperty, jsonserializer);
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
            obj1 = serializerprovider.findKeySerializer(_keyType, beanproperty);
        } else
        {
            obj1 = serializerprovider.handleSecondaryContextualization(((JsonSerializer) (obj1)), beanproperty);
        }
        obj = _ignoredEntries;
        flag1 = false;
        serializerprovider = ((SerializerProvider) (obj));
        flag = flag1;
        if (annotationintrospector != null)
        {
            serializerprovider = ((SerializerProvider) (obj));
            flag = flag1;
            if (obj2 != null)
            {
                String as[] = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj2)));
                serializerprovider = ((SerializerProvider) (obj));
                if (as != null)
                {
                    int i;
                    int j;
                    if (obj == null)
                    {
                        obj = new HashSet();
                    } else
                    {
                        obj = new HashSet(((java.util.Collection) (obj)));
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
            }
        }
        obj = withResolved(beanproperty, ((JsonSerializer) (obj1)), jsonserializer, serializerprovider, flag);
        serializerprovider = ((SerializerProvider) (obj));
        if (obj3 != _suppressableValue)
        {
            serializerprovider = ((MapSerializer) (obj)).withContentInclusion(obj3);
        }
        obj = serializerprovider;
        if (beanproperty != null)
        {
            beanproperty = beanproperty.getMember();
            obj = serializerprovider;
            if (beanproperty != null)
            {
                beanproperty = ((BeanProperty) (annotationintrospector.findFilterId(beanproperty)));
                obj = serializerprovider;
                if (beanproperty != null)
                {
                    obj = serializerprovider.withFilterId(beanproperty);
                }
            }
        }
        return ((JsonSerializer) (obj));
    }

    public volatile boolean hasSingleElement(Object obj)
    {
        return hasSingleElement((Map)obj);
    }

    public boolean hasSingleElement(Map map)
    {
        return map.size() == 1;
    }

    public volatile boolean isEmpty(SerializerProvider serializerprovider, Object obj)
    {
        return isEmpty(serializerprovider, (Map)obj);
    }

    public boolean isEmpty(SerializerProvider serializerprovider, Map map)
    {
        return map == null || map.isEmpty();
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Map)obj, jsongenerator, serializerprovider);
    }

    public void serialize(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        jsongenerator.writeStartObject();
        jsongenerator.setCurrentValue(map);
        if (map.isEmpty()) goto _L2; else goto _L1
_L1:
        Object obj1 = _suppressableValue;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = obj1;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            obj = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
        }
_L6:
label0:
        {
            if (!_sortKeys)
            {
                obj1 = map;
                if (!serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
                {
                    break label0;
                }
            }
            obj1 = _orderEntries(map);
        }
        if (_filterId != null)
        {
            serializeFilteredFields(((Map) (obj1)), jsongenerator, serializerprovider, findPropertyFilter(serializerprovider, _filterId, obj1), obj);
        } else
        if (obj != null)
        {
            serializeOptionalFields(((Map) (obj1)), jsongenerator, serializerprovider, obj);
        } else
        if (_valueSerializer != null)
        {
            serializeFieldsUsing(((Map) (obj1)), jsongenerator, serializerprovider, _valueSerializer);
        } else
        {
            serializeFields(((Map) (obj1)), jsongenerator, serializerprovider);
        }
_L2:
        jsongenerator.writeEndObject();
        return;
_L4:
        obj = obj1;
        if (obj1 == com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
        {
            obj = null;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void serializeFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (_valueTypeSerializer == null) goto _L2; else goto _L1
_L1:
        serializeTypedFields(map, jsongenerator, serializerprovider, null);
_L6:
        return;
_L2:
        Object obj;
        JsonSerializer jsonserializer1;
        HashSet hashset;
        Iterator iterator;
        jsonserializer1 = _keySerializer;
        hashset = _ignoredEntries;
        obj = _dynamicValueSerializers;
        iterator = map.entrySet().iterator();
_L4:
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        Object obj1 = (java.util.Map.Entry)iterator.next();
        Object obj3 = ((java.util.Map.Entry) (obj1)).getValue();
        Object obj4 = ((java.util.Map.Entry) (obj1)).getKey();
        if (obj4 == null)
        {
            serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
        } else
        {
            if (hashset != null && hashset.contains(obj4))
            {
                break; /* Loop/switch isn't completed */
            }
            jsonserializer1.serialize(obj4, jsongenerator, serializerprovider);
        }
        if (obj3 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            break; /* Loop/switch isn't completed */
        }
        Class class1 = obj3.getClass();
        JsonSerializer jsonserializer = ((PropertySerializerMap) (obj)).serializerFor(class1);
        Object obj2 = jsonserializer;
        obj1 = obj;
        if (jsonserializer == null)
        {
            if (_valueType.hasGenericTypes())
            {
                obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
            } else
            {
                obj = _findAndAddDynamic(((PropertySerializerMap) (obj)), class1, serializerprovider);
            }
            obj1 = _dynamicValueSerializers;
            obj2 = obj;
        }
        ((JsonSerializer) (obj2)).serialize(obj3, jsongenerator, serializerprovider);
        obj = obj1;
        break; /* Loop/switch isn't completed */
        obj;
        wrapAndThrow(serializerprovider, ((Throwable) (obj)), map, (new StringBuilder()).append("").append(obj4).toString());
        obj = obj1;
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void serializeFieldsUsing(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, JsonSerializer jsonserializer)
        throws IOException
    {
        JsonSerializer jsonserializer1;
        HashSet hashset;
        TypeSerializer typeserializer;
        Iterator iterator;
        jsonserializer1 = _keySerializer;
        hashset = _ignoredEntries;
        typeserializer = _valueTypeSerializer;
        iterator = map.entrySet().iterator();
_L2:
        Object obj1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (java.util.Map.Entry)iterator.next();
        Object obj = ((java.util.Map.Entry) (obj1)).getKey();
        if (hashset != null && hashset.contains(obj))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (obj == null)
        {
            serializerprovider.findNullKeySerializer(_keyType, _property).serialize(null, jsongenerator, serializerprovider);
        } else
        {
            jsonserializer1.serialize(obj, jsongenerator, serializerprovider);
        }
        obj1 = ((java.util.Map.Entry) (obj1)).getValue();
        if (obj1 == null)
        {
            serializerprovider.defaultSerializeNull(jsongenerator);
            continue; /* Loop/switch isn't completed */
        }
        if (typeserializer == null)
        {
            try
            {
                jsonserializer.serialize(obj1, jsongenerator, serializerprovider);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                wrapAndThrow(serializerprovider, ((Throwable) (obj1)), map, (new StringBuilder()).append("").append(obj).toString());
            }
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer.serializeWithType(obj1, jsongenerator, serializerprovider, typeserializer);
        if (true) goto _L2; else goto _L1
_L1:
    }

    public void serializeFilteredFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, PropertyFilter propertyfilter, Object obj)
        throws IOException
    {
        PropertySerializerMap propertyserializermap;
        HashSet hashset;
        MapProperty mapproperty;
        Iterator iterator;
        hashset = _ignoredEntries;
        propertyserializermap = _dynamicValueSerializers;
        mapproperty = new MapProperty(_valueTypeSerializer, _property);
        iterator = map.entrySet().iterator();
_L7:
        JsonSerializer jsonserializer2;
        Object obj2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_341;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        Object obj1 = entry.getKey();
        if (hashset != null && hashset.contains(obj1))
        {
            continue; /* Loop/switch isn't completed */
        }
        Exception exception;
        JsonSerializer jsonserializer1;
        if (obj1 == null)
        {
            jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
        } else
        {
            jsonserializer1 = _keySerializer;
        }
        obj2 = entry.getValue();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
_L4:
        mapproperty.reset(obj1, jsonserializer1, jsonserializer2);
        try
        {
            propertyfilter.serializeAsField(obj2, jsongenerator, serializerprovider, mapproperty);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            wrapAndThrow(serializerprovider, exception, map, (new StringBuilder()).append("").append(obj1).toString());
        }
        continue; /* Loop/switch isn't completed */
_L2:
        jsonserializer2 = _valueSerializer;
        PropertySerializerMap propertyserializermap1 = propertyserializermap;
        JsonSerializer jsonserializer = jsonserializer2;
        if (jsonserializer2 == null)
        {
            Class class1 = obj2.getClass();
            jsonserializer2 = propertyserializermap.serializerFor(class1);
            propertyserializermap1 = propertyserializermap;
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                if (_valueType.hasGenericTypes())
                {
                    jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
                } else
                {
                    jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
                }
                propertyserializermap1 = _dynamicValueSerializers;
            }
        }
        propertyserializermap = propertyserializermap1;
        jsonserializer2 = jsonserializer;
        if (obj != com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY) goto _L4; else goto _L3
_L3:
        propertyserializermap = propertyserializermap1;
        jsonserializer2 = jsonserializer;
        if (!jsonserializer.isEmpty(serializerprovider, obj2)) goto _L4; else goto _L5
_L5:
        propertyserializermap = propertyserializermap1;
        continue; /* Loop/switch isn't completed */
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void serializeOptionalFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, Object obj)
        throws IOException
    {
        if (_valueTypeSerializer == null) goto _L2; else goto _L1
_L1:
        serializeTypedFields(map, jsongenerator, serializerprovider, obj);
_L11:
        return;
_L2:
        PropertySerializerMap propertyserializermap;
        HashSet hashset;
        Iterator iterator;
        hashset = _ignoredEntries;
        propertyserializermap = _dynamicValueSerializers;
        iterator = map.entrySet().iterator();
_L9:
        JsonSerializer jsonserializer2;
        Object obj2;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        Object obj1 = entry.getKey();
        Exception exception;
        JsonSerializer jsonserializer1;
        if (obj1 == null)
        {
            jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
        } else
        {
            if (hashset != null && hashset.contains(obj1))
            {
                break; /* Loop/switch isn't completed */
            }
            jsonserializer1 = _keySerializer;
        }
        obj2 = entry.getValue();
        if (obj2 != null) goto _L4; else goto _L3
_L3:
        if (obj != null)
        {
            break; /* Loop/switch isn't completed */
        }
        jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
_L6:
        try
        {
            jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
            jsonserializer2.serialize(obj2, jsongenerator, serializerprovider);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            wrapAndThrow(serializerprovider, exception, map, (new StringBuilder()).append("").append(obj1).toString());
        }
        break; /* Loop/switch isn't completed */
_L4:
        jsonserializer2 = _valueSerializer;
        PropertySerializerMap propertyserializermap1 = propertyserializermap;
        JsonSerializer jsonserializer = jsonserializer2;
        if (jsonserializer2 == null)
        {
            Class class1 = obj2.getClass();
            jsonserializer2 = propertyserializermap.serializerFor(class1);
            propertyserializermap1 = propertyserializermap;
            jsonserializer = jsonserializer2;
            if (jsonserializer2 == null)
            {
                if (_valueType.hasGenericTypes())
                {
                    jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
                } else
                {
                    jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
                }
                propertyserializermap1 = _dynamicValueSerializers;
            }
        }
        propertyserializermap = propertyserializermap1;
        jsonserializer2 = jsonserializer;
        if (obj != com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY) goto _L6; else goto _L5
_L5:
        propertyserializermap = propertyserializermap1;
        jsonserializer2 = jsonserializer;
        if (!jsonserializer.isEmpty(serializerprovider, obj2)) goto _L6; else goto _L7
_L7:
        propertyserializermap = propertyserializermap1;
        if (true) goto _L9; else goto _L8
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    protected void serializeTypedFields(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, Object obj)
        throws IOException
    {
        PropertySerializerMap propertyserializermap;
        HashSet hashset;
        Iterator iterator;
        hashset = _ignoredEntries;
        propertyserializermap = _dynamicValueSerializers;
        iterator = map.entrySet().iterator();
_L7:
        JsonSerializer jsonserializer2;
        Object obj2;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_309;
        }
        java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
        Object obj1 = entry.getKey();
        Exception exception;
        JsonSerializer jsonserializer1;
        if (obj1 == null)
        {
            jsonserializer1 = serializerprovider.findNullKeySerializer(_keyType, _property);
        } else
        {
            if (hashset != null && hashset.contains(obj1))
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonserializer1 = _keySerializer;
        }
        obj2 = entry.getValue();
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        jsonserializer2 = serializerprovider.getDefaultNullValueSerializer();
_L4:
        jsonserializer1.serialize(obj1, jsongenerator, serializerprovider);
        try
        {
            jsonserializer2.serializeWithType(obj2, jsongenerator, serializerprovider, _valueTypeSerializer);
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            wrapAndThrow(serializerprovider, exception, map, (new StringBuilder()).append("").append(obj1).toString());
        }
        continue; /* Loop/switch isn't completed */
_L2:
        JsonSerializer jsonserializer = _valueSerializer;
        Class class1 = obj2.getClass();
        jsonserializer2 = propertyserializermap.serializerFor(class1);
        PropertySerializerMap propertyserializermap1 = propertyserializermap;
        jsonserializer = jsonserializer2;
        if (jsonserializer2 == null)
        {
            if (_valueType.hasGenericTypes())
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap, serializerprovider.constructSpecializedType(_valueType, class1), serializerprovider);
            } else
            {
                jsonserializer = _findAndAddDynamic(propertyserializermap, class1, serializerprovider);
            }
            propertyserializermap1 = _dynamicValueSerializers;
        }
        propertyserializermap = propertyserializermap1;
        jsonserializer2 = jsonserializer;
        if (obj != com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY) goto _L4; else goto _L3
_L3:
        propertyserializermap = propertyserializermap1;
        jsonserializer2 = jsonserializer;
        if (!jsonserializer.isEmpty(serializerprovider, obj2)) goto _L4; else goto _L5
_L5:
        propertyserializermap = propertyserializermap1;
        continue; /* Loop/switch isn't completed */
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public volatile void serializeWithType(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        serializeWithType((Map)obj, jsongenerator, serializerprovider, typeserializer);
    }

    public void serializeWithType(Map map, JsonGenerator jsongenerator, SerializerProvider serializerprovider, TypeSerializer typeserializer)
        throws IOException
    {
        Object obj1;
        typeserializer.writeTypePrefixForObject(map, jsongenerator);
        jsongenerator.setCurrentValue(map);
        obj1 = map;
        if (map.isEmpty()) goto _L2; else goto _L1
_L1:
        obj1 = _suppressableValue;
        if (obj1 != null) goto _L4; else goto _L3
_L3:
        Object obj;
        obj = obj1;
        if (!serializerprovider.isEnabled(SerializationFeature.WRITE_NULL_MAP_VALUES))
        {
            obj = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
        }
_L6:
label0:
        {
            if (!_sortKeys)
            {
                obj1 = map;
                if (!serializerprovider.isEnabled(SerializationFeature.ORDER_MAP_ENTRIES_BY_KEYS))
                {
                    break label0;
                }
            }
            obj1 = _orderEntries(map);
        }
        if (_filterId != null)
        {
            serializeFilteredFields(((Map) (obj1)), jsongenerator, serializerprovider, findPropertyFilter(serializerprovider, _filterId, obj1), obj);
        } else
        if (obj != null)
        {
            serializeOptionalFields(((Map) (obj1)), jsongenerator, serializerprovider, obj);
        } else
        if (_valueSerializer != null)
        {
            serializeFieldsUsing(((Map) (obj1)), jsongenerator, serializerprovider, _valueSerializer);
        } else
        {
            serializeFields(((Map) (obj1)), jsongenerator, serializerprovider);
        }
_L2:
        typeserializer.writeTypeSuffixForObject(obj1, jsongenerator);
        return;
_L4:
        obj = obj1;
        if (obj1 == com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS)
        {
            obj = null;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public MapSerializer withContentInclusion(Object obj)
    {
        if (obj == _suppressableValue)
        {
            return this;
        } else
        {
            _ensureOverride();
            return new MapSerializer(this, _valueTypeSerializer, obj);
        }
    }

    public MapSerializer withFilterId(Object obj)
    {
        if (_filterId == obj)
        {
            return this;
        } else
        {
            _ensureOverride();
            return new MapSerializer(this, obj, _sortKeys);
        }
    }

    public MapSerializer withResolved(BeanProperty beanproperty, JsonSerializer jsonserializer, JsonSerializer jsonserializer1, HashSet hashset, boolean flag)
    {
        _ensureOverride();
        jsonserializer = new MapSerializer(this, beanproperty, jsonserializer, jsonserializer1, hashset);
        beanproperty = jsonserializer;
        if (flag != ((MapSerializer) (jsonserializer))._sortKeys)
        {
            beanproperty = new MapSerializer(jsonserializer, _filterId, flag);
        }
        return beanproperty;
    }

}
