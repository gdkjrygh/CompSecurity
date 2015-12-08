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

public final class DoubleNode extends NumericNode
{

    protected final double _value;

    public DoubleNode(double d)
    {
        _value = d;
    }

    public static DoubleNode valueOf(double d)
    {
        return new DoubleNode(d);
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
            double d = ((DoubleNode)obj)._value;
            if (Double.compare(_value, d) != 0)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        long l = Double.doubleToLongBits(_value);
        int i = (int)l;
        return (int)(l >> 32) ^ i;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }
}
