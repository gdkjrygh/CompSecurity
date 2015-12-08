// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.ksoichiro.android.observablescrollview;

import android.view.MotionEvent;
import android.view.ViewGroup;

// Referenced classes of package com.github.ksoichiro.android.observablescrollview:
//            ObservableWebView

final class l
    implements Runnable
{

    final ViewGroup a;
    final MotionEvent b;
    final ObservableWebView c;

    l(ObservableWebView observablewebview, ViewGroup viewgroup, MotionEvent motionevent)
    {
        c = observablewebview;
        a = viewgroup;
        b = motionevent;
        super();
    }

    public final void run()
    {
        a.dispatchTouchEvent(b);
    }
}
