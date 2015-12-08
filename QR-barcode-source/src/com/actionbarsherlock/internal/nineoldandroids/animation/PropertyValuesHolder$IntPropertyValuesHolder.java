// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;

import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            PropertyValuesHolder, IntKeyframeSet

static class setIntValues extends PropertyValuesHolder
{

    int mIntAnimatedValue;
    IntKeyframeSet mIntKeyframeSet;

    void calculateValue(float f)
    {
        mIntAnimatedValue = mIntKeyframeSet.getIntValue(f);
    }

    public mIntKeyframeSet clone()
    {
        mIntKeyframeSet mintkeyframeset = (mIntKeyframeSet)super.clone();
        mintkeyframeset.mIntKeyframeSet = (IntKeyframeSet)mintkeyframeset.mKeyframeSet;
        return mintkeyframeset;
    }

    public volatile PropertyValuesHolder clone()
    {
        return clone();
    }

    Object getAnimatedValue()
    {
        return Integer.valueOf(mIntAnimatedValue);
    }

    void setAnimatedValue(Object obj)
    {
        if (mSetter == null)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        mTmpValueArray[0] = Integer.valueOf(mIntAnimatedValue);
        mSetter.invoke(obj, mTmpValueArray);
        return;
        obj;
        Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
        return;
        obj;
        Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
        return;
    }

    public transient void setIntValues(int ai[])
    {
        super.setIntValues(ai);
        mIntKeyframeSet = (IntKeyframeSet)mKeyframeSet;
    }

    void setupSetter(Class class1)
    {
        super.setupSetter(class1);
    }

    public (String s, IntKeyframeSet intkeyframeset)
    {
        super(s, null);
        mValueType = Integer.TYPE;
        mKeyframeSet = intkeyframeset;
        mIntKeyframeSet = (IntKeyframeSet)mKeyframeSet;
    }

    public transient mKeyframeSet(String s, int ai[])
    {
        super(s, null);
        setIntValues(ai);
    }
}
