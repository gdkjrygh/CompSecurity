// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
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
    {
        _flddelegate.close();
    }

    public BigInteger getBigIntegerValue()
    {
        return _flddelegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
    {
        return _flddelegate.getBinaryValue(base64variant);
    }

    public byte getByteValue()
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
    {
        return _flddelegate.getDecimalValue();
    }

    public double getDoubleValue()
    {
        return _flddelegate.getDoubleValue();
    }

    public Object getEmbeddedObject()
    {
        return _flddelegate.getEmbeddedObject();
    }

    public float getFloatValue()
    {
        return _flddelegate.getFloatValue();
    }

    public int getIntValue()
    {
        return _flddelegate.getIntValue();
    }

    public long getLongValue()
    {
        return _flddelegate.getLongValue();
    }

    public com.fasterxml.jackson.core.JsonParser.NumberType getNumberType()
    {
        return _flddelegate.getNumberType();
    }

    public Number getNumberValue()
    {
        return _flddelegate.getNumberValue();
    }

    public Object getObjectId()
    {
        return _flddelegate.getObjectId();
    }

    public short getShortValue()
    {
        return _flddelegate.getShortValue();
    }

    public String getText()
    {
        return _flddelegate.getText();
    }

    public char[] getTextCharacters()
    {
        return _flddelegate.getTextCharacters();
    }

    public int getTextLength()
    {
        return _flddelegate.getTextLength();
    }

    public int getTextOffset()
    {
        return _flddelegate.getTextOffset();
    }

    public JsonLocation getTokenLocation()
    {
        return _flddelegate.getTokenLocation();
    }

    public Object getTypeId()
    {
        return _flddelegate.getTypeId();
    }

    public int getValueAsInt()
    {
        return _flddelegate.getValueAsInt();
    }

    public int getValueAsInt(int i)
    {
        return _flddelegate.getValueAsInt(i);
    }

    public long getValueAsLong()
    {
        return _flddelegate.getValueAsLong();
    }

    public long getValueAsLong(long l)
    {
        return _flddelegate.getValueAsLong(l);
    }

    public String getValueAsString()
    {
        return _flddelegate.getValueAsString();
    }

    public String getValueAsString(String s)
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

    public boolean isExpectedStartArrayToken()
    {
        return _flddelegate.isExpectedStartArrayToken();
    }

    public JsonToken nextToken()
    {
        return _flddelegate.nextToken();
    }

    public JsonToken nextValue()
    {
        return _flddelegate.nextValue();
    }

    public int readBinaryValue(Base64Variant base64variant, OutputStream outputstream)
    {
        return _flddelegate.readBinaryValue(base64variant, outputstream);
    }

    public void setSchema(FormatSchema formatschema)
    {
        _flddelegate.setSchema(formatschema);
    }

    public JsonParser skipChildren()
    {
        _flddelegate.skipChildren();
        return this;
    }
}
