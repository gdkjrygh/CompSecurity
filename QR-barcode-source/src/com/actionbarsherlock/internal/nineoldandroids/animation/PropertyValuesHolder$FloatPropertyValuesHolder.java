// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
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

    Object getAnimatedValue()
    {
        return Float.valueOf(mFloatAnimatedValue);
    }

    void setAnimatedValue(Object obj)
    {
        if (mSetter == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        mTmpValueArray[0] = Float.valueOf(mFloatAnimatedValue);
        mSetter.invoke(obj, mTmpValueArray);
        return;
        obj;
        Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
        return;
        obj;
        Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
        return;
    }

    public transient void setFloatValues(float af[])
    {
        super.setFloatValues(af);
        mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
    }

    void setupSetter(Class class1)
    {
        super.setupSetter(class1);
    }

    public (String s, FloatKeyframeSet floatkeyframeset)
    {
        super(s, null);
        mValueType = Float.TYPE;
        mKeyframeSet = floatkeyframeset;
        mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
    }

    public transient mKeyframeSet(String s, float af[])
    {
        super(s, null);
        setFloatValues(af);
    }
}
