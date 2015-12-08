// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;


// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Keyframe

static class mIGetNonZeroValue extends Keyframe
{

    int mValue;

    public mIGetNonZeroValue clone()
    {
        mIGetNonZeroValue migetnonzerovalue = new <init>(getFraction(), mValue);
        migetnonzerovalue.setInterpolator(getInterpolator());
        return migetnonzerovalue;
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
            mIGetNonZeroValue = true;
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
        mIGetNonZeroValue = true;
    }
}
