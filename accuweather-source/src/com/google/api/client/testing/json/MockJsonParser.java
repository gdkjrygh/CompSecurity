// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.testing.json;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class MockJsonParser extends JsonParser
{

    private final JsonFactory factory;
    private boolean isClosed;

    MockJsonParser(JsonFactory jsonfactory)
    {
        factory = jsonfactory;
    }

    public void close()
        throws IOException
    {
        isClosed = true;
    }

    public BigInteger getBigIntegerValue()
        throws IOException
    {
        return null;
    }

    public byte getByteValue()
        throws IOException
    {
        return 0;
    }

    public String getCurrentName()
        throws IOException
    {
        return null;
    }

    public JsonToken getCurrentToken()
    {
        return null;
    }

    public BigDecimal getDecimalValue()
        throws IOException
    {
        return null;
    }

    public double getDoubleValue()
        throws IOException
    {
        return 0.0D;
    }

    public JsonFactory getFactory()
    {
        return factory;
    }

    public float getFloatValue()
        throws IOException
    {
        return 0.0F;
    }

    public int getIntValue()
        throws IOException
    {
        return 0;
    }

    public long getLongValue()
        throws IOException
    {
        return 0L;
    }

    public short getShortValue()
        throws IOException
    {
        return 0;
    }

    public String getText()
        throws IOException
    {
        return null;
    }

    public boolean isClosed()
    {
        return isClosed;
    }

    public JsonToken nextToken()
        throws IOException
    {
        return null;
    }

    public JsonParser skipChildren()
        throws IOException
    {
        return null;
    }
}
