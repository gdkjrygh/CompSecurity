// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.entity;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.http.util.Args;

// Referenced classes of package org.apache.http.entity:
//            AbstractHttpEntity, ContentType

public class ByteArrayEntity extends AbstractHttpEntity
    implements Cloneable
{

    private final byte b[];
    protected final byte content[];
    private final int len;
    private final int off;

    public ByteArrayEntity(byte abyte0[])
    {
        this(abyte0, null);
    }

    public ByteArrayEntity(byte abyte0[], ContentType contenttype)
    {
        Args.notNull(abyte0, "Source byte array");
        content = abyte0;
        b = abyte0;
        off = 0;
        len = b.length;
        if (contenttype != null)
        {
            setContentType(contenttype.toString());
        }
    }

    public Object clone()
    {
        return super.clone();
    }

    public InputStream getContent()
    {
        return new ByteArrayInputStream(b, off, len);
    }

    public long getContentLength()
    {
        return (long)len;
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
        Args.notNull(outputstream, "Output stream");
        outputstream.write(b, off, len);
        outputstream.flush();
    }
}
