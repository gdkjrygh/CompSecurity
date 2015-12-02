// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.StdDateFormat;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//            HandlerInstantiator

public final class BaseSettings
{

    protected final AnnotationIntrospector _annotationIntrospector;
    protected final ClassIntrospector _classIntrospector;
    protected final DateFormat _dateFormat;
    protected final HandlerInstantiator _handlerInstantiator;
    protected final Locale _locale;
    protected final PropertyNamingStrategy _propertyNamingStrategy;
    protected final TimeZone _timeZone;
    protected final TypeFactory _typeFactory;
    protected final TypeResolverBuilder _typeResolverBuilder;
    protected final VisibilityChecker _visibilityChecker;

    public BaseSettings(ClassIntrospector classintrospector, AnnotationIntrospector annotationintrospector, VisibilityChecker visibilitychecker, PropertyNamingStrategy propertynamingstrategy, TypeFactory typefactory, TypeResolverBuilder typeresolverbuilder, DateFormat dateformat, 
            HandlerInstantiator handlerinstantiator, Locale locale, TimeZone timezone)
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
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        return _annotationIntrospector;
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

    public BaseSettings with(Locale locale)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, locale, _timeZone);
    }

    public BaseSettings with(TimeZone timezone)
    {
        if (timezone == null)
        {
            throw new IllegalArgumentException();
        }
        Object obj = _dateFormat;
        if (obj instanceof StdDateFormat)
        {
            obj = ((StdDateFormat)obj).withTimeZone(timezone);
        } else
        {
            obj = (DateFormat)((DateFormat) (obj)).clone();
            ((DateFormat) (obj)).setTimeZone(timezone);
        }
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, ((DateFormat) (obj)), _handlerInstantiator, _locale, timezone);
    }

    public BaseSettings withAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return new BaseSettings(_classIntrospector, annotationintrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone);
    }

    public BaseSettings withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector.Pair.create(_annotationIntrospector, annotationintrospector));
    }

    public BaseSettings withClassIntrospector(ClassIntrospector classintrospector)
    {
        return new BaseSettings(classintrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone);
    }

    public BaseSettings withDateFormat(DateFormat dateformat)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, dateformat, _handlerInstantiator, _locale, _timeZone);
    }

    public BaseSettings withHandlerInstantiator(HandlerInstantiator handlerinstantiator)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, handlerinstantiator, _locale, _timeZone);
    }

    public BaseSettings withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withAnnotationIntrospector(com.fasterxml.jackson.databind.AnnotationIntrospector.Pair.create(annotationintrospector, _annotationIntrospector));
    }

    public BaseSettings withPropertyNamingStrategy(PropertyNamingStrategy propertynamingstrategy)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, propertynamingstrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone);
    }

    public BaseSettings withTypeFactory(TypeFactory typefactory)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, typefactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone);
    }

    public BaseSettings withTypeResolverBuilder(TypeResolverBuilder typeresolverbuilder)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker, _propertyNamingStrategy, _typeFactory, typeresolverbuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone);
    }

    public BaseSettings withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, _visibilityChecker.withVisibility(propertyaccessor, visibility), _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone);
    }

    public BaseSettings withVisibilityChecker(VisibilityChecker visibilitychecker)
    {
        return new BaseSettings(_classIntrospector, _annotationIntrospector, visibilitychecker, _propertyNamingStrategy, _typeFactory, _typeResolverBuilder, _dateFormat, _handlerInstantiator, _locale, _timeZone);
    }
}
