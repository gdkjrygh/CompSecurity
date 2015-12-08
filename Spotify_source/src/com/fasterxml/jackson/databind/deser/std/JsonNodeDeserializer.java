// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.NullNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            BaseNodeDeserializer

public class JsonNodeDeserializer extends BaseNodeDeserializer
{

    private static final JsonNodeDeserializer instance = new JsonNodeDeserializer();

    protected JsonNodeDeserializer()
    {
        super(com/fasterxml/jackson/databind/JsonNode);
    }

    public static JsonDeserializer getDeserializer(Class class1)
    {
        if (class1 == com/fasterxml/jackson/databind/node/ObjectNode)
        {
            return ObjectDeserializer.getInstance();
        }
        if (class1 == com/fasterxml/jackson/databind/node/ArrayNode)
        {
            return ArrayDeserializer.getInstance();
        } else
        {
            return instance;
        }
    }

    public JsonNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        switch (jsonparser.getCurrentTokenId())
        {
        case 2: // '\002'
        default:
            return deserializeAny(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());

        case 1: // '\001'
            return deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());

        case 3: // '\003'
            return deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return super.deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
    }

    public JsonNode getNullValue()
    {
        return NullNode.getInstance();
    }

    public volatile Object getNullValue()
    {
        return getNullValue();
    }


    private class ObjectDeserializer extends BaseNodeDeserializer
    {

        protected static final ObjectDeserializer _instance = new ObjectDeserializer();
        private static final long serialVersionUID = 1L;

        public static ObjectDeserializer getInstance()
        {
            return _instance;
        }

        public final ObjectNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (jsonparser.getCurrentToken() == JsonToken.START_OBJECT)
            {
                jsonparser.nextToken();
                return deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
            }
            if (jsonparser.getCurrentToken() == JsonToken.FIELD_NAME)
            {
                return deserializeObject(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
            } else
            {
                throw deserializationcontext.mappingException(com/fasterxml/jackson/databind/node/ObjectNode);
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }


        protected ObjectDeserializer()
        {
            super(com/fasterxml/jackson/databind/node/ObjectNode);
        }
    }


    private class ArrayDeserializer extends BaseNodeDeserializer
    {

        protected static final ArrayDeserializer _instance = new ArrayDeserializer();
        private static final long serialVersionUID = 1L;

        public static ArrayDeserializer getInstance()
        {
            return _instance;
        }

        public final ArrayNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            if (jsonparser.isExpectedStartArrayToken())
            {
                return deserializeArray(jsonparser, deserializationcontext, deserializationcontext.getNodeFactory());
            } else
            {
                throw deserializationcontext.mappingException(com/fasterxml/jackson/databind/node/ArrayNode);
            }
        }

        public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        {
            return deserialize(jsonparser, deserializationcontext);
        }


        protected ArrayDeserializer()
        {
            super(com/fasterxml/jackson/databind/node/ArrayNode);
        }
    }

}
