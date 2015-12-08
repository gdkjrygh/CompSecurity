// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonParserDelegate extends JsonParser
{

    protected JsonParser _flddelegate;

    public JsonParserDelegate(JsonParser jsonparser)
    {
        _flddelegate = jsonparser;
    }

    public boolean canReadObjectId()
    {
        return _flddelegate.canReadObjectId();
    }

    public boolean canReadTypeId()
    {
        return _flddelegate.canReadTypeId();
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

    public int getCurrentTokenId()
    {
        return _flddelegate.getCurrentTokenId();
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

    public int getFeatureMask()
    {
        return _flddelegate.getFeatureMask();
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

    public Object getObjectId()
        throws IOException, JsonGenerationException
    {
        return _flddelegate.getObjectId();
    }

    public JsonStreamContext getParsingContext()
    {
        return _flddelegate.getParsingContext();
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

    public Object getTypeId()
        throws IOException, JsonGenerationException
    {
        return _flddelegate.getTypeId();
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

    public boolean hasTextCharacters()
    {
        return _flddelegate.hasTextCharacters();
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        return _flddelegate.isEnabled(feature);
    }

    public boolean isExpectedStartArrayToken()
    {
        return _flddelegate.isExpectedStartArrayToken();
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

    public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
        throws IOException, JsonParseException
    {
        return _flddelegate.readBinaryValue(base64variant, outputstream);
    }

    public void setCurrentValue(Object obj)
    {
        _flddelegate.setCurrentValue(obj);
    }

    public JsonParser setFeatureMask(int i)
    {
        _flddelegate.setFeatureMask(i);
        return this;
    }

    public JsonParser skipChildren()
        throws IOException, JsonParseException
    {
        _flddelegate.skipChildren();
        return this;
    }
}
