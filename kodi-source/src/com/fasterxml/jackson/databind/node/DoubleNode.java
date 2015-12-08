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

public class DoubleNode extends NumericNode
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

    public String asText()
    {
        return NumberOutput.toString(_value);
    }

    public double doubleValue()
    {
        return _value;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (obj == null)
            {
                return false;
            }
            if (obj instanceof DoubleNode)
            {
                double d = ((DoubleNode)obj)._value;
                if (Double.compare(_value, d) != 0)
                {
                    return false;
                }
            } else
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        long l = Double.doubleToLongBits(_value);
        return (int)l ^ (int)(l >> 32);
    }

    public int intValue()
    {
        return (int)_value;
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }
}
