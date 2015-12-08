// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.textinput;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

final class b extends AnimatorListenerAdapter
{

    final Runnable a;

    b(Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.run();
    }
}
