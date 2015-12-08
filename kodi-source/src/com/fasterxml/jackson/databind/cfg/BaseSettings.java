// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//            HandlerInstantiator

public final class BaseSettings
    implements Serializable
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected final ClassIntrospector _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final Base64Variant _defaultBase64;
    protected final HandlerInstantiator _handlerInstantiator;
    protected final Locale _locale;
    protected final PropertyNamingStrategy _propertyNamingStrategy;
    protected final TimeZone _timeZone;
    protected final TypeFactory _typeFactory;
    protected final TypeResolverBuilder _typeResolverBuilder;
    protected final VisibilityChecker _visibilityChecker;

    public BaseSettings(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, TypeResolverBuilder typeresolverbuilder, DateFormat dateformat, 
            HandlerInstantiator handlerinstantiator, Locale locale, TimeZone timezone, Base64Variant base64variant)
    {
        _classIntrospector = classintrospector;
        _annotationIntrospector = annotationintrospector;
        _visibilityChecker = visibilitychecker;
        _propertyNamingStrategy = propertynamingstrategy;
        _typeFactory = typefactory;
        _typeResolverBuilder = typeresolverbuilder;
        _dateFormat = dateformat;
        _handlerInstantiator = handlerinstantiator;
        _locale = locale;
        _timeZone = timezone;
        _defaultBase64 = base64variant;
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        return _annotationIntrospector;
    }

    public Base64Variant getBase64Variant()
    {
        return _defaultBase64;
    }

    public ClassIntrospector getClassIntrospector()
    {
        return _classIntrospector;
    }

    public DateFormat getDateFormat()
    {
        return _dateFormat;
    }

    public HandlerInstantiator getHandlerInstantiator()
    {
        return _handlerInstantiator;
    }

    public Locale getLocale()
    {
        return _locale;
    }

    public PropertyNamingStrategy getPropertyNamingStrategy()
    {
        return _propertyNamingStrategy;
    }

    public TimeZone getTimeZone()
    {
        return _timeZone;
    }

    public TypeFactory getTypeFactory()
    {
        return _typeFactory;
    }

    public TypeResolverBuilder getTypeResolverBuilder()
    {
        return _typeResolverBuilder;
    }

    public VisibilityChecker getVisibilityChecker()
    {
        return _visibilityChecker;
    }

    public BaseSettings withClassIntrospector(ClassIntrospector classintrospector)
    {
        if (_classIntrospector == classintrospector)
        {
            return this;
        } else
        {
            return new BaseSettings(classintrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone, _defaultBase64);
        }
    }
}
