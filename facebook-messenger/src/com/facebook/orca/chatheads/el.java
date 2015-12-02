// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.orca.chatheads:
//            ek

class el
    implements android.view.View.OnTouchListener
{

    final ek a;

    el(ek ek1)
    {
        a = ek1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        return ek.a(a, motionevent);
    }
}
