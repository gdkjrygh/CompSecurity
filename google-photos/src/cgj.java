// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cgj extends AnimatorListenerAdapter
{

    private PlayerScreenFragment a;

    public cgj(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
        PlayerScreenFragment.d(a, false);
    }

    public final void onAnimationEnd(Animator animator)
    {
        PlayerScreenFragment.d(a, false);
    }
}
