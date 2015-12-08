// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.gson;

import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.util.Charsets;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.Writer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.api.client.json.gson:
//            GsonGenerator, GsonParser

public class GsonFactory extends JsonFactory
{
    static class InstanceHolder
    {

        static final GsonFactory INSTANCE = new GsonFactory();


        InstanceHolder()
        {
        }
    }


    public GsonFactory()
    {
    }

    public static GsonFactory getDefaultInstance()
    {
        return InstanceHolder.INSTANCE;
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream, Charset charset)
    {
        return createJsonGenerator(((Writer) (new OutputStreamWriter(outputstream, charset))));
    }

    public JsonGenerator createJsonGenerator(Writer writer)
    {
        return new GsonGenerator(this, new JsonWriter(writer));
    }

    public JsonParser createJsonParser(InputStream inputstream)
    {
        return createJsonParser(((Reader) (new InputStreamReader(inputstream, Charsets.UTF_8))));
    }

    public JsonParser createJsonParser(InputStream inputstream, Charset charset)
    {
        if (charset == null)
        {
            return createJsonParser(inputstream);
        } else
        {
            return createJsonParser(((Reader) (new InputStreamReader(inputstream, charset))));
        }
    }

    public JsonParser createJsonParser(Reader reader)
    {
        return new GsonParser(this, new JsonReader(reader));
    }

    public JsonParser createJsonParser(String s)
    {
        return createJsonParser(((Reader) (new StringReader(s))));
    }
}
