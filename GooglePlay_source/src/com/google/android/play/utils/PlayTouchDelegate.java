// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;

public final class PlayTouchDelegate extends TouchDelegate
{

    private Rect mPlayBounds;
    private boolean mPlayDelegateTargeted;
    private View mPlayDelegateView;
    private int mPlaySlop;
    private Rect mPlaySlopBounds;

    public PlayTouchDelegate(Rect rect, View view)
    {
        super(rect, view);
        mPlayBounds = rect;
        mPlaySlop = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        mPlaySlopBounds = new Rect(rect);
        mPlaySlopBounds.inset(-mPlaySlop, -mPlaySlop);
        mPlayDelegateView = view;
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag1;
        int j;
        int k;
        boolean flag2;
        boolean flag3;
        j = (int)motionevent.getX();
        k = (int)motionevent.getY();
        flag2 = false;
        flag1 = true;
        flag = true;
        flag3 = false;
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 106
    //                   1 137
    //                   2 137
    //                   3 200;
           goto _L1 _L2 _L3 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_200;
_L1:
        flag1 = flag;
_L5:
        if (flag2)
        {
            View view = mPlayDelegateView;
            boolean flag4;
            if (flag1)
            {
                motionevent.setLocation(view.getWidth() / 2, view.getHeight() / 2);
            } else
            {
                int i = mPlaySlop;
                motionevent.setLocation(-(i * 2), -(i * 2));
            }
            flag3 = view.dispatchTouchEvent(motionevent);
        }
        return flag3;
_L2:
        flag1 = flag;
        if (mPlayBounds.contains(j, k))
        {
            mPlayDelegateTargeted = true;
            flag2 = true;
            flag1 = flag;
        }
          goto _L5
_L3:
        flag4 = mPlayDelegateTargeted;
        flag = flag1;
        if (flag4)
        {
            flag = flag1;
            if (!mPlaySlopBounds.contains(j, k))
            {
                flag = false;
            }
        }
        flag1 = flag;
        flag2 = flag4;
        if (motionevent.getAction() == 1)
        {
            mPlayDelegateTargeted = false;
            flag1 = flag;
            flag2 = flag4;
        }
          goto _L5
        flag2 = mPlayDelegateTargeted;
        mPlayDelegateTargeted = false;
        flag1 = flag;
          goto _L5
    }
}
