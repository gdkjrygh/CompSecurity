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
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class StackTraceElementDeserializer extends StdScalarDeserializer
{

    public StackTraceElementDeserializer()
    {
        super(java/lang/StackTraceElement);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public StackTraceElement deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.START_OBJECT)
        {
            String s1 = "";
            obj = "";
            String s = "";
            int i = -1;
            do
            {
                JsonToken jsontoken = jsonparser.nextValue();
                if (jsontoken == JsonToken.END_OBJECT)
                {
                    break;
                }
                String s2 = jsonparser.getCurrentName();
                if ("className".equals(s2))
                {
                    s1 = jsonparser.getText();
                } else
                if ("fileName".equals(s2))
                {
                    s = jsonparser.getText();
                } else
                if ("lineNumber".equals(s2))
                {
                    if (jsontoken.isNumeric())
                    {
                        i = jsonparser.getIntValue();
                    } else
                    {
                        throw JsonMappingException.from(jsonparser, (new StringBuilder()).append("Non-numeric token (").append(jsontoken).append(") for property 'lineNumber'").toString());
                    }
                } else
                if ("methodName".equals(s2))
                {
                    obj = jsonparser.getText();
                } else
                if (!"nativeMethod".equals(s2))
                {
                    handleUnknownProperty(jsonparser, deserializationcontext, _valueClass, s2);
                }
            } while (true);
            obj = new StackTraceElement(s1, ((String) (obj)), s, i);
        } else
        if (obj == JsonToken.START_ARRAY && deserializationcontext.isEnabled(DeserializationFeature.UNWRAP_SINGLE_VALUE_ARRAYS))
        {
            jsonparser.nextToken();
            obj = deserialize(jsonparser, deserializationcontext);
            if (jsonparser.nextToken() != JsonToken.END_ARRAY)
            {
                throw deserializationcontext.wrongTokenException(jsonparser, JsonToken.END_ARRAY, "Attempted to unwrap single value array for single 'java.lang.StackTraceElement' value but there was more than a single value in the array");
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
        return ((StackTraceElement) (obj));
    }
}
