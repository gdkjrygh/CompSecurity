// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core;

import com.fasterxml.jackson.core.io.CharacterEscapes;
import java.io.Closeable;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.fasterxml.jackson.core:
//            Versioned, FormatSchema, Base64Variants, PrettyPrinter, 
//            JsonParser, ObjectCodec, JsonStreamContext, Version, 
//            Base64Variant, SerializableString, TreeNode

public abstract class JsonGenerator
    implements Versioned, Closeable
{

    protected PrettyPrinter _cfgPrettyPrinter;

    protected JsonGenerator()
    {
    }

    public boolean canUseSchema(FormatSchema formatschema)
    {
        return false;
    }

    public abstract void close();

    public final JsonGenerator configure(Feature feature, boolean flag)
    {
        if (flag)
        {
            enable(feature);
            return this;
        } else
        {
            disable(feature);
            return this;
        }
    }

    public abstract void copyCurrentEvent(JsonParser jsonparser);

    public abstract void copyCurrentStructure(JsonParser jsonparser);

    public abstract JsonGenerator disable(Feature feature);

    public abstract JsonGenerator enable(Feature feature);

    public abstract void flush();

    public CharacterEscapes getCharacterEscapes()
    {
        return null;
    }

    public abstract ObjectCodec getCodec();

    public int getHighestEscapedChar()
    {
        return 0;
    }

    public abstract JsonStreamContext getOutputContext();

    public Object getOutputTarget()
    {
        return null;
    }

    public FormatSchema getSchema()
    {
        return null;
    }

    public abstract boolean isClosed();

    public abstract boolean isEnabled(Feature feature);

    public JsonGenerator setCharacterEscapes(CharacterEscapes characterescapes)
    {
        return this;
    }

    public abstract JsonGenerator setCodec(ObjectCodec objectcodec);

    public JsonGenerator setHighestNonEscapedChar(int i)
    {
        return this;
    }

    public JsonGenerator setPrettyPrinter(PrettyPrinter prettyprinter)
    {
        _cfgPrettyPrinter = prettyprinter;
        return this;
    }

    public void setSchema(FormatSchema formatschema)
    {
        throw new UnsupportedOperationException((new StringBuilder()).append("Generator of type ").append(getClass().getName()).append(" does not support schema of type '").append(formatschema.getSchemaType()).append("'").toString());
    }

    public abstract JsonGenerator useDefaultPrettyPrinter();

    public abstract Version version();

    public final void writeArrayFieldStart(String s)
    {
        writeFieldName(s);
        writeStartArray();
    }

    public abstract void writeBinary(Base64Variant base64variant, byte abyte0[], int i, int j);

    public void writeBinary(byte abyte0[])
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, 0, abyte0.length);
    }

    public void writeBinary(byte abyte0[], int i, int j)
    {
        writeBinary(Base64Variants.getDefaultVariant(), abyte0, i, j);
    }

    public final void writeBinaryField(String s, byte abyte0[])
    {
        writeFieldName(s);
        writeBinary(abyte0);
    }

    public abstract void writeBoolean(boolean flag);

    public final void writeBooleanField(String s, boolean flag)
    {
        writeFieldName(s);
        writeBoolean(flag);
    }

    public abstract void writeEndArray();

    public abstract void writeEndObject();

    public abstract void writeFieldName(SerializableString serializablestring);

    public abstract void writeFieldName(String s);

    public abstract void writeNull();

    public final void writeNullField(String s)
    {
        writeFieldName(s);
        writeNull();
    }

    public abstract void writeNumber(double d);

    public abstract void writeNumber(float f);

    public abstract void writeNumber(int i);

    public abstract void writeNumber(long l);

    public abstract void writeNumber(String s);

    public abstract void writeNumber(BigDecimal bigdecimal);

    public abstract void writeNumber(BigInteger biginteger);

    public final void writeNumberField(String s, double d)
    {
        writeFieldName(s);
        writeNumber(d);
    }

    public final void writeNumberField(String s, float f)
    {
        writeFieldName(s);
        writeNumber(f);
    }

    public final void writeNumberField(String s, int i)
    {
        writeFieldName(s);
        writeNumber(i);
    }

    public final void writeNumberField(String s, long l)
    {
        writeFieldName(s);
        writeNumber(l);
    }

    public final void writeNumberField(String s, BigDecimal bigdecimal)
    {
        writeFieldName(s);
        writeNumber(bigdecimal);
    }

    public abstract void writeObject(Object obj);

    public final void writeObjectField(String s, Object obj)
    {
        writeFieldName(s);
        writeObject(obj);
    }

    public final void writeObjectFieldStart(String s)
    {
        writeFieldName(s);
        writeStartObject();
    }

    public abstract void writeRaw(char c);

    public abstract void writeRaw(String s);

    public abstract void writeRaw(String s, int i, int j);

    public abstract void writeRaw(char ac[], int i, int j);

    public abstract void writeRawUTF8String(byte abyte0[], int i, int j);

    public abstract void writeRawValue(String s);

    public abstract void writeRawValue(String s, int i, int j);

    public abstract void writeRawValue(char ac[], int i, int j);

    public abstract void writeStartArray();

    public abstract void writeStartObject();

    public abstract void writeString(SerializableString serializablestring);

    public abstract void writeString(String s);

    public abstract void writeString(char ac[], int i, int j);

    public void writeStringField(String s, String s1)
    {
        writeFieldName(s);
        writeString(s1);
    }

    public abstract void writeTree(TreeNode treenode);

    public abstract void writeUTF8String(byte abyte0[], int i, int j);
}
