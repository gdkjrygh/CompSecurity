// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.BasicBeanDescription;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.IteratorSerializer;
import com.fasterxml.jackson.databind.ser.impl.MapEntrySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.CollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSetSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.IterableSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlDateSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
import com.fasterxml.jackson.databind.ser.std.StdKeySerializers;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;
import com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer;
import com.fasterxml.jackson.databind.type.ArrayType;
import com.fasterxml.jackson.databind.type.CollectionLikeType;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.fasterxml.jackson.databind.type.MapLikeType;
import com.fasterxml.jackson.databind.type.MapType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            SerializerFactory, Serializers, BeanSerializerModifier, ContainerSerializer

public abstract class BasicSerializerFactory extends SerializerFactory
    implements Serializable
{

    protected static final HashMap _concrete;
    protected static final HashMap _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;

    protected BasicSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
    {
        SerializerFactoryConfig serializerfactoryconfig1 = serializerfactoryconfig;
        if (serializerfactoryconfig == null)
        {
            serializerfactoryconfig1 = new SerializerFactoryConfig();
        }
        _factoryConfig = serializerfactoryconfig1;
    }

    protected static JavaType modifySecondaryTypesByAnnotation(SerializationConfig serializationconfig, Annotated annotated, JavaType javatype)
    {
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        Object obj = javatype;
        if (javatype.isContainerType())
        {
            obj = annotationintrospector.findSerializationKeyType(annotated, javatype.getKeyType());
            serializationconfig = javatype;
            if (obj != null)
            {
                if (!(javatype instanceof MapType))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Illegal key-type annotation: type ").append(javatype).append(" is not a Map type").toString());
                }
                try
                {
                    serializationconfig = ((MapType)javatype).widenKey(((Class) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (SerializationConfig serializationconfig)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Failed to narrow key type ").append(javatype).append(" with key-type annotation (").append(((Class) (obj)).getName()).append("): ").append(serializationconfig.getMessage()).toString());
                }
            }
            annotated = annotationintrospector.findSerializationContentType(annotated, serializationconfig.getContentType());
            obj = serializationconfig;
            if (annotated != null)
            {
                try
                {
                    obj = serializationconfig.widenContentsBy(annotated);
                }
                // Misplaced declaration of an exception variable
                catch (JavaType javatype)
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Failed to narrow content type ").append(serializationconfig).append(" with content-type annotation (").append(annotated.getName()).append("): ").append(javatype.getMessage()).toString());
                }
            }
        }
        return ((JavaType) (obj));
    }

    protected JsonSerializer _findContentSerializer(SerializerProvider serializerprovider, Annotated annotated)
        throws JsonMappingException
    {
        Object obj = serializerprovider.getAnnotationIntrospector().findContentSerializer(annotated);
        if (obj != null)
        {
            return serializerprovider.serializerInstance(annotated, obj);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer _findKeySerializer(SerializerProvider serializerprovider, Annotated annotated)
        throws JsonMappingException
    {
        Object obj = serializerprovider.getAnnotationIntrospector().findKeySerializer(annotated);
        if (obj != null)
        {
            return serializerprovider.serializerInstance(annotated, obj);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer buildArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
        throws JsonMappingException
    {
        Object obj1 = null;
        Iterator iterator = customSerializers().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            JsonSerializer jsonserializer1 = ((Serializers)iterator.next()).findArraySerializer(serializationconfig, arraytype, beandescription, typeserializer, jsonserializer);
            obj1 = jsonserializer1;
            if (jsonserializer1 == null)
            {
                continue;
            }
            obj1 = jsonserializer1;
            break;
        } while (true);
        Object obj = obj1;
        if (obj1 == null)
        {
            obj = arraytype.getRawClass();
            if (jsonserializer == null || ClassUtil.isJacksonStdImpl(jsonserializer))
            {
                if ([Ljava/lang/String; == obj)
                {
                    obj1 = StringArraySerializer.instance;
                } else
                {
                    obj1 = StdArraySerializers.findStandardImpl(((Class) (obj)));
                }
            }
            obj = obj1;
            if (obj1 == null)
            {
                obj = new ObjectArraySerializer(arraytype.getContentType(), flag, typeserializer, jsonserializer);
            }
        }
        typeserializer = ((TypeSerializer) (obj));
        if (_factoryConfig.hasSerializerModifiers())
        {
            jsonserializer = _factoryConfig.serializerModifiers().iterator();
            do
            {
                typeserializer = ((TypeSerializer) (obj));
                if (!jsonserializer.hasNext())
                {
                    break;
                }
                obj = ((BeanSerializerModifier)jsonserializer.next()).modifyArraySerializer(serializationconfig, arraytype, beandescription, ((JsonSerializer) (obj)));
            } while (true);
        }
        return typeserializer;
    }

    protected JsonSerializer buildCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
        throws JsonMappingException
    {
        Object obj;
        JsonSerializer jsonserializer2;
        jsonserializer2 = null;
        Iterator iterator = customSerializers().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            JsonSerializer jsonserializer1 = ((Serializers)iterator.next()).findCollectionSerializer(serializationconfig, collectiontype, beandescription, typeserializer, jsonserializer);
            jsonserializer2 = jsonserializer1;
            if (jsonserializer1 == null)
            {
                continue;
            }
            jsonserializer2 = jsonserializer1;
            break;
        } while (true);
        obj = jsonserializer2;
        if (jsonserializer2 != null) goto _L2; else goto _L1
_L1:
        Object obj1;
        obj = beandescription.findExpectedFormat(null);
        if (obj != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
        {
            return null;
        }
        obj1 = collectiontype.getRawClass();
        if (!java/util/EnumSet.isAssignableFrom(((Class) (obj1)))) goto _L4; else goto _L3
_L3:
        jsonserializer = collectiontype.getContentType();
        typeserializer = jsonserializer;
        if (!jsonserializer.isEnumType())
        {
            typeserializer = null;
        }
        obj = buildEnumSetSerializer(typeserializer);
_L2:
        typeserializer = ((TypeSerializer) (obj));
        if (_factoryConfig.hasSerializerModifiers())
        {
            jsonserializer = _factoryConfig.serializerModifiers().iterator();
            do
            {
                typeserializer = ((TypeSerializer) (obj));
                if (!jsonserializer.hasNext())
                {
                    break;
                }
                obj = ((BeanSerializerModifier)jsonserializer.next()).modifyCollectionSerializer(serializationconfig, collectiontype, beandescription, ((JsonSerializer) (obj)));
            } while (true);
        }
          goto _L5
_L4:
        obj = collectiontype.getContentType().getRawClass();
        if (!isIndexedList(((Class) (obj1)))) goto _L7; else goto _L6
_L6:
        if (obj != java/lang/String) goto _L9; else goto _L8
_L8:
label0:
        {
            if (jsonserializer != null)
            {
                obj1 = jsonserializer2;
                if (!ClassUtil.isJacksonStdImpl(jsonserializer))
                {
                    break label0;
                }
            }
            obj1 = IndexedStringListSerializer.instance;
        }
_L10:
        obj = obj1;
        if (obj1 == null)
        {
            obj = buildCollectionSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer);
        }
        continue; /* Loop/switch isn't completed */
_L9:
        obj1 = buildIndexedListSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer);
        continue; /* Loop/switch isn't completed */
_L7:
        obj1 = jsonserializer2;
        if (obj != java/lang/String)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (jsonserializer != null)
        {
            obj1 = jsonserializer2;
            if (!ClassUtil.isJacksonStdImpl(jsonserializer))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        obj1 = StringCollectionSerializer.instance;
        if (true) goto _L10; else goto _L5
_L5:
        return typeserializer;
        if (true) goto _L2; else goto _L11
_L11:
    }

    public ContainerSerializer buildCollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new CollectionSerializer(javatype, flag, typeserializer, null, jsonserializer);
    }

    protected JsonSerializer buildContainerSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
        throws JsonMappingException
    {
        SerializationConfig serializationconfig;
        Object obj1;
        JsonSerializer jsonserializer;
        boolean flag1;
label0:
        {
            serializationconfig = serializerprovider.getConfig();
            flag1 = flag;
            if (flag)
            {
                break label0;
            }
            flag1 = flag;
            if (!javatype.useStaticType())
            {
                break label0;
            }
            if (javatype.isContainerType())
            {
                flag1 = flag;
                if (javatype.getContentType().getRawClass() == java/lang/Object)
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        obj1 = createTypeSerializer(serializationconfig, javatype.getContentType());
        if (obj1 != null)
        {
            flag1 = false;
        }
        jsonserializer = _findContentSerializer(serializerprovider, beandescription.getClassInfo());
        if (!javatype.isMapLikeType()) goto _L2; else goto _L1
_L1:
        MapLikeType mapliketype;
        mapliketype = (MapLikeType)javatype;
        serializerprovider = _findKeySerializer(serializerprovider, beandescription.getClassInfo());
        if (!mapliketype.isTrueMapType()) goto _L4; else goto _L3
_L3:
        serializerprovider = buildMapSerializer(serializationconfig, (MapType)mapliketype, beandescription, flag1, serializerprovider, ((TypeSerializer) (obj1)), jsonserializer);
_L6:
        return serializerprovider;
_L4:
        for (Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            Object obj = (Serializers)iterator.next();
            MapLikeType mapliketype1 = (MapLikeType)javatype;
            obj = ((Serializers) (obj)).findMapLikeSerializer(serializationconfig, mapliketype1, beandescription, serializerprovider, ((TypeSerializer) (obj1)), jsonserializer);
            if (obj != null)
            {
                serializerprovider = ((SerializerProvider) (obj));
                if (!_factoryConfig.hasSerializerModifiers())
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj1 = _factoryConfig.serializerModifiers().iterator();
                javatype = ((JavaType) (obj));
                do
                {
                    serializerprovider = javatype;
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    javatype = ((BeanSerializerModifier)((Iterator) (obj1)).next()).modifyMapLikeSerializer(serializationconfig, mapliketype1, beandescription, javatype);
                } while (true);
            }
        }

        return null;
_L2:
        if (!javatype.isCollectionLikeType())
        {
            break MISSING_BLOCK_LABEL_419;
        }
        serializerprovider = (CollectionLikeType)javatype;
        if (serializerprovider.isTrueCollectionType())
        {
            return buildCollectionSerializer(serializationconfig, (CollectionType)serializerprovider, beandescription, flag1, ((TypeSerializer) (obj1)), jsonserializer);
        }
        CollectionLikeType collectionliketype = (CollectionLikeType)javatype;
        serializerprovider = customSerializers().iterator();
        do
        {
            if (!serializerprovider.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            javatype = ((Serializers)serializerprovider.next()).findCollectionLikeSerializer(serializationconfig, collectionliketype, beandescription, ((TypeSerializer) (obj1)), jsonserializer);
        } while (javatype == null);
        serializerprovider = javatype;
        if (_factoryConfig.hasSerializerModifiers())
        {
            obj1 = _factoryConfig.serializerModifiers().iterator();
            do
            {
                serializerprovider = javatype;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                javatype = ((BeanSerializerModifier)((Iterator) (obj1)).next()).modifyCollectionLikeSerializer(serializationconfig, collectionliketype, beandescription, javatype);
            } while (true);
        }
        if (true) goto _L6; else goto _L5
_L5:
        return null;
        if (javatype.isArrayType())
        {
            return buildArraySerializer(serializationconfig, (ArrayType)javatype, beandescription, flag1, ((TypeSerializer) (obj1)), jsonserializer);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer buildEnumSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
    {
        Object obj;
        Object obj1;
        obj = null;
        obj1 = beandescription.findExpectedFormat(null);
        if (obj1 == null || ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)).getShape() != com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT) goto _L2; else goto _L1
_L1:
        ((BasicBeanDescription)beandescription).removeProperty("declaringClass");
_L4:
        return ((JsonSerializer) (obj));
_L2:
        obj1 = EnumSerializer.construct(javatype.getRawClass(), serializationconfig, beandescription, ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj1)));
        obj = obj1;
        if (!_factoryConfig.hasSerializerModifiers())
        {
            continue;
        }
        Iterator iterator = _factoryConfig.serializerModifiers().iterator();
        do
        {
            obj = obj1;
            if (!iterator.hasNext())
            {
                continue;
            }
            obj1 = ((BeanSerializerModifier)iterator.next()).modifyEnumSerializer(serializationconfig, javatype, beandescription, ((JsonSerializer) (obj1)));
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public JsonSerializer buildEnumSetSerializer(JavaType javatype)
    {
        return new EnumSetSerializer(javatype, null);
    }

    public ContainerSerializer buildIndexedListSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new IndexedListSerializer(javatype, flag, typeserializer, null, jsonserializer);
    }

    protected JsonSerializer buildIterableSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1)
        throws JsonMappingException
    {
        return new IterableSerializer(javatype1, flag, createTypeSerializer(serializationconfig, javatype1), null);
    }

    protected JsonSerializer buildIteratorSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1)
        throws JsonMappingException
    {
        return new IteratorSerializer(javatype1, flag, createTypeSerializer(serializationconfig, javatype1), null);
    }

    protected JsonSerializer buildMapEntrySerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag, JavaType javatype1, JavaType javatype2)
        throws JsonMappingException
    {
        return new MapEntrySerializer(javatype2, javatype1, javatype2, flag, createTypeSerializer(serializationconfig, javatype2), null);
    }

    protected JsonSerializer buildMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, boolean flag, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
        throws JsonMappingException
    {
        Object obj = null;
        Iterator iterator = customSerializers().iterator();
        JsonSerializer jsonserializer2;
        do
        {
            jsonserializer2 = ((JsonSerializer) (obj));
            if (!iterator.hasNext())
            {
                break;
            }
            jsonserializer2 = ((Serializers)iterator.next()).findMapSerializer(serializationconfig, maptype, beandescription, jsonserializer, typeserializer, jsonserializer1);
            obj = jsonserializer2;
        } while (jsonserializer2 == null);
        obj = jsonserializer2;
        if (jsonserializer2 == null)
        {
            obj = findFilterId(serializationconfig, beandescription);
            typeserializer = MapSerializer.construct(serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(beandescription.getClassInfo()), maptype, flag, typeserializer, jsonserializer, jsonserializer1, obj);
            jsonserializer1 = ((JsonSerializer) (findSuppressableContentValue(serializationconfig, maptype.getContentType(), beandescription)));
            jsonserializer = typeserializer;
            if (jsonserializer1 != null)
            {
                jsonserializer = typeserializer.withContentInclusion(jsonserializer1);
            }
            obj = jsonserializer;
        }
        jsonserializer = ((JsonSerializer) (obj));
        if (_factoryConfig.hasSerializerModifiers())
        {
            typeserializer = _factoryConfig.serializerModifiers().iterator();
            do
            {
                jsonserializer = ((JsonSerializer) (obj));
                if (!typeserializer.hasNext())
                {
                    break;
                }
                obj = ((BeanSerializerModifier)typeserializer.next()).modifyMapSerializer(serializationconfig, maptype, beandescription, ((JsonSerializer) (obj)));
            } while (true);
        }
        return jsonserializer;
    }

    public JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype, JsonSerializer jsonserializer)
    {
        JsonSerializer jsonserializer2;
        BeanDescription beandescription1;
label0:
        {
            beandescription1 = serializationconfig.introspectClassAnnotations(javatype.getRawClass());
            jsonserializer2 = null;
            JsonSerializer jsonserializer1 = null;
            if (!_factoryConfig.hasKeySerializers())
            {
                break label0;
            }
            Iterator iterator1 = _factoryConfig.keySerializers().iterator();
            jsonserializer2 = jsonserializer1;
            do
            {
                if (!iterator1.hasNext())
                {
                    break label0;
                }
                jsonserializer1 = ((Serializers)iterator1.next()).findSerializer(serializationconfig, javatype, beandescription1);
                jsonserializer2 = jsonserializer1;
            } while (jsonserializer1 == null);
            jsonserializer2 = jsonserializer1;
        }
        BeanDescription beandescription = beandescription1;
        Object obj = jsonserializer2;
        if (jsonserializer2 == null)
        {
            beandescription = beandescription1;
            obj = jsonserializer;
            if (jsonserializer == null)
            {
                jsonserializer = StdKeySerializers.getStdKeySerializer(serializationconfig, javatype.getRawClass(), false);
                beandescription = beandescription1;
                obj = jsonserializer;
                if (jsonserializer == null)
                {
                    beandescription = serializationconfig.introspect(javatype);
                    obj = beandescription.findJsonValueMethod();
                    Iterator iterator;
                    if (obj != null)
                    {
                        jsonserializer = StdKeySerializers.getStdKeySerializer(serializationconfig, ((AnnotatedMethod) (obj)).getRawReturnType(), true);
                        obj = ((AnnotatedMethod) (obj)).getAnnotated();
                        if (serializationconfig.canOverrideAccessModifiers())
                        {
                            ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (obj)));
                        }
                        obj = new JsonValueSerializer(((java.lang.reflect.Method) (obj)), jsonserializer);
                    } else
                    {
                        obj = StdKeySerializers.getDefault();
                    }
                }
            }
        }
        jsonserializer = ((JsonSerializer) (obj));
        if (_factoryConfig.hasSerializerModifiers())
        {
            iterator = _factoryConfig.serializerModifiers().iterator();
            do
            {
                jsonserializer = ((JsonSerializer) (obj));
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = ((BeanSerializerModifier)iterator.next()).modifyKeySerializer(serializationconfig, javatype, beandescription, ((JsonSerializer) (obj)));
            } while (true);
        }
        return jsonserializer;
    }

    public TypeSerializer createTypeSerializer(SerializationConfig serializationconfig, JavaType javatype)
    {
        com.fasterxml.jackson.databind.introspect.AnnotatedClass annotatedclass = serializationconfig.introspectClassAnnotations(javatype.getRawClass()).getClassInfo();
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findTypeResolver(serializationconfig, annotatedclass, javatype);
        Collection collection = null;
        if (typeresolverbuilder == null)
        {
            typeresolverbuilder = serializationconfig.getDefaultTyper(javatype);
        } else
        {
            collection = serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(annotatedclass, serializationconfig, annotationintrospector);
        }
        if (typeresolverbuilder == null)
        {
            return null;
        } else
        {
            return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, collection);
        }
    }

    protected abstract Iterable customSerializers();

    protected Converter findConverter(SerializerProvider serializerprovider, Annotated annotated)
        throws JsonMappingException
    {
        Object obj = serializerprovider.getAnnotationIntrospector().findSerializationConverter(annotated);
        if (obj == null)
        {
            return null;
        } else
        {
            return serializerprovider.converterInstance(annotated, obj);
        }
    }

    protected JsonSerializer findConvertingSerializer(SerializerProvider serializerprovider, Annotated annotated, JsonSerializer jsonserializer)
        throws JsonMappingException
    {
        annotated = findConverter(serializerprovider, annotated);
        if (annotated == null)
        {
            return jsonserializer;
        } else
        {
            return new StdDelegatingSerializer(annotated, annotated.getOutputType(serializerprovider.getTypeFactory()), jsonserializer);
        }
    }

    protected Object findFilterId(SerializationConfig serializationconfig, BeanDescription beandescription)
    {
        return serializationconfig.getAnnotationIntrospector().findFilterId(beandescription.getClassInfo());
    }

    protected JsonSerializer findOptionalStdSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
        throws JsonMappingException
    {
        return OptionalHandlerFactory.instance.findSerializer(serializerprovider.getConfig(), javatype, beandescription);
    }

    protected final JsonSerializer findSerializerByAddonType(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
        throws JsonMappingException
    {
        Object obj = javatype.getRawClass();
        if (java/util/Iterator.isAssignableFrom(((Class) (obj))))
        {
            obj = serializationconfig.getTypeFactory().findTypeParameters(javatype, java/util/Iterator);
            if (obj == null || obj.length != 1)
            {
                obj = TypeFactory.unknownType();
            } else
            {
                obj = obj[0];
            }
            return buildIteratorSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
        }
        if (java/lang/Iterable.isAssignableFrom(((Class) (obj))))
        {
            obj = serializationconfig.getTypeFactory().findTypeParameters(javatype, java/lang/Iterable);
            if (obj == null || obj.length != 1)
            {
                obj = TypeFactory.unknownType();
            } else
            {
                obj = obj[0];
            }
            return buildIterableSerializer(serializationconfig, javatype, beandescription, flag, ((JavaType) (obj)));
        }
        if (java/lang/CharSequence.isAssignableFrom(((Class) (obj))))
        {
            return ToStringSerializer.instance;
        } else
        {
            return null;
        }
    }

    protected final JsonSerializer findSerializerByAnnotations(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
    {
        if (com/fasterxml/jackson/databind/JsonSerializable.isAssignableFrom(javatype.getRawClass()))
        {
            return SerializableSerializer.instance;
        }
        javatype = beandescription.findJsonValueMethod();
        if (javatype != null)
        {
            beandescription = javatype.getAnnotated();
            if (serializerprovider.canOverrideAccessModifiers())
            {
                ClassUtil.checkAndFixAccess(beandescription);
            }
            return new JsonValueSerializer(beandescription, findSerializerFromAnnotation(serializerprovider, javatype));
        } else
        {
            return null;
        }
    }

    protected final JsonSerializer findSerializerByLookup(JavaType javatype, SerializationConfig serializationconfig, BeanDescription beandescription, boolean flag)
    {
        javatype = javatype.getRawClass().getName();
        serializationconfig = (JsonSerializer)_concrete.get(javatype);
        if (serializationconfig == null)
        {
            javatype = (Class)_concreteLazy.get(javatype);
            if (javatype != null)
            {
                try
                {
                    serializationconfig = (JsonSerializer)javatype.newInstance();
                }
                // Misplaced declaration of an exception variable
                catch (SerializationConfig serializationconfig)
                {
                    throw new IllegalStateException((new StringBuilder()).append("Failed to instantiate standard serializer (of type ").append(javatype.getName()).append("): ").append(serializationconfig.getMessage()).toString(), serializationconfig);
                }
                return serializationconfig;
            }
        }
        return serializationconfig;
    }

    protected final JsonSerializer findSerializerByPrimaryType(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
        throws JsonMappingException
    {
        Object obj;
        obj = javatype.getRawClass();
        JsonSerializer jsonserializer = findOptionalStdSerializer(serializerprovider, javatype, beandescription, flag);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        if (java/util/Calendar.isAssignableFrom(((Class) (obj))))
        {
            return CalendarSerializer.instance;
        }
        if (java/util/Date.isAssignableFrom(((Class) (obj))))
        {
            return DateSerializer.instance;
        }
        if (java/util/Map$Entry.isAssignableFrom(((Class) (obj))))
        {
            Object obj1 = serializerprovider.getTypeFactory().findTypeParameters(javatype, java/util/Map$Entry);
            if (obj1 == null || obj1.length != 2)
            {
                obj1 = TypeFactory.unknownType();
                obj = obj1;
            } else
            {
                obj = obj1[0];
                obj1 = obj1[1];
            }
            return buildMapEntrySerializer(serializerprovider.getConfig(), javatype, beandescription, flag, ((JavaType) (obj)), ((JavaType) (obj1)));
        }
        if (java/nio/ByteBuffer.isAssignableFrom(((Class) (obj))))
        {
            return new ByteBufferSerializer();
        }
        if (java/net/InetAddress.isAssignableFrom(((Class) (obj))))
        {
            return new InetAddressSerializer();
        }
        if (java/net/InetSocketAddress.isAssignableFrom(((Class) (obj))))
        {
            return new InetSocketAddressSerializer();
        }
        if (java/util/TimeZone.isAssignableFrom(((Class) (obj))))
        {
            return new TimeZoneSerializer();
        }
        if (java/nio/charset/Charset.isAssignableFrom(((Class) (obj))))
        {
            return ToStringSerializer.instance;
        }
        if (!java/lang/Number.isAssignableFrom(((Class) (obj)))) goto _L2; else goto _L1
_L1:
        serializerprovider = beandescription.findExpectedFormat(null);
        if (serializerprovider == null) goto _L4; else goto _L3
_L3:
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];
            static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[com.fasterxml.jackson.annotation.JsonInclude.Include.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape = new int[com.fasterxml.jackson.annotation.JsonFormat.Shape.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.STRING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonFormat.Shape[serializerprovider.getShape().ordinal()];
        JVM INSTR tableswitch 1 3: default 276
    //                   1 280
    //                   2 284
    //                   3 284;
           goto _L4 _L5 _L6 _L6
_L4:
        return NumberSerializer.instance;
_L5:
        return ToStringSerializer.instance;
_L6:
        return null;
_L2:
        if (java/lang/Enum.isAssignableFrom(((Class) (obj))))
        {
            return buildEnumSerializer(serializerprovider.getConfig(), javatype, beandescription);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer findSerializerFromAnnotation(SerializerProvider serializerprovider, Annotated annotated)
        throws JsonMappingException
    {
        Object obj = serializerprovider.getAnnotationIntrospector().findSerializer(annotated);
        if (obj == null)
        {
            return null;
        } else
        {
            return findConvertingSerializer(serializerprovider, annotated, serializerprovider.serializerInstance(annotated, obj));
        }
    }

    protected Object findSuppressableContentValue(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
        throws JsonMappingException
    {
        serializationconfig = null;
        javatype = beandescription.findSerializationInclusionForContent(null);
        if (javatype == null) goto _L2; else goto _L1
_L1:
        _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[javatype.ordinal()];
        JVM INSTR tableswitch 1 1: default 40
    //                   1 44;
           goto _L3 _L4
_L3:
        serializationconfig = javatype;
_L2:
        return serializationconfig;
_L4:
        serializationconfig = com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY;
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected boolean isIndexedList(Class class1)
    {
        return java/util/RandomAccess.isAssignableFrom(class1);
    }

    protected JavaType modifyTypeByAnnotation(SerializationConfig serializationconfig, Annotated annotated, JavaType javatype)
    {
        Class class1 = serializationconfig.getAnnotationIntrospector().findSerializationType(annotated);
        JavaType javatype1 = javatype;
        if (class1 != null)
        {
            try
            {
                javatype1 = javatype.widenBy(class1);
            }
            // Misplaced declaration of an exception variable
            catch (SerializationConfig serializationconfig)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Failed to widen type ").append(javatype).append(" with concrete-type annotation (value ").append(class1.getName()).append("), method '").append(annotated.getName()).append("': ").append(serializationconfig.getMessage()).toString());
            }
        }
        return modifySecondaryTypesByAnnotation(serializationconfig, annotated, javatype1);
    }

    protected boolean usesStaticTyping(SerializationConfig serializationconfig, BeanDescription beandescription, TypeSerializer typeserializer)
    {
        if (typeserializer == null)
        {
            beandescription = serializationconfig.getAnnotationIntrospector().findSerializationTyping(beandescription.getClassInfo());
            if (beandescription != null && beandescription != com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DEFAULT_TYPING)
            {
                if (beandescription == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
                {
                    return true;
                }
            } else
            {
                return serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING);
            }
        }
        return false;
    }

    static 
    {
        _concrete = new HashMap();
        _concreteLazy = new HashMap();
        _concrete.put(java/lang/String.getName(), new StringSerializer());
        Object obj = ToStringSerializer.instance;
        _concrete.put(java/lang/StringBuffer.getName(), obj);
        _concrete.put(java/lang/StringBuilder.getName(), obj);
        _concrete.put(java/lang/Character.getName(), obj);
        _concrete.put(Character.TYPE.getName(), obj);
        NumberSerializers.addAll(_concrete);
        _concrete.put(Boolean.TYPE.getName(), new BooleanSerializer(true));
        _concrete.put(java/lang/Boolean.getName(), new BooleanSerializer(false));
        _concrete.put(java/math/BigInteger.getName(), new NumberSerializer(java/math/BigInteger));
        _concrete.put(java/math/BigDecimal.getName(), new NumberSerializer(java/math/BigDecimal));
        _concrete.put(java/util/Calendar.getName(), CalendarSerializer.instance);
        obj = DateSerializer.instance;
        _concrete.put(java/util/Date.getName(), obj);
        _concrete.put(java/sql/Timestamp.getName(), obj);
        _concreteLazy.put(java/sql/Date.getName(), com/fasterxml/jackson/databind/ser/std/SqlDateSerializer);
        _concreteLazy.put(java/sql/Time.getName(), com/fasterxml/jackson/databind/ser/std/SqlTimeSerializer);
        for (Iterator iterator = StdJdkSerializers.all().iterator(); iterator.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            Object obj1 = entry.getValue();
            if (obj1 instanceof JsonSerializer)
            {
                _concrete.put(((Class)entry.getKey()).getName(), (JsonSerializer)obj1);
            } else
            if (obj1 instanceof Class)
            {
                obj1 = (Class)obj1;
                _concreteLazy.put(((Class)entry.getKey()).getName(), obj1);
            } else
            {
                throw new IllegalStateException((new StringBuilder()).append("Internal error: unrecognized value of type ").append(entry.getClass().getName()).toString());
            }
        }

        _concreteLazy.put(com/fasterxml/jackson/databind/util/TokenBuffer.getName(), com/fasterxml/jackson/databind/ser/std/TokenBufferSerializer);
    }
}
