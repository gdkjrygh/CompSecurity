// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.mpmetrics;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.android.slyce.report.mpmetrics:
//            s, q

class t
    implements android.view.View.OnTouchListener
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return q.d(a.a).onTouchEvent(motionevent);
    }
}
