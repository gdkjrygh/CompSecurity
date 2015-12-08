// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.MotionEvent;
import android.widget.ListView;

// Referenced classes of package com.appboy.ui:
//            AppboyFeedFragment

public final class h extends android.view.GestureDetector.SimpleOnGestureListener
{

    final AppboyFeedFragment a;

    public h(AppboyFeedFragment appboyfeedfragment)
    {
        a = appboyfeedfragment;
        super();
    }

    public final boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        long l = (motionevent1.getEventTime() - motionevent.getEventTime()) * 2L;
        int i = (int)(((float)l * f1) / 1000F);
        a.b().smoothScrollBy(-i, (int)(l * 2L));
        return true;
    }

    public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        a.b().smoothScrollBy((int)f1, 0);
        return true;
    }
}
