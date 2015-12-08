// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.jackson2;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.google.api.client.json.jackson2:
//            JacksonFactory

final class JacksonGenerator extends JsonGenerator
{

    private final JacksonFactory factory;
    private final com.fasterxml.jackson.core.JsonGenerator generator;

    JacksonGenerator(JacksonFactory jacksonfactory, com.fasterxml.jackson.core.JsonGenerator jsongenerator)
    {
        factory = jacksonfactory;
        generator = jsongenerator;
    }

    public void close()
        throws IOException
    {
        generator.close();
    }

    public void enablePrettyPrint()
        throws IOException
    {
        generator.useDefaultPrettyPrinter();
    }

    public void flush()
        throws IOException
    {
        generator.flush();
    }

    public volatile JsonFactory getFactory()
    {
        return getFactory();
    }

    public JacksonFactory getFactory()
    {
        return factory;
    }

    public void writeBoolean(boolean flag)
        throws IOException
    {
        generator.writeBoolean(flag);
    }

    public void writeEndArray()
        throws IOException
    {
        generator.writeEndArray();
    }

    public void writeEndObject()
        throws IOException
    {
        generator.writeEndObject();
    }

    public void writeFieldName(String s)
        throws IOException
    {
        generator.writeFieldName(s);
    }

    public void writeNull()
        throws IOException
    {
        generator.writeNull();
    }

    public void writeNumber(double d)
        throws IOException
    {
        generator.writeNumber(d);
    }

    public void writeNumber(float f)
        throws IOException
    {
        generator.writeNumber(f);
    }

    public void writeNumber(int i)
        throws IOException
    {
        generator.writeNumber(i);
    }

    public void writeNumber(long l)
        throws IOException
    {
        generator.writeNumber(l);
    }

    public void writeNumber(String s)
        throws IOException
    {
        generator.writeNumber(s);
    }

    public void writeNumber(BigDecimal bigdecimal)
        throws IOException
    {
        generator.writeNumber(bigdecimal);
    }

    public void writeNumber(BigInteger biginteger)
        throws IOException
    {
        generator.writeNumber(biginteger);
    }

    public void writeStartArray()
        throws IOException
    {
        generator.writeStartArray();
    }

    public void writeStartObject()
        throws IOException
    {
        generator.writeStartObject();
    }

    public void writeString(String s)
        throws IOException
    {
        generator.writeString(s);
    }
}
