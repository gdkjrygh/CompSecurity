// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.cfg;

import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.type.ClassKey;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.cfg:
//            MapperConfig, ContextAttributes, BaseSettings

public abstract class MapperConfigBase extends MapperConfig
    implements Serializable
{

    private static final int DEFAULT_MAPPER_FEATURES = collectFeatureDefaults(com/fasterxml/jackson/databind/MapperFeature);
    protected final ContextAttributes _attributes;
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
        _attributes = ContextAttributes.getEmpty();
    }

    protected MapperConfigBase(MapperConfigBase mapperconfigbase, int i)
    {
        super(mapperconfigbase._base, i);
        _mixInAnnotations = mapperconfigbase._mixInAnnotations;
        _subtypeResolver = mapperconfigbase._subtypeResolver;
        _rootName = mapperconfigbase._rootName;
        _view = mapperconfigbase._view;
        _attributes = mapperconfigbase._attributes;
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

    public final ContextAttributes getAttributes()
    {
        return _attributes;
    }

    public final String getRootName()
    {
        return _rootName;
    }

    public final SubtypeResolver getSubtypeResolver()
    {
        return _subtypeResolver;
    }

}
