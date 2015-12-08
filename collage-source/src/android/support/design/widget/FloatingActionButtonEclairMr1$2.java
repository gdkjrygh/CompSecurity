// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.view.animation.Animation;

// Referenced classes of package android.support.design.widget:
//            FloatingActionButtonEclairMr1

class Adapter extends Adapter
{

    final FloatingActionButtonEclairMr1 this$0;
    final lVisibilityChangedListener val$listener;

    public void onAnimationEnd(Animation animation)
    {
        if (val$listener != null)
        {
            val$listener.onShown();
        }
    }

    lVisibilityChangedListener()
    {
        this$0 = final_floatingactionbuttoneclairmr1;
        val$listener = lVisibilityChangedListener.this;
        super();
    }
}
