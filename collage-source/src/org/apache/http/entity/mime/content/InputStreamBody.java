// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity.mime.content;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.apache.http.entity.mime.content:
//            AbstractContentBody

public class InputStreamBody extends AbstractContentBody
{

    private final String filename;
    private final InputStream in;

    public InputStreamBody(InputStream inputstream, String s)
    {
        this(inputstream, "application/octet-stream", s);
    }

    public InputStreamBody(InputStream inputstream, String s, String s1)
    {
        super(s);
        if (inputstream == null)
        {
            throw new IllegalArgumentException("Input stream may not be null");
        } else
        {
            in = inputstream;
            filename = s1;
            return;
        }
    }

    public String getCharset()
    {
        return null;
    }

    public long getContentLength()
    {
        return -1L;
    }

    public String getFilename()
    {
        return filename;
    }

    public InputStream getInputStream()
    {
        return in;
    }

    public String getTransferEncoding()
    {
        return "binary";
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        byte abyte0[] = new byte[4096];
_L1:
        int i = in.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_54;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        in.close();
        throw outputstream;
        outputstream.flush();
        in.close();
        return;
    }

    public void writeTo(OutputStream outputstream, int i)
        throws IOException
    {
        writeTo(outputstream);
    }
}
