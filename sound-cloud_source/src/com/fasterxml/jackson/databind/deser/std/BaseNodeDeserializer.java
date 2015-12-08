// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

abstract class BaseNodeDeserializer extends StdDeserializer
{

    public BaseNodeDeserializer(Class class1)
    {
        super(class1);
    }

    protected void _handleDuplicateField(String s, ObjectNode objectnode, JsonNode jsonnode, JsonNode jsonnode1)
        throws JsonProcessingException
    {
    }

    protected final JsonNode deserializeAny(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
        throws IOException, JsonProcessingException
    {
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_EMBEDDED_OBJECT.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()])
        {
        case 4: // '\004'
        default:
            throw deserializationcontext.mappingException(getValueClass());

        case 1: // '\001'
            return deserializeObject(jsonparser, deserializationcontext, jsonnodefactory);

        case 2: // '\002'
            return deserializeArray(jsonparser, deserializationcontext, jsonnodefactory);

        case 5: // '\005'
            return deserializeObject(jsonparser, deserializationcontext, jsonnodefactory);

        case 6: // '\006'
            jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
            if (jsonparser == null)
            {
                return jsonnodefactory.nullNode();
            }
            if (jsonparser.getClass() == [B)
            {
                return jsonnodefactory.binaryNode((byte[])(byte[])jsonparser);
            } else
            {
                return jsonnodefactory.POJONode(jsonparser);
            }

        case 3: // '\003'
            return jsonnodefactory.textNode(jsonparser.getText());

        case 7: // '\007'
            com.fasterxml.jackson.core.JsonParser.NumberType numbertype = jsonparser.getNumberType();
            if (numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_INTEGER || deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonnodefactory.numberNode(jsonparser.getBigIntegerValue());
            }
            if (numbertype == com.fasterxml.jackson.core.JsonParser.NumberType.INT)
            {
                return jsonnodefactory.numberNode(jsonparser.getIntValue());
            } else
            {
                return jsonnodefactory.numberNode(jsonparser.getLongValue());
            }

        case 8: // '\b'
            if (jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL || deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonnodefactory.numberNode(jsonparser.getDecimalValue());
            } else
            {
                return jsonnodefactory.numberNode(jsonparser.getDoubleValue());
            }

        case 9: // '\t'
            return jsonnodefactory.booleanNode(true);

        case 10: // '\n'
            return jsonnodefactory.booleanNode(false);

        case 11: // '\013'
            return jsonnodefactory.nullNode();
        }
    }

    protected final ArrayNode deserializeArray(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
        throws IOException, JsonProcessingException
    {
        ArrayNode arraynode = jsonnodefactory.arrayNode();
        do
        {
            JsonToken jsontoken = jsonparser.nextToken();
            if (jsontoken == null)
            {
                throw deserializationcontext.mappingException("Unexpected end-of-input when binding data into ArrayNode");
            }
            switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
            {
            default:
                arraynode.add(deserializeAny(jsonparser, deserializationcontext, jsonnodefactory));
                break;

            case 1: // '\001'
                arraynode.add(deserializeObject(jsonparser, deserializationcontext, jsonnodefactory));
                break;

            case 2: // '\002'
                arraynode.add(deserializeArray(jsonparser, deserializationcontext, jsonnodefactory));
                break;

            case 3: // '\003'
                arraynode.add(jsonnodefactory.textNode(jsonparser.getText()));
                break;

            case 4: // '\004'
                return arraynode;
            }
        } while (true);
    }

    protected final ObjectNode deserializeObject(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
        throws IOException, JsonProcessingException
    {
        Object obj;
        ObjectNode objectnode;
        objectnode = jsonnodefactory.objectNode();
        JsonToken jsontoken = jsonparser.getCurrentToken();
        obj = jsontoken;
        if (jsontoken == JsonToken.START_OBJECT)
        {
            obj = jsonparser.nextToken();
        }
_L6:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_163;
        }
        s = jsonparser.getCurrentName();
        _cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsonparser.nextToken().ordinal()];
        JVM INSTR tableswitch 1 3: default 80
    //                   1 126
    //                   2 138
    //                   3 150;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_150;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        obj = deserializeAny(jsonparser, deserializationcontext, jsonnodefactory);
_L7:
        JsonNode jsonnode = objectnode.replace(s, ((JsonNode) (obj)));
        if (jsonnode != null)
        {
            _handleDuplicateField(s, objectnode, jsonnode, ((JsonNode) (obj)));
        }
        obj = jsonparser.nextToken();
        if (true) goto _L6; else goto _L5
_L5:
        obj = deserializeObject(jsonparser, deserializationcontext, jsonnodefactory);
          goto _L7
_L3:
        obj = deserializeArray(jsonparser, deserializationcontext, jsonnodefactory);
          goto _L7
        obj = jsonnodefactory.textNode(jsonparser.getText());
          goto _L7
        return objectnode;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }
}
