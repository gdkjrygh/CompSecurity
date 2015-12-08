// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class inu extends AnimatorListenerAdapter
{

    private View a;
    private inl b;

    inu(inl inl1, View view)
    {
        b = inl1;
        a = view;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(4);
        a.setTranslationY(0.0F);
        inl.c(b, false);
    }
}
