// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.util.ByteBufferBackedOutputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.databind.deser.std:
//            StdScalarDeserializer

public class ByteBufferDeserializer extends StdScalarDeserializer
{

    private static final long serialVersionUID = 1L;

    protected ByteBufferDeserializer()
    {
        super(java/nio/ByteBuffer);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return deserialize(jsonparser, deserializationcontext);
    }

    public volatile Object deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, Object obj)
    {
        return deserialize(jsonparser, deserializationcontext, (ByteBuffer)obj);
    }

    public ByteBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext)
    {
        return ByteBuffer.wrap(jsonparser.getBinaryValue());
    }

    public ByteBuffer deserialize(JsonParser jsonparser, DeserializationContext deserializationcontext, ByteBuffer bytebuffer)
    {
        ByteBufferBackedOutputStream bytebufferbackedoutputstream = new ByteBufferBackedOutputStream(bytebuffer);
        jsonparser.readBinaryValue(deserializationcontext.getBase64Variant(), bytebufferbackedoutputstream);
        bytebufferbackedoutputstream.close();
        return bytebuffer;
    }
}
