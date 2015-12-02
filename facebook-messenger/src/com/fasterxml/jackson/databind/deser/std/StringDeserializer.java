// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.Base64Variants;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public final class StringDeserializer extends StdScalarDeserializer
{

    public StringDeserializer()
    {
        super(java/lang/String);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public String deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        JsonToken jsontoken = jsonparser.getCurrentToken();
        if (jsontoken == JsonToken.VALUE_STRING)
        {
            return jsonparser.getText();
        }
        if (jsontoken == JsonToken.VALUE_EMBEDDED_OBJECT)
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
        }
        if (jsontoken.isScalarValue())
        {
            return jsonparser.getText();
        } else
        {
            throw deserializationcontext.mappingException(_valueClass, jsontoken);
        }
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
    }

    public String deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return deserialize(jsonparser, deserializationcontext);
    }
}
