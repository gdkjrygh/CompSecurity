// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            PropertyValuesHolder, FloatKeyframeSet

static class setFloatValues extends PropertyValuesHolder
{

    float mFloatAnimatedValue;
    FloatKeyframeSet mFloatKeyframeSet;

    void calculateValue(float f)
    {
        mFloatAnimatedValue = mFloatKeyframeSet.getFloatValue(f);
    }

    public mFloatKeyframeSet clone()
    {
        mFloatKeyframeSet mfloatkeyframeset = (mFloatKeyframeSet)super.clone();
        mfloatkeyframeset.mFloatKeyframeSet = (FloatKeyframeSet)mfloatkeyframeset.mKeyframeSet;
        return mfloatkeyframeset;
    }

    public volatile PropertyValuesHolder clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public transient void setFloatValues(float af[])
    {
        super.setFloatValues(af);
        mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
    }

    public transient (String s, float af[])
    {
        super(s, null);
        setFloatValues(af);
    }
}
