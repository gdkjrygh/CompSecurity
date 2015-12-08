// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
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
                    throw new IllegalArgumentException((new StringBuilder("Illegal key-type annotation: type ")).append(javatype).append(" is not a Map type").toString());
                }
                try
                {
                    serializationconfig = ((MapType)javatype).widenKey(((Class) (obj)));
                }
                // Misplaced declaration of an exception variable
                catch (SerializationConfig serializationconfig)
                {
                    throw new IllegalArgumentException((new StringBuilder("Failed to narrow key type ")).append(javatype).append(" with key-type annotation (").append(((Class) (obj)).getName()).append("): ").append(serializationconfig.getMessage()).toString());
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
                    throw new IllegalArgumentException((new StringBuilder("Failed to narrow content type ")).append(serializationconfig).append(" with content-type annotation (").append(annotated.getName()).append("): ").append(javatype.getMessage()).toString());
                }
            }
        }
        return ((JavaType) (obj));
    }

    protected JsonSerializer _findContentSerializer(SerializerProvider serializerprovider, Annotated annotated)
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
        if (_factoryConfig.hasSerializerModifiers())
        {
            obj1 = _factoryConfig.serializerModifiers().iterator();
            typeserializer = ((TypeSerializer) (obj));
            do
            {
                jsonserializer = typeserializer;
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                typeserializer = ((BeanSerializerModifier)((Iterator) (obj1)).next()).modifyArraySerializer(serializationconfig, arraytype, beandescription, typeserializer);
            } while (true);
        } else
        {
            jsonserializer = ((JsonSerializer) (obj));
        }
        return jsonserializer;
    }

    protected JsonSerializer buildCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        Object obj;
        Object obj1;
        JsonSerializer jsonserializer2;
        obj1 = null;
        Iterator iterator1 = customSerializers().iterator();
        jsonserializer2 = null;
        do
        {
            if (!iterator1.hasNext())
            {
                break;
            }
            JsonSerializer jsonserializer1 = ((Serializers)iterator1.next()).findCollectionSerializer(serializationconfig, collectiontype, beandescription, typeserializer, jsonserializer);
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
        obj = beandescription.findExpectedFormat(null);
        if (obj != null && ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).getShape() == com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT)
        {
            return null;
        }
        obj = collectiontype.getRawClass();
        if (!java/util/EnumSet.isAssignableFrom(((Class) (obj)))) goto _L4; else goto _L3
_L3:
        typeserializer = collectiontype.getContentType();
        if (!typeserializer.isEnumType())
        {
            typeserializer = obj1;
        }
        obj = buildEnumSetSerializer(typeserializer);
_L2:
        Object obj2;
        Class class1;
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator = _factoryConfig.serializerModifiers().iterator();
            typeserializer = ((TypeSerializer) (obj));
            do
            {
                jsonserializer = typeserializer;
                if (!iterator.hasNext())
                {
                    break;
                }
                typeserializer = ((BeanSerializerModifier)iterator.next()).modifyCollectionSerializer(serializationconfig, collectiontype, beandescription, typeserializer);
            } while (true);
        } else
        {
            jsonserializer = ((JsonSerializer) (obj));
        }
        break MISSING_BLOCK_LABEL_340;
_L4:
        class1 = collectiontype.getContentType().getRawClass();
        if (!isIndexedList(((Class) (obj)))) goto _L6; else goto _L5
_L5:
        if (class1 == java/lang/String)
        {
label0:
            {
                if (jsonserializer != null)
                {
                    obj2 = jsonserializer2;
                    if (!ClassUtil.isJacksonStdImpl(jsonserializer))
                    {
                        break label0;
                    }
                }
                obj2 = IndexedStringListSerializer.instance;
            }
        } else
        {
            obj2 = buildIndexedListSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer);
        }
_L8:
        obj = obj2;
        if (obj2 == null)
        {
            obj = buildCollectionSerializer(collectiontype.getContentType(), flag, typeserializer, jsonserializer);
        }
          goto _L2
_L6:
        obj2 = jsonserializer2;
        if (class1 != java/lang/String) goto _L8; else goto _L7
_L7:
        if (jsonserializer == null) goto _L10; else goto _L9
_L9:
        obj2 = jsonserializer2;
        if (!ClassUtil.isJacksonStdImpl(jsonserializer)) goto _L8; else goto _L10
_L10:
        obj2 = StringCollectionSerializer.instance;
          goto _L8
        return jsonserializer;
    }

    public ContainerSerializer buildCollectionSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new CollectionSerializer(javatype, flag, typeserializer, null, jsonserializer);
    }

    protected JsonSerializer buildContainerSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        SerializationConfig serializationconfig;
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
        Object obj = createTypeSerializer(serializationconfig, javatype.getContentType());
        JsonSerializer jsonserializer;
        Object obj1;
        JsonSerializer jsonserializer1;
        Iterator iterator;
        if (obj != null)
        {
            flag = false;
        } else
        {
            flag = flag1;
        }
        jsonserializer = _findContentSerializer(serializerprovider, beandescription.getClassInfo());
        if (!javatype.isMapLikeType()) goto _L2; else goto _L1
_L1:
        obj1 = (MapLikeType)javatype;
        jsonserializer1 = _findKeySerializer(serializerprovider, beandescription.getClassInfo());
        if (!((MapLikeType) (obj1)).isTrueMapType()) goto _L4; else goto _L3
_L3:
        serializerprovider = buildMapSerializer(serializationconfig, (MapType)obj1, beandescription, flag, jsonserializer1, ((TypeSerializer) (obj)), jsonserializer);
_L6:
        return serializerprovider;
_L4:
        for (iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            serializerprovider = (Serializers)iterator.next();
            obj1 = (MapLikeType)javatype;
            serializerprovider = serializerprovider.findMapLikeSerializer(serializationconfig, ((MapLikeType) (obj1)), beandescription, jsonserializer1, ((TypeSerializer) (obj)), jsonserializer);
            if (serializerprovider != null)
            {
                javatype = serializerprovider;
                if (!_factoryConfig.hasSerializerModifiers())
                {
                    break MISSING_BLOCK_LABEL_445;
                }
                obj = _factoryConfig.serializerModifiers().iterator();
                javatype = serializerprovider;
                do
                {
                    serializerprovider = javatype;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue; /* Loop/switch isn't completed */
                    }
                    javatype = ((BeanSerializerModifier)((Iterator) (obj)).next()).modifyMapLikeSerializer(serializationconfig, ((MapLikeType) (obj1)), beandescription, javatype);
                } while (true);
            }
        }

        return null;
_L2:
        if (!javatype.isCollectionLikeType())
        {
            break MISSING_BLOCK_LABEL_418;
        }
        serializerprovider = (CollectionLikeType)javatype;
        if (serializerprovider.isTrueCollectionType())
        {
            return buildCollectionSerializer(serializationconfig, (CollectionType)serializerprovider, beandescription, flag, ((TypeSerializer) (obj)), jsonserializer);
        }
        obj1 = (CollectionLikeType)javatype;
        javatype = customSerializers().iterator();
        do
        {
            if (!javatype.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            serializerprovider = ((Serializers)javatype.next()).findCollectionLikeSerializer(serializationconfig, ((CollectionLikeType) (obj1)), beandescription, ((TypeSerializer) (obj)), jsonserializer);
        } while (serializerprovider == null);
        javatype = serializerprovider;
        if (!_factoryConfig.hasSerializerModifiers())
        {
            break MISSING_BLOCK_LABEL_445;
        }
        obj = _factoryConfig.serializerModifiers().iterator();
        javatype = serializerprovider;
        do
        {
            serializerprovider = javatype;
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            javatype = ((BeanSerializerModifier)((Iterator) (obj)).next()).modifyCollectionLikeSerializer(serializationconfig, ((CollectionLikeType) (obj1)), beandescription, javatype);
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
        return null;
        if (javatype.isArrayType())
        {
            return buildArraySerializer(serializationconfig, (ArrayType)javatype, beandescription, flag, ((TypeSerializer) (obj)), jsonserializer);
        } else
        {
            return null;
        }
        return javatype;
    }

    protected JsonSerializer buildEnumSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription)
    {
        Object obj;
        Object obj1;
        obj1 = null;
        obj = beandescription.findExpectedFormat(null);
        if (obj == null || ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).getShape() != com.fasterxml.jackson.annotation.JsonFormat.Shape.OBJECT) goto _L2; else goto _L1
_L1:
        ((BasicBeanDescription)beandescription).removeProperty("declaringClass");
_L4:
        return ((JsonSerializer) (obj1));
_L2:
label0:
        {
            obj = EnumSerializer.construct(javatype.getRawClass(), serializationconfig, beandescription, ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)));
            if (!_factoryConfig.hasSerializerModifiers())
            {
                break label0;
            }
            Iterator iterator = _factoryConfig.serializerModifiers().iterator();
            do
            {
                obj1 = obj;
                if (!iterator.hasNext())
                {
                    break;
                }
                obj = ((BeanSerializerModifier)iterator.next()).modifyEnumSerializer(serializationconfig, javatype, beandescription, ((JsonSerializer) (obj)));
            } while (true);
        }
        if (true) goto _L4; else goto _L3
_L3:
        return ((JsonSerializer) (obj));
    }

    public JsonSerializer buildEnumSetSerializer(JavaType javatype)
    {
        return new EnumSetSerializer(javatype, null);
    }

    public ContainerSerializer buildIndexedListSerializer(JavaType javatype, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        return new IndexedListSerializer(javatype, flag, typeserializer, null, jsonserializer);
    }

    protected JsonSerializer buildIterableSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        beandescription = javatype.containedType(0);
        javatype = beandescription;
        if (beandescription == null)
        {
            javatype = TypeFactory.unknownType();
        }
        return new IterableSerializer(javatype, flag, createTypeSerializer(serializationconfig, javatype), null);
    }

    protected JsonSerializer buildIteratorSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        beandescription = javatype.containedType(0);
        javatype = beandescription;
        if (beandescription == null)
        {
            javatype = TypeFactory.unknownType();
        }
        return new IteratorSerializer(javatype, flag, createTypeSerializer(serializationconfig, javatype), null);
    }

    protected JsonSerializer buildMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, boolean flag, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
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
            obj = MapSerializer.construct(serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(beandescription.getClassInfo()), maptype, flag, typeserializer, jsonserializer, jsonserializer1, obj);
        }
        if (_factoryConfig.hasSerializerModifiers())
        {
            jsonserializer1 = _factoryConfig.serializerModifiers().iterator();
            jsonserializer = ((JsonSerializer) (obj));
            do
            {
                typeserializer = jsonserializer;
                if (!jsonserializer1.hasNext())
                {
                    break;
                }
                jsonserializer = ((BeanSerializerModifier)jsonserializer1.next()).modifyMapSerializer(serializationconfig, maptype, beandescription, jsonserializer);
            } while (true);
        } else
        {
            typeserializer = ((TypeSerializer) (obj));
        }
        return typeserializer;
    }

    public JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype, JsonSerializer jsonserializer)
    {
        JsonSerializer jsonserializer1;
        BeanDescription beandescription;
label0:
        {
            beandescription = serializationconfig.introspectClassAnnotations(javatype.getRawClass());
            jsonserializer1 = null;
            JsonSerializer jsonserializer2 = null;
            if (!_factoryConfig.hasKeySerializers())
            {
                break label0;
            }
            Iterator iterator1 = _factoryConfig.keySerializers().iterator();
            jsonserializer1 = jsonserializer2;
            do
            {
                if (!iterator1.hasNext())
                {
                    break label0;
                }
                jsonserializer2 = ((Serializers)iterator1.next()).findSerializer(serializationconfig, javatype, beandescription);
                jsonserializer1 = jsonserializer2;
            } while (jsonserializer2 == null);
            jsonserializer1 = jsonserializer2;
        }
        if (jsonserializer1 == null)
        {
            jsonserializer1 = jsonserializer;
            if (jsonserializer == null)
            {
                jsonserializer1 = StdKeySerializers.getStdKeySerializer(javatype);
            }
        }
        jsonserializer = jsonserializer1;
        if (_factoryConfig.hasSerializerModifiers())
        {
            Iterator iterator = _factoryConfig.serializerModifiers().iterator();
            do
            {
                jsonserializer = jsonserializer1;
                if (!iterator.hasNext())
                {
                    break;
                }
                jsonserializer1 = ((BeanSerializerModifier)iterator.next()).modifyKeySerializer(serializationconfig, javatype, beandescription, jsonserializer1);
            } while (true);
        }
        return jsonserializer;
    }

    public TypeSerializer createTypeSerializer(SerializationConfig serializationconfig, JavaType javatype)
    {
        Object obj = serializationconfig.introspectClassAnnotations(javatype.getRawClass()).getClassInfo();
        AnnotationIntrospector annotationintrospector = serializationconfig.getAnnotationIntrospector();
        TypeResolverBuilder typeresolverbuilder = annotationintrospector.findTypeResolver(serializationconfig, ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj)), javatype);
        if (typeresolverbuilder == null)
        {
            typeresolverbuilder = serializationconfig.getDefaultTyper(javatype);
            obj = null;
        } else
        {
            obj = serializationconfig.getSubtypeResolver().collectAndResolveSubtypes(((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj)), serializationconfig, annotationintrospector);
        }
        if (typeresolverbuilder == null)
        {
            return null;
        } else
        {
            return typeresolverbuilder.buildTypeSerializer(serializationconfig, javatype, ((Collection) (obj)));
        }
    }

    protected abstract Iterable customSerializers();

    protected Converter findConverter(SerializerProvider serializerprovider, Annotated annotated)
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
    {
        return OptionalHandlerFactory.instance.findSerializer(serializerprovider.getConfig(), javatype, beandescription);
    }

    protected final JsonSerializer findSerializerByAddonType(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        Class class1 = javatype.getRawClass();
        if (java/util/Iterator.isAssignableFrom(class1))
        {
            return buildIteratorSerializer(serializationconfig, javatype, beandescription, flag);
        }
        if (java/lang/Iterable.isAssignableFrom(class1))
        {
            return buildIterableSerializer(serializationconfig, javatype, beandescription, flag);
        }
        if (java/lang/CharSequence.isAssignableFrom(class1))
        {
            return ToStringSerializer.instance;
        } else
        {
            return null;
        }
    }

    protected final JsonSerializer findSerializerByAnnotations(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription)
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
        beandescription = javatype.getRawClass().getName();
        serializationconfig = (JsonSerializer)_concrete.get(beandescription);
        javatype = serializationconfig;
        if (serializationconfig == null)
        {
            beandescription = (Class)_concreteLazy.get(beandescription);
            javatype = serializationconfig;
            if (beandescription != null)
            {
                try
                {
                    javatype = (JsonSerializer)beandescription.newInstance();
                }
                // Misplaced declaration of an exception variable
                catch (JavaType javatype)
                {
                    throw new IllegalStateException((new StringBuilder("Failed to instantiate standard serializer (of type ")).append(beandescription.getName()).append("): ").append(javatype.getMessage()).toString(), javatype);
                }
            }
        }
        return javatype;
    }

    protected final JsonSerializer findSerializerByPrimaryType(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        Class class1;
        class1 = javatype.getRawClass();
        JsonSerializer jsonserializer = findOptionalStdSerializer(serializerprovider, javatype, beandescription, flag);
        if (jsonserializer != null)
        {
            return jsonserializer;
        }
        if (java/util/Calendar.isAssignableFrom(class1))
        {
            return CalendarSerializer.instance;
        }
        if (java/util/Date.isAssignableFrom(class1))
        {
            return DateSerializer.instance;
        }
        if (java/nio/ByteBuffer.isAssignableFrom(class1))
        {
            return new ByteBufferSerializer();
        }
        if (java/net/InetAddress.isAssignableFrom(class1))
        {
            return new InetAddressSerializer();
        }
        if (java/net/InetSocketAddress.isAssignableFrom(class1))
        {
            return new InetSocketAddressSerializer();
        }
        if (java/util/TimeZone.isAssignableFrom(class1))
        {
            return new TimeZoneSerializer();
        }
        if (java/nio/charset/Charset.isAssignableFrom(class1))
        {
            return ToStringSerializer.instance;
        }
        if (!java/lang/Number.isAssignableFrom(class1)) goto _L2; else goto _L1
_L1:
        serializerprovider = beandescription.findExpectedFormat(null);
        if (serializerprovider == null) goto _L4; else goto _L3
_L3:
        class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonFormat$Shape[];

            static 
            {
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
        JVM INSTR tableswitch 1 3: default 204
    //                   1 208
    //                   2 212
    //                   3 212;
           goto _L4 _L5 _L6 _L6
_L4:
        return NumberSerializer.instance;
_L5:
        return ToStringSerializer.instance;
_L6:
        return null;
_L2:
        if (java/lang/Enum.isAssignableFrom(class1))
        {
            return buildEnumSerializer(serializerprovider.getConfig(), javatype, beandescription);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer findSerializerFromAnnotation(SerializerProvider serializerprovider, Annotated annotated)
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
                throw new IllegalArgumentException((new StringBuilder("Failed to widen type ")).append(javatype).append(" with concrete-type annotation (value ").append(class1.getName()).append("), method '").append(annotated.getName()).append("': ").append(serializationconfig.getMessage()).toString());
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
        obj = NumberSerializer.instance;
        _concrete.put(java/math/BigInteger.getName(), obj);
        _concrete.put(java/math/BigDecimal.getName(), obj);
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
                throw new IllegalStateException((new StringBuilder("Internal error: unrecognized value of type ")).append(entry.getClass().getName()).toString());
            }
        }

        _concreteLazy.put(com/fasterxml/jackson/databind/util/TokenBuffer.getName(), com/fasterxml/jackson/databind/ser/std/TokenBufferSerializer);
    }
}
