// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.io.NumberOutput;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NumericNode

public final class IntNode extends NumericNode
{

    private static final IntNode CANONICALS[];
    final int _value;

    public IntNode(int i)
    {
        _value = i;
    }

    public static IntNode valueOf(int i)
    {
        if (i > 10 || i < -1)
        {
            return new IntNode(i);
        } else
        {
            return CANONICALS[i + 1];
        }
    }

    public final String asText()
    {
        return NumberOutput.toString(_value);
    }

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj.getClass() != getClass())
            {
                return false;
            }
            if (((IntNode)obj)._value != _value)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return _value;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }

    static 
    {
        CANONICALS = new IntNode[12];
        for (int i = 0; i < 12; i++)
        {
            CANONICALS[i] = new IntNode(i - 1);
        }

    }
}
