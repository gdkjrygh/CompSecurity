// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.jackson2;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonParser;
import com.google.api.client.json.JsonToken;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.google.api.client.json.jackson2:
//            JacksonFactory

final class JacksonParser extends JsonParser
{

    private final JacksonFactory factory;
    private final com.fasterxml.jackson.core.JsonParser parser;

    JacksonParser(JacksonFactory jacksonfactory, com.fasterxml.jackson.core.JsonParser jsonparser)
    {
        factory = jacksonfactory;
        parser = jsonparser;
    }

    public void close()
        throws IOException
    {
        parser.close();
    }

    public BigInteger getBigIntegerValue()
        throws IOException
    {
        return parser.getBigIntegerValue();
    }

    public byte getByteValue()
        throws IOException
    {
        return parser.getByteValue();
    }

    public String getCurrentName()
        throws IOException
    {
        return parser.getCurrentName();
    }

    public JsonToken getCurrentToken()
    {
        return JacksonFactory.convert(parser.getCurrentToken());
    }

    public BigDecimal getDecimalValue()
        throws IOException
    {
        return parser.getDecimalValue();
    }

    public double getDoubleValue()
        throws IOException
    {
        return parser.getDoubleValue();
    }

    public volatile JsonFactory getFactory()
    {
        return getFactory();
    }

    public JacksonFactory getFactory()
    {
        return factory;
    }

    public float getFloatValue()
        throws IOException
    {
        return parser.getFloatValue();
    }

    public int getIntValue()
        throws IOException
    {
        return parser.getIntValue();
    }

    public long getLongValue()
        throws IOException
    {
        return parser.getLongValue();
    }

    public short getShortValue()
        throws IOException
    {
        return parser.getShortValue();
    }

    public String getText()
        throws IOException
    {
        return parser.getText();
    }

    public JsonToken nextToken()
        throws IOException
    {
        return JacksonFactory.convert(parser.nextToken());
    }

    public JsonParser skipChildren()
        throws IOException
    {
        parser.skipChildren();
        return this;
    }
}
