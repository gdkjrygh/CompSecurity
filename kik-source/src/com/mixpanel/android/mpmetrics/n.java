// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.mixpanel.android.mpmetrics:
//            m, k

final class n
    implements android.view.View.OnTouchListener
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        return k.d(a.a).onTouchEvent(motionevent);
    }
}
