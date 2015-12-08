// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;

// Referenced classes of package com.nineoldandroids.animation:
//            KeyframeSet, Keyframe, TypeEvaluator

class FloatKeyframeSet extends KeyframeSet
{

    private float deltaValue;
    private boolean firstTime;
    private float firstValue;
    private float lastValue;

    public transient FloatKeyframeSet(Keyframe.FloatKeyframe afloatkeyframe[])
    {
        super(afloatkeyframe);
        firstTime = true;
    }

    public FloatKeyframeSet clone()
    {
        ArrayList arraylist = mKeyframes;
        int j = mKeyframes.size();
        Keyframe.FloatKeyframe afloatkeyframe[] = new Keyframe.FloatKeyframe[j];
        for (int i = 0; i < j; i++)
        {
            afloatkeyframe[i] = (Keyframe.FloatKeyframe)((Keyframe)arraylist.get(i)).clone();
        }

        return new FloatKeyframeSet(afloatkeyframe);
    }

    public volatile KeyframeSet clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public float getFloatValue(float f)
    {
        if (mNumKeyframes == 2)
        {
            if (firstTime)
            {
                firstTime = false;
                firstValue = ((Keyframe.FloatKeyframe)mKeyframes.get(0)).getFloatValue();
                lastValue = ((Keyframe.FloatKeyframe)mKeyframes.get(1)).getFloatValue();
                deltaValue = lastValue - firstValue;
            }
            float f1 = f;
            if (mInterpolator != null)
            {
                f1 = mInterpolator.getInterpolation(f);
            }
            if (mEvaluator == null)
            {
                return firstValue + deltaValue * f1;
            } else
            {
                return ((Number)mEvaluator.evaluate(f1, Float.valueOf(firstValue), Float.valueOf(lastValue))).floatValue();
            }
        }
        if (f <= 0.0F)
        {
            Object obj = (Keyframe.FloatKeyframe)mKeyframes.get(0);
            Keyframe.FloatKeyframe floatkeyframe1 = (Keyframe.FloatKeyframe)mKeyframes.get(1);
            float f5 = ((Keyframe.FloatKeyframe) (obj)).getFloatValue();
            float f8 = floatkeyframe1.getFloatValue();
            float f10 = ((Keyframe.FloatKeyframe) (obj)).getFraction();
            float f12 = floatkeyframe1.getFraction();
            obj = floatkeyframe1.getInterpolator();
            float f2 = f;
            if (obj != null)
            {
                f2 = ((Interpolator) (obj)).getInterpolation(f);
            }
            f = (f2 - f10) / (f12 - f10);
            if (mEvaluator == null)
            {
                return (f8 - f5) * f + f5;
            } else
            {
                return ((Number)mEvaluator.evaluate(f, Float.valueOf(f5), Float.valueOf(f8))).floatValue();
            }
        }
        if (f >= 1.0F)
        {
            Object obj1 = (Keyframe.FloatKeyframe)mKeyframes.get(mNumKeyframes - 2);
            Keyframe.FloatKeyframe floatkeyframe2 = (Keyframe.FloatKeyframe)mKeyframes.get(mNumKeyframes - 1);
            float f6 = ((Keyframe.FloatKeyframe) (obj1)).getFloatValue();
            float f9 = floatkeyframe2.getFloatValue();
            float f11 = ((Keyframe.FloatKeyframe) (obj1)).getFraction();
            float f13 = floatkeyframe2.getFraction();
            obj1 = floatkeyframe2.getInterpolator();
            float f3 = f;
            if (obj1 != null)
            {
                f3 = ((Interpolator) (obj1)).getInterpolation(f);
            }
            f = (f3 - f11) / (f13 - f11);
            if (mEvaluator == null)
            {
                return (f9 - f6) * f + f6;
            } else
            {
                return ((Number)mEvaluator.evaluate(f, Float.valueOf(f6), Float.valueOf(f9))).floatValue();
            }
        }
        Keyframe.FloatKeyframe floatkeyframe = (Keyframe.FloatKeyframe)mKeyframes.get(0);
        for (int i = 1; i < mNumKeyframes; i++)
        {
            Keyframe.FloatKeyframe floatkeyframe3 = (Keyframe.FloatKeyframe)mKeyframes.get(i);
            if (f < floatkeyframe3.getFraction())
            {
                Interpolator interpolator = floatkeyframe3.getInterpolator();
                float f4 = f;
                if (interpolator != null)
                {
                    f4 = interpolator.getInterpolation(f);
                }
                f = (f4 - floatkeyframe.getFraction()) / (floatkeyframe3.getFraction() - floatkeyframe.getFraction());
                f4 = floatkeyframe.getFloatValue();
                float f7 = floatkeyframe3.getFloatValue();
                if (mEvaluator == null)
                {
                    return (f7 - f4) * f + f4;
                } else
                {
                    return ((Number)mEvaluator.evaluate(f, Float.valueOf(f4), Float.valueOf(f7))).floatValue();
                }
            }
            floatkeyframe = floatkeyframe3;
        }

        return ((Number)((Keyframe)mKeyframes.get(mNumKeyframes - 1)).getValue()).floatValue();
    }

    public Object getValue(float f)
    {
        return Float.valueOf(getFloatValue(f));
    }
}
