// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.view.MotionEvent;

// Referenced classes of package com.skype.android.media:
//            CameraView

final class er extends android.view.or.SimpleOnGestureListener
{

    final CameraView a;

    public final boolean onSingleTapConfirmed(MotionEvent motionevent)
    {
        CameraView.access$100(a, motionevent);
        return true;
    }

    GestureListener(CameraView cameraview)
    {
        a = cameraview;
        super();
    }
}
