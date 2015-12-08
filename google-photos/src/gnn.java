// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class gnn extends AnimatorListenerAdapter
{

    private gnk a;

    gnn(gnk gnk1)
    {
        a = gnk1;
        super();
    }

    public final void onAnimationEnd(Animator animator)
    {
        gnk.a(a, false);
        if (gnk.d(a) != null)
        {
            gnk.d(a).d();
        }
    }

    public final void onAnimationStart(Animator animator)
    {
        gnk.a(a, true);
        gnk.c(a).setBackgroundColor(0xff000000);
        if (gnk.d(a) != null)
        {
            gnk.d(a).c();
        }
    }
}
