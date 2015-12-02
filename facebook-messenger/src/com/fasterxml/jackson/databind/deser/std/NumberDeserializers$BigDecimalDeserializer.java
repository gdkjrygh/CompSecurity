// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.math.BigDecimal;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class Y extends StdScalarDeserializer
{

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public BigDecimal deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_NUMBER_INT || jsontoken == JsonToken.VALUE_NUMBER_FLOAT)
        {
            return jsonparser.getDecimalValue();
        }
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            jsonparser = jsonparser.getText().trim();
            if (jsonparser.length() == 0)
            {
                return null;
            }
            try
            {
                jsonparser = new BigDecimal(jsonparser);
            }
            // Misplaced declaration of an exception variable
            catch (JsonParser jsonparser)
            {
                throw deserializationcontext.weirdStringException(_valueClass, "not a valid representation");
            }
            return jsonparser;
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    public Y()
    {
        super(java/math/BigDecimal);
    }
}
