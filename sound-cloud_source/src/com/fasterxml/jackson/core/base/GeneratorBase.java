// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.base;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.json.JsonWriteContext;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public abstract class GeneratorBase extends JsonGenerator
{

    public boolean _cfgNumbersAsStrings;
    protected boolean _closed;
    protected int _features;
    protected ObjectCodec _objectCodec;
    public JsonWriteContext _writeContext;

    public GeneratorBase(int i, ObjectCodec objectcodec)
    {
        _features = i;
        _writeContext = JsonWriteContext.createRootContext();
        _objectCodec = objectcodec;
        _cfgNumbersAsStrings = isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS);
    }

    public void _cantHappen()
    {
        throw new RuntimeException("Internal error: should never end up through this code path");
    }

    public void _reportError(String s)
        throws JsonGenerationException
    {
        throw new JsonGenerationException(s);
    }

    public abstract void _verifyValueWrite(String s)
        throws IOException, JsonGenerationException;

    protected void _writeSimpleObject(Object obj)
        throws IOException, JsonGenerationException
    {
        if (obj == null)
        {
            writeNull();
            return;
        }
        if (obj instanceof String)
        {
            writeString((String)obj);
            return;
        }
        if (obj instanceof Number)
        {
            Number number = (Number)obj;
            if (number instanceof Integer)
            {
                writeNumber(number.intValue());
                return;
            }
            if (number instanceof Long)
            {
                writeNumber(number.longValue());
                return;
            }
            if (number instanceof Double)
            {
                writeNumber(number.doubleValue());
                return;
            }
            if (number instanceof Float)
            {
                writeNumber(number.floatValue());
                return;
            }
            if (number instanceof Short)
            {
                writeNumber(number.shortValue());
                return;
            }
            if (number instanceof Byte)
            {
                writeNumber(number.byteValue());
                return;
            }
            if (number instanceof BigInteger)
            {
                writeNumber((BigInteger)number);
                return;
            }
            if (number instanceof BigDecimal)
            {
                writeNumber((BigDecimal)number);
                return;
            }
            if (number instanceof AtomicInteger)
            {
                writeNumber(((AtomicInteger)number).get());
                return;
            }
            if (number instanceof AtomicLong)
            {
                writeNumber(((AtomicLong)number).get());
                return;
            }
        } else
        {
            if (obj instanceof byte[])
            {
                writeBinary((byte[])(byte[])obj);
                return;
            }
            if (obj instanceof Boolean)
            {
                writeBoolean(((Boolean)obj).booleanValue());
                return;
            }
            if (obj instanceof AtomicBoolean)
            {
                writeBoolean(((AtomicBoolean)obj).get());
                return;
            }
        }
        throw new IllegalStateException((new StringBuilder("No ObjectCodec defined for the generator, can only serialize simple wrapper types (type passed ")).append(obj.getClass().getName()).append(")").toString());
    }

    public void close()
        throws IOException
    {
        _closed = true;
    }

    public final JsonWriteContext getOutputContext()
    {
        return _writeContext;
    }

    public final boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return (_features & feature.getMask()) != 0;
    }

    public JsonGenerator useDefaultPrettyPrinter()
    {
        if (getPrettyPrinter() != null)
        {
            return this;
        } else
        {
            return setPrettyPrinter(new DefaultPrettyPrinter());
        }
    }

    public void writeFieldName(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        writeFieldName(serializablestring.getValue());
    }

    public void writeObject(Object obj)
        throws IOException, JsonProcessingException
    {
        if (obj == null)
        {
            writeNull();
            return;
        }
        if (_objectCodec != null)
        {
            _objectCodec.writeValue(this, obj);
            return;
        } else
        {
            _writeSimpleObject(obj);
            return;
        }
    }

    public void writeRawValue(String s)
        throws IOException, JsonGenerationException
    {
        _verifyValueWrite("write raw value");
        writeRaw(s);
    }

    public void writeString(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        writeString(serializablestring.getValue());
    }
}
