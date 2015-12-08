// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.filetransfer;

import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.cordova.filetransfer:
//            FileTransfer

private static class bytesRead extends bytesRead
{

    private long bytesRead;

    private int updateBytesRead(int i)
    {
        if (i != -1)
        {
            bytesRead = bytesRead + (long)i;
        }
        return i;
    }

    public long getTotalRawBytesRead()
    {
        return bytesRead;
    }

    public int read()
        throws IOException
    {
        return updateBytesRead(super.updateBytesRead());
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        return updateBytesRead(super.updateBytesRead(abyte0, i, j));
    }

    public (InputStream inputstream)
    {
        super(inputstream);
        bytesRead = 0L;
    }
}
