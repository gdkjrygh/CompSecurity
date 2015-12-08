// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class m
    implements android.view.View.OnTouchListener
{

    final CameraFragment a;

    m(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        view.onTouchEvent(motionevent);
        if (motionevent.getAction() == 1 || motionevent.getAction() == 3)
        {
            if (CameraFragment.n(a))
            {
                a.b();
            } else
            if (!CameraFragment.t(a))
            {
                a.c();
                return true;
            }
        }
        return true;
    }
}
