// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.type.TypeFactory;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//            SerializationFeature, MapperFeature, AnnotationIntrospector, JavaType, 
//            BeanDescription, PropertyNamingStrategy

public final class SerializationConfig extends MapperConfigBase
{

    protected final FilterProvider _filterProvider;
    protected final int _serFeatures;
    protected com.fasterxml.jackson.annotation.JsonInclude.Include _serializationInclusion;

    private SerializationConfig(SerializationConfig serializationconfig, int i, int j)
    {
        super(serializationconfig, i);
        _serializationInclusion = null;
        _serFeatures = j;
        _serializationInclusion = serializationconfig._serializationInclusion;
        _filterProvider = serializationconfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationconfig, com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        super(serializationconfig);
        _serializationInclusion = null;
        _serFeatures = serializationconfig._serFeatures;
        _serializationInclusion = include;
        _filterProvider = serializationconfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationconfig, BaseSettings basesettings)
    {
        super(serializationconfig, basesettings);
        _serializationInclusion = null;
        _serFeatures = serializationconfig._serFeatures;
        _serializationInclusion = serializationconfig._serializationInclusion;
        _filterProvider = serializationconfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationconfig, SubtypeResolver subtyperesolver)
    {
        super(serializationconfig, subtyperesolver);
        _serializationInclusion = null;
        _serFeatures = serializationconfig._serFeatures;
        _serializationInclusion = serializationconfig._serializationInclusion;
        _filterProvider = serializationconfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationconfig, FilterProvider filterprovider)
    {
        super(serializationconfig);
        _serializationInclusion = null;
        _serFeatures = serializationconfig._serFeatures;
        _serializationInclusion = serializationconfig._serializationInclusion;
        _filterProvider = filterprovider;
    }

    private SerializationConfig(SerializationConfig serializationconfig, Class class1)
    {
        super(serializationconfig, class1);
        _serializationInclusion = null;
        _serFeatures = serializationconfig._serFeatures;
        _serializationInclusion = serializationconfig._serializationInclusion;
        _filterProvider = serializationconfig._filterProvider;
    }

    private SerializationConfig(SerializationConfig serializationconfig, String s)
    {
        super(serializationconfig, s);
        _serializationInclusion = null;
        _serFeatures = serializationconfig._serFeatures;
        _serializationInclusion = serializationconfig._serializationInclusion;
        _filterProvider = serializationconfig._filterProvider;
    }

    public SerializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, Map map)
    {
        super(basesettings, subtyperesolver, map);
        _serializationInclusion = null;
        _serFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/SerializationFeature);
        _filterProvider = null;
    }

    private final SerializationConfig _withBase(BaseSettings basesettings)
    {
        if (_base == basesettings)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, basesettings);
        }
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS))
        {
            return super.getAnnotationIntrospector();
        } else
        {
            return AnnotationIntrospector.nopInstance();
        }
    }

    public VisibilityChecker getDefaultVisibilityChecker()
    {
        VisibilityChecker visibilitychecker1 = super.getDefaultVisibilityChecker();
        VisibilityChecker visibilitychecker = visibilitychecker1;
        if (!isEnabled(MapperFeature.AUTO_DETECT_GETTERS))
        {
            visibilitychecker = visibilitychecker1.withGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
        }
        visibilitychecker1 = visibilitychecker;
        if (!isEnabled(MapperFeature.AUTO_DETECT_IS_GETTERS))
        {
            visibilitychecker1 = visibilitychecker.withIsGetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
        }
        visibilitychecker = visibilitychecker1;
        if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS))
        {
            visibilitychecker = visibilitychecker1.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
        }
        return visibilitychecker;
    }

    public FilterProvider getFilterProvider()
    {
        return _filterProvider;
    }

    public final int getSerializationFeatures()
    {
        return _serFeatures;
    }

    public com.fasterxml.jackson.annotation.JsonInclude.Include getSerializationInclusion()
    {
        if (_serializationInclusion != null)
        {
            return _serializationInclusion;
        } else
        {
            return com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
        }
    }

    public BeanDescription introspect(JavaType javatype)
    {
        return getClassIntrospector().forSerialization(this, javatype, this);
    }

    public BeanDescription introspectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forClassAnnotations(this, javatype, this);
    }

    public BeanDescription introspectDirectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forDirectClassAnnotations(this, javatype, this);
    }

    public final boolean isEnabled(SerializationFeature serializationfeature)
    {
        return (_serFeatures & serializationfeature.getMask()) != 0;
    }

    public String toString()
    {
        return (new StringBuilder()).append("[SerializationConfig: flags=0x").append(Integer.toHexString(_serFeatures)).append("]").toString();
    }

    public boolean useRootWrapping()
    {
        if (_rootName != null)
        {
            return _rootName.length() > 0;
        } else
        {
            return isEnabled(SerializationFeature.WRAP_ROOT_VALUE);
        }
    }

    public SerializationConfig with(AnnotationIntrospector annotationintrospector)
    {
        return _withBase(_base.withAnnotationIntrospector(annotationintrospector));
    }

    public SerializationConfig with(PropertyNamingStrategy propertynamingstrategy)
    {
        return _withBase(_base.withPropertyNamingStrategy(propertynamingstrategy));
    }

    public SerializationConfig with(SerializationFeature serializationfeature)
    {
        int i = _serFeatures;
        i = serializationfeature.getMask() | i;
        if (i == _serFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, _mapperFeatures, i);
        }
    }

    public transient SerializationConfig with(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
    {
        int i = _serFeatures;
        int k = serializationfeature.getMask() | i;
        int l = aserializationfeature.length;
        for (int j = 0; j < l; j++)
        {
            k |= aserializationfeature[j].getMask();
        }

        if (k == _serFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, _mapperFeatures, k);
        }
    }

    public SerializationConfig with(HandlerInstantiator handlerinstantiator)
    {
        return _withBase(_base.withHandlerInstantiator(handlerinstantiator));
    }

    public SerializationConfig with(ClassIntrospector classintrospector)
    {
        return _withBase(_base.withClassIntrospector(classintrospector));
    }

    public SerializationConfig with(VisibilityChecker visibilitychecker)
    {
        return _withBase(_base.withVisibilityChecker(visibilitychecker));
    }

    public SerializationConfig with(SubtypeResolver subtyperesolver)
    {
        if (subtyperesolver == _subtypeResolver)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, subtyperesolver);
        }
    }

    public SerializationConfig with(TypeResolverBuilder typeresolverbuilder)
    {
        return _withBase(_base.withTypeResolverBuilder(typeresolverbuilder));
    }

    public SerializationConfig with(TypeFactory typefactory)
    {
        return _withBase(_base.withTypeFactory(typefactory));
    }

    public SerializationConfig with(DateFormat dateformat)
    {
        SerializationConfig serializationconfig = new SerializationConfig(this, _base.withDateFormat(dateformat));
        if (dateformat == null)
        {
            return serializationconfig.with(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        } else
        {
            return serializationconfig.without(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        }
    }

    public SerializationConfig with(Locale locale)
    {
        return _withBase(_base.with(locale));
    }

    public SerializationConfig with(TimeZone timezone)
    {
        return _withBase(_base.with(timezone));
    }

    public transient SerializationConfig with(MapperFeature amapperfeature[])
    {
        int j = _mapperFeatures;
        int k = amapperfeature.length;
        for (int i = 0; i < k; i++)
        {
            j |= amapperfeature[i].getMask();
        }

        if (j == _mapperFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, j, _serFeatures);
        }
    }

    public volatile MapperConfig with(MapperFeature amapperfeature[])
    {
        return with(amapperfeature);
    }

    public volatile MapperConfigBase with(AnnotationIntrospector annotationintrospector)
    {
        return with(annotationintrospector);
    }

    public volatile MapperConfigBase with(PropertyNamingStrategy propertynamingstrategy)
    {
        return with(propertynamingstrategy);
    }

    public volatile MapperConfigBase with(HandlerInstantiator handlerinstantiator)
    {
        return with(handlerinstantiator);
    }

    public volatile MapperConfigBase with(ClassIntrospector classintrospector)
    {
        return with(classintrospector);
    }

    public volatile MapperConfigBase with(VisibilityChecker visibilitychecker)
    {
        return with(visibilitychecker);
    }

    public volatile MapperConfigBase with(SubtypeResolver subtyperesolver)
    {
        return with(subtyperesolver);
    }

    public volatile MapperConfigBase with(TypeResolverBuilder typeresolverbuilder)
    {
        return with(typeresolverbuilder);
    }

    public volatile MapperConfigBase with(TypeFactory typefactory)
    {
        return with(typefactory);
    }

    public volatile MapperConfigBase with(DateFormat dateformat)
    {
        return with(dateformat);
    }

    public volatile MapperConfigBase with(Locale locale)
    {
        return with(locale);
    }

    public volatile MapperConfigBase with(TimeZone timezone)
    {
        return with(timezone);
    }

    public SerializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return _withBase(_base.withAppendedAnnotationIntrospector(annotationintrospector));
    }

    public volatile MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withAppendedAnnotationIntrospector(annotationintrospector);
    }

    public transient SerializationConfig withFeatures(SerializationFeature aserializationfeature[])
    {
        int j = _serFeatures;
        int k = aserializationfeature.length;
        for (int i = 0; i < k; i++)
        {
            j |= aserializationfeature[i].getMask();
        }

        if (j == _serFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, _mapperFeatures, j);
        }
    }

    public SerializationConfig withFilters(FilterProvider filterprovider)
    {
        if (filterprovider == _filterProvider)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, filterprovider);
        }
    }

    public SerializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return _withBase(_base.withInsertedAnnotationIntrospector(annotationintrospector));
    }

    public volatile MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withInsertedAnnotationIntrospector(annotationintrospector);
    }

    public SerializationConfig withRootName(String s)
    {
        if (s != null ? s.equals(_rootName) : _rootName == null)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, s);
        }
    }

    public volatile MapperConfigBase withRootName(String s)
    {
        return withRootName(s);
    }

    public SerializationConfig withSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        if (_serializationInclusion == include)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, include);
        }
    }

    public SerializationConfig withView(Class class1)
    {
        if (_view == class1)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, class1);
        }
    }

    public volatile MapperConfigBase withView(Class class1)
    {
        return withView(class1);
    }

    public SerializationConfig withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
    {
        return _withBase(_base.withVisibility(propertyaccessor, visibility));
    }

    public volatile MapperConfigBase withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
    {
        return withVisibility(propertyaccessor, visibility);
    }

    public SerializationConfig without(SerializationFeature serializationfeature)
    {
        int i = _serFeatures;
        i = ~serializationfeature.getMask() & i;
        if (i == _serFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, _mapperFeatures, i);
        }
    }

    public transient SerializationConfig without(SerializationFeature serializationfeature, SerializationFeature aserializationfeature[])
    {
        int i = _serFeatures;
        int k = ~serializationfeature.getMask() & i;
        int l = aserializationfeature.length;
        for (int j = 0; j < l; j++)
        {
            k &= ~aserializationfeature[j].getMask();
        }

        if (k == _serFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, _mapperFeatures, k);
        }
    }

    public transient SerializationConfig without(MapperFeature amapperfeature[])
    {
        int j = _mapperFeatures;
        int k = amapperfeature.length;
        for (int i = 0; i < k; i++)
        {
            j &= ~amapperfeature[i].getMask();
        }

        if (j == _mapperFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, j, _serFeatures);
        }
    }

    public volatile MapperConfig without(MapperFeature amapperfeature[])
    {
        return without(amapperfeature);
    }

    public transient SerializationConfig withoutFeatures(SerializationFeature aserializationfeature[])
    {
        int j = _serFeatures;
        int k = aserializationfeature.length;
        for (int i = 0; i < k; i++)
        {
            j &= ~aserializationfeature[i].getMask();
        }

        if (j == _serFeatures)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, _mapperFeatures, j);
        }
    }
}
