// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import java.io.Serializable;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind:
//            DeserializationFeature, JsonMappingException, JavaType, BeanDescription, 
//            AnnotationIntrospector, MapperFeature

public final class DeserializationConfig extends MapperConfigBase
    implements Serializable
{

    protected final int _deserFeatures;
    protected final JsonNodeFactory _nodeFactory;
    protected final int _parserFeatures;
    protected final int _parserFeaturesToChange;
    protected final LinkedNode _problemHandlers;

    private DeserializationConfig(DeserializationConfig deserializationconfig, int i, int j, int k, int l)
    {
        super(deserializationconfig, i);
        _deserFeatures = j;
        _nodeFactory = deserializationconfig._nodeFactory;
        _problemHandlers = deserializationconfig._problemHandlers;
        _parserFeatures = k;
        _parserFeaturesToChange = l;
    }

    public DeserializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, Map map)
    {
        super(basesettings, subtyperesolver, map);
        _deserFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/DeserializationFeature);
        _nodeFactory = JsonNodeFactory.instance;
        _problemHandlers = null;
        _parserFeatures = 0;
        _parserFeaturesToChange = 0;
    }

    public TypeDeserializer findTypeDeserializer(JavaType javatype)
        throws JsonMappingException
    {
        Object obj1 = introspectClassAnnotations(javatype.getRawClass()).getClassInfo();
        Object obj = getAnnotationIntrospector().findTypeResolver(this, ((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)), javatype);
        java.util.Collection collection = null;
        if (obj == null)
        {
            obj1 = getDefaultTyper(javatype);
            obj = obj1;
            if (obj1 == null)
            {
                return null;
            }
        } else
        {
            collection = getSubtypeResolver().collectAndResolveSubtypes(((com.fasterxml.jackson.databind.introspect.AnnotatedClass) (obj1)), this, getAnnotationIntrospector());
        }
        return ((TypeResolverBuilder) (obj)).buildTypeDeserializer(this, javatype, collection);
    }

    public AnnotationIntrospector getAnnotationIntrospector()
    {
        if (isEnabled(MapperFeature.USE_ANNOTATIONS))
        {
            return super.getAnnotationIntrospector();
        } else
        {
            return NopAnnotationIntrospector.instance;
        }
    }

    public VisibilityChecker getDefaultVisibilityChecker()
    {
        VisibilityChecker visibilitychecker1 = super.getDefaultVisibilityChecker();
        VisibilityChecker visibilitychecker = visibilitychecker1;
        if (!isEnabled(MapperFeature.AUTO_DETECT_SETTERS))
        {
            visibilitychecker = visibilitychecker1.withSetterVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
        }
        visibilitychecker1 = visibilitychecker;
        if (!isEnabled(MapperFeature.AUTO_DETECT_CREATORS))
        {
            visibilitychecker1 = visibilitychecker.withCreatorVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
        }
        visibilitychecker = visibilitychecker1;
        if (!isEnabled(MapperFeature.AUTO_DETECT_FIELDS))
        {
            visibilitychecker = visibilitychecker1.withFieldVisibility(com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility.NONE);
        }
        return visibilitychecker;
    }

    public final int getDeserializationFeatures()
    {
        return _deserFeatures;
    }

    public final JsonNodeFactory getNodeFactory()
    {
        return _nodeFactory;
    }

    public LinkedNode getProblemHandlers()
    {
        return _problemHandlers;
    }

    public void initialize(JsonParser jsonparser)
    {
        if (_parserFeaturesToChange != 0)
        {
            int i = jsonparser.getFeatureMask();
            int j = ~_parserFeaturesToChange & i | _parserFeatures;
            if (i != j)
            {
                jsonparser.setFeatureMask(j);
            }
        }
    }

    public BeanDescription introspect(JavaType javatype)
    {
        return getClassIntrospector().forDeserialization(this, javatype, this);
    }

    public BeanDescription introspectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forClassAnnotations(this, javatype, this);
    }

    public BeanDescription introspectForBuilder(JavaType javatype)
    {
        return getClassIntrospector().forDeserializationWithBuilder(this, javatype, this);
    }

    public BeanDescription introspectForCreation(JavaType javatype)
    {
        return getClassIntrospector().forCreation(this, javatype, this);
    }

    public final boolean isEnabled(DeserializationFeature deserializationfeature)
    {
        return (_deserFeatures & deserializationfeature.getMask()) != 0;
    }

    public boolean useRootWrapping()
    {
        if (_rootName != null)
        {
            return _rootName.length() > 0;
        } else
        {
            return isEnabled(DeserializationFeature.UNWRAP_ROOT_VALUE);
        }
    }

    public transient DeserializationConfig with(MapperFeature amapperfeature[])
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
            return new DeserializationConfig(this, j, _deserFeatures, _parserFeatures, _parserFeaturesToChange);
        }
    }

    public transient DeserializationConfig without(MapperFeature amapperfeature[])
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
            return new DeserializationConfig(this, j, _deserFeatures, _parserFeatures, _parserFeaturesToChange);
        }
    }
}
