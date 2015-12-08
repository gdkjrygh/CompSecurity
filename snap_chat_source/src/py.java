// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.nio.ByteBuffer;
import org.chromium.net.UploadDataProvider;
import org.chromium.net.UploadDataSink;

public final class py extends UploadDataProvider
{

    private int mOffset;
    private byte mUploadData[];

    public py(byte abyte0[])
    {
        mUploadData = abyte0;
        mOffset = 0;
    }

    public final long a()
    {
        return (long)mUploadData.length;
    }

    public final void a(UploadDataSink uploaddatasink)
    {
        mOffset = 0;
        uploaddatasink.b();
    }

    public final void a(UploadDataSink uploaddatasink, ByteBuffer bytebuffer)
    {
        if (bytebuffer.remaining() >= mUploadData.length - mOffset)
        {
            bytebuffer.put(mUploadData, mOffset, mUploadData.length - mOffset);
            mOffset = mUploadData.length;
        } else
        {
            int i = bytebuffer.remaining();
            bytebuffer.put(mUploadData, mOffset, i);
            mOffset = i + mOffset;
        }
        uploaddatasink.a();
    }
}
