// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity;

import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package org.apache.http.entity:
//            AbstractHttpEntity, ContentType

public class InputStreamEntity extends AbstractHttpEntity
{

    private static final int BUFFER_SIZE = 2048;
    private final InputStream content;
    private final long length;

    public InputStreamEntity(InputStream inputstream, long l)
    {
        this(inputstream, l, null);
    }

    public InputStreamEntity(InputStream inputstream, long l, ContentType contenttype)
    {
        if (inputstream == null)
        {
            throw new IllegalArgumentException("Source input stream may not be null");
        }
        content = inputstream;
        length = l;
        if (contenttype != null)
        {
            setContentType(contenttype.toString());
        }
    }

    public void consumeContent()
    {
        content.close();
    }

    public InputStream getContent()
    {
        return content;
    }

    public long getContentLength()
    {
        return length;
    }

    public boolean isRepeatable()
    {
        return false;
    }

    public boolean isStreaming()
    {
        return true;
    }

    public void writeTo(OutputStream outputstream)
    {
        InputStream inputstream;
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        inputstream = content;
        byte abyte0[] = new byte[2048];
        if (length >= 0L) goto _L2; else goto _L1
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1) goto _L4; else goto _L3
_L3:
        outputstream.write(abyte0, 0, i);
          goto _L1
        outputstream;
        inputstream.close();
        throw outputstream;
_L2:
        long l = length;
_L5:
        if (l <= 0L)
        {
            break; /* Loop/switch isn't completed */
        }
        i = inputstream.read(abyte0, 0, (int)Math.min(2048L, l));
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        outputstream.write(abyte0, 0, i);
        l -= i;
        if (true) goto _L5; else goto _L4
_L4:
        inputstream.close();
        return;
    }
}
