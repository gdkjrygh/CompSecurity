// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.animation;

import android.view.View;

// Referenced classes of package android.support.v4.animation:
//            AnimatorListenerCompat, AnimatorUpdateListenerCompat

public interface ValueAnimatorCompat
{

    public abstract void addListener(AnimatorListenerCompat animatorlistenercompat);

    public abstract void addUpdateListener(AnimatorUpdateListenerCompat animatorupdatelistenercompat);

    public abstract void cancel();

    public abstract float getAnimatedFraction();

    public abstract void setDuration(long l);

    public abstract void setTarget(View view);

    public abstract void start();
}
