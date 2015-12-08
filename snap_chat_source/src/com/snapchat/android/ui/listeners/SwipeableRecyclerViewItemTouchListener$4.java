// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.animation.ValueAnimator;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableRecyclerViewItemTouchListener

final class a
    implements android.animation.TouchListener._cls4
{

    private Integer a;
    private SwipeableRecyclerViewItemTouchListener b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        float f1 = 1.0F;
        android.support.v7.widget.tener tener = SwipeableRecyclerViewItemTouchListener.a(b).c(a.intValue());
        if (tener != null)
        {
            SwipeableRecyclerViewItemTouchListener.a(b, ((Integer)valueanimator.getAnimatedValue()).intValue());
            int i = SwipeableRecyclerViewItemTouchListener.e(b).a(tener);
            float f2 = -SwipeableRecyclerViewItemTouchListener.f(b) / (float)i;
            float f = f2;
            if (f2 < 0.0F)
            {
                f = 0.0F;
            }
            if (f > 1.0F)
            {
                f = f1;
            }
            SwipeableRecyclerViewItemTouchListener.e(b).a(tener, SwipeableRecyclerViewItemTouchListener.f(b), f, SwipeableRecyclerViewItemTouchListener.g(b), SwipeableRecyclerViewItemTouchListener.h(b));
        }
    }

    (SwipeableRecyclerViewItemTouchListener swipeablerecyclerviewitemtouchlistener, Integer integer)
    {
        b = swipeablerecyclerviewitemtouchlistener;
        a = integer;
        super();
    }
}
