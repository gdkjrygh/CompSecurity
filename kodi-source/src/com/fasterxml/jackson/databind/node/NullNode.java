// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode, JsonNodeType

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

    public boolean equals(Object obj)
    {
        return obj == this;
    }

    public JsonNodeType getNodeType()
    {
        return JsonNodeType.NULL;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        serializerprovider.defaultSerializeNull(jsongenerator);
    }

}
