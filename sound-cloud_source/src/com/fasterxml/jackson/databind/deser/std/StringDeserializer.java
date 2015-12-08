// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public final class StringDeserializer extends StdScalarDeserializer
{

    public StringDeserializer()
    {
        super(java/lang/String);
    }

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public final String deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj = jsonparser.getValueAsString();
        if (obj != null)
        {
            return ((String) (obj));
        }
        obj = jsonparser.getCurrentToken();
        if (obj == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            jsonparser = ((JsonParser) (jsonparser.getEmbeddedObject()));
            if (jsonparser == null)
            {
                return null;
            }
            if (jsonparser instanceof byte[])
            {
                return Base64Variants.getDefaultVariant().encode((byte[])(byte[])jsonparser, false);
            } else
            {
                return jsonparser.toString();
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, ((JsonToken) (obj)));
        }
    }

    public final volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
    }

    public final String deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }
}
