// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.apptentive.android.sdk.util;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CountingOutputStream extends BufferedOutputStream
{

    private int bytesWritten;

    public CountingOutputStream(OutputStream outputstream)
    {
        super(outputstream);
        bytesWritten = 0;
    }

    public int getBytesWritten()
    {
        return bytesWritten;
    }

    public void write(int i)
        throws IOException
    {
        bytesWritten = bytesWritten + 1;
        super.write(i);
    }

    public void write(byte abyte0[])
        throws IOException
    {
        bytesWritten = bytesWritten + abyte0.length;
        super.write(abyte0);
    }

    public void write(byte abyte0[], int i, int j)
        throws IOException
    {
        bytesWritten = bytesWritten + j;
        super.write(abyte0, i, j);
    }
}
