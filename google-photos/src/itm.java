// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class itm extends AnimatorListenerAdapter
{

    private View a;
    private View b;

    itm(itf itf, View view, View view1)
    {
        a = view;
        b = view1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        super.onAnimationEnd(animator);
        a.setVisibility(8);
        b.setVisibility(8);
    }
}
