// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.ArrayBuilders;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            PrimitiveArrayDeserializers

static final class  extends PrimitiveArrayDeserializers
{

    private final byte[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
        {
            return null;
        }
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_valueClass);
        }
        JsonToken jsontoken = jsonparser.getCurrentToken();
        byte byte0;
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            byte0 = jsonparser.getByteValue();
        } else
        {
            if (jsontoken != JsonToken.VALUE_NULL)
            {
                throw deserializationcontext.mappingException(_valueClass.getComponentType());
            }
            byte0 = 0;
        }
        return (new byte[] {
            byte0
        });
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public byte[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        byte abyte0[];
        com.fasterxml.jackson.databind.util.eser eser;
        int i;
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            return jsonparser.getBinaryValue(deserializationcontext.getBase64Variant());
        }
        if (jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            Object obj = jsonparser.getEmbeddedObject();
            if (obj == null)
            {
                return null;
            }
            if (obj instanceof byte[])
            {
                return (byte[])(byte[])obj;
            }
        }
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        eser = deserializationcontext.getArrayBuilders().getByteBuilder();
        abyte0 = (byte[])eser.t();
        i = 0;
_L5:
        byte byte0;
        Object obj1;
        obj1 = jsonparser.nextToken();
        if (obj1 == JsonToken.END_ARRAY)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        if (obj1 != JsonToken.VALUE_NUMBER_INT && obj1 != JsonToken.VALUE_NUMBER_FLOAT)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        byte0 = jsonparser.getByteValue();
_L3:
        if (i < abyte0.length) goto _L2; else goto _L1
_L1:
        obj1 = (byte[])eser.tedChunk(abyte0, i);
        i = 0;
        abyte0 = ((byte []) (obj1));
_L2:
        int j = i + 1;
        abyte0[i] = byte0;
        i = j;
        continue; /* Loop/switch isn't completed */
        try
        {
            if (obj1 != JsonToken.VALUE_NULL)
            {
                throw deserializationcontext.mappingException(_valueClass.getComponentType());
            }
        }
        // Misplaced declaration of an exception variable
        catch (JsonParser jsonparser)
        {
            throw JsonMappingException.wrapWithPath(jsonparser, abyte0, eser.() + i);
        }
        byte0 = 0;
          goto _L3
        return (byte[])eser.learBuffer(abyte0, i);
        if (true) goto _L5; else goto _L4
_L4:
    }

    public ()
    {
        super([B);
    }
}
