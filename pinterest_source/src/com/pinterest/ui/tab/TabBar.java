// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.tab;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import com.pinterest.base.Device;
import com.pinterest.kit.application.Resources;
import java.lang.ref.WeakReference;

// Referenced classes of package com.pinterest.ui.tab:
//            TabBarUtils, Tab

public class TabBar extends LinearLayout
    implements android.view.View.OnClickListener
{

    private static final int PAGER_SCROLL_SYNC_DELAY = 10;
    private static final int SELECTED_INDICATOR_THICKNESS_DIPS = 2;
    private static final int UNDERLINE_COLOR = Resources.color(0x7f0e009c);
    private boolean _hasUnderline;
    private int _height;
    protected WeakReference _listener;
    protected int _maxWidth;
    private float _pagerScrollOffset;
    private int _pagerScrollPosition;
    private Runnable _pagerScrollSyncRunnable;
    private Rect _requestRect;
    protected int _selectedIndex;
    private int _underlineLeft;
    private final Paint _underlinePaint;
    private int _underlineRight;
    private int _underlineThickness;

    public TabBar(Context context)
    {
        this(context, null);
    }

    public TabBar(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        _underlinePaint = new Paint();
        _hasUnderline = true;
        _requestRect = new Rect();
        _pagerScrollSyncRunnable = new _cls1();
        _underlinePaint.setColor(UNDERLINE_COLOR);
        _underlineThickness = (int)(Device.getDisplayMetrics().density * 2.0F);
    }

    private void calculateUnderline()
    {
        View view = getChildAt(_pagerScrollPosition);
        _underlineLeft = view.getLeft();
        _underlineRight = view.getRight();
        if (_pagerScrollOffset > 0.0F && _pagerScrollPosition < getChildCount() - 1)
        {
            View view1 = getChildAt(_pagerScrollPosition + 1);
            _underlineLeft = (int)(_pagerScrollOffset * (float)view1.getLeft() + (1.0F - _pagerScrollOffset) * (float)_underlineLeft);
            float f = _pagerScrollOffset;
            _underlineRight = (int)((float)view1.getRight() * f + (1.0F - _pagerScrollOffset) * (float)_underlineRight);
        }
    }

    public void disableUnderline()
    {
        if (!_hasUnderline)
        {
            return;
        } else
        {
            _hasUnderline = false;
            invalidate();
            return;
        }
    }

    public void enableUnderline()
    {
        if (!_hasUnderline)
        {
            return;
        } else
        {
            _hasUnderline = true;
            invalidate();
            return;
        }
    }

    public int getSelectedIndex()
    {
        return _selectedIndex;
    }

    public void onClick(View view)
    {
        _selectedIndex = TabBarUtils.handleClick(this, view, _selectedIndex, (Listener)_listener.get());
    }

    protected void onDraw(Canvas canvas)
    {
        int i = getChildCount();
        if (!_hasUnderline || i <= 0)
        {
            return;
        } else
        {
            canvas.drawRect(_underlineLeft, _height - _underlineThickness, _underlineRight, _height, _underlinePaint);
            return;
        }
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        TabBarUtils.initTabs(this, this);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        super.onLayout(flag, i, j, k, l);
        _height = l - j;
        calculateUnderline();
    }

    protected void onMeasure(int i, int j)
    {
        int k = i;
        if (_maxWidth > 0)
        {
            k = i;
            if (android.view.View.MeasureSpec.getSize(i) > _maxWidth)
            {
                k = android.view.View.MeasureSpec.makeMeasureSpec(_maxWidth, 0x40000000);
            }
        }
        super.onMeasure(k, j);
    }

    public void removeTab(Tab tab)
    {
        removeView(tab);
        TabBarUtils.initTabs(this, this);
    }

    public void setCurrentIndex(int i)
    {
        _selectedIndex = TabBarUtils.setCurrentTab(this, _selectedIndex, i);
        removeCallbacks(_pagerScrollSyncRunnable);
        postDelayed(_pagerScrollSyncRunnable, 10L);
    }

    public void setListener(Listener listener)
    {
        _listener = new WeakReference(listener);
    }

    public void setMaxWidth(int i)
    {
        _maxWidth = i;
        requestLayout();
    }

    public void setPagerScroll(int i, float f)
    {
        removeCallbacks(_pagerScrollSyncRunnable);
        _pagerScrollPosition = i;
        _pagerScrollOffset = f;
        calculateUnderline();
        i = (Math.min(getWidth(), (int)Device.getScreenWidth()) - (_underlineRight - _underlineLeft)) / 2;
        _requestRect.set(_underlineLeft - i, 0, i + _underlineRight, _height);
        getParent().requestChildRectangleOnScreen(this, _requestRect, true);
        invalidate();
    }


    private class _cls1
        implements Runnable
    {

        final TabBar this$0;

        public void run()
        {
            setPagerScroll(_selectedIndex, 0.0F);
        }

        _cls1()
        {
            this$0 = TabBar.this;
            super();
        }
    }


    private class Listener
    {

        public abstract void onTabReselected(int i);

        public abstract void onTabSelected(int i);
    }

}
