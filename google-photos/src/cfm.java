// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfm extends AnimatorListenerAdapter
{

    private PlayerScreenFragment a;

    public cfm(PlayerScreenFragment playerscreenfragment)
    {
        a = playerscreenfragment;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        PlayerScreenFragment.a(a, false);
    }
}
