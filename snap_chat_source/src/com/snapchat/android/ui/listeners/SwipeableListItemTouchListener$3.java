// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableListItemTouchListener

final class a
    implements android.animation.ner
{

    private View a;
    private SwipeableListItemTouchListener b;

    public final void onAnimationUpdate(ValueAnimator valueanimator)
    {
        SwipeableListItemTouchListener.a(b, ((Integer)valueanimator.getAnimatedValue()).intValue());
        SwipeableListItemTouchListener.b(b).b(b.b);
        SwipeableListItemTouchListener.b(b).a(a, SwipeableListItemTouchListener.c(b));
    }

    (SwipeableListItemTouchListener swipeablelistitemtouchlistener, View view)
    {
        b = swipeablelistitemtouchlistener;
        a = view;
        super();
    }
}
