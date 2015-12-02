// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.orca.threadview:
//            dq

class ds
    implements android.view.View.OnTouchListener
{

    final dq a;

    ds(dq dq1)
    {
        a = dq1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return dq.a(a).onTouchEvent(motionevent);
    }
}
