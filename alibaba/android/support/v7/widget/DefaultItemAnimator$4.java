// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import ds;
import ei;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            DefaultItemAnimator

class aListenerAdapter extends aListenerAdapter
{

    final DefaultItemAnimator this$0;
    final ei val$animation;
    final r val$holder;

    public void onAnimationEnd(View view)
    {
        val$animation.a(null);
        ds.c(view, 1.0F);
        dispatchRemoveFinished(val$holder);
        DefaultItemAnimator.access$700(DefaultItemAnimator.this).remove(val$holder);
        DefaultItemAnimator.access$800(DefaultItemAnimator.this);
    }

    public void onAnimationStart(View view)
    {
        dispatchRemoveStarting(val$holder);
    }

    r()
    {
        this$0 = final_defaultitemanimator;
        val$holder = r;
        val$animation = ei.this;
        super(null);
    }
}
