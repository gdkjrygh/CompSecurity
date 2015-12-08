// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;

// Referenced classes of package com.fasterxml.jackson.databind.node:
//            NumericNode

public final class DecimalNode extends NumericNode
{

    private static final BigDecimal MAX_INTEGER = BigDecimal.valueOf(0x7fffffffL);
    private static final BigDecimal MAX_LONG = BigDecimal.valueOf(0x7fffffffffffffffL);
    private static final BigDecimal MIN_INTEGER = BigDecimal.valueOf(0xffffffff80000000L);
    private static final BigDecimal MIN_LONG = BigDecimal.valueOf(0x8000000000000000L);
    protected final BigDecimal _value;

    public DecimalNode(BigDecimal bigdecimal)
    {
        _value = bigdecimal;
    }

    public static DecimalNode valueOf(BigDecimal bigdecimal)
    {
        return new DecimalNode(bigdecimal);
    }

    public final String asText()
    {
        return _value.toString();
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj != null)
            {
                flag = flag1;
                if (obj.getClass() == getClass())
                {
                    return ((DecimalNode)obj)._value.equals(_value);
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return _value.hashCode();
    }

    public final void serialize(JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonProcessingException
    {
        jsongenerator.writeNumber(_value);
    }

}
