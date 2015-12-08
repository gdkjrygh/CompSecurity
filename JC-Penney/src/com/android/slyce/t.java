// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce;

import android.view.MotionEvent;
import android.view.View;
import com.android.slyce.e.a;

// Referenced classes of package com.android.slyce:
//            k, l

class t
    implements android.view.View.OnTouchListener
{

    final k a;

    private t(k k1)
    {
        a = k1;
        super();
    }

    t(k k1, l l)
    {
        this(k1);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 0)
        {
            float f = motionevent.getX();
            float f1 = motionevent.getY();
            k.e(a).a(f, f1);
            com.android.slyce.k.a(a, true, f, f1);
            return true;
        } else
        {
            return false;
        }
    }
}
