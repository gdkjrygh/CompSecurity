// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.io.InputStream;

// Referenced classes of package com.google.api.client.http:
//            AbstractInputStreamContent

public final class InputStreamContent extends AbstractInputStreamContent
{

    private final InputStream inputStream;
    private long length;
    private boolean retrySupported;

    public InputStreamContent(String s, InputStream inputstream)
    {
        super(s);
        length = -1L;
        inputStream = (InputStream)Preconditions.checkNotNull(inputstream);
    }

    public InputStream getInputStream()
    {
        return inputStream;
    }

    public long getLength()
    {
        return length;
    }

    public boolean retrySupported()
    {
        return retrySupported;
    }

    public volatile AbstractInputStreamContent setCloseInputStream(boolean flag)
    {
        return setCloseInputStream(flag);
    }

    public InputStreamContent setCloseInputStream(boolean flag)
    {
        return (InputStreamContent)super.setCloseInputStream(flag);
    }

    public InputStreamContent setLength(long l)
    {
        length = l;
        return this;
    }

    public InputStreamContent setRetrySupported(boolean flag)
    {
        retrySupported = flag;
        return this;
    }

    public volatile AbstractInputStreamContent setType(String s)
    {
        return setType(s);
    }

    public InputStreamContent setType(String s)
    {
        return (InputStreamContent)super.setType(s);
    }
}
