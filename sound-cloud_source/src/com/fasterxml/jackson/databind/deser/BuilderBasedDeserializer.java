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
import com.fasterxml.jackson.databind.deser.impl.BeanAsArrayBuilderDeserializer;
import com.fasterxml.jackson.databind.deser.impl.BeanPropertyMap;
import com.fasterxml.jackson.databind.deser.impl.ExternalTypeHandler;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.deser.impl.PropertyBasedCreator;
import com.fasterxml.jackson.databind.deser.impl.PropertyValueBuffer;
import com.fasterxml.jackson.databind.deser.impl.UnwrappedPropertyHandler;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.util.NameTransformer;
import com.fasterxml.jackson.databind.util.TokenBuffer;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;

// Referenced classes of package com.fasterxml.jackson.databind.deser:
//            BeanDeserializerBase, BeanDeserializerBuilder, SettableAnyProperty, ValueInstantiator, 
//            SettableBeanProperty

public class BuilderBasedDeserializer extends BeanDeserializerBase
{

    protected final AnnotatedMethod _buildMethod;

    public BuilderBasedDeserializer(BeanDeserializerBuilder beandeserializerbuilder, BeanDescription beandescription, BeanPropertyMap beanpropertymap, Map map, HashSet hashset, boolean flag, boolean flag1)
    {
        super(beandeserializerbuilder, beandescription, beanpropertymap, map, hashset, flag, flag1);
        _buildMethod = beandeserializerbuilder.getBuildMethod();
        if (_objectIdReader != null)
        {
            throw new IllegalArgumentException((new StringBuilder("Can not use Object Id with Builder-based deserialization (type ")).append(beandescription.getType()).append(")").toString());
        } else
        {
            return;
        }
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderbaseddeserializer, ObjectIdReader objectidreader)
    {
        super(builderbaseddeserializer, objectidreader);
        _buildMethod = builderbaseddeserializer._buildMethod;
    }

    protected BuilderBasedDeserializer(BuilderBasedDeserializer builderbaseddeserializer, NameTransformer nametransformer)
    {
        super(builderbaseddeserializer, nametransformer);
        _buildMethod = builderbaseddeserializer._buildMethod;
    }

    public BuilderBasedDeserializer(BuilderBasedDeserializer builderbaseddeserializer, HashSet hashset)
    {
        super(builderbaseddeserializer, hashset);
        _buildMethod = builderbaseddeserializer._buildMethod;
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
_L2:
        Object obj;
        String s;
        if (jsonparser.getCurrentToken() == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_94;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = _beanProperties.find(s);
        if (obj == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = ((SettableBeanProperty) (obj)).deserializeSetAndReturn(jsonparser, deserializationcontext, jsontoken);
        jsontoken = ((JsonToken) (obj));
_L3:
        jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        wrapAndThrow(exception, jsontoken, s, deserializationcontext);
          goto _L3
_L1:
        _vanillaDeserializeHandleUnknown(jsonparser, deserializationcontext, jsontoken, s);
          goto _L3
        return jsontoken;
    }

    protected final Object _deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj);
        }
        if (_unwrappedPropertyHandler == null) goto _L2; else goto _L1
_L1:
        obj = deserializeWithUnwrapped(jsonparser, deserializationcontext, obj);
_L4:
        return obj;
_L2:
        Object obj1;
        Object obj2;
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext, obj);
        }
        if (_needViewProcesing)
        {
            Class class1 = deserializationcontext.getActiveView();
            if (class1 != null)
            {
                return deserializeWithView(jsonparser, deserializationcontext, obj, class1);
            }
        }
        JsonToken jsontoken = jsonparser.getCurrentToken();
        obj2 = jsontoken;
        obj1 = obj;
        if (jsontoken == JsonToken.START_OBJECT)
        {
            obj2 = jsonparser.nextToken();
            obj1 = obj;
        }
_L5:
        obj = obj1;
        if (obj2 != JsonToken.FIELD_NAME) goto _L4; else goto _L3
_L3:
        obj2 = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = _beanProperties.find(((String) (obj2)));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_174;
        }
        obj = ((SettableBeanProperty) (obj)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj1);
        obj1 = obj;
_L6:
        obj2 = jsonparser.nextToken();
          goto _L5
        obj;
        wrapAndThrow(((Throwable) (obj)), obj1, ((String) (obj2)), deserializationcontext);
          goto _L6
        if (_ignorableProps != null && _ignorableProps.contains(obj2))
        {
            jsonparser.skipChildren();
        } else
        if (_anySetter != null)
        {
            _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
        } else
        {
            handleUnknownProperty(jsonparser, deserializationcontext, obj1, ((String) (obj2)));
        }
          goto _L6
    }

    protected final Object _deserializeUsingPropertyBased(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        Object obj1;
        PropertyBasedCreator propertybasedcreator;
        PropertyValueBuffer propertyvaluebuffer;
        propertybasedcreator = _propertyBasedCreator;
        propertyvaluebuffer = propertybasedcreator.startBuilding(jsonparser, deserializationcontext, _objectIdReader);
        obj1 = jsonparser.getCurrentToken();
        obj = null;
_L2:
        Object obj2;
        if (obj1 != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_333;
        }
        obj2 = jsonparser.getCurrentName();
        jsonparser.nextToken();
        SettableBeanProperty settablebeanproperty = propertybasedcreator.findCreatorProperty(((String) (obj2)));
        if (settablebeanproperty == null)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        Object obj3 = settablebeanproperty.deserialize(jsonparser, deserializationcontext);
        obj1 = obj;
        if (!propertyvaluebuffer.assignParameter(settablebeanproperty.getCreatorIndex(), obj3))
        {
            break MISSING_BLOCK_LABEL_148;
        }
        jsonparser.nextToken();
        obj1 = propertybasedcreator.build(deserializationcontext, propertyvaluebuffer);
        if (obj1.getClass() != _beanType.getRawClass())
        {
            return handlePolymorphic(jsonparser, deserializationcontext, obj1, ((TokenBuffer) (obj)));
        }
        break; /* Loop/switch isn't completed */
        obj1;
        wrapAndThrow(((Throwable) (obj1)), _beanType.getRawClass(), ((String) (obj2)), deserializationcontext);
        obj1 = obj;
_L3:
        obj2 = jsonparser.nextToken();
        obj = obj1;
        obj1 = obj2;
        if (true) goto _L2; else goto _L1
_L1:
        if (obj != null)
        {
            obj = handleUnknownProperties(deserializationcontext, obj1, ((TokenBuffer) (obj)));
        } else
        {
            obj = obj1;
        }
        return _deserialize(jsonparser, deserializationcontext, obj);
        obj1 = obj;
        if (!propertyvaluebuffer.readIdProperty(((String) (obj2))))
        {
            obj1 = _beanProperties.find(((String) (obj2)));
            if (obj1 != null)
            {
                propertyvaluebuffer.bufferProperty(((SettableBeanProperty) (obj1)), ((SettableBeanProperty) (obj1)).deserialize(jsonparser, deserializationcontext));
                obj1 = obj;
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj2))
            {
                jsonparser.skipChildren();
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
                    obj1 = new TokenBuffer(jsonparser.getCodec());
                }
                ((TokenBuffer) (obj1)).writeFieldName(((String) (obj2)));
                ((TokenBuffer) (obj1)).copyCurrentStructure(jsonparser);
            }
        }
          goto _L3
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

    protected volatile BeanDeserializerBase asArrayDeserializer()
    {
        return asArrayDeserializer();
    }

    protected BeanAsArrayBuilderDeserializer asArrayDeserializer()
    {
        return new BeanAsArrayBuilderDeserializer(this, _beanProperties.getPropertiesInInsertionOrder(), _buildMethod);
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
                return finishBuild(deserializationcontext, vanillaDeserialize(jsonparser, deserializationcontext, jsontoken));
            } else
            {
                return finishBuild(deserializationcontext, deserializeFromObject(jsonparser, deserializationcontext));
            }
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
            return finishBuild(deserializationcontext, deserializeFromString(jsonparser, deserializationcontext));

        case 2: // '\002'
            return finishBuild(deserializationcontext, deserializeFromNumber(jsonparser, deserializationcontext));

        case 3: // '\003'
            return finishBuild(deserializationcontext, deserializeFromDouble(jsonparser, deserializationcontext));

        case 4: // '\004'
            return jsonparser.getEmbeddedObject();

        case 5: // '\005'
        case 6: // '\006'
            return finishBuild(deserializationcontext, deserializeFromBoolean(jsonparser, deserializationcontext));

        case 7: // '\007'
            return finishBuild(deserializationcontext, deserializeFromArray(jsonparser, deserializationcontext));

        case 8: // '\b'
        case 9: // '\t'
            return finishBuild(deserializationcontext, deserializeFromObject(jsonparser, deserializationcontext));
        }
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return finishBuild(deserializationcontext, _deserialize(jsonparser, deserializationcontext, obj));
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
        Object obj1 = deserializeWithUnwrapped(jsonparser, deserializationcontext);
_L7:
        return obj1;
_L4:
        if (_externalTypeIdHandler != null)
        {
            return deserializeWithExternalTypeId(jsonparser, deserializationcontext);
        } else
        {
            return deserializeFromObjectUsingNonDefault(jsonparser, deserializationcontext);
        }
_L2:
        Object obj;
        obj1 = _valueInstantiator.createUsingDefault(deserializationcontext);
        if (_injectables != null)
        {
            injectValues(deserializationcontext, obj1);
        }
        obj = obj1;
        if (_needViewProcesing)
        {
            Class class1 = deserializationcontext.getActiveView();
            obj = obj1;
            if (class1 != null)
            {
                return deserializeWithView(jsonparser, deserializationcontext, obj1, class1);
            }
        }
          goto _L5
        obj1;
        String s;
        wrapAndThrow(((Throwable) (obj1)), obj, s, deserializationcontext);
_L8:
        jsonparser.nextToken();
_L5:
        obj1 = obj;
        if (jsonparser.getCurrentToken() == JsonToken.END_OBJECT) goto _L7; else goto _L6
_L6:
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj1 = _beanProperties.find(s);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_178;
        }
        obj1 = ((SettableBeanProperty) (obj1)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
        obj = obj1;
          goto _L8
        if (_ignorableProps != null && _ignorableProps.contains(s))
        {
            jsonparser.skipChildren();
        } else
        if (_anySetter != null)
        {
            try
            {
                _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
            }
            catch (Exception exception)
            {
                wrapAndThrow(exception, obj, s, deserializationcontext);
            }
        } else
        {
            handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
        }
          goto _L8
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
        throw new IllegalStateException("Deserialization with Builder, External type id, @JsonCreator not yet implemented");
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
            break MISSING_BLOCK_LABEL_310;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj = propertybasedcreator.findCreatorProperty(s);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_201;
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
        Object obj1;
        ExternalTypeHandler externaltypehandler;
        String s;
        Class class1;
        if (_needViewProcesing)
        {
            class1 = deserializationcontext.getActiveView();
        } else
        {
            class1 = null;
        }
        externaltypehandler = _externalTypeIdHandler.start();
        if (jsonparser.getCurrentToken() == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_234;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj1 = _beanProperties.find(s);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (class1 != null && !((SettableBeanProperty) (obj1)).visibleInView(class1))
        {
            jsonparser.skipChildren();
            obj1 = obj;
        } else
        {
            try
            {
                obj1 = ((SettableBeanProperty) (obj1)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                wrapAndThrow(((Throwable) (obj1)), obj, s, deserializationcontext);
                obj1 = obj;
            }
        }
_L4:
        jsonparser.nextToken();
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_22;
_L1:
label0:
        {
            if (_ignorableProps == null || !_ignorableProps.contains(s))
            {
                break label0;
            }
            jsonparser.skipChildren();
            obj1 = obj;
        }
        continue; /* Loop/switch isn't completed */
        for (obj1 = obj; externaltypehandler.handlePropertyValue(jsonparser, deserializationcontext, s, obj); obj1 = obj)
        {
            continue; /* Loop/switch isn't completed */
        }

        if (_anySetter == null)
        {
            break MISSING_BLOCK_LABEL_219;
        }
        try
        {
            _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1)
        {
            wrapAndThrow(((Throwable) (obj1)), obj, s, deserializationcontext);
            obj1 = obj;
            continue; /* Loop/switch isn't completed */
        }
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
        handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
        obj1 = obj;
        if (true) goto _L4; else goto _L3
_L3:
        return externaltypehandler.complete(jsonparser, deserializationcontext, obj);
    }

    protected Object deserializeWithUnwrapped(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        Object obj1;
        TokenBuffer tokenbuffer;
        String s;
        if (_delegateDeserializer != null)
        {
            return _valueInstantiator.createUsingDelegate(deserializationcontext, _delegateDeserializer.deserialize(jsonparser, deserializationcontext));
        }
        if (_propertyBasedCreator != null)
        {
            return deserializeUsingPropertyBasedWithUnwrapped(jsonparser, deserializationcontext);
        }
        tokenbuffer = new TokenBuffer(jsonparser.getCodec());
        tokenbuffer.writeStartObject();
        obj = _valueInstantiator.createUsingDefault(deserializationcontext);
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
        if (jsonparser.getCurrentToken() == JsonToken.END_OBJECT)
        {
            break MISSING_BLOCK_LABEL_298;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj1 = _beanProperties.find(s);
        if (obj1 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (class1 != null && !((SettableBeanProperty) (obj1)).visibleInView(class1))
        {
            jsonparser.skipChildren();
            obj1 = obj;
        } else
        {
            try
            {
                obj1 = ((SettableBeanProperty) (obj1)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                wrapAndThrow(((Throwable) (obj1)), obj, s, deserializationcontext);
                obj1 = obj;
            }
        }
_L4:
        jsonparser.nextToken();
        obj = obj1;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_93;
_L1:
label0:
        {
            if (_ignorableProps == null || !_ignorableProps.contains(s))
            {
                break label0;
            }
            jsonparser.skipChildren();
            obj1 = obj;
        }
        continue; /* Loop/switch isn't completed */
        tokenbuffer.writeFieldName(s);
        tokenbuffer.copyCurrentStructure(jsonparser);
        obj1 = obj;
        if (_anySetter == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
        obj1 = obj;
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        wrapAndThrow(exception, obj, s, deserializationcontext);
        exception = ((Exception) (obj));
        if (true) goto _L4; else goto _L3
_L3:
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
            Object obj3 = _beanProperties.find(((String) (obj1)));
            jsonparser.nextToken();
            if (obj3 != null)
            {
                if (obj2 != null && !((SettableBeanProperty) (obj3)).visibleInView(((Class) (obj2))))
                {
                    jsonparser.skipChildren();
                    obj3 = obj;
                } else
                {
                    try
                    {
                        obj3 = ((SettableBeanProperty) (obj3)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Object obj3)
                    {
                        wrapAndThrow(((Throwable) (obj3)), obj, ((String) (obj1)), deserializationcontext);
                        obj3 = obj;
                    }
                }
            } else
            if (_ignorableProps != null && _ignorableProps.contains(obj1))
            {
                jsonparser.skipChildren();
                obj3 = obj;
            } else
            {
                tokenbuffer.writeFieldName(((String) (obj1)));
                tokenbuffer.copyCurrentStructure(jsonparser);
                obj3 = obj;
                if (_anySetter != null)
                {
                    _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, ((String) (obj1)));
                    obj3 = obj;
                }
            }
            obj1 = jsonparser.nextToken();
            obj = obj3;
        }
        tokenbuffer.writeEndObject();
        _unwrappedPropertyHandler.processUnwrapped(jsonparser, deserializationcontext, obj, tokenbuffer);
        return obj;
    }

    protected final Object deserializeWithView(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj, Class class1)
        throws IOException, JsonProcessingException
    {
        Object obj1 = jsonparser.getCurrentToken();
_L2:
        String s;
        if (obj1 != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_157;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken();
        obj1 = _beanProperties.find(s);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_96;
        }
        if (((SettableBeanProperty) (obj1)).visibleInView(class1))
        {
            break; /* Loop/switch isn't completed */
        }
        jsonparser.skipChildren();
_L3:
        obj1 = jsonparser.nextToken();
        if (true) goto _L2; else goto _L1
_L1:
        obj1 = ((SettableBeanProperty) (obj1)).deserializeSetAndReturn(jsonparser, deserializationcontext, obj);
        obj = obj1;
          goto _L3
        Exception exception;
        exception;
        wrapAndThrow(exception, obj, s, deserializationcontext);
          goto _L3
        if (_ignorableProps != null && _ignorableProps.contains(s))
        {
            jsonparser.skipChildren();
        } else
        if (_anySetter != null)
        {
            _anySetter.deserializeAndSet(jsonparser, deserializationcontext, obj, s);
        } else
        {
            handleUnknownProperty(jsonparser, deserializationcontext, obj, s);
        }
          goto _L3
        return obj;
    }

    protected final Object finishBuild(DeserializationContext deserializationcontext, Object obj)
        throws IOException
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
        return new BuilderBasedDeserializer(this, nametransformer);
    }

    public volatile BeanDeserializerBase withIgnorableProperties(HashSet hashset)
    {
        return withIgnorableProperties(hashset);
    }

    public BuilderBasedDeserializer withIgnorableProperties(HashSet hashset)
    {
        return new BuilderBasedDeserializer(this, hashset);
    }

    public volatile BeanDeserializerBase withObjectIdReader(ObjectIdReader objectidreader)
    {
        return withObjectIdReader(objectidreader);
    }

    public BuilderBasedDeserializer withObjectIdReader(ObjectIdReader objectidreader)
    {
        return new BuilderBasedDeserializer(this, objectidreader);
    }
}
