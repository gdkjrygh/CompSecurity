// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.type.SimpleType;
import com.fasterxml.jackson.databind.util.LRUMap;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.introspect:
//            ClassIntrospector, AnnotatedClass, BasicBeanDescription, POJOPropertiesCollector

public class BasicClassIntrospector extends ClassIntrospector
    implements Serializable
{

    protected static final BasicBeanDescription BOOLEAN_DESC;
    protected static final BasicBeanDescription INT_DESC;
    protected static final BasicBeanDescription LONG_DESC;
    protected static final BasicBeanDescription STRING_DESC;
    public static final BasicClassIntrospector instance = new BasicClassIntrospector();
    protected final LRUMap _cachedFCA = new LRUMap(16, 64);

    public BasicClassIntrospector()
    {
    }

    protected BasicBeanDescription _findStdJdkCollectionDesc(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        Object obj = null;
        Object obj1 = null;
        if (_isStdJDKCollection(javatype))
        {
            Class class1 = javatype.getRawClass();
            obj = obj1;
            if (mapperconfig.isAnnotationProcessingEnabled())
            {
                obj = mapperconfig.getAnnotationIntrospector();
            }
            obj = BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.construct(class1, ((AnnotationIntrospector) (obj)), mixinresolver));
        }
        return ((BasicBeanDescription) (obj));
    }

    protected BasicBeanDescription _findStdTypeDesc(JavaType javatype)
    {
        javatype = javatype.getRawClass();
        if (javatype.isPrimitive())
        {
            if (javatype == Boolean.TYPE)
            {
                return BOOLEAN_DESC;
            }
            if (javatype == Integer.TYPE)
            {
                return INT_DESC;
            }
            if (javatype == Long.TYPE)
            {
                return LONG_DESC;
            }
        } else
        if (javatype == java/lang/String)
        {
            return STRING_DESC;
        }
        return null;
    }

    protected boolean _isStdJDKCollection(JavaType javatype)
    {
        if (javatype.isContainerType() && !javatype.isArrayType())
        {
            javatype = javatype.getRawClass();
            Object obj = javatype.getPackage();
            if (obj != null)
            {
                obj = ((Package) (obj)).getName();
                if ((((String) (obj)).startsWith("java.lang") || ((String) (obj)).startsWith("java.util")) && (java/util/Collection.isAssignableFrom(javatype) || java/util/Map.isAssignableFrom(javatype)))
                {
                    return true;
                }
            }
        }
        return false;
    }

    protected POJOPropertiesCollector collectProperties(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver, boolean flag, String s)
    {
        boolean flag1 = mapperconfig.isAnnotationProcessingEnabled();
        Class class1 = javatype.getRawClass();
        AnnotationIntrospector annotationintrospector;
        if (flag1)
        {
            annotationintrospector = mapperconfig.getAnnotationIntrospector();
        } else
        {
            annotationintrospector = null;
        }
        return constructPropertyCollector(mapperconfig, AnnotatedClass.construct(class1, annotationintrospector, mixinresolver), javatype, flag, s).collect();
    }

    protected POJOPropertiesCollector collectPropertiesWithBuilder(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver, boolean flag)
    {
        AnnotationIntrospector annotationintrospector;
        AnnotatedClass annotatedclass;
        if (mapperconfig.isAnnotationProcessingEnabled())
        {
            annotationintrospector = mapperconfig.getAnnotationIntrospector();
        } else
        {
            annotationintrospector = null;
        }
        annotatedclass = AnnotatedClass.construct(javatype.getRawClass(), annotationintrospector, mixinresolver);
        if (annotationintrospector == null)
        {
            mixinresolver = null;
        } else
        {
            mixinresolver = annotationintrospector.findPOJOBuilderConfig(annotatedclass);
        }
        if (mixinresolver == null)
        {
            mixinresolver = "with";
        } else
        {
            mixinresolver = ((com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value) (mixinresolver)).withPrefix;
        }
        return constructPropertyCollector(mapperconfig, annotatedclass, javatype, flag, mixinresolver).collect();
    }

    protected POJOPropertiesCollector constructPropertyCollector(MapperConfig mapperconfig, AnnotatedClass annotatedclass, JavaType javatype, boolean flag, String s)
    {
        return new POJOPropertiesCollector(mapperconfig, flag, javatype, annotatedclass, s);
    }

    public volatile BeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forClassAnnotations(mapperconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forClassAnnotations(MapperConfig mapperconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription = _findStdTypeDesc(javatype);
        Object obj = basicbeandescription;
        if (basicbeandescription == null)
        {
            BasicBeanDescription basicbeandescription1 = (BasicBeanDescription)_cachedFCA.get(javatype);
            obj = basicbeandescription1;
            if (basicbeandescription1 == null)
            {
                boolean flag = mapperconfig.isAnnotationProcessingEnabled();
                Class class1 = javatype.getRawClass();
                if (flag)
                {
                    obj = mapperconfig.getAnnotationIntrospector();
                } else
                {
                    obj = null;
                }
                obj = BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.construct(class1, ((AnnotationIntrospector) (obj)), mixinresolver));
                _cachedFCA.put(javatype, obj);
            }
        }
        return ((BasicBeanDescription) (obj));
    }

    public volatile BeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forCreation(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            BasicBeanDescription basicbeandescription2 = _findStdJdkCollectionDesc(deserializationconfig, javatype, mixinresolver);
            basicbeandescription = basicbeandescription2;
            if (basicbeandescription2 == null)
            {
                basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(deserializationconfig, javatype, mixinresolver, false, "set"));
            }
        }
        return basicbeandescription;
    }

    public volatile BeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forDeserialization(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            BasicBeanDescription basicbeandescription2 = _findStdJdkCollectionDesc(deserializationconfig, javatype, mixinresolver);
            basicbeandescription = basicbeandescription2;
            if (basicbeandescription2 == null)
            {
                basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(deserializationconfig, javatype, mixinresolver, false, "set"));
            }
            _cachedFCA.putIfAbsent(javatype, basicbeandescription);
        }
        return basicbeandescription;
    }

    public volatile BeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forDeserializationWithBuilder(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        deserializationconfig = BasicBeanDescription.forDeserialization(collectPropertiesWithBuilder(deserializationconfig, javatype, mixinresolver, false));
        _cachedFCA.putIfAbsent(javatype, deserializationconfig);
        return deserializationconfig;
    }

    public volatile BeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forSerialization(serializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findStdTypeDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            BasicBeanDescription basicbeandescription2 = _findStdJdkCollectionDesc(serializationconfig, javatype, mixinresolver);
            basicbeandescription = basicbeandescription2;
            if (basicbeandescription2 == null)
            {
                basicbeandescription = BasicBeanDescription.forSerialization(collectProperties(serializationconfig, javatype, mixinresolver, true, "set"));
            }
            _cachedFCA.putIfAbsent(javatype, basicbeandescription);
        }
        return basicbeandescription;
    }

    static 
    {
        AnnotatedClass annotatedclass = AnnotatedClass.constructWithoutSuperTypes(java/lang/String, null, null);
        STRING_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(java/lang/String), annotatedclass);
        annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Boolean.TYPE, null, null);
        BOOLEAN_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Boolean.TYPE), annotatedclass);
        annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Integer.TYPE, null, null);
        INT_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Integer.TYPE), annotatedclass);
        annotatedclass = AnnotatedClass.constructWithoutSuperTypes(Long.TYPE, null, null);
        LONG_DESC = BasicBeanDescription.forOtherUse(null, SimpleType.constructUnsafe(Long.TYPE), annotatedclass);
    }
}
