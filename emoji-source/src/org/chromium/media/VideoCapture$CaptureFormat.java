// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;


// Referenced classes of package org.chromium.media:
//            VideoCapture

protected static class mPixelFormat
{

    final int mFramerate;
    int mHeight;
    final int mPixelFormat;
    int mWidth;

    public int getFramerate()
    {
        return mFramerate;
    }

    public int getHeight()
    {
        return mHeight;
    }

    public int getPixelFormat()
    {
        return mPixelFormat;
    }

    public int getWidth()
    {
        return mWidth;
    }

    public (int i, int j, int k, int l)
    {
        mWidth = i;
        mHeight = j;
        mFramerate = k;
        mPixelFormat = l;
    }
}
