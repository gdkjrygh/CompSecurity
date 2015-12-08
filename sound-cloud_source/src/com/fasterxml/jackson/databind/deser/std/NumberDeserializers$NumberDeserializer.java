// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer, NumberDeserializers

public static final class  extends StdScalarDeserializer
{

    public final Number deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_NUMBER_INT)
        {
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
            {
                return jsonparser.getBigIntegerValue();
            } else
            {
                return jsonparser.getNumberValue();
            }
        }
        if (obj == JsonToken.VALUE_NUMBER_FLOAT)
        {
            if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
            {
                return jsonparser.getDecimalValue();
            } else
            {
                return Double.valueOf(jsonparser.getDoubleValue());
            }
        }
        if (obj != JsonToken.VALUE_STRING)
        {
            break MISSING_BLOCK_LABEL_185;
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.indexOf('.') < 0)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (!deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        obj = new BigDecimal(jsonparser);
        return ((Number) (obj));
        return new Double(jsonparser);
        long l;
        if (deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_INTEGER_FOR_INTS))
        {
            return new BigInteger(jsonparser);
        }
        l = Long.parseLong(jsonparser);
        if (l <= 0x7fffffffL && l >= 0xffffffff80000000L)
        {
            try
            {
                return Integer.valueOf((int)l);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                throw deserializationcontext.weirdStringException(jsonparser, _valueClass, "not a valid number");
            }
        } else
        {
            return Long.valueOf(l);
        }
        throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
    }

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public final Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        switch (sterxml.jackson.core.JsonToken[jsonparser.getCurrentToken().ordinal()])
        {
        default:
            return typedeserializer.deserializeTypedFromScalar(jsonparser, deserializationcontext);

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            return deserialize(jsonparser, deserializationcontext);
        }
    }

    public ()
    {
        super(java/lang/Number);
    }
}
