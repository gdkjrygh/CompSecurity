// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonParserDelegate extends JsonParser
{

    protected JsonParser _flddelegate;

    public JsonParserDelegate(JsonParser jsonparser)
    {
        _flddelegate = jsonparser;
    }

    public void clearCurrentToken()
    {
        _flddelegate.clearCurrentToken();
    }

    public void close()
        throws IOException
    {
        _flddelegate.close();
    }

    public JsonParser enable(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        _flddelegate.enable(feature);
        return this;
    }

    public BigInteger getBigIntegerValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
        throws IOException, JsonParseException
    {
        return _flddelegate.getBinaryValue(base64variant);
    }

    public byte getByteValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getByteValue();
    }

    public ObjectCodec getCodec()
    {
        return _flddelegate.getCodec();
    }

    public JsonLocation getCurrentLocation()
    {
        return _flddelegate.getCurrentLocation();
    }

    public String getCurrentName()
        throws IOException, JsonParseException
    {
        return _flddelegate.getCurrentName();
    }

    public JsonToken getCurrentToken()
    {
        return _flddelegate.getCurrentToken();
    }

    public BigDecimal getDecimalValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getDecimalValue();
    }

    public double getDoubleValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getDoubleValue();
    }

    public Object getEmbeddedObject()
        throws IOException, JsonParseException
    {
        return _flddelegate.getEmbeddedObject();
    }

    public float getFloatValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getFloatValue();
    }

    public int getIntValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getIntValue();
    }

    public long getLongValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getLongValue();
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
        throws IOException, JsonParseException
    {
        return _flddelegate.getNumberType();
    }

    public Number getNumberValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getNumberValue();
    }

    public short getShortValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.getShortValue();
    }

    public String getText()
        throws IOException, JsonParseException
    {
        return _flddelegate.getText();
    }

    public char[] getTextCharacters()
        throws IOException, JsonParseException
    {
        return _flddelegate.getTextCharacters();
    }

    public int getTextLength()
        throws IOException, JsonParseException
    {
        return _flddelegate.getTextLength();
    }

    public int getTextOffset()
        throws IOException, JsonParseException
    {
        return _flddelegate.getTextOffset();
    }

    public JsonLocation getTokenLocation()
    {
        return _flddelegate.getTokenLocation();
    }

    public int getValueAsInt()
        throws IOException, JsonParseException
    {
        return _flddelegate.getValueAsInt();
    }

    public int getValueAsInt(int i)
        throws IOException, JsonParseException
    {
        return _flddelegate.getValueAsInt(i);
    }

    public long getValueAsLong()
        throws IOException, JsonParseException
    {
        return _flddelegate.getValueAsLong();
    }

    public long getValueAsLong(long l)
        throws IOException, JsonParseException
    {
        return _flddelegate.getValueAsLong(l);
    }

    public String getValueAsString()
        throws IOException, JsonParseException
    {
        return _flddelegate.getValueAsString();
    }

    public String getValueAsString(String s)
        throws IOException, JsonParseException
    {
        return _flddelegate.getValueAsString(s);
    }

    public boolean hasCurrentToken()
    {
        return _flddelegate.hasCurrentToken();
    }

    public boolean hasTextCharacters()
    {
        return _flddelegate.hasTextCharacters();
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        return _flddelegate.isEnabled(feature);
    }

    public JsonToken nextToken()
        throws IOException, JsonParseException
    {
        return _flddelegate.nextToken();
    }

    public JsonToken nextValue()
        throws IOException, JsonParseException
    {
        return _flddelegate.nextValue();
    }

    public void setSchema(FormatSchema formatschema)
    {
        _flddelegate.setSchema(formatschema);
    }

    public JsonParser skipChildren()
        throws IOException, JsonParseException
    {
        _flddelegate.skipChildren();
        return this;
    }
}
