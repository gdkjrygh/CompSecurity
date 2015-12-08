// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package com.netflix.mediaclient.util.data:
//            FileSystemDataRepositoryImpl

private static class <init> extends FilterInputStream
{

    private int bytesRead;

    public int read()
        throws IOException
    {
        int i = super.read();
        if (i != -1)
        {
            bytesRead = bytesRead + 1;
        }
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        i = super.read(abyte0, i, j);
        if (i != -1)
        {
            bytesRead = bytesRead + i;
        }
        return i;
    }


    private (InputStream inputstream)
    {
        super(inputstream);
        bytesRead = 0;
    }

    bytesRead(InputStream inputstream, bytesRead bytesread)
    {
        this(inputstream);
    }
}
