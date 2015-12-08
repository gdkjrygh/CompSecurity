// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.views;

import android.content.Context;
import android.database.DataSetObserver;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.Scroller;
import java.util.LinkedList;
import java.util.Queue;

// Referenced classes of package com.jcp.views:
//            o, q, p

public class HorizontalListView extends AdapterView
{

    protected ListAdapter a;
    protected int b;
    protected int c;
    protected Scroller d;
    private boolean e;
    private int f;
    private int g;
    private int h;
    private int i;
    private GestureDetector j;
    private Queue k;
    private android.widget.AdapterView.OnItemSelectedListener l;
    private android.widget.AdapterView.OnItemClickListener m;
    private android.widget.AdapterView.OnItemLongClickListener n;
    private boolean o;
    private DataSetObserver p;
    private android.view.GestureDetector.OnGestureListener q;

    public HorizontalListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = true;
        f = -1;
        h = 0x7fffffff;
        k = new LinkedList();
        p = new o(this);
        q = new q(this);
        a();
    }

    private void a()
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
        j = new GestureDetector(getContext(), q);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(int i1)
    {
        boolean flag = false;
        View view = getChildAt(getChildCount() - 1);
        int j1;
        if (view != null)
        {
            j1 = view.getRight();
        } else
        {
            j1 = 0;
        }
        a(j1, i1);
        view = getChildAt(0);
        j1 = ((flag) ? 1 : 0);
        if (view != null)
        {
            j1 = view.getLeft();
        }
        b(j1, i1);
    }

    private void a(int i1, int j1)
    {
        for (; i1 + j1 < getWidth() && g < a.getCount(); g = g + 1)
        {
            View view = a.getView(g, (View)k.poll(), this);
            a(view, -1);
            i1 += view.getMeasuredWidth();
            if (g == a.getCount() - 1)
            {
                h = (b + i1) - getWidth();
            }
            if (h < 0)
            {
                h = 0;
            }
        }

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

    static void a(HorizontalListView horizontallistview)
    {
        horizontallistview.b();
    }

    static boolean a(HorizontalListView horizontallistview, boolean flag)
    {
        horizontallistview.o = flag;
        return flag;
    }

    static android.widget.AdapterView.OnItemClickListener b(HorizontalListView horizontallistview)
    {
        return horizontallistview.m;
    }

    private void b()
    {
        this;
        JVM INSTR monitorenter ;
        a();
        removeAllViewsInLayout();
        requestLayout();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void b(int i1)
    {
        for (View view = getChildAt(0); view != null && view.getRight() + i1 <= 0; view = getChildAt(0))
        {
            i = i + view.getMeasuredWidth();
            k.offer(view);
            removeViewInLayout(view);
            f = f + 1;
        }

        for (View view1 = getChildAt(getChildCount() - 1); view1 != null && view1.getLeft() + i1 >= getWidth(); view1 = getChildAt(getChildCount() - 1))
        {
            k.offer(view1);
            removeViewInLayout(view1);
            g = g - 1;
        }

    }

    private void b(int i1, int j1)
    {
        while (i1 + j1 > 0 && f >= 0) 
        {
            View view = a.getView(f, (View)k.poll(), this);
            a(view, 0);
            i1 -= view.getMeasuredWidth();
            f = f - 1;
            i = i - view.getMeasuredWidth();
        }
    }

    static int c(HorizontalListView horizontallistview)
    {
        return horizontallistview.f;
    }

    private void c(int i1)
    {
        if (getChildCount() > 0)
        {
            i = i + i1;
            int j1 = i;
            for (i1 = 0; i1 < getChildCount(); i1++)
            {
                View view = getChildAt(i1);
                int k1 = view.getMeasuredWidth();
                view.layout(j1, 0, j1 + k1, view.getMeasuredHeight());
                j1 += view.getPaddingRight() + k1;
            }

        }
    }

    static android.widget.AdapterView.OnItemSelectedListener d(HorizontalListView horizontallistview)
    {
        return horizontallistview.l;
    }

    static android.widget.AdapterView.OnItemLongClickListener e(HorizontalListView horizontallistview)
    {
        return horizontallistview.n;
    }

    protected boolean a(MotionEvent motionevent)
    {
        d.forceFinished(true);
        return true;
    }

    protected boolean a(MotionEvent motionevent, MotionEvent motionevent1, float f1, float f2)
    {
        this;
        JVM INSTR monitorenter ;
        d.fling(c, 0, (int)(-f1), 0, 0, h, 0, 0);
        this;
        JVM INSTR monitorexit ;
        requestLayout();
        return true;
        motionevent;
        this;
        JVM INSTR monitorexit ;
        throw motionevent;
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return super.dispatchTouchEvent(motionevent) | j.onTouchEvent(motionevent);
    }

    public volatile Adapter getAdapter()
    {
        return getAdapter();
    }

    public ListAdapter getAdapter()
    {
        return a;
    }

    public View getSelectedView()
    {
        return null;
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        this;
        JVM INSTR monitorenter ;
        ListAdapter listadapter;
        super.onLayout(flag, i1, j1, k1, l1);
        listadapter = a;
        if (listadapter != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (o)
        {
            i1 = b;
            a();
            removeAllViewsInLayout();
            c = i1;
            o = false;
        }
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
        i1 = b - c;
        b(i1);
        a(i1);
        c(i1);
        b = c;
        if (!d.isFinished())
        {
            post(new p(this));
        }
        if (true) goto _L1; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (a != null)
        {
            a.unregisterDataSetObserver(p);
        }
        a = listadapter;
        a.registerDataSetObserver(p);
        b();
    }

    public void setOnItemClickListener(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        m = onitemclicklistener;
    }

    public void setOnItemLongClickListener(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        n = onitemlongclicklistener;
    }

    public void setOnItemSelectedListener(android.widget.AdapterView.OnItemSelectedListener onitemselectedlistener)
    {
        l = onitemselectedlistener;
    }

    public void setSelection(int i1)
    {
    }
}
