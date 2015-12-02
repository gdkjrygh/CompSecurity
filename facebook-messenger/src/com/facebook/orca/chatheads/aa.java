// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.view.MotionEvent;

// Referenced classes of package com.facebook.orca.chatheads:
//            v, w

class aa extends android.view.GestureDetector.SimpleOnGestureListener
{

    final v a;
    private boolean b;

    private aa(v v1)
    {
        a = v1;
        super();
    }

    aa(v v1, w w)
    {
        this(v1);
    }

    public boolean onDown(MotionEvent motionevent)
    {
        v.c(a);
        b = false;
        v.a(a, 1.0D);
        return false;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (!b)
        {
            b = true;
            v.a(a, 0.0D);
        }
        return false;
    }
}
