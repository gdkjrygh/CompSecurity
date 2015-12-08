// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.listview;

import android.app.Activity;
import android.view.MotionEvent;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.ui.listview:
//            DismissingOverscrollListView

class t> extends android.view.Listener
{

    private final int SWIPE_MAX_OFF_PATH = (int)(Device.getDensity() * 150F);
    private final int SWIPE_MIN_DISTANCE = (int)(Device.getDensity() * 120F);
    private final int SWIPE_THRESHOLD_VELOCITY = (int)(Device.getDensity() * 3000F);
    final DismissingOverscrollListView this$0;

    public boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        if (Math.abs(motionevent.getX() - motionevent1.getX()) > (float)SWIPE_MAX_OFF_PATH)
        {
            return false;
        }
        if (motionevent1.getY() - motionevent.getY() <= (float)SWIPE_MIN_DISTANCE || Math.abs(f1) <= (float)SWIPE_THRESHOLD_VELOCITY)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        motionevent = (Activity)getContext();
        if (motionevent == null)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        if (!DismissingOverscrollListView.access$100(DismissingOverscrollListView.this))
        {
            break MISSING_BLOCK_LABEL_87;
        }
        motionevent.onBackPressed();
        return false;
        motionevent;
        return false;
    }

    public boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f, float f1)
    {
        return super.onScroll(motionevent, motionevent1, f, f1);
    }

    ()
    {
        this$0 = DismissingOverscrollListView.this;
        super();
    }
}
