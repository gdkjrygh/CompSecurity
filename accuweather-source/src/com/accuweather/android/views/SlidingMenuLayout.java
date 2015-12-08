// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.views;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import java.util.Timer;
import java.util.TimerTask;

public class SlidingMenuLayout extends ViewGroup
{

    private int m_currentDX;
    private boolean m_open;
    private int m_slidedDX;
    private Timer m_timer;
    private boolean m_useFixedWidth;

    public SlidingMenuLayout(Context context)
    {
        super(context);
        m_open = false;
        m_currentDX = 0;
        m_slidedDX = 0;
        m_useFixedWidth = false;
        init();
    }

    public SlidingMenuLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        m_open = false;
        m_currentDX = 0;
        m_slidedDX = 0;
        m_useFixedWidth = false;
        init();
    }

    public SlidingMenuLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        m_open = false;
        m_currentDX = 0;
        m_slidedDX = 0;
        m_useFixedWidth = false;
        init();
    }

    private void init()
    {
        setChildrenDrawingOrderEnabled(true);
        setFullyOpenedWidth((int)(312F * getResources().getDisplayMetrics().density));
    }

    public void closeMenu()
    {
        if (!m_open)
        {
            return;
        }
        if (m_timer != null)
        {
            m_timer.cancel();
        }
        m_open = false;
        m_timer = new Timer();
        m_timer.schedule(new TimerTask() {

            final SlidingMenuLayout this$0;

            public void run()
            {
                <returnValue> = ((access._cls020) (this)).access$020 - <returnValue>;
                if (m_currentDX <= 0)
                {
                    m_currentDX = 0;
                    m_timer.cancel();
                }
                ((Activity)getContext()).runOnUiThread(new Runnable() {

                    final _cls2 this$1;

                    public void run()
                    {
                        requestLayout();
                    }

            
            {
                this$1 = _cls2.this;
                super();
            }
                });
            }

            
            {
                this$0 = SlidingMenuLayout.this;
                super();
            }
        }, 16L, 16L);
    }

    public boolean isOpen()
    {
        return m_open;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        l -= j;
        int i1 = getChildCount();
        j = 0;
        while (j < i1) 
        {
            View view = getChildAt(j);
            if (j == i1 - 1)
            {
                view.layout(m_currentDX, 0, m_currentDX + (k - i), l);
            } else
            {
                view.layout(0, 0, m_slidedDX, l);
            }
            j++;
        }
    }

    protected void onMeasure(int i, int j)
    {
        int k = android.view.View.MeasureSpec.getSize(i);
        i = android.view.View.MeasureSpec.getSize(j);
        if (!m_useFixedWidth)
        {
            m_slidedDX = (k * 4) / 5;
        }
        super.setMeasuredDimension(k, i);
        int l = getChildCount();
        i = 0;
        while (i < l) 
        {
            View view = getChildAt(i);
            if (i == l - 1)
            {
                measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(k, 0x40000000), j);
            } else
            {
                measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(m_slidedDX, 0x40000000), j);
            }
            i++;
        }
    }

    public void openMenu()
    {
        if (m_open)
        {
            return;
        }
        if (m_timer != null)
        {
            m_timer.cancel();
        }
        m_open = true;
        m_currentDX = 0;
        m_timer = new Timer();
        m_timer.schedule(new TimerTask() {

            final SlidingMenuLayout this$0;

            public void run()
            {
                <returnValue> = ((access._cls012) (this)).access$012 + <returnValue>;
                if (m_currentDX >= m_slidedDX)
                {
                    m_currentDX = m_slidedDX;
                    m_timer.cancel();
                }
                ((Activity)getContext()).runOnUiThread(new Runnable() {

                    final _cls1 this$1;

                    public void run()
                    {
                        requestLayout();
                    }

            
            {
                this$1 = _cls1.this;
                super();
            }
                });
            }

            
            {
                this$0 = SlidingMenuLayout.this;
                super();
            }
        }, 16L, 16L);
    }

    public void setFullyOpenedWidth(int i)
    {
        m_useFixedWidth = true;
        m_slidedDX = i;
    }



/*
    static int access$002(SlidingMenuLayout slidingmenulayout, int i)
    {
        slidingmenulayout.m_currentDX = i;
        return i;
    }

*/


/*
    static int access$012(SlidingMenuLayout slidingmenulayout, int i)
    {
        i = slidingmenulayout.m_currentDX + i;
        slidingmenulayout.m_currentDX = i;
        return i;
    }

*/


/*
    static int access$020(SlidingMenuLayout slidingmenulayout, int i)
    {
        i = slidingmenulayout.m_currentDX - i;
        slidingmenulayout.m_currentDX = i;
        return i;
    }

*/


}
