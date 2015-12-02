// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//            MapperConfig, BaseSettings, HandlerInstantiator

public abstract class MapperConfigBase extends MapperConfig
{

    private static final int DEFAULT_MAPPER_FEATURES = collectFeatureDefaults(com/fasterxml/jackson/databind/MapperFeature);
    protected final Map _mixInAnnotations;
    protected final String _rootName;
    protected final SubtypeResolver _subtypeResolver;
    protected final Class _view;

    protected MapperConfigBase(BaseSettings basesettings, SubtypeResolver subtyperesolver, Map map)
    {
        super(basesettings, DEFAULT_MAPPER_FEATURES);
        _mixInAnnotations = map;
        _subtypeResolver = subtyperesolver;
        _rootName = null;
        _view = null;
    }

    protected MapperConfigBase(MapperConfigBase mapperconfigbase)
    {
        super(mapperconfigbase);
        _mixInAnnotations = mapperconfigbase._mixInAnnotations;
        _subtypeResolver = mapperconfigbase._subtypeResolver;
        _rootName = mapperconfigbase._rootName;
        _view = mapperconfigbase._view;
    }

    protected MapperConfigBase(MapperConfigBase mapperconfigbase, int i)
    {
        super(mapperconfigbase._base, i);
        _mixInAnnotations = mapperconfigbase._mixInAnnotations;
        _subtypeResolver = mapperconfigbase._subtypeResolver;
        _rootName = mapperconfigbase._rootName;
        _view = mapperconfigbase._view;
    }

    protected MapperConfigBase(MapperConfigBase mapperconfigbase, BaseSettings basesettings)
    {
        super(basesettings, mapperconfigbase._mapperFeatures);
        _mixInAnnotations = mapperconfigbase._mixInAnnotations;
        _subtypeResolver = mapperconfigbase._subtypeResolver;
        _rootName = mapperconfigbase._rootName;
        _view = mapperconfigbase._view;
    }

    protected MapperConfigBase(MapperConfigBase mapperconfigbase, SubtypeResolver subtyperesolver)
    {
        super(mapperconfigbase);
        _mixInAnnotations = mapperconfigbase._mixInAnnotations;
        _subtypeResolver = subtyperesolver;
        _rootName = mapperconfigbase._rootName;
        _view = mapperconfigbase._view;
    }

    protected MapperConfigBase(MapperConfigBase mapperconfigbase, Class class1)
    {
        super(mapperconfigbase);
        _mixInAnnotations = mapperconfigbase._mixInAnnotations;
        _subtypeResolver = mapperconfigbase._subtypeResolver;
        _rootName = mapperconfigbase._rootName;
        _view = class1;
    }

    protected MapperConfigBase(MapperConfigBase mapperconfigbase, String s)
    {
        super(mapperconfigbase);
        _mixInAnnotations = mapperconfigbase._mixInAnnotations;
        _subtypeResolver = mapperconfigbase._subtypeResolver;
        _rootName = s;
        _view = mapperconfigbase._view;
    }

    public final Class findMixInClassFor(Class class1)
    {
        if (_mixInAnnotations == null)
        {
            return null;
        } else
        {
            return (Class)_mixInAnnotations.get(new ClassKey(class1));
        }
    }

    public final Class getActiveView()
    {
        return _view;
    }

    public final String getRootName()
    {
        return _rootName;
    }

    public final SubtypeResolver getSubtypeResolver()
    {
        return _subtypeResolver;
    }

    public final int mixInCount()
    {
        if (_mixInAnnotations == null)
        {
            return 0;
        } else
        {
            return _mixInAnnotations.size();
        }
    }

    public abstract MapperConfigBase with(AnnotationIntrospector annotationintrospector);

    public abstract MapperConfigBase with(PropertyNamingStrategy propertynamingstrategy);

    public abstract MapperConfigBase with(HandlerInstantiator handlerinstantiator);

    public abstract MapperConfigBase with(ClassIntrospector classintrospector);

    public abstract MapperConfigBase with(VisibilityChecker visibilitychecker);

    public abstract MapperConfigBase with(SubtypeResolver subtyperesolver);

    public abstract MapperConfigBase with(TypeResolverBuilder typeresolverbuilder);

    public abstract MapperConfigBase with(TypeFactory typefactory);

    public abstract MapperConfigBase with(DateFormat dateformat);

    public abstract MapperConfigBase with(Locale locale);

    public abstract MapperConfigBase with(TimeZone timezone);

    public abstract MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector);

    public abstract MapperConfigBase withRootName(String s);

    public abstract MapperConfigBase withView(Class class1);

    public abstract MapperConfigBase withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility);

}
