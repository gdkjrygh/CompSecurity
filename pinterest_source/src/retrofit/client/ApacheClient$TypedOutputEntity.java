// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package retrofit.client;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.entity.AbstractHttpEntity;
import retrofit.mime.TypedOutput;

class setContentType extends AbstractHttpEntity
{

    final TypedOutput typedOutput;

    public InputStream getContent()
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        typedOutput.writeTo(bytearrayoutputstream);
        return new ByteArrayInputStream(bytearrayoutputstream.toByteArray());
    }

    public long getContentLength()
    {
        return typedOutput.length();
    }

    public boolean isRepeatable()
    {
        return true;
    }

    public boolean isStreaming()
    {
        return false;
    }

    public void writeTo(OutputStream outputstream)
    {
        typedOutput.writeTo(outputstream);
    }

    (TypedOutput typedoutput)
    {
        typedOutput = typedoutput;
        setContentType(typedoutput.mimeType());
    }
}
