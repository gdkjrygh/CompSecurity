// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.util.ArrayBuilders;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            PrimitiveArrayDeserializers

final class  extends PrimitiveArrayDeserializers
{

    private static final long serialVersionUID = 1L;

    private final short[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
            return (new short[] {
                _parseShortPrimitive(jsonparser, deserializationcontext)
            });
        }
    }

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public final short[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        com.fasterxml.jackson.databind.util.eser eser = deserializationcontext.getArrayBuilders().getShortBuilder();
        short aword0[] = (short[])eser.t();
        int i = 0;
label0:
        do
        {
label1:
            {
                short word0;
                short aword1[];
                int j;
                try
                {
                    if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                    {
                        break label0;
                    }
                    word0 = _parseShortPrimitive(jsonparser, deserializationcontext);
                    if (i < aword0.length)
                    {
                        break label1;
                    }
                    aword1 = (short[])eser.tedChunk(aword0, i);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    throw JsonMappingException.wrapWithPath(jsonparser, aword0, i);
                }
                i = 0;
                aword0 = aword1;
            }
            j = i + 1;
            aword0[i] = word0;
            i = j;
        } while (true);
        return (short[])eser.learBuffer(aword0, i);
    }

    public ()
    {
        super([S);
    }
}
