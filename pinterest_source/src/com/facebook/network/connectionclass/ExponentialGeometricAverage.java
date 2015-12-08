// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.network.connectionclass;


class ExponentialGeometricAverage
{

    private int mCount;
    private final int mCutover;
    private final double mDecayConstant;
    private double mValue;

    public ExponentialGeometricAverage(double d)
    {
        mValue = -1D;
        mDecayConstant = d;
        int i;
        if (d == 0.0D)
        {
            i = 0x7fffffff;
        } else
        {
            i = (int)Math.ceil(1.0D / d);
        }
        mCutover = i;
    }

    public void addMeasurement(double d)
    {
        double d1 = 1.0D - mDecayConstant;
        if (mCount > mCutover)
        {
            mValue = Math.exp(d1 * Math.log(mValue) + mDecayConstant * Math.log(d));
        } else
        if (mCount > 0)
        {
            d1 = (d1 * (double)mCount) / ((double)mCount + 1.0D);
            mValue = Math.exp(d1 * Math.log(mValue) + (1.0D - d1) * Math.log(d));
        } else
        {
            mValue = d;
        }
        mCount = mCount + 1;
    }

    public double getAverage()
    {
        return mValue;
    }

    public void reset()
    {
        mValue = -1D;
        mCount = 0;
    }
}
