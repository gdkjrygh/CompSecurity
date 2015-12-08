// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import android.util.Log;
import com.nineoldandroids.util.FloatProperty;
import com.nineoldandroids.util.Property;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

// Referenced classes of package com.nineoldandroids.animation:
//            PropertyValuesHolder, FloatKeyframeSet

static class setFloatValues extends PropertyValuesHolder
{

    float mFloatAnimatedValue;
    FloatKeyframeSet mFloatKeyframeSet;
    private FloatProperty mFloatProperty;

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

    Object getAnimatedValue()
    {
        return Float.valueOf(mFloatAnimatedValue);
    }

    void setAnimatedValue(Object obj)
    {
        if (mFloatProperty != null)
        {
            mFloatProperty.setValue(obj, mFloatAnimatedValue);
        } else
        {
            if (mProperty != null)
            {
                mProperty.set(obj, Float.valueOf(mFloatAnimatedValue));
                return;
            }
            if (mSetter != null)
            {
                try
                {
                    mTmpValueArray[0] = Float.valueOf(mFloatAnimatedValue);
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

    public transient void setFloatValues(float af[])
    {
        super.setFloatValues(af);
        mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
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

    public (Property property, FloatKeyframeSet floatkeyframeset)
    {
        super(property, null);
        mValueType = Float.TYPE;
        mKeyframeSet = floatkeyframeset;
        mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
        if (property instanceof FloatProperty)
        {
            mFloatProperty = (FloatProperty)mProperty;
        }
    }

    public transient mProperty(Property property, float af[])
    {
        super(property, null);
        setFloatValues(af);
        if (property instanceof FloatProperty)
        {
            mFloatProperty = (FloatProperty)mProperty;
        }
    }

    public mProperty(String s, FloatKeyframeSet floatkeyframeset)
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
