// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;

public abstract class Keyframe
    implements Cloneable
{
    static class FloatKeyframe extends Keyframe
    {

        float mValue;

        public FloatKeyframe clone()
        {
            FloatKeyframe floatkeyframe = new FloatKeyframe(getFraction(), mValue);
            floatkeyframe.setInterpolator(getInterpolator());
            return floatkeyframe;
        }

        public volatile Keyframe clone()
        {
            return clone();
        }

        public volatile Object clone()
            throws CloneNotSupportedException
        {
            return clone();
        }

        public float getFloatValue()
        {
            return mValue;
        }

        public Object getValue()
        {
            return Float.valueOf(mValue);
        }

        FloatKeyframe(float f)
        {
            mFraction = f;
            mValueType = Float.TYPE;
        }

        FloatKeyframe(float f, float f1)
        {
            mFraction = f;
            mValue = f1;
            mValueType = Float.TYPE;
            mHasValue = true;
        }
    }


    float mFraction;
    boolean mHasValue;
    private Interpolator mInterpolator;
    Class mValueType;

    public Keyframe()
    {
        mInterpolator = null;
        mHasValue = false;
    }

    public static Keyframe ofFloat(float f)
    {
        return new FloatKeyframe(f);
    }

    public static Keyframe ofFloat(float f, float f1)
    {
        return new FloatKeyframe(f, f1);
    }

    public abstract Keyframe clone();

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public float getFraction()
    {
        return mFraction;
    }

    public Interpolator getInterpolator()
    {
        return mInterpolator;
    }

    public abstract Object getValue();

    public void setInterpolator(Interpolator interpolator)
    {
        mInterpolator = interpolator;
    }
}
