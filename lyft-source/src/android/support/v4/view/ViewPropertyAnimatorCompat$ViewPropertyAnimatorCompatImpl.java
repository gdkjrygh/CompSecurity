// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.animation.Interpolator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorCompat, ViewPropertyAnimatorListener

interface 
{

    public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, long l);

    public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, ViewPropertyAnimatorListener viewpropertyanimatorlistener);

    public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Interpolator interpolator);

    public abstract void a(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, Runnable runnable);

    public abstract void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view);

    public abstract void b(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);

    public abstract void c(ViewPropertyAnimatorCompat viewpropertyanimatorcompat, View view, float f);
}
