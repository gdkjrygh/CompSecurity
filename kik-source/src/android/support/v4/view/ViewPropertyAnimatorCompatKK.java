// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

// Referenced classes of package android.support.v4.view:
//            ViewPropertyAnimatorUpdateListener

class ViewPropertyAnimatorCompatKK
{

    ViewPropertyAnimatorCompatKK()
    {
    }

    public static void setUpdateListener(final View view, final ViewPropertyAnimatorUpdateListener listener)
    {
        view.animate().setUpdateListener(new _cls1());
    }

    private class _cls1
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        final ViewPropertyAnimatorUpdateListener val$listener;
        final View val$view;

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            listener.onAnimationUpdate(view);
        }

        _cls1()
        {
            listener = viewpropertyanimatorupdatelistener;
            view = view1;
            super();
        }
    }

}
