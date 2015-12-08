// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.associates;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.amazon.device.associates:
//            a, bq

class a
    implements android.view..OnTouchListener
{

    final a a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (com.amazon.device.associates.a.a(a) == null || com.amazon.device.associates.a.a(a).trim().equals(""))
        {
            return false;
        }
        if (motionevent.getAction() == 0)
        {
            bq.d(com.amazon.device.associates.a.a(a));
        }
        return true;
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
