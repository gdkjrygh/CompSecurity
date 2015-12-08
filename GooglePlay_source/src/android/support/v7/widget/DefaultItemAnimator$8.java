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
    final angeInfo val$changeInfo;
    final View val$newView;
    final ViewPropertyAnimatorCompat val$newViewAnimation;

    public final void onAnimationEnd(View view)
    {
        val$newViewAnimation.setListener(null);
        ViewCompat.setAlpha(val$newView, 1.0F);
        ViewCompat.setTranslationX(val$newView, 0.0F);
        ViewCompat.setTranslationY(val$newView, 0.0F);
        dispatchChangeFinished$763f3adc(val$changeInfo.newHolder);
        mChangeAnimations.remove(val$changeInfo.newHolder);
        dispatchFinishedWhenDone();
    }

    public final void onAnimationStart(View view)
    {
    }

    at()
    {
        this$0 = final_defaultitemanimator;
        val$changeInfo = angeinfo;
        val$newViewAnimation = viewpropertyanimatorcompat;
        val$newView = View.this;
        super((byte)0);
    }
}
