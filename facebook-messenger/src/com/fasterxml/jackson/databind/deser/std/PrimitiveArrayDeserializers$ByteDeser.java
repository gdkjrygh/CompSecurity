// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

final class > extends >
{

    private final byte[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public byte[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
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
        com.fasterxml.jackson.databind.util.eser eser = deserializationcontext.getArrayBuilders().getByteBuilder();
        byte abyte0[] = (byte[])eser.t();
        int i = 0;
        do
        {
            JsonToken jsontoken1 = jsonparser.nextToken();
            if (jsontoken1 != JsonToken.END_ARRAY)
            {
                byte byte0;
                int j;
                if (jsontoken1 == JsonToken.VALUE_NUMBER_INT || jsontoken1 == JsonToken.VALUE_NUMBER_FLOAT)
                {
                    byte0 = jsonparser.getByteValue();
                } else
                {
                    if (jsontoken1 != JsonToken.VALUE_NULL)
                    {
                        throw deserializationcontext.mappingException(_valueClass.getComponentType());
                    }
                    byte0 = 0;
                }
                if (i >= abyte0.length)
                {
                    abyte0 = (byte[])eser.tedChunk(abyte0, i);
                    i = 0;
                }
                j = i + 1;
                abyte0[i] = byte0;
                i = j;
            } else
            {
                return (byte[])eser.learBuffer(abyte0, i);
            }
        } while (true);
    }

    public ()
    {
        super([B);
    }
}
