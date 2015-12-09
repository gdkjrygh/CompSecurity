// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.yume.android.player:
//            J, q

final class an
    implements android.view.View.OnTouchListener
{

    an()
    {
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view = J.e;
        if (view != null && ((q) (view)).a != null)
        {
            return ((q) (view)).a.onTouchEvent(motionevent);
        } else
        {
            return true;
        }
    }
}
