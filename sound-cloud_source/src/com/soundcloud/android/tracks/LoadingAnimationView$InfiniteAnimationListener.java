// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.animation.Animator;

// Referenced classes of package com.soundcloud.android.tracks:
//            LoadingAnimationView

private static class <init>
    implements android.animation.ionListener
{

    public void onAnimationCancel(Animator animator)
    {
    }

    public void onAnimationEnd(Animator animator)
    {
        animator.setStartDelay(700L);
        animator.start();
    }

    public void onAnimationRepeat(Animator animator)
    {
    }

    public void onAnimationStart(Animator animator)
    {
    }

    private ()
    {
    }

    ( )
    {
        this();
    }
}
