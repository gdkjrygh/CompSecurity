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

    private final float[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
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
            return (new float[] {
                _parseFloatPrimitive(jsonparser, deserializationcontext)
            });
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public float[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        com.fasterxml.jackson.databind.util.eser eser = deserializationcontext.getArrayBuilders().getFloatBuilder();
        float af[] = (float[])eser.t();
        int i = 0;
label0:
        do
        {
label1:
            {
                float f;
                float af1[];
                int j;
                try
                {
                    if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                    {
                        break label0;
                    }
                    f = _parseFloatPrimitive(jsonparser, deserializationcontext);
                    if (i < af.length)
                    {
                        break label1;
                    }
                    af1 = (float[])eser.tedChunk(af, i);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    throw JsonMappingException.wrapWithPath(jsonparser, af, eser.() + i);
                }
                i = 0;
                af = af1;
            }
            j = i + 1;
            af[i] = f;
            i = j;
        } while (true);
        return (float[])eser.learBuffer(af, i);
    }

    public ()
    {
        super([F);
    }
}
