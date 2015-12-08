// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.basepost;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.al;
import android.support.v7.widget.au;
import android.support.v7.widget.ax;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.roidapp.baselib.c.n;
import com.roidapp.baselib.c.y;
import com.roidapp.cloudlib.ap;
import com.roidapp.cloudlib.sns.a.a;
import com.roidapp.cloudlib.sns.a.c;

// Referenced classes of package com.roidapp.cloudlib.sns.basepost:
//            a, c, b

public class PinnedListView2 extends RecyclerView
    implements c
{

    private final Rect h;
    private final PointF i;
    private int j;
    private View k;
    private MotionEvent l;
    private boolean m;
    private com.roidapp.cloudlib.sns.basepost.c n;
    private com.roidapp.cloudlib.sns.basepost.c o;
    private int p;
    private View q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private final ax v;
    private int w;

    public PinnedListView2(Context context)
    {
        super(context);
        h = new Rect();
        i = new PointF();
        m = true;
        v = new com.roidapp.cloudlib.sns.basepost.a(this);
        w = 0;
        a(context);
    }

    public PinnedListView2(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        h = new Rect();
        i = new PointF();
        m = true;
        v = new com.roidapp.cloudlib.sns.basepost.a(this);
        w = 0;
        a(context);
    }

    public PinnedListView2(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        h = new Rect();
        i = new PointF();
        m = true;
        v = new com.roidapp.cloudlib.sns.basepost.a(this);
        w = 0;
        a(context);
    }

    private void a(Context context)
    {
        s = context.getResources().getDimensionPixelSize(ap.e);
        j = ViewConfiguration.get(context).getScaledTouchSlop();
        if (!com.roidapp.baselib.c.n.d())
        {
            u = true;
        }
        a(v);
        com.roidapp.cloudlib.sns.a.a.a(this);
    }

    static void a(PinnedListView2 pinnedlistview2, int i1, int j1, int k1)
    {
        if (pinnedlistview2.m)
        {
            int l1 = pinnedlistview2.s / 2;
            if (pinnedlistview2.q != null)
            {
                l1 = pinnedlistview2.q.getTop();
            }
            if (k1 <= 0)
            {
                pinnedlistview2.k();
            } else
            {
                if (l1 < 0 || l1 >= pinnedlistview2.s)
                {
                    if (i1 <= 0)
                    {
                        pinnedlistview2.k();
                        return;
                    }
                    if (pinnedlistview2.n != null && pinnedlistview2.n.b != i1)
                    {
                        pinnedlistview2.k();
                    }
                }
                if (pinnedlistview2.n == null)
                {
                    pinnedlistview2.d(i1, j1);
                }
                if (pinnedlistview2.n != null)
                {
                    k1 = i1 + 1;
                    if (k1 < pinnedlistview2.b().y())
                    {
                        i1++;
                        if (i1 >= 0)
                        {
                            View view = pinnedlistview2.getChildAt(i1 - j1);
                            if (view != null)
                            {
                                i1 = pinnedlistview2.n.a.getBottom();
                                j1 = pinnedlistview2.getPaddingTop();
                                int i2 = pinnedlistview2.r;
                                i1 = view.getTop() - (i1 + j1 + i2);
                                if (pinnedlistview2.n.b < k1 && i1 < 0)
                                {
                                    pinnedlistview2.p = i1;
                                    return;
                                }
                            }
                            pinnedlistview2.p = 0;
                            return;
                        } else
                        {
                            pinnedlistview2.p = 0;
                            return;
                        }
                    }
                }
            }
        }
    }

    private boolean a(View view, float f, float f1)
    {
        view.getHitRect(h);
        h.top = h.top + p + r;
        view = h;
        view.bottom = ((Rect) (view)).bottom + (p + getPaddingTop() + r);
        view = h;
        view.left = ((Rect) (view)).left + getPaddingLeft();
        view = h;
        view.right = ((Rect) (view)).right - getPaddingRight();
        return h.contains((int)f, (int)f1);
    }

    static boolean a(PinnedListView2 pinnedlistview2)
    {
        return pinnedlistview2.u;
    }

    static boolean b(PinnedListView2 pinnedlistview2)
    {
        return pinnedlistview2.t;
    }

    static boolean c(PinnedListView2 pinnedlistview2)
    {
        pinnedlistview2.t = true;
        return true;
    }

    private void d(int i1, int j1)
    {
        com.roidapp.cloudlib.sns.basepost.c c1 = o;
        o = null;
        if (c1 == null)
        {
            c1 = new com.roidapp.cloudlib.sns.basepost.c();
        }
        q = getChildAt(i1 - j1);
        if (q != null)
        {
            al al1 = a();
            View view = q;
            Object obj = al1;
            if (al1 instanceof y)
            {
                obj = ((y)al1).d();
            }
            if (obj == null)
            {
                obj = null;
            } else
            {
                obj = ((b)obj).a(view);
            }
            if (obj != null)
            {
                android.view.ViewGroup.LayoutParams layoutparams = ((View) (obj)).getLayoutParams();
                int l1 = android.view.View.MeasureSpec.getMode(layoutparams.height);
                int k1 = android.view.View.MeasureSpec.getSize(layoutparams.height);
                j1 = l1;
                if (l1 == 0)
                {
                    j1 = 0x40000000;
                }
                l1 = getHeight() - b().v() - b().x();
                if (k1 > l1)
                {
                    k1 = l1;
                }
                ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(getWidth() - b().u() - b().w(), 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(k1, j1));
                ((View) (obj)).layout(0, 0, ((View) (obj)).getMeasuredWidth(), ((View) (obj)).getMeasuredHeight());
                p = 0;
                c1.a = ((View) (obj));
                c1.b = i1;
                if (a() instanceof y)
                {
                    j1 = ((y)a()).g();
                } else
                {
                    j1 = 0;
                }
                c1.c = i1 - j1;
                c1.d = a().b(i1);
                n = c1;
                return;
            }
        }
    }

    private void m()
    {
        k = null;
        if (l != null)
        {
            l.recycle();
            l = null;
        }
    }

    private void n()
    {
        p = 0;
        r = s;
    }

    public final void a(int i1)
    {
        r = s - Math.abs(i1);
    }

    public final void b(int i1)
    {
        w = i1;
    }

    public final void b(boolean flag)
    {
        m = flag;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (n != null)
        {
            canvas.save();
            canvas.translate(0.0F, p + r);
            drawChild(canvas, n.a, getDrawingTime());
            canvas.restore();
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        float f;
        float f1;
        int i1;
        if (n == null)
        {
            return super.dispatchTouchEvent(motionevent);
        }
        f = motionevent.getX();
        f1 = motionevent.getY();
        i1 = motionevent.getAction();
        if (i1 == 0 && k == null && n != null && a(n.a, f, f1))
        {
            k = n.a;
            i.x = f;
            i.y = f1;
            l = MotionEvent.obtain(motionevent);
        }
        if (k == null) goto _L2; else goto _L1
_L1:
        if (a(k, f, f1))
        {
            k.dispatchTouchEvent(motionevent);
        }
        if (i1 != 1) goto _L4; else goto _L3
_L3:
        super.dispatchTouchEvent(motionevent);
        if (n != null)
        {
            al al1 = a();
            motionevent = al1;
            if (al1 instanceof y)
            {
                motionevent = ((y)al1).d();
            }
            if (motionevent != null)
            {
                Object obj = n.a;
                if (obj != null)
                {
                    ((View) (obj)).sendAccessibilityEvent(1);
                }
                obj = motionevent;
                if (motionevent instanceof y)
                {
                    obj = ((y)motionevent).d();
                }
                if (obj != null)
                {
                    ((b)obj).b_(n.c);
                }
            }
        }
        m();
_L5:
        return true;
_L4:
        if (i1 == 3)
        {
            m();
        } else
        if (i1 == 2 && Math.abs(f1 - i.y) > (float)j)
        {
            MotionEvent motionevent1 = MotionEvent.obtain(motionevent);
            motionevent1.setAction(3);
            k.dispatchTouchEvent(motionevent1);
            motionevent1.recycle();
            super.dispatchTouchEvent(l);
            super.dispatchTouchEvent(motionevent);
            m();
        }
        if (true) goto _L5; else goto _L2
_L2:
        return super.dispatchTouchEvent(motionevent);
    }

    public final ax j()
    {
        return v;
    }

    protected final void k()
    {
        if (n != null)
        {
            o = n;
            n = null;
        }
    }

    protected final void l()
    {
        if (m)
        {
            if (n != null)
            {
                int i1 = n.b;
                Object obj = (LinearLayoutManager)b();
                if (p + r < 0)
                {
                    n();
                    k();
                    d(i1 + 1, ((LinearLayoutManager) (obj)).l());
                    return;
                }
                n();
                obj = getChildAt((i1 + 1) - ((LinearLayoutManager) (obj)).l());
                if (obj != null && ((View) (obj)).getTop() < s + n.a.getHeight())
                {
                    k();
                    return;
                }
            } else
            {
                n();
                return;
            }
        }
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        com.roidapp.cloudlib.sns.a.a.b(this);
    }
}
