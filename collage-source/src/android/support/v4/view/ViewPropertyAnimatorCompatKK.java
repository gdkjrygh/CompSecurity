// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorUpdateListener

class ViewPropertyAnimatorCompatKK
{

    ViewPropertyAnimatorCompatKK()
    {
    }

    public static void setUpdateListener(View view, ViewPropertyAnimatorUpdateListener viewpropertyanimatorupdatelistener)
    {
        android.animation.ValueAnimator.AnimatorUpdateListener animatorupdatelistener = null;
        if (viewpropertyanimatorupdatelistener != null)
        {
            animatorupdatelistener = new android.animation.ValueAnimator.AnimatorUpdateListener(viewpropertyanimatorupdatelistener, view) {

                final ViewPropertyAnimatorUpdateListener val$listener;
                final View val$view;

                public void onAnimationUpdate(ValueAnimator valueanimator)
                {
                    listener.onAnimationUpdate(view);
                }

            
            {
                listener = viewpropertyanimatorupdatelistener;
                view = view1;
                super();
            }
            };
        }
        view.animate().setUpdateListener(animatorupdatelistener);
    }
}
