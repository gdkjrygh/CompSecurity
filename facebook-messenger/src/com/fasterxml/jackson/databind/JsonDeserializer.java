// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.impl.ObjectIdReader;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import com.fasterxml.jackson.databind.util.NameTransformer;
import java.util.Collection;

// Referenced classes of package com.fasterxml.jackson.databind:
//            DeserializationContext

public abstract class JsonDeserializer
{

    public JsonDeserializer()
    {
    }

    public abstract Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext);

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Can not update object of type ").append(obj.getClass().getName()).toString());
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
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

    public ObjectIdReader getObjectIdReader()
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
