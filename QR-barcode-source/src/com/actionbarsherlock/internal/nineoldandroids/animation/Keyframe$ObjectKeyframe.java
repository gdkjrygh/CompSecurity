// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.nineoldandroids.animation;


// Referenced classes of package com.actionbarsherlock.internal.nineoldandroids.animation:
//            Keyframe

static class mValueType extends Keyframe
{

    Object mValue;

    public mValueType clone()
    {
        mValueType mvaluetype = new <init>(getFraction(), mValue);
        mvaluetype.setInterpolator(getInterpolator());
        return mvaluetype;
    }

    public volatile Keyframe clone()
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

    (float f, Object obj)
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
