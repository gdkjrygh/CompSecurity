// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonHoneycombMr1

class this._cls0 extends AnimatorListenerAdapter
{

    final FloatingActionButtonHoneycombMr1 this$0;

    public void onAnimationCancel(Animator animator)
    {
        FloatingActionButtonHoneycombMr1.access$002(FloatingActionButtonHoneycombMr1.this, false);
    }

    public void onAnimationEnd(Animator animator)
    {
        FloatingActionButtonHoneycombMr1.access$002(FloatingActionButtonHoneycombMr1.this, false);
        mView.setVisibility(8);
    }

    public void onAnimationStart(Animator animator)
    {
        FloatingActionButtonHoneycombMr1.access$002(FloatingActionButtonHoneycombMr1.this, true);
    }

    ()
    {
        this$0 = FloatingActionButtonHoneycombMr1.this;
        super();
    }
}
