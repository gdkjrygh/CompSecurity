// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.playback.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.soundcloud.android.view.SafeViewPager;

public class PlayerTrackPager extends SafeViewPager
{

    private boolean isPagingEnabled;

    public PlayerTrackPager(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        isPagingEnabled = true;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (isPagingEnabled)
        {
            return super.onInterceptTouchEvent(motionevent);
        } else
        {
            return true;
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (isPagingEnabled)
        {
            return super.onTouchEvent(motionevent);
        } else
        {
            return true;
        }
    }

    public void setPagingEnabled(boolean flag)
    {
        isPagingEnabled = flag;
    }
}
