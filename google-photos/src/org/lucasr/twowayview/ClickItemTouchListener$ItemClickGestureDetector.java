// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.lucasr.twowayview;

import android.content.Context;
import android.view.MotionEvent;
import kp;

// Referenced classes of package org.lucasr.twowayview:
//            ClickItemTouchListener

class mGestureListener extends kp
{

    private final dispatchSingleTapUpIfNeeded mGestureListener;
    final ClickItemTouchListener this$0;

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag = super.onTouchEvent(motionevent);
        if ((motionevent.getAction() & 0xff) == 1)
        {
            mGestureListener.dispatchSingleTapUpIfNeeded(motionevent);
        }
        return flag;
    }

    public (Context context,  )
    {
        this$0 = ClickItemTouchListener.this;
        super(context, );
        mGestureListener = ;
    }
}
