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

    public static final uffer instance = new <init>();

    private final long[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_STRING && deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT) && jsonparser.getText().length() == 0)
        {
            return null;
        }
        if (!deserializationcontext.isEnabled(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY))
        {
            throw deserializationcontext.mappingException(_valueClass);
        } else
        {
            return (new long[] {
                _parseLongPrimitive(jsonparser, deserializationcontext)
            });
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public long[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        com.fasterxml.jackson.databind.util.eser eser = deserializationcontext.getArrayBuilders().getLongBuilder();
        long al[] = (long[])eser.t();
        int i = 0;
label0:
        do
        {
label1:
            {
                long al1[];
                int j;
                long l;
                try
                {
                    if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                    {
                        break label0;
                    }
                    l = _parseLongPrimitive(jsonparser, deserializationcontext);
                    if (i < al.length)
                    {
                        break label1;
                    }
                    al1 = (long[])eser.tedChunk(al, i);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    throw JsonMappingException.wrapWithPath(jsonparser, al, eser.() + i);
                }
                i = 0;
                al = al1;
            }
            j = i + 1;
            al[i] = l;
            i = j;
        } while (true);
        return (long[])eser.learBuffer(al, i);
    }


    public ()
    {
        super([J);
    }
}
