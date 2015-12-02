// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.node.ObjectNode;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            BaseNodeDeserializer

final class  extends BaseNodeDeserializer
{

    protected static final deserialize _instance = new <init>();

    public static  getInstance()
    {
        return _instance;
    }

    public ObjectNode deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }


    protected ()
    {
        super(com/fasterxml/jackson/databind/node/ObjectNode);
    }
}
