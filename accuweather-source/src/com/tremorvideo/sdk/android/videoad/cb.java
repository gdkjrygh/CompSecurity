// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tremorvideo.sdk.android.videoad;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.tremorvideo.sdk.android.videoad:
//            bz

class cb
    implements android.view.View.OnTouchListener
{

    final bz a;
    final bz.b b;

    cb(bz.b b1, bz bz)
    {
        b = b1;
        a = bz;
        super();
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            b.c = false;
        } else
        {
            b.c = true;
        }
        view.invalidate();
        return false;
    }
}
