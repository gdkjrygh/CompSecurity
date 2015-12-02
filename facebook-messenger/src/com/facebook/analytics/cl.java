// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.node.ValueNode;

public class cl extends ValueNode
{

    private final String a;

    public cl(String s)
    {
        a = s;
    }

    public String asText()
    {
        return a;
    }

    public JsonToken asToken()
    {
        return JsonToken.START_OBJECT;
    }

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public boolean isNull()
    {
        return false;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeRawValue(a);
    }
}
