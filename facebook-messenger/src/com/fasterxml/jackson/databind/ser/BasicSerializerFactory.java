// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonSerializable;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.NoClass;
import com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig;
import com.fasterxml.jackson.databind.ext.OptionalHandlerFactory;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer;
import com.fasterxml.jackson.databind.ser.impl.StringArraySerializer;
import com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer;
import com.fasterxml.jackson.databind.ser.std.BooleanSerializer;
import com.fasterxml.jackson.databind.ser.std.CalendarSerializer;
import com.fasterxml.jackson.databind.ser.std.DateSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumMapSerializer;
import com.fasterxml.jackson.databind.ser.std.EnumSerializer;
import com.fasterxml.jackson.databind.ser.std.InetAddressSerializer;
import com.fasterxml.jackson.databind.ser.std.JsonValueSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;
import com.fasterxml.jackson.databind.ser.std.NullSerializer;
import com.fasterxml.jackson.databind.ser.std.NumberSerializers;
import com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer;
import com.fasterxml.jackson.databind.ser.std.SerializableSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlDateSerializer;
import com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer;
import com.fasterxml.jackson.databind.ser.std.StdArraySerializers;
import com.fasterxml.jackson.databind.ser.std.StdContainerSerializers;
import com.fasterxml.jackson.databind.ser.std.StdJdkSerializers;
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
import com.fasterxml.jackson.databind.util.EnumValues;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.InetAddress;
import java.nio.charset.Charset;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Collection;
import java.util.Date;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            SerializerFactory, Serializers, BeanSerializerModifier

public abstract class BasicSerializerFactory extends SerializerFactory
{

    protected static final HashMap _concrete;
    protected static final HashMap _concreteLazy;
    protected final SerializerFactoryConfig _factoryConfig;
    protected OptionalHandlerFactory optionalHandlers;

    protected BasicSerializerFactory(SerializerFactoryConfig serializerfactoryconfig)
    {
        optionalHandlers = OptionalHandlerFactory.instance;
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

    protected JsonSerializer _findContentSerializer(SerializerProvider serializerprovider, Annotated annotated, BeanProperty beanproperty)
    {
        AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
        if (beanproperty != null)
        {
            beanproperty = beanproperty.getMember();
            if (beanproperty != null)
            {
                Object obj = annotationintrospector.findContentSerializer(beanproperty);
                if (obj != null)
                {
                    return serializerprovider.serializerInstance(beanproperty, obj);
                }
            }
        }
        beanproperty = ((BeanProperty) (annotationintrospector.findContentSerializer(annotated)));
        if (beanproperty != null)
        {
            return serializerprovider.serializerInstance(annotated, beanproperty);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer _findKeySerializer(SerializerProvider serializerprovider, Annotated annotated, BeanProperty beanproperty)
    {
        AnnotationIntrospector annotationintrospector = serializerprovider.getAnnotationIntrospector();
        if (beanproperty != null)
        {
            beanproperty = beanproperty.getMember();
            if (beanproperty != null)
            {
                Object obj = annotationintrospector.findKeySerializer(beanproperty);
                if (obj != null)
                {
                    return serializerprovider.serializerInstance(beanproperty, obj);
                }
            }
        }
        beanproperty = ((BeanProperty) (annotationintrospector.findKeySerializer(annotated)));
        if (beanproperty != null)
        {
            return serializerprovider.serializerInstance(annotated, beanproperty);
        } else
        {
            return null;
        }
    }

    protected Class _verifyAsClass(Object obj, String s, Class class1)
    {
        if (obj != null) goto _L2; else goto _L1
_L1:
        obj = null;
_L4:
        return ((Class) (obj));
_L2:
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder()).append("AnnotationIntrospector.").append(s).append("() returned value of type ").append(obj.getClass().getName()).append(": expected type JsonSerializer or Class<JsonSerializer> instead").toString());
        }
        s = (Class)obj;
        if (s == class1)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s;
        if (s != com/fasterxml/jackson/databind/annotation/NoClass) goto _L4; else goto _L3
_L3:
        return null;
    }

    protected JsonSerializer buildArraySerializer(SerializationConfig serializationconfig, ArrayType arraytype, BeanDescription beandescription, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        serializationconfig = arraytype.getRawClass();
        if (jsonserializer != null && !ClassUtil.isJacksonStdImpl(jsonserializer)) goto _L2; else goto _L1
_L1:
        if ([Ljava/lang/String; != serializationconfig) goto _L4; else goto _L3
_L3:
        serializationconfig = StringArraySerializer.instance;
_L5:
        return serializationconfig;
_L4:
        beandescription = StdArraySerializers.findStandardImpl(serializationconfig);
        serializationconfig = beandescription;
        if (beandescription != null) goto _L5; else goto _L2
_L2:
        return new ObjectArraySerializer(arraytype.getContentType(), flag, typeserializer, jsonserializer);
    }

    protected JsonSerializer buildCollectionSerializer(SerializationConfig serializationconfig, CollectionType collectiontype, BeanDescription beandescription, BeanProperty beanproperty, boolean flag, TypeSerializer typeserializer, JsonSerializer jsonserializer)
    {
        for (Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            JsonSerializer jsonserializer1 = ((Serializers)iterator.next()).findCollectionSerializer(serializationconfig, collectiontype, beandescription, typeserializer, jsonserializer);
            if (jsonserializer1 != null)
            {
                return jsonserializer1;
            }
        }

        serializationconfig = collectiontype.getRawClass();
        if (java/util/EnumSet.isAssignableFrom(serializationconfig))
        {
            collectiontype = collectiontype.getContentType();
            serializationconfig = collectiontype;
            if (!collectiontype.isEnumType())
            {
                serializationconfig = null;
            }
            return StdContainerSerializers.enumSetSerializer(serializationconfig);
        }
        beandescription = collectiontype.getContentType().getRawClass();
        if (isIndexedList(serializationconfig))
        {
            if (beandescription == java/lang/String && (jsonserializer == null || ClassUtil.isJacksonStdImpl(jsonserializer)))
            {
                return IndexedStringListSerializer.instance;
            } else
            {
                return StdContainerSerializers.indexedListSerializer(collectiontype.getContentType(), flag, typeserializer, beanproperty, jsonserializer);
            }
        }
        if (beandescription == java/lang/String && (jsonserializer == null || ClassUtil.isJacksonStdImpl(jsonserializer)))
        {
            return StringCollectionSerializer.instance;
        } else
        {
            return StdContainerSerializers.collectionSerializer(collectiontype.getContentType(), flag, typeserializer, beanproperty, jsonserializer);
        }
    }

    protected JsonSerializer buildContainerSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, BeanProperty beanproperty, boolean flag)
    {
        SerializationConfig serializationconfig = serializerprovider.getConfig();
        TypeSerializer typeserializer = createTypeSerializer(serializationconfig, javatype.getContentType());
        if (typeserializer != null)
        {
            flag = false;
        }
        JsonSerializer jsonserializer = _findContentSerializer(serializerprovider, beandescription.getClassInfo(), beanproperty);
        if (javatype.isMapLikeType())
        {
            MapLikeType mapliketype = (MapLikeType)javatype;
            serializerprovider = _findKeySerializer(serializerprovider, beandescription.getClassInfo(), beanproperty);
            if (mapliketype.isTrueMapType())
            {
                return buildMapSerializer(serializationconfig, (MapType)mapliketype, beandescription, flag, serializerprovider, typeserializer, jsonserializer);
            }
            for (beanproperty = customSerializers().iterator(); beanproperty.hasNext();)
            {
                JsonSerializer jsonserializer1 = ((Serializers)beanproperty.next()).findMapLikeSerializer(serializationconfig, (MapLikeType)javatype, beandescription, serializerprovider, typeserializer, jsonserializer);
                if (jsonserializer1 != null)
                {
                    return jsonserializer1;
                }
            }

            return null;
        }
        if (javatype.isCollectionLikeType())
        {
            serializerprovider = (CollectionLikeType)javatype;
            if (serializerprovider.isTrueCollectionType())
            {
                return buildCollectionSerializer(serializationconfig, (CollectionType)serializerprovider, beandescription, beanproperty, flag, typeserializer, jsonserializer);
            }
            for (serializerprovider = customSerializers().iterator(); serializerprovider.hasNext();)
            {
                beanproperty = ((Serializers)serializerprovider.next()).findCollectionLikeSerializer(serializationconfig, (CollectionLikeType)javatype, beandescription, typeserializer, jsonserializer);
                if (beanproperty != null)
                {
                    return beanproperty;
                }
            }

            return null;
        } else
        if (javatype.isArrayType())
        {
            return buildArraySerializer(serializationconfig, (ArrayType)javatype, beandescription, flag, typeserializer, jsonserializer);
        } else
        {
            return null;
        }
    }

    protected JsonSerializer buildIterableSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        Object obj = javatype.containedType(0);
        javatype = ((JavaType) (obj));
        if (obj == null)
        {
            javatype = TypeFactory.unknownType();
        }
        obj = createTypeSerializer(serializationconfig, javatype);
        return StdContainerSerializers.iterableSerializer(javatype, usesStaticTyping(serializationconfig, beandescription, ((TypeSerializer) (obj)), null), ((TypeSerializer) (obj)));
    }

    protected JsonSerializer buildIteratorSerializer(SerializationConfig serializationconfig, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        Object obj = javatype.containedType(0);
        javatype = ((JavaType) (obj));
        if (obj == null)
        {
            javatype = TypeFactory.unknownType();
        }
        obj = createTypeSerializer(serializationconfig, javatype);
        return StdContainerSerializers.iteratorSerializer(javatype, usesStaticTyping(serializationconfig, beandescription, ((TypeSerializer) (obj)), null), ((TypeSerializer) (obj)));
    }

    protected JsonSerializer buildMapSerializer(SerializationConfig serializationconfig, MapType maptype, BeanDescription beandescription, boolean flag, JsonSerializer jsonserializer, TypeSerializer typeserializer, JsonSerializer jsonserializer1)
    {
        for (Iterator iterator = customSerializers().iterator(); iterator.hasNext();)
        {
            JsonSerializer jsonserializer2 = ((Serializers)iterator.next()).findMapSerializer(serializationconfig, maptype, beandescription, jsonserializer, typeserializer, jsonserializer1);
            if (jsonserializer2 != null)
            {
                return jsonserializer2;
            }
        }

        if (java/util/EnumMap.isAssignableFrom(maptype.getRawClass()))
        {
            jsonserializer = maptype.getKeyType();
            beandescription = null;
            if (jsonserializer.isEnumType())
            {
                beandescription = EnumValues.construct(jsonserializer.getRawClass(), serializationconfig.getAnnotationIntrospector());
            }
            return new EnumMapSerializer(maptype.getContentType(), flag, beandescription, typeserializer, jsonserializer1);
        } else
        {
            return MapSerializer.construct(serializationconfig.getAnnotationIntrospector().findPropertiesToIgnore(beandescription.getClassInfo()), maptype, flag, typeserializer, jsonserializer, jsonserializer1);
        }
    }

    public JsonSerializer createKeySerializer(SerializationConfig serializationconfig, JavaType javatype)
    {
        JsonSerializer jsonserializer;
        JsonSerializer jsonserializer1;
        jsonserializer = null;
        jsonserializer1 = null;
        if (_factoryConfig.hasKeySerializers()) goto _L2; else goto _L1
_L1:
        jsonserializer = jsonserializer1;
_L4:
        return jsonserializer;
_L2:
        BeanDescription beandescription = serializationconfig.introspectClassAnnotations(javatype.getRawClass());
        Iterator iterator = _factoryConfig.keySerializers().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                continue; /* Loop/switch isn't completed */
            }
            jsonserializer1 = ((Serializers)iterator.next()).findSerializer(serializationconfig, javatype, beandescription);
            jsonserializer = jsonserializer1;
        } while (jsonserializer1 == null);
        break; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
        return jsonserializer1;
    }

    public abstract JsonSerializer createSerializer(SerializerProvider serializerprovider, JavaType javatype, BeanProperty beanproperty);

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
        javatype = javatype.getRawClass().getName();
        serializationconfig = (JsonSerializer)_concrete.get(javatype);
        if (serializationconfig != null)
        {
            return serializationconfig;
        }
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
        } else
        {
            return null;
        }
    }

    protected final JsonSerializer findSerializerByPrimaryType(SerializerProvider serializerprovider, JavaType javatype, BeanDescription beandescription, boolean flag)
    {
        Class class1 = javatype.getRawClass();
        if (java/net/InetAddress.isAssignableFrom(class1))
        {
            javatype = InetAddressSerializer.instance;
        } else
        {
            if (java/util/TimeZone.isAssignableFrom(class1))
            {
                return TimeZoneSerializer.instance;
            }
            if (java/nio/charset/Charset.isAssignableFrom(class1))
            {
                return ToStringSerializer.instance;
            }
            JsonSerializer jsonserializer = optionalHandlers.findSerializer(serializerprovider.getConfig(), javatype);
            javatype = jsonserializer;
            if (jsonserializer == null)
            {
                if (java/lang/Number.isAssignableFrom(class1))
                {
                    return com.fasterxml.jackson.databind.ser.std.NumberSerializers.NumberSerializer.instance;
                }
                if (java/lang/Enum.isAssignableFrom(class1))
                {
                    return EnumSerializer.construct(class1, serializerprovider.getConfig(), beandescription);
                }
                if (java/util/Calendar.isAssignableFrom(class1))
                {
                    return CalendarSerializer.instance;
                }
                if (java/util/Date.isAssignableFrom(class1))
                {
                    return DateSerializer.instance;
                } else
                {
                    return null;
                }
            }
        }
        return javatype;
    }

    protected JsonSerializer findSerializerFromAnnotation(SerializerProvider serializerprovider, Annotated annotated)
    {
        Object obj = serializerprovider.getAnnotationIntrospector().findSerializer(annotated);
        if (obj == null)
        {
            return null;
        } else
        {
            return serializerprovider.serializerInstance(annotated, obj);
        }
    }

    public final JsonSerializer getNullSerializer()
    {
        return NullSerializer.instance;
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

    protected boolean usesStaticTyping(SerializationConfig serializationconfig, BeanDescription beandescription, TypeSerializer typeserializer, BeanProperty beanproperty)
    {
        if (typeserializer == null)
        {
            typeserializer = serializationconfig.getAnnotationIntrospector();
            beandescription = typeserializer.findSerializationTyping(beandescription.getClassInfo());
            if (beandescription != null)
            {
                if (beandescription == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
                {
                    return true;
                }
            } else
            if (serializationconfig.isEnabled(MapperFeature.USE_STATIC_TYPING))
            {
                return true;
            }
            if (beanproperty != null)
            {
                serializationconfig = beanproperty.getType();
                if (serializationconfig.isContainerType())
                {
                    if (typeserializer.findSerializationContentType(beanproperty.getMember(), beanproperty.getType()) != null)
                    {
                        return true;
                    }
                    if ((serializationconfig instanceof MapType) && typeserializer.findSerializationKeyType(beanproperty.getMember(), beanproperty.getType()) != null)
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final SerializerFactory withAdditionalKeySerializers(Serializers serializers)
    {
        return withConfig(_factoryConfig.withAdditionalKeySerializers(serializers));
    }

    public final SerializerFactory withAdditionalSerializers(Serializers serializers)
    {
        return withConfig(_factoryConfig.withAdditionalSerializers(serializers));
    }

    public abstract SerializerFactory withConfig(SerializerFactoryConfig serializerfactoryconfig);

    public final SerializerFactory withSerializerModifier(BeanSerializerModifier beanserializermodifier)
    {
        return withConfig(_factoryConfig.withSerializerModifier(beanserializermodifier));
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
        obj = new com.fasterxml.jackson.databind.ser.std.NumberSerializers.NumberSerializer();
        _concrete.put(java/math/BigInteger.getName(), obj);
        _concrete.put(java/math/BigDecimal.getName(), obj);
        _concrete.put(java/util/Calendar.getName(), CalendarSerializer.instance);
        obj = DateSerializer.instance;
        _concrete.put(java/util/Date.getName(), obj);
        _concrete.put(java/sql/Timestamp.getName(), obj);
        _concrete.put(java/sql/Date.getName(), new SqlDateSerializer());
        _concrete.put(java/sql/Time.getName(), new SqlTimeSerializer());
        for (Iterator iterator = (new StdJdkSerializers()).provide().iterator(); iterator.hasNext();)
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
