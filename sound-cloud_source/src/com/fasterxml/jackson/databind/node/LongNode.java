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

public final class LongNode extends NumericNode
{

    final long _value;

    public LongNode(long l)
    {
        _value = l;
    }

    public static LongNode valueOf(long l)
    {
        return new LongNode(l);
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
            if (((LongNode)obj)._value != _value)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return (int)_value ^ (int)(_value >> 32);
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }
}
