// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewPropertyAnimator;
import java.util.List;

final class hcg extends AnimatorListenerAdapter
{

    private hci a;
    private ViewPropertyAnimator b;
    private hce c;

    hcg(hce hce1, hci hci1, ViewPropertyAnimator viewpropertyanimator)
    {
        c = hce1;
        a = hci1;
        b = viewpropertyanimator;
        super();
    }

    public final void onAnimationCancel(Animator animator)
    {
        animator = c;
        hce.a(a);
    }

    public final void onAnimationEnd(Animator animator)
    {
        b.setListener(null);
        a.b();
        c.b.remove(a.a);
        c.c();
    }

    public final void onAnimationStart(Animator animator)
    {
    }
}
