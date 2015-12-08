// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.widget.recycler;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.f;
import android.support.v7.widget.g;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

// Referenced classes of package com.skype.android.widget.recycler:
//            OnSpanCountListener, OnStretchListener, ReservedViewTypes

public class TwoWayRecyclerView extends RecyclerView
    implements OnSpanCountListener
{
    public static class AutoSizeLayoutManager extends TwoWayLayoutManager
    {

        public final void a(int i)
        {
            int j = i;
            if (i <= 0)
            {
                j = 1;
            }
            super.a(j);
        }

        public final void a(android.support.v7.widget.g.c c1)
        {
            throw new UnsupportedOperationException("TwoWayLayoutManager has its own built-in SpanSizeLookup");
        }

        protected final int b(int i)
        {
            return Math.min(i, ((getItemCount() + b()) - 1) / b());
        }

        public final boolean c()
        {
            return true;
        }

        public boolean canScrollHorizontally()
        {
            return false;
        }

        public boolean canScrollVertically()
        {
            return false;
        }

        public View getFocusedChild()
        {
            return null;
        }

        public boolean hasFocus()
        {
            return false;
        }

        public boolean isFocused()
        {
            return false;
        }

        public void offsetChildrenHorizontal(int i)
        {
        }

        public void offsetChildrenVertical(int i)
        {
        }

        public void onItemsAdded(RecyclerView recyclerview, int i, int j)
        {
            super.onItemsAdded(recyclerview, i, j);
            if (getItemCount() > 0)
            {
                scrollToPosition(0);
            }
        }

        public void onItemsChanged(RecyclerView recyclerview)
        {
            super.onItemsChanged(recyclerview);
            if (getItemCount() > 0)
            {
                scrollToPosition(0);
            }
        }

        public void onItemsMoved(RecyclerView recyclerview, int i, int j, int k)
        {
            super.onItemsMoved(recyclerview, i, j, k);
            if (getItemCount() > 0)
            {
                scrollToPosition(0);
            }
        }

        public void onItemsRemoved(RecyclerView recyclerview, int i, int j)
        {
            super.onItemsRemoved(recyclerview, i, j);
            if (getItemCount() > 0)
            {
                scrollToPosition(0);
                return;
            } else
            {
                requestLayout();
                return;
            }
        }

        public AutoSizeLayoutManager(Context context, int i, int j, int k, int l, int i1, int j1, 
                int k1, int l1)
        {
            super(context, i, j, k, l, i1, j1, k1, l1);
            super.a(new FlatSpanSizeLookup());
        }
    }

    public static class FlatSpanSizeLookup extends android.support.v7.widget.g.c
    {

        public int getSpanGroupIndex(int i, int j)
        {
            return ((i + j) - 1) / j;
        }

        public int getSpanIndex(int i, int j)
        {
            return i % j;
        }

        public int getSpanSize(int i)
        {
            return 1;
        }

        public FlatSpanSizeLookup()
        {
        }
    }

    public static class HierarchicalLayoutManager extends TwoWayLayoutManager
    {

        private final a j;
        private OnSpanCountListener k;

        public final void a(int i)
        {
            int l = i;
            if (i <= 0)
            {
                l = 1;
            }
            if (l != b())
            {
                super.a(l);
                if (j != null)
                {
                    j.a(l);
                    if (k != null)
                    {
                        if (j.a())
                        {
                            l = 1;
                        }
                        k.onSpanCount(l);
                    }
                }
            }
        }

        public final void a(android.support.v7.widget.g.c c1)
        {
            throw new UnsupportedOperationException("TwoWayLayoutManager has its own built-in SpanSizeLookup");
        }

        public final void a(OnSpanCountListener onspancountlistener)
        {
            k = onspancountlistener;
        }

        public final boolean c()
        {
            return false;
        }

        public void setOrientation(int i)
        {
            boolean flag = true;
            super.setOrientation(i);
            if (j != null)
            {
                a a1 = j;
                if (getOrientation() != 1)
                {
                    flag = false;
                }
                a1.a(flag);
            }
        }

        public HierarchicalLayoutManager(Context context, int i, int l, int i1, int j1, int k1, int l1, 
                int i2, int j2, a a1)
        {
            boolean flag = true;
            super(context, i, l, i1, j1, k1, l1, i2, j2);
            if (i != 1)
            {
                flag = false;
            }
            a1.a(flag);
            j = a1;
            super.a(a1);
        }
    }

    public static final class StretchItemDecoration extends android.support.v7.widget.RecyclerView.g
        implements OnStretchListener
    {

        final int a;
        int b;
        int c;
        int d;
        final android.support.v7.widget.g.c e;

        public final void a(int i, int j, int k)
        {
            d = k;
            b = i;
            c = j;
        }

        public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerview, android.support.v7.widget.RecyclerView.s s)
        {
            int i;
            switch (a)
            {
            case 2: // '\002'
            default:
                super.getItemOffsets(rect, view, recyclerview, s);
                return;

            case 1: // '\001'
            case 3: // '\003'
                i = recyclerview.getChildAdapterPosition(view);
                break;
            }
            int j = e.getSpanSize(i);
            int k = e.getSpanIndex(i, c);
            int l = b / c;
            i = b % c;
            if (k < i)
            {
                i = Math.min(j, i - k);
            } else
            {
                i = 0;
            }
            l = l * j + i;
            i = c - j;
            if (i != 0)
            {
                i = (l * k) / i;
            } else
            {
                i = l / 2;
            }
            j = l - i;
            if (d == 0)
            {
                rect.left = rect.left + i;
                rect.right = rect.right + j;
                return;
            } else
            {
                rect.top = rect.top + i;
                rect.bottom = rect.bottom + j;
                return;
            }
        }

        public StretchItemDecoration(android.support.v7.widget.g.c c1, int i)
        {
            e = c1;
            a = i;
        }
    }

    public static abstract class TwoWayLayoutManager extends g
    {

        private static final Appetite q = new TwoWayLayoutManager.Appetite() {

            public final int a(int i)
            {
                return i;
            }

        };
        private final Dimension j;
        private final Dimension k;
        private final Dimension l[];
        private int m;
        private boolean n;
        private boolean o;
        private OnStretchListener p;
        private final Appetite r = new _cls2(this);
        private final Appetite s = new _cls3(this);

        static int a(TwoWayLayoutManager twowaylayoutmanager)
        {
            return twowaylayoutmanager.e();
        }

        private void a(android.support.v7.widget.RecyclerView.o o1)
        {
            if (o)
            {
                View view = o1.c(0);
                if (view != null)
                {
                    int i = j.a();
                    int i1 = k.a();
                    android.support.v7.widget.RecyclerView.j j1 = (android.support.v7.widget.RecyclerView.j)view.getLayoutParams();
                    view.measure(ViewGroup.getChildMeasureSpec(i, getPaddingLeft() + getPaddingRight(), j1.width), ViewGroup.getChildMeasureSpec(i1, getPaddingTop() + getPaddingBottom(), j1.height));
                    j.s = view.getMeasuredWidth();
                    k.s = view.getMeasuredHeight();
                    o1.a(view);
                }
                return;
            } else
            {
                j.s = android.view.View.MeasureSpec.getSize(j.h);
                k.s = android.view.View.MeasureSpec.getSize(k.h);
                return;
            }
        }

        private int e()
        {
            Dimension dimension = f();
            Dimension dimension1 = g();
            return Math.max(Math.max(dimension.b, dimension.i) * Math.max(dimension1.c, dimension1.i), getChildCount());
        }

        private Dimension f()
        {
            return l[1 - getOrientation()];
        }

        private Dimension g()
        {
            return l[getOrientation()];
        }

        private static int h(int i)
        {
            if (android.view.View.MeasureSpec.getMode(i) == 0x40000000)
            {
                return android.view.View.MeasureSpec.getSize(i);
            } else
            {
                return 0;
            }
        }

        public final void a(OnStretchListener onstretchlistener)
        {
            p = onstretchlistener;
        }

        public final void a(boolean flag)
        {
            n = flag;
        }

        protected int b(int i)
        {
            int i1 = getItemCount();
            if (i1 > 1)
            {
                i1 = a().getSpanGroupIndex(i1, b());
            }
            return Math.min(i, i1);
        }

        public final void b(boolean flag)
        {
            o = flag;
        }

        public final void c(int i)
        {
            j.b = i;
        }

        public abstract boolean c();

        public final int d()
        {
            return k.b;
        }

        public final void d(int i)
        {
            k.b = i;
        }

        public final void e(int i)
        {
            j.a = i;
        }

        public final void f(int i)
        {
            k.a = i;
        }

        public final void g(int i)
        {
            m = i;
        }

        protected int getExtraLayoutSpace(android.support.v7.widget.RecyclerView.s s1)
        {
            if (m > 0)
            {
                return m * e();
            } else
            {
                return super.getExtraLayoutSpace(s1);
            }
        }

        public void onMeasure(android.support.v7.widget.RecyclerView.o o1, android.support.v7.widget.RecyclerView.s s1, int i, int i1)
        {
            if (getItemCount() <= 0)
            {
                setMeasuredDimension(h(i), h(i1));
                return;
            }
            Dimension.a(f(), false);
            Dimension.a(g(), true);
            Dimension.a(j, i);
            Dimension.a(k, i1);
            Dimension dimension = f();
            Dimension dimension1 = g();
            a(o1);
            Appetite appetite;
            if (dimension.m && n)
            {
                appetite = r;
            } else
            {
                appetite = q;
            }
            dimension.a(appetite);
            if (dimension.p)
            {
                a(dimension.i);
            }
            if (dimension.o && !dimension.n)
            {
                p.a(android.view.View.MeasureSpec.getSize(dimension.e) - dimension.g, b(), 1 - getOrientation());
            }
            a(o1);
            dimension1.a(s);
            if (j.n && k.n)
            {
                setMeasuredDimension(j.g, k.g);
                return;
            } else
            {
                super.onMeasure(o1, s1, j.e, k.e);
                return;
            }
        }

        public void scrollToPosition(int i)
        {
            scrollToPositionWithOffset(i, 0);
        }

        public boolean supportsPredictiveItemAnimations()
        {
            return false;
        }


        public TwoWayLayoutManager(Context context, int i, int i1, int j1, int k1, int l1, int i2, 
                int j2, int k2)
        {
            super(context, 1, i);
            o = true;
            j = new Dimension(i1, k1, i2, k2);
            k = new Dimension(j1, l1, j2, k2);
            l = (new Dimension[] {
                j, k
            });
        }
    }

    public static interface TwoWayLayoutManager.Appetite
    {

        public abstract int a(int i);
    }

    public static class TwoWayLayoutManager.Dimension
    {

        int a;
        int b;
        int c;
        int d;
        int e;
        int f;
        int g;
        int h;
        int i;
        int j;
        boolean k;
        boolean l;
        boolean m;
        boolean n;
        boolean o;
        boolean p;
        boolean q;
        boolean r;
        public int s;

        static void a(TwoWayLayoutManager.Dimension dimension, int i1)
        {
            boolean flag1 = true;
            dimension.e = i1;
            dimension.f = android.view.View.MeasureSpec.getMode(i1);
            dimension.g = android.view.View.MeasureSpec.getSize(i1);
            int j1;
            boolean flag;
            if (dimension.f != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dimension.m = flag;
            if (dimension.f != 0x40000000)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            dimension.n = flag;
            if (dimension.k)
            {
                j1 = dimension.a;
            } else
            {
                j1 = 0x7fffffff;
            }
            if (dimension.m)
            {
                int k1 = dimension.g;
                i1 = k1;
                if (dimension.l)
                {
                    i1 = k1 / dimension.d;
                }
            } else
            {
                i1 = 0x7fffffff;
            }
            i1 = Math.min(j1, i1);
            if (i1 == 0x7fffffff)
            {
                dimension.h = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                return;
            } else
            {
                dimension.h = android.view.View.MeasureSpec.makeMeasureSpec(i1, 0x80000000);
                return;
            }
        }

        static void a(TwoWayLayoutManager.Dimension dimension, boolean flag)
        {
            boolean flag1 = true;
            int i1;
            if (flag)
            {
                i1 = dimension.c;
            } else
            {
                i1 = dimension.b;
            }
            dimension.d = i1;
            if ((dimension.j == 1 || dimension.j == 3) && !flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dimension.o = flag;
            if (dimension.d > 0)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            dimension.l = flag;
        }

        public final int a()
        {
            if (o)
            {
                return 0;
            } else
            {
                return h;
            }
        }

        final void a(TwoWayLayoutManager.Appetite appetite)
        {
            r = false;
            q = false;
            if (s > 0)
            {
                int i1;
                int j1;
                if (m)
                {
                    i1 = g / s;
                } else
                {
                    i1 = 0x7fffffff;
                }
                if (l)
                {
                    j1 = d;
                } else
                {
                    j1 = 0x7fffffff;
                }
                i1 = Math.min(j1, i1);
                j1 = appetite.a(i1);
                if (j1 == i1)
                {
                    r = true;
                } else
                {
                    q = true;
                }
                i = j1;
                p = true;
                if (n || o)
                {
                    g = i * s;
                    if (n)
                    {
                        f = 0x40000000;
                        e = android.view.View.MeasureSpec.makeMeasureSpec(g, f);
                    }
                }
            }
        }

        public TwoWayLayoutManager.Dimension(int i1, int j1, int k1, int l1)
        {
            b = j1;
            c = k1;
            a = i1;
            j = l1;
            boolean flag;
            if (i1 > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k = flag;
        }
    }

    final class a extends android.support.v7.widget.g.c
    {

        final TwoWayRecyclerView a;
        private boolean b;
        private int c;

        public final void a(int i)
        {
            c = i;
        }

        public final void a(boolean flag)
        {
            b = flag;
        }

        public final boolean a()
        {
            return b;
        }

        public final int getSpanSize(int i)
        {
            if (b)
            {
                android.support.v7.widget.RecyclerView.a a1 = a.getAdapter();
                if (i < a1.getItemCount() && a1.getItemViewType(i) == ReservedViewTypes.a.c)
                {
                    return c;
                }
            }
            return 1;
        }

        a()
        {
            a = TwoWayRecyclerView.this;
            super();
        }
    }


    final TwoWayLayoutManager a;
    final int b;
    final int c;
    private OnSpanCountListener d;
    private int e;

    public TwoWayRecyclerView(Context context)
    {
        this(context, null);
    }

    public TwoWayRecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TwoWayRecyclerView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        attributeset = context.obtainStyledAttributes(attributeset, com.skype.android.app.R.styleable.TwoWayRecyclerView, i, 0);
        b = attributeset.getInt(7, 1);
        c = attributeset.getInt(8, 0);
        i = attributeset.getInteger(0, 0);
        int j = attributeset.getInteger(2, -1);
        int k = attributeset.getInteger(4, -1);
        int l = attributeset.getInteger(6, -1);
        int i1 = attributeset.getInteger(5, -1);
        int j1 = Math.round(attributeset.getDimension(1, -1F));
        int k1 = Math.round(attributeset.getDimension(3, -1F));
        boolean flag1 = attributeset.getBoolean(10, true);
        boolean flag2 = attributeset.getBoolean(9, false);
        int l1;
        boolean flag;
        if (!flag2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag = attributeset.getBoolean(11, flag);
        attributeset.recycle();
        l1 = a(context.getResources().getConfiguration());
        if (flag2)
        {
            a = new AutoSizeLayoutManager(context, l1, j1, k1, j, k, l, i1, i);
            setOverScrollMode(2);
        } else
        {
            context = new HierarchicalLayoutManager(context, l1, j1, k1, j, k, l, i1, i, new a());
            context.a(this);
            a = context;
        }
        setAnimate(flag);
        setFocusableInTouchMode(true);
        context = new StretchItemDecoration(a.a(), i);
        a.a(context);
        addItemDecoration(context);
        super.setLayoutManager(a);
        setMeasureChild(flag1);
    }

    private int a(Configuration configuration)
    {
        switch (configuration.orientation)
        {
        default:
            throw new IllegalArgumentException("Malformed Configuration");

        case 2: // '\002'
            return c;

        case 1: // '\001'
            return b;
        }
    }

    public final int a()
    {
        return a.d();
    }

    protected boolean canAnimate()
    {
        return false;
    }

    public boolean canScrollHorizontally(int i)
    {
        return !a.c() && super.canScrollHorizontally(i);
    }

    public boolean canScrollVertically(int i)
    {
        return !a.c() && super.canScrollVertically(i);
    }

    public volatile android.support.v7.widget.RecyclerView.i getLayoutManager()
    {
        return a;
    }

    protected void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        a.setOrientation(a(configuration));
        requestLayout();
    }

    public void onSpanCount(int i)
    {
        if (d != null)
        {
            d.onSpanCount(i);
        }
    }

    public void setAnimate(boolean flag)
    {
        f f1;
        if (flag)
        {
            f1 = new f();
        } else
        {
            f1 = null;
        }
        setItemAnimator(f1);
    }

    public void setCacheLayout(int i)
    {
        e = i;
        setItemViewCacheSize(TwoWayLayoutManager.a(a) * i);
    }

    public void setColumnWidth(int i)
    {
        a.e(i);
        requestLayout();
    }

    public void setConserveSpannedDimension(boolean flag)
    {
        a.a(flag);
    }

    public void setLayoutAhead(int i)
    {
        a.g(i);
    }

    public final void setLayoutManager(android.support.v7.widget.RecyclerView.i i)
    {
        throw new UnsupportedOperationException("TwoWayRecyclerView has its own built-in layout manager");
    }

    public void setMeasureChild(boolean flag)
    {
        a.b(flag);
    }

    public void setNumColumns(int i)
    {
        a.c(i);
        requestLayout();
    }

    public void setNumRows(int i)
    {
        a.d(i);
        requestLayout();
    }

    public void setOnSpanCountListener(OnSpanCountListener onspancountlistener)
    {
        d = onspancountlistener;
    }

    public void setRowHeight(int i)
    {
        a.f(i);
        requestLayout();
    }

    // Unreferenced inner class com/skype/android/widget/recycler/TwoWayRecyclerView$TwoWayLayoutManager$2

/* anonymous class */
    final class TwoWayLayoutManager._cls2
        implements TwoWayLayoutManager.Appetite
    {

        final TwoWayLayoutManager a;

        public final int a(int i)
        {
            return Math.min(i, a.getItemCount());
        }

            
            {
                a = twowaylayoutmanager;
                super();
            }
    }


    // Unreferenced inner class com/skype/android/widget/recycler/TwoWayRecyclerView$TwoWayLayoutManager$3

/* anonymous class */
    final class TwoWayLayoutManager._cls3
        implements TwoWayLayoutManager.Appetite
    {

        final TwoWayLayoutManager a;

        public final int a(int i)
        {
            return a.b(i);
        }

            
            {
                a = twowaylayoutmanager;
                super();
            }
    }

}
