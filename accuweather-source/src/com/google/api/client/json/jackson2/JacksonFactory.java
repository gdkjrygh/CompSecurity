// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.json.jackson2;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonToken;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonGenerator;
import com.google.api.client.json.JsonParser;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.Charset;

// Referenced classes of package com.google.api.client.json.jackson2:
//            JacksonGenerator, JacksonParser

public final class JacksonFactory extends JsonFactory
{
    static class InstanceHolder
    {

        static final JacksonFactory INSTANCE = new JacksonFactory();


        InstanceHolder()
        {
        }
    }


    private final com.fasterxml.jackson.core.JsonFactory factory = new com.fasterxml.jackson.core.JsonFactory();

    public JacksonFactory()
    {
        factory.configure(com.fasterxml.jackson.core.JsonGenerator.Feature.AUTO_CLOSE_JSON_CONTENT, false);
    }

    static com.google.api.client.json.JsonToken convert(JsonToken jsontoken)
    {
        if (jsontoken == null)
        {
            return null;
        }
        static class _cls1
        {

            static final int $SwitchMap$com$fasterxml$jackson$core$JsonToken[];

            static 
            {
                $SwitchMap$com$fasterxml$jackson$core$JsonToken = new int[JsonToken.values().length];
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_ARRAY.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_ARRAY.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.END_OBJECT.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.START_OBJECT.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_FALSE.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_TRUE.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NULL.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_STRING.ordinal()] = 8;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_FLOAT.ordinal()] = 9;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.VALUE_NUMBER_INT.ordinal()] = 10;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$fasterxml$jackson$core$JsonToken[JsonToken.FIELD_NAME.ordinal()] = 11;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.fasterxml.jackson.core.JsonToken[jsontoken.ordinal()])
        {
        default:
            return com.google.api.client.json.JsonToken.NOT_AVAILABLE;

        case 1: // '\001'
            return com.google.api.client.json.JsonToken.END_ARRAY;

        case 2: // '\002'
            return com.google.api.client.json.JsonToken.START_ARRAY;

        case 3: // '\003'
            return com.google.api.client.json.JsonToken.END_OBJECT;

        case 4: // '\004'
            return com.google.api.client.json.JsonToken.START_OBJECT;

        case 5: // '\005'
            return com.google.api.client.json.JsonToken.VALUE_FALSE;

        case 6: // '\006'
            return com.google.api.client.json.JsonToken.VALUE_TRUE;

        case 7: // '\007'
            return com.google.api.client.json.JsonToken.VALUE_NULL;

        case 8: // '\b'
            return com.google.api.client.json.JsonToken.VALUE_STRING;

        case 9: // '\t'
            return com.google.api.client.json.JsonToken.VALUE_NUMBER_FLOAT;

        case 10: // '\n'
            return com.google.api.client.json.JsonToken.VALUE_NUMBER_INT;

        case 11: // '\013'
            return com.google.api.client.json.JsonToken.FIELD_NAME;
        }
    }

    public static JacksonFactory getDefaultInstance()
    {
        return InstanceHolder.INSTANCE;
    }

    public JsonGenerator createJsonGenerator(OutputStream outputstream, Charset charset)
        throws IOException
    {
        return new JacksonGenerator(this, factory.createJsonGenerator(outputstream, JsonEncoding.UTF8));
    }

    public JsonGenerator createJsonGenerator(Writer writer)
        throws IOException
    {
        return new JacksonGenerator(this, factory.createJsonGenerator(writer));
    }

    public JsonParser createJsonParser(InputStream inputstream)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        return new JacksonParser(this, factory.createJsonParser(inputstream));
    }

    public JsonParser createJsonParser(InputStream inputstream, Charset charset)
        throws IOException
    {
        Preconditions.checkNotNull(inputstream);
        return new JacksonParser(this, factory.createJsonParser(inputstream));
    }

    public JsonParser createJsonParser(Reader reader)
        throws IOException
    {
        Preconditions.checkNotNull(reader);
        return new JacksonParser(this, factory.createJsonParser(reader));
    }

    public JsonParser createJsonParser(String s)
        throws IOException
    {
        Preconditions.checkNotNull(s);
        return new JacksonParser(this, factory.createJsonParser(s));
    }
}
