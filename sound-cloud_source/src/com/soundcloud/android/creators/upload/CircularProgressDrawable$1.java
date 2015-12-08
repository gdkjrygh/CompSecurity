// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.upload;

import android.util.Property;

// Referenced classes of package com.soundcloud.android.creators.upload:
//            CircularProgressDrawable

class this._cls0 extends Property
{

    final CircularProgressDrawable this$0;

    public Float get(CircularProgressDrawable circularprogressdrawable)
    {
        return Float.valueOf(circularprogressdrawable.getCurrentGlobalAngle());
    }

    public volatile Object get(Object obj)
    {
        return get((CircularProgressDrawable)obj);
    }

    public void set(CircularProgressDrawable circularprogressdrawable, Float float1)
    {
        circularprogressdrawable.setCurrentGlobalAngle(float1.floatValue());
    }

    public volatile void set(Object obj, Object obj1)
    {
        set((CircularProgressDrawable)obj, (Float)obj1);
    }

    (Class class1, String s)
    {
        this$0 = CircularProgressDrawable.this;
        super(class1, s);
    }
}
