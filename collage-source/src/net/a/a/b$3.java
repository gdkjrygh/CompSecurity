// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.a.a;

import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;

// Referenced classes of package net.a.a:
//            b

class ject
    implements android.view..OnTouchListener
{

    final b a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0 && a.b.isShowing())
        {
            a.c();
            return true;
        } else
        {
            return false;
        }
    }

    (b b1)
    {
        a = b1;
        super();
    }
}
