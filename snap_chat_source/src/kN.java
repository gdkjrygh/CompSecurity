// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class kN
{
    public static final class a
    {

        Double mFileSize;
        Integer mHeight;
        String mMediaUrl;
        Integer mWidth;

        public a()
        {
            mWidth = null;
            mHeight = null;
            mFileSize = null;
            mMediaUrl = null;
        }
    }


    final double mFileSize;
    final int mHeight;
    final String mMediaUrl;
    final int mWidth;

    private kN(String s, int i, int j, double d)
    {
        mMediaUrl = s;
        mWidth = i;
        mHeight = j;
        mFileSize = d;
    }

    kN(String s, int i, int j, double d, byte byte0)
    {
        this(s, i, j, d);
    }

    public final int a()
    {
        return mHeight * mWidth;
    }

    public final double b()
    {
        return (double)mHeight / (double)mWidth;
    }
}
