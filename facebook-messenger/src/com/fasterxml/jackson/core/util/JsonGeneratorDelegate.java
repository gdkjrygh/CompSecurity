// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import java.math.BigDecimal;
import java.math.BigInteger;

public class JsonGeneratorDelegate extends JsonGenerator
{

    protected JsonGenerator _flddelegate;

    public JsonGeneratorDelegate(JsonGenerator jsongenerator)
    {
        _flddelegate = jsongenerator;
    }

    public boolean canUseSchema(FormatSchema formatschema)
    {
        return _flddelegate.canUseSchema(formatschema);
    }

    public void close()
    {
        _flddelegate.close();
    }

    public void copyCurrentEvent(JsonParser jsonparser)
    {
        _flddelegate.copyCurrentEvent(jsonparser);
    }

    public void copyCurrentStructure(JsonParser jsonparser)
    {
        _flddelegate.copyCurrentStructure(jsonparser);
    }

    public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return _flddelegate.disable(feature);
    }

    public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return _flddelegate.enable(feature);
    }

    public void flush()
    {
        _flddelegate.flush();
    }

    public ObjectCodec getCodec()
    {
        return _flddelegate.getCodec();
    }

    public JsonStreamContext getOutputContext()
    {
        return _flddelegate.getOutputContext();
    }

    public Object getOutputTarget()
    {
        return _flddelegate.getOutputTarget();
    }

    public boolean isClosed()
    {
        return _flddelegate.isClosed();
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return _flddelegate.isEnabled(feature);
    }

    public JsonGenerator setCodec(ObjectCodec objectcodec)
    {
        _flddelegate.setCodec(objectcodec);
        return this;
    }

    public void setSchema(FormatSchema formatschema)
    {
        _flddelegate.setSchema(formatschema);
    }

    public JsonGenerator useDefaultPrettyPrinter()
    {
        _flddelegate.useDefaultPrettyPrinter();
        return this;
    }

    public Version version()
    {
        return _flddelegate.version();
    }

    public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
    {
        _flddelegate.writeBinary(base64variant, abyte0, i, j);
    }

    public void writeBoolean(boolean flag)
    {
        _flddelegate.writeBoolean(flag);
    }

    public void writeEndArray()
    {
        _flddelegate.writeEndArray();
    }

    public void writeEndObject()
    {
        _flddelegate.writeEndObject();
    }

    public void writeFieldName(SerializableString serializablestring)
    {
        _flddelegate.writeFieldName(serializablestring);
    }

    public void writeFieldName(String s)
    {
        _flddelegate.writeFieldName(s);
    }

    public void writeNull()
    {
        _flddelegate.writeNull();
    }

    public void writeNumber(double d)
    {
        _flddelegate.writeNumber(d);
    }

    public void writeNumber(float f)
    {
        _flddelegate.writeNumber(f);
    }

    public void writeNumber(int i)
    {
        _flddelegate.writeNumber(i);
    }

    public void writeNumber(long l)
    {
        _flddelegate.writeNumber(l);
    }

    public void writeNumber(String s)
    {
        _flddelegate.writeNumber(s);
    }

    public void writeNumber(BigDecimal bigdecimal)
    {
        _flddelegate.writeNumber(bigdecimal);
    }

    public void writeNumber(BigInteger biginteger)
    {
        _flddelegate.writeNumber(biginteger);
    }

    public void writeObject(Object obj)
    {
        _flddelegate.writeObject(obj);
    }

    public void writeRaw(char c)
    {
        _flddelegate.writeRaw(c);
    }

    public void writeRaw(String s)
    {
        _flddelegate.writeRaw(s);
    }

    public void writeRaw(String s, int i, int j)
    {
        _flddelegate.writeRaw(s, i, j);
    }

    public void writeRaw(char ac[], int i, int j)
    {
        _flddelegate.writeRaw(ac, i, j);
    }

    public void writeRawUTF8String(byte abyte0[], int i, int j)
    {
        _flddelegate.writeRawUTF8String(abyte0, i, j);
    }

    public void writeRawValue(String s)
    {
        _flddelegate.writeRawValue(s);
    }

    public void writeRawValue(String s, int i, int j)
    {
        _flddelegate.writeRawValue(s, i, j);
    }

    public void writeRawValue(char ac[], int i, int j)
    {
        _flddelegate.writeRawValue(ac, i, j);
    }

    public void writeStartArray()
    {
        _flddelegate.writeStartArray();
    }

    public void writeStartObject()
    {
        _flddelegate.writeStartObject();
    }

    public void writeString(SerializableString serializablestring)
    {
        _flddelegate.writeString(serializablestring);
    }

    public void writeString(String s)
    {
        _flddelegate.writeString(s);
    }

    public void writeString(char ac[], int i, int j)
    {
        _flddelegate.writeString(ac, i, j);
    }

    public void writeTree(TreeNode treenode)
    {
        _flddelegate.writeTree(treenode);
    }

    public void writeUTF8String(byte abyte0[], int i, int j)
    {
        _flddelegate.writeUTF8String(abyte0, i, j);
    }
}
