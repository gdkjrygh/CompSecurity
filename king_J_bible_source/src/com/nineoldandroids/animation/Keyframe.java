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

        public void setValue(Object obj)
        {
            if (obj != null && obj.getClass() == java/lang/Float)
            {
                mValue = ((Float)obj).floatValue();
                mHasValue = true;
            }
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

    static class IntKeyframe extends Keyframe
    {

        int mValue;

        public IntKeyframe clone()
        {
            IntKeyframe intkeyframe = new IntKeyframe(getFraction(), mValue);
            intkeyframe.setInterpolator(getInterpolator());
            return intkeyframe;
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

        public int getIntValue()
        {
            return mValue;
        }

        public Object getValue()
        {
            return Integer.valueOf(mValue);
        }

        public void setValue(Object obj)
        {
            if (obj != null && obj.getClass() == java/lang/Integer)
            {
                mValue = ((Integer)obj).intValue();
                mHasValue = true;
            }
        }

        IntKeyframe(float f)
        {
            mFraction = f;
            mValueType = Integer.TYPE;
        }

        IntKeyframe(float f, int i)
        {
            mFraction = f;
            mValue = i;
            mValueType = Integer.TYPE;
            mHasValue = true;
        }
    }

    static class ObjectKeyframe extends Keyframe
    {

        Object mValue;

        public ObjectKeyframe clone()
        {
            ObjectKeyframe objectkeyframe = new ObjectKeyframe(getFraction(), mValue);
            objectkeyframe.setInterpolator(getInterpolator());
            return objectkeyframe;
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

        public Object getValue()
        {
            return mValue;
        }

        public void setValue(Object obj)
        {
            mValue = obj;
            boolean flag;
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mHasValue = flag;
        }

        ObjectKeyframe(float f, Object obj)
        {
            mFraction = f;
            mValue = obj;
            boolean flag;
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            mHasValue = flag;
            if (mHasValue)
            {
                obj = obj.getClass();
            } else
            {
                obj = java/lang/Object;
            }
            mValueType = ((Class) (obj));
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

    public static Keyframe ofInt(float f)
    {
        return new IntKeyframe(f);
    }

    public static Keyframe ofInt(float f, int i)
    {
        return new IntKeyframe(f, i);
    }

    public static Keyframe ofObject(float f)
    {
        return new ObjectKeyframe(f, null);
    }

    public static Keyframe ofObject(float f, Object obj)
    {
        return new ObjectKeyframe(f, obj);
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

    public Class getType()
    {
        return mValueType;
    }

    public abstract Object getValue();

    public boolean hasValue()
    {
        return mHasValue;
    }

    public void setFraction(float f)
    {
        mFraction = f;
    }

    public void setInterpolator(Interpolator interpolator)
    {
        mInterpolator = interpolator;
    }

    public abstract void setValue(Object obj);
}
