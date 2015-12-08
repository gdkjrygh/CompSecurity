// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;

public final class rDeserializer extends rDeserializer
{

    private static final <init> primitiveInstance = new <init>(java/lang/Long, Long.valueOf(0L));
    private static final long serialVersionUID = 1L;
    private static final <init> wrapperInstance;

    public final Long deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return _parseLong(jsonparser, deserializationcontext);
    }

    public final volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    static 
    {
        wrapperInstance = new <init>(Long.TYPE, null);
    }



    public rDeserializer(Class class1, Long long1)
    {
        super(class1, long1);
    }
}
