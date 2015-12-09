// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.deser.SettableBeanProperty;
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
        throw new UnsupportedOperationException((new StringBuilder("Can not update object of type ")).append(obj.getClass().getName()).append(" (by deserializer of type ").append(getClass().getName()).append(")").toString());
    }

    public Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return typedeserializer.deserializeTypedFromAny(jsonparser, deserializationcontext);
    }

    public SettableBeanProperty findBackReference(String s)
    {
        throw new IllegalArgumentException((new StringBuilder("Can not handle managed/back reference '")).append(s).append("': type: value deserializer of type ").append(getClass().getName()).append(" does not support them").toString());
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

    public Class handledType()
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
