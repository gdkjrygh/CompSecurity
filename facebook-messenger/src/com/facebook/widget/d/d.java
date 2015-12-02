// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.d;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package com.facebook.widget.d:
//            c

class d
    implements android.view.View.OnTouchListener
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 4)
        {
            c.a(a).dismiss();
            return true;
        } else
        {
            return false;
        }
    }
}
