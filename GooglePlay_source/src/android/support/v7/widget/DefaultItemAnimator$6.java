// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v4.view.ViewCompat;
import android.support.v4.view.ViewPropertyAnimatorCompat;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

final class aListenerAdapter extends aListenerAdapter
{

    final DefaultItemAnimator this$0;
    final ViewPropertyAnimatorCompat val$animation;
    final int val$deltaX;
    final int val$deltaY;
    final r val$holder;

    public final void onAnimationCancel(View view)
    {
        if (val$deltaX != 0)
        {
            ViewCompat.setTranslationX(view, 0.0F);
        }
        if (val$deltaY != 0)
        {
            ViewCompat.setTranslationY(view, 0.0F);
        }
    }

    public final void onAnimationEnd(View view)
    {
        val$animation.setListener(null);
        dispatchMoveFinished(val$holder);
        mMoveAnimations.remove(val$holder);
        dispatchFinishedWhenDone();
    }

    public final void onAnimationStart(View view)
    {
    }

    at()
    {
        this$0 = final_defaultitemanimator;
        val$holder = r;
        val$deltaX = i;
        val$deltaY = j;
        val$animation = ViewPropertyAnimatorCompat.this;
        super((byte)0);
    }
}
