// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nineoldandroids.view;

import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

// Referenced classes of package com.nineoldandroids.view:
//            ViewPropertyAnimator

class ViewPropertyAnimatorICS extends com.nineoldandroids.view.ViewPropertyAnimator
{

    private final WeakReference mNative;

    ViewPropertyAnimatorICS(View view)
    {
        mNative = new WeakReference(view.animate());
    }

    public com.nineoldandroids.view.ViewPropertyAnimator setDuration(long l)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)mNative.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.setDuration(l);
        }
        return this;
    }

    public com.nineoldandroids.view.ViewPropertyAnimator setInterpolator(Interpolator interpolator)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)mNative.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.setInterpolator(interpolator);
        }
        return this;
    }

    public com.nineoldandroids.view.ViewPropertyAnimator translationY(float f)
    {
        ViewPropertyAnimator viewpropertyanimator = (ViewPropertyAnimator)mNative.get();
        if (viewpropertyanimator != null)
        {
            viewpropertyanimator.translationY(f);
        }
        return this;
    }
}
