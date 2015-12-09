// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.devsmart.android.ui;

import android.content.Context;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Scroller;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class HorizontalListView extends AdapterView
{

    protected ListAdapter a;
    public int b;
    protected int c;
    Scroller d;
    boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private GestureDetector j;
    private Queue k;
    private boolean l;
    private int m;
    private float n;
    private float o;
    private float p;
    private boolean q;
    private DataSetObserver r;
    private Runnable s;
    private android.view.GestureDetector.OnGestureListener t;

    public HorizontalListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = -1;
        h = 0x7fffffff;
        k = new LinkedList();
        m = 0;
        new ArrayList();
        new ArrayList();
        q = true;
        r = new DataSetObserver() {

            private HorizontalListView a;

            public final void onChanged()
            {
                synchronized (a)
                {
                    HorizontalListView.a(a);
                }
                a.invalidate();
                a.requestLayout();
                return;
                exception;
                horizontallistview;
                JVM INSTR monitorexit ;
                throw exception;
            }

            public final void onInvalidated()
            {
                HorizontalListView.b(a);
                a.invalidate();
                a.requestLayout();
            }

            
            {
                a = HorizontalListView.this;
                super();
            }
        };
        s = new Runnable() {

            private HorizontalListView a;

            public final void run()
            {
                a.requestLayout();
            }

            
            {
                a = HorizontalListView.this;
                super();
            }
        };
        t = new android.view.GestureDetector.SimpleOnGestureListener() {

            private HorizontalListView a;

            private static boolean a(MotionEvent motionevent, View view)
            {
                Rect rect = new Rect();
                int ai[] = new int[2];
                view.getLocationOnScreen(ai);
                int i1 = ai[0];
                int j1 = view.getWidth();
                int k1 = ai[1];
                rect.set(i1, k1, j1 + i1, view.getHeight() + k1);
                return rect.contains((int)motionevent.getRawX(), (int)motionevent.getRawY());
            }

            public final boolean onDown(MotionEvent motionevent)
            {
                motionevent = a;
                motionevent.e = ((HorizontalListView) (motionevent)).d.isFinished();
                ((HorizontalListView) (motionevent)).d.forceFinished(true);
                return true;
            }

            public final boolean onFling(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                return a.a(f1);
            }

            public final void onLongPress(MotionEvent motionevent)
            {
                int i1;
                int j1;
                j1 = a.getChildCount();
                i1 = 0;
_L7:
                if (i1 >= j1) goto _L2; else goto _L1
_L1:
                View view;
                int k1;
                view = a.getChildAt(i1);
                k1 = HorizontalListView.c(a) + 1 + i1;
                if (!a(motionevent, view)) goto _L4; else goto _L3
_L3:
                if (!view.performLongClick()) goto _L5; else goto _L2
_L2:
                android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener;
                return;
_L5:
                if ((onitemlongclicklistener = a.getOnItemLongClickListener()) != null && onitemlongclicklistener.onItemLongClick(a, view, k1, a.a.getItemId(k1))) goto _L2; else goto _L4
_L4:
                i1++;
                if (true) goto _L7; else goto _L6
_L6:
            }

            public final boolean onScroll(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
            {
                synchronized (a)
                {
                    motionevent1 = a;
                    motionevent1.c = ((HorizontalListView) (motionevent1)).c + (int)f1;
                }
                a.requestLayout();
                return true;
                motionevent1;
                motionevent;
                JVM INSTR monitorexit ;
                throw motionevent1;
            }

            public final boolean onSingleTapConfirmed(MotionEvent motionevent)
            {
                if (a.e)
                {
                    int i1 = 0;
                    while (i1 < a.getChildCount()) 
                    {
                        View view = a.getChildAt(i1);
                        int j1 = HorizontalListView.c(a) + 1 + i1;
                        if (a(motionevent, view))
                        {
                            if (view.performClick())
                            {
                                return true;
                            }
                            Object obj = a.getOnItemClickListener();
                            if (obj != null)
                            {
                                ((android.widget.AdapterView.OnItemClickListener) (obj)).onItemClick(a, view, j1, a.a.getItemId(j1));
                                return true;
                            }
                            obj = a.getOnItemSelectedListener();
                            if (obj != null)
                            {
                                ((android.widget.AdapterView.OnItemSelectedListener) (obj)).onItemSelected(a, view, j1, a.a.getItemId(j1));
                                return true;
                            }
                        }
                        i1++;
                    }
                }
                return false;
            }

            
            {
                a = HorizontalListView.this;
                super();
            }
        };
        b();
        p = context.getResources().getDisplayMetrics().density * 10F;
    }

    private View a(View view)
    {
        a.getCount();
        view.setPadding(0, view.getPaddingTop(), 0, view.getPaddingBottom());
        return view;
    }

    private void a(View view, int i1)
    {
        android.view.ViewGroup.LayoutParams layoutparams1 = view.getLayoutParams();
        android.view.ViewGroup.LayoutParams layoutparams = layoutparams1;
        if (layoutparams1 == null)
        {
            layoutparams = new android.view.ViewGroup.LayoutParams(-1, -1);
        }
        addViewInLayout(view, i1, layoutparams, true);
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth(), 0x80000000), android.view.View.MeasureSpec.makeMeasureSpec(getHeight(), 0x80000000));
    }

    static boolean a(HorizontalListView horizontallistview)
    {
        horizontallistview.l = true;
        return true;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        f = -1;
        g = 0;
        i = 0;
        b = 0;
        c = 0;
        h = 0x7fffffff;
        d = new Scroller(getContext());
        j = new GestureDetector(getContext(), t);
        new ListView(getContext());
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    static void b(HorizontalListView horizontallistview)
    {
        horizontallistview.c();
    }

    static int c(HorizontalListView horizontallistview)
    {
        return horizontallistview.f;
    }

    private void c()
    {
        this;
        JVM INSTR monitorenter ;
        b();
        removeAllViewsInLayout();
        requestLayout();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final ListAdapter a()
    {
        return a;
    }

    public final void a(int i1)
    {
        d.startScroll(c, 0, i1 - c, 0, 0);
        requestLayout();
    }

    public final void a(ListAdapter listadapter)
    {
        if (a != null)
        {
            a.unregisterDataSetObserver(r);
        }
        a = listadapter;
        a.registerDataSetObserver(r);
        c();
    }

    protected final boolean a(float f1)
    {
        this;
        JVM INSTR monitorenter ;
        d.fling(c, 0, (int)(-f1), 0, 0, h, 0, 0);
        this;
        JVM INSTR monitorexit ;
        requestLayout();
        return true;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public volatile Adapter getAdapter()
    {
        return a;
    }

    public View getSelectedView()
    {
        return null;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        if (getParent() == null)
        {
            return false;
        }
        switch (i1)
        {
        default:
            return false;

        case 0: // '\0'
            n = motionevent.getX();
            break;
        }
        o = motionevent.getY();
        m = 0;
        return true;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        super.onLayout(flag, i1, j1, k1, l1);
        obj = a;
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (!l) goto _L4; else goto _L3
_L3:
        if (!d.isFinished())
        {
            break MISSING_BLOCK_LABEL_237;
        }
        i1 = b;
_L6:
        b();
        removeAllViewsInLayout();
        c = i1;
_L4:
        if (d.computeScrollOffset())
        {
            c = d.getCurrX();
        }
        if (c <= 0)
        {
            c = 0;
            d.forceFinished(true);
        }
        if (c >= h)
        {
            c = h;
            d.forceFinished(true);
        }
        j1 = b - c;
        obj = getChildAt(0);
_L5:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        if (((View) (obj)).getRight() + j1 > 0)
        {
            break MISSING_BLOCK_LABEL_248;
        }
        i = i + ((View) (obj)).getMeasuredWidth();
        if (a.getItemViewType(f + 1) != -2)
        {
            k.offer(obj);
        }
        removeViewInLayout(((View) (obj)));
        f = f + 1;
        obj = getChildAt(0);
          goto _L5
        i1 = d.getFinalX();
          goto _L6
_L8:
        obj = getChildAt(getChildCount() - 1);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_337;
        }
        if (((View) (obj)).getLeft() + j1 < getWidth())
        {
            break MISSING_BLOCK_LABEL_337;
        }
        if (a.getItemViewType(g - 1) != -2)
        {
            k.offer(obj);
        }
        removeViewInLayout(((View) (obj)));
        g = g - 1;
        if (true) goto _L8; else goto _L7
_L7:
        Exception exception;
        exception;
        throw exception;
        exception = getChildAt(getChildCount() - 1);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_728;
        }
        i1 = exception.getRight();
_L13:
        while (i1 + j1 < getWidth() && g < a.getCount()) 
        {
            exception = a(a.getView(g, (View)k.poll(), this));
            a(exception, -1);
            i1 = exception.getMeasuredWidth() + i1;
            if (g == a.getCount() - 1)
            {
                h = (b + i1) - getWidth();
            }
            if (h < 0)
            {
                h = 0;
            }
            g = g + 1;
        }
        exception = getChildAt(0);
        if (exception == null)
        {
            break MISSING_BLOCK_LABEL_723;
        }
        i1 = exception.getLeft();
_L9:
        if (i1 + j1 <= 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        if (f < 0)
        {
            break MISSING_BLOCK_LABEL_606;
        }
        View view = a(a.getView(f, (View)k.poll(), this));
        a(view, 0);
        k1 = view.getMeasuredWidth();
        f = f - 1;
        i = i - view.getMeasuredWidth();
        i1 -= k1;
          goto _L9
        if (getChildCount() <= 0) goto _L11; else goto _L10
_L10:
        i = i + j1;
        j1 = i;
        i1 = ((flag1) ? 1 : 0);
_L12:
        if (i1 >= getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        View view1 = getChildAt(i1);
        k1 = view1.getMeasuredWidth();
        view1.layout(j1, 0, j1 + k1, view1.getMeasuredHeight());
        j1 += k1;
        i1++;
        if (true) goto _L12; else goto _L11
_L11:
        b = c;
        if (l || !d.isFinished())
        {
            post(s);
        }
        l = false;
          goto _L1
        i1 = 0;
          goto _L9
        i1 = 0;
          goto _L13
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        ViewParent viewparent = getParent();
        if (viewparent != null) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        if (motionevent.getPointerCount() > 1)
        {
            q = false;
        }
        motionevent.getActionMasked();
        JVM INSTR tableswitch 0 3: default 60
    //                   0 101
    //                   1 190
    //                   2 111
    //                   3 190;
           goto _L3 _L4 _L5 _L6 _L5
_L3:
        boolean flag = false;
_L7:
        boolean flag2 = super.onTouchEvent(motionevent);
        boolean flag1 = flag2;
        if (flag)
        {
            flag1 = flag2 | j.onTouchEvent(motionevent);
        }
        if (flag && flag1)
        {
            return true;
        }
          goto _L1
_L4:
        q = true;
        flag = true;
          goto _L7
_L6:
label0:
        {
            if (m != 2)
            {
                break label0;
            }
            flag = false;
        }
          goto _L7
        if (m != 1)
        {
            if (n - motionevent.getX() <= p && (n <= p || motionevent.getX() - n <= p))
            {
                continue; /* Loop/switch isn't completed */
            }
            m = 1;
            viewparent.requestDisallowInterceptTouchEvent(true);
        }
_L5:
        flag = true;
          goto _L7
        if (Math.abs(motionevent.getY() - o) <= p || !q) goto _L3; else goto _L8
_L8:
        m = 2;
        flag = false;
          goto _L7
    }

    public void setAdapter(Adapter adapter)
    {
        a((ListAdapter)adapter);
    }

    public void setSelection(int i1)
    {
    }
}
