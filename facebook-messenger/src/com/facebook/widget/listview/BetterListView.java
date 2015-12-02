// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget.listview;

import android.content.Context;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.facebook.common.b.a;
import com.facebook.common.v.f;
import com.facebook.inject.t;
import com.facebook.widget.b.b;
import com.facebook.widget.r;

// Referenced classes of package com.facebook.widget.listview:
//            a, b, c, m

public class BetterListView extends ListView
    implements r
{

    private static final boolean k;
    private b a;
    private com.facebook.widget.f.a b;
    private MotionEvent c;
    private boolean d;
    private f e;
    private android.widget.AbsListView.OnScrollListener f;
    private android.view.ViewTreeObserver.OnPreDrawListener g;
    private a h;
    private int i;
    private int j;

    public BetterListView(Context context)
    {
        super(context);
        i = 0;
        j = 0;
        a(context);
    }

    public BetterListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        i = 0;
        j = 0;
        a(context);
    }

    public BetterListView(Context context, AttributeSet attributeset, int l)
    {
        super(context, attributeset, l);
        i = 0;
        j = 0;
        a(context);
    }

    private void a(Context context)
    {
        a = new b();
        super.setOnScrollListener(a.a());
        c = null;
        b = null;
        d = false;
        e = null;
        f = new com.facebook.widget.listview.a(this);
        e = (f)t.a(getContext()).a(com/facebook/common/v/f);
        h = new a();
        g = new com.facebook.widget.listview.b(this);
    }

    private boolean d()
    {
        boolean flag;
label0:
        {
            boolean flag1 = false;
            int l = getChildCount();
            flag = flag1;
            if (l <= 0)
            {
                break label0;
            }
            int i1 = getFirstVisiblePosition();
            if (i1 + l != getCount() || getChildAt(l - 1).getBottom() > getHeight())
            {
                flag = flag1;
                if (i1 != 0)
                {
                    break label0;
                }
                flag = flag1;
                if (getChildAt(0).getTop() < 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    protected void a()
    {
        if (c != null)
        {
            MotionEvent motionevent = b.a(c, 2, getNextEstimatedDrawTime());
            super.onTouchEvent(motionevent);
            motionevent.recycle();
            c.recycle();
            c = null;
        }
    }

    public void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        a.b(onscrolllistener);
    }

    public void b(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        a.c(onscrolllistener);
    }

    public boolean b()
    {
        int l = getAdapter().getCount();
        int i1 = getChildCount();
        int j1 = getLastVisiblePosition();
        return i1 <= 0 || j1 != l - 1 ? i1 == 0 : getChildAt(getChildCount() - 1).getBottom() == getHeight();
    }

    public void c()
    {
        if (android.os.Build.VERSION.SDK_INT < 14)
        {
            return;
        } else
        {
            setOverScrollMode(2);
            return;
        }
    }

    protected void c(int l)
    {
label0:
        {
            int i1 = l;
            if (k)
            {
                i1 = l;
                if (d())
                {
                    i1 = 0;
                }
            }
            if (i1 != j)
            {
                j = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                e.b(this);
            }
            return;
        }
        e.a(this);
    }

    protected long getNextEstimatedDrawTime()
    {
        return SystemClock.uptimeMillis();
    }

    protected void onAttachedToWindow()
    {
        getViewTreeObserver().addOnPreDrawListener(g);
        super.onAttachedToWindow();
    }

    protected void onDetachedFromWindow()
    {
        getViewTreeObserver().removeOnPreDrawListener(g);
        super.onDetachedFromWindow();
        e.b(this);
    }

    protected void onMeasure(int l, int i1)
    {
        i = l;
        super.onMeasure(l, i1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag1 = true;
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT < 14 || android.os.Build.VERSION.SDK_INT > 15)
        {
            flag = super.onTouchEvent(motionevent);
        } else
        {
            if (b == null)
            {
                b = new com.facebook.widget.f.a();
            }
            if (!isEnabled())
            {
                flag = flag1;
                if (!isClickable())
                {
                    flag = flag1;
                    if (!isLongClickable())
                    {
                        return false;
                    }
                }
            } else
            {
                b.a(motionevent);
                switch (motionevent.getActionMasked())
                {
                default:
                    if (c != null)
                    {
                        c.recycle();
                        c = null;
                    }
                    return super.onTouchEvent(motionevent);

                case 2: // '\002'
                    break;
                }
                if (c != null)
                {
                    c.recycle();
                }
                c = MotionEvent.obtain(motionevent);
                invalidate();
                return true;
            }
        }
        return flag;
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        boolean flag1 = true;
        for (int l = 0; l < h.size(); l++)
        {
            flag1 &= ((c)h.a(l)).a(this, view);
        }

        if (flag1)
        {
            super.removeDetachedView(view, flag);
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        ListAdapter listadapter1 = getAdapter();
        if (listadapter1 != listadapter && (listadapter1 instanceof m))
        {
            setRecyclerListener(null);
        }
        super.setAdapter(listadapter);
    }

    public void setBroadcastInteractionChanges(boolean flag)
    {
        d = flag;
        if (d)
        {
            a(f);
            return;
        } else
        {
            b(f);
            return;
        }
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        a.a(onscrolllistener);
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT <= 10)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
    }
}
