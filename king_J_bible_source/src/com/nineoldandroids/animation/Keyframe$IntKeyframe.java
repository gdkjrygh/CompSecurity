// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.animation;


// Referenced classes of package com.nineoldandroids.animation:
//            Keyframe

static class mHasValue extends Keyframe
{

    int mValue;

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

    (float f)
    {
        mFraction = f;
        mValueType = Integer.TYPE;
    }

    mValueType(float f, int i)
    {
        mFraction = f;
        mValue = i;
        mValueType = Integer.TYPE;
        mHasValue = true;
    }
}
