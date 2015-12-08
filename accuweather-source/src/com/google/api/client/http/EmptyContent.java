// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.http:
//            HttpContent

public class EmptyContent
    implements HttpContent
{

    public EmptyContent()
    {
    }

    public long getLength()
        throws IOException
    {
        return 0L;
    }

    public String getType()
    {
        return null;
    }

    public boolean retrySupported()
    {
        return true;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        outputstream.flush();
    }
}
