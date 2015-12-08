// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.HttpEntity;
import org.apache.http.entity.HttpEntityWrapper;

abstract class DecompressingEntity extends HttpEntityWrapper
{

    private static final int BUFFER_SIZE = 2048;
    private InputStream content;

    public DecompressingEntity(HttpEntity httpentity)
    {
        super(httpentity);
    }

    private InputStream getDecompressingStream()
        throws IOException
    {
        InputStream inputstream = wrappedEntity.getContent();
        InputStream inputstream1;
        try
        {
            inputstream1 = decorate(inputstream);
        }
        catch (IOException ioexception)
        {
            inputstream.close();
            throw ioexception;
        }
        return inputstream1;
    }

    abstract InputStream decorate(InputStream inputstream)
        throws IOException;

    public InputStream getContent()
        throws IOException
    {
        if (wrappedEntity.isStreaming())
        {
            if (content == null)
            {
                content = getDecompressingStream();
            }
            return content;
        } else
        {
            return getDecompressingStream();
        }
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        InputStream inputstream = getContent();
        byte abyte0[] = new byte[2048];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        inputstream.close();
        throw outputstream;
        inputstream.close();
        return;
    }
}
