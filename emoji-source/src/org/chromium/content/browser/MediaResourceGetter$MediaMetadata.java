// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;


// Referenced classes of package org.chromium.content.browser:
//            MediaResourceGetter

static class mSuccess
{

    private final int mDurationInMilliseconds;
    private final int mHeight;
    private final boolean mSuccess;
    private final int mWidth;

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (mSuccess)obj;
            if (mDurationInMilliseconds != ((mDurationInMilliseconds) (obj)).mDurationInMilliseconds)
            {
                return false;
            }
            if (mHeight != ((mHeight) (obj)).mHeight)
            {
                return false;
            }
            if (mSuccess != ((mSuccess) (obj)).mSuccess)
            {
                return false;
            }
            if (mWidth != ((mWidth) (obj)).mWidth)
            {
                return false;
            }
        }
        return true;
    }

    int getDurationInMilliseconds()
    {
        return mDurationInMilliseconds;
    }

    int getHeight()
    {
        return mHeight;
    }

    int getWidth()
    {
        return mWidth;
    }

    public int hashCode()
    {
        int i = mDurationInMilliseconds;
        int j = mHeight;
        char c;
        if (mSuccess)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (((i + 31) * 31 + j) * 31 + c) * 31 + mWidth;
    }

    boolean isSuccess()
    {
        return mSuccess;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaMetadata[durationInMilliseconds=").append(mDurationInMilliseconds).append(", width=").append(mWidth).append(", height=").append(mHeight).append(", success=").append(mSuccess).append("]").toString();
    }

    (int i, int j, int k, boolean flag)
    {
        mDurationInMilliseconds = i;
        mWidth = j;
        mHeight = k;
        mSuccess = flag;
    }
}
