// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;

import com.nineoldandroids.util.Property;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package com.nineoldandroids.animation:
//            IntEvaluator, FloatEvaluator, KeyframeSet, TypeEvaluator, 
//            FloatKeyframeSet

public class PropertyValuesHolder
    implements Cloneable
{
    static class FloatPropertyValuesHolder extends PropertyValuesHolder
    {

        float mFloatAnimatedValue;
        FloatKeyframeSet mFloatKeyframeSet;

        void calculateValue(float f)
        {
            mFloatAnimatedValue = mFloatKeyframeSet.getFloatValue(f);
        }

        public FloatPropertyValuesHolder clone()
        {
            FloatPropertyValuesHolder floatpropertyvaluesholder = (FloatPropertyValuesHolder)clone();
            floatpropertyvaluesholder.mFloatKeyframeSet = (FloatKeyframeSet)floatpropertyvaluesholder.mKeyframeSet;
            return floatpropertyvaluesholder;
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
            setFloatValues(af);
            mFloatKeyframeSet = (FloatKeyframeSet)mKeyframeSet;
        }

        public transient FloatPropertyValuesHolder(String s, float af[])
        {
            super(s, null);
            setFloatValues(af);
        }
    }


    private static Class DOUBLE_VARIANTS[];
    private static Class FLOAT_VARIANTS[];
    private static Class INTEGER_VARIANTS[];
    private static final TypeEvaluator sFloatEvaluator = new FloatEvaluator();
    private static final HashMap sGetterPropertyMap = new HashMap();
    private static final TypeEvaluator sIntEvaluator = new IntEvaluator();
    private static final HashMap sSetterPropertyMap = new HashMap();
    private Object mAnimatedValue;
    private TypeEvaluator mEvaluator;
    private Method mGetter;
    KeyframeSet mKeyframeSet;
    protected Property mProperty;
    final ReentrantReadWriteLock mPropertyMapLock;
    String mPropertyName;
    Method mSetter;
    final Object mTmpValueArray[];
    Class mValueType;

    private PropertyValuesHolder(String s)
    {
        mSetter = null;
        mGetter = null;
        mKeyframeSet = null;
        mPropertyMapLock = new ReentrantReadWriteLock();
        mTmpValueArray = new Object[1];
        mPropertyName = s;
    }


    public static transient PropertyValuesHolder ofFloat(String s, float af[])
    {
        return new FloatPropertyValuesHolder(s, af);
    }

    void calculateValue(float f)
    {
        mAnimatedValue = mKeyframeSet.getValue(f);
    }

    public PropertyValuesHolder clone()
    {
        PropertyValuesHolder propertyvaluesholder;
        try
        {
            propertyvaluesholder = (PropertyValuesHolder)super.clone();
            propertyvaluesholder.mPropertyName = mPropertyName;
            propertyvaluesholder.mProperty = mProperty;
            propertyvaluesholder.mKeyframeSet = mKeyframeSet.clone();
            propertyvaluesholder.mEvaluator = mEvaluator;
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            return null;
        }
        return propertyvaluesholder;
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getPropertyName()
    {
        return mPropertyName;
    }

    void init()
    {
        if (mEvaluator == null)
        {
            TypeEvaluator typeevaluator;
            if (mValueType == java/lang/Integer)
            {
                typeevaluator = sIntEvaluator;
            } else
            if (mValueType == java/lang/Float)
            {
                typeevaluator = sFloatEvaluator;
            } else
            {
                typeevaluator = null;
            }
            mEvaluator = typeevaluator;
        }
        if (mEvaluator != null)
        {
            mKeyframeSet.setEvaluator(mEvaluator);
        }
    }

    public transient void setFloatValues(float af[])
    {
        mValueType = Float.TYPE;
        mKeyframeSet = KeyframeSet.ofFloat(af);
    }

    public String toString()
    {
        return (new StringBuilder()).append(mPropertyName).append(": ").append(mKeyframeSet.toString()).toString();
    }

    static 
    {
        FLOAT_VARIANTS = (new Class[] {
            Float.TYPE, java/lang/Float, Double.TYPE, Integer.TYPE, java/lang/Double, java/lang/Integer
        });
        INTEGER_VARIANTS = (new Class[] {
            Integer.TYPE, java/lang/Integer, Float.TYPE, Double.TYPE, java/lang/Float, java/lang/Double
        });
        DOUBLE_VARIANTS = (new Class[] {
            Double.TYPE, java/lang/Double, Float.TYPE, Integer.TYPE, java/lang/Float, java/lang/Integer
        });
    }
}
