// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            PGShareActivity

final class aw
    implements android.view.View.OnTouchListener
{

    final PGShareActivity a;

    aw(PGShareActivity pgshareactivity)
    {
        a = pgshareactivity;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.e();
        a.d();
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
