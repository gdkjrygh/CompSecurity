// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorUpdateListener

final class ViewPropertyAnimatorCompatKK
{

    // Unreferenced inner class android/support/v4/view/ViewPropertyAnimatorCompatKK$1

/* anonymous class */
    static final class _cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final ViewPropertyAnimatorUpdateListener val$listener;
        final View val$view;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            listener.onAnimationUpdate$3c7ec8c3();
        }

            
            {
                listener = viewpropertyanimatorupdatelistener;
                view = view1;
                super();
            }
    }

}
