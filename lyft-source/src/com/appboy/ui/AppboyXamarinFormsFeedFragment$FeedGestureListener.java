// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui;

import android.view.MotionEvent;
import android.widget.ListView;

// Referenced classes of package com.appboy.ui:
//            AppboyXamarinFormsFeedFragment

public class this._cls0 extends android.view.
{

    final AppboyXamarinFormsFeedFragment this$0;

    public boolean onDown(MotionEvent motionevent)
    {
        return true;
    }

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        long l = (motionevent1.getEventTime() - motionevent.getEventTime()) * 2L;
        int i = (int)(((float)l * f1) / 1000F);
        getListView().smoothScrollBy(-i, (int)(l * 2L));
        return true;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        getListView().smoothScrollBy((int)f1, 0);
        return true;
    }

    public ()
    {
        this$0 = AppboyXamarinFormsFeedFragment.this;
        super();
    }
}
