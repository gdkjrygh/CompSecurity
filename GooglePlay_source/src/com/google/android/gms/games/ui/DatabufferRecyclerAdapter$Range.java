// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;


// Referenced classes of package com.google.android.gms.games.ui:
//            DatabufferRecyclerAdapter

private static final class mHigh
{

    public int mHigh;
    public int mLow;

    public final int getSize()
    {
        return mHigh - mLow;
    }

    public final boolean isEmpty()
    {
        return mLow >= mHigh;
    }

    public ()
    {
        mLow = 0;
        mHigh = 0;
    }

    public mHigh(int i, int j)
    {
        mLow = i;
        mHigh = j;
    }
}
