// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;


// Referenced classes of package android.support.v4.animation:
//            ValueAnimatorCompat

public interface AnimatorListenerCompat
{

    public abstract void onAnimationCancel(ValueAnimatorCompat valueanimatorcompat);

    public abstract void onAnimationEnd(ValueAnimatorCompat valueanimatorcompat);

    public abstract void onAnimationRepeat(ValueAnimatorCompat valueanimatorcompat);

    public abstract void onAnimationStart(ValueAnimatorCompat valueanimatorcompat);
}
