// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;


// Referenced classes of package com.netflix.mediaclient.ui.player:
//            VideoWindowForPostplayWithAnimation

protected static class mEndScale
{

    private int mDurationInMS;
    private int mEndLeftMargin;
    private float mEndScale;
    private int mEndTopMargin;
    private int mStartLeftMargin;
    private float mStartScale;
    private int mStartTopMargin;

    public int getDurationInMS()
    {
        return mDurationInMS;
    }

    public int getEndLeftMargin()
    {
        return mEndLeftMargin;
    }

    public float getEndScale()
    {
        return mEndScale;
    }

    public int getEndTopMargin()
    {
        return mEndTopMargin;
    }

    public int getStartLeftMargin()
    {
        return mStartLeftMargin;
    }

    public float getStartScale()
    {
        return mStartScale;
    }

    public int getStartTopMargin()
    {
        return mStartTopMargin;
    }

    public (int i, int j, int k, float f, int l, int i1, float f1)
    {
        mDurationInMS = i;
        mStartLeftMargin = j;
        mStartTopMargin = k;
        mStartScale = f;
        mEndLeftMargin = l;
        mEndTopMargin = i1;
        mEndScale = f1;
    }
}
