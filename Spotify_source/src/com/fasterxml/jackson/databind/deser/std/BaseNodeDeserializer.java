// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdDeserializer

abstract class BaseNodeDeserializer extends StdDeserializer
{

    public BaseNodeDeserializer(Class class1)
    {
        super(class1);
    }

    protected final JsonNode _fromEmbedded(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
    {
        jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
        if (jsonparser == null)
        {
            return jsonnodefactory.nullNode();
        }
        deserializationcontext = jsonparser.getClass();
        if (deserializationcontext == [B)
        {
            return jsonnodefactory.binaryNode((byte[])jsonparser);
        }
        if (com/fasterxml/jackson/databind/JsonNode.isAssignableFrom(deserializationcontext))
        {
            return (JsonNode)jsonparser;
        } else
        {
            return jsonnodefactory.pojoNode(jsonparser);
        }
    }

    protected final JsonNode _fromFloat(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
    {
        if (jsonparser.getNumberType() == com.fasterxml.jackson.core.JsonParser.NumberType.BIG_DECIMAL || deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
        {
            return jsonnodefactory.numberNode(jsonparser.getDecimalValue());
        } else
        {
            return jsonnodefactory.numberNode(jsonparser.getDoubleValue());
        }
    }

    protected final JsonNode _fromInt(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
    {
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
    }

    protected void _handleDuplicateField(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory, String s, ObjectNode objectnode, JsonNode jsonnode, JsonNode jsonnode1)
    {
        if (deserializationcontext.isEnabled(DeserializationFeature.FAIL_ON_READING_DUP_TREE_KEY))
        {
            _reportProblem(jsonparser, (new StringBuilder("Duplicate field '")).append(s).append("' for ObjectNode: not allowed when FAIL_ON_READING_DUP_TREE_KEY enabled").toString());
        }
        _handleDuplicateField(s, objectnode, jsonnode, jsonnode1);
    }

    protected void _handleDuplicateField(String s, ObjectNode objectnode, JsonNode jsonnode, JsonNode jsonnode1)
    {
    }

    protected void _reportProblem(JsonParser jsonparser, String s)
    {
        throw new JsonMappingException(s, jsonparser.getTokenLocation());
    }

    protected final JsonNode deserializeAny(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
    {
        switch (jsonparser.getCurrentTokenId())
        {
        case 4: // '\004'
        default:
            throw deserializationcontext.mappingException(handledType());

        case 1: // '\001'
        case 2: // '\002'
            return deserializeObject(jsonparser, deserializationcontext, jsonnodefactory);

        case 3: // '\003'
            return deserializeArray(jsonparser, deserializationcontext, jsonnodefactory);

        case 5: // '\005'
            return deserializeObject(jsonparser, deserializationcontext, jsonnodefactory);

        case 12: // '\f'
            return _fromEmbedded(jsonparser, deserializationcontext, jsonnodefactory);

        case 6: // '\006'
            return jsonnodefactory.textNode(jsonparser.getText());

        case 7: // '\007'
            return _fromInt(jsonparser, deserializationcontext, jsonnodefactory);

        case 8: // '\b'
            return _fromFloat(jsonparser, deserializationcontext, jsonnodefactory);

        case 9: // '\t'
            return jsonnodefactory.booleanNode(true);

        case 10: // '\n'
            return jsonnodefactory.booleanNode(false);

        case 11: // '\013'
            return jsonnodefactory.nullNode();
        }
    }

    protected final ArrayNode deserializeArray(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
    {
        ArrayNode arraynode = jsonnodefactory.arrayNode();
        do
        {
            JsonToken jsontoken = jsonparser.nextToken();
            if (jsontoken == null)
            {
                throw deserializationcontext.mappingException("Unexpected end-of-input when binding data into ArrayNode");
            }
            switch (jsontoken.id())
            {
            case 2: // '\002'
            case 5: // '\005'
            case 8: // '\b'
            default:
                arraynode.add(deserializeAny(jsonparser, deserializationcontext, jsonnodefactory));
                break;

            case 1: // '\001'
                arraynode.add(deserializeObject(jsonparser, deserializationcontext, jsonnodefactory));
                break;

            case 3: // '\003'
                arraynode.add(deserializeArray(jsonparser, deserializationcontext, jsonnodefactory));
                break;

            case 6: // '\006'
                arraynode.add(jsonnodefactory.textNode(jsonparser.getText()));
                break;

            case 7: // '\007'
                arraynode.add(_fromInt(jsonparser, deserializationcontext, jsonnodefactory));
                break;

            case 9: // '\t'
                arraynode.add(jsonnodefactory.booleanNode(true));
                break;

            case 10: // '\n'
                arraynode.add(jsonnodefactory.booleanNode(false));
                break;

            case 11: // '\013'
                arraynode.add(jsonnodefactory.nullNode());
                break;

            case 4: // '\004'
                return arraynode;
            }
        } while (true);
    }

    protected final ObjectNode deserializeObject(JsonParser jsonparser, DeserializationContext deserializationcontext, JsonNodeFactory jsonnodefactory)
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
_L10:
        String s;
        if (obj != JsonToken.FIELD_NAME)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        s = jsonparser.getCurrentName();
        jsonparser.nextToken().id();
        JVM INSTR tableswitch 1 11: default 108
    //                   1 157
    //                   2 108
    //                   3 169
    //                   4 108
    //                   5 108
    //                   6 181
    //                   7 194
    //                   8 108
    //                   9 206
    //                   10 216
    //                   11 226;
           goto _L1 _L2 _L1 _L3 _L1 _L1 _L4 _L5 _L1 _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_226;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        obj = deserializeAny(jsonparser, deserializationcontext, jsonnodefactory);
_L11:
        JsonNode jsonnode = objectnode.replace(s, ((JsonNode) (obj)));
        if (jsonnode != null)
        {
            _handleDuplicateField(jsonparser, deserializationcontext, jsonnodefactory, s, objectnode, jsonnode, ((JsonNode) (obj)));
        }
        obj = jsonparser.nextToken();
        if (true) goto _L10; else goto _L9
_L9:
        obj = deserializeObject(jsonparser, deserializationcontext, jsonnodefactory);
          goto _L11
_L3:
        obj = deserializeArray(jsonparser, deserializationcontext, jsonnodefactory);
          goto _L11
_L4:
        obj = jsonnodefactory.textNode(jsonparser.getText());
          goto _L11
_L5:
        obj = _fromInt(jsonparser, deserializationcontext, jsonnodefactory);
          goto _L11
_L6:
        obj = jsonnodefactory.booleanNode(true);
          goto _L11
_L7:
        obj = jsonnodefactory.booleanNode(false);
          goto _L11
        obj = jsonnodefactory.nullNode();
          goto _L11
        return objectnode;
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }
}
