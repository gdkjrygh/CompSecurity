// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.SerializerProvider;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            ValueNode, JsonNodeType

public class BooleanNode extends ValueNode
{

    public static final BooleanNode FALSE = new BooleanNode(false);
    public static final BooleanNode TRUE = new BooleanNode(true);
    private final boolean _value;

    private BooleanNode(boolean flag)
    {
        _value = flag;
    }

    public static BooleanNode getFalse()
    {
        return FALSE;
    }

    public static BooleanNode getTrue()
    {
        return TRUE;
    }

    public int asInt(int i)
    {
        return !_value ? 0 : 1;
    }

    public long asLong(long l)
    {
        return !_value ? 0L : 1L;
    }

    public String asText()
    {
        if (_value)
        {
            return "true";
        } else
        {
            return "false";
        }
    }

    public JsonToken asToken()
    {
        if (_value)
        {
            return JsonToken.VALUE_TRUE;
        } else
        {
            return JsonToken.VALUE_FALSE;
        }
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (!(obj instanceof BooleanNode))
            {
                return false;
            }
            if (_value != ((BooleanNode)obj)._value)
            {
                return false;
            }
        }
        return true;
    }

    public JsonNodeType getNodeType()
    {
        return JsonNodeType.BOOLEAN;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
    {
        jsongenerator.writeBoolean(_value);
    }

}
