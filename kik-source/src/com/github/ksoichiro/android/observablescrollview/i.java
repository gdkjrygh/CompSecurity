// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.view.MotionEvent;
import android.view.ViewGroup;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            ObservableScrollView

final class i
    implements Runnable
{

    final ViewGroup a;
    final MotionEvent b;
    final ObservableScrollView c;

    i(ObservableScrollView observablescrollview, ViewGroup viewgroup, MotionEvent motionevent)
    {
        c = observablescrollview;
        a = viewgroup;
        b = motionevent;
        super();
    }

    public final void run()
    {
        a.dispatchTouchEvent(b);
    }
}
