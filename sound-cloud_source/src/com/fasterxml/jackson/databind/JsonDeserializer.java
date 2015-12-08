// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.io.IOException;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind:
//            DeserializationContext

public abstract class JsonDeserializer
{
    public static abstract class None extends JsonDeserializer
    {

        private None()
        {
        }
    }


    public JsonDeserializer()
    {
    }

    public abstract Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException;

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        throw new UnsupportedOperationException((new StringBuilder("Can not update object of type ")).append(obj.getClass().getName()).toString());
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }

    public Object getEmptyValue()
    {
        return getNullValue();
    }

    public Collection getKnownPropertyNames()
    {
        return null;
    }

    public Object getNullValue()
    {
        return null;
    }

    public boolean isCachable()
    {
        return false;
    }

    public JsonDeserializer unwrappingDeserializer(NameTransformer nametransformer)
    {
        return this;
    }
}
