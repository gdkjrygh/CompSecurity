// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewOverlay;

final class orj extends AnimatorListenerAdapter
{

    private orh a;
    private ori b;

    orj(ori ori1, orh orh)
    {
        b = ori1;
        a = orh;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        b.a.remove(a);
    }
}
