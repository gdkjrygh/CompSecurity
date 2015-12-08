// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Base64Variant;
import com.fasterxml.jackson.core.FormatSchema;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.JsonStreamContext;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.PrettyPrinter;
import com.fasterxml.jackson.core.SerializableString;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.IOException;
import java.io.InputStream;
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
        throws IOException
    {
        _flddelegate.close();
    }

    public void copyCurrentEvent(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        _flddelegate.copyCurrentEvent(jsonparser);
    }

    public void copyCurrentStructure(JsonParser jsonparser)
        throws IOException, JsonProcessingException
    {
        _flddelegate.copyCurrentStructure(jsonparser);
    }

    public JsonGenerator disable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        _flddelegate.disable(feature);
        return this;
    }

    public JsonGenerator enable(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        _flddelegate.enable(feature);
        return this;
    }

    public void flush()
        throws IOException
    {
        _flddelegate.flush();
    }

    public CharacterEscapes getCharacterEscapes()
    {
        return _flddelegate.getCharacterEscapes();
    }

    public ObjectCodec getCodec()
    {
        return _flddelegate.getCodec();
    }

    public int getHighestEscapedChar()
    {
        return _flddelegate.getHighestEscapedChar();
    }

    public JsonStreamContext getOutputContext()
    {
        return _flddelegate.getOutputContext();
    }

    public Object getOutputTarget()
    {
        return _flddelegate.getOutputTarget();
    }

    public PrettyPrinter getPrettyPrinter()
    {
        return _flddelegate.getPrettyPrinter();
    }

    public FormatSchema getSchema()
    {
        return _flddelegate.getSchema();
    }

    public boolean isClosed()
    {
        return _flddelegate.isClosed();
    }

    public boolean isEnabled(com.fasterxml.jackson.core.JsonGenerator.Feature feature)
    {
        return _flddelegate.isEnabled(feature);
    }

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
    {
        _flddelegate.setCharacterEscapes(characterescapes);
        return this;
    }

    public JsonGenerator setCodec(ObjectCodec objectcodec)
    {
        _flddelegate.setCodec(objectcodec);
        return this;
    }

    public JsonGenerator setHighestNonEscapedChar(int i)
    {
        _flddelegate.setHighestNonEscapedChar(i);
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyprinter)
    {
        _flddelegate.setPrettyPrinter(prettyprinter);
        return this;
    }

    public JsonGenerator setRootValueSeparator(SerializableString serializablestring)
    {
        _flddelegate.setRootValueSeparator(serializablestring);
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

    public int writeBinary(Base64Variant base64variant, InputStream inputstream, int i)
        throws IOException, JsonGenerationException
    {
        return _flddelegate.writeBinary(base64variant, inputstream, i);
    }

    public void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeBinary(base64variant, abyte0, i, j);
    }

    public void writeBoolean(boolean flag)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeBoolean(flag);
    }

    public void writeEndArray()
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeEndArray();
    }

    public void writeEndObject()
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeEndObject();
    }

    public void writeFieldName(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeFieldName(serializablestring);
    }

    public void writeFieldName(String s)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeFieldName(s);
    }

    public void writeNull()
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeNull();
    }

    public void writeNumber(double d)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeNumber(d);
    }

    public void writeNumber(float f)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeNumber(f);
    }

    public void writeNumber(int i)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeNumber(i);
    }

    public void writeNumber(long l)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeNumber(l);
    }

    public void writeNumber(String s)
        throws IOException, JsonGenerationException, UnsupportedOperationException
    {
        _flddelegate.writeNumber(s);
    }

    public void writeNumber(BigDecimal bigdecimal)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeNumber(bigdecimal);
    }

    public void writeNumber(BigInteger biginteger)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeNumber(biginteger);
    }

    public void writeObject(Object obj)
        throws IOException, JsonProcessingException
    {
        _flddelegate.writeObject(obj);
    }

    public void writeRaw(char c)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRaw(c);
    }

    public void writeRaw(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRaw(serializablestring);
    }

    public void writeRaw(String s)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRaw(s);
    }

    public void writeRaw(String s, int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRaw(s, i, j);
    }

    public void writeRaw(char ac[], int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRaw(ac, i, j);
    }

    public void writeRawUTF8String(byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRawUTF8String(abyte0, i, j);
    }

    public void writeRawValue(String s)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRawValue(s);
    }

    public void writeRawValue(String s, int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRawValue(s, i, j);
    }

    public void writeRawValue(char ac[], int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeRawValue(ac, i, j);
    }

    public void writeStartArray()
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeStartArray();
    }

    public void writeStartObject()
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeStartObject();
    }

    public void writeString(SerializableString serializablestring)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeString(serializablestring);
    }

    public void writeString(String s)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeString(s);
    }

    public void writeString(char ac[], int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeString(ac, i, j);
    }

    public void writeTree(TreeNode treenode)
        throws IOException, JsonProcessingException
    {
        _flddelegate.writeTree(treenode);
    }

    public void writeUTF8String(byte abyte0[], int i, int j)
        throws IOException, JsonGenerationException
    {
        _flddelegate.writeUTF8String(abyte0, i, j);
    }
}
