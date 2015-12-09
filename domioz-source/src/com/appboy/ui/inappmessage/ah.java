// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage;

import android.view.MotionEvent;

// Referenced classes of package com.appboy.ui.inappmessage:
//            ag

final class ah extends android.view.GestureDetector.SimpleOnGestureListener
{

    final ag a;

    private ah(ag ag1)
    {
        a = ag1;
        super();
    }

    ah(ag ag1, byte byte0)
    {
        this(ag1);
    }

    public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        f1 = motionevent1.getX() - motionevent.getX();
        float f2 = motionevent1.getY();
        float f3 = motionevent.getY();
        if (Math.abs(f1) > Math.abs(f2 - f3) && Math.abs(f1) > 120F && Math.abs(f) > 90F)
        {
            if (f1 > 0.0F)
            {
                a.b();
            } else
            {
                a.a();
            }
            return true;
        } else
        {
            return false;
        }
    }
}
