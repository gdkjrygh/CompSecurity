// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.deser.BeanDeserializerBase;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
import com.fasterxml.jackson.databind.deser.ValueInstantiator;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.HashSet;

// Referenced classes of package com.fasterxml.jackson.databind.deser.impl:
//            PropertyBasedCreator, PropertyValueBuffer, ObjectIdReader

public class BeanAsArrayDeserializer extends BeanDeserializerBase
{

    protected final BeanDeserializerBase _delegate;
    protected final SettableBeanProperty _orderedProperties[];

    public BeanAsArrayDeserializer(BeanDeserializerBase beandeserializerbase, SettableBeanProperty asettablebeanproperty[])
    {
        super(beandeserializerbase);
        _delegate = beandeserializerbase;
        _orderedProperties = asettablebeanproperty;
    }

    protected Object _deserializeFromNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        throw deserializationcontext.mappingException((new StringBuilder("Can not deserialize a POJO (of type ")).append(_beanType.getRawClass().getName()).append(") from non-Array representation (token: ").append(jsonparser.getCurrentToken()).append("): type/property designed to be serialized as JSON Array").toString());
    }

    protected Object _deserializeNonVanilla(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
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
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
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
        throws IOException, JsonProcessingException
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
_L3:
        Object obj1;
        Object obj2;
        if (jsonparser.nextToken() == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_309;
        }
        if (i < j)
        {
            obj2 = asettablebeanproperty[i];
        } else
        {
            obj2 = null;
        }
        if (obj2 != null) goto _L2; else goto _L1
_L1:
        jsonparser.skipChildren();
        obj1 = obj;
_L4:
        i++;
        obj = obj1;
          goto _L3
_L2:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        ((SettableBeanProperty) (obj2)).deserializeAndSet(jsonparser, deserializationcontext, obj);
        obj1 = obj;
          goto _L4
        obj1;
        wrapAndThrow(((Throwable) (obj1)), obj, ((SettableBeanProperty) (obj2)).getName(), deserializationcontext);
        obj1 = obj;
          goto _L4
        String s;
        SettableBeanProperty settablebeanproperty;
        s = ((SettableBeanProperty) (obj2)).getName();
        settablebeanproperty = propertybasedcreator.findCreatorProperty(s);
        if (settablebeanproperty == null)
        {
            break MISSING_BLOCK_LABEL_276;
        }
        obj2 = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
        obj1 = obj;
        if (!propertyvaluebuffer.assignParameter(settablebeanproperty.getCreatorIndex(), obj2)) goto _L4; else goto _L5
_L5:
        obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        obj = obj1;
        obj1 = obj;
        if (obj.getClass() != _beanType.getRawClass())
        {
            throw deserializationcontext.mappingException((new StringBuilder("Can not support implicit polymorphic deserialization for POJOs-as-Arrays style: nominal type ")).append(_beanType.getRawClass().getName()).append(", actual type ").append(obj.getClass().getName()).toString());
        }
          goto _L4
        obj1;
        wrapAndThrow(((Throwable) (obj1)), _beanType.getRawClass(), s, deserializationcontext);
        obj1 = obj;
          goto _L4
        obj1 = obj;
        if (!propertyvaluebuffer.readIdProperty(s))
        {
            propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj2)), ((SettableBeanProperty) (obj2)).deserialize(jsonparser, deserializationcontext));
            obj1 = obj;
        }
          goto _L4
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
        throws IOException, JsonProcessingException
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

    protected BeanDeserializerBase asArrayDeserializer()
    {
        return this;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (jsonparser.getCurrentToken() != JsonToken.START_ARRAY)
        {
            return _deserializeFromNonArray(jsonparser, deserializationcontext);
        }
        if (!_vanillaProcessing)
        {
            return _deserializeNonVanilla(jsonparser, deserializationcontext);
        }
        Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
        SettableBeanProperty asettablebeanproperty[] = _orderedProperties;
        int i = 0;
        int j = asettablebeanproperty.length;
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
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, settablebeanproperty.getName(), deserializationcontext);
                }
            } else
            {
                jsonparser.skipChildren();
            }
            i++;
        } while (true);
        if (!_ignoreAllUnknown)
        {
            throw deserializationcontext.mappingException((new StringBuilder("Unexpected JSON values; expected at most ")).append(j).append(" properties (in JSON Array)").toString());
        }
        for (; jsonparser.nextToken() != JsonToken.END_ARRAY; jsonparser.skipChildren()) { }
        return obj;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
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
_L3:
        if (jsonparser.nextToken() != JsonToken.END_ARRAY) goto _L2; else goto _L1
_L1:
        return obj;
_L2:
label0:
        {
            if (i == j)
            {
                break label0;
            }
            SettableBeanProperty settablebeanproperty = asettablebeanproperty[i];
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, settablebeanproperty.getName(), deserializationcontext);
                }
            } else
            {
                jsonparser.skipChildren();
            }
            i++;
        }
          goto _L3
        if (!_ignoreAllUnknown)
        {
            throw deserializationcontext.mappingException((new StringBuilder("Unexpected JSON values; expected at most ")).append(j).append(" properties (in JSON Array)").toString());
        }
        while (jsonparser.nextToken() != JsonToken.END_ARRAY) 
        {
            jsonparser.skipChildren();
        }
          goto _L1
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
    {
        return _delegate.unwrappingDeserializer(nametransformer);
    }

    public volatile BeanDeserializerBase withIgnorableProperties(HashSet hashset)
    {
        return withIgnorableProperties(hashset);
    }

    public BeanAsArrayDeserializer withIgnorableProperties(HashSet hashset)
    {
        return new BeanAsArrayDeserializer(_delegate.withIgnorableProperties(hashset), _orderedProperties);
    }

    public volatile BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
    {
        return withObjectIdReader(objectidreader);
    }

    public BeanAsArrayDeserializer withObjectIdReader(ObjectIdReader objectidreader)
    {
        return new BeanAsArrayDeserializer(_delegate.withObjectIdReader(objectidreader), _orderedProperties);
    }
}
