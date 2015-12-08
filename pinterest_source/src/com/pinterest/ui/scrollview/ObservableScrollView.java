// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.scrollview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ScrollView;
import com.pinterest.ui.actions.ScrollableListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ObservableScrollView extends ScrollView
{

    private boolean _allowScrolling;
    protected List _listenerList;
    public int scrollOldX;
    public int scrollOldY;
    public int scrollX;
    public int scrollY;

    public ObservableScrollView(Context context)
    {
        this(context, null);
    }

    public ObservableScrollView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public ObservableScrollView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _listenerList = new ArrayList();
        scrollX = 0;
        scrollY = 0;
        scrollOldX = 0;
        scrollOldY = 0;
        _allowScrolling = true;
        setOverScrollMode(2);
    }

    public void addListener(ScrollableListener scrollablelistener)
    {
        _listenerList.add(scrollablelistener);
    }

    public boolean canScroll()
    {
        boolean flag1 = false;
        View view = getChildAt(0);
        boolean flag = flag1;
        if (view != null)
        {
            int i = view.getHeight();
            flag = flag1;
            if (getHeight() < i + getPaddingTop() + getPaddingBottom())
            {
                flag = true;
            }
        }
        return flag;
    }

    public int getScrolledX()
    {
        return scrollX;
    }

    public int getScrolledY()
    {
        return scrollY;
    }

    protected void onDetachedFromWindow()
    {
        resetViewListener();
        super.onDetachedFromWindow();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        return _allowScrolling && super.onInterceptTouchEvent(motionevent);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        Iterator iterator = _listenerList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ScrollableListener scrollablelistener = (ScrollableListener)iterator.next();
            if (com/pinterest/ui/scrollview/ObservableScrollView$ScrollViewListener.isAssignableFrom(scrollablelistener.getClass()))
            {
                ((ScrollViewListener)scrollablelistener).onLayout();
            }
        } while (true);
    }

    protected void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        Iterator iterator = _listenerList.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ScrollableListener scrollablelistener = (ScrollableListener)iterator.next();
            if (com/pinterest/ui/scrollview/ObservableScrollView$ScrollViewListener.isAssignableFrom(scrollablelistener.getClass()))
            {
                ((ScrollViewListener)scrollablelistener).onMeasure();
            }
        } while (true);
    }

    protected void onScrollChanged(int i, int j, int k, int l)
    {
        scrollX = i;
        scrollY = j;
        scrollOldX = k;
        scrollOldY = l;
        for (Iterator iterator = _listenerList.iterator(); iterator.hasNext(); ((ScrollableListener)iterator.next()).onScroll(this, i, j, k, l)) { }
        super.onScrollChanged(i, j, k, l);
    }

    public void resetViewListener()
    {
        _listenerList.clear();
    }

    public void setAllowScrolling(boolean flag)
    {
        _allowScrolling = flag;
    }

    private class ScrollViewListener
        implements ScrollableListener
    {

        public void onLayout()
        {
        }

        public void onMeasure()
        {
        }

        public abstract void onScroll(View view, int i, int j, int k, int l);

        public ScrollViewListener()
        {
        }
    }

}
