// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener, ViewPropertyAnimatorUpdateListener

static interface 
{

    public abstract void alpha(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void cancel(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract void scaleY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void setDuration(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l);

    public abstract void setInterpolator(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator);

    public abstract void setListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

    public abstract void setUpdateListener(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener);

    public abstract void start(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract void translationX(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void translationY(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);
}
