// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;


// Referenced classes of package org.chromium.media:
//            MediaCodecBridge

private static class <init>
{

    private final int mFlags;
    private final int mIndex;
    private final int mNumBytes;
    private final int mOffset;
    private final long mPresentationTimeMicroseconds;
    private final int mStatus;

    private int flags()
    {
        return mFlags;
    }

    private int index()
    {
        return mIndex;
    }

    private int numBytes()
    {
        return mNumBytes;
    }

    private int offset()
    {
        return mOffset;
    }

    private long presentationTimeMicroseconds()
    {
        return mPresentationTimeMicroseconds;
    }

    private int status()
    {
        return mStatus;
    }

    private (int i, int j, int k, int l, long l1, int i1)
    {
        mStatus = i;
        mIndex = j;
        mFlags = k;
        mOffset = l;
        mPresentationTimeMicroseconds = l1;
        mNumBytes = i1;
    }

    mNumBytes(int i, int j, int k, int l, long l1, int i1, 
            mNumBytes mnumbytes)
    {
        this(i, j, k, l, l1, i1);
    }
}
