// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;

import java.io.FileInputStream;

class LineBufferReader
{

    private int mBytesInBuffer;
    private int mFileBufIndex;
    private byte mFileBuffer[];
    private FileInputStream mInputStream;

    public LineBufferReader()
    {
        mFileBuffer = new byte[512];
    }

    public int readLine(byte abyte0[])
    {
        if (mFileBufIndex >= mBytesInBuffer)
        {
            mBytesInBuffer = mInputStream.read(mFileBuffer);
            mFileBufIndex = 0;
        }
        int i;
        for (i = 0; mBytesInBuffer != -1 && i < abyte0.length && mFileBuffer[mFileBufIndex] != 10; i++)
        {
            abyte0[i] = mFileBuffer[mFileBufIndex];
            mFileBufIndex = mFileBufIndex + 1;
            if (mFileBufIndex >= mBytesInBuffer)
            {
                mBytesInBuffer = mInputStream.read(mFileBuffer);
                mFileBufIndex = 0;
            }
        }

        mFileBufIndex = mFileBufIndex + 1;
        if (mBytesInBuffer == -1)
        {
            i = -1;
        }
        return i;
    }

    public void setFileStream(FileInputStream fileinputstream)
    {
        mInputStream = fileinputstream;
        mBytesInBuffer = 0;
        mFileBufIndex = 0;
    }

    public void skipLine()
    {
        if (mFileBufIndex >= mBytesInBuffer)
        {
            mBytesInBuffer = mInputStream.read(mFileBuffer);
            mFileBufIndex = 0;
        }
        do
        {
            if (mBytesInBuffer == -1 || mFileBuffer[mFileBufIndex] == 10)
            {
                break;
            }
            mFileBufIndex = mFileBufIndex + 1;
            if (mFileBufIndex >= mBytesInBuffer)
            {
                mBytesInBuffer = mInputStream.read(mFileBuffer);
                mFileBufIndex = 0;
            }
        } while (true);
        mFileBufIndex = mFileBufIndex + 1;
    }
}
