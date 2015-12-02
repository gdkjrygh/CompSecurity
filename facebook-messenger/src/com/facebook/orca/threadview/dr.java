// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.MotionEvent;

// Referenced classes of package com.facebook.orca.threadview:
//            dq

class dr extends android.view.GestureDetector.SimpleOnGestureListener
{

    final dq a;

    dr(dq dq1)
    {
        a = dq1;
        super();
    }

    public boolean onDoubleTap(MotionEvent motionevent)
    {
        return dq.a(a, motionevent);
    }
}
