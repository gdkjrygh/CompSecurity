// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.lang.reflect.Method;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyBasedCreator, PropertyValueBuffer, ObjectIdReader

public class BeanAsArrayBuilderDeserializer extends BeanDeserializerBase
{

    private static final long serialVersionUID = 1L;
    protected final AnnotatedMethod _buildMethod;
    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty _orderedProperties[];

    public BeanAsArrayBuilderDeserializer(BeanDeserializerBase beandeserializerbase, SettableBeanProperty asettablebeanproperty[], AnnotatedMethod annotatedmethod)
    {
        super(beandeserializerbase);
        _delegate = beandeserializerbase;
        _orderedProperties = asettablebeanproperty;
        _buildMethod = annotatedmethod;
    }

    protected Object _deserializeFromNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not deserialize a POJO (of type ")).append(_beanType.getRawClass().getName()).append(") from non-Array representation (token: ").append(jsonparser.getCurrentToken()).append("): type/property designed to be serialized as JSON Array").toString());
    }

    protected Object _deserializeNonVanilla(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (_nonStandardCreation)
        {
            return _deserializeWithCreator(jsonparser, deserializationcontext);
        }
        Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
        }
        Class class1;
        SettableBeanProperty asettablebeanproperty[];
        int i;
        int j;
        if (_needViewProcesing)
        {
            class1 = deserializationcontext.getActiveView();
        } else
        {
            class1 = null;
        }
        asettablebeanproperty = _orderedProperties;
        i = 0;
        j = asettablebeanproperty.length;
        do
        {
            if (jsonparser.nextToken() == JsonToken.END_ARRAY)
            {
                return obj;
            }
            if (i == j)
            {
                break;
            }
            SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
            i++;
            if (settablebeanproperty != null && (class1 == null || settablebeanproperty.visibleInView(class1)))
            {
                try
                {
                    settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, settablebeanproperty.getName(), deserializationcontext);
                }
            } else
            {
                jsonparser.skipChildren();
            }
        } while (true);
        if (!_ignoreAllUnknown)
        {
            throw deserializationcontext.mappingException((new StringBuilder("Unexpected JSON values; expected at most ")).append(j).append(" properties (in JSON Array)").toString());
        }
        for (; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren()) { }
        return obj;
    }

    protected final Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        SettableBeanProperty asettablebeanproperty[];
        int i;
        int j;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        asettablebeanproperty = _orderedProperties;
        j = asettablebeanproperty.length;
        i = 0;
        obj = null;
_L1:
        Object obj1;
        Object obj2;
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_308;
        }
        if (i < j)
        {
            obj2 = asettablebeanproperty[i];
        } else
        {
            obj2 = null;
        }
        if (obj2 == null)
        {
            jsonparser.skipChildren();
            obj1 = obj;
        } else
        {
label0:
            {
                if (obj == null)
                {
                    break label0;
                }
                try
                {
                    obj1 = ((SettableBeanProperty) (obj2)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    wrapAndThrow(((Throwable) (obj1)), obj, ((SettableBeanProperty) (obj2)).getName(), deserializationcontext);
                    obj1 = obj;
                }
            }
        }
_L3:
        i++;
        obj = obj1;
          goto _L1
        String s;
        SettableBeanProperty settablebeanproperty;
        s = ((SettableBeanProperty) (obj2)).getName();
        settablebeanproperty = propertybasedcreator.findCreatorProperty(s);
        if (settablebeanproperty == null)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        obj2 = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
        obj1 = obj;
        if (!propertyvaluebuffer.assignParameter(settablebeanproperty.getCreatorIndex(), obj2)) goto _L3; else goto _L2
_L2:
        obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        obj = obj1;
        obj1 = obj;
        if (obj.getClass() != _beanType.getRawClass())
        {
            throw deserializationcontext.mappingException((new StringBuilder("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type ")).append(_beanType.getRawClass().getName()).append(", actual type ").append(obj.getClass().getName()).toString());
        }
          goto _L3
        obj1;
        wrapAndThrow(((Throwable) (obj1)), _beanType.getRawClass(), s, deserializationcontext);
        obj1 = obj;
          goto _L3
        obj1 = obj;
        if (!propertyvaluebuffer.readIdProperty(s))
        {
            propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj2)), ((SettableBeanProperty) (obj2)).deserialize(jsonparser, deserializationcontext));
            obj1 = obj;
        }
          goto _L3
        jsonparser = ((JsonParser) (obj));
        if (obj == null)
        {
            try
            {
                jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                wrapInstantiationProblem(jsonparser, deserializationcontext);
                return null;
            }
        }
        return jsonparser;
    }

    protected Object _deserializeWithCreator(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
            throw JsonMappingException.from(jsonparser, (new StringBuilder("Can not instantiate abstract type ")).append(_beanType).append(" (need to add/enable type information?)").toString());
        } else
        {
            throw JsonMappingException.from(jsonparser, (new StringBuilder("No suitable constructor found for type ")).append(_beanType).append(": can not instantiate from JSON object (need to add/enable type information?)").toString());
        }
    }

    protected volatile BeanDeserializerBase asArrayDeserializer()
    {
        return asArrayDeserializer();
    }

    protected BeanAsArrayBuilderDeserializer asArrayDeserializer()
    {
        return this;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        SettableBeanProperty asettablebeanproperty[];
        int i;
        int j;
        if (jsonparser.getCurrentToken() != JsonToken.START_ARRAY)
        {
            return finishBuild(deserializationcontext, _deserializeFromNonArray(jsonparser, deserializationcontext));
        }
        if (!_vanillaProcessing)
        {
            return finishBuild(deserializationcontext, _deserializeNonVanilla(jsonparser, deserializationcontext));
        }
        obj = _valueInstantiator.createUsingDefault(deserializationcontext);
        asettablebeanproperty = _orderedProperties;
        i = 0;
        j = asettablebeanproperty.length;
_L2:
        SettableBeanProperty settablebeanproperty;
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            return finishBuild(deserializationcontext, obj);
        }
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_148;
        }
        settablebeanproperty = asettablebeanproperty[i];
        if (settablebeanproperty == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
        obj = obj1;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        wrapAndThrow(exception, obj, settablebeanproperty.getName(), deserializationcontext);
          goto _L3
_L1:
        jsonparser.skipChildren();
          goto _L3
        if (!_ignoreAllUnknown)
        {
            throw deserializationcontext.mappingException((new StringBuilder("Unexpected JSON values; expected at most ")).append(j).append(" properties (in JSON Array)").toString());
        }
        for (; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren()) { }
        return finishBuild(deserializationcontext, obj);
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        SettableBeanProperty asettablebeanproperty[];
        int i;
        int j;
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
        }
        asettablebeanproperty = _orderedProperties;
        i = 0;
        j = asettablebeanproperty.length;
_L2:
        SettableBeanProperty settablebeanproperty;
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            return finishBuild(deserializationcontext, obj);
        }
        if (i == j)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        settablebeanproperty = asettablebeanproperty[i];
        if (settablebeanproperty == null)
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1 = settablebeanproperty.deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
        obj = obj1;
_L3:
        i++;
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        wrapAndThrow(exception, obj, settablebeanproperty.getName(), deserializationcontext);
          goto _L3
_L1:
        jsonparser.skipChildren();
          goto _L3
        if (!_ignoreAllUnknown)
        {
            throw deserializationcontext.mappingException((new StringBuilder("Unexpected JSON values; expected at most ")).append(j).append(" properties (in JSON Array)").toString());
        }
        for (; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren()) { }
        return finishBuild(deserializationcontext, obj);
    }

    public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _deserializeFromNonArray(jsonparser, deserializationcontext);
    }

    protected final Object finishBuild(DeserializationContext deserializationcontext, Object obj)
    {
        try
        {
            obj = _buildMethod.getMember().invoke(obj, new Object[0]);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            wrapInstantiationProblem(((Throwable) (obj)), deserializationcontext);
            return null;
        }
        return obj;
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
    {
        return _delegate.unwrappingDeserializer(nametransformer);
    }

    public volatile BeanDeserializerBase withIgnorableProperties(HashSet hashset)
    {
        return withIgnorableProperties(hashset);
    }

    public BeanAsArrayBuilderDeserializer withIgnorableProperties(HashSet hashset)
    {
        return new BeanAsArrayBuilderDeserializer(_delegate.withIgnorableProperties(hashset), _orderedProperties, _buildMethod);
    }

    public volatile BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
    {
        return withObjectIdReader(objectidreader);
    }

    public BeanAsArrayBuilderDeserializer withObjectIdReader(ObjectIdReader objectidreader)
    {
        return new BeanAsArrayBuilderDeserializer(_delegate.withObjectIdReader(objectidreader), _orderedProperties, _buildMethod);
    }
}
