// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class hca extends AnimatorListenerAdapter
{

    private fqw a;
    private View b;

    hca(hbx hbx, fqw fqw1, View view)
    {
        a = fqw1;
        b = view;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        if (a.e())
        {
            b.setBackgroundDrawable(null);
        }
    }
}
