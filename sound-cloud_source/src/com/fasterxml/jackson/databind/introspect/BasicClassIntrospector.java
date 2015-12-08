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
import java.io.Serializable;

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

    public BasicClassIntrospector()
    {
    }

    protected BasicBeanDescription _findCachedDesc(JavaType javatype)
    {
        javatype = javatype.getRawClass();
        if (javatype == java/lang/String)
        {
            return STRING_DESC;
        }
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
        } else
        {
            return null;
        }
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
        Object obj = null;
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
            mixinresolver = obj;
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
        boolean flag = mapperconfig.isAnnotationProcessingEnabled();
        Class class1 = javatype.getRawClass();
        AnnotationIntrospector annotationintrospector;
        if (flag)
        {
            annotationintrospector = mapperconfig.getAnnotationIntrospector();
        } else
        {
            annotationintrospector = null;
        }
        return BasicBeanDescription.forOtherUse(mapperconfig, javatype, AnnotatedClass.construct(class1, annotationintrospector, mixinresolver));
    }

    public volatile BeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forCreation(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forCreation(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findCachedDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(deserializationconfig, javatype, mixinresolver, false, "set"));
        }
        return basicbeandescription;
    }

    public volatile BeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forDeserialization(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forDeserialization(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findCachedDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            basicbeandescription = BasicBeanDescription.forDeserialization(collectProperties(deserializationconfig, javatype, mixinresolver, false, "set"));
        }
        return basicbeandescription;
    }

    public volatile BeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forDeserializationWithBuilder(deserializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forDeserializationWithBuilder(DeserializationConfig deserializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return BasicBeanDescription.forDeserialization(collectPropertiesWithBuilder(deserializationconfig, javatype, mixinresolver, false));
    }

    public volatile BeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        return forSerialization(serializationconfig, javatype, mixinresolver);
    }

    public BasicBeanDescription forSerialization(SerializationConfig serializationconfig, JavaType javatype, ClassIntrospector.MixInResolver mixinresolver)
    {
        BasicBeanDescription basicbeandescription1 = _findCachedDesc(javatype);
        BasicBeanDescription basicbeandescription = basicbeandescription1;
        if (basicbeandescription1 == null)
        {
            basicbeandescription = BasicBeanDescription.forSerialization(collectProperties(serializationconfig, javatype, mixinresolver, true, "set"));
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
