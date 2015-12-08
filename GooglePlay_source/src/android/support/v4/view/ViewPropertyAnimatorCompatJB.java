// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorListener

final class ViewPropertyAnimatorCompatJB
{

    // Unreferenced inner class android/support/v4/view/ViewPropertyAnimatorCompatJB$1

/* anonymous class */
    static final class _cls1 extends AnimatorListenerAdapter
    {

        final ViewPropertyAnimatorListener val$listener;
        final View val$view;

        public final void onAnimationCancel(Animator animator)
        {
            listener.onAnimationCancel(view);
        }

        public final void onAnimationEnd(Animator animator)
        {
            listener.onAnimationEnd(view);
        }

        public final void onAnimationStart(Animator animator)
        {
            listener.onAnimationStart(view);
        }

            
            {
                listener = viewpropertyanimatorlistener;
                view = view1;
                super();
            }
    }

}
