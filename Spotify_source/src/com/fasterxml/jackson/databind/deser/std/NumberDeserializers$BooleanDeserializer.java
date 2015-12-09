// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public final class serializer extends serializer
{

    private static final <init> primitiveInstance;
    private static final long serialVersionUID = 1L;
    private static final <init> wrapperInstance;

    public final Boolean deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _parseBoolean(jsonparser, deserializationcontext);
    }

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public final Boolean deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return _parseBoolean(jsonparser, deserializationcontext);
    }

    public final volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
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
