// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.Version;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonParserDelegate extends JsonParser
{

    protected JsonParser _flddelegate;

    public JsonParserDelegate(JsonParser jsonparser)
    {
        _flddelegate = jsonparser;
    }

    public boolean canUseSchema(FormatSchema formatschema)
    {
        return _flddelegate.canUseSchema(formatschema);
    }

    public void clearCurrentToken()
    {
        _flddelegate.clearCurrentToken();
    }

    public void close()
    {
        _flddelegate.close();
    }

    public JsonParser disable(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        _flddelegate.disable(feature);
        return this;
    }

    public JsonParser enable(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        _flddelegate.enable(feature);
        return this;
    }

    public BigInteger getBigIntegerValue()
    {
        return _flddelegate.getBigIntegerValue();
    }

    public byte[] getBinaryValue(Base64Variant base64variant)
    {
        return _flddelegate.getBinaryValue(base64variant);
    }

    public boolean getBooleanValue()
    {
        return _flddelegate.getBooleanValue();
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

    public Object getInputSource()
    {
        return _flddelegate.getInputSource();
    }

    public int getIntValue()
    {
        return _flddelegate.getIntValue();
    }

    public JsonToken getLastClearedToken()
    {
        return _flddelegate.getLastClearedToken();
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

    public JsonStreamContext getParsingContext()
    {
        return _flddelegate.getParsingContext();
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

    public boolean hasCurrentToken()
    {
        return _flddelegate.hasCurrentToken();
    }

    public boolean hasTextCharacters()
    {
        return _flddelegate.hasTextCharacters();
    }

    public boolean isClosed()
    {
        return _flddelegate.isClosed();
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonParser.Feature feature)
    {
        return _flddelegate.isEnabled(feature);
    }

    public JsonToken nextToken()
    {
        return _flddelegate.nextToken();
    }

    public JsonToken nextValue()
    {
        return _flddelegate.nextValue();
    }

    public void overrideCurrentName(String s)
    {
        _flddelegate.overrideCurrentName(s);
    }

    public void setCodec(ObjectCodec objectcodec)
    {
        _flddelegate.setCodec(objectcodec);
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

    public Version version()
    {
        return _flddelegate.version();
    }
}
