// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.util;

import java.io.IOException;
import java.io.OutputStream;

// Referenced classes of package com.google.api.client.util:
//            StreamingContent, Preconditions

public class ByteArrayStreamingContent
    implements StreamingContent
{

    private final byte byteArray[];
    private final int length;
    private final int offset;

    public ByteArrayStreamingContent(byte abyte0[])
    {
        this(abyte0, 0, abyte0.length);
    }

    public ByteArrayStreamingContent(byte abyte0[], int i, int j)
    {
        byteArray = (byte[])Preconditions.checkNotNull(abyte0);
        boolean flag;
        if (i >= 0 && j >= 0 && i + j <= abyte0.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        offset = i;
        length = j;
    }

    public void writeTo(OutputStream outputstream)
        throws IOException
    {
        outputstream.write(byteArray, offset, length);
        outputstream.flush();
    }
}
