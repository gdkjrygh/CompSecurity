// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.http:
//            HttpContent

public abstract class AbstractInputStreamContent
    implements HttpContent
{

    private boolean closeInputStream;
    private String type;

    public AbstractInputStreamContent(String s)
    {
        closeInputStream = true;
        setType(s);
    }

    public final boolean getCloseInputStream()
    {
        return closeInputStream;
    }

    public abstract InputStream getInputStream()
        throws IOException;

    public String getType()
    {
        return type;
    }

    public AbstractInputStreamContent setCloseInputStream(boolean flag)
    {
        closeInputStream = flag;
        return this;
    }

    public AbstractInputStreamContent setType(String s)
    {
        type = s;
        return this;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        IOUtils.copy(getInputStream(), outputstream, closeInputStream);
        outputstream.flush();
    }
}
