// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener

static interface 
{

    public abstract void alpha(View view, float f);

    public abstract void alphaBy(View view, float f);

    public abstract void cancel(View view);

    public abstract long getDuration(View view);

    public abstract Interpolator getInterpolator(View view);

    public abstract long getStartDelay(View view);

    public abstract void rotation(View view, float f);

    public abstract void rotationBy(View view, float f);

    public abstract void rotationX(View view, float f);

    public abstract void rotationXBy(View view, float f);

    public abstract void rotationY(View view, float f);

    public abstract void rotationYBy(View view, float f);

    public abstract void scaleX(View view, float f);

    public abstract void scaleXBy(View view, float f);

    public abstract void scaleY(View view, float f);

    public abstract void scaleYBy(View view, float f);

    public abstract void setDuration(View view, long l);

    public abstract void setInterpolator(View view, Interpolator interpolator);

    public abstract void setListener(View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

    public abstract void setStartDelay(View view, long l);

    public abstract void start(View view);

    public abstract void translationX(View view, float f);

    public abstract void translationXBy(View view, float f);

    public abstract void translationY(View view, float f);

    public abstract void translationYBy(View view, float f);

    public abstract void withEndAction(View view, Runnable runnable);

    public abstract void withLayer(View view);

    public abstract void withStartAction(View view, Runnable runnable);

    public abstract void x(View view, float f);

    public abstract void xBy(View view, float f);

    public abstract void y(View view, float f);

    public abstract void yBy(View view, float f);
}
