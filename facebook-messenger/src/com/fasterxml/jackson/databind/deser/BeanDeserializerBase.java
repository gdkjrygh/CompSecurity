// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.BeanProperty;
import com.fasterxml.jackson.databind.DeserializationConfig;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            ContextualDeserializer, ResolvableDeserializer, BeanDeserializerBuilder, ValueInstantiator, 
//            SettableBeanProperty, AbstractDeserializer, SettableAnyProperty

public abstract class BeanDeserializerBase extends StdDeserializer
    implements ContextualDeserializer, ResolvableDeserializer
{

    protected SettableAnyProperty _anySetter;
    protected final Map _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    protected final Annotations _classAnnotations;
    protected JsonDeserializer _delegateDeserializer;
    protected ExternalTypeHandler _externalTypeIdHandler;
    protected final HashSet _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final ValueInjector _injectables[];
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final ObjectIdReader _objectIdReader;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected HashMap _subDeserializers;
    protected UnwrappedPropertyHandler _unwrappedPropertyHandler;
    protected final ValueInstantiator _valueInstantiator;
    protected boolean _vanillaProcessing;

    protected BeanDeserializerBase(BeanDeserializerBase beandeserializerbase)
    {
        this(beandeserializerbase, beandeserializerbase._ignoreAllUnknown);
    }

    public BeanDeserializerBase(BeanDeserializerBase beandeserializerbase, ObjectIdReader objectidreader)
    {
        super(beandeserializerbase._beanType);
        _classAnnotations = beandeserializerbase._classAnnotations;
        _beanType = beandeserializerbase._beanType;
        _valueInstantiator = beandeserializerbase._valueInstantiator;
        _delegateDeserializer = beandeserializerbase._delegateDeserializer;
        _propertyBasedCreator = beandeserializerbase._propertyBasedCreator;
        _backRefs = beandeserializerbase._backRefs;
        _ignorableProps = beandeserializerbase._ignorableProps;
        _ignoreAllUnknown = beandeserializerbase._ignoreAllUnknown;
        _anySetter = beandeserializerbase._anySetter;
        _injectables = beandeserializerbase._injectables;
        _nonStandardCreation = beandeserializerbase._nonStandardCreation;
        _unwrappedPropertyHandler = beandeserializerbase._unwrappedPropertyHandler;
        _needViewProcesing = beandeserializerbase._needViewProcesing;
        _vanillaProcessing = beandeserializerbase._vanillaProcessing;
        _objectIdReader = objectidreader;
        if (objectidreader == null)
        {
            _beanProperties = beandeserializerbase._beanProperties;
            return;
        } else
        {
            _beanProperties = beandeserializerbase._beanProperties.withProperty(new ObjectIdValueProperty(objectidreader));
            return;
        }
    }

    protected BeanDeserializerBase(BeanDeserializerBase beandeserializerbase, NameTransformer nametransformer)
    {
        super(beandeserializerbase._beanType);
        _classAnnotations = beandeserializerbase._classAnnotations;
        _beanType = beandeserializerbase._beanType;
        _valueInstantiator = beandeserializerbase._valueInstantiator;
        _delegateDeserializer = beandeserializerbase._delegateDeserializer;
        _propertyBasedCreator = beandeserializerbase._propertyBasedCreator;
        _backRefs = beandeserializerbase._backRefs;
        _ignorableProps = beandeserializerbase._ignorableProps;
        boolean flag;
        if (nametransformer != null || beandeserializerbase._ignoreAllUnknown)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _ignoreAllUnknown = flag;
        _anySetter = beandeserializerbase._anySetter;
        _injectables = beandeserializerbase._injectables;
        _objectIdReader = beandeserializerbase._objectIdReader;
        _nonStandardCreation = beandeserializerbase._nonStandardCreation;
        _unwrappedPropertyHandler = beandeserializerbase._unwrappedPropertyHandler;
        if (nametransformer != null)
        {
            if (_unwrappedPropertyHandler != null)
            {
                _unwrappedPropertyHandler.renameAll(nametransformer);
            }
            _beanProperties = beandeserializerbase._beanProperties.renameAll(nametransformer);
        } else
        {
            _beanProperties = beandeserializerbase._beanProperties;
        }
        _needViewProcesing = beandeserializerbase._needViewProcesing;
        _vanillaProcessing = false;
    }

    public BeanDeserializerBase(BeanDeserializerBase beandeserializerbase, HashSet hashset)
    {
        super(beandeserializerbase._beanType);
        _classAnnotations = beandeserializerbase._classAnnotations;
        _beanType = beandeserializerbase._beanType;
        _valueInstantiator = beandeserializerbase._valueInstantiator;
        _delegateDeserializer = beandeserializerbase._delegateDeserializer;
        _propertyBasedCreator = beandeserializerbase._propertyBasedCreator;
        _backRefs = beandeserializerbase._backRefs;
        _ignorableProps = hashset;
        _ignoreAllUnknown = beandeserializerbase._ignoreAllUnknown;
        _anySetter = beandeserializerbase._anySetter;
        _injectables = beandeserializerbase._injectables;
        _nonStandardCreation = beandeserializerbase._nonStandardCreation;
        _unwrappedPropertyHandler = beandeserializerbase._unwrappedPropertyHandler;
        _needViewProcesing = beandeserializerbase._needViewProcesing;
        _vanillaProcessing = beandeserializerbase._vanillaProcessing;
        _objectIdReader = beandeserializerbase._objectIdReader;
        _beanProperties = beandeserializerbase._beanProperties;
    }

    protected BeanDeserializerBase(BeanDeserializerBase beandeserializerbase, boolean flag)
    {
        super(beandeserializerbase._beanType);
        _classAnnotations = beandeserializerbase._classAnnotations;
        _beanType = beandeserializerbase._beanType;
        _valueInstantiator = beandeserializerbase._valueInstantiator;
        _delegateDeserializer = beandeserializerbase._delegateDeserializer;
        _propertyBasedCreator = beandeserializerbase._propertyBasedCreator;
        _beanProperties = beandeserializerbase._beanProperties;
        _backRefs = beandeserializerbase._backRefs;
        _ignorableProps = beandeserializerbase._ignorableProps;
        _ignoreAllUnknown = flag;
        _anySetter = beandeserializerbase._anySetter;
        _injectables = beandeserializerbase._injectables;
        _objectIdReader = beandeserializerbase._objectIdReader;
        _nonStandardCreation = beandeserializerbase._nonStandardCreation;
        _unwrappedPropertyHandler = beandeserializerbase._unwrappedPropertyHandler;
        _needViewProcesing = beandeserializerbase._needViewProcesing;
        _vanillaProcessing = beandeserializerbase._vanillaProcessing;
    }

    protected BeanDeserializerBase(BeanDeserializerBuilder beandeserializerbuilder, BeanDescription beandescription, BeanPropertyMap beanpropertymap, Map map, HashSet hashset, boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        super(beandescription.getType());
        _classAnnotations = beandescription.getClassInfo().getAnnotations();
        _beanType = beandescription.getType();
        _valueInstantiator = beandeserializerbuilder.getValueInstantiator();
        _beanProperties = beanpropertymap;
        _backRefs = map;
        _ignorableProps = hashset;
        _ignoreAllUnknown = flag;
        _anySetter = beandeserializerbuilder.getAnySetter();
        beandescription = beandeserializerbuilder.getInjectables();
        if (beandescription == null || beandescription.isEmpty())
        {
            beandescription = null;
        } else
        {
            beandescription = (ValueInjector[])beandescription.toArray(new ValueInjector[beandescription.size()]);
        }
        _injectables = beandescription;
        _objectIdReader = beandeserializerbuilder.getObjectIdReader();
        if (_unwrappedPropertyHandler != null || _valueInstantiator.canCreateUsingDelegate() || _valueInstantiator.canCreateFromObjectWith() || !_valueInstantiator.canCreateUsingDefault())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _nonStandardCreation = flag;
        _needViewProcesing = flag1;
        if (!_nonStandardCreation && _injectables == null && !_needViewProcesing && _objectIdReader != null)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        _vanillaProcessing = flag;
    }

    protected JsonDeserializer _findSubclassDeserializer(DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
    {
        this;
        JVM INSTR monitorenter ;
        if (_subDeserializers != null)
        {
            break MISSING_BLOCK_LABEL_19;
        }
        tokenbuffer = null;
_L1:
        this;
        JVM INSTR monitorexit ;
        if (tokenbuffer != null)
        {
            return tokenbuffer;
        }
        break MISSING_BLOCK_LABEL_49;
        tokenbuffer = (JsonDeserializer)_subDeserializers.get(new ClassKey(obj.getClass()));
          goto _L1
        deserializationcontext;
        this;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        deserializationcontext = deserializationcontext.findRootValueDeserializer(deserializationcontext.constructType(obj.getClass()));
        if (deserializationcontext == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        this;
        JVM INSTR monitorenter ;
        if (_subDeserializers == null)
        {
            _subDeserializers = new HashMap();
        }
        _subDeserializers.put(new ClassKey(obj.getClass()), deserializationcontext);
        this;
        JVM INSTR monitorexit ;
        return deserializationcontext;
        deserializationcontext;
        this;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        return deserializationcontext;
    }

    protected SettableBeanProperty _resolveInnerClassValuedProperty(DeserializationContext deserializationcontext, SettableBeanProperty settablebeanproperty)
    {
        Object obj;
        Object obj1;
        obj1 = settablebeanproperty.getValueDeserializer();
        obj = settablebeanproperty;
        if (!(obj1 instanceof BeanDeserializerBase)) goto _L2; else goto _L1
_L1:
        obj = settablebeanproperty;
        if (((BeanDeserializerBase)obj1).getValueInstantiator().canCreateUsingDefault()) goto _L2; else goto _L3
_L3:
        Class class1;
        class1 = settablebeanproperty.getType().getRawClass();
        obj1 = ClassUtil.getOuterClass(class1);
        obj = settablebeanproperty;
        if (obj1 == null) goto _L2; else goto _L4
_L4:
        obj = settablebeanproperty;
        if (obj1 != _beanType.getRawClass()) goto _L2; else goto _L5
_L5:
        Constructor aconstructor[];
        int i;
        int j;
        aconstructor = class1.getConstructors();
        j = aconstructor.length;
        i = 0;
_L10:
        obj = settablebeanproperty;
        if (i >= j) goto _L2; else goto _L6
_L6:
        Class aclass[];
        obj = aconstructor[i];
        aclass = ((Constructor) (obj)).getParameterTypes();
        if (aclass.length != 1 || aclass[0] != obj1) goto _L8; else goto _L7
_L7:
        if (deserializationcontext.getConfig().canOverrideAccessModifiers())
        {
            ClassUtil.checkAndFixAccess(((java.lang.reflect.Member) (obj)));
        }
        obj = new InnerClassProperty(settablebeanproperty, ((Constructor) (obj)));
_L2:
        return ((SettableBeanProperty) (obj));
_L8:
        i++;
        if (true) goto _L10; else goto _L9
_L9:
    }

    protected SettableBeanProperty _resolveManagedReferenceProperty(DeserializationContext deserializationcontext, SettableBeanProperty settablebeanproperty)
    {
        String s = settablebeanproperty.getManagedReferenceName();
        if (s == null)
        {
            return settablebeanproperty;
        }
        deserializationcontext = settablebeanproperty.getValueDeserializer();
        boolean flag = false;
        if (deserializationcontext instanceof BeanDeserializerBase)
        {
            deserializationcontext = ((BeanDeserializerBase)deserializationcontext).findBackReference(s);
        } else
        if (deserializationcontext instanceof ContainerDeserializerBase)
        {
            deserializationcontext = ((ContainerDeserializerBase)deserializationcontext).getContentDeserializer();
            if (!(deserializationcontext instanceof BeanDeserializerBase))
            {
                if (deserializationcontext == null)
                {
                    deserializationcontext = "NULL";
                } else
                {
                    deserializationcontext = deserializationcontext.getClass().getName();
                }
                throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': value deserializer is of type ContainerDeserializerBase, but content type is not handled by a BeanDeserializer ").append(" (instead it's of type ").append(deserializationcontext).append(")").toString());
            }
            deserializationcontext = ((BeanDeserializerBase)deserializationcontext).findBackReference(s);
            flag = true;
        } else
        if (deserializationcontext instanceof AbstractDeserializer)
        {
            deserializationcontext = ((AbstractDeserializer)deserializationcontext).findBackReference(s);
        } else
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': type for value deserializer is not BeanDeserializer or ContainerDeserializerBase, but ").append(deserializationcontext.getClass().getName()).toString());
        }
        if (deserializationcontext == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': no back reference property found from type ").append(settablebeanproperty.getType()).toString());
        }
        JavaType javatype = _beanType;
        JavaType javatype1 = deserializationcontext.getType();
        if (!javatype1.getRawClass().isAssignableFrom(javatype.getRawClass()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(s).append("': back reference type (").append(javatype1.getRawClass().getName()).append(") not compatible with managed type (").append(javatype.getRawClass().getName()).append(")").toString());
        } else
        {
            return new ManagedReferenceProperty(settablebeanproperty, s, deserializationcontext, _classAnnotations, flag);
        }
    }

    protected SettableBeanProperty _resolveUnwrappedProperty(DeserializationContext deserializationcontext, SettableBeanProperty settablebeanproperty)
    {
        Object obj = settablebeanproperty.getMember();
        if (obj != null)
        {
            obj = deserializationcontext.getAnnotationIntrospector().findUnwrappingNameTransformer(((com.fasterxml.jackson.databind.introspect.AnnotatedMember) (obj)));
            if (obj != null)
            {
                deserializationcontext = settablebeanproperty.getValueDeserializer();
                obj = deserializationcontext.unwrappingDeserializer(((NameTransformer) (obj)));
                if (obj != deserializationcontext && obj != null)
                {
                    return settablebeanproperty.withValueDeserializer(((JsonDeserializer) (obj)));
                }
            }
        }
        return null;
    }

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
    {
        Object obj4 = null;
        Object obj2 = null;
        Object obj3 = _objectIdReader;
        AnnotationIntrospector annotationintrospector = deserializationcontext.getAnnotationIntrospector();
        Object obj1 = obj3;
        Object obj = obj4;
        if (beanproperty != null)
        {
            obj1 = obj3;
            obj = obj4;
            if (annotationintrospector != null)
            {
                obj = beanproperty.getMember();
                beanproperty = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
                ObjectIdInfo objectidinfo = annotationintrospector.findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
                if (objectidinfo != null)
                {
                    obj1 = objectidinfo.getGeneratorType();
                    if (obj1 == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
                    {
                        obj = objectidinfo.getPropertyName();
                        obj1 = findProperty(((String) (obj)));
                        if (obj1 == null)
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(getBeanClass().getName()).append(": can not find property with name '").append(((String) (obj))).append("'").toString());
                        }
                        obj2 = ((SettableBeanProperty) (obj1)).getType();
                        obj = new PropertyBasedObjectIdGenerator(objectidinfo.getScope());
                    } else
                    {
                        obj1 = deserializationcontext.constructType(((Class) (obj1)));
                        obj3 = deserializationcontext.getTypeFactory().findTypeParameters(((JavaType) (obj1)), com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
                        obj = deserializationcontext.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), objectidinfo);
                        obj1 = obj2;
                        obj2 = obj3;
                    }
                    deserializationcontext = deserializationcontext.findRootValueDeserializer(((JavaType) (obj2)));
                    obj1 = ObjectIdReader.construct(((JavaType) (obj2)), objectidinfo.getPropertyName(), ((ObjectIdGenerator) (obj)), deserializationcontext, ((SettableBeanProperty) (obj1)));
                    obj = beanproperty;
                } else
                {
                    obj1 = obj3;
                    obj = beanproperty;
                }
            }
        }
        if (obj1 != null && obj1 != _objectIdReader)
        {
            deserializationcontext = withObjectIdReader(((ObjectIdReader) (obj1)));
        } else
        {
            deserializationcontext = this;
        }
        beanproperty = deserializationcontext;
        if (obj != null)
        {
            beanproperty = deserializationcontext;
            if (obj.length != 0)
            {
                beanproperty = deserializationcontext.withIgnorableProperties(ArrayBuilders.setAndArray(((BeanDeserializerBase) (deserializationcontext))._ignorableProps, ((Object []) (obj))));
            }
        }
        return beanproperty;
    }

    public Iterator creatorProperties()
    {
        if (_propertyBasedCreator == null)
        {
            return Collections.emptyList().iterator();
        } else
        {
            return _propertyBasedCreator.properties().iterator();
        }
    }

    protected Object deserializeFromObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        jsonparser = ((JsonParser) (_objectIdReader.deserializer.deserialize(jsonparser, deserializationcontext)));
        deserializationcontext = ((DeserializationContext) (deserializationcontext.findObjectId(jsonparser, _objectIdReader.generator).item));
        if (deserializationcontext == null)
        {
            throw new IllegalStateException((new StringBuilder()).append("Could not resolve Object Id [").append(jsonparser).append("] -- unresolved forward-reference?").toString());
        } else
        {
            return deserializationcontext;
        }
    }

    public final Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        if (_objectIdReader != null)
        {
            JsonToken jsontoken = jsonparser.getCurrentToken();
            if (jsontoken != null && jsontoken.isScalarValue())
            {
                return deserializeFromObjectId(jsonparser, deserializationcontext);
            }
        }
        return typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext);
    }

    public SettableBeanProperty findBackReference(String s)
    {
        if (_backRefs == null)
        {
            return null;
        } else
        {
            return (SettableBeanProperty)_backRefs.get(s);
        }
    }

    public SettableBeanProperty findProperty(String s)
    {
        SettableBeanProperty settablebeanproperty;
        SettableBeanProperty settablebeanproperty1;
        if (_beanProperties == null)
        {
            settablebeanproperty = null;
        } else
        {
            settablebeanproperty = _beanProperties.find(s);
        }
        settablebeanproperty1 = settablebeanproperty;
        if (settablebeanproperty == null)
        {
            settablebeanproperty1 = settablebeanproperty;
            if (_propertyBasedCreator != null)
            {
                settablebeanproperty1 = _propertyBasedCreator.findCreatorProperty(s);
            }
        }
        return settablebeanproperty1;
    }

    public final Class getBeanClass()
    {
        return _beanType.getRawClass();
    }

    public Collection getKnownPropertyNames()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = _beanProperties.iterator(); iterator.hasNext(); arraylist.add(((SettableBeanProperty)iterator.next()).getName())) { }
        return arraylist;
    }

    public ObjectIdReader getObjectIdReader()
    {
        return _objectIdReader;
    }

    public int getPropertyCount()
    {
        return _beanProperties.size();
    }

    public ValueInstantiator getValueInstantiator()
    {
        return _valueInstantiator;
    }

    public JavaType getValueType()
    {
        return _beanType;
    }

    protected Object handleUnknownProperties(DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
    {
        tokenbuffer.writeEndObject();
        String s;
        for (tokenbuffer = tokenbuffer.asParser(); tokenbuffer.nextToken() != JsonToken.END_OBJECT; handleUnknownProperty(tokenbuffer, deserializationcontext, obj, s))
        {
            s = tokenbuffer.getCurrentName();
            tokenbuffer.nextToken();
        }

        return obj;
    }

    protected void handleUnknownProperty(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
    {
        if (_ignoreAllUnknown || _ignorableProps != null && _ignorableProps.contains(s))
        {
            jsonparser.skipChildren();
            return;
        } else
        {
            super.handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
            return;
        }
    }

    public boolean hasProperty(String s)
    {
        return _beanProperties.find(s) != null;
    }

    public boolean hasViews()
    {
        return _needViewProcesing;
    }

    protected void injectValues(DeserializationContext deserializationcontext, Object obj)
    {
        ValueInjector avalueinjector[] = _injectables;
        int j = avalueinjector.length;
        for (int i = 0; i < j; i++)
        {
            avalueinjector[i].inject(deserializationcontext, obj);
        }

    }

    public boolean isCachable()
    {
        return true;
    }

    public Iterator properties()
    {
        if (_beanProperties == null)
        {
            throw new IllegalStateException("Can only call after BeanDeserializer has been resolved");
        } else
        {
            return _beanProperties.iterator();
        }
    }

    public void resolve(DeserializationContext deserializationcontext)
    {
        com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder builder1;
        Object obj;
        Iterator iterator1;
        if (_valueInstantiator.canCreateFromObjectWith())
        {
            SettableBeanProperty asettablebeanproperty[] = _valueInstantiator.getFromObjectArguments(deserializationcontext.getConfig());
            _propertyBasedCreator = PropertyBasedCreator.construct(deserializationcontext, _valueInstantiator, asettablebeanproperty);
            Iterator iterator = _propertyBasedCreator.properties().iterator();
            com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder builder = null;
            do
            {
                obj = builder;
                if (!iterator.hasNext())
                {
                    break;
                }
                SettableBeanProperty settablebeanproperty = (SettableBeanProperty)iterator.next();
                if (settablebeanproperty.hasValueTypeDeserializer())
                {
                    TypeDeserializer typedeserializer = settablebeanproperty.getValueTypeDeserializer();
                    if (typedeserializer.getTypeInclusion() == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
                    {
                        obj = builder;
                        if (builder == null)
                        {
                            obj = new com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder();
                        }
                        ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder) (obj)).addExternal(settablebeanproperty, typedeserializer.getPropertyName());
                        builder = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder) (obj));
                    }
                }
            } while (true);
        } else
        {
            obj = null;
        }
        iterator1 = _beanProperties.iterator();
        Object obj1 = null;
        builder1 = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder) (obj));
        obj = obj1;
_L2:
        Object obj2;
        Object obj3;
        Object obj4;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj3 = (SettableBeanProperty)iterator1.next();
        if (!((SettableBeanProperty) (obj3)).hasValueDeserializer())
        {
            obj2 = ((SettableBeanProperty) (obj3)).withValueDeserializer(findDeserializer(deserializationcontext, ((SettableBeanProperty) (obj3)).getType(), ((BeanProperty) (obj3))));
        } else
        {
            obj2 = ((SettableBeanProperty) (obj3)).getValueDeserializer();
            if (!(obj2 instanceof ContextualDeserializer))
            {
                break MISSING_BLOCK_LABEL_612;
            }
            obj4 = ((ContextualDeserializer)obj2).createContextual(deserializationcontext, ((BeanProperty) (obj3)));
            if (obj4 == obj2)
            {
                break MISSING_BLOCK_LABEL_612;
            }
            obj2 = ((SettableBeanProperty) (obj3)).withValueDeserializer(((JsonDeserializer) (obj4)));
        }
_L3:
        obj4 = _resolveManagedReferenceProperty(deserializationcontext, ((SettableBeanProperty) (obj2)));
        obj2 = _resolveUnwrappedProperty(deserializationcontext, ((SettableBeanProperty) (obj4)));
        if (obj2 != null)
        {
            if (obj == null)
            {
                obj = new UnwrappedPropertyHandler();
            }
            ((UnwrappedPropertyHandler) (obj)).addProperty(((SettableBeanProperty) (obj2)));
        } else
        {
            obj2 = _resolveInnerClassValuedProperty(deserializationcontext, ((SettableBeanProperty) (obj4)));
            if (obj2 != obj3)
            {
                _beanProperties.replace(((SettableBeanProperty) (obj2)));
            }
            if (((SettableBeanProperty) (obj2)).hasValueTypeDeserializer())
            {
                obj3 = ((SettableBeanProperty) (obj2)).getValueTypeDeserializer();
                if (((TypeDeserializer) (obj3)).getTypeInclusion() == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
                {
                    if (builder1 == null)
                    {
                        builder1 = new com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder();
                    }
                    builder1.addExternal(((SettableBeanProperty) (obj2)), ((TypeDeserializer) (obj3)).getPropertyName());
                    _beanProperties.remove(((SettableBeanProperty) (obj2)));
                }
            }
        }
        if (true) goto _L2; else goto _L1
_L1:
        if (_anySetter != null && !_anySetter.hasValueDeserializer())
        {
            _anySetter = _anySetter.withValueDeserializer(findDeserializer(deserializationcontext, _anySetter.getType(), _anySetter.getProperty()));
        }
        if (_valueInstantiator.canCreateUsingDelegate())
        {
            obj2 = _valueInstantiator.getDelegateType(deserializationcontext.getConfig());
            if (obj2 == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid delegate-creator definition for ").append(_beanType).append(": value instantiator (").append(_valueInstantiator.getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
            }
            obj3 = _valueInstantiator.getDelegateCreator();
            _delegateDeserializer = findDeserializer(deserializationcontext, ((JavaType) (obj2)), new com.fasterxml.jackson.databind.BeanProperty.Std(null, ((JavaType) (obj2)), _classAnnotations, ((com.fasterxml.jackson.databind.introspect.AnnotatedMember) (obj3))));
        }
        if (builder1 != null)
        {
            _externalTypeIdHandler = builder1.build();
            _nonStandardCreation = true;
        }
        _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) (obj));
        if (obj != null)
        {
            _nonStandardCreation = true;
        }
        boolean flag;
        if (_vanillaProcessing && !_nonStandardCreation)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _vanillaProcessing = flag;
        return;
        obj2 = obj3;
          goto _L3
    }

    public abstract JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer);

    public abstract BeanDeserializerBase withIgnorableProperties(HashSet hashset);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader);

    public void wrapAndThrow(Throwable throwable, Object obj, int i, DeserializationContext deserializationcontext)
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (deserializationcontext == null || deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            if (!flag || !(throwable instanceof JsonMappingException))
            {
                throw (IOException)throwable;
            }
        } else
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        }
        throw JsonMappingException.wrapWithPath(throwable, obj, i);
    }

    public void wrapAndThrow(Throwable throwable, Object obj, String s, DeserializationContext deserializationcontext)
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (deserializationcontext == null || deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            if (!flag || !(throwable instanceof JsonMappingException))
            {
                throw (IOException)throwable;
            }
        } else
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        }
        throw JsonMappingException.wrapWithPath(throwable, obj, s);
    }

    protected void wrapInstantiationProblem(Throwable throwable, DeserializationContext deserializationcontext)
    {
        for (; (throwable instanceof InvocationTargetException) && throwable.getCause() != null; throwable = throwable.getCause()) { }
        if (throwable instanceof Error)
        {
            throw (Error)throwable;
        }
        boolean flag;
        if (deserializationcontext == null || deserializationcontext.isEnabled(DeserializationFeature.WRAP_EXCEPTIONS))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (throwable instanceof IOException)
        {
            throw (IOException)throwable;
        }
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        } else
        {
            throw deserializationcontext.instantiationException(_beanType.getRawClass(), throwable);
        }
    }
}
