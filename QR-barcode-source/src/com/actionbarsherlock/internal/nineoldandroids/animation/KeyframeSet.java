// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Keyframe, FloatKeyframeSet, IntKeyframeSet, TypeEvaluator

class KeyframeSet
{

    TypeEvaluator mEvaluator;
    Keyframe mFirstKeyframe;
    Interpolator mInterpolator;
    ArrayList mKeyframes;
    Keyframe mLastKeyframe;
    int mNumKeyframes;

    public transient KeyframeSet(Keyframe akeyframe[])
    {
        mNumKeyframes = akeyframe.length;
        mKeyframes = new ArrayList();
        mKeyframes.addAll(Arrays.asList(akeyframe));
        mFirstKeyframe = (Keyframe)mKeyframes.get(0);
        mLastKeyframe = (Keyframe)mKeyframes.get(mNumKeyframes - 1);
        mInterpolator = mLastKeyframe.getInterpolator();
    }

    public static transient KeyframeSet ofFloat(float af[])
    {
        int j = af.length;
        Keyframe.FloatKeyframe afloatkeyframe[] = new Keyframe.FloatKeyframe[Math.max(j, 2)];
        if (j == 1)
        {
            afloatkeyframe[0] = (Keyframe.FloatKeyframe)Keyframe.ofFloat(0.0F);
            afloatkeyframe[1] = (Keyframe.FloatKeyframe)Keyframe.ofFloat(1.0F, af[0]);
        } else
        {
            afloatkeyframe[0] = (Keyframe.FloatKeyframe)Keyframe.ofFloat(0.0F, af[0]);
            int i = 1;
            while (i < j) 
            {
                afloatkeyframe[i] = (Keyframe.FloatKeyframe)Keyframe.ofFloat((float)i / (float)(j - 1), af[i]);
                i++;
            }
        }
        return new FloatKeyframeSet(afloatkeyframe);
    }

    public static transient KeyframeSet ofInt(int ai[])
    {
        int j = ai.length;
        Keyframe.IntKeyframe aintkeyframe[] = new Keyframe.IntKeyframe[Math.max(j, 2)];
        if (j == 1)
        {
            aintkeyframe[0] = (Keyframe.IntKeyframe)Keyframe.ofInt(0.0F);
            aintkeyframe[1] = (Keyframe.IntKeyframe)Keyframe.ofInt(1.0F, ai[0]);
        } else
        {
            aintkeyframe[0] = (Keyframe.IntKeyframe)Keyframe.ofInt(0.0F, ai[0]);
            int i = 1;
            while (i < j) 
            {
                aintkeyframe[i] = (Keyframe.IntKeyframe)Keyframe.ofInt((float)i / (float)(j - 1), ai[i]);
                i++;
            }
        }
        return new IntKeyframeSet(aintkeyframe);
    }

    public static transient KeyframeSet ofKeyframe(Keyframe akeyframe[])
    {
        int i;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int k;
        k = akeyframe.length;
        flag2 = false;
        flag1 = false;
        flag = false;
        i = 0;
_L7:
        if (i < k) goto _L2; else goto _L1
_L1:
        if (!flag2 || flag1 || flag) goto _L4; else goto _L3
_L3:
        Keyframe.FloatKeyframe afloatkeyframe[];
        afloatkeyframe = new Keyframe.FloatKeyframe[k];
        i = 0;
_L5:
        if (i >= k)
        {
            return new FloatKeyframeSet(afloatkeyframe);
        }
        afloatkeyframe[i] = (Keyframe.FloatKeyframe)akeyframe[i];
        i++;
        continue; /* Loop/switch isn't completed */
_L2:
        if (akeyframe[i] instanceof Keyframe.FloatKeyframe)
        {
            flag2 = true;
        } else
        if (akeyframe[i] instanceof Keyframe.IntKeyframe)
        {
            flag1 = true;
        } else
        {
            flag = true;
        }
        i++;
        continue; /* Loop/switch isn't completed */
        if (true) goto _L5; else goto _L4
_L4:
        if (flag1 && !flag2 && !flag)
        {
            Keyframe.IntKeyframe aintkeyframe[] = new Keyframe.IntKeyframe[k];
            int j = 0;
            do
            {
                if (j >= k)
                {
                    return new IntKeyframeSet(aintkeyframe);
                }
                aintkeyframe[j] = (Keyframe.IntKeyframe)akeyframe[j];
                j++;
            } while (true);
        }
        return new KeyframeSet(akeyframe);
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static transient KeyframeSet ofObject(Object aobj[])
    {
        int j = aobj.length;
        Keyframe.ObjectKeyframe aobjectkeyframe[] = new Keyframe.ObjectKeyframe[Math.max(j, 2)];
        if (j == 1)
        {
            aobjectkeyframe[0] = (Keyframe.ObjectKeyframe)Keyframe.ofObject(0.0F);
            aobjectkeyframe[1] = (Keyframe.ObjectKeyframe)Keyframe.ofObject(1.0F, aobj[0]);
        } else
        {
            aobjectkeyframe[0] = (Keyframe.ObjectKeyframe)Keyframe.ofObject(0.0F, aobj[0]);
            int i = 1;
            while (i < j) 
            {
                aobjectkeyframe[i] = (Keyframe.ObjectKeyframe)Keyframe.ofObject((float)i / (float)(j - 1), aobj[i]);
                i++;
            }
        }
        return new KeyframeSet(aobjectkeyframe);
    }

    public KeyframeSet clone()
    {
        ArrayList arraylist = mKeyframes;
        int j = mKeyframes.size();
        Keyframe akeyframe[] = new Keyframe[j];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return new KeyframeSet(akeyframe);
            }
            akeyframe[i] = ((Keyframe)arraylist.get(i)).clone();
            i++;
        } while (true);
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Object getValue(float f)
    {
        if (mNumKeyframes == 2)
        {
            float f1 = f;
            if (mInterpolator != null)
            {
                f1 = mInterpolator.getInterpolation(f);
            }
            return mEvaluator.evaluate(f1, mFirstKeyframe.getValue(), mLastKeyframe.getValue());
        }
        if (f <= 0.0F)
        {
            Keyframe keyframe = (Keyframe)mKeyframes.get(1);
            Interpolator interpolator = keyframe.getInterpolator();
            float f2 = f;
            if (interpolator != null)
            {
                f2 = interpolator.getInterpolation(f);
            }
            f = mFirstKeyframe.getFraction();
            f = (f2 - f) / (keyframe.getFraction() - f);
            return mEvaluator.evaluate(f, mFirstKeyframe.getValue(), keyframe.getValue());
        }
        if (f >= 1.0F)
        {
            Keyframe keyframe1 = (Keyframe)mKeyframes.get(mNumKeyframes - 2);
            Interpolator interpolator1 = mLastKeyframe.getInterpolator();
            float f3 = f;
            if (interpolator1 != null)
            {
                f3 = interpolator1.getInterpolation(f);
            }
            f = keyframe1.getFraction();
            f = (f3 - f) / (mLastKeyframe.getFraction() - f);
            return mEvaluator.evaluate(f, keyframe1.getValue(), mLastKeyframe.getValue());
        }
        Keyframe keyframe2 = mFirstKeyframe;
        int i = 1;
        do
        {
            if (i >= mNumKeyframes)
            {
                return mLastKeyframe.getValue();
            }
            Keyframe keyframe3 = (Keyframe)mKeyframes.get(i);
            if (f < keyframe3.getFraction())
            {
                Interpolator interpolator2 = keyframe3.getInterpolator();
                float f4 = f;
                if (interpolator2 != null)
                {
                    f4 = interpolator2.getInterpolation(f);
                }
                f = keyframe2.getFraction();
                f = (f4 - f) / (keyframe3.getFraction() - f);
                return mEvaluator.evaluate(f, keyframe2.getValue(), keyframe3.getValue());
            }
            keyframe2 = keyframe3;
            i++;
        } while (true);
    }

    public void setEvaluator(TypeEvaluator typeevaluator)
    {
        mEvaluator = typeevaluator;
    }

    public String toString()
    {
        String s = " ";
        int i = 0;
        do
        {
            if (i >= mNumKeyframes)
            {
                return s;
            }
            s = (new StringBuilder(String.valueOf(s))).append(((Keyframe)mKeyframes.get(i)).getValue()).append("  ").toString();
            i++;
        } while (true);
    }
}
