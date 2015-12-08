// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            aj

final class ag
{

    // Unreferenced inner class android/support/v4/view/ag$1

/* anonymous class */
    static final class _cls1 extends AnimatorListenerAdapter
    {

        final aj a;
        final View b;

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
                a = aj1;
                b = view;
                super();
            }
    }

}
