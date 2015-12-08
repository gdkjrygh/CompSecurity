// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            Keyframe

static class mHasValue extends Keyframe
{

    float mValue;

    public mHasValue clone()
    {
        mHasValue mhasvalue = new <init>(getFraction(), mValue);
        mhasvalue.setInterpolator(getInterpolator());
        return mhasvalue;
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

    (float f)
    {
        mFraction = f;
        mValueType = Float.TYPE;
    }

    mValueType(float f, float f1)
    {
        mFraction = f;
        mValue = f1;
        mValueType = Float.TYPE;
        mHasValue = true;
    }
}
