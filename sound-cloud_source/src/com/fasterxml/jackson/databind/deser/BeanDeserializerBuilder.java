// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.introspect.AnnotatedMember;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.Annotations;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            SettableBeanProperty, BeanDeserializer, AbstractDeserializer, BuilderBasedDeserializer, 
//            SettableAnyProperty, ValueInstantiator

public class BeanDeserializerBuilder
{

    protected SettableAnyProperty _anySetter;
    protected HashMap _backRefProperties;
    protected final BeanDescription _beanDesc;
    protected AnnotatedMethod _buildMethod;
    protected com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value _builderConfig;
    protected final boolean _defaultViewInclusion;
    protected HashSet _ignorableProps;
    protected boolean _ignoreAllUnknown;
    protected List _injectables;
    protected ObjectIdReader _objectIdReader;
    protected final Map _properties = new LinkedHashMap();
    protected ValueInstantiator _valueInstantiator;

    public BeanDeserializerBuilder(BeanDescription beandescription, DeserializationConfig deserializationconfig)
    {
        _beanDesc = beandescription;
        _defaultViewInclusion = deserializationconfig.isEnabled(MapperFeature.DEFAULT_VIEW_INCLUSION);
    }

    public void addBackReferenceProperty(String s, SettableBeanProperty settablebeanproperty)
    {
        if (_backRefProperties == null)
        {
            _backRefProperties = new HashMap(4);
        }
        _backRefProperties.put(s, settablebeanproperty);
        if (_properties != null)
        {
            _properties.remove(settablebeanproperty.getName());
        }
    }

    public void addCreatorProperty(SettableBeanProperty settablebeanproperty)
    {
        addProperty(settablebeanproperty);
    }

    public void addIgnorable(String s)
    {
        if (_ignorableProps == null)
        {
            _ignorableProps = new HashSet();
        }
        _ignorableProps.add(s);
    }

    public void addInjectable(String s, JavaType javatype, Annotations annotations, AnnotatedMember annotatedmember, Object obj)
    {
        if (_injectables == null)
        {
            _injectables = new ArrayList();
        }
        _injectables.add(new ValueInjector(s, javatype, annotations, annotatedmember, obj));
    }

    public void addOrReplaceProperty(SettableBeanProperty settablebeanproperty, boolean flag)
    {
        _properties.put(settablebeanproperty.getName(), settablebeanproperty);
    }

    public void addProperty(SettableBeanProperty settablebeanproperty)
    {
        SettableBeanProperty settablebeanproperty1 = (SettableBeanProperty)_properties.put(settablebeanproperty.getName(), settablebeanproperty);
        if (settablebeanproperty1 != null && settablebeanproperty1 != settablebeanproperty)
        {
            throw new IllegalArgumentException((new StringBuilder("Duplicate property '")).append(settablebeanproperty.getName()).append("' for ").append(_beanDesc.getType()).toString());
        } else
        {
            return;
        }
    }

    public BeanDeserializer build()
    {
label0:
        {
            boolean flag1 = true;
            Object obj = _properties.values();
            BeanPropertyMap beanpropertymap = new BeanPropertyMap(((Collection) (obj)));
            beanpropertymap.assignIndexes();
            boolean flag;
            if (!_defaultViewInclusion)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                break label0;
            }
            obj = ((Collection) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!((SettableBeanProperty)((Iterator) (obj)).next()).hasViews());
            flag = flag1;
        }
        obj = beanpropertymap;
        if (_objectIdReader != null)
        {
            obj = beanpropertymap.withProperty(new ObjectIdValueProperty(_objectIdReader));
        }
        return new BeanDeserializer(this, _beanDesc, ((BeanPropertyMap) (obj)), _backRefProperties, _ignorableProps, _ignoreAllUnknown, flag);
    }

    public AbstractDeserializer buildAbstract()
    {
        return new AbstractDeserializer(this, _beanDesc, _backRefProperties);
    }

    public JsonDeserializer buildBuilderBased(JavaType javatype, String s)
    {
label0:
        {
            boolean flag1 = true;
            if (_buildMethod == null)
            {
                throw new IllegalArgumentException((new StringBuilder("Builder class ")).append(_beanDesc.getBeanClass().getName()).append(" does not have build method '").append(s).append("()'").toString());
            }
            s = _buildMethod.getRawReturnType();
            if (!javatype.getRawClass().isAssignableFrom(s))
            {
                throw new IllegalArgumentException((new StringBuilder("Build method '")).append(_buildMethod.getFullName()).append(" has bad return type (").append(s.getName()).append("), not compatible with POJO type (").append(javatype.getRawClass().getName()).append(")").toString());
            }
            javatype = _properties.values();
            s = new BeanPropertyMap(javatype);
            s.assignIndexes();
            boolean flag;
            if (!_defaultViewInclusion)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                break label0;
            }
            javatype = javatype.iterator();
            do
            {
                if (!javatype.hasNext())
                {
                    break label0;
                }
            } while (!((SettableBeanProperty)javatype.next()).hasViews());
            flag = flag1;
        }
        javatype = s;
        if (_objectIdReader != null)
        {
            javatype = s.withProperty(new ObjectIdValueProperty(_objectIdReader));
        }
        return new BuilderBasedDeserializer(this, _beanDesc, javatype, _backRefProperties, _ignorableProps, _ignoreAllUnknown, flag);
    }

    public SettableBeanProperty findProperty(String s)
    {
        return (SettableBeanProperty)_properties.get(s);
    }

    public SettableAnyProperty getAnySetter()
    {
        return _anySetter;
    }

    public AnnotatedMethod getBuildMethod()
    {
        return _buildMethod;
    }

    public List getInjectables()
    {
        return _injectables;
    }

    public ObjectIdReader getObjectIdReader()
    {
        return _objectIdReader;
    }

    public ValueInstantiator getValueInstantiator()
    {
        return _valueInstantiator;
    }

    public void setAnySetter(SettableAnyProperty settableanyproperty)
    {
        if (_anySetter != null && settableanyproperty != null)
        {
            throw new IllegalStateException("_anySetter already set to non-null");
        } else
        {
            _anySetter = settableanyproperty;
            return;
        }
    }

    public void setIgnoreUnknownProperties(boolean flag)
    {
        _ignoreAllUnknown = flag;
    }

    public void setObjectIdReader(ObjectIdReader objectidreader)
    {
        _objectIdReader = objectidreader;
    }

    public void setPOJOBuilder(AnnotatedMethod annotatedmethod, com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder.Value value)
    {
        _buildMethod = annotatedmethod;
        _builderConfig = value;
    }

    public void setValueInstantiator(ValueInstantiator valueinstantiator)
    {
        _valueInstantiator = valueinstantiator;
    }
}
