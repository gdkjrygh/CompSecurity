// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.video;

import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.google.android.gms.games.ui.video:
//            ScreenCaptureOverlay

final class atarGestureListener
    implements android.view.o.ScreenCaptureOverlay._cls4
{

    final ScreenCaptureOverlay this$0;
    final GestureDetector val$gestureDetector;
    final atarGestureListener val$gestureListener;

    public final boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        if (ScreenCaptureOverlay.access$000(ScreenCaptureOverlay.this) == 0)
        {
            return false;
        }
        flag1 = val$gestureDetector.onTouchEvent(motionevent);
        flag = flag1;
        if (flag1) goto _L2; else goto _L1
_L1:
        flag = flag1;
        if (motionevent.getAction() != 1) goto _L2; else goto _L3
_L3:
        view = val$gestureListener;
        if (ScreenCaptureOverlay.access$000(((atarGestureListener) (view))._fld0) != 1 && ScreenCaptureOverlay.access$000(((atarGestureListener) (view))._fld0) != 2 && ScreenCaptureOverlay.access$000(((atarGestureListener) (view))._fld0) != 3) goto _L5; else goto _L4
_L4:
        view.updateRects();
        if (ScreenCaptureOverlay.access$000(((atarGestureListener) (view))._fld0) != 1 || !((atarGestureListener) (view)).mRectAvatar.intersect(((atarGestureListener) (view)).mRectDismiss)) goto _L7; else goto _L6
_L6:
        ((atarGestureListener) (view))._fld0.dismissOverlay(true);
        flag = true;
_L2:
        return flag;
_L7:
        motionevent = (android.view.ams)ScreenCaptureOverlay.access$1600(((atarGestureListener) (view))._fld0).getLayoutParams();
        ((atarGestureListener) (view))._fld0.savePosition(ScreenCaptureOverlay.access$1900(((atarGestureListener) (view))._fld0), ((android.view.ams) (motionevent)).x, ((android.view.ams) (motionevent)).y);
        ScreenCaptureOverlay.access$2000(((atarGestureListener) (view))._fld0);
        if (((atarGestureListener) (view)).mShouldShowControlsAfterScroll)
        {
            ScreenCaptureOverlay.access$1100(((atarGestureListener) (view))._fld0, ((atarGestureListener) (view)).mAvatarGroupParams, true);
            flag = true;
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = false;
        if (true) goto _L2; else goto _L8
_L8:
    }

    atarGestureListener()
    {
        this$0 = final_screencaptureoverlay;
        val$gestureDetector = gesturedetector;
        val$gestureListener = atarGestureListener.this;
        super();
    }
}
