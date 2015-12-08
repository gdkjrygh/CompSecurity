// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.util.Log;
import com.nineoldandroids.util.IntProperty;
import com.nineoldandroids.util.Property;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.nineoldandroids.animation:
//            PropertyValuesHolder, IntKeyframeSet

static class setIntValues extends PropertyValuesHolder
{

    int mIntAnimatedValue;
    IntKeyframeSet mIntKeyframeSet;
    private IntProperty mIntProperty;

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

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    Object getAnimatedValue()
    {
        return Integer.valueOf(mIntAnimatedValue);
    }

    void setAnimatedValue(Object obj)
    {
        if (mIntProperty != null)
        {
            mIntProperty.setValue(obj, mIntAnimatedValue);
        } else
        {
            if (mProperty != null)
            {
                mProperty.set(obj, Integer.valueOf(mIntAnimatedValue));
                return;
            }
            if (mSetter != null)
            {
                try
                {
                    mTmpValueArray[0] = Integer.valueOf(mIntAnimatedValue);
                    mSetter.invoke(obj, mTmpValueArray);
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("PropertyValuesHolder", ((InvocationTargetException) (obj)).toString());
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("PropertyValuesHolder", ((IllegalAccessException) (obj)).toString());
                }
                return;
            }
        }
    }

    public transient void setIntValues(int ai[])
    {
        super.setIntValues(ai);
        mIntKeyframeSet = (IntKeyframeSet)mKeyframeSet;
    }

    void setupSetter(Class class1)
    {
        if (mProperty != null)
        {
            return;
        } else
        {
            super.setupSetter(class1);
            return;
        }
    }

    public (Property property, IntKeyframeSet intkeyframeset)
    {
        super(property, null);
        mValueType = Integer.TYPE;
        mKeyframeSet = intkeyframeset;
        mIntKeyframeSet = (IntKeyframeSet)mKeyframeSet;
        if (property instanceof IntProperty)
        {
            mIntProperty = (IntProperty)mProperty;
        }
    }

    public transient mProperty(Property property, int ai[])
    {
        super(property, null);
        setIntValues(ai);
        if (property instanceof IntProperty)
        {
            mIntProperty = (IntProperty)mProperty;
        }
    }

    public mProperty(String s, IntKeyframeSet intkeyframeset)
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
