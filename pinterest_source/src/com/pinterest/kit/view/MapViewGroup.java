// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.content.Context;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.widget.ViewDragHelper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.pinterest.base.Events;
import com.pinterest.reporting.CrashReporting;

public class MapViewGroup extends ViewGroup
{

    private static final boolean DEBUG_TOUCHES = false;
    private final ViewDragHelper _dragHelper;
    private android.support.v4.widget.ViewDragHelper.Callback _dragHelperCallBack;
    protected View _gridVw;
    private float _initialTouchY;
    private boolean _isMapShown;
    private boolean _isUserTouchingMap;
    private MapViewGroupListener _listener;
    protected View _mapContainer;
    private boolean _minimizePinGrid;
    private int _top;
    private boolean _touchMoved;
    private int _verticalDragRange;
    private int _verticalDragRangeAdjustment;

    public MapViewGroup(Context context)
    {
        this(context, null, 0);
    }

    public MapViewGroup(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public MapViewGroup(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        _isMapShown = false;
        _isUserTouchingMap = false;
        _touchMoved = false;
        _dragHelperCallBack = new _cls1();
        _dragHelper = ViewDragHelper.create(this, 1.0F, _dragHelperCallBack);
    }

    private int getDefaultPinGridTopPosition()
    {
        if (_isMapShown)
        {
            return (int)(0.25D * (double)_verticalDragRange);
        } else
        {
            return 0;
        }
    }

    private MotionEvent getVerticalOffsetMotionEvent(MotionEvent motionevent)
    {
        motionevent.setLocation(motionevent.getX(), motionevent.getY() - (float)_top);
        return motionevent;
    }

    private boolean onTouchEventInternal(MotionEvent motionevent)
    {
        float f;
        float f1;
        int i;
        boolean flag2;
        boolean flag4;
        flag2 = false;
        flag4 = true;
        i = motionevent.getAction();
        f = motionevent.getY();
        f1 = f - _initialTouchY;
        i & 0xff;
        JVM INSTR tableswitch 0 6: default 72
    //                   0 78
    //                   1 260
    //                   2 177
    //                   3 72
    //                   4 72
    //                   5 242
    //                   6 242;
           goto _L1 _L2 _L3 _L4 _L1 _L1 _L5 _L5
_L1:
        boolean flag3 = false;
_L7:
        return flag3;
_L2:
        _touchMoved = false;
        _isUserTouchingMap = isUserTouchingMap(f);
        boolean flag;
        if (!_isUserTouchingMap)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _dragHelper.processTouchEvent(motionevent);
        if (_isUserTouchingMap)
        {
            smoothScrollPinGridBottom();
            _mapContainer.dispatchTouchEvent(motionevent);
        } else
        {
            _gridVw.dispatchTouchEvent(getVerticalOffsetMotionEvent(motionevent));
        }
        flag3 = flag4;
        if (!flag) goto _L7; else goto _L6
_L6:
        flag3 = flag4;
        if (_gridVw.getTop() >= 0) goto _L7; else goto _L8
_L8:
        return false;
_L4:
        _touchMoved = true;
        if (_isUserTouchingMap)
        {
            _mapContainer.dispatchTouchEvent(motionevent);
        } else
        if (_gridVw.getTop() <= 0)
        {
            _gridVw.dispatchTouchEvent(getVerticalOffsetMotionEvent(motionevent));
            smoothScrollPinGridTop();
        } else
        {
            _dragHelper.processTouchEvent(motionevent);
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (_isUserTouchingMap)
        {
            _mapContainer.dispatchTouchEvent(motionevent);
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!_isUserTouchingMap) goto _L10; else goto _L9
_L9:
        _mapContainer.dispatchTouchEvent(motionevent);
        if (!_touchMoved || _listener == null) goto _L12; else goto _L11
_L11:
        boolean flag1;
        _listener.onLargeMapDragged();
        flag1 = true;
_L14:
        if (!flag1)
        {
            _gridVw.dispatchTouchEvent(getVerticalOffsetMotionEvent(motionevent));
            return true;
        } else
        {
            motionevent.setAction(3);
            _gridVw.dispatchTouchEvent(motionevent);
            return true;
        }
_L10:
        if (isTouchInMapSpace(f))
        {
            if (_listener != null)
            {
                _listener.onSmallMapTapped();
            }
            switchMapState(true);
            flag1 = true;
            continue; /* Loop/switch isn't completed */
        }
        flag1 = flag2;
        if (_gridVw.getScrollY() != 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        _dragHelper.processTouchEvent(motionevent);
        if (f1 < 0.0F)
        {
            if (_gridVw.getTop() >= getDefaultPinGridTopPosition())
            {
                smoothScrollPinGridTop();
                flag1 = true;
                continue; /* Loop/switch isn't completed */
            }
        } else
        if (f1 > (float)_dragHelper.getTouchSlop())
        {
            smoothScrollPinGridBottom();
            if (_listener != null)
            {
                _listener.onSmallMapSwiped();
                flag1 = true;
                continue; /* Loop/switch isn't completed */
            }
        } else
        {
            flag1 = flag2;
            if (f1 > 0.0F)
            {
                flag1 = flag2;
                if (f1 < (float)_dragHelper.getTouchSlop())
                {
                    smoothScrollPinGridTop();
                    flag1 = flag2;
                }
            }
            continue; /* Loop/switch isn't completed */
        }
_L12:
        flag1 = true;
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void smoothScroll(int i)
    {
        if (_dragHelper.smoothSlideViewTo(_gridVw, 0, i))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void smoothScrollPinGridBottom()
    {
        _gridVw.scrollBy(0, -_gridVw.getScrollY());
        smoothScroll(_verticalDragRange);
        Events.post(MapState.a);
    }

    private void smoothScrollPinGridTop()
    {
        smoothScroll(0);
        Events.post(MapState.b);
    }

    protected int calculateVerticalDragRange()
    {
        return getHeight() - _verticalDragRangeAdjustment - _gridVw.getPaddingTop();
    }

    public void computeScroll()
    {
        if (_dragHelper.continueSettling(true))
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public int getVerticalDragRange()
    {
        return _verticalDragRange;
    }

    protected int getViewBottomBound()
    {
        return getHeight();
    }

    public boolean isMapShown()
    {
        return _isMapShown;
    }

    protected boolean isTouchInMapSpace(float f)
    {
        int i;
        if (!_minimizePinGrid)
        {
            if (f < (float)(i = _gridVw.getTop() + _gridVw.getPaddingTop()) && _gridVw.getScrollY() < i)
            {
                return true;
            }
        }
        return false;
    }

    protected boolean isUserTouchingMap(float f)
    {
        return f < (float)(_gridVw.getTop() + _gridVw.getPaddingTop()) && _gridVw.getScrollY() < _gridVw.getTop();
    }

    protected void onFinishInflate()
    {
        super.onFinishInflate();
        _mapContainer = findViewById(0x7f0f01e0);
        _gridVw = findViewById(0x7f0f01e1);
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i = MotionEventCompat.getActionMasked(motionevent);
        if (!_isMapShown)
        {
            _dragHelper.cancel();
            return false;
        }
        float f = motionevent.getY();
        boolean flag = isUserTouchingMap(f);
        try
        {
            _dragHelper.shouldInterceptTouchEvent(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            CrashReporting.a(motionevent);
        }
        if (i == 0)
        {
            _initialTouchY = f;
            if (flag)
            {
                smoothScrollPinGridBottom();
            }
        }
        return true;
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (!shouldLayout())
        {
            return;
        }
        _verticalDragRange = calculateVerticalDragRange();
        if (_isMapShown)
        {
            _mapContainer.layout(i, 0, k, l);
        }
        _gridVw.layout(0, _top, k, l);
    }

    protected void onMapVisibilityChanged()
    {
        if (!_minimizePinGrid)
        {
            smoothScrollPinGridTop();
        }
    }

    protected void onMeasure(int i, int j)
    {
        measureChildren(i, j);
        setMeasuredDimension(android.view.View.MeasureSpec.getSize(i), android.view.View.MeasureSpec.getSize(j));
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        try
        {
            flag = onTouchEventInternal(motionevent);
        }
        // Misplaced declaration of an exception variable
        catch (MotionEvent motionevent)
        {
            return false;
        }
        return flag;
    }

    public void setListener(MapViewGroupListener mapviewgrouplistener)
    {
        _listener = mapviewgrouplistener;
    }

    public void setMapShown(boolean flag)
    {
        if (_isMapShown != flag && _verticalDragRange != 0)
        {
            _isMapShown = flag;
            onMapVisibilityChanged();
        }
    }

    public void setVerticalDragRangeAdjustment(int i)
    {
        _verticalDragRangeAdjustment = i;
    }

    protected boolean shouldLayout()
    {
        return _gridVw != null;
    }

    public void switchMapState(boolean flag)
    {
        _minimizePinGrid = flag;
        if (flag)
        {
            smoothScrollPinGridBottom();
            return;
        } else
        {
            smoothScrollPinGridTop();
            return;
        }
    }


/*
    static int access$002(MapViewGroup mapviewgroup, int i)
    {
        mapviewgroup._top = i;
        return i;
    }

*/


    private class _cls1 extends android.support.v4.widget.ViewDragHelper.Callback
    {

        final MapViewGroup a;

        public int clampViewPositionVertical(View view, int i, int j)
        {
            j = a.getPaddingTop();
            int k = a.getViewBottomBound();
            return Math.min(Math.max(i, j), k);
        }

        public int getViewVerticalDragRange(View view)
        {
            if (view == a._gridVw)
            {
                return a._verticalDragRange;
            } else
            {
                return 0;
            }
        }

        public void onViewPositionChanged(View view, int i, int j, int k, int l)
        {
            a._top = j;
            a.requestLayout();
        }

        public boolean tryCaptureView(View view, int i)
        {
            return view == a._gridVw;
        }

        _cls1()
        {
            a = MapViewGroup.this;
            super();
        }
    }


    private class MapViewGroupListener
    {

        public abstract void onLargeMapDragged();

        public abstract void onSmallMapSwiped();

        public abstract void onSmallMapTapped();
    }


    private class MapState extends Enum
    {

        public static final MapState a;
        public static final MapState b;
        private static final MapState c[];

        public static MapState valueOf(String s)
        {
            return (MapState)Enum.valueOf(com/pinterest/kit/view/MapViewGroup$MapState, s);
        }

        public static MapState[] values()
        {
            return (MapState[])c.clone();
        }

        static 
        {
            a = new MapState("OPEN", 0);
            b = new MapState("CLOSED", 1);
            c = (new MapState[] {
                a, b
            });
        }

        private MapState(String s, int i)
        {
            super(s, i);
        }
    }

}
