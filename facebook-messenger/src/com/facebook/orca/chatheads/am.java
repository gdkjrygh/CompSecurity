// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.orca.chatheads:
//            al

class am
    implements android.view.View.OnTouchListener
{

    final al a;

    am(al al1)
    {
        a = al1;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (al.a(a))
        {
            return false;
        }
        if (motionevent.getAction() == 0)
        {
            al.b(a);
        }
        return al.a(a, motionevent);
    }
}
