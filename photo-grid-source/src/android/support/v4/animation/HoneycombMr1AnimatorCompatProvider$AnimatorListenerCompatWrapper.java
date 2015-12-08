// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.animation.Animator;

// Referenced classes of package android.support.v4.animation:
//            AnimatorListenerCompat, ValueAnimatorCompat

class mValueAnimatorCompat
    implements android.animation.patWrapper
{

    final ValueAnimatorCompat mValueAnimatorCompat;
    final AnimatorListenerCompat mWrapped;

    public void onAnimationCancel(Animator animator)
    {
        mWrapped.onAnimationCancel(mValueAnimatorCompat);
    }

    public void onAnimationEnd(Animator animator)
    {
        mWrapped.onAnimationEnd(mValueAnimatorCompat);
    }

    public void onAnimationRepeat(Animator animator)
    {
        mWrapped.onAnimationRepeat(mValueAnimatorCompat);
    }

    public void onAnimationStart(Animator animator)
    {
        mWrapped.onAnimationStart(mValueAnimatorCompat);
    }

    public (AnimatorListenerCompat animatorlistenercompat, ValueAnimatorCompat valueanimatorcompat)
    {
        mWrapped = animatorlistenercompat;
        mValueAnimatorCompat = valueanimatorcompat;
    }
}
