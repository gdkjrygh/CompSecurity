// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.inappmessage.listeners;

import android.view.MotionEvent;
import android.view.View;

// Referenced classes of package com.appboy.ui.inappmessage.listeners:
//            SwipeDismissTouchListener

public class TouchAwareSwipeDismissTouchListener extends SwipeDismissTouchListener
{
    public static interface ITouchListener
    {

        public abstract void onTouchEnded();

        public abstract void onTouchStartedOrContinued();
    }


    private ITouchListener mTouchListener;

    public TouchAwareSwipeDismissTouchListener(View view, Object obj, SwipeDismissTouchListener.DismissCallbacks dismisscallbacks)
    {
        super(view, obj, dismisscallbacks);
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 36
    //                   0 43
    //                   1 62
    //                   2 36
    //                   3 62;
           goto _L1 _L2 _L3 _L1 _L3
_L1:
        return super.onTouch(view, motionevent);
_L2:
        if (mTouchListener != null)
        {
            mTouchListener.onTouchStartedOrContinued();
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (mTouchListener != null)
        {
            mTouchListener.onTouchEnded();
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void setTouchListener(ITouchListener itouchlistener)
    {
        mTouchListener = itouchlistener;
    }
}
