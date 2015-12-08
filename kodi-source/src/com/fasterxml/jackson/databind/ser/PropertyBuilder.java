// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

// Referenced classes of package com.fasterxml.jackson.databind.ser:
//            BeanPropertyWriter, BasicSerializerFactory

public class PropertyBuilder
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected final BeanDescription _beanDesc;
    protected final SerializationConfig _config;
    protected Object _defaultBean;
    protected final com.fasterxml.jackson.annotation.JsonInclude.Include _defaultInclusion;

    public PropertyBuilder(SerializationConfig serializationconfig, BeanDescription beandescription)
    {
        _config = serializationconfig;
        _beanDesc = beandescription;
        _defaultInclusion = beandescription.findSerializationInclusion(serializationconfig.getSerializationInclusion());
        _annotationIntrospector = _config.getAnnotationIntrospector();
    }

    protected Object _throwWrapped(Exception exception, String s, Object obj)
    {
        for (; exception.getCause() != null; exception = exception.getCause()) { }
        if (exception instanceof Error)
        {
            throw (Error)exception;
        }
        if (exception instanceof RuntimeException)
        {
            throw (RuntimeException)exception;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to get property '").append(s).append("' of default ").append(obj.getClass().getName()).append(" instance").toString());
        }
    }

    protected BeanPropertyWriter buildWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, TypeSerializer typeserializer1, AnnotatedMember annotatedmember, 
            boolean flag)
        throws JsonMappingException
    {
        JavaType javatype1;
        Object obj;
        Object obj2;
        boolean flag1;
        boolean flag2;
        obj = findSerializationType(annotatedmember, flag, javatype);
        javatype1 = ((JavaType) (obj));
        if (typeserializer1 != null)
        {
            javatype1 = ((JavaType) (obj));
            if (obj == null)
            {
                javatype1 = javatype;
            }
            if (javatype1.getContentType() == null)
            {
                throw new IllegalStateException((new StringBuilder()).append("Problem trying to create BeanPropertyWriter for property '").append(beanpropertydefinition.getName()).append("' (of type ").append(_beanDesc.getType()).append("); serialization type ").append(javatype1).append(" has no content").toString());
            }
            javatype1 = javatype1.withContentTypeHandler(typeserializer1);
            javatype1.getContentType();
        }
        obj2 = null;
        flag1 = false;
        flag2 = false;
        typeserializer1 = beanpropertydefinition.findInclusion();
        obj = typeserializer1;
        if (typeserializer1 == null)
        {
            obj = _defaultInclusion;
        }
        flag = flag2;
        typeserializer1 = obj2;
        if (obj == null) goto _L2; else goto _L1
_L1:
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include = new int[com.fasterxml.jackson.annotation.JsonInclude.Include.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_DEFAULT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_EMPTY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$annotation$JsonInclude$Include[com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[((com.fasterxml.jackson.annotation.JsonInclude.Include) (obj)).ordinal()];
        JVM INSTR tableswitch 1 4: default 196
    //                   1 282
    //                   2 342
    //                   3 353
    //                   4 356;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        typeserializer1 = obj2;
        flag = flag2;
_L2:
        beanpropertydefinition = new BeanPropertyWriter(beanpropertydefinition, annotatedmember, _beanDesc.getClassAnnotations(), javatype, jsonserializer, typeserializer, javatype1, flag, typeserializer1);
        javatype = ((JavaType) (_annotationIntrospector.findNullSerializer(annotatedmember)));
        if (javatype != null)
        {
            beanpropertydefinition.assignNullSerializer(serializerprovider.serializerInstance(annotatedmember, javatype));
        }
        javatype = _annotationIntrospector.findUnwrappingNameTransformer(annotatedmember);
        serializerprovider = beanpropertydefinition;
        if (javatype != null)
        {
            serializerprovider = beanpropertydefinition.unwrappingWriter(javatype);
        }
        return serializerprovider;
_L4:
        Object obj1 = getDefaultValue(beanpropertydefinition.getName(), annotatedmember);
        if (obj1 == null)
        {
            flag = true;
            typeserializer1 = ((TypeSerializer) (obj1));
        } else
        {
            flag = flag2;
            typeserializer1 = ((TypeSerializer) (obj1));
            if (obj1.getClass().isArray())
            {
                typeserializer1 = ((TypeSerializer) (ArrayBuilders.getArrayComparator(obj1)));
                flag = flag2;
            }
        }
        continue; /* Loop/switch isn't completed */
_L5:
        flag = true;
        typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
        continue; /* Loop/switch isn't completed */
_L6:
        flag1 = true;
_L7:
        flag = flag1;
        typeserializer1 = obj2;
        if (javatype.isContainerType())
        {
            flag = flag1;
            typeserializer1 = obj2;
            if (!_config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS))
            {
                typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
                flag = flag1;
            }
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    protected JavaType findSerializationType(Annotated annotated, boolean flag, JavaType javatype)
    {
        Object obj1 = _annotationIntrospector.findSerializationType(annotated);
        Object obj = javatype;
        boolean flag1;
        if (obj1 != null)
        {
            obj = javatype.getRawClass();
            if (((Class) (obj1)).isAssignableFrom(((Class) (obj))))
            {
                obj = javatype.widenBy(((Class) (obj1)));
            } else
            {
                if (!((Class) (obj)).isAssignableFrom(((Class) (obj1))))
                {
                    throw new IllegalArgumentException((new StringBuilder()).append("Illegal concrete-type annotation for method '").append(annotated.getName()).append("': class ").append(((Class) (obj1)).getName()).append(" not a super-type of (declared) class ").append(((Class) (obj)).getName()).toString());
                }
                obj = _config.constructSpecializedType(javatype, ((Class) (obj1)));
            }
            flag = true;
        }
        obj1 = BasicSerializerFactory.modifySecondaryTypesByAnnotation(_config, annotated, ((JavaType) (obj)));
        javatype = ((JavaType) (obj));
        if (obj1 != obj)
        {
            flag = true;
            javatype = ((JavaType) (obj1));
        }
        annotated = _annotationIntrospector.findSerializationTyping(annotated);
        flag1 = flag;
        if (annotated != null)
        {
            flag1 = flag;
            if (annotated != com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.DEFAULT_TYPING)
            {
                if (annotated == com.fasterxml.jackson.databind.annotation.JsonSerialize.Typing.STATIC)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
            }
        }
        if (flag1)
        {
            return javatype;
        } else
        {
            return null;
        }
    }

    public Annotations getClassAnnotations()
    {
        return _beanDesc.getClassAnnotations();
    }

    protected Object getDefaultBean()
    {
        if (_defaultBean == null)
        {
            _defaultBean = _beanDesc.instantiateBean(_config.canOverrideAccessModifiers());
            if (_defaultBean == null)
            {
                Class class1 = _beanDesc.getClassInfo().getAnnotated();
                throw new IllegalArgumentException((new StringBuilder()).append("Class ").append(class1.getName()).append(" has no default constructor; can not instantiate default bean value to support 'properties=JsonSerialize.Inclusion.NON_DEFAULT' annotation").toString());
            }
        }
        return _defaultBean;
    }

    protected Object getDefaultValue(String s, AnnotatedMember annotatedmember)
    {
        Object obj = getDefaultBean();
        try
        {
            annotatedmember = ((AnnotatedMember) (annotatedmember.getValue(obj)));
        }
        // Misplaced declaration of an exception variable
        catch (AnnotatedMember annotatedmember)
        {
            return _throwWrapped(annotatedmember, s, obj);
        }
        return annotatedmember;
    }
}
