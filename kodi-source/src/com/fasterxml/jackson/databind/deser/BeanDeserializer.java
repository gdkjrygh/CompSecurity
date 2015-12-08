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
import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            BeanDeserializerBase, ValueInstantiator, SettableBeanProperty, SettableAnyProperty, 
//            BeanDeserializerBuilder

public class BeanDeserializer extends BeanDeserializerBase
    implements Serializable
{

    protected BeanDeserializer(BeanDeserializerBase beandeserializerbase)
    {
        super(beandeserializerbase, beandeserializerbase._ignoreAllUnknown);
    }

    public BeanDeserializer(BeanDeserializerBase beandeserializerbase, ObjectIdReader objectidreader)
    {
        super(beandeserializerbase, objectidreader);
    }

    protected BeanDeserializer(BeanDeserializerBase beandeserializerbase, NameTransformer nametransformer)
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
        throws IOException
    {
        Object obj = _valueInstantiator.createUsingDefault(deserializationcontext);
        jsonparser.setCurrentValue(obj);
        for (; jsontoken == JsonToken.FIELD_NAME; jsontoken = jsonparser.nextToken())
        {
            jsontoken = jsonparser.getCurrentName();
            jsonparser.nextToken();
            if (!_beanProperties.findDeserializeAndSet(jsonparser, deserializationcontext, obj, jsontoken))
            {
                handleUnknownVanilla(jsonparser, deserializationcontext, obj, jsontoken);
            }
        }

        return obj;
    }

    protected final Object _deserializeOther(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonToken jsontoken)
        throws IOException
    {
        static class _cls1
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

    protected Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object obj;
        Object obj2;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        obj = null;
        obj2 = jsonparser.getCurrentToken();
_L12:
        if (obj2 != JsonToken.FIELD_NAME) goto _L2; else goto _L1
_L1:
        SettableBeanProperty settablebeanproperty;
        obj2 = jsonparser.getCurrentName();
        jsonparser.nextToken();
        settablebeanproperty = propertybasedcreator.findCreatorProperty(((String) (obj2)));
        if (settablebeanproperty == null) goto _L4; else goto _L3
_L3:
        Object obj1;
        Object obj3;
        obj3 = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
        obj1 = obj;
        if (!propertyvaluebuffer.assignParameter(settablebeanproperty.getCreatorIndex(), obj3)) goto _L6; else goto _L5
_L5:
        jsonparser.nextToken();
        try
        {
            obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            wrapAndThrow(((Throwable) (obj1)), _beanType.getRawClass(), ((String) (obj2)), deserializationcontext);
            obj1 = null;
        }
        if (obj1 == null)
        {
            throw deserializationcontext.instantiationException(_beanType.getRawClass(), "JSON Creator returned null");
        }
        jsonparser.setCurrentValue(obj1);
        if (obj1.getClass() == _beanType.getRawClass()) goto _L8; else goto _L7
_L7:
        obj1 = handlePolymorphic(jsonparser, deserializationcontext, obj1, ((TokenBuffer) (obj)));
_L10:
        return obj1;
_L8:
        obj2 = obj1;
        if (obj != null)
        {
            obj2 = handleUnknownProperties(deserializationcontext, obj1, ((TokenBuffer) (obj)));
        }
        return deserialize(jsonparser, deserializationcontext, obj2);
_L4:
        if (propertyvaluebuffer.readIdProperty(((String) (obj2))))
        {
            obj1 = obj;
        } else
        {
            obj1 = _beanProperties.find(((String) (obj2)));
            if (obj1 != null)
            {
                propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj1)), ((SettableBeanProperty) (obj1)).deserialize(jsonparser, deserializationcontext));
                obj1 = obj;
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj2))
            {
                handleIgnoredProperty(jsonparser, deserializationcontext, handledType(), ((String) (obj2)));
                obj1 = obj;
            } else
            if (_anySetter != null)
            {
                propertyvaluebuffer.bufferAnyProperty(_anySetter, ((String) (obj2)), _anySetter.deserialize(jsonparser, deserializationcontext));
                obj1 = obj;
            } else
            {
                obj1 = obj;
                if (obj == null)
                {
                    obj1 = new TokenBuffer(jsonparser);
                }
                ((TokenBuffer) (obj1)).writeFieldName(((String) (obj2)));
                ((TokenBuffer) (obj1)).copyCurrentStructure(jsonparser);
            }
        }
_L6:
        obj2 = jsonparser.nextToken();
        obj = obj1;
        continue; /* Loop/switch isn't completed */
_L2:
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
        obj1 = jsonparser;
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (jsonparser.getClass() != _beanType.getRawClass())
        {
            return handlePolymorphic(null, deserializationcontext, jsonparser, ((TokenBuffer) (obj)));
        }
        return handleUnknownProperties(deserializationcontext, jsonparser, ((TokenBuffer) (obj)));
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected BeanDeserializerBase asArrayDeserializer()
    {
        return new BeanAsArrayDeserializer(this, _beanProperties.getPropertiesInInsertionOrder());
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
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
        throws IOException
    {
        jsonparser.setCurrentValue(obj);
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
        JsonToken jsontoken = jsonparser.getCurrentToken();
        obj1 = jsontoken;
        if (jsontoken == JsonToken.START_OBJECT)
        {
            obj1 = jsonparser.nextToken();
        }
        jsontoken = ((JsonToken) (obj1));
        if (_needViewProcesing)
        {
            Class class1 = deserializationcontext.getActiveView();
            jsontoken = ((JsonToken) (obj1));
            if (class1 != null)
            {
                return deserializeWithView(jsonparser, deserializationcontext, obj, class1);
            }
        }
        do
        {
            obj1 = obj;
            if (jsontoken != JsonToken.FIELD_NAME)
            {
                continue;
            }
            obj1 = jsonparser.getCurrentName();
            jsonparser.nextToken();
            if (!_beanProperties.findDeserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1))))
            {
                handleUnknownVanilla(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            }
            jsontoken = jsonparser.nextToken();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (_objectIdReader == null || !_objectIdReader.maySerializeAsObject() || jsonparser.getCurrentTokenId() != 5 || !_objectIdReader.isValidReferencePropertyName(jsonparser.getCurrentName(), jsonparser)) goto _L2; else goto _L1
_L1:
        Object obj = deserializeFromObjectId(jsonparser, deserializationcontext);
_L4:
        return obj;
_L2:
        if (!_nonStandardCreation)
        {
            break; /* Loop/switch isn't completed */
        }
        if (_unwrappedPropertyHandler != null)
        {
            return deserializeWithUnwrapped(jsonparser, deserializationcontext);
        }
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext);
        }
        jsonparser = ((JsonParser) (deserializeFromObjectUsingNonDefault(jsonparser, deserializationcontext)));
        obj = jsonparser;
        if (_injectables != null)
        {
            injectValues(deserializationcontext, jsonparser);
            return jsonparser;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Object obj1 = _valueInstantiator.createUsingDefault(deserializationcontext);
        jsonparser.setCurrentValue(obj1);
        if (jsonparser.canReadObjectId())
        {
            obj = jsonparser.getObjectId();
            if (obj != null)
            {
                _handleTypedObjectId(jsonparser, deserializationcontext, obj1, obj);
            }
        }
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj1);
        }
        if (_needViewProcesing)
        {
            obj = deserializationcontext.getActiveView();
            if (obj != null)
            {
                return deserializeWithView(jsonparser, deserializationcontext, obj1, ((Class) (obj)));
            }
        }
        JsonToken jsontoken = jsonparser.getCurrentToken();
        do
        {
            obj = obj1;
            if (jsontoken != JsonToken.FIELD_NAME)
            {
                continue;
            }
            obj = jsonparser.getCurrentName();
            jsonparser.nextToken();
            if (!_beanProperties.findDeserializeAndSet(jsonparser, deserializationcontext, obj1, ((String) (obj))))
            {
                handleUnknownVanilla(jsonparser, deserializationcontext, obj1, ((String) (obj)));
            }
            jsontoken = jsonparser.nextToken();
        } while (true);
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
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
            break MISSING_BLOCK_LABEL_331;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (!externaltypehandler.handlePropertyValue(jsonparser, deserializationcontext, s, propertyvaluebuffer))
        {
            break; /* Loop/switch isn't completed */
        }
_L4:
        obj = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L1:
        Object obj1 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getCreatorIndex(), obj1)) goto _L4; else goto _L3
_L3:
        obj = jsonparser.nextToken();
        obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        for (; obj == JsonToken.FIELD_NAME; obj = jsonparser.nextToken())
        {
            jsonparser.nextToken();
            tokenbuffer.copyCurrentStructure(jsonparser);
        }

        break MISSING_BLOCK_LABEL_182;
        Exception exception;
        exception;
        wrapAndThrow(exception, _beanType.getRawClass(), s, deserializationcontext);
          goto _L4
        if (obj1.getClass() != _beanType.getRawClass())
        {
            throw deserializationcontext.mappingException("Can not create polymorphic instances with unwrapped values");
        } else
        {
            return externaltypehandler.complete(jsonparser, deserializationcontext, obj1);
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
          goto _L4
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
        throws IOException
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
            break MISSING_BLOCK_LABEL_325;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_209;
        }
        Object obj2 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getCreatorIndex(), obj2))
        {
            break MISSING_BLOCK_LABEL_154;
        }
        obj = jsonparser.nextToken();
        Object obj3 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        jsonparser.setCurrentValue(obj3);
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
        throws IOException
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
        throws IOException
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
            JsonToken jsontoken = jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj1)));
            if (settablebeanproperty != null)
            {
                if (jsontoken.isScalarValue())
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
        throws IOException
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
        Object obj1 = _valueInstantiator.createUsingDefault(deserializationcontext);
        jsonparser.setCurrentValue(obj1);
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj1);
        }
        Class class1;
        Object obj;
        if (_needViewProcesing)
        {
            class1 = deserializationcontext.getActiveView();
        } else
        {
            class1 = null;
        }
        obj = jsonparser.getCurrentToken();
        while (obj == JsonToken.FIELD_NAME) 
        {
            obj = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj)));
            if (settablebeanproperty != null)
            {
                if (class1 != null && !settablebeanproperty.visibleInView(class1))
                {
                    jsonparser.skipChildren();
                } else
                {
                    try
                    {
                        settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj1);
                    }
                    catch (Exception exception)
                    {
                        wrapAndThrow(exception, obj1, ((String) (obj)), deserializationcontext);
                    }
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj))
            {
                handleIgnoredProperty(jsonparser, deserializationcontext, obj1, ((String) (obj)));
            } else
            {
                tokenbuffer.writeFieldName(((String) (obj)));
                tokenbuffer.copyCurrentStructure(jsonparser);
                if (_anySetter != null)
                {
                    try
                    {
                        _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj1, ((String) (obj)));
                    }
                    catch (Exception exception1)
                    {
                        wrapAndThrow(exception1, obj1, ((String) (obj)), deserializationcontext);
                    }
                }
            }
            obj = jsonparser.nextToken();
        }
        tokenbuffer.writeEndObject();
        _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj1, tokenbuffer);
        return obj1;
    }

    protected Object deserializeWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException
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
        throws IOException
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
