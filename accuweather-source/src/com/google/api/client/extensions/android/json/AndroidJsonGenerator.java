// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.extensions.android.json;

import android.util.JsonWriter;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;

// Referenced classes of package com.google.api.client.extensions.android.json:
//            AndroidJsonFactory

class AndroidJsonGenerator extends JsonGenerator
{
    static final class StringNumber extends Number
    {

        private static final long serialVersionUID = 1L;
        private final String encodedValue;

        public double doubleValue()
        {
            return 0.0D;
        }

        public float floatValue()
        {
            return 0.0F;
        }

        public int intValue()
        {
            return 0;
        }

        public long longValue()
        {
            return 0L;
        }

        public String toString()
        {
            return encodedValue;
        }

        StringNumber(String s)
        {
            encodedValue = s;
        }
    }


    private final AndroidJsonFactory factory;
    private final JsonWriter writer;

    AndroidJsonGenerator(AndroidJsonFactory androidjsonfactory, JsonWriter jsonwriter)
    {
        factory = androidjsonfactory;
        writer = jsonwriter;
        jsonwriter.setLenient(true);
    }

    public void close()
        throws IOException
    {
        writer.close();
    }

    public void enablePrettyPrint()
        throws IOException
    {
        writer.setIndent("  ");
    }

    public void flush()
        throws IOException
    {
        writer.flush();
    }

    public JsonFactory getFactory()
    {
        return factory;
    }

    public void writeBoolean(boolean flag)
        throws IOException
    {
        writer.value(flag);
    }

    public void writeEndArray()
        throws IOException
    {
        writer.endArray();
    }

    public void writeEndObject()
        throws IOException
    {
        writer.endObject();
    }

    public void writeFieldName(String s)
        throws IOException
    {
        writer.name(s);
    }

    public void writeNull()
        throws IOException
    {
        writer.nullValue();
    }

    public void writeNumber(double d)
        throws IOException
    {
        writer.value(d);
    }

    public void writeNumber(float f)
        throws IOException
    {
        writer.value(f);
    }

    public void writeNumber(int i)
        throws IOException
    {
        writer.value(i);
    }

    public void writeNumber(long l)
        throws IOException
    {
        writer.value(l);
    }

    public void writeNumber(String s)
        throws IOException
    {
        writer.value(new StringNumber(s));
    }

    public void writeNumber(BigDecimal bigdecimal)
        throws IOException
    {
        writer.value(bigdecimal);
    }

    public void writeNumber(BigInteger biginteger)
        throws IOException
    {
        writer.value(biginteger);
    }

    public void writeStartArray()
        throws IOException
    {
        writer.beginArray();
    }

    public void writeStartObject()
        throws IOException
    {
        writer.beginObject();
    }

    public void writeString(String s)
        throws IOException
    {
        writer.value(s);
    }
}
