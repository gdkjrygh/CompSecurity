// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.databind.ser.std;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.util.ByteBufferBackedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

// Referenced classes of package com.fasterxml.jackson.databind.ser.std:
//            StdScalarSerializer

public class ByteBufferSerializer extends StdScalarSerializer
{

    public ByteBufferSerializer()
    {
        super(java/nio/ByteBuffer);
    }

    public volatile void serialize(Object obj, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException, JsonGenerationException
    {
        serialize((ByteBuffer)obj, jsongenerator, serializerprovider);
    }

    public void serialize(ByteBuffer bytebuffer, JsonGenerator jsongenerator, SerializerProvider serializerprovider)
        throws IOException
    {
        if (bytebuffer.hasArray())
        {
            jsongenerator.writeBinary(bytebuffer.array(), 0, bytebuffer.limit());
            return;
        }
        bytebuffer = bytebuffer.asReadOnlyBuffer();
        if (bytebuffer.position() > 0)
        {
            bytebuffer.rewind();
        }
        serializerprovider = new ByteBufferBackedInputStream(bytebuffer);
        jsongenerator.writeBinary(serializerprovider, bytebuffer.remaining());
        serializerprovider.close();
    }
}
