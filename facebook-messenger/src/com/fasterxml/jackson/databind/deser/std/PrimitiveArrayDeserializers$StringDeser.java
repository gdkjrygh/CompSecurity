// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.util.ObjectBuffer;

final class  extends 
{

    private final String[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
            jsonparser = jsonparser.getText();
        }
        return (new String[] {
            jsonparser
        });
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public String[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
                    obj = jsonparser.getText();
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
