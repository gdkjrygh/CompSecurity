// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class ins extends AnimatorListenerAdapter
{

    private View a;

    ins(inl inl, View view)
    {
        a = view;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        a.setVisibility(8);
    }
}
