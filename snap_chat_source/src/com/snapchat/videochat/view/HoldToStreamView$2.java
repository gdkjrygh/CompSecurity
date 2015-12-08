// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.videochat.view;

import android.view.MotionEvent;

// Referenced classes of package com.snapchat.videochat.view:
//            HoldToStreamView

final class tener extends android.view.pleOnGestureListener
{

    private HoldToStreamView a;

    public final boolean onDoubleTap(MotionEvent motionevent)
    {
        if (HoldToStreamView.j(a))
        {
            return true;
        }
        if (HoldToStreamView.k(a) == 2)
        {
            HoldToStreamView.a(a, 1);
        } else
        {
            HoldToStreamView.a(a, 2);
        }
        HoldToStreamView.l(a);
        return true;
    }

    tener(HoldToStreamView holdtostreamview)
    {
        a = holdtostreamview;
        super();
    }
}
