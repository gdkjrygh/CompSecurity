// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.view.MotionEvent;
import android.view.View;
import kik.android.e.c;

// Referenced classes of package kik.android.chat.fragment:
//            CameraFragment

final class z
    implements android.view.View.OnTouchListener
{

    final CameraFragment a;

    z(CameraFragment camerafragment)
    {
        a = camerafragment;
        super();
    }

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        CameraFragment.r(a).a(motionevent);
        return true;
    }
}
