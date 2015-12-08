// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class Be
{
    public static final class a
    {

        int mGravity;
        public int mHeight;
        public boolean mShouldHideSystemUi;
        public int mWidth;

        public final Be a()
        {
            return new Be(this, (byte)0);
        }

        public a()
        {
            mGravity = 0;
            mWidth = -1;
            mHeight = -1;
            mShouldHideSystemUi = false;
        }
    }


    public final int mGravity;
    public final int mHeight;
    public final boolean mShouldHideSystemUi;
    public final int mWidth;

    private Be(a a1)
    {
        mGravity = a1.mGravity;
        mWidth = a1.mWidth;
        mHeight = a1.mHeight;
        mShouldHideSystemUi = a1.mShouldHideSystemUi;
    }

    Be(a a1, byte byte0)
    {
        this(a1);
    }
}
