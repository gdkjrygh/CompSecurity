// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.json;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MockJsonGenerator extends JsonGenerator
{

    private final JsonFactory factory;

    MockJsonGenerator(JsonFactory jsonfactory)
    {
        factory = jsonfactory;
    }

    public void close()
        throws IOException
    {
    }

    public void flush()
        throws IOException
    {
    }

    public JsonFactory getFactory()
    {
        return factory;
    }

    public void writeBoolean(boolean flag)
        throws IOException
    {
    }

    public void writeEndArray()
        throws IOException
    {
    }

    public void writeEndObject()
        throws IOException
    {
    }

    public void writeFieldName(String s)
        throws IOException
    {
    }

    public void writeNull()
        throws IOException
    {
    }

    public void writeNumber(double d)
        throws IOException
    {
    }

    public void writeNumber(float f)
        throws IOException
    {
    }

    public void writeNumber(int i)
        throws IOException
    {
    }

    public void writeNumber(long l)
        throws IOException
    {
    }

    public void writeNumber(String s)
        throws IOException
    {
    }

    public void writeNumber(BigDecimal bigdecimal)
        throws IOException
    {
    }

    public void writeNumber(BigInteger biginteger)
        throws IOException
    {
    }

    public void writeStartArray()
        throws IOException
    {
    }

    public void writeStartObject()
        throws IOException
    {
    }

    public void writeString(String s)
        throws IOException
    {
    }
}
