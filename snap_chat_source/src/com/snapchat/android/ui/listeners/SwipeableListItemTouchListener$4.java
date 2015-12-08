// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui.listeners;

import android.animation.Animator;
import android.view.View;

// Referenced classes of package com.snapchat.android.ui.listeners:
//            SwipeableListItemTouchListener

final class b
    implements android.animation.TouchListener._cls4
{

    private View a;
    private boolean b;
    private SwipeableListItemTouchListener c;

    public final void onAnimationCancel(Animator animator)
    {
    }

    public final void onAnimationEnd(Animator animator)
    {
        int i = c.a(a);
        if (SwipeableListItemTouchListener.b(c) != null && i != -1)
        {
            SwipeableListItemTouchListener.b(c).a(a, i, b);
        }
    }

    public final void onAnimationRepeat(Animator animator)
    {
    }

    public final void onAnimationStart(Animator animator)
    {
    }

    (SwipeableListItemTouchListener swipeablelistitemtouchlistener, View view, boolean flag)
    {
        c = swipeablelistitemtouchlistener;
        a = view;
        b = flag;
        super();
    }
}
