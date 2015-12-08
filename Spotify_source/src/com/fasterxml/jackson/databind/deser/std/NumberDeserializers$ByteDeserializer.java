// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

public class rDeserializer extends rDeserializer
{

    private static final <init> primitiveInstance;
    private static final long serialVersionUID = 1L;
    private static final <init> wrapperInstance = new <init>(java/lang/Byte, null);

    public Byte deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _parseByte(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    static 
    {
        primitiveInstance = new <init>(Byte.TYPE, Byte.valueOf((byte)0));
    }



    public rDeserializer(Class class1, Byte byte1)
    {
        super(class1, byte1);
    }
}
