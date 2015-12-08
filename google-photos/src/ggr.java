// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ListView;

final class ggr extends AnimatorListenerAdapter
{

    private ggp a;

    ggr(ggp ggp1)
    {
        a = ggp1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        ggp.a(a, null);
        if (!ggp.d(a))
        {
            ggp.e(a).setVisibility(8);
        }
    }
}
