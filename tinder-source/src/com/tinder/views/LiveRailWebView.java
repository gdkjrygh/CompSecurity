// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tinder.h.b;
import com.tinder.utils.ad;

public class LiveRailWebView extends b
{
    public static final class LiveRailCommand extends Enum
    {

        private static final LiveRailCommand $VALUES[];
        public static final LiveRailCommand load;
        public static final LiveRailCommand pause;
        public static final LiveRailCommand setup;

        public static LiveRailCommand valueOf(String s)
        {
            return (LiveRailCommand)Enum.valueOf(com/tinder/views/LiveRailWebView$LiveRailCommand, s);
        }

        public static LiveRailCommand[] values()
        {
            return (LiveRailCommand[])$VALUES.clone();
        }

        static 
        {
            load = new LiveRailCommand("load", 0);
            setup = new LiveRailCommand("setup", 1);
            pause = new LiveRailCommand("pause", 2);
            $VALUES = (new LiveRailCommand[] {
                load, setup, pause
            });
        }

        private LiveRailCommand(String s, int i)
        {
            super(s, i);
        }
    }


    public LiveRailWebView(Context context)
    {
        super(context);
        init();
    }

    public LiveRailWebView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        init();
    }

    private void init()
    {
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (android.os.Build.VERSION.SDK_INT <= 18)
        {
            postInvalidate();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public void runCommand(LiveRailCommand liverailcommand)
    {
        loadUrl(String.format("javascript:%s()", new Object[] {
            liverailcommand
        }));
    }

    public void simulateMotionEvent(MotionEvent motionevent)
    {
        Point point = ad.a(this);
        float f = (motionevent.getRawX() - (float)point.x) * (750F / (float)getMeasuredWidth());
        float f1 = (motionevent.getRawY() - (float)point.y) * (750F / (float)getMeasuredHeight());
        (new StringBuilder("Simulated motion event at (")).append(f).append(", ").append(f1).append(")");
        loadUrl((new StringBuilder("javascript:click(")).append(f).append(", ").append(f1).append(')').toString());
    }
}
