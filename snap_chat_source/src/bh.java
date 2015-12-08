// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

final class bh
{

    // Unreferenced inner class bh$1

/* anonymous class */
    static final class _cls1 extends AnimatorListenerAdapter
    {

        private bi a;
        private View b;

        public final void onAnimationCancel(Animator animator)
        {
            a.c(b);
        }

        public final void onAnimationEnd(Animator animator)
        {
            a.b(b);
        }

        public final void onAnimationStart(Animator animator)
        {
            a.a(b);
        }

            
            {
                a = bi1;
                b = view;
                super();
            }
    }

}
