// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid:
//            ba

final class be
    implements android.view.View.OnTouchListener
{

    final ba a;

    be(ba ba1)
    {
        a = ba1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.a();
        return true;
    }
}
