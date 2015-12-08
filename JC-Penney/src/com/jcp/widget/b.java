// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.view.MotionEvent;
import android.view.View;
import com.jcp.views.ScrollViewWithStopMonitor;

// Referenced classes of package com.jcp.widget:
//            BackToTopButton

class b
    implements android.view.View.OnTouchListener
{

    final ScrollViewWithStopMonitor a;
    final BackToTopButton b;

    b(BackToTopButton backtotopbutton, ScrollViewWithStopMonitor scrollviewwithstopmonitor)
    {
        b = backtotopbutton;
        a = scrollviewwithstopmonitor;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            a.a();
        }
        return false;
    }
}
