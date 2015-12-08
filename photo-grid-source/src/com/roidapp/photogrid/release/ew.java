// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.roidapp.photogrid.release:
//            ev

final class ew
    implements android.view.View.OnTouchListener
{

    final ev a;

    ew(ev ev)
    {
        a = ev;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view.onTouchEvent(motionevent);
        return true;
    }
}
