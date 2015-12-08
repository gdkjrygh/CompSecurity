// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import retrofit.converter.Converter;
import retrofit.mime.TypedInput;
import retrofit.mime.TypedOutput;

class MockTypedInput
    implements TypedInput
{

    private final Object body;
    private byte bytes[];
    private final Converter converter;

    MockTypedInput(Converter converter1, Object obj)
    {
        converter = converter1;
        body = obj;
    }

    private void initBytes()
    {
        this;
        JVM INSTR monitorenter ;
        if (bytes == null)
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            converter.toBody(body).writeTo(bytearrayoutputstream);
            bytes = bytearrayoutputstream.toByteArray();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public InputStream in()
    {
        initBytes();
        return new ByteArrayInputStream(bytes);
    }

    public long length()
    {
        try
        {
            initBytes();
        }
        catch (IOException ioexception)
        {
            throw new RuntimeException(ioexception);
        }
        return (long)bytes.length;
    }

    public String mimeType()
    {
        return "application/unknown";
    }
}
