// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import com.google.android.apps.moviemaker.ui.ProgressSpinner;

public final class dag extends AnimatorListenerAdapter
{

    private ProgressSpinner a;

    public dag(ProgressSpinner progressspinner)
    {
        a = progressspinner;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        ProgressSpinner.a(a, a.getIndeterminateDrawable().getLevel());
    }
}
