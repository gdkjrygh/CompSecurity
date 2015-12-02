// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode

public final class NullNode extends ValueNode
{

    public static final NullNode instance = new NullNode();

    private NullNode()
    {
    }

    public static NullNode getInstance()
    {
        return instance;
    }

    public String asText()
    {
        return "null";
    }

    public JsonToken asToken()
    {
        return JsonToken.VALUE_NULL;
    }

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public boolean isNull()
    {
        return true;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeNull();
    }

}
