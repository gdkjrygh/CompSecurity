// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking.Plugins.Components;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.HorizontalScrollView;
import com.EnterpriseMobileBanking.AppHelper;
import com.EnterpriseMobileBanking.Utils.Log;

public class SwipeCover extends HorizontalScrollView
{

    private static final int FLING_THRESHOLD = (int)(25F * AppHelper.getDensity());
    private static final boolean USE_TWO_THIRDS = true;
    private static int checkDelay = 25;
    private static SwipeCover last = null;
    private int SPRING_THRESHOLD;
    private boolean ignoreButtons;
    private int lastButton;
    private int scrollStart;
    private Runnable snapCheck = new Runnable() {

        private int lastPos;
        final SwipeCover this$0;

        public void run()
        {
            int i = getScrollX();
            if (lastPos - i < SwipeCover.FLING_THRESHOLD)
            {
                Log.d("SC", (new StringBuilder()).append("threshold: ").append(threshold).append(" -- ").append(lastPos).append(" -- ").append(i).toString());
                if (i > threshold && i < scrollStart + SPRING_THRESHOLD)
                {
                    resetScroll();
                } else
                {
                    openScroll();
                }
                lastButton = 0x80000000;
                ignoreButtons = false;
                return;
            } else
            {
                lastPos = i;
                postDelayed(snapCheck, SwipeCover.checkDelay);
                return;
            }
        }

            
            {
                this$0 = SwipeCover.this;
                super();
                lastPos = 0x80000000;
            }
    };
    private int threshold;

    public SwipeCover(Context context)
    {
        super(context);
        scrollStart = 0;
        threshold = (int)((float)(scrollStart / 2) * AppHelper.getDensity());
        ignoreButtons = false;
        lastButton = 0x80000000;
        SPRING_THRESHOLD = (int)(10F * AppHelper.getDensity());
    }

    public SwipeCover(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        scrollStart = 0;
        threshold = (int)((float)(scrollStart / 2) * AppHelper.getDensity());
        ignoreButtons = false;
        lastButton = 0x80000000;
        SPRING_THRESHOLD = (int)(10F * AppHelper.getDensity());
    }

    public SwipeCover(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        scrollStart = 0;
        threshold = (int)((float)(scrollStart / 2) * AppHelper.getDensity());
        ignoreButtons = false;
        lastButton = 0x80000000;
        SPRING_THRESHOLD = (int)(10F * AppHelper.getDensity());
    }

    private View getParentRow()
    {
        View view;
        for (view = (View)getParent(); view.getId() != 0x7f08007f && view.getId() != 0x7f080080 && view.getId() != 0x7f080081; view = (View)view.getParent()) { }
        return view;
    }

    private void setContentDescription(boolean flag)
    {
        View view = getParentRow();
        int ai[] = new int[3];
        int[] _tmp = ai;
        ai[0] = 0x7f0800c0;
        ai[1] = 0x7f0800c1;
        ai[2] = 0x7f0800c2;
        int j = ai.length;
        int i = 0;
        while (i < j) 
        {
            View view1 = view.findViewById(ai[i]).findViewById(0x7f080084);
            String s;
            if (flag)
            {
                s = AppHelper.getAppString(0x7f090132);
            } else
            {
                s = view1.getTag().toString();
            }
            view1.setContentDescription(s);
            i++;
        }
    }

    public void clearLast()
    {
        last = null;
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        if (k != 0) goto _L2; else goto _L1
_L1:
        threshold = scrollStart / 3 + SPRING_THRESHOLD;
_L4:
        super.onScrollChanged(i, j, k, l);
        return;
_L2:
        if (k == scrollStart)
        {
            threshold = (scrollStart / 3) * 2 + SPRING_THRESHOLD;
            if (i < k)
            {
                findViewById(0x7f08009a).setVisibility(8);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int ai[];
        View view;
        int i;
        i = findViewById(0x7f080098).getWidth() / 3;
        int k = (int)(motionevent.getX() / (float)i);
        ai = new int[3];
        ai;
        ai[0] = 0x7f0800c0;
        ai[1] = 0x7f0800c1;
        ai[2] = 0x7f0800c2;
        i = k;
        if (k == ai.length - 1)
        {
            Log.d("SC", (new StringBuilder()).append("Off by: ").append((float)scrollStart - motionevent.getX()).toString());
            i = k;
            if ((float)scrollStart - motionevent.getX() < 20F * AppHelper.getDensity())
            {
                i = k + 1;
            }
        }
        if (motionevent.getAction() == 1)
        {
            postDelayed(snapCheck, checkDelay);
        }
        if (getScrollX() == scrollStart || ignoreButtons || i >= ai.length && lastButton != 0x7fffffff)
        {
            if (lastButton < ai.length && lastButton > -1)
            {
                getParentRow().findViewById(ai[lastButton]).setPressed(false);
            } else
            {
                Log.d("SC", (new StringBuilder()).append("Scrolled to: ").append(getScrollX()).toString());
                lastButton = 0x80000000;
                ignoreButtons = true;
                resetLast();
                last = this;
            }
            return super.onTouchEvent(motionevent);
        }
        if (lastButton == 0x80000000)
        {
            lastButton = i;
        }
        view = getParentRow();
        if (motionevent.getAction() == 3 || lastButton != i) goto _L2; else goto _L1
_L1:
        Log.d("SC", (new StringBuilder()).append("Button: ").append(i).toString());
        if (motionevent.getAction() == 1)
        {
            Log.d("SC", "Sending Click!");
            view.findViewById(ai[i]).setPressed(false);
            view.findViewById(ai[i]).performClick();
        } else
        {
            view.findViewById(ai[i]).setPressed(true);
        }
_L4:
        return true;
_L2:
        if (lastButton != 0x80000000)
        {
            int l = ai.length;
            for (int j = 0; j < l; j++)
            {
                view.findViewById(ai[j]).setPressed(false);
            }

            lastButton = 0x7fffffff;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void openScroll()
    {
        resetLast();
        findViewById(0x7f08009a).setVisibility(8);
        smoothScrollTo(0, getScrollY());
        last = this;
        setContentDescription(false);
    }

    public boolean resetLast()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (last != null)
        {
            flag = flag1;
            if (last != this)
            {
                last.resetScroll();
                flag = true;
                last = null;
            }
        }
        return flag;
    }

    public void resetScroll()
    {
        findViewById(0x7f08009a).setVisibility(0);
        smoothScrollTo(scrollStart, getScrollY());
        setContentDescription(true);
    }

    public void setScrollStart(int i)
    {
        scrollStart = i;
        threshold = scrollStart / 2 + SPRING_THRESHOLD;
        scrollTo(scrollStart, getScrollY());
    }







/*
    static int access$402(SwipeCover swipecover, int i)
    {
        swipecover.lastButton = i;
        return i;
    }

*/


/*
    static boolean access$502(SwipeCover swipecover, boolean flag)
    {
        swipecover.ignoreButtons = flag;
        return flag;
    }

*/


}
