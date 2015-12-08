// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ld

final class lh
    implements android.view.View.OnTouchListener
{

    final ld a;

    lh(ld ld1)
    {
        a = ld1;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        a.b();
        return true;
    }
}
