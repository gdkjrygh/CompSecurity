// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import android.widget.Adapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.common.e.h;
import com.facebook.inject.t;
import com.facebook.q;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.widget.listview:
//            f, g, e

public abstract class d extends ListView
{

    protected int a;
    protected int b;
    protected int c;
    private ImageView d;
    private LinearLayout e;
    private WindowManager f;
    private android.view.WindowManager.LayoutParams g;
    private int h;
    private int i;
    private int j;
    private int k;
    private e l;
    private g m;
    private int n;
    private int o;
    private int p;
    private GestureDetector q;
    private Rect r;
    private Bitmap s;
    private final int t;
    private int u;
    private Drawable v;
    private Drawable w;
    private long x;
    private final h y;

    public d(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public d(Context context, AttributeSet attributeset, int i1)
    {
        boolean flag1 = true;
        super(context, attributeset, i1);
        r = new Rect();
        a = -1;
        b = -1;
        c = -1;
        u = -1;
        v = null;
        w = null;
        t = ViewConfiguration.get(context).getScaledTouchSlop();
        if (attributeset != null)
        {
            attributeset = getContext().obtainStyledAttributes(attributeset, q.DragSortListView, 0, 0);
            a = attributeset.getDimensionPixelSize(q.DragSortListView_normalHeight, 0);
            b = a * 2 - 1;
            c = attributeset.getResourceId(q.DragSortListView_grabberId, -1);
            u = attributeset.getResourceId(q.DragSortListView_viewToHideWhileDragging, -1);
            v = attributeset.getDrawable(q.DragSortListView_dragndropImageBackground);
            w = attributeset.getDrawable(q.DragSortListView_dragndropBackground);
            attributeset.recycle();
        }
        boolean flag;
        if (a > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Item height must be > 0");
        if (c > 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Grabber id must be valid");
        y = (h)com.facebook.inject.t.a(context).a(com/facebook/common/e/h);
    }

    private int a(int i1)
    {
        int k1 = i1 - j - a / 2;
        int j1 = a(0, k1);
        if (j1 >= 0)
        {
            i1 = j1;
            if (j1 <= i)
            {
                i1 = j1 + 1;
            }
        } else
        {
            i1 = j1;
            if (k1 < 0)
            {
                return 0;
            }
        }
        return i1;
    }

    private int a(int i1, int j1)
    {
        Rect rect = r;
        for (int k1 = getChildCount() - 1; k1 >= 0; k1--)
        {
            getChildAt(k1).getHitRect(rect);
            if (rect.contains(i1, j1))
            {
                return k1 + getFirstVisiblePosition();
            }
        }

        return -1;
    }

    private void a()
    {
        int i1 = 0;
        do
        {
            if (getChildAt(i1) == null)
            {
                layoutChildren();
                if (getChildAt(i1) == null)
                {
                    e();
                    return;
                }
            }
            i1++;
        } while (true);
    }

    private void a(Bitmap bitmap, int i1, int j1)
    {
        c();
        x = SystemClock.elapsedRealtime();
        g = new android.view.WindowManager.LayoutParams();
        g.gravity = 51;
        g.x = i1;
        g.y = (j1 - j) + k;
        g.height = -2;
        g.width = -2;
        g.flags = 408;
        g.format = -3;
        g.windowAnimations = 0;
        d = new ImageView(getContext());
        if (v != null)
        {
            d.setBackgroundDrawable(v);
        }
        d.setImageBitmap(bitmap);
        LinearLayout linearlayout = new LinearLayout(getContext());
        linearlayout.addView(d);
        if (w != null)
        {
            linearlayout.setBackgroundDrawable(w);
        }
        s = bitmap;
        f = (WindowManager)com.facebook.inject.t.a(getContext()).a(android/view/WindowManager);
        f.addView(linearlayout, g);
        e = linearlayout;
    }

    private void b()
    {
        if (SystemClock.elapsedRealtime() - x < 50L)
        {
            return;
        }
        int k1 = getDragSortListAdapter().d();
        int j2 = getDragSortListAdapter().e();
        int j1 = getBoundedDragPosition() - getFirstVisiblePosition();
        int i1 = j1;
        if (h >= i)
        {
            i1 = j1;
            if (h < j2)
            {
                i1 = j1 + 1;
            }
        }
        int k2 = getLastVisiblePosition();
        int l2 = getFirstVisiblePosition();
        int i3 = i - getFirstVisiblePosition();
        View view;
        int l1;
        int i2;
        if (i == j2 && h >= j2)
        {
            l1 = i1 - 1;
        } else
        if (i == k1 && h < k1)
        {
            l1 = i1 + 1;
        } else
        {
            l1 = i1;
        }
        if (k1 == j2)
        {
            a(getChildAt(i3), a, 80, 4);
            return;
        }
        i2 = 0;
label0:
        {
            if (i2 < (k2 - l2) + 1)
            {
                view = getChildAt(i2);
                if (view != null)
                {
                    break label0;
                }
            }
            layoutChildren();
            return;
        }
        k1 = a;
        if (i2 != i3)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = 4;
        k1 = 1;
        i1 = 80;
_L4:
        a(view, k1, i1, j1);
        i2++;
        if (true) goto _L2; else goto _L1
_L2:
        break MISSING_BLOCK_LABEL_176;
_L1:
        if (i2 == l1)
        {
            k1 = b;
            if (h >= j2)
            {
                i1 = 48;
                j1 = 0;
            } else
            {
                i1 = 80;
                j1 = 0;
            }
        } else
        {
            j1 = 0;
            i1 = 80;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (true) goto _L6; else goto _L5
_L6:
        break MISSING_BLOCK_LABEL_176;
_L5:
    }

    private void b(int i1)
    {
        if (i1 >= p / 3)
        {
            n = p / 3;
        }
        if (i1 <= (p * 2) / 3)
        {
            o = (p * 2) / 3;
        }
    }

    private void b(int i1, int j1)
    {
        g.y = (j1 - j) + k;
        f.updateViewLayout(e, g);
    }

    private void c()
    {
        d();
    }

    private void d()
    {
        if (e != null)
        {
            ((WindowManager)com.facebook.inject.t.a(getContext()).a(android/view/WindowManager)).removeView(e);
            d.setImageDrawable(null);
            d = null;
            e = null;
        }
        if (s != null)
        {
            s.recycle();
            s = null;
        }
    }

    private void e()
    {
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            a(getChildAt(i1));
        }

    }

    private int getBoundedDragPosition()
    {
        int i1 = getDragSortListAdapter().d();
        int j1 = getDragSortListAdapter().e();
        int k1 = h;
        if (k1 > j1)
        {
            return j1;
        }
        if (k1 < i1)
        {
            return i1;
        } else
        {
            return k1;
        }
    }

    private f getDragSortListAdapter()
    {
        return (f)getAdapter();
    }

    protected abstract void a(View view);

    protected void a(View view, int i1, int j1)
    {
        if (i1 != -1)
        {
            if ((view = view.findViewById(i1)) != null)
            {
                view.setVisibility(j1);
                return;
            }
        }
    }

    protected abstract void a(View view, int i1, int j1, int k1);

    public final void addFooterView(View view)
    {
        throw new RuntimeException("Footers are not supported with DragSortListView in conjunction with remove_mode");
    }

    public final void addFooterView(View view, Object obj, boolean flag)
    {
        throw new RuntimeException("Footers are not supported with DragSortListView in conjunction with remove_mode");
    }

    public final void addHeaderView(View view)
    {
        throw new RuntimeException("Headers are not supported with DragSortListView");
    }

    public final void addHeaderView(View view, Object obj, boolean flag)
    {
        throw new RuntimeException("Headers are not supported with DragSortListView");
    }

    protected abstract boolean b(View view);

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        d();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        if (l == null && m == null) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 0: default 36
    //                   0 42;
           goto _L2 _L3
_L2:
        return super.onInterceptTouchEvent(motionevent);
_L3:
        Object obj;
        Rect rect;
        int i1;
        int j1;
        int k1;
        k1 = (int)motionevent.getX();
        i1 = (int)motionevent.getY();
        j1 = pointToPosition(k1, i1);
        if (j1 == -1)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = getChildAt(j1 - getFirstVisiblePosition());
        if (!b(((View) (obj))))
        {
            continue; /* Loop/switch isn't completed */
        }
        j = i1 - ((View) (obj)).getTop();
        k = (int)motionevent.getRawY() - i1;
        View view = ((View) (obj)).findViewById(c);
        rect = r;
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        if (rect.left > k1 || k1 > rect.right) goto _L5; else goto _L4
_L4:
        View view1;
        boolean flag;
        boolean flag1;
        view1 = ((View) (obj)).findViewById(u);
        k1 = view1.getVisibility();
        if (k1 == 0)
        {
            view1.setVisibility(4);
        }
        flag = ((View) (obj)).isDrawingCacheEnabled();
        flag1 = ((View) (obj)).willNotCacheDrawing();
        ((View) (obj)).setDrawingCacheEnabled(true);
        ((View) (obj)).setWillNotCacheDrawing(false);
        if (((View) (obj)).getDrawingCache() != null) goto _L7; else goto _L6
_L6:
        y.a("bookmark", (new StringBuilder()).append("The drawing cache is null while dragging the item in the list! ").append(obj).toString());
        ((View) (obj)).setDrawingCacheEnabled(flag);
        ((View) (obj)).setWillNotCacheDrawing(flag1);
        continue; /* Loop/switch isn't completed */
_L7:
        motionevent = Bitmap.createBitmap(((View) (obj)).getDrawingCache());
        ((View) (obj)).setDrawingCacheEnabled(flag);
        ((View) (obj)).setWillNotCacheDrawing(flag1);
        if (k1 == 0)
        {
            view1.setVisibility(0);
        }
        obj = new Rect();
        getGlobalVisibleRect(((Rect) (obj)), null);
        a(motionevent, ((Rect) (obj)).left, i1);
        h = j1;
        i = h;
        p = getHeight();
        j1 = t;
        n = Math.min(i1 - j1, p / 3);
        o = Math.max(j1 + i1, (p * 2) / 3);
        return false;
        motionevent;
        ((View) (obj)).setDrawingCacheEnabled(flag);
        ((View) (obj)).setWillNotCacheDrawing(flag1);
        throw motionevent;
_L5:
        e = null;
        if (true) goto _L2; else goto _L8
_L8:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (q != null)
        {
            q.onTouchEvent(motionevent);
        }
        if (l == null && m == null || e == null) goto _L2; else goto _L1
_L1:
        motionevent.getAction();
        JVM INSTR tableswitch 0 3: default 72
    //                   0 133
    //                   1 74
    //                   2 133
    //                   3 74;
           goto _L3 _L4 _L5 _L4 _L5
_L3:
        return true;
_L5:
        motionevent = r;
        e.getDrawingRect(motionevent);
        c();
        if (m != null && h != i)
        {
            m.a(i, getBoundedDragPosition());
        }
        a();
        continue; /* Loop/switch isn't completed */
_L4:
        int j1 = (int)motionevent.getX();
        int i1 = (int)motionevent.getY();
        b(j1, i1);
        j1 = a(i1);
        if (j1 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (l != null)
        {
            l.a(h, j1);
        }
        h = j1;
        b();
        b(i1);
        if (i1 <= o)
        {
            break; /* Loop/switch isn't completed */
        }
        int k1;
        if (i1 > (p + o) / 2)
        {
            i1 = 16;
        } else
        {
            i1 = 4;
        }
        if (getLastVisiblePosition() >= getDragSortListAdapter().e() + 2)
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            k1 = pointToPosition(0, p / 2);
            j1 = k1;
            if (k1 == -1)
            {
                j1 = pointToPosition(0, p / 2 + getDividerHeight() + 64);
            }
            motionevent = getChildAt(j1 - getFirstVisiblePosition());
            if (motionevent != null)
            {
                setSelectionFromTop(j1, motionevent.getTop() - i1);
            }
        }
        if (true) goto _L3; else goto _L6
_L2:
        return super.onTouchEvent(motionevent);
_L6:
        if (i1 < n)
        {
            if (i1 < n / 2)
            {
                i1 = -16;
            } else
            {
                i1 = -4;
            }
            if (getFirstVisiblePosition() > getDragSortListAdapter().d() - 2)
            {
                break MISSING_BLOCK_LABEL_240;
            }
        }
        i1 = 0;
        break MISSING_BLOCK_LABEL_240;
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public final void setAdapter(ListAdapter listadapter)
    {
        if (listadapter != null && !(listadapter instanceof f))
        {
            throw new RuntimeException("DragSortListView expects a DragSortListAdapter based adapter");
        } else
        {
            super.setAdapter(listadapter);
            return;
        }
    }

    public void setDragListener(e e1)
    {
        l = e1;
    }

    public void setDropListener(g g1)
    {
        m = g1;
    }
}
