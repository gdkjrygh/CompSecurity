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

public static class  extends StdScalarDeserializer
{

    public static final deserialize instance = new <init>();

    public Number deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
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
            break MISSING_BLOCK_LABEL_261;
        }
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() == 0)
        {
            return (Number)getEmptyValue();
        }
        if (_hasTextualNull(jsonparser))
        {
            return (Number)getNullValue();
        }
        if (_isPosInf(jsonparser))
        {
            return Double.valueOf((1.0D / 0.0D));
        }
        if (_isNegInf(jsonparser))
        {
            return Double.valueOf((-1.0D / 0.0D));
        }
        if (_isNaN(jsonparser))
        {
            return Double.valueOf((0.0D / 0.0D));
        }
        if (jsonparser.indexOf('.') < 0)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (!deserializationcontext.isEnabled(DeserializationFeature.USE_BIG_DECIMAL_FOR_FLOATS))
        {
            break MISSING_BLOCK_LABEL_196;
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
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            obj = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, (new StringBuilder()).append("Attempted to unwrap single value array for single '").append(_valueClass.getName()).append("' value but there was more than a single value in the array").toString());
            } else
            {
                return ((Number) (obj));
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
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
