// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.databind.cfg.BaseSettings;
import com.fasterxml.jackson.databind.cfg.HandlerInstantiator;
import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.cfg.MapperConfigBase;
import com.fasterxml.jackson.databind.deser.DeserializationProblemHandler;
import com.fasterxml.jackson.databind.introspect.ClassIntrospector;
import com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector;
import com.fasterxml.jackson.databind.introspect.VisibilityChecker;
import com.fasterxml.jackson.databind.jsontype.SubtypeResolver;
import com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.LinkedNode;
import java.text.DateFormat;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

// Referenced classes of package com.fasterxml.jackson.databind:
//            DeserializationFeature, MapperFeature, AnnotationIntrospector, JavaType, 
//            BeanDescription, PropertyNamingStrategy

public final class DeserializationConfig extends MapperConfigBase
{

    protected final int _deserFeatures;
    protected final JsonNodeFactory _nodeFactory;
    protected final LinkedNode _problemHandlers;

    private DeserializationConfig(DeserializationConfig deserializationconfig, int i, int j)
    {
        super(deserializationconfig, i);
        _deserFeatures = j;
        _nodeFactory = deserializationconfig._nodeFactory;
        _problemHandlers = deserializationconfig._problemHandlers;
    }

    private DeserializationConfig(DeserializationConfig deserializationconfig, BaseSettings basesettings)
    {
        super(deserializationconfig, basesettings);
        _deserFeatures = deserializationconfig._deserFeatures;
        _nodeFactory = deserializationconfig._nodeFactory;
        _problemHandlers = deserializationconfig._problemHandlers;
    }

    private DeserializationConfig(DeserializationConfig deserializationconfig, SubtypeResolver subtyperesolver)
    {
        super(deserializationconfig, subtyperesolver);
        _deserFeatures = deserializationconfig._deserFeatures;
        _nodeFactory = deserializationconfig._nodeFactory;
        _problemHandlers = deserializationconfig._problemHandlers;
    }

    private DeserializationConfig(DeserializationConfig deserializationconfig, JsonNodeFactory jsonnodefactory)
    {
        super(deserializationconfig);
        _deserFeatures = deserializationconfig._deserFeatures;
        _problemHandlers = deserializationconfig._problemHandlers;
        _nodeFactory = jsonnodefactory;
    }

    private DeserializationConfig(DeserializationConfig deserializationconfig, LinkedNode linkednode)
    {
        super(deserializationconfig);
        _deserFeatures = deserializationconfig._deserFeatures;
        _problemHandlers = linkednode;
        _nodeFactory = deserializationconfig._nodeFactory;
    }

    private DeserializationConfig(DeserializationConfig deserializationconfig, Class class1)
    {
        super(deserializationconfig, class1);
        _deserFeatures = deserializationconfig._deserFeatures;
        _problemHandlers = deserializationconfig._problemHandlers;
        _nodeFactory = deserializationconfig._nodeFactory;
    }

    private DeserializationConfig(DeserializationConfig deserializationconfig, String s)
    {
        super(deserializationconfig, s);
        _deserFeatures = deserializationconfig._deserFeatures;
        _problemHandlers = deserializationconfig._problemHandlers;
        _nodeFactory = deserializationconfig._nodeFactory;
    }

    public DeserializationConfig(BaseSettings basesettings, SubtypeResolver subtyperesolver, Map map)
    {
        super(basesettings, subtyperesolver, map);
        _deserFeatures = collectFeatureDefaults(com/fasterxml/jackson/databind/DeserializationFeature);
        _nodeFactory = JsonNodeFactory.instance;
        _problemHandlers = null;
    }

    private final DeserializationConfig _withBase(BaseSettings basesettings)
    {
        if (_base == basesettings)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, basesettings);
        }
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

    public Base64Variant getBase64Variant()
    {
        return Base64Variants.getDefaultVariant();
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

    public BeanDescription introspect(JavaType javatype)
    {
        return getClassIntrospector().forDeserialization(this, javatype, this);
    }

    public BeanDescription introspectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forClassAnnotations(this, javatype, this);
    }

    public BeanDescription introspectDirectClassAnnotations(JavaType javatype)
    {
        return getClassIntrospector().forDirectClassAnnotations(this, javatype, this);
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

    public DeserializationConfig with(AnnotationIntrospector annotationintrospector)
    {
        return _withBase(_base.withAnnotationIntrospector(annotationintrospector));
    }

    public DeserializationConfig with(DeserializationFeature deserializationfeature)
    {
        int i = _deserFeatures;
        i = deserializationfeature.getMask() | i;
        if (i == _deserFeatures)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _mapperFeatures, i);
        }
    }

    public transient DeserializationConfig with(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
    {
        int i = _deserFeatures;
        int k = deserializationfeature.getMask() | i;
        int l = adeserializationfeature.length;
        for (int j = 0; j < l; j++)
        {
            k |= adeserializationfeature[j].getMask();
        }

        if (k == _deserFeatures)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _mapperFeatures, k);
        }
    }

    public DeserializationConfig with(PropertyNamingStrategy propertynamingstrategy)
    {
        return _withBase(_base.withPropertyNamingStrategy(propertynamingstrategy));
    }

    public DeserializationConfig with(HandlerInstantiator handlerinstantiator)
    {
        return _withBase(_base.withHandlerInstantiator(handlerinstantiator));
    }

    public DeserializationConfig with(ClassIntrospector classintrospector)
    {
        return _withBase(_base.withClassIntrospector(classintrospector));
    }

    public DeserializationConfig with(VisibilityChecker visibilitychecker)
    {
        return _withBase(_base.withVisibilityChecker(visibilitychecker));
    }

    public DeserializationConfig with(SubtypeResolver subtyperesolver)
    {
        if (_subtypeResolver == subtyperesolver)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, subtyperesolver);
        }
    }

    public DeserializationConfig with(TypeResolverBuilder typeresolverbuilder)
    {
        return _withBase(_base.withTypeResolverBuilder(typeresolverbuilder));
    }

    public DeserializationConfig with(JsonNodeFactory jsonnodefactory)
    {
        if (_nodeFactory == jsonnodefactory)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, jsonnodefactory);
        }
    }

    public DeserializationConfig with(TypeFactory typefactory)
    {
        return _withBase(_base.withTypeFactory(typefactory));
    }

    public DeserializationConfig with(DateFormat dateformat)
    {
        return _withBase(_base.withDateFormat(dateformat));
    }

    public DeserializationConfig with(Locale locale)
    {
        return _withBase(_base.with(locale));
    }

    public DeserializationConfig with(TimeZone timezone)
    {
        return _withBase(_base.with(timezone));
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
            return new DeserializationConfig(this, j, _deserFeatures);
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

    public DeserializationConfig withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return _withBase(_base.withAppendedAnnotationIntrospector(annotationintrospector));
    }

    public volatile MapperConfigBase withAppendedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withAppendedAnnotationIntrospector(annotationintrospector);
    }

    public transient DeserializationConfig withFeatures(DeserializationFeature adeserializationfeature[])
    {
        int j = _deserFeatures;
        int k = adeserializationfeature.length;
        for (int i = 0; i < k; i++)
        {
            j |= adeserializationfeature[i].getMask();
        }

        if (j == _deserFeatures)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _mapperFeatures, j);
        }
    }

    public DeserializationConfig withHandler(DeserializationProblemHandler deserializationproblemhandler)
    {
        if (LinkedNode.contains(_problemHandlers, deserializationproblemhandler))
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, new LinkedNode(deserializationproblemhandler, _problemHandlers));
        }
    }

    public DeserializationConfig withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return _withBase(_base.withInsertedAnnotationIntrospector(annotationintrospector));
    }

    public volatile MapperConfigBase withInsertedAnnotationIntrospector(AnnotationIntrospector annotationintrospector)
    {
        return withInsertedAnnotationIntrospector(annotationintrospector);
    }

    public DeserializationConfig withNoProblemHandlers()
    {
        if (_problemHandlers == null)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, (LinkedNode)null);
        }
    }

    public DeserializationConfig withRootName(String s)
    {
        if (s != null ? s.equals(_rootName) : _rootName == null)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, s);
        }
    }

    public volatile MapperConfigBase withRootName(String s)
    {
        return withRootName(s);
    }

    public DeserializationConfig withView(Class class1)
    {
        if (_view == class1)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, class1);
        }
    }

    public volatile MapperConfigBase withView(Class class1)
    {
        return withView(class1);
    }

    public DeserializationConfig withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
    {
        return _withBase(_base.withVisibility(propertyaccessor, visibility));
    }

    public volatile MapperConfigBase withVisibility(PropertyAccessor propertyaccessor, com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility visibility)
    {
        return withVisibility(propertyaccessor, visibility);
    }

    public DeserializationConfig without(DeserializationFeature deserializationfeature)
    {
        int i = _deserFeatures;
        i = ~deserializationfeature.getMask() & i;
        if (i == _deserFeatures)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _mapperFeatures, i);
        }
    }

    public transient DeserializationConfig without(DeserializationFeature deserializationfeature, DeserializationFeature adeserializationfeature[])
    {
        int i = _deserFeatures;
        int k = ~deserializationfeature.getMask() & i;
        int l = adeserializationfeature.length;
        for (int j = 0; j < l; j++)
        {
            k &= ~adeserializationfeature[j].getMask();
        }

        if (k == _deserFeatures)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _mapperFeatures, k);
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
            return new DeserializationConfig(this, j, _deserFeatures);
        }
    }

    public volatile MapperConfig without(MapperFeature amapperfeature[])
    {
        return without(amapperfeature);
    }

    public transient DeserializationConfig withoutFeatures(DeserializationFeature adeserializationfeature[])
    {
        int j = _deserFeatures;
        int k = adeserializationfeature.length;
        for (int i = 0; i < k; i++)
        {
            j &= ~adeserializationfeature[i].getMask();
        }

        if (j == _deserFeatures)
        {
            return this;
        } else
        {
            return new DeserializationConfig(this, _mapperFeatures, j);
        }
    }
}
