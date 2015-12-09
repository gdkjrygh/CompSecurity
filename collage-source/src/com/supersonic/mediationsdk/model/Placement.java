// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.supersonic.mediationsdk.model;


public class Placement
{

    private int mId;
    private String mPlacementName;
    private int mRewardAmount;
    private String mRewardName;

    public Placement(int i, String s, String s1, int j)
    {
        mId = i;
        mPlacementName = s;
        mRewardName = s1;
        mRewardAmount = j;
    }

    public int getId()
    {
        return mId;
    }

    public String getPlacementName()
    {
        return mPlacementName;
    }

    public int getRewardAmount()
    {
        return mRewardAmount;
    }

    public String getRewardName()
    {
        return mRewardName;
    }

    public String toString()
    {
        return (new StringBuilder()).append("placement name: ").append(mPlacementName).append(", reward name: ").append(mRewardName).append(" , amount:").append(mRewardAmount).toString();
    }
}
