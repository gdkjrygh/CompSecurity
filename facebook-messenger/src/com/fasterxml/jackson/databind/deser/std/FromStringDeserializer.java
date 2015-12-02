// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.DeserializationContext;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public abstract class FromStringDeserializer extends StdScalarDeserializer
{

    protected FromStringDeserializer(Class class1)
    {
        super(class1);
    }

    protected abstract Object _deserialize(String s, DeserializationContext deserializationcontext);

    protected Object _deserializeEmbedded(Object obj, DeserializationContext deserializationcontext)
    {
        throw deserializationcontext.mappingException((new StringBuilder()).append("Don't know how to convert embedded Object of type ").append(obj.getClass().getName()).append(" into ").append(_valueClass.getName()).toString());
    }

    public final Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        Object obj = null;
        if (jsonparser.getCurrentToken() != JsonToken.VALUE_STRING) goto _L2; else goto _L1
_L1:
        jsonparser = jsonparser.getText().trim();
        if (jsonparser.length() != 0) goto _L4; else goto _L3
_L3:
        jsonparser = ((JsonParser) (obj));
_L6:
        return jsonparser;
_L4:
        obj = _deserialize(jsonparser, deserializationcontext);
        jsonparser = ((JsonParser) (obj));
        if (obj != null) goto _L6; else goto _L5
_L5:
        throw deserializationcontext.weirdStringException(_valueClass, "not a valid textual representation");
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
          goto _L6
        jsonparser;
          goto _L5
    }
}
