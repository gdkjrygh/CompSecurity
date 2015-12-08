// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

public class eserializer extends eserializer
{

    private static final <init> primitiveInstance = new <init>(java/lang/Double, Double.valueOf(0.0D));
    private static final long serialVersionUID = 1L;
    private static final <init> wrapperInstance;

    public Double deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _parseDouble(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public Double deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return _parseDouble(jsonparser, deserializationcontext);
    }

    public volatile Object deserializeWithType(JsonParser jsonparser, DeserializationContext deserializationcontext, TypeDeserializer typedeserializer)
    {
        return deserializeWithType(jsonparser, deserializationcontext, typedeserializer);
    }

    static 
    {
        wrapperInstance = new <init>(Double.TYPE, null);
    }



    public eserializer(Class class1, Double double1)
    {
        super(class1, double1);
    }
}
