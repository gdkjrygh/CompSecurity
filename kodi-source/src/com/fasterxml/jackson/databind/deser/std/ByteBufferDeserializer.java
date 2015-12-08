// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class ByteBufferDeserializer extends StdScalarDeserializer
{

    protected ByteBufferDeserializer()
    {
        super(java/nio/ByteBuffer);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
        throws IOException, JsonProcessingException
    {
        return deserialize(jsonparser, deserializationcontext, (ByteBuffer)obj);
    }

    public ByteBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
        throws IOException
    {
        return ByteBuffer.wrap(jsonparser.getBinaryValue());
    }

    public ByteBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, ByteBuffer bytebuffer)
        throws IOException
    {
        ByteBufferBackedOutputStream bytebufferbackedoutputstream = new ByteBufferBackedOutputStream(bytebuffer);
        jsonparser.readBinaryValue(deserializationcontext.getBase64Variant(), bytebufferbackedoutputstream);
        bytebufferbackedoutputstream.close();
        return bytebuffer;
    }
}
