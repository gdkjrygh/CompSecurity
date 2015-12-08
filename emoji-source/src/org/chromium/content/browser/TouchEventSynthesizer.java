// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.view.MotionEvent;

// Referenced classes of package org.chromium.content.browser:
//            ContentViewCore, RenderCoordinates

public class TouchEventSynthesizer
{

    static final boolean $assertionsDisabled;
    private static final int ACTION_CANCEL = 2;
    private static final int ACTION_END = 3;
    private static final int ACTION_MOVE = 1;
    private static final int ACTION_START = 0;
    private static final int MAX_NUM_POINTERS = 16;
    private final ContentViewCore mContentViewCore;
    private long mDownTimeInMs;
    private final android.view.MotionEvent.PointerCoords mPointerCoords[] = new android.view.MotionEvent.PointerCoords[16];
    private final android.view.MotionEvent.PointerProperties mPointerProperties[] = new android.view.MotionEvent.PointerProperties[16];

    TouchEventSynthesizer(ContentViewCore contentviewcore)
    {
        mContentViewCore = contentviewcore;
    }

    void inject(int i, int j, long l)
    {
        i;
        JVM INSTR tableswitch 0 3: default 32
    //                   0 33
    //                   1 130
    //                   2 174
    //                   3 218;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return;
_L2:
        mDownTimeInMs = l;
        MotionEvent motionevent = MotionEvent.obtain(mDownTimeInMs, l, 0, 1, mPointerProperties, mPointerCoords, 0, 0, 1.0F, 1.0F, 0, 0, 0, 0);
        mContentViewCore.onTouchEvent(motionevent);
        motionevent.recycle();
        if (j > 1)
        {
            MotionEvent motionevent1 = MotionEvent.obtain(mDownTimeInMs, l, 5, j, mPointerProperties, mPointerCoords, 0, 0, 1.0F, 1.0F, 0, 0, 0, 0);
            mContentViewCore.onTouchEvent(motionevent1);
            motionevent1.recycle();
            return;
        }
          goto _L1
_L3:
        MotionEvent motionevent2 = MotionEvent.obtain(mDownTimeInMs, l, 2, j, mPointerProperties, mPointerCoords, 0, 0, 1.0F, 1.0F, 0, 0, 0, 0);
        mContentViewCore.onTouchEvent(motionevent2);
        motionevent2.recycle();
        return;
_L4:
        MotionEvent motionevent3 = MotionEvent.obtain(mDownTimeInMs, l, 3, 1, mPointerProperties, mPointerCoords, 0, 0, 1.0F, 1.0F, 0, 0, 0, 0);
        mContentViewCore.onTouchEvent(motionevent3);
        motionevent3.recycle();
        return;
_L5:
        if (j > 1)
        {
            MotionEvent motionevent4 = MotionEvent.obtain(mDownTimeInMs, l, 6, j, mPointerProperties, mPointerCoords, 0, 0, 1.0F, 1.0F, 0, 0, 0, 0);
            mContentViewCore.onTouchEvent(motionevent4);
            motionevent4.recycle();
        }
        MotionEvent motionevent5 = MotionEvent.obtain(mDownTimeInMs, l, 1, 1, mPointerProperties, mPointerCoords, 0, 0, 1.0F, 1.0F, 0, 0, 0, 0);
        mContentViewCore.onTouchEvent(motionevent5);
        motionevent5.recycle();
        return;
    }

    void setPointer(int i, int j, int k, int l)
    {
        if (!$assertionsDisabled && (i < 0 || i >= 16))
        {
            throw new AssertionError();
        } else
        {
            float f = mContentViewCore.getRenderCoordinates().getDeviceScaleFactor();
            Object obj = new android.view.MotionEvent.PointerCoords();
            obj.x = (float)j * f;
            obj.y = (float)k * f;
            obj.pressure = 1.0F;
            mPointerCoords[i] = ((android.view.MotionEvent.PointerCoords) (obj));
            obj = new android.view.MotionEvent.PointerProperties();
            obj.id = l;
            mPointerProperties[i] = ((android.view.MotionEvent.PointerProperties) (obj));
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/TouchEventSynthesizer.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
