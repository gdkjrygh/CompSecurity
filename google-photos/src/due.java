// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

public final class due extends AnimatorListenerAdapter
{

    private View a;

    public due(View view)
    {
        a = view;
    }

    public final void onAnimationStart(Animator animator)
    {
        a.setVisibility(0);
    }
}
