// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.util.ObjectBuffer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            PrimitiveArrayDeserializers

static final class  extends 
{

    private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj = null;
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
            {
                return null;
            } else
            {
                throw deserializationcontext.mappingException(_valueClass);
            }
        }
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_NULL)
        {
            jsonparser = obj;
        } else
        {
            jsonparser = _parseString(jsonparser, deserializationcontext);
        }
        return (new String[] {
            jsonparser
        });
    }

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public final String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        ObjectBuffer objectbuffer = deserializationcontext.leaseObjectBuffer();
        Object aobj[] = objectbuffer.resetAndStart();
        int i = 0;
        do
        {
            Object obj = jsonparser.nextToken();
            if (obj != JsonToken.END_ARRAY)
            {
                int j;
                if (obj == JsonToken.VALUE_NULL)
                {
                    obj = null;
                } else
                {
                    obj = _parseString(jsonparser, deserializationcontext);
                }
                if (i >= aobj.length)
                {
                    aobj = objectbuffer.appendCompletedChunk(aobj);
                    i = 0;
                }
                j = i + 1;
                aobj[i] = obj;
                i = j;
            } else
            {
                jsonparser = (String[])objectbuffer.completeAndClearBuffer(aobj, i, java/lang/String);
                deserializationcontext.returnObjectBuffer(objectbuffer);
                return jsonparser;
            }
        } while (true);
    }

    public ()
    {
        super([Ljava/lang/String;);
    }
}
