// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            NumberDeserializers

public static final class serializer extends serializer
{

    static final <init> primitiveInstance;
    static final <init> wrapperInstance;

    public Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return _parseBoolean(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException, JsonProcessingException
    {
        return _parseBoolean(jsonparser, deserializationcontext);
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
        throws IOException
    {
        return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
    }

    static 
    {
        primitiveInstance = new <init>(java/lang/Boolean, Boolean.FALSE);
        wrapperInstance = new <init>(Boolean.TYPE, null);
    }

    public serializer(Class class1, Boolean boolean1)
    {
        super(class1, boolean1);
    }
}
