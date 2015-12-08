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

public final class BooleanNode extends ValueNode
{

    public static final BooleanNode FALSE = new BooleanNode();
    public static final BooleanNode TRUE = new BooleanNode();

    private BooleanNode()
    {
    }

    public static BooleanNode getFalse()
    {
        return FALSE;
    }

    public static BooleanNode getTrue()
    {
        return TRUE;
    }

    public final String asText()
    {
        if (this == TRUE)
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public final boolean equals(Object obj)
    {
        return obj == this;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        boolean flag;
        if (this == TRUE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        jsongenerator.writeBoolean(flag);
    }

}
