// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal.view.video;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.facebook.ads.internal.view.video:
//            a

class a
    implements android.view..OnTouchListener
{

    final a a;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1)
        {
            if (a(com.facebook.ads.internal.view.video.a.f(a)))
            {
                a.c();
                return true;
            } else
            {
                a.d();
                return true;
            }
        } else
        {
            return false;
        }
    }

    (a a1)
    {
        a = a1;
        super();
    }
}
