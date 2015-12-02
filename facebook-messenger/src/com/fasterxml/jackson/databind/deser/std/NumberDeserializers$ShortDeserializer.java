// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

public final class Deserializer extends Deserializer
{

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _parseShort(jsonparser, deserializationcontext);
    }

    public Deserializer(Class class1, Short short1)
    {
        super(class1, short1);
    }
}
