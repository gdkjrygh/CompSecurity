// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.SystemClock;
import android.support.v4.view.MotionEventCompat;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

public static abstract class mTapTimeout
    implements android.view.dingListener
{
    private final class DisallowIntercept
        implements Runnable
    {

        final ListPopupWindow.ForwardingListener this$0;

        public final void run()
        {
            mSrc.getParent().requestDisallowInterceptTouchEvent(true);
        }

        private DisallowIntercept()
        {
            this$0 = ListPopupWindow.ForwardingListener.this;
            super();
        }

        DisallowIntercept(byte byte0)
        {
            this();
        }
    }

    private final class TriggerLongPress
        implements Runnable
    {

        final ListPopupWindow.ForwardingListener this$0;

        public final void run()
        {
            clearCallbacks();
        }

        private TriggerLongPress()
        {
            this$0 = ListPopupWindow.ForwardingListener.this;
            super();
        }

        TriggerLongPress(byte byte0)
        {
            this();
        }
    }


    private int mActivePointerId;
    private Runnable mDisallowIntercept;
    private boolean mForwarding;
    private final int mLongPressTimeout;
    private final float mScaledTouchSlop;
    private final View mSrc;
    private final int mTapTimeout = ViewConfiguration.getTapTimeout();
    private final int mTmpLocation[] = new int[2];
    private Runnable mTriggerLongPress;
    private boolean mWasLongPress;

    private void clearCallbacks()
    {
        if (mTriggerLongPress != null)
        {
            mSrc.removeCallbacks(mTriggerLongPress);
        }
        if (mDisallowIntercept != null)
        {
            mSrc.removeCallbacks(mDisallowIntercept);
        }
    }

    private boolean onTouchForwarded(MotionEvent motionevent)
    {
        boolean flag1 = true;
        View view = mSrc;
        Object obj = getPopup();
        if (obj == null || !((ListPopupWindow) (obj)).mPopup.isShowing())
        {
            flag1 = false;
        } else
        {
            obj = ListPopupWindow.access$600(((ListPopupWindow) (obj)));
            if (obj == null || !((getPopup) (obj)).Shown())
            {
                return false;
            }
            MotionEvent motionevent1 = MotionEvent.obtainNoHistory(motionevent);
            int ai1[] = mTmpLocation;
            view.getLocationOnScreen(ai1);
            motionevent1.offsetLocation(ai1[0], ai1[1]);
            int ai[] = mTmpLocation;
            ((View) (obj)).getLocationOnScreen(ai);
            motionevent1.offsetLocation(-ai[0], -ai[1]);
            boolean flag2 = ((mTmpLocation) (obj)).ForwardedEvent(motionevent1, mActivePointerId);
            motionevent1.recycle();
            int i = MotionEventCompat.getActionMasked(motionevent);
            boolean flag;
            if (i != 1 && i != 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (!flag2 || !flag)
            {
                return false;
            }
        }
        return flag1;
    }

    public abstract ListPopupWindow getPopup();

    public boolean onForwardingStarted()
    {
        ListPopupWindow listpopupwindow = getPopup();
        if (listpopupwindow != null && !listpopupwindow.mPopup.isShowing())
        {
            listpopupwindow.show();
        }
        return true;
    }

    public boolean onForwardingStopped()
    {
        ListPopupWindow listpopupwindow = getPopup();
        if (listpopupwindow != null && listpopupwindow.mPopup.isShowing())
        {
            listpopupwindow.dismiss();
        }
        return true;
    }

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        boolean flag2 = mForwarding;
        if (!flag2) goto _L2; else goto _L1
_L1:
        boolean flag;
        if (mWasLongPress)
        {
            flag = onTouchForwarded(motionevent);
        } else
        if (onTouchForwarded(motionevent) || !onForwardingStopped())
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L9:
        mForwarding = flag;
        float f;
        float f1;
        float f2;
        int i;
        long l;
        boolean flag1;
        return flag || flag2;
_L2:
        view = mSrc;
        if (!view.isEnabled()) goto _L4; else goto _L3
_L3:
        MotionEventCompat.getActionMasked(motionevent);
        JVM INSTR tableswitch 0 3: default 116
    //                   0 180
    //                   1 389
    //                   2 265
    //                   3 389;
           goto _L5 _L6 _L7 _L8 _L7
_L5:
        break; /* Loop/switch isn't completed */
_L7:
        break MISSING_BLOCK_LABEL_389;
_L4:
        i = 0;
_L12:
        if (i != 0 && onForwardingStarted())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        flag = flag1;
        if (flag1)
        {
            l = SystemClock.uptimeMillis();
            view = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
            mSrc.onTouchEvent(view);
            view.recycle();
            flag = flag1;
        }
          goto _L9
_L6:
        mActivePointerId = motionevent.getPointerId(0);
        mWasLongPress = false;
        if (mDisallowIntercept == null)
        {
            mDisallowIntercept = new DisallowIntercept((byte)0);
        }
        view.postDelayed(mDisallowIntercept, mTapTimeout);
        if (mTriggerLongPress == null)
        {
            mTriggerLongPress = new TriggerLongPress((byte)0);
        }
        view.postDelayed(mTriggerLongPress, mLongPressTimeout);
          goto _L4
_L8:
        i = motionevent.findPointerIndex(mActivePointerId);
        if (i < 0) goto _L4; else goto _L10
_L10:
        f = motionevent.getX(i);
        f1 = motionevent.getY(i);
        f2 = mScaledTouchSlop;
        if (f >= -f2 && f1 >= -f2 && f < (float)(view.getRight() - view.getLeft()) + f2 && f1 < (float)(view.getBottom() - view.getTop()) + f2)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (i != 0) goto _L4; else goto _L11
_L11:
        clearCallbacks();
        view.getParent().requestDisallowInterceptTouchEvent(true);
        i = 1;
          goto _L12
        clearCallbacks();
          goto _L4
    }


/*
    static void access$1000(TriggerLongPress triggerlongpress)
    {
        triggerlongpress.clearCallbacks();
        View view;
        for (view = triggerlongpress.mSrc; !view.isEnabled() || view.isLongClickable() || !triggerlongpress.onForwardingStarted();)
        {
            return;
        }

        view.getParent().requestDisallowInterceptTouchEvent(true);
        long l = SystemClock.uptimeMillis();
        MotionEvent motionevent = MotionEvent.obtain(l, l, 3, 0.0F, 0.0F, 0);
        view.onTouchEvent(motionevent);
        motionevent.recycle();
        triggerlongpress.mForwarding = true;
        triggerlongpress.mWasLongPress = true;
        return;
    }

*/


    public TriggerLongPress(View view)
    {
        mSrc = view;
        mScaledTouchSlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        mLongPressTimeout = (mTapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }
}
