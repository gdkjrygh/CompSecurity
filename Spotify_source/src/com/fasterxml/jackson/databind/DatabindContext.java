// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.annotation.ObjectIdResolver;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import java.lang.reflect.Type;

// Referenced classes of package com.fasterxml.jackson.databind:
//            JavaType, MapperFeature

public abstract class DatabindContext
{

    public DatabindContext()
    {
    }

    public final boolean canOverrideAccessModifiers()
    {
        return getConfig().canOverrideAccessModifiers();
    }

    public JavaType constructSpecializedType(JavaType javatype, Class class1)
    {
        if (javatype.getRawClass() == class1)
        {
            return javatype;
        } else
        {
            return getConfig().constructSpecializedType(javatype, class1);
        }
    }

    public JavaType constructType(Type type)
    {
        return getTypeFactory().constructType(type);
    }

    public Converter converterInstance(Annotated annotated, Object obj)
    {
        Object obj1 = null;
        if (obj == null)
        {
            return null;
        }
        if (obj instanceof Converter)
        {
            return (Converter)obj;
        }
        if (!(obj instanceof Class))
        {
            throw new IllegalStateException((new StringBuilder("AnnotationIntrospector returned Converter definition of type ")).append(obj.getClass().getName()).append("; expected type Converter or Class<Converter> instead").toString());
        }
        Class class1 = (Class)obj;
        if (class1 == com/fasterxml/jackson/databind/util/Converter$None || ClassUtil.isBogusClass(class1))
        {
            return null;
        }
        if (!com/fasterxml/jackson/databind/util/Converter.isAssignableFrom(class1))
        {
            throw new IllegalStateException((new StringBuilder("AnnotationIntrospector returned Class ")).append(class1.getName()).append("; expected Class<Converter>").toString());
        }
        MapperConfig mapperconfig = getConfig();
        obj = mapperconfig.getHandlerInstantiator();
        if (obj == null)
        {
            annotated = obj1;
        } else
        {
            annotated = ((HandlerInstantiator) (obj)).converterInstance(mapperconfig, annotated, class1);
        }
        obj = annotated;
        if (annotated == null)
        {
            obj = (Converter)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers());
        }
        return ((Converter) (obj));
    }

    public abstract MapperConfig getConfig();

    public abstract TypeFactory getTypeFactory();

    public final boolean isEnabled(MapperFeature mapperfeature)
    {
        return getConfig().isEnabled(mapperfeature);
    }

    public ObjectIdGenerator objectIdGeneratorInstance(Annotated annotated, ObjectIdInfo objectidinfo)
    {
        Class class1 = objectidinfo.getGeneratorType();
        MapperConfig mapperconfig = getConfig();
        Object obj = mapperconfig.getHandlerInstantiator();
        if (obj == null)
        {
            annotated = null;
        } else
        {
            annotated = ((HandlerInstantiator) (obj)).objectIdGeneratorInstance(mapperconfig, annotated, class1);
        }
        obj = annotated;
        if (annotated == null)
        {
            obj = (ObjectIdGenerator)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers());
        }
        return ((ObjectIdGenerator) (obj)).forScope(objectidinfo.getScope());
    }

    public ObjectIdResolver objectIdResolverInstance(Annotated annotated, ObjectIdInfo objectidinfo)
    {
        Class class1 = objectidinfo.getResolverType();
        MapperConfig mapperconfig = getConfig();
        objectidinfo = mapperconfig.getHandlerInstantiator();
        if (objectidinfo == null)
        {
            annotated = null;
        } else
        {
            annotated = objectidinfo.resolverIdGeneratorInstance(mapperconfig, annotated, class1);
        }
        objectidinfo = annotated;
        if (annotated == null)
        {
            objectidinfo = (ObjectIdResolver)ClassUtil.createInstance(class1, mapperconfig.canOverrideAccessModifiers());
        }
        return objectidinfo;
    }
}
