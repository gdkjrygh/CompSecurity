// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova.file;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.cordova.file:
//            Filesystem

protected class numBytesToRead extends FilterInputStream
{

    long numBytesToRead;
    final Filesystem this$0;

    public int read()
        throws IOException
    {
        if (numBytesToRead <= 0L)
        {
            return -1;
        } else
        {
            numBytesToRead = numBytesToRead - 1L;
            return in.read();
        }
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        if (numBytesToRead <= 0L)
        {
            return -1;
        }
        int k = j;
        if ((long)j > numBytesToRead)
        {
            k = (int)numBytesToRead;
        }
        i = in.read(abyte0, i, k);
        numBytesToRead = numBytesToRead - (long)i;
        return i;
    }

    public (InputStream inputstream, long l)
    {
        this$0 = Filesystem.this;
        super(inputstream);
        numBytesToRead = l;
    }
}
