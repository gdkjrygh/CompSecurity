// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.view.animation.Animation;

final class c
    implements android.view.animation.Animation.AnimationListener
{

    final Runnable a;

    c(Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final void onAnimationEnd(Animation animation)
    {
        a.run();
    }

    public final void onAnimationRepeat(Animation animation)
    {
    }

    public final void onAnimationStart(Animation animation)
    {
    }
}
