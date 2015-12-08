// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public abstract class FromStringDeserializer extends StdScalarDeserializer
{

    protected FromStringDeserializer(Class class1)
    {
        super(class1);
    }

    protected abstract Object _deserialize(String s, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException;

    protected Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        throw deserializationcontext.mappingException((new StringBuilder("Don't know how to convert embedded Object of type ")).append(obj.getClass().getName()).append(" into ").append(_valueClass.getName()).toString());
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        Object obj;
        String s;
        obj = null;
        s = jsonparser.getValueAsString();
        if (s == null) goto _L2; else goto _L1
_L1:
        jsonparser = ((JsonParser) (obj));
        if (s.length() == 0) goto _L4; else goto _L3
_L3:
        s = s.trim();
        if (s.length() != 0) goto _L6; else goto _L5
_L5:
        jsonparser = ((JsonParser) (obj));
_L4:
        return jsonparser;
_L6:
        obj = _deserialize(s, deserializationcontext);
        jsonparser = ((JsonParser) (obj));
        if (obj != null) goto _L4; else goto _L7
_L7:
        throw deserializationcontext.weirdStringException(s, _valueClass, "not a valid textual representation");
_L2:
        if (jsonparser.getCurrentToken() == JsonToken.VALUE_EMBEDDED_OBJECT)
        {
            Object obj1 = jsonparser.getEmbeddedObject();
            jsonparser = ((JsonParser) (obj));
            if (obj1 != null)
            {
                if (_valueClass.isAssignableFrom(obj1.getClass()))
                {
                    return obj1;
                } else
                {
                    return _deserializeEmbedded(obj1, deserializationcontext);
                }
            }
        } else
        {
            throw deserializationcontext.mappingException(_valueClass);
        }
          goto _L4
        jsonparser;
          goto _L7
    }
}
