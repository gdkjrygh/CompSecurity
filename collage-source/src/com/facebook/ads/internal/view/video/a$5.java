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
    final a b;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 && a.getVideoURI() != null)
        {
            com.facebook.ads.internal.view.video.a.e(b);
            return true;
        } else
        {
            return false;
        }
    }

    (a a1, a a2)
    {
        b = a1;
        a = a2;
        super();
    }
}
