// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonHoneycombMr1

class sibilityChangedListener extends AnimatorListenerAdapter
{

    final FloatingActionButtonHoneycombMr1 this$0;
    final sibilityChangedListener val$listener;

    public void onAnimationCancel(Animator animator)
    {
        FloatingActionButtonHoneycombMr1.access$002(FloatingActionButtonHoneycombMr1.this, false);
    }

    public void onAnimationEnd(Animator animator)
    {
        FloatingActionButtonHoneycombMr1.access$002(FloatingActionButtonHoneycombMr1.this, false);
        mView.setVisibility(8);
        if (val$listener != null)
        {
            val$listener.onHidden();
        }
    }

    public void onAnimationStart(Animator animator)
    {
        FloatingActionButtonHoneycombMr1.access$002(FloatingActionButtonHoneycombMr1.this, true);
        mView.setVisibility(0);
    }

    sibilityChangedListener()
    {
        this$0 = final_floatingactionbuttonhoneycombmr1;
        val$listener = sibilityChangedListener.this;
        super();
    }
}
