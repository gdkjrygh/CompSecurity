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

    private final boolean[] handleNonArray(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
            return (new boolean[] {
                _parseBooleanPrimitive(jsonparser, deserializationcontext)
            });
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public boolean[] deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        if (!jsonparser.isExpectedStartArrayToken())
        {
            return handleNonArray(jsonparser, deserializationcontext);
        }
        com.fasterxml.jackson.databind.util.eser eser = deserializationcontext.getArrayBuilders().getBooleanBuilder();
        boolean aflag[] = (boolean[])eser.t();
        int i = 0;
label0:
        do
        {
label1:
            {
                boolean aflag1[];
                int j;
                boolean flag;
                try
                {
                    if (jsonparser.nextToken() == JsonToken.END_ARRAY)
                    {
                        break label0;
                    }
                    flag = _parseBooleanPrimitive(jsonparser, deserializationcontext);
                    if (i < aflag.length)
                    {
                        break label1;
                    }
                    aflag1 = (boolean[])eser.tedChunk(aflag, i);
                }
                // Misplaced declaration of an exception variable
                catch (JsonParser jsonparser)
                {
                    throw JsonMappingException.wrapWithPath(jsonparser, aflag, eser.() + i);
                }
                i = 0;
                aflag = aflag1;
            }
            j = i + 1;
            aflag[i] = flag;
            i = j;
        } while (true);
        return (boolean[])eser.learBuffer(aflag, i);
    }

    public ()
    {
        super([Z);
    }
}
