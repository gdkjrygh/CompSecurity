// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.annotation.ObjectIdGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
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
import com.fasterxml.jackson.databind.PropertyMetadata;
import com.fasterxml.jackson.databind.PropertyName;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.InnerClassProperty;
import com.fasterxml.jackson.databind.deser.impl.ManagedReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReferenceProperty;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdValueProperty;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator;
import com.fasterxml.jackson.databind.deser.impl.ReadableObjectId;
import com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.deser.impl.ValueInjector;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.exc.IgnoredPropertyException;
import com.fasterxml.jackson.databind.introspect.AnnotatedClass;
import com.fasterxml.jackson.databind.introspect.ObjectIdInfo;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.type.ClassKey;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Annotations;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import com.fasterxml.jackson.databind.util.ClassUtil;
import com.fasterxml.jackson.databind.util.Converter;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            ContextualDeserializer, ResolvableDeserializer, BeanDeserializerBuilder, ValueInstantiator, 
//            SettableBeanProperty, UnresolvedForwardReference, SettableAnyProperty

public abstract class BeanDeserializerBase extends StdDeserializer
    implements ContextualDeserializer, ResolvableDeserializer, Serializable
{

    protected static final PropertyName TEMP_PROPERTY_NAME = new PropertyName("#temporary-name");
    protected SettableAnyProperty _anySetter;
    protected final Map _backRefs;
    protected final BeanPropertyMap _beanProperties;
    protected final JavaType _beanType;
    private final transient Annotations _classAnnotations;
    protected JsonDeserializer _delegateDeserializer;
    protected ExternalTypeHandler _externalTypeIdHandler;
    protected final HashSet _ignorableProps;
    protected final boolean _ignoreAllUnknown;
    protected final ValueInjector _injectables[];
    protected final boolean _needViewProcesing;
    protected boolean _nonStandardCreation;
    protected final ObjectIdReader _objectIdReader;
    protected PropertyBasedCreator _propertyBasedCreator;
    protected final com.fasterxml.jackson.annotation.JsonFormat.Shape _serializationShape;
    protected transient HashMap _subDeserializers;
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
        _serializationShape = beandeserializerbase._serializationShape;
        _objectIdReader = objectidreader;
        if (objectidreader == null)
        {
            _beanProperties = beandeserializerbase._beanProperties;
            _vanillaProcessing = beandeserializerbase._vanillaProcessing;
            return;
        } else
        {
            objectidreader = new ObjectIdValueProperty(objectidreader, PropertyMetadata.STD_REQUIRED);
            _beanProperties = beandeserializerbase._beanProperties.withProperty(objectidreader);
            _vanillaProcessing = false;
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
        UnwrappedPropertyHandler unwrappedpropertyhandler;
        UnwrappedPropertyHandler unwrappedpropertyhandler1;
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
        unwrappedpropertyhandler1 = beandeserializerbase._unwrappedPropertyHandler;
        if (nametransformer != null)
        {
            unwrappedpropertyhandler = unwrappedpropertyhandler1;
            if (unwrappedpropertyhandler1 != null)
            {
                unwrappedpropertyhandler = unwrappedpropertyhandler1.renameAll(nametransformer);
            }
            _beanProperties = beandeserializerbase._beanProperties.renameAll(nametransformer);
        } else
        {
            _beanProperties = beandeserializerbase._beanProperties;
            unwrappedpropertyhandler = unwrappedpropertyhandler1;
        }
        _unwrappedPropertyHandler = unwrappedpropertyhandler;
        _needViewProcesing = beandeserializerbase._needViewProcesing;
        _serializationShape = beandeserializerbase._serializationShape;
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
        _serializationShape = beandeserializerbase._serializationShape;
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
        _serializationShape = beandeserializerbase._serializationShape;
        _vanillaProcessing = beandeserializerbase._vanillaProcessing;
    }

    protected BeanDeserializerBase(BeanDeserializerBuilder beandeserializerbuilder, BeanDescription beandescription, BeanPropertyMap beanpropertymap, Map map, HashSet hashset, boolean flag, boolean flag1)
    {
        boolean flag2 = true;
        Object obj = null;
        super(beandescription.getType());
        _classAnnotations = beandescription.getClassInfo().getAnnotations();
        _beanType = beandescription.getType();
        _valueInstantiator = beandeserializerbuilder.getValueInstantiator();
        _beanProperties = beanpropertymap;
        _backRefs = map;
        _ignorableProps = hashset;
        _ignoreAllUnknown = flag;
        _anySetter = beandeserializerbuilder.getAnySetter();
        beanpropertymap = beandeserializerbuilder.getInjectables();
        if (beanpropertymap == null || beanpropertymap.isEmpty())
        {
            beanpropertymap = null;
        } else
        {
            beanpropertymap = (ValueInjector[])beanpropertymap.toArray(new ValueInjector[beanpropertymap.size()]);
        }
        _injectables = beanpropertymap;
        _objectIdReader = beandeserializerbuilder.getObjectIdReader();
        if (_unwrappedPropertyHandler != null || _valueInstantiator.canCreateUsingDelegate() || _valueInstantiator.canCreateFromObjectWith() || !_valueInstantiator.canCreateUsingDefault())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _nonStandardCreation = flag;
        beandeserializerbuilder = beandescription.findExpectedFormat(null);
        if (beandeserializerbuilder == null)
        {
            beandeserializerbuilder = obj;
        } else
        {
            beandeserializerbuilder = beandeserializerbuilder.getShape();
        }
        _serializationShape = beandeserializerbuilder;
        _needViewProcesing = flag1;
        if (!_nonStandardCreation && _injectables == null && !_needViewProcesing && _objectIdReader == null)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        _vanillaProcessing = flag;
    }

    private Throwable throwOrReturnThrowable(Throwable throwable, DeserializationContext deserializationcontext)
        throws IOException
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
            if (!flag || !(throwable instanceof JsonProcessingException))
            {
                throw (IOException)throwable;
            }
        } else
        if (!flag && (throwable instanceof RuntimeException))
        {
            throw (RuntimeException)throwable;
        }
        return throwable;
    }

    protected Object _convertObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, JsonDeserializer jsondeserializer)
        throws IOException
    {
        jsonparser = new TokenBuffer(jsonparser);
        if (obj instanceof String)
        {
            jsonparser.writeString((String)obj);
        } else
        if (obj instanceof Long)
        {
            jsonparser.writeNumber(((Long)obj).longValue());
        } else
        if (obj instanceof Integer)
        {
            jsonparser.writeNumber(((Integer)obj).intValue());
        } else
        {
            jsonparser.writeObject(obj);
        }
        jsonparser = jsonparser.asParser();
        jsonparser.nextToken();
        return jsondeserializer.deserialize(jsonparser, deserializationcontext);
    }

    protected abstract Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException;

    protected JsonDeserializer _findSubclassDeserializer(DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
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
            break MISSING_BLOCK_LABEL_116;
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
        break MISSING_BLOCK_LABEL_116;
        deserializationcontext;
        this;
        JVM INSTR monitorexit ;
        throw deserializationcontext;
        return deserializationcontext;
    }

    protected Object _handleTypedObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, Object obj1)
        throws IOException
    {
        JsonDeserializer jsondeserializer = _objectIdReader.getDeserializer();
        if (jsondeserializer.handledType() == obj1.getClass())
        {
            jsonparser = ((JsonParser) (obj1));
        } else
        {
            jsonparser = ((JsonParser) (_convertObjectId(jsonparser, deserializationcontext, obj1, jsondeserializer)));
        }
        deserializationcontext.findObjectId(jsonparser, _objectIdReader.generator, _objectIdReader.resolver).bindItem(obj);
        obj1 = _objectIdReader.idProperty;
        deserializationcontext = ((DeserializationContext) (obj));
        if (obj1 != null)
        {
            deserializationcontext = ((DeserializationContext) (((SettableBeanProperty) (obj1)).setAndReturn(obj, jsonparser)));
        }
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
        deserializationcontext = settablebeanproperty.getManagedReferenceName();
        if (deserializationcontext == null)
        {
            return settablebeanproperty;
        }
        SettableBeanProperty settablebeanproperty1 = settablebeanproperty.getValueDeserializer().findBackReference(deserializationcontext);
        if (settablebeanproperty1 == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(deserializationcontext).append("': no back reference property found from type ").append(settablebeanproperty.getType()).toString());
        }
        JavaType javatype = _beanType;
        JavaType javatype1 = settablebeanproperty1.getType();
        boolean flag = settablebeanproperty.getType().isContainerType();
        if (!javatype1.getRawClass().isAssignableFrom(javatype.getRawClass()))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Can not handle managed/back reference '").append(deserializationcontext).append("': back reference type (").append(javatype1.getRawClass().getName()).append(") not compatible with managed type (").append(javatype.getRawClass().getName()).append(")").toString());
        } else
        {
            return new ManagedReferenceProperty(settablebeanproperty, deserializationcontext, settablebeanproperty1, _classAnnotations, flag);
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

    protected SettableBeanProperty _resolvedObjectIdProperty(DeserializationContext deserializationcontext, SettableBeanProperty settablebeanproperty)
    {
        deserializationcontext = settablebeanproperty.getObjectIdInfo();
        ObjectIdReader objectidreader = settablebeanproperty.getValueDeserializer().getObjectIdReader();
        if (deserializationcontext == null && objectidreader == null)
        {
            return settablebeanproperty;
        } else
        {
            return new ObjectIdReferenceProperty(settablebeanproperty, deserializationcontext);
        }
    }

    protected abstract BeanDeserializerBase asArrayDeserializer();

    public JsonDeserializer createContextual(DeserializationContext deserializationcontext, BeanProperty beanproperty)
        throws JsonMappingException
    {
        ObjectIdReader objectidreader = _objectIdReader;
        AnnotationIntrospector annotationintrospector = deserializationcontext.getAnnotationIntrospector();
        Object obj;
        Object obj1;
        if (beanproperty == null || annotationintrospector == null)
        {
            obj = null;
        } else
        {
            obj = beanproperty.getMember();
        }
        obj1 = objectidreader;
        if (obj != null)
        {
            obj1 = objectidreader;
            if (annotationintrospector != null)
            {
                beanproperty = annotationintrospector.findObjectIdInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
                obj1 = objectidreader;
                if (beanproperty != null)
                {
                    ObjectIdInfo objectidinfo = annotationintrospector.findObjectReferenceInfo(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), beanproperty);
                    beanproperty = objectidinfo.getGeneratorType();
                    com.fasterxml.jackson.annotation.ObjectIdResolver objectidresolver = deserializationcontext.objectIdResolverInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), objectidinfo);
                    SettableBeanProperty settablebeanproperty;
                    if (beanproperty == com/fasterxml/jackson/annotation/ObjectIdGenerators$PropertyGenerator)
                    {
                        beanproperty = objectidinfo.getPropertyName();
                        settablebeanproperty = findProperty(beanproperty);
                        if (settablebeanproperty == null)
                        {
                            throw new IllegalArgumentException((new StringBuilder()).append("Invalid Object Id definition for ").append(handledType().getName()).append(": can not find property with name '").append(beanproperty).append("'").toString());
                        }
                        beanproperty = settablebeanproperty.getType();
                        obj1 = new PropertyBasedObjectIdGenerator(objectidinfo.getScope());
                    } else
                    {
                        beanproperty = deserializationcontext.constructType(beanproperty);
                        beanproperty = deserializationcontext.getTypeFactory().findTypeParameters(beanproperty, com/fasterxml/jackson/annotation/ObjectIdGenerator)[0];
                        settablebeanproperty = null;
                        obj1 = deserializationcontext.objectIdGeneratorInstance(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)), objectidinfo);
                    }
                    deserializationcontext = deserializationcontext.findRootValueDeserializer(beanproperty);
                    obj1 = ObjectIdReader.construct(beanproperty, objectidinfo.getPropertyName(), ((ObjectIdGenerator) (obj1)), deserializationcontext, settablebeanproperty, objectidresolver);
                }
            }
        }
        deserializationcontext = this;
        beanproperty = deserializationcontext;
        if (obj1 != null)
        {
            beanproperty = deserializationcontext;
            if (obj1 != _objectIdReader)
            {
                beanproperty = deserializationcontext.withObjectIdReader(((ObjectIdReader) (obj1)));
            }
        }
        deserializationcontext = beanproperty;
        if (obj != null)
        {
            obj1 = annotationintrospector.findPropertiesToIgnore(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
            deserializationcontext = beanproperty;
            if (obj1 != null)
            {
                deserializationcontext = beanproperty;
                if (obj1.length != 0)
                {
                    deserializationcontext = beanproperty.withIgnorableProperties(ArrayBuilders.setAndArray(((BeanDeserializerBase) (beanproperty))._ignorableProps, ((Object []) (obj1))));
                }
            }
        }
        obj1 = null;
        beanproperty = ((BeanProperty) (obj1));
        if (obj != null)
        {
            obj = annotationintrospector.findFormat(((com.fasterxml.jackson.databind.introspect.Annotated) (obj)));
            beanproperty = ((BeanProperty) (obj1));
            if (obj != null)
            {
                beanproperty = ((com.fasterxml.jackson.annotation.JsonFormat.Value) (obj)).getShape();
            }
        }
        obj = beanproperty;
        if (beanproperty == null)
        {
            obj = _serializationShape;
        }
        beanproperty = deserializationcontext;
        if (obj == com.fasterxml.jackson.annotation.JsonFormat.Shape.ARRAY)
        {
            beanproperty = deserializationcontext.asArrayDeserializer();
        }
        return beanproperty;
    }

    public Object deserializeFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        JsonParser jsonparser1 = null;
        if (_delegateDeserializer == null) goto _L2; else goto _L1
_L1:
        jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
        jsonparser1 = jsonparser;
        if (_injectables == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        injectValues(deserializationcontext, jsonparser);
        jsonparser1 = jsonparser;
_L6:
        return jsonparser1;
        jsonparser;
        wrapInstantiationProblem(jsonparser, deserializationcontext);
_L4:
        throw deserializationcontext.mappingException(handledType());
_L2:
        if (!deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (jsonparser.nextToken() != JsonToken.END_ARRAY || !deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT))
        {
            Object obj = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
            } else
            {
                return obj;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_ARRAY_AS_NULL_OBJECT)) goto _L4; else goto _L3
_L3:
        if (jsonparser.nextToken() != JsonToken.END_ARRAY)
        {
            throw deserializationcontext.mappingException(handledType(), JsonToken.START_ARRAY);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public Object deserializeFromBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromBoolean())
        {
            jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, jsonparser);
            }
            return jsonparser;
        }
        boolean flag;
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return _valueInstantiator.createFromBoolean(deserializationcontext, flag);
    }

    public Object deserializeFromDouble(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.JsonParser.NumberType.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.INT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()];
        JVM INSTR tableswitch 3 4: default 32
    //                   3 59
    //                   4 59;
           goto _L1 _L2 _L2
_L1:
        if (_delegateDeserializer == null) goto _L4; else goto _L3
_L3:
        jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
_L5:
        return jsonparser;
_L2:
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromDouble())
        {
            Object obj = _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
            jsonparser = ((JsonParser) (obj));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, obj);
                return obj;
            }
        } else
        {
            return _valueInstantiator.createFromDouble(deserializationcontext, jsonparser.getDoubleValue());
        }
        if (true) goto _L5; else goto _L4
_L4:
        throw deserializationcontext.instantiationException(handledType(), "no suitable creator method found to deserialize from JSON floating-point number");
    }

    public Object deserializeFromEmbedded(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_objectIdReader != null)
        {
            return deserializeFromObjectId(jsonparser, deserializationcontext);
        } else
        {
            return jsonparser.getEmbeddedObject();
        }
    }

    public Object deserializeFromNumber(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_objectIdReader == null) goto _L2; else goto _L1
_L1:
        jsonparser = ((JsonParser) (deserializeFromObjectId(jsonparser, deserializationcontext)));
_L4:
        return jsonparser;
_L2:
        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonParser.NumberType[jsonparser.getNumberType().ordinal()])
        {
        default:
            Object obj1;
            if (_delegateDeserializer != null)
            {
                Object obj = _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
                jsonparser = ((JsonParser) (obj));
                if (_injectables != null)
                {
                    injectValues(deserializationcontext, obj);
                    return obj;
                }
            } else
            {
                throw deserializationcontext.instantiationException(handledType(), "no suitable creator method found to deserialize from JSON integer number");
            }
            break;

        case 2: // '\002'
            break; /* Loop/switch isn't completed */

        case 1: // '\001'
            if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromInt())
            {
                obj1 = _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
                jsonparser = ((JsonParser) (obj1));
                if (_injectables != null)
                {
                    injectValues(deserializationcontext, obj1);
                    return obj1;
                }
            } else
            {
                return _valueInstantiator.createFromInt(deserializationcontext, jsonparser.getIntValue());
            }
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromInt())
        {
            obj1 = _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
            jsonparser = ((JsonParser) (obj1));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, obj1);
                return obj1;
            }
        } else
        {
            return _valueInstantiator.createFromLong(deserializationcontext, jsonparser.getLongValue());
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    public abstract Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException;

    protected Object deserializeFromObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object obj = _objectIdReader.readObjectReference(jsonparser, deserializationcontext);
        deserializationcontext = deserializationcontext.findObjectId(obj, _objectIdReader.generator, _objectIdReader.resolver);
        Object obj1 = deserializationcontext.resolve();
        if (obj1 == null)
        {
            throw new UnresolvedForwardReference((new StringBuilder()).append("Could not resolve Object Id [").append(obj).append("] (for ").append(_beanType).append(").").toString(), jsonparser.getCurrentLocation(), deserializationcontext);
        } else
        {
            return obj1;
        }
    }

    protected Object deserializeFromObjectUsingNonDefault(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_propertyBasedCreator != null)
        {
            return _deserializeUsingPropertyBased(jsonparser, deserializationcontext);
        }
        if (_beanType.isAbstract())
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Can not instantiate abstract type ").append(_beanType).append(" (need to add/enable type information?)").toString());
        } else
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("No suitable constructor found for type ").append(_beanType).append(": can not instantiate from JSON object (missing default constructor or creator, or perhaps need to add/enable type information?)").toString());
        }
    }

    public Object deserializeFromString(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_objectIdReader != null)
        {
            jsonparser = ((JsonParser) (deserializeFromObjectId(jsonparser, deserializationcontext)));
        } else
        if (_delegateDeserializer != null && !_valueInstantiator.canCreateFromString())
        {
            Object obj = _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
            jsonparser = ((JsonParser) (obj));
            if (_injectables != null)
            {
                injectValues(deserializationcontext, obj);
                return obj;
            }
        } else
        {
            return _valueInstantiator.createFromString(deserializationcontext, jsonparser.getText());
        }
        return jsonparser;
    }

    protected Object deserializeWithObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        return deserializeFromObject(jsonparser, deserializationcontext);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        if (_objectIdReader != null)
        {
            if (jsonparser.canReadObjectId())
            {
                Object obj = jsonparser.getObjectId();
                if (obj != null)
                {
                    return _handleTypedObjectId(jsonparser, deserializationcontext, typedeserializer.deserializeTypedFromObject(jsonparser, deserializationcontext), obj);
                }
            }
            JsonToken jsontoken1 = jsonparser.getCurrentToken();
            if (jsontoken1 != null)
            {
                if (jsontoken1.isScalarValue())
                {
                    return deserializeFromObjectId(jsonparser, deserializationcontext);
                }
                JsonToken jsontoken = jsontoken1;
                if (jsontoken1 == JsonToken.START_OBJECT)
                {
                    jsontoken = jsonparser.nextToken();
                }
                if (jsontoken == JsonToken.FIELD_NAME && _objectIdReader.maySerializeAsObject() && _objectIdReader.isValidReferencePropertyName(jsonparser.getCurrentName(), jsonparser))
                {
                    return deserializeFromObjectId(jsonparser, deserializationcontext);
                }
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

    protected JsonDeserializer findConvertingDeserializer(DeserializationContext deserializationcontext, SettableBeanProperty settablebeanproperty)
        throws JsonMappingException
    {
        Object obj = deserializationcontext.getAnnotationIntrospector();
        if (obj != null)
        {
            obj = ((AnnotationIntrospector) (obj)).findDeserializationConverter(settablebeanproperty.getMember());
            if (obj != null)
            {
                obj = deserializationcontext.converterInstance(settablebeanproperty.getMember(), obj);
                JavaType javatype = ((Converter) (obj)).getInputType(deserializationcontext.getTypeFactory());
                return new StdDelegatingDeserializer(((Converter) (obj)), javatype, deserializationcontext.findContextualValueDeserializer(javatype, settablebeanproperty));
            }
        }
        return null;
    }

    public SettableBeanProperty findProperty(PropertyName propertyname)
    {
        return findProperty(propertyname.getSimpleName());
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

    public ValueInstantiator getValueInstantiator()
    {
        return _valueInstantiator;
    }

    protected void handleIgnoredProperty(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        if (deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES))
        {
            throw IgnoredPropertyException.from(jsonparser, obj, s, getKnownPropertyNames());
        } else
        {
            jsonparser.skipChildren();
            return;
        }
    }

    protected Object handlePolymorphic(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
    {
        JsonDeserializer jsondeserializer = _findSubclassDeserializer(deserializationcontext, obj, tokenbuffer);
        if (jsondeserializer != null)
        {
            Object obj1 = obj;
            if (tokenbuffer != null)
            {
                tokenbuffer.writeEndObject();
                tokenbuffer = tokenbuffer.asParser();
                tokenbuffer.nextToken();
                obj1 = jsondeserializer.deserialize(tokenbuffer, deserializationcontext, obj);
            }
            obj = obj1;
            if (jsonparser != null)
            {
                obj = jsondeserializer.deserialize(jsonparser, deserializationcontext, obj1);
            }
            return obj;
        }
        Object obj2 = obj;
        if (tokenbuffer != null)
        {
            obj2 = handleUnknownProperties(deserializationcontext, obj, tokenbuffer);
        }
        obj = obj2;
        if (jsonparser != null)
        {
            obj = deserialize(jsonparser, deserializationcontext, obj2);
        }
        return obj;
    }

    protected Object handleUnknownProperties(DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
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
        throws IOException, JsonProcessingException
    {
        if (_ignoreAllUnknown)
        {
            jsonparser.skipChildren();
            return;
        }
        if (_ignorableProps != null && _ignorableProps.contains(s))
        {
            handleIgnoredProperty(jsonparser, deserializationcontext, obj, s);
        }
        super.handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
    }

    protected void handleUnknownVanilla(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        if (_ignorableProps != null && _ignorableProps.contains(s))
        {
            handleIgnoredProperty(jsonparser, deserializationcontext, obj, s);
            return;
        }
        if (_anySetter != null)
        {
            try
            {
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                wrapAndThrow(jsonparser, obj, s, deserializationcontext);
            }
            return;
        } else
        {
            handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
            return;
        }
    }

    public Class handledType()
    {
        return _beanType.getRawClass();
    }

    protected void injectValues(DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
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

    public void resolve(DeserializationContext deserializationcontext)
        throws JsonMappingException
    {
        Object obj4;
        Object obj5;
        Iterator iterator1;
        Object obj = null;
        obj4 = null;
        if (_valueInstantiator.canCreateFromObjectWith())
        {
            obj = _valueInstantiator.getFromObjectArguments(deserializationcontext.getConfig());
            _propertyBasedCreator = PropertyBasedCreator.construct(deserializationcontext, _valueInstantiator, ((SettableBeanProperty []) (obj)));
            Iterator iterator = _propertyBasedCreator.properties().iterator();
            do
            {
                obj = obj4;
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
                        obj = obj4;
                        if (obj4 == null)
                        {
                            obj = new com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder();
                        }
                        ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder) (obj)).addExternal(settablebeanproperty, typedeserializer);
                        obj4 = obj;
                    }
                }
            } while (true);
        }
        obj4 = null;
        iterator1 = _beanProperties.iterator();
        obj5 = obj;
_L6:
        SettableBeanProperty settablebeanproperty1;
        SettableBeanProperty settablebeanproperty3;
        if (!iterator1.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        settablebeanproperty3 = (SettableBeanProperty)iterator1.next();
        settablebeanproperty1 = settablebeanproperty3;
        if (settablebeanproperty1.hasValueDeserializer()) goto _L2; else goto _L1
_L1:
        Object obj1;
        JsonDeserializer jsondeserializer = findConvertingDeserializer(deserializationcontext, settablebeanproperty1);
        obj1 = jsondeserializer;
        if (jsondeserializer == null)
        {
            obj1 = findDeserializer(deserializationcontext, settablebeanproperty1.getType(), settablebeanproperty1);
        }
        obj1 = settablebeanproperty1.withValueDeserializer(((JsonDeserializer) (obj1)));
_L4:
        settablebeanproperty1 = _resolveManagedReferenceProperty(deserializationcontext, ((SettableBeanProperty) (obj1)));
        obj1 = settablebeanproperty1;
        if (!(settablebeanproperty1 instanceof ManagedReferenceProperty))
        {
            obj1 = _resolvedObjectIdProperty(deserializationcontext, settablebeanproperty1);
        }
        settablebeanproperty1 = _resolveUnwrappedProperty(deserializationcontext, ((SettableBeanProperty) (obj1)));
        if (settablebeanproperty1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = obj4;
        if (obj4 == null)
        {
            obj1 = new UnwrappedPropertyHandler();
        }
        ((UnwrappedPropertyHandler) (obj1)).addProperty(settablebeanproperty1);
        _beanProperties.remove(settablebeanproperty1);
        obj4 = obj1;
        continue; /* Loop/switch isn't completed */
_L2:
        JsonDeserializer jsondeserializer1 = settablebeanproperty1.getValueDeserializer();
        JsonDeserializer jsondeserializer2 = deserializationcontext.handlePrimaryContextualization(jsondeserializer1, settablebeanproperty1, settablebeanproperty1.getType());
        obj1 = settablebeanproperty1;
        if (jsondeserializer2 != jsondeserializer1)
        {
            obj1 = settablebeanproperty1.withValueDeserializer(jsondeserializer2);
        }
        if (true) goto _L4; else goto _L3
_L3:
        SettableBeanProperty settablebeanproperty2 = _resolveInnerClassValuedProperty(deserializationcontext, ((SettableBeanProperty) (obj1)));
        if (settablebeanproperty2 != settablebeanproperty3)
        {
            _beanProperties.replace(settablebeanproperty2);
        }
        if (settablebeanproperty2.hasValueTypeDeserializer())
        {
            TypeDeserializer typedeserializer1 = settablebeanproperty2.getValueTypeDeserializer();
            if (typedeserializer1.getTypeInclusion() == com.fasterxml.jackson.annotation.JsonTypeInfo.As.EXTERNAL_PROPERTY)
            {
                Object obj2 = obj5;
                if (obj5 == null)
                {
                    obj2 = new com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder();
                }
                ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder) (obj2)).addExternal(settablebeanproperty2, typedeserializer1);
                _beanProperties.remove(settablebeanproperty2);
                obj5 = obj2;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (_anySetter != null && !_anySetter.hasValueDeserializer())
        {
            _anySetter = _anySetter.withValueDeserializer(findDeserializer(deserializationcontext, _anySetter.getType(), _anySetter.getProperty()));
        }
        if (_valueInstantiator.canCreateUsingDelegate())
        {
            JavaType javatype = _valueInstantiator.getDelegateType(deserializationcontext.getConfig());
            if (javatype == null)
            {
                throw new IllegalArgumentException((new StringBuilder()).append("Invalid delegate-creator definition for ").append(_beanType).append(": value instantiator (").append(_valueInstantiator.getClass().getName()).append(") returned true for 'canCreateUsingDelegate()', but null for 'getDelegateType()'").toString());
            }
            Object obj3 = _valueInstantiator.getDelegateCreator();
            com.fasterxml.jackson.databind.BeanProperty.Std std = new com.fasterxml.jackson.databind.BeanProperty.Std(TEMP_PROPERTY_NAME, javatype, null, _classAnnotations, ((com.fasterxml.jackson.databind.introspect.AnnotatedMember) (obj3)), PropertyMetadata.STD_OPTIONAL);
            Object obj6 = (TypeDeserializer)javatype.getTypeHandler();
            obj3 = obj6;
            if (obj6 == null)
            {
                obj3 = deserializationcontext.getConfig().findTypeDeserializer(javatype);
            }
            obj6 = findDeserializer(deserializationcontext, javatype, std);
            deserializationcontext = ((DeserializationContext) (obj6));
            if (obj3 != null)
            {
                deserializationcontext = new TypeWrappedDeserializer(((TypeDeserializer) (obj3)).forProperty(std), ((JsonDeserializer) (obj6)));
            }
            _delegateDeserializer = deserializationcontext;
        }
        if (obj5 != null)
        {
            _externalTypeIdHandler = ((com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler.Builder) (obj5)).build();
            _nonStandardCreation = true;
        }
        _unwrappedPropertyHandler = ((UnwrappedPropertyHandler) (obj4));
        if (obj4 != null)
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
    }

    public abstract JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer);

    public abstract BeanDeserializerBase withIgnorableProperties(HashSet hashset);

    public abstract BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader);

    public void wrapAndThrow(Throwable throwable, Object obj, String s, DeserializationContext deserializationcontext)
        throws IOException
    {
        throw JsonMappingException.wrapWithPath(throwOrReturnThrowable(throwable, deserializationcontext), obj, s);
    }

    protected void wrapInstantiationProblem(Throwable throwable, DeserializationContext deserializationcontext)
        throws IOException
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
