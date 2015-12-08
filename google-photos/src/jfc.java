// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.FrameLayout;

final class jfc extends AnimatorListenerAdapter
{

    private jev a;

    jfc(jev jev1)
    {
        a = jev1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        jev.j(a).setVisibility(8);
        jev.j(a).setAlpha(1.0F);
    }
}
