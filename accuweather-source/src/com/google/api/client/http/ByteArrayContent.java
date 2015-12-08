// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import com.google.api.client.util.StringUtils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

// Referenced classes of package com.google.api.client.http:
//            AbstractInputStreamContent

public final class ByteArrayContent extends AbstractInputStreamContent
{

    private final byte byteArray[];
    private final int length;
    private final int offset;

    public ByteArrayContent(String s, byte abyte0[])
    {
        this(s, abyte0, 0, abyte0.length);
    }

    public ByteArrayContent(String s, byte abyte0[], int i, int j)
    {
        super(s);
        byteArray = (byte[])Preconditions.checkNotNull(abyte0);
        boolean flag;
        if (i >= 0 && j >= 0 && i + j <= abyte0.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "offset %s, length %s, array length %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(abyte0.length)
        });
        offset = i;
        length = j;
    }

    public static ByteArrayContent fromString(String s, String s1)
    {
        return new ByteArrayContent(s, StringUtils.getBytesUtf8(s1));
    }

    public InputStream getInputStream()
    {
        return new ByteArrayInputStream(byteArray, offset, length);
    }

    public long getLength()
    {
        return (long)length;
    }

    public boolean retrySupported()
    {
        return true;
    }

    public volatile AbstractInputStreamContent setCloseInputStream(boolean flag)
    {
        return setCloseInputStream(flag);
    }

    public ByteArrayContent setCloseInputStream(boolean flag)
    {
        return (ByteArrayContent)super.setCloseInputStream(flag);
    }

    public volatile AbstractInputStreamContent setType(String s)
    {
        return setType(s);
    }

    public ByteArrayContent setType(String s)
    {
        return (ByteArrayContent)super.setType(s);
    }
}
