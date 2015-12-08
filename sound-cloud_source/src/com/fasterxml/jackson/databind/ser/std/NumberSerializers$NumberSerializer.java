// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer, NumberSerializers

public static final class  extends StdScalarSerializer
{

    public static final serialize instance = new <init>();

    public final void serialize(Number number, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        if (number instanceof BigDecimal)
        {
            jsongenerator.writeNumber((BigDecimal)number);
            return;
        }
        if (number instanceof BigInteger)
        {
            jsongenerator.writeNumber((BigInteger)number);
            return;
        }
        if (number instanceof Integer)
        {
            jsongenerator.writeNumber(number.intValue());
            return;
        }
        if (number instanceof Long)
        {
            jsongenerator.writeNumber(number.longValue());
            return;
        }
        if (number instanceof Double)
        {
            jsongenerator.writeNumber(number.doubleValue());
            return;
        }
        if (number instanceof Float)
        {
            jsongenerator.writeNumber(number.floatValue());
            return;
        }
        if ((number instanceof Byte) || (number instanceof Short))
        {
            jsongenerator.writeNumber(number.intValue());
            return;
        } else
        {
            jsongenerator.writeNumber(number.toString());
            return;
        }
    }

    public final volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((Number)obj, jsongenerator, serializerprovider);
    }


    public ()
    {
        super(java/lang/Number);
    }
}
