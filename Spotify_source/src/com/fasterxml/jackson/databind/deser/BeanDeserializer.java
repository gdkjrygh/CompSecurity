// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            BeanDeserializerBase, ValueInstantiator, SettableBeanProperty, SettableAnyProperty, 
//            BeanDeserializerBuilder

public class BeanDeserializer extends BeanDeserializerBase
    implements Serializable
{

    private static final long serialVersionUID = 1L;

    public BeanDeserializer(BeanDeserializerBase beandeserializerbase)
    {
        super(beandeserializerbase, beandeserializerbase._ignoreAllUnknown);
    }

    public BeanDeserializer(BeanDeserializerBase beandeserializerbase, ObjectIdReader objectidreader)
    {
        super(beandeserializerbase, objectidreader);
    }

    public BeanDeserializer(BeanDeserializerBase beandeserializerbase, NameTransformer nametransformer)
    {
        super(beandeserializerbase, nametransformer);
    }

    public BeanDeserializer(BeanDeserializerBase beandeserializerbase, HashSet hashset)
    {
        super(beandeserializerbase, hashset);
    }

    public BeanDeserializer(BeanDeserializerBuilder beandeserializerbuilder, BeanDescription beandescription, BeanPropertyMap beanpropertymap, Map map, HashSet hashset, boolean flag, boolean flag1)
    {
        super(beandeserializerbuilder, beandescription, beanpropertymap, map, hashset, flag, flag1);
    }

    private final Object vanillaDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonToken jsontoken)
    {
        Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
        while (jsontoken == JsonToken.FIELD_NAME) 
        {
            jsontoken = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(jsontoken);
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, jsontoken, deserializationcontext);
                }
            } else
            {
                handleUnknownVanilla(jsonparser, deserializationcontext, obj, jsontoken);
            }
            jsontoken = jsonparser.nextToken();
        }
        return obj;
    }

    protected final Object _deserializeOther(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonToken jsontoken)
    {
        class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
        {
        default:
            throw deserializationcontext.mappingException(handledType());

        case 1: // '\001'
            return deserializeFromString(jsonparser, deserializationcontext);

        case 2: // '\002'
            return deserializeFromNumber(jsonparser, deserializationcontext);

        case 3: // '\003'
            return deserializeFromDouble(jsonparser, deserializationcontext);

        case 4: // '\004'
            return deserializeFromEmbedded(jsonparser, deserializationcontext);

        case 5: // '\005'
        case 6: // '\006'
            return deserializeFromBoolean(jsonparser, deserializationcontext);

        case 7: // '\007'
            return deserializeFromArray(jsonparser, deserializationcontext);

        case 8: // '\b'
        case 9: // '\t'
            break;
        }
        if (_vanillaProcessing)
        {
            return vanillaDeserialize(jsonparser, deserializationcontext, jsontoken);
        }
        if (_objectIdReader != null)
        {
            return deserializeWithObjectId(jsonparser, deserializationcontext);
        } else
        {
            return deserializeFromObject(jsonparser, deserializationcontext);
        }
    }

    public Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj2 = null;
        PropertyBasedCreator propertybasedcreator = _propertyBasedCreator;
        PropertyValueBuffer propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        Object obj1 = jsonparser.getCurrentToken();
        Object obj = null;
        while (obj1 == JsonToken.FIELD_NAME) 
        {
            Object obj3 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = propertybasedcreator.findCreatorProperty(((String) (obj3)));
            if (settablebeanproperty != null)
            {
                Object obj4 = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
                obj1 = obj;
                if (propertyvaluebuffer.assignParameter(settablebeanproperty.getCreatorIndex(), obj4))
                {
                    jsonparser.nextToken();
                    try
                    {
                        obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj1)
                    {
                        wrapAndThrow(((Throwable) (obj1)), _beanType.getRawClass(), ((String) (obj3)), deserializationcontext);
                        obj1 = obj2;
                    }
                    if (obj1.getClass() != _beanType.getRawClass())
                    {
                        return handlePolymorphic(jsonparser, deserializationcontext, obj1, ((TokenBuffer) (obj)));
                    }
                    obj2 = obj1;
                    if (obj != null)
                    {
                        obj2 = handleUnknownProperties(deserializationcontext, obj1, ((TokenBuffer) (obj)));
                    }
                    return deserialize(jsonparser, deserializationcontext, obj2);
                }
            } else
            {
                obj1 = obj;
                if (!propertyvaluebuffer.readIdProperty(((String) (obj3))))
                {
                    obj1 = _beanProperties.find(((String) (obj3)));
                    if (obj1 != null)
                    {
                        propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj1)), ((SettableBeanProperty) (obj1)).deserialize(jsonparser, deserializationcontext));
                        obj1 = obj;
                    } else
                    if (_ignorableProps != null && _ignorableProps.contains(obj3))
                    {
                        handleIgnoredProperty(jsonparser, deserializationcontext, handledType(), ((String) (obj3)));
                        obj1 = obj;
                    } else
                    if (_anySetter != null)
                    {
                        propertyvaluebuffer.bufferAnyProperty(_anySetter, ((String) (obj3)), _anySetter.deserialize(jsonparser, deserializationcontext));
                        obj1 = obj;
                    } else
                    {
                        obj1 = obj;
                        if (obj == null)
                        {
                            obj1 = new TokenBuffer(jsonparser);
                        }
                        ((TokenBuffer) (obj1)).writeFieldName(((String) (obj3)));
                        ((TokenBuffer) (obj1)).copyCurrentStructure(jsonparser);
                    }
                }
            }
            obj3 = jsonparser.nextToken();
            obj = obj1;
            obj1 = obj3;
        }
        try
        {
            jsonparser = ((JsonParser) (propertybasedcreator.build(deserializationcontext, propertyvaluebuffer)));
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapInstantiationProblem(jsonparser, deserializationcontext);
            jsonparser = null;
        }
        if (obj != null)
        {
            if (jsonparser.getClass() != _beanType.getRawClass())
            {
                return handlePolymorphic(null, deserializationcontext, jsonparser, ((TokenBuffer) (obj)));
            } else
            {
                return handleUnknownProperties(deserializationcontext, jsonparser, ((TokenBuffer) (obj)));
            }
        } else
        {
            return jsonparser;
        }
    }

    protected BeanDeserializerBase asArrayDeserializer()
    {
        return new BeanAsArrayDeserializer(this, _beanProperties.getPropertiesInInsertionOrder());
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.START_OBJECT)
        {
            if (_vanillaProcessing)
            {
                return vanillaDeserialize(jsonparser, deserializationcontext, jsonparser.nextToken());
            }
            jsonparser.nextToken();
            if (_objectIdReader != null)
            {
                return deserializeWithObjectId(jsonparser, deserializationcontext);
            } else
            {
                return deserializeFromObject(jsonparser, deserializationcontext);
            }
        } else
        {
            return _deserializeOther(jsonparser, deserializationcontext, jsontoken);
        }
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
        }
        if (_unwrappedPropertyHandler == null) goto _L2; else goto _L1
_L1:
        Object obj1 = deserializeWithUnwrapped(jsonparser, deserializationcontext, obj);
_L4:
        return obj1;
_L2:
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext, obj);
        }
        Object obj2 = jsonparser.getCurrentToken();
        obj1 = obj2;
        if (obj2 == JsonToken.START_OBJECT)
        {
            obj1 = jsonparser.nextToken();
        }
        obj2 = obj1;
        if (_needViewProcesing)
        {
            Class class1 = deserializationcontext.getActiveView();
            obj2 = obj1;
            if (class1 != null)
            {
                return deserializeWithView(jsonparser, deserializationcontext, obj, class1);
            }
        }
        do
        {
            obj1 = obj;
            if (obj2 != JsonToken.FIELD_NAME)
            {
                continue;
            }
            obj1 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            obj2 = _beanProperties.find(((String) (obj1)));
            if (obj2 != null)
            {
                try
                {
                    ((SettableBeanProperty) (obj2)).deserializeAndSet(jsonparser, deserializationcontext, obj);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj, ((String) (obj1)), deserializationcontext);
                }
            } else
            {
                handleUnknownVanilla(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            }
            obj2 = jsonparser.nextToken();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (!_nonStandardCreation)
        {
            break MISSING_BLOCK_LABEL_61;
        }
        if (_unwrappedPropertyHandler == null) goto _L2; else goto _L1
_L1:
        jsonparser = ((JsonParser) (deserializeWithUnwrapped(jsonparser, deserializationcontext)));
_L4:
        return jsonparser;
_L2:
        Object obj;
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext);
        }
        obj = deserializeFromObjectUsingNonDefault(jsonparser, deserializationcontext);
        jsonparser = ((JsonParser) (obj));
        if (_injectables == null) goto _L4; else goto _L3
_L3:
        injectValues(deserializationcontext, obj);
        return obj;
        Object obj3 = _valueInstantiator.createUsingDefault(deserializationcontext);
        if (jsonparser.canReadObjectId())
        {
            Object obj1 = jsonparser.getObjectId();
            if (obj1 != null)
            {
                _handleTypedObjectId(jsonparser, deserializationcontext, obj3, obj1);
            }
        }
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj3);
        }
        if (_needViewProcesing)
        {
            Class class1 = deserializationcontext.getActiveView();
            if (class1 != null)
            {
                return deserializeWithView(jsonparser, deserializationcontext, obj3, class1);
            }
        }
        Object obj2 = jsonparser.getCurrentToken();
        while (obj2 == JsonToken.FIELD_NAME) 
        {
            obj2 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj2)));
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj3);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj3, ((String) (obj2)), deserializationcontext);
                }
            } else
            {
                handleUnknownVanilla(jsonparser, deserializationcontext, obj3, ((String) (obj2)));
            }
            obj2 = jsonparser.nextToken();
        }
        return obj3;
    }

    protected Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        ExternalTypeHandler externaltypehandler;
        TokenBuffer tokenbuffer;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        externaltypehandler = _externalTypeIdHandler.start();
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        tokenbuffer = new TokenBuffer(jsonparser);
        tokenbuffer.writeStartObject();
        obj = jsonparser.getCurrentToken();
_L2:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_328;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_212;
        }
        if (externaltypehandler.handlePropertyValue(jsonparser, deserializationcontext, s, propertyvaluebuffer))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        Object obj1 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getCreatorIndex(), obj1))
        {
            break MISSING_BLOCK_LABEL_171;
        }
        obj = jsonparser.nextToken();
        Object obj2 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        for (; obj == JsonToken.FIELD_NAME; obj = jsonparser.nextToken())
        {
            jsonparser.nextToken();
            tokenbuffer.copyCurrentStructure(jsonparser);
        }

        break; /* Loop/switch isn't completed */
        obj;
        wrapAndThrow(((Throwable) (obj)), _beanType.getRawClass(), s, deserializationcontext);
_L3:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L1:
        if (obj2.getClass() != _beanType.getRawClass())
        {
            throw deserializationcontext.mappingException("Can not create polymorphic instances with unwrapped values");
        } else
        {
            return externaltypehandler.complete(jsonparser, deserializationcontext, obj2);
        }
        if (!propertyvaluebuffer.readIdProperty(s))
        {
            SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
            if (settablebeanproperty != null)
            {
                propertyvaluebuffer.bufferProperty(settablebeanproperty, settablebeanproperty.deserialize(jsonparser, deserializationcontext));
            } else
            if (!externaltypehandler.handlePropertyValue(jsonparser, deserializationcontext, s, null))
            {
                if (_ignorableProps != null && _ignorableProps.contains(s))
                {
                    handleIgnoredProperty(jsonparser, deserializationcontext, handledType(), s);
                } else
                if (_anySetter != null)
                {
                    propertyvaluebuffer.bufferAnyProperty(_anySetter, s, _anySetter.deserialize(jsonparser, deserializationcontext));
                }
            }
        }
          goto _L3
        try
        {
            jsonparser = ((JsonParser) (externaltypehandler.complete(jsonparser, deserializationcontext, propertyvaluebuffer, propertybasedcreator)));
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapInstantiationProblem(jsonparser, deserializationcontext);
            return null;
        }
        return jsonparser;
    }

    protected Object deserializeUsingPropertyBasedWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj;
        TokenBuffer tokenbuffer;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        tokenbuffer = new TokenBuffer(jsonparser);
        tokenbuffer.writeStartObject();
        obj = jsonparser.getCurrentToken();
_L2:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_203;
        }
        Object obj2 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getCreatorIndex(), obj2))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        obj = jsonparser.nextToken();
        Object obj3 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        for (; obj == JsonToken.FIELD_NAME; obj = jsonparser.nextToken())
        {
            jsonparser.nextToken();
            tokenbuffer.copyCurrentStructure(jsonparser);
        }

        break; /* Loop/switch isn't completed */
        obj;
        wrapAndThrow(((Throwable) (obj)), _beanType.getRawClass(), s, deserializationcontext);
_L3:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L1:
        tokenbuffer.writeEndObject();
        if (obj3.getClass() != _beanType.getRawClass())
        {
            tokenbuffer.close();
            throw deserializationcontext.mappingException("Can not create polymorphic instances with unwrapped values");
        } else
        {
            return _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj3, tokenbuffer);
        }
        if (!propertyvaluebuffer.readIdProperty(s))
        {
            SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
            if (settablebeanproperty != null)
            {
                propertyvaluebuffer.bufferProperty(settablebeanproperty, settablebeanproperty.deserialize(jsonparser, deserializationcontext));
            } else
            if (_ignorableProps != null && _ignorableProps.contains(s))
            {
                handleIgnoredProperty(jsonparser, deserializationcontext, handledType(), s);
            } else
            {
                tokenbuffer.writeFieldName(s);
                tokenbuffer.copyCurrentStructure(jsonparser);
                if (_anySetter != null)
                {
                    propertyvaluebuffer.bufferAnyProperty(_anySetter, s, _anySetter.deserialize(jsonparser, deserializationcontext));
                }
            }
        }
          goto _L3
        Object obj1;
        try
        {
            obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            wrapInstantiationProblem(jsonparser, deserializationcontext);
            return null;
        }
        return _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj1, tokenbuffer);
    }

    protected Object deserializeWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (_propertyBasedCreator != null)
        {
            return deserializeUsingPropertyBasedWithExternalTypeId(jsonparser, deserializationcontext);
        } else
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext, _valueInstantiator.createUsingDefault(deserializationcontext));
        }
    }

    protected Object deserializeWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        Class class1;
        Object obj1;
        ExternalTypeHandler externaltypehandler;
        if (_needViewProcesing)
        {
            class1 = deserializationcontext.getActiveView();
        } else
        {
            class1 = null;
        }
        externaltypehandler = _externalTypeIdHandler.start();
        obj1 = jsonparser.getCurrentToken();
        while (obj1 == JsonToken.FIELD_NAME) 
        {
            obj1 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj1)));
            if (settablebeanproperty != null)
            {
                if (jsonparser.getCurrentToken().isScalarValue())
                {
                    externaltypehandler.handleTypePropertyValue(jsonparser, deserializationcontext, ((String) (obj1)), obj);
                }
                if (class1 != null && !settablebeanproperty.visibleInView(class1))
                {
                    jsonparser.skipChildren();
                } else
                {
                    try
                    {
                        settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                    }
                    catch (Exception exception)
                    {
                        wrapAndThrow(exception, obj, ((String) (obj1)), deserializationcontext);
                    }
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj1))
            {
                handleIgnoredProperty(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            } else
            if (!externaltypehandler.handlePropertyValue(jsonparser, deserializationcontext, ((String) (obj1)), obj))
            {
                if (_anySetter != null)
                {
                    try
                    {
                        _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1)));
                    }
                    catch (Exception exception1)
                    {
                        wrapAndThrow(exception1, obj, ((String) (obj1)), deserializationcontext);
                    }
                } else
                {
                    handleUnknownProperty(jsonparser, deserializationcontext, obj, ((String) (obj1)));
                }
            }
            obj1 = jsonparser.nextToken();
        }
        return externaltypehandler.complete(jsonparser, deserializationcontext, obj);
    }

    protected Object deserializeWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_propertyBasedCreator != null)
        {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonparser, deserializationcontext);
        }
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser);
        tokenbuffer.writeStartObject();
        Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
        }
        Class class1;
        if (_needViewProcesing)
        {
            class1 = deserializationcontext.getActiveView();
        } else
        {
            class1 = null;
        }
        while (jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
        {
            String s = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
            if (settablebeanproperty != null)
            {
                if (class1 != null && !settablebeanproperty.visibleInView(class1))
                {
                    jsonparser.skipChildren();
                } else
                {
                    try
                    {
                        settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                    }
                    catch (Exception exception)
                    {
                        wrapAndThrow(exception, obj, s, deserializationcontext);
                    }
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(s))
            {
                handleIgnoredProperty(jsonparser, deserializationcontext, obj, s);
            } else
            {
                tokenbuffer.writeFieldName(s);
                tokenbuffer.copyCurrentStructure(jsonparser);
                if (_anySetter != null)
                {
                    try
                    {
                        _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
                    }
                    catch (Exception exception1)
                    {
                        wrapAndThrow(exception1, obj, s, deserializationcontext);
                    }
                }
            }
            jsonparser.nextToken();
        }
        tokenbuffer.writeEndObject();
        _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj, tokenbuffer);
        return obj;
    }

    protected Object deserializeWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        Object obj2 = jsonparser.getCurrentToken();
        Object obj1 = obj2;
        if (obj2 == JsonToken.START_OBJECT)
        {
            obj1 = jsonparser.nextToken();
        }
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser);
        tokenbuffer.writeStartObject();
        if (_needViewProcesing)
        {
            obj2 = deserializationcontext.getActiveView();
        } else
        {
            obj2 = null;
        }
        while (obj1 == JsonToken.FIELD_NAME) 
        {
            obj1 = jsonparser.getCurrentName();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj1)));
            jsonparser.nextToken();
            if (settablebeanproperty != null)
            {
                if (obj2 != null && !settablebeanproperty.visibleInView(((Class) (obj2))))
                {
                    jsonparser.skipChildren();
                } else
                {
                    try
                    {
                        settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                    }
                    catch (Exception exception)
                    {
                        wrapAndThrow(exception, obj, ((String) (obj1)), deserializationcontext);
                    }
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj1))
            {
                handleIgnoredProperty(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            } else
            {
                tokenbuffer.writeFieldName(((String) (obj1)));
                tokenbuffer.copyCurrentStructure(jsonparser);
                if (_anySetter != null)
                {
                    _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1)));
                }
            }
            obj1 = jsonparser.nextToken();
        }
        tokenbuffer.writeEndObject();
        _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj, tokenbuffer);
        return obj;
    }

    protected final Object deserializeWithView(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, Class class1)
    {
        Object obj1 = jsonparser.getCurrentToken();
        while (obj1 == JsonToken.FIELD_NAME) 
        {
            obj1 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj1)));
            if (settablebeanproperty != null)
            {
                if (!settablebeanproperty.visibleInView(class1))
                {
                    jsonparser.skipChildren();
                } else
                {
                    try
                    {
                        settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj);
                    }
                    catch (Exception exception)
                    {
                        wrapAndThrow(exception, obj, ((String) (obj1)), deserializationcontext);
                    }
                }
            } else
            {
                handleUnknownVanilla(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            }
            obj1 = jsonparser.nextToken();
        }
        return obj;
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
    {
        if (getClass() != com/fasterxml/jackson/databind/deser/BeanDeserializer)
        {
            return this;
        } else
        {
            return new BeanDeserializer(this, nametransformer);
        }
    }

    public BeanDeserializer withIgnorableProperties(HashSet hashset)
    {
        return new BeanDeserializer(this, hashset);
    }

    public volatile BeanDeserializerBase withIgnorableProperties(HashSet hashset)
    {
        return withIgnorableProperties(hashset);
    }

    public BeanDeserializer withObjectIdReader(ObjectIdReader objectidreader)
    {
        return new BeanDeserializer(this, objectidreader);
    }

    public volatile BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
    {
        return withObjectIdReader(objectidreader);
    }
}
