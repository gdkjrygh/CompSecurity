// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

public class FailingDeserializer extends StdDeserializer
{

    private static final long serialVersionUID = 1L;
    protected final String _message;

    public FailingDeserializer(String s)
    {
        super(java/lang/Object);
        _message = s;
    }

    public Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        throw deserializationcontext.mappingException(_message);
    }
}
