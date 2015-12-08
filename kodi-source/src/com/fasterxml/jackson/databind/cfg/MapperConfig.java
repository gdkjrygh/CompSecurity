// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.Annotated;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeIdResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeBindings;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.ClassUtil;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//            ConfigFeature, BaseSettings, HandlerInstantiator

public abstract class MapperConfig
    implements com.fasterxml.jackson.databind.introspect.ClassIntrospector.MixInResolver, Serializable
{

    protected final BaseSettings _base;
    protected final int _mapperFeatures;

    protected MapperConfig(BaseSettings basesettings, int i)
    {
        _base = basesettings;
        _mapperFeatures = i;
    }

    public static int collectFeatureDefaults(Class class1)
    {
        int j = 0;
        class1 = (Enum[])class1.getEnumConstants();
        int l = class1.length;
        for (int i = 0; i < l;)
        {
            Object obj = class1[i];
            int k = j;
            if (((ConfigFeature)obj).enabledByDefault())
            {
                k = j | ((ConfigFeature)obj).getMask();
            }
            i++;
            j = k;
        }

        return j;
    }

    public final boolean canOverrideAccessModifiers()
    {
        return isEnabled(MapperFeature.CAN_OVERRIDE_ACCESS_MODIFIERS);
    }

    public SerializableString compileString(String s)
    {
        return new SerializedString(s);
    }

    public JavaType constructSpecializedType(JavaType javatype, Class class1)
    {
        return getTypeFactory().constructSpecializedType(javatype, class1);
    }

    public final JavaType constructType(Class class1)
    {
        return getTypeFactory().constructType(class1, (TypeBindings)null);
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        return _base.getAnnotationIntrospector();
    }

    public Base64Variant getBase64Variant()
    {
        return _base.getBase64Variant();
    }

    public ClassIntrospector getClassIntrospector()
    {
        return _base.getClassIntrospector();
    }

    public final DateFormat getDateFormat()
    {
        return _base.getDateFormat();
    }

    public final TypeResolverBuilder getDefaultTyper(JavaType javatype)
    {
        return _base.getTypeResolverBuilder();
    }

    public VisibilityChecker getDefaultVisibilityChecker()
    {
        return _base.getVisibilityChecker();
    }

    public final HandlerInstantiator getHandlerInstantiator()
    {
        return _base.getHandlerInstantiator();
    }

    public final Locale getLocale()
    {
        return _base.getLocale();
    }

    public final PropertyNamingStrategy getPropertyNamingStrategy()
    {
        return _base.getPropertyNamingStrategy();
    }

    public final TimeZone getTimeZone()
    {
        return _base.getTimeZone();
    }

    public final TypeFactory getTypeFactory()
    {
        return _base.getTypeFactory();
    }

    public abstract BeanDescription introspectClassAnnotations(JavaType javatype);

    public BeanDescription introspectClassAnnotations(Class class1)
    {
        return introspectClassAnnotations(constructType(class1));
    }

    public final boolean isAnnotationProcessingEnabled()
    {
        return isEnabled(MapperFeature.USE_ANNOTATIONS);
    }

    public final boolean isEnabled(MapperFeature mapperfeature)
    {
        return (_mapperFeatures & mapperfeature.getMask()) != 0;
    }

    public final boolean shouldSortPropertiesAlphabetically()
    {
        return isEnabled(MapperFeature.SORT_PROPERTIES_ALPHABETICALLY);
    }

    public TypeIdResolver typeIdResolverInstance(Annotated annotated, Class class1)
    {
        HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.typeIdResolverInstance(this, annotated, class1);
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (TypeIdResolver)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
    }

    public TypeResolverBuilder typeResolverBuilderInstance(Annotated annotated, Class class1)
    {
        HandlerInstantiator handlerinstantiator = getHandlerInstantiator();
        if (handlerinstantiator != null)
        {
            annotated = handlerinstantiator.typeResolverBuilderInstance(this, annotated, class1);
            if (annotated != null)
            {
                return annotated;
            }
        }
        return (TypeResolverBuilder)ClassUtil.createInstance(class1, canOverrideAccessModifiers());
    }
}
