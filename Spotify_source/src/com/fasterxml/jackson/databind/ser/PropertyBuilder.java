// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser;

import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
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
    protected final com.fasterxml.jackson.annotation.JsonInclude.Include _outputProps;

    public PropertyBuilder(SerializationConfig serializationconfig, BeanDescription beandescription)
    {
        _config = serializationconfig;
        _beanDesc = beandescription;
        _outputProps = beandescription.findSerializationInclusion(serializationconfig.getSerializationInclusion());
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
            throw new IllegalArgumentException((new StringBuilder("Failed to get property '")).append(s).append("' of default ").append(obj.getClass().getName()).append(" instance").toString());
        }
    }

    protected BeanPropertyWriter buildWriter(SerializerProvider serializerprovider, BeanPropertyDefinition beanpropertydefinition, JavaType javatype, JsonSerializer jsonserializer, TypeSerializer typeserializer, TypeSerializer typeserializer1, AnnotatedMember annotatedmember, 
            boolean flag)
    {
        JavaType javatype1;
        Object obj;
        com.fasterxml.jackson.annotation.JsonInclude.Include include;
        boolean flag1;
        boolean flag2;
        javatype1 = findSerializationType(annotatedmember, flag, javatype);
        if (typeserializer1 != null)
        {
            JavaType javatype2 = javatype1;
            if (javatype1 == null)
            {
                javatype2 = javatype;
            }
            if (javatype2.getContentType() == null)
            {
                throw new IllegalStateException((new StringBuilder("Problem trying to create BeanPropertyWriter for property '")).append(beanpropertydefinition.getName()).append("' (of type ").append(_beanDesc.getType()).append("); serialization type ").append(javatype2).append(" has no content").toString());
            }
            javatype1 = javatype2.withContentTypeHandler(typeserializer1);
            javatype1.getContentType();
        }
        obj = null;
        flag = false;
        flag2 = false;
        include = _annotationIntrospector.findSerializationInclusion(annotatedmember, _outputProps);
        flag1 = flag2;
        typeserializer1 = ((TypeSerializer) (obj));
        if (include == null) goto _L2; else goto _L1
_L1:
        class _cls1
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

        _cls1..SwitchMap.com.fasterxml.jackson.annotation.JsonInclude.Include[include.ordinal()];
        JVM INSTR tableswitch 1 4: default 184
    //                   1 274
    //                   2 333
    //                   3 344
    //                   4 347;
           goto _L3 _L4 _L5 _L6 _L7
_L3:
        typeserializer1 = ((TypeSerializer) (obj));
        flag1 = flag2;
_L2:
        flag = flag1;
_L8:
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
label0:
        {
            obj = getDefaultValue(beanpropertydefinition.getName(), annotatedmember);
            if (obj != null)
            {
                break label0;
            }
            flag = true;
            typeserializer1 = ((TypeSerializer) (obj));
        }
          goto _L8
        flag1 = flag2;
        typeserializer1 = ((TypeSerializer) (obj));
        if (!obj.getClass().isArray()) goto _L2; else goto _L9
_L9:
        typeserializer1 = ((TypeSerializer) (ArrayBuilders.getArrayComparator(obj)));
        flag = false;
          goto _L8
_L5:
        typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
        flag = true;
          goto _L8
_L6:
        flag = true;
_L7:
        flag1 = flag;
        typeserializer1 = ((TypeSerializer) (obj));
        if (!javatype.isContainerType()) goto _L2; else goto _L10
_L10:
        flag1 = flag;
        typeserializer1 = ((TypeSerializer) (obj));
        if (_config.isEnabled(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)) goto _L2; else goto _L11
_L11:
        typeserializer1 = ((TypeSerializer) (BeanPropertyWriter.MARKER_FOR_EMPTY));
          goto _L8
    }

    protected JavaType findSerializationType(Annotated annotated, boolean flag, JavaType javatype)
    {
        boolean flag2 = true;
        Object obj = _annotationIntrospector.findSerializationType(annotated);
        if (obj != null)
        {
            Object obj1 = javatype.getRawClass();
            boolean flag1;
            if (((Class) (obj)).isAssignableFrom(((Class) (obj1))))
            {
                javatype = javatype.widenBy(((Class) (obj)));
            } else
            {
                if (!((Class) (obj1)).isAssignableFrom(((Class) (obj))))
                {
                    throw new IllegalArgumentException((new StringBuilder("Illegal concrete-type annotation for method '")).append(annotated.getName()).append("': class ").append(((Class) (obj)).getName()).append(" not a super-type of (declared) class ").append(((Class) (obj1)).getName()).toString());
                }
                javatype = _config.constructSpecializedType(javatype, ((Class) (obj)));
            }
            flag = true;
        }
        obj1 = BasicSerializerFactory.modifySecondaryTypesByAnnotation(_config, annotated, javatype);
        obj = javatype;
        if (obj1 != javatype)
        {
            obj = obj1;
            flag = true;
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
                    flag = flag2;
                } else
                {
                    flag = false;
                }
                flag1 = flag;
            }
        }
        if (flag1)
        {
            return ((JavaType) (obj));
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
                throw new IllegalArgumentException((new StringBuilder("Class ")).append(class1.getName()).append(" has no default constructor; can not instantiate default bean value to support 'properties=JsonSerialize.Inclusion.NON_DEFAULT' annotation").toString());
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
