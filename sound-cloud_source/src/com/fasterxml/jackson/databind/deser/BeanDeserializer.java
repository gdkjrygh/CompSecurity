// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.BeanDescription;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonMappingException;
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
//            BeanDeserializerBase, SettableAnyProperty, ValueInstantiator, SettableBeanProperty, 
//            BeanDeserializerBuilder

public class BeanDeserializer extends BeanDeserializerBase
    implements Serializable
{

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

    private Object _missingToken(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws JsonProcessingException
    {
        throw deserializationcontext.endOfInputException(getBeanClass());
    }

    private final void _vanillaDeserializeHandleUnknown(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, String s)
        throws IOException, JsonProcessingException
    {
        if (_ignorableProps != null && _ignorableProps.contains(s))
        {
            jsonparser.skipChildren();
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

    private final Object vanillaDeserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonToken jsontoken)
        throws IOException, JsonProcessingException
    {
        jsontoken = ((JsonToken) (_valueInstantiator.createUsingDefault(deserializationcontext)));
        while (jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
        {
            String s = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, jsontoken);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, jsontoken, s, deserializationcontext);
                }
            } else
            {
                _vanillaDeserializeHandleUnknown(jsonparser, deserializationcontext, jsontoken, s);
            }
            jsonparser.nextToken();
        }
        return jsontoken;
    }

    public final Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
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
                        jsonparser.skipChildren();
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
                            obj1 = new TokenBuffer(jsonparser.getCodec());
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

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.START_OBJECT)
        {
            jsontoken = jsonparser.nextToken();
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
        if (jsontoken == null)
        {
            return _missingToken(jsonparser, deserializationcontext);
        }
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[];
            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType = new int[com.fasterxml.jackson.core.JsonParser.NumberType.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.INT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.LONG.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.FLOAT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonParser$NumberType[com.fasterxml.jackson.core.JsonParser.NumberType.DOUBLE.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
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
            throw deserializationcontext.mappingException(getBeanClass());

        case 1: // '\001'
            return deserializeFromString(jsonparser, deserializationcontext);

        case 2: // '\002'
            return deserializeFromNumber(jsonparser, deserializationcontext);

        case 3: // '\003'
            return deserializeFromDouble(jsonparser, deserializationcontext);

        case 4: // '\004'
            return jsonparser.getEmbeddedObject();

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

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
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
            if (_ignorableProps != null && _ignorableProps.contains(obj1))
            {
                jsonparser.skipChildren();
            } else
            if (_anySetter != null)
            {
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            } else
            {
                handleUnknownProperty(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            }
            obj2 = jsonparser.nextToken();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object deserializeFromArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer == null)
        {
            break MISSING_BLOCK_LABEL_47;
        }
        jsonparser = ((JsonParser) (_valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext))));
        if (_injectables != null)
        {
            injectValues(deserializationcontext, jsonparser);
        }
        return jsonparser;
        jsonparser;
        wrapInstantiationProblem(jsonparser, deserializationcontext);
        throw deserializationcontext.mappingException(getBeanClass());
    }

    public Object deserializeFromBoolean(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
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
        throws IOException, JsonProcessingException
    {
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
        throw deserializationcontext.instantiationException(getBeanClass(), "no suitable creator method found to deserialize from JSON floating-point number");
    }

    public Object deserializeFromNumber(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
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
                throw deserializationcontext.instantiationException(getBeanClass(), "no suitable creator method found to deserialize from JSON integer number");
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

    public Object deserializeFromObject(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!_nonStandardCreation) goto _L2; else goto _L1
_L1:
        if (_unwrappedPropertyHandler == null) goto _L4; else goto _L3
_L3:
        Object obj = deserializeWithUnwrapped(jsonparser, deserializationcontext);
_L6:
        return obj;
_L4:
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext);
        } else
        {
            return deserializeFromObjectUsingNonDefault(jsonparser, deserializationcontext);
        }
_L2:
        Object obj1 = _valueInstantiator.createUsingDefault(deserializationcontext);
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
        do
        {
            obj = obj1;
            if (jsonparser.getCurrentToken() == JsonToken.END_OBJECT)
            {
                continue;
            }
            obj = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(((String) (obj)));
            if (settablebeanproperty != null)
            {
                try
                {
                    settablebeanproperty.deserializeAndSet(jsonparser, deserializationcontext, obj1);
                }
                catch (Exception exception)
                {
                    wrapAndThrow(exception, obj1, ((String) (obj)), deserializationcontext);
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj))
            {
                jsonparser.skipChildren();
            } else
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
            } else
            {
                handleUnknownProperty(jsonparser, deserializationcontext, obj1, ((String) (obj)));
            }
            jsonparser.nextToken();
        } while (true);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected Object deserializeFromObjectUsingNonDefault(JsonParser jsonparser, DeserializationContext deserializationcontext)
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

    public Object deserializeFromString(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
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

    protected Object deserializeUsingPropertyBasedWithExternalTypeId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        ExternalTypeHandler externaltypehandler;
        TokenBuffer tokenbuffer;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        externaltypehandler = _externalTypeIdHandler.start();
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartObject();
        obj = jsonparser.getCurrentToken();
_L2:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_324;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        if (externaltypehandler.handlePropertyValue(jsonparser, deserializationcontext, s, propertyvaluebuffer))
        {
            break MISSING_BLOCK_LABEL_174;
        }
        Object obj1 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getCreatorIndex(), obj1))
        {
            break MISSING_BLOCK_LABEL_174;
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
                    jsonparser.skipChildren();
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
        throws IOException, JsonProcessingException
    {
        Object obj;
        TokenBuffer tokenbuffer;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartObject();
        obj = jsonparser.getCurrentToken();
_L2:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_315;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_206;
        }
        Object obj2 = ((SettableBeanProperty) (obj)).deserialize(jsonparser, deserializationcontext);
        if (!propertyvaluebuffer.assignParameter(((SettableBeanProperty) (obj)).getCreatorIndex(), obj2))
        {
            break MISSING_BLOCK_LABEL_151;
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
                jsonparser.skipChildren();
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
        throws IOException, JsonProcessingException
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
        throws IOException, JsonProcessingException
    {
        Class class1;
        ExternalTypeHandler externaltypehandler;
        if (_needViewProcesing)
        {
            class1 = deserializationcontext.getActiveView();
        } else
        {
            class1 = null;
        }
        externaltypehandler = _externalTypeIdHandler.start();
        while (jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
        {
            String s = jsonparser.getCurrentName();
            jsonparser.nextToken();
            SettableBeanProperty settablebeanproperty = _beanProperties.find(s);
            if (settablebeanproperty != null)
            {
                if (jsonparser.getCurrentToken().isScalarValue())
                {
                    externaltypehandler.handleTypePropertyValue(jsonparser, deserializationcontext, s, obj);
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
                        wrapAndThrow(exception, obj, s, deserializationcontext);
                    }
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(s))
            {
                jsonparser.skipChildren();
            } else
            if (!externaltypehandler.handlePropertyValue(jsonparser, deserializationcontext, s, obj))
            {
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
                } else
                {
                    handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
                }
            }
            jsonparser.nextToken();
        }
        return externaltypehandler.complete(jsonparser, deserializationcontext, obj);
    }

    protected Object deserializeWithObjectId(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        String s = _objectIdReader.propertyName;
        if (s.equals(jsonparser.getCurrentName()))
        {
            return deserializeFromObject(jsonparser, deserializationcontext);
        }
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        TokenBuffer tokenbuffer1 = null;
        while (jsonparser.getCurrentToken() != JsonToken.END_OBJECT) 
        {
            String s1 = jsonparser.getCurrentName();
            if (tokenbuffer1 == null)
            {
                if (s.equals(s1))
                {
                    tokenbuffer1 = new TokenBuffer(jsonparser.getCodec());
                    tokenbuffer1.writeFieldName(s1);
                    jsonparser.nextToken();
                    tokenbuffer1.copyCurrentStructure(jsonparser);
                    tokenbuffer1.append(tokenbuffer);
                    tokenbuffer = null;
                } else
                {
                    tokenbuffer.writeFieldName(s1);
                    jsonparser.nextToken();
                    tokenbuffer.copyCurrentStructure(jsonparser);
                }
            } else
            {
                tokenbuffer1.writeFieldName(s1);
                jsonparser.nextToken();
                tokenbuffer1.copyCurrentStructure(jsonparser);
            }
            jsonparser.nextToken();
        }
        if (tokenbuffer1 != null)
        {
            tokenbuffer = tokenbuffer1;
        }
        tokenbuffer.writeEndObject();
        jsonparser = tokenbuffer.asParser();
        jsonparser.nextToken();
        return deserializeFromObject(jsonparser, deserializationcontext);
    }

    protected Object deserializeWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_propertyBasedCreator != null)
        {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonparser, deserializationcontext);
        }
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
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
                jsonparser.skipChildren();
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
        throws IOException, JsonProcessingException
    {
        Object obj2 = jsonparser.getCurrentToken();
        Object obj1 = obj2;
        if (obj2 == JsonToken.START_OBJECT)
        {
            obj1 = jsonparser.nextToken();
        }
        TokenBuffer tokenbuffer = new TokenBuffer(jsonparser.getCodec());
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
                jsonparser.skipChildren();
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
        throws IOException, JsonProcessingException
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
            if (_ignorableProps != null && _ignorableProps.contains(obj1))
            {
                jsonparser.skipChildren();
            } else
            if (_anySetter != null)
            {
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            } else
            {
                handleUnknownProperty(jsonparser, deserializationcontext, obj, ((String) (obj1)));
            }
            obj1 = jsonparser.nextToken();
        }
        return obj;
    }

    protected Object handlePolymorphic(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, TokenBuffer tokenbuffer)
        throws IOException, JsonProcessingException
    {
        JsonDeserializer jsondeserializer = _findSubclassDeserializer(deserializationcontext, obj, tokenbuffer);
        if (jsondeserializer != null)
        {
            if (tokenbuffer != null)
            {
                tokenbuffer.writeEndObject();
                tokenbuffer = tokenbuffer.asParser();
                tokenbuffer.nextToken();
                tokenbuffer = ((TokenBuffer) (jsondeserializer.deserialize(tokenbuffer, deserializationcontext, obj)));
            } else
            {
                tokenbuffer = ((TokenBuffer) (obj));
            }
            obj = tokenbuffer;
            if (jsonparser != null)
            {
                obj = jsondeserializer.deserialize(jsonparser, deserializationcontext, tokenbuffer);
            }
        } else
        {
            if (tokenbuffer != null)
            {
                tokenbuffer = ((TokenBuffer) (handleUnknownProperties(deserializationcontext, obj, tokenbuffer)));
            } else
            {
                tokenbuffer = ((TokenBuffer) (obj));
            }
            obj = tokenbuffer;
            if (jsonparser != null)
            {
                return deserialize(jsonparser, deserializationcontext, tokenbuffer);
            }
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
