// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import com.facebook.common.b.a;
import com.facebook.inject.t;
import com.facebook.q;
import com.facebook.reflex.Container;
import com.facebook.reflex.Scroller;
import com.facebook.reflex.Transaction;
import com.facebook.reflex.Widget;
import com.facebook.reflex.a.c;
import com.facebook.reflex.ah;
import com.facebook.reflex.view.b.j;
import com.facebook.reflex.view.b.m;
import com.facebook.reflex.view.b.r;
import com.facebook.reflex.view.c.d;
import com.facebook.reflex.view.c.f;
import com.facebook.reflex.view.c.i;
import com.facebook.reflex.view.c.l;
import com.facebook.reflex.view.c.n;
import com.facebook.reflex.view.c.o;
import com.facebook.reflex.view.c.s;
import com.facebook.widget.b.b;
import com.facebook.widget.listview.BetterListView;

// Referenced classes of package com.facebook.reflex.view:
//            m, i, l, j

public class h extends BetterListView
    implements r
{

    private final Scroller a;
    private final Container b;
    private final f c;
    private final m d;
    private final b e;
    private final a f;
    private final c g;
    private final o h;
    private final Transaction i;
    private l j;
    private d k;
    private ListAdapter l;
    private s m;
    private float n;
    private boolean o;
    private int p;
    private int q;
    private int r;
    private android.view.ContextMenu.ContextMenuInfo s;

    public h(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public h(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        f = new a();
        p = 0;
        q = 0;
        r = 0;
        setWillNotDraw(false);
        t t1 = t.a(context);
        i = (Transaction)t1.a(com/facebook/reflex/Transaction);
        g = (c)t1.a(com/facebook/reflex/a/c);
        a = new Scroller();
        b = new Container();
        b.a(false);
        a.a(b);
        c = new com.facebook.reflex.view.m(this, null);
        h = new o(this, b);
        d = new com.facebook.reflex.view.i(this, this);
        g();
        a.a(new com.facebook.reflex.view.l(this, null));
        e = new b();
        context = context.obtainStyledAttributes(attributeset, q.ListView);
        h.a(context.getColor(q.ListView_selectorColor, 0xff5f90ff));
        h.b(context.getColor(q.ListView_longpressSelectorColor, 0xff3e65b3));
        context.recycle();
    }

    static float a(h h1, float f1)
    {
        h1.n = f1;
        return f1;
    }

    static d a(h h1, d d1)
    {
        h1.k = d1;
        return d1;
    }

    static o a(h h1)
    {
        return h1.h;
    }

    static void a(h h1, Canvas canvas)
    {
        h1.AbsListView.draw(canvas);
    }

    static void a(h h1, View view)
    {
        h1.detachViewFromParent(view);
    }

    static void a(h h1, View view, boolean flag)
    {
        h1.removeDetachedView(view, flag);
    }

    static boolean a(h h1, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        return h1.addViewInLayout(view, i1, layoutparams);
    }

    static d b(h h1)
    {
        return h1.k;
    }

    static void b(h h1, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        h1.attachViewToParent(view, i1, layoutparams);
    }

    static void c(h h1)
    {
        h1.i();
    }

    static Scroller d(h h1)
    {
        return h1.a;
    }

    static s e(h h1)
    {
        return h1.m;
    }

    static f f(h h1)
    {
        return h1.c;
    }

    static Transaction g(h h1)
    {
        return h1.i;
    }

    private void g()
    {
        if (a == null)
        {
            return;
        }
        Object obj = getBackground();
        Scroller scroller;
        boolean flag;
        if (obj != null && ((Drawable) (obj)).isVisible())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && (obj instanceof ColorDrawable))
        {
            if (((ColorDrawable)obj).getAlpha() > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        scroller = a;
        if (flag)
        {
            obj = d;
        } else
        {
            obj = null;
        }
        scroller.a(((com.facebook.reflex.d) (obj)));
    }

    static c h(h h1)
    {
        return h1.g;
    }

    private void h()
    {
        if (k != null)
        {
            o = true;
            k.a(n);
            o = false;
        }
    }

    private void i()
    {
        if (k != null)
        {
            k.a(p + r);
            k.b(q);
        }
    }

    static void i(h h1)
    {
        h1.h();
    }

    static Container j(h h1)
    {
        return h1.b;
    }

    static a k(h h1)
    {
        return h1.f;
    }

    static float l(h h1)
    {
        return h1.n;
    }

    static l m(h h1)
    {
        return h1.j;
    }

    static b n(h h1)
    {
        return h1.e;
    }

    public int a(int i1)
    {
        return k.d(i1);
    }

    public void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        e.b(onscrolllistener);
    }

    public void a(ah ah)
    {
        f.add(ah);
    }

    public int b(int i1)
    {
        return k.c(i1);
    }

    public void b(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        e.c(onscrolllistener);
    }

    public boolean d()
    {
        return true;
    }

    protected void dispatchDraw(Canvas canvas)
    {
    }

    public boolean dispatchTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void draw(Canvas canvas)
    {
        super.draw(com.facebook.reflex.view.b.j.a());
    }

    public void e()
    {
        d.f();
    }

    public View f()
    {
        return this;
    }

    public volatile Adapter getAdapter()
    {
        return getAdapter();
    }

    public ListAdapter getAdapter()
    {
        return l;
    }

    public com.facebook.reflex.d getBackingContent()
    {
        return null;
    }

    public Widget getBackingWidget()
    {
        return a;
    }

    protected android.view.ContextMenu.ContextMenuInfo getContextMenuInfo()
    {
        return s;
    }

    public int getFirstVisiblePosition()
    {
        if (k == null)
        {
            return 0;
        } else
        {
            return k.c((int)n);
        }
    }

    public int getLastVisiblePosition()
    {
        if (k == null)
        {
            return 0;
        } else
        {
            return Math.min(m.a() - 1, k.c((int)(n + (float)a.g())));
        }
    }

    public int getOverflowListOverlap()
    {
        return r;
    }

    public int getPaddingBottom()
    {
        return q;
    }

    public int getPaddingTop()
    {
        return p;
    }

    public com.facebook.widget.refreshablelistview.b getRefreshableInterface()
    {
        if (j == null)
        {
            n n1 = new n(getContext());
            addViewInLayout(n1, -1, new android.widget.AbsListView.LayoutParams(-1, -2));
            b.a(n1.getBackingWidget());
            j = new l(this, a, n1);
        }
        return j;
    }

    public int getScrollOffsetX()
    {
        return getScrollX();
    }

    public int getScrollOffsetY()
    {
        return (int)n;
    }

    public void invalidate()
    {
        ((com.facebook.reflex.j)getContext()).a(this);
    }

    public void invalidate(int i1, int j1, int k1, int l1)
    {
        ((com.facebook.reflex.j)getContext()).a(this);
    }

    public void invalidate(Rect rect)
    {
        ((com.facebook.reflex.j)getContext()).a(this);
    }

    public ViewParent invalidateChildInParent(int ai[], Rect rect)
    {
        ((com.facebook.reflex.j)getContext()).a(this);
        return null;
    }

    protected void layoutChildren()
    {
    }

    protected void onFinishInflate()
    {
    }

    protected void onFocusChanged(boolean flag, int i1, Rect rect)
    {
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        a.a(k1 - i1, l1 - j1);
        if (j != null)
        {
            j.c();
        }
        if (k1 - i1 != d.f_() || l1 - j1 != d.b())
        {
            d.a(k1 - i1, l1 - j1);
        }
        h();
    }

    protected void onMeasure(int i1, int j1)
    {
        setMeasuredDimension(getDefaultSize(getSuggestedMinimumWidth(), i1), getDefaultSize(getSuggestedMinimumHeight(), j1));
        if (j != null)
        {
            j.d();
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
    }

    public void requestLayout()
    {
        if (!o)
        {
            super.requestLayout();
        }
    }

    public volatile void setAdapter(Adapter adapter)
    {
        setAdapter((ListAdapter)adapter);
    }

    public void setAdapter(ListAdapter listadapter)
    {
        if (listadapter == null)
        {
            setAdapter((s)null);
        } else
        {
            setAdapter(((i) (new com.facebook.reflex.view.c.a(listadapter, this))));
        }
        l = listadapter;
    }

    public void setAdapter(i i1)
    {
        if (i1 == null)
        {
            setAdapter((s)null);
            return;
        } else
        {
            setAdapter(((s) (new com.facebook.reflex.view.c.j(i1))));
            return;
        }
    }

    public void setAdapter(s s1)
    {
        l = null;
        if (k != null)
        {
            k.a();
        }
        if (m != null)
        {
            m.a(null);
            m.c();
        }
        m = s1;
        k = null;
        if (m != null)
        {
            k = new d(a, m, c, i, g);
            m.a(new com.facebook.reflex.view.j(this));
        }
        requestLayout();
    }

    public void setBackground(Drawable drawable)
    {
        g();
        super.setBackground(drawable);
    }

    public void setBroadcastInteractionChanges(boolean flag)
    {
    }

    public void setContextMenuInfo(android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        s = contextmenuinfo;
    }

    public void setLongClickable(boolean flag)
    {
        h.a(flag);
        super.setLongClickable(flag);
    }

    public void setOnScrollListener(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        e.a(onscrolllistener);
    }

    public void setOverflowListOverlap(int i1)
    {
        r = i1;
        i();
    }

    public void setPaddingBottom(int i1)
    {
        q = i1;
        i();
    }

    public void setPaddingTop(int i1)
    {
        p = i1;
        i();
    }

    public void setSelection(int i1)
    {
    }

    public void smoothScrollBy(int i1, int j1)
    {
    }
}
