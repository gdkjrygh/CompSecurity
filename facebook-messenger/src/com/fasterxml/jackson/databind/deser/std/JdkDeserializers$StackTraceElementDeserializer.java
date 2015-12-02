// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonMappingException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class  extends StdScalarDeserializer
{

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public StackTraceElement deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.START_OBJECT)
        {
            obj = "";
            String s = "";
            String s1 = "";
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
                    obj = jsonparser.getText();
                } else
                if ("fileName".equals(s2))
                {
                    s1 = jsonparser.getText();
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
                    s = jsonparser.getText();
                } else
                if (!"nativeMethod".equals(s2))
                {
                    handleUnknownProperty(jsonparser, deserializationcontext, _valueClass, s2);
                }
            } while (true);
            return new StackTraceElement(((String) (obj)), s, s1, i);
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
    }

    public ()
    {
        super(java/lang/StackTraceElement);
    }
}
