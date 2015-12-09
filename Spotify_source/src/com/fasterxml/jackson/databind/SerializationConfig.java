// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.ser.FilterProvider;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind:
//            SerializationFeature, MapperFeature, AnnotationIntrospector, JavaType, 
//            BeanDescription

public final class SerializationConfig extends MapperConfigBase
    implements Serializable
{

    private static final long serialVersionUID = 0xee408d151217eed1L;
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

    public SerializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, Map map)
    {
        super(basesettings, subtyperesolver, map);
        _serializationInclusion = null;
        _serFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/SerializationFeature);
        _filterProvider = null;
    }

    public final AnnotationIntrospector getAnnotationIntrospector()
    {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS))
        {
            return super.getAnnotationIntrospector();
        } else
        {
            return AnnotationIntrospector.nopInstance();
        }
    }

    public final VisibilityChecker getDefaultVisibilityChecker()
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

    public final FilterProvider getFilterProvider()
    {
        return _filterProvider;
    }

    public final com.fasterxml.jackson.annotation.JsonInclude.Include getSerializationInclusion()
    {
        if (_serializationInclusion != null)
        {
            return _serializationInclusion;
        } else
        {
            return com.fasterxml.jackson.annotation.JsonInclude.Include.ALWAYS;
        }
    }

    public final BeanDescription introspect(JavaType javatype)
    {
        return getClassIntrospector().forSerialization(this, javatype, this);
    }

    public final BeanDescription introspectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forClassAnnotations(this, javatype, this);
    }

    public final boolean isEnabled(SerializationFeature serializationfeature)
    {
        return (_serFeatures & serializationfeature.getMask()) != 0;
    }

    public final String toString()
    {
        return (new StringBuilder("[SerializationConfig: flags=0x")).append(Integer.toHexString(_serFeatures)).append("]").toString();
    }

    public final SerializationConfig with(SerializationFeature serializationfeature)
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

    public final transient SerializationConfig with(MapperFeature amapperfeature[])
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

    public final SerializationConfig withSerializationInclusion(com.fasterxml.jackson.annotation.JsonInclude.Include include)
    {
        if (_serializationInclusion == include)
        {
            return this;
        } else
        {
            return new SerializationConfig(this, include);
        }
    }

    public final SerializationConfig without(SerializationFeature serializationfeature)
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

    public final transient SerializationConfig without(MapperFeature amapperfeature[])
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
}
