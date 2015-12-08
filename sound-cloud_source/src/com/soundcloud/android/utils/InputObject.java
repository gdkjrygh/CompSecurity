// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.view.MotionEvent;
import android.view.View;
import java.util.concurrent.ArrayBlockingQueue;

public class InputObject
{

    public static final int ACTION_KEY_DOWN = 1;
    public static final int ACTION_KEY_UP = 2;
    public static final int ACTION_TOUCH_DOWN = 3;
    public static final int ACTION_TOUCH_MOVE = 4;
    public static final int ACTION_TOUCH_POINTER_DOWN = 6;
    public static final int ACTION_TOUCH_POINTER_UP = 7;
    public static final int ACTION_TOUCH_UP = 5;
    public static final byte EVENT_TYPE_KEY = 1;
    public static final byte EVENT_TYPE_TOUCH = 2;
    public int action;
    public int actionIndex;
    public byte eventType;
    public int pointerX;
    public int pointerY;
    public ArrayBlockingQueue pool;
    public long time;
    public View view;
    public int x;
    public int y;

    public InputObject(ArrayBlockingQueue arrayblockingqueue)
    {
        pool = arrayblockingqueue;
    }

    private void dumpEvent(MotionEvent motionevent)
    {
        int i = 0;
        StringBuilder stringbuilder = new StringBuilder(5000);
        int j = motionevent.getAction();
        int k = j & 0xff;
        stringbuilder.append("event ACTION_").append((new String[] {
            "DOWN", "UP", "MOVE", "CANCEL", "OUTSIDE", "POINTER_DOWN", "POINTER_UP", "7?", "8?", "9?"
        })[k]);
        if (k == 5 || k == 6)
        {
            stringbuilder.append("(pid ").append(j >> 8);
            stringbuilder.append(')');
        }
        stringbuilder.append('[');
        for (; i < motionevent.getPointerCount(); i++)
        {
            stringbuilder.append('#').append(i);
            stringbuilder.append("(pid ").append(motionevent.getPointerId(i));
            stringbuilder.append(")=").append((int)motionevent.getX(i));
            stringbuilder.append(',').append((int)motionevent.getY(i));
            if (i + 1 < motionevent.getPointerCount())
            {
                stringbuilder.append(';');
            }
        }

        stringbuilder.append(']');
    }

    public void returnToPool()
    {
        pool.add(this);
    }

    public void useEvent(View view1, MotionEvent motionevent)
    {
        view = view1;
        eventType = 2;
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 0 6: default 60
    //                   0 128
    //                   1 144
    //                   2 136
    //                   3 60
    //                   4 60
    //                   5 152
    //                   6 161;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5 _L6
_L1:
        action = 0;
_L8:
        actionIndex = motionevent.getActionIndex();
        time = motionevent.getEventTime();
        x = (int)motionevent.getX();
        y = (int)motionevent.getY();
        if (motionevent.getPointerCount() > 1)
        {
            pointerX = (int)motionevent.getX(1);
            pointerY = (int)motionevent.getY(1);
        }
        return;
_L2:
        action = 3;
        continue; /* Loop/switch isn't completed */
_L4:
        action = 4;
        continue; /* Loop/switch isn't completed */
_L3:
        action = 5;
        continue; /* Loop/switch isn't completed */
_L5:
        action = 6;
        continue; /* Loop/switch isn't completed */
_L6:
        action = 7;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void useEventHistory(View view1, MotionEvent motionevent, int i)
    {
        view = view1;
        eventType = 2;
        action = 4;
        time = motionevent.getHistoricalEventTime(i);
        x = (int)motionevent.getHistoricalX(i);
        y = (int)motionevent.getHistoricalY(i);
    }
}
