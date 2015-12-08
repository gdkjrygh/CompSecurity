// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            NumberDeserializers

public static class Deserializer extends Deserializer
{

    static final <init> primitiveInstance = new <init>(java/lang/Short, Short.valueOf((short)0));
    static final <init> wrapperInstance;

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Short deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _parseShort(jsonparser, deserializationcontext);
    }

    static 
    {
        wrapperInstance = new <init>(Short.TYPE, null);
    }

    public Deserializer(Class class1, Short short1)
    {
        super(class1, short1);
    }
}
