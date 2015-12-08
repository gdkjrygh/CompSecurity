// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

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

    public final String asText()
    {
        return "null";
    }

    public final boolean equals(Object obj)
    {
        return obj == this;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNull();
    }

}
