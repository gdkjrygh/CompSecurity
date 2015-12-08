// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            br, BaseShareActivity

final class bs
    implements android.view.View.OnTouchListener
{

    final br a;

    bs(br br1)
    {
        a = br1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        br.c(a).j();
        br.c(a).k();
        view.getParent().requestDisallowInterceptTouchEvent(true);
        return false;
    }
}
