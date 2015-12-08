// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            a, BlemishImageView

final class c
    implements android.view.View.OnTouchListener
{

    final View a;
    final a b;

    c(a a1, View view)
    {
        b = a1;
        a = view;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        if (com.roidapp.imagelib.retouch.a.e(b))
        {
            return true;
        }
        switch (motionevent.getAction())
        {
        case 2: // '\002'
        default:
            return true;

        case 0: // '\0'
            b.b.b(true);
            b.b.invalidate();
            a.setPressed(true);
            return true;

        case 1: // '\001'
        case 3: // '\003'
            b.b.b(false);
            break;
        }
        b.b.invalidate();
        a.setPressed(false);
        return true;
    }
}
