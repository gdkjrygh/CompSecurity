// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package se.emilsjolander.stickylistheaders;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsListView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.SectionIndexer;

// Referenced classes of package se.emilsjolander.stickylistheaders:
//            j, a, i, g, 
//            h

public class StickyListHeadersListView extends FrameLayout
{
    private class a extends DataSetObserver
    {

        final StickyListHeadersListView a;

        public void onChanged()
        {
            StickyListHeadersListView.e(a);
        }

        public void onInvalidated()
        {
            StickyListHeadersListView.e(a);
        }

        private a()
        {
            a = StickyListHeadersListView.this;
            super();
        }

    }

    private class b
        implements a.a
    {

        final StickyListHeadersListView a;

        public void a(View view, int i1, long l1)
        {
            StickyListHeadersListView.d(a).a(a, view, i1, l1, false);
        }

        private b()
        {
            a = StickyListHeadersListView.this;
            super();
        }

    }

    public static interface c
    {

        public abstract void a(StickyListHeadersListView stickylistheaderslistview, View view, int i1, long l1, boolean flag);
    }

    public static interface d
    {

        public abstract void a(StickyListHeadersListView stickylistheaderslistview, View view, int i1, long l1);
    }

    public static interface e
    {

        public abstract void a(StickyListHeadersListView stickylistheaderslistview, View view, int i1);
    }

    private class f
        implements android.widget.AbsListView.OnScrollListener
    {

        final StickyListHeadersListView a;

        public void onScroll(AbsListView abslistview, int i1, int j1, int k1)
        {
            if (StickyListHeadersListView.f(a) != null)
            {
                StickyListHeadersListView.f(a).onScroll(abslistview, i1, j1, k1);
            }
            StickyListHeadersListView.a(a, StickyListHeadersListView.g(a).a());
        }

        public void onScrollStateChanged(AbsListView abslistview, int i1)
        {
            if (StickyListHeadersListView.f(a) != null)
            {
                StickyListHeadersListView.f(a).onScrollStateChanged(abslistview, i1);
            }
        }

        private f()
        {
            a = StickyListHeadersListView.this;
            super();
        }

    }

    private class g
        implements j.a
    {

        final StickyListHeadersListView a;

        public void a(Canvas canvas)
        {
label0:
            {
                if (android.os.Build.VERSION.SDK_INT < 8)
                {
                    StickyListHeadersListView.a(a, StickyListHeadersListView.g(a).a());
                }
                if (StickyListHeadersListView.a(a) != null)
                {
                    if (!StickyListHeadersListView.h(a))
                    {
                        break label0;
                    }
                    canvas.save();
                    canvas.clipRect(0, StickyListHeadersListView.i(a), a.getRight(), a.getBottom());
                    StickyListHeadersListView.a(a, canvas, StickyListHeadersListView.a(a), 0L);
                    canvas.restore();
                }
                return;
            }
            StickyListHeadersListView.b(a, canvas, StickyListHeadersListView.a(a), 0L);
        }

        private g()
        {
            a = StickyListHeadersListView.this;
            super();
        }

    }


    private j a;
    private View b;
    private Long c;
    private Integer d;
    private Integer e;
    private android.widget.AbsListView.OnScrollListener f;
    private se.emilsjolander.stickylistheaders.a g;
    private boolean h;
    private boolean i;
    private boolean j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private c p;
    private e q;
    private d r;
    private a s;
    private Drawable t;
    private int u;

    public StickyListHeadersListView(Context context)
    {
        this(context, null);
    }

    public StickyListHeadersListView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, R.attr.stickyListHeadersListViewStyle);
    }

    public StickyListHeadersListView(Context context, AttributeSet attributeset, int i1)
    {
        boolean flag1;
        flag1 = true;
        super(context, attributeset, i1);
        h = true;
        i = true;
        j = true;
        k = 0;
        l = 0;
        m = 0;
        n = 0;
        o = 0;
        a = new j(context);
        t = a.getDivider();
        u = a.getDividerHeight();
        a.setDivider(null);
        a.setDividerHeight(0);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        context = context.getTheme().obtainStyledAttributes(attributeset, R.styleable.StickyListHeadersListView, i1, 0);
        i1 = context.getDimensionPixelSize(R.styleable.StickyListHeadersListView_android_padding, 0);
        l = context.getDimensionPixelSize(R.styleable.StickyListHeadersListView_android_paddingLeft, i1);
        m = context.getDimensionPixelSize(R.styleable.StickyListHeadersListView_android_paddingTop, i1);
        n = context.getDimensionPixelSize(R.styleable.StickyListHeadersListView_android_paddingRight, i1);
        o = context.getDimensionPixelSize(R.styleable.StickyListHeadersListView_android_paddingBottom, i1);
        setPadding(l, m, n, o);
        i = context.getBoolean(R.styleable.StickyListHeadersListView_android_clipToPadding, true);
        super.setClipToPadding(true);
        a.setClipToPadding(i);
        i1 = context.getInt(R.styleable.StickyListHeadersListView_android_scrollbars, 512);
        attributeset = a;
        boolean flag;
        if ((i1 & 0x200) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        attributeset.setVerticalScrollBarEnabled(flag);
        attributeset = a;
        if ((i1 & 0x100) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        attributeset.setHorizontalScrollBarEnabled(flag);
        if (android.os.Build.VERSION.SDK_INT >= 9)
        {
            a.setOverScrollMode(context.getInt(R.styleable.StickyListHeadersListView_android_overScrollMode, 0));
        }
        a.setFadingEdgeLength(context.getDimensionPixelSize(R.styleable.StickyListHeadersListView_android_fadingEdgeLength, a.getVerticalFadingEdgeLength()));
        i1 = context.getInt(R.styleable.StickyListHeadersListView_android_requiresFadingEdge, 0);
        if (i1 != 4096) goto _L4; else goto _L3
_L3:
        a.setVerticalFadingEdgeEnabled(false);
        a.setHorizontalFadingEdgeEnabled(true);
_L5:
        a.setCacheColorHint(context.getColor(R.styleable.StickyListHeadersListView_android_cacheColorHint, a.getCacheColorHint()));
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a.setChoiceMode(context.getInt(R.styleable.StickyListHeadersListView_android_choiceMode, a.getChoiceMode()));
        }
        a.setDrawSelectorOnTop(context.getBoolean(R.styleable.StickyListHeadersListView_android_drawSelectorOnTop, false));
        a.setFastScrollEnabled(context.getBoolean(R.styleable.StickyListHeadersListView_android_fastScrollEnabled, a.isFastScrollEnabled()));
        if (android.os.Build.VERSION.SDK_INT >= 11)
        {
            a.setFastScrollAlwaysVisible(context.getBoolean(R.styleable.StickyListHeadersListView_android_fastScrollAlwaysVisible, a.isFastScrollAlwaysVisible()));
        }
        a.setScrollBarStyle(context.getInt(R.styleable.StickyListHeadersListView_android_scrollbarStyle, 0));
        if (context.hasValue(R.styleable.StickyListHeadersListView_android_listSelector))
        {
            a.setSelector(context.getDrawable(R.styleable.StickyListHeadersListView_android_listSelector));
        }
        a.setScrollingCacheEnabled(context.getBoolean(R.styleable.StickyListHeadersListView_android_scrollingCache, a.isScrollingCacheEnabled()));
        if (context.hasValue(R.styleable.StickyListHeadersListView_android_divider))
        {
            t = context.getDrawable(R.styleable.StickyListHeadersListView_android_divider);
        }
        a.setStackFromBottom(context.getBoolean(R.styleable.StickyListHeadersListView_android_stackFromBottom, false));
        u = context.getDimensionPixelSize(R.styleable.StickyListHeadersListView_android_dividerHeight, u);
        a.setTranscriptMode(context.getInt(R.styleable.StickyListHeadersListView_android_transcriptMode, 0));
        h = context.getBoolean(R.styleable.StickyListHeadersListView_hasStickyHeaders, true);
        j = context.getBoolean(R.styleable.StickyListHeadersListView_isDrawingListUnderStickyHeader, true);
        context.recycle();
_L2:
        a.a(new g());
        a.setOnScrollListener(new f());
        addView(a);
        return;
_L4:
        if (i1 != 8192)
        {
            break MISSING_BLOCK_LABEL_710;
        }
        a.setVerticalFadingEdgeEnabled(true);
        a.setHorizontalFadingEdgeEnabled(false);
          goto _L5
        attributeset;
        context.recycle();
        throw attributeset;
        a.setVerticalFadingEdgeEnabled(false);
        a.setHorizontalFadingEdgeEnabled(false);
          goto _L5
    }

    static View a(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.b;
    }

    private void a()
    {
        if (b != null)
        {
            removeView(b);
            b = null;
            c = null;
            d = null;
            e = null;
            a.a(0);
            c();
        }
    }

    private void a(int i1)
    {
label0:
        {
            boolean flag2 = false;
            int j1;
            if (g == null)
            {
                j1 = 0;
            } else
            {
                j1 = g.getCount();
            }
            if (j1 == 0 || !h)
            {
                return;
            }
            int k1 = i1 - a.getHeaderViewsCount();
            i1 = k1;
            if (a.getChildCount() > 0)
            {
                i1 = k1;
                if (a.getChildAt(0).getBottom() < d())
                {
                    i1 = k1 + 1;
                }
            }
            boolean flag;
            boolean flag1;
            if (a.getChildCount() != 0)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            if (k1 && a.getFirstVisiblePosition() == 0 && a.getChildAt(0).getTop() >= d())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (i1 <= j1 - 1)
            {
                flag = flag2;
                if (i1 >= 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
        if (!k1 || flag || flag1)
        {
            a();
            return;
        } else
        {
            b(i1);
            return;
        }
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (layoutparams == null)
        {
            view.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -2));
        } else
        if (layoutparams.height == -1 || layoutparams.width == -2)
        {
            layoutparams.height = -2;
            layoutparams.width = -1;
            view.setLayoutParams(layoutparams);
            return;
        }
    }

    static void a(StickyListHeadersListView stickylistheaderslistview, int i1)
    {
        stickylistheaderslistview.a(i1);
    }

    static boolean a(StickyListHeadersListView stickylistheaderslistview, Canvas canvas, View view, long l1)
    {
        return stickylistheaderslistview.drawChild(canvas, view, l1);
    }

    static Integer b(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.d;
    }

    private void b(int i1)
    {
        int j1;
        if (d == null || d.intValue() != i1)
        {
            d = Integer.valueOf(i1);
            long l1 = g.a(i1);
            if (c == null || c.longValue() != l1)
            {
                c = Long.valueOf(l1);
                View view = g.a(d.intValue(), b, this);
                if (b != view)
                {
                    if (view == null)
                    {
                        throw new NullPointerException("header may not be null");
                    }
                    i(view);
                }
                a(b);
                h(b);
                if (r != null)
                {
                    r.a(this, b, i1, c.longValue());
                }
                e = null;
            }
        }
        j1 = d();
        i1 = 0;
_L3:
        if (i1 >= a.getChildCount())
        {
            break MISSING_BLOCK_LABEL_309;
        }
        View view1 = a.getChildAt(i1);
        boolean flag;
        boolean flag1;
        if ((view1 instanceof i) && ((i)view1).a())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = a.a(view1);
        if (view1.getTop() < d() || !flag && !flag1) goto _L2; else goto _L1
_L1:
        i1 = Math.min(view1.getTop() - b.getMeasuredHeight(), j1);
_L4:
        o(i1);
        if (!j)
        {
            a.a(b.getMeasuredHeight() + e.intValue());
        }
        c();
        return;
_L2:
        i1++;
          goto _L3
        i1 = j1;
          goto _L4
    }

    static boolean b(StickyListHeadersListView stickylistheaderslistview, Canvas canvas, View view, long l1)
    {
        return stickylistheaderslistview.drawChild(canvas, view, l1);
    }

    static Long c(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.c;
    }

    private void c()
    {
        int j1 = d();
        int k1 = a.getChildCount();
        int i1 = 0;
        while (i1 < k1) 
        {
            Object obj = a.getChildAt(i1);
            if (obj instanceof i)
            {
                obj = (i)obj;
                if (((i) (obj)).a())
                {
                    View view = ((i) (obj)).d;
                    if (((i) (obj)).getTop() < j1)
                    {
                        if (view.getVisibility() != 4)
                        {
                            view.setVisibility(4);
                        }
                    } else
                    if (view.getVisibility() != 0)
                    {
                        view.setVisibility(0);
                    }
                }
            }
            i1++;
        }
    }

    private int d()
    {
        int j1 = k;
        int i1;
        if (i)
        {
            i1 = m;
        } else
        {
            i1 = 0;
        }
        return i1 + j1;
    }

    static c d(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.p;
    }

    static void e(StickyListHeadersListView stickylistheaderslistview)
    {
        stickylistheaderslistview.a();
    }

    static android.widget.AbsListView.OnScrollListener f(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.f;
    }

    static j g(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.a;
    }

    private void h(View view)
    {
        if (view != null)
        {
            measureChild(view, android.view.View.MeasureSpec.makeMeasureSpec(getMeasuredWidth() - l - n, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(0, 0));
        }
    }

    static boolean h(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.i;
    }

    static int i(StickyListHeadersListView stickylistheaderslistview)
    {
        return stickylistheaderslistview.m;
    }

    private void i(View view)
    {
        if (b != null)
        {
            removeView(b);
        }
        b = view;
        addView(b);
        if (p != null)
        {
            b.setOnClickListener(new android.view.View.OnClickListener() {

                final StickyListHeadersListView a;

                public void onClick(View view1)
                {
                    StickyListHeadersListView.d(a).a(a, StickyListHeadersListView.a(a), StickyListHeadersListView.b(a).intValue(), StickyListHeadersListView.c(a).longValue(), true);
                }

            
            {
                a = StickyListHeadersListView.this;
                super();
            }
            });
        }
        b.setClickable(true);
    }

    private void o(int i1)
    {
        if (e == null || e.intValue() != i1)
        {
            e = Integer.valueOf(i1);
            if (android.os.Build.VERSION.SDK_INT >= 11)
            {
                b.setTranslationY(e.intValue());
            } else
            {
                android.view.ViewGroup.MarginLayoutParams marginlayoutparams = (android.view.ViewGroup.MarginLayoutParams)b.getLayoutParams();
                marginlayoutparams.topMargin = e.intValue();
                b.setLayoutParams(marginlayoutparams);
            }
            if (q != null)
            {
                q.a(this, b, -e.intValue());
            }
        }
    }

    private boolean p(int i1)
    {
        return i1 == 0 || g.a(i1) != g.a(i1 - 1);
    }

    private boolean q(int i1)
    {
        if (android.os.Build.VERSION.SDK_INT < i1)
        {
            Log.e("StickyListHeaders", (new StringBuilder()).append("Api lvl must be at least ").append(i1).append(" to call this method").toString());
            return false;
        } else
        {
            return true;
        }
    }

    public boolean A()
    {
        return a.isStackFromBottom();
    }

    public void a(int i1, int j1)
    {
        if (q(8))
        {
            a.smoothScrollBy(i1, j1);
        }
    }

    public void a(int i1, int j1, int k1)
    {
        int i2 = 0;
        if (q(11))
        {
            int l1;
            if (g == null)
            {
                l1 = 0;
            } else
            {
                l1 = c(i1);
            }
            if (!i)
            {
                i2 = m;
            }
            a.smoothScrollToPositionFromTop(i1, (l1 + j1) - i2, k1);
        }
    }

    public void a(int i1, boolean flag)
    {
        a.setItemChecked(i1, flag);
    }

    public void a(Drawable drawable)
    {
        t = drawable;
        if (g != null)
        {
            g.a(t, u);
        }
    }

    public void a(View view, Object obj, boolean flag)
    {
        a.addHeaderView(view, obj, flag);
    }

    public void a(android.widget.AbsListView.MultiChoiceModeListener multichoicemodelistener)
    {
        if (q(11))
        {
            a.setMultiChoiceModeListener(multichoicemodelistener);
        }
    }

    public void a(android.widget.AbsListView.OnScrollListener onscrolllistener)
    {
        f = onscrolllistener;
    }

    public void a(android.widget.AdapterView.OnItemClickListener onitemclicklistener)
    {
        a.setOnItemClickListener(onitemclicklistener);
    }

    public void a(android.widget.AdapterView.OnItemLongClickListener onitemlongclicklistener)
    {
        a.setOnItemLongClickListener(onitemlongclicklistener);
    }

    public void a(c c1)
    {
label0:
        {
            p = c1;
            if (g != null)
            {
                if (p == null)
                {
                    break label0;
                }
                g.a(new b());
                if (b != null)
                {
                    b.setOnClickListener(new android.view.View.OnClickListener() {

                        final StickyListHeadersListView a;

                        public void onClick(View view)
                        {
                            StickyListHeadersListView.d(a).a(a, StickyListHeadersListView.a(a), StickyListHeadersListView.b(a).intValue(), StickyListHeadersListView.c(a).longValue(), true);
                        }

            
            {
                a = StickyListHeadersListView.this;
                super();
            }
                    });
                }
            }
            return;
        }
        g.a(null);
    }

    public void a(d d1)
    {
        r = d1;
    }

    public void a(e e1)
    {
        q = e1;
    }

    public void a(h h1)
    {
        if (h1 == null)
        {
            if (g instanceof se.emilsjolander.stickylistheaders.g)
            {
                ((se.emilsjolander.stickylistheaders.g)g).b = null;
            }
            if (g != null)
            {
                g.a = null;
            }
            a.setAdapter(null);
            a();
            return;
        }
        if (g != null)
        {
            g.unregisterDataSetObserver(s);
        }
        if (h1 instanceof SectionIndexer)
        {
            g = new se.emilsjolander.stickylistheaders.g(getContext(), h1);
        } else
        {
            g = new se.emilsjolander.stickylistheaders.a(getContext(), h1);
        }
        s = new a();
        g.registerDataSetObserver(s);
        if (p != null)
        {
            g.a(new b());
        } else
        {
            g.a(null);
        }
        g.a(t, u);
        a.setAdapter(g);
        a();
    }

    public h b()
    {
        if (g == null)
        {
            return null;
        } else
        {
            return g.a;
        }
    }

    public void b(int i1, int j1)
    {
        if (q(8))
        {
            a.smoothScrollToPosition(i1, j1);
        }
    }

    public void b(Drawable drawable)
    {
        a.setSelector(drawable);
    }

    public void b(View view)
    {
        a.addHeaderView(view);
    }

    public void b(View view, Object obj, boolean flag)
    {
        a.addFooterView(view, obj, flag);
    }

    public void b(boolean flag)
    {
        h = flag;
        if (!flag)
        {
            a();
        } else
        {
            a(a.a());
        }
        a.invalidate();
    }

    public int c(int i1)
    {
        int j1 = 0;
        if (!p(Math.max(0, i1 - m())))
        {
            View view = g.a(i1, null, a);
            if (view == null)
            {
                throw new NullPointerException("header may not be null");
            }
            a(view);
            h(view);
            j1 = view.getMeasuredHeight();
        }
        return j1;
    }

    public void c(int i1, int j1)
    {
        int l1 = 0;
        if (q(11))
        {
            int k1;
            if (g == null)
            {
                k1 = 0;
            } else
            {
                k1 = c(i1);
            }
            if (!i)
            {
                l1 = m;
            }
            a.smoothScrollToPositionFromTop(i1, (k1 + j1) - l1);
        }
    }

    public void c(View view)
    {
        a.removeHeaderView(view);
    }

    public void c(boolean flag)
    {
        j = flag;
        a.a(0);
    }

    public boolean canScrollVertically(int i1)
    {
        return a.canScrollVertically(i1);
    }

    public void d(int i1)
    {
        k = i1;
        a(a.a());
    }

    public void d(int i1, int j1)
    {
        int l1 = 0;
        int k1;
        if (g == null)
        {
            k1 = 0;
        } else
        {
            k1 = c(i1);
        }
        if (!i)
        {
            l1 = m;
        }
        a.setSelectionFromTop(i1, (k1 + j1) - l1);
    }

    public void d(View view)
    {
        a.addFooterView(view);
    }

    public void d(boolean flag)
    {
        a.setFastScrollEnabled(flag);
    }

    protected void dispatchDraw(Canvas canvas)
    {
        if (a.getVisibility() == 0 || a.getAnimation() != null)
        {
            drawChild(canvas, a, 0L);
        }
    }

    public View e(int i1)
    {
        return a.getChildAt(i1);
    }

    public void e(View view)
    {
        a.removeFooterView(view);
    }

    public void e(boolean flag)
    {
        if (q(11))
        {
            a.setFastScrollAlwaysVisible(flag);
        }
    }

    public boolean e()
    {
        return h;
    }

    public void f(int i1)
    {
        u = i1;
        if (g != null)
        {
            g.a(t, u);
        }
    }

    public void f(View view)
    {
        a.setEmptyView(view);
    }

    public void f(boolean flag)
    {
        a.a(flag);
    }

    public boolean f()
    {
        return e();
    }

    public int g()
    {
        return k;
    }

    public int g(View view)
    {
        return a.getPositionForView(view);
    }

    public void g(int i1)
    {
        if (q(11))
        {
            a.smoothScrollByOffset(i1);
        }
    }

    public void g(boolean flag)
    {
        a.setStackFromBottom(flag);
    }

    public int getOverScrollMode()
    {
        if (q(9))
        {
            return a.getOverScrollMode();
        } else
        {
            return 0;
        }
    }

    public int getPaddingBottom()
    {
        return o;
    }

    public int getPaddingLeft()
    {
        return l;
    }

    public int getPaddingRight()
    {
        return n;
    }

    public int getPaddingTop()
    {
        return m;
    }

    public int getScrollBarStyle()
    {
        return a.getScrollBarStyle();
    }

    public void h(int i1)
    {
        int k1;
label0:
        {
            k1 = 0;
            if (q(8))
            {
                if (android.os.Build.VERSION.SDK_INT >= 11)
                {
                    break label0;
                }
                a.smoothScrollToPosition(i1);
            }
            return;
        }
        int j1;
        if (g == null)
        {
            j1 = 0;
        } else
        {
            j1 = c(i1);
        }
        if (!i)
        {
            k1 = m;
        }
        a.smoothScrollToPositionFromTop(i1, j1 - k1);
    }

    public boolean h()
    {
        return j;
    }

    public int i()
    {
        return a.getChildCount();
    }

    public void i(int i1)
    {
        d(i1, 0);
    }

    public boolean isHorizontalScrollBarEnabled()
    {
        return a.isHorizontalScrollBarEnabled();
    }

    public boolean isVerticalScrollBarEnabled()
    {
        return a.isVerticalScrollBarEnabled();
    }

    public ListView j()
    {
        return a;
    }

    public void j(int i1)
    {
        a.setSelector(i1);
    }

    public Drawable k()
    {
        return t;
    }

    public void k(int i1)
    {
        a.setChoiceMode(i1);
    }

    public int l()
    {
        return u;
    }

    public Object l(int i1)
    {
        return a.getItemAtPosition(i1);
    }

    public int m()
    {
        return a.getHeaderViewsCount();
    }

    public long m(int i1)
    {
        return a.getItemIdAtPosition(i1);
    }

    public int n()
    {
        return a.getFooterViewsCount();
    }

    public void n(int i1)
    {
        a.setTranscriptMode(i1);
    }

    public View o()
    {
        return a.getEmptyView();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        a.layout(0, 0, a.getMeasuredWidth(), getHeight());
        if (b != null)
        {
            i1 = ((android.view.ViewGroup.MarginLayoutParams)b.getLayoutParams()).topMargin;
            b.layout(l, i1, b.getMeasuredWidth() + l, b.getMeasuredHeight() + i1);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        h(b);
    }

    public void onRestoreInstanceState(Parcelable parcelable)
    {
        super.onRestoreInstanceState(android.view.View.BaseSavedState.EMPTY_STATE);
        a.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState()
    {
        if (super.onSaveInstanceState() != android.view.View.BaseSavedState.EMPTY_STATE)
        {
            throw new IllegalStateException("Handling non empty state of parent class is not implemented");
        } else
        {
            return a.onSaveInstanceState();
        }
    }

    public void p()
    {
        a.setSelectionAfterHeaderView();
    }

    public int q()
    {
        return a.getFirstVisiblePosition();
    }

    public int r()
    {
        return a.getLastVisiblePosition();
    }

    public int s()
    {
        if (q(11))
        {
            return a.getCheckedItemCount();
        } else
        {
            return 0;
        }
    }

    public void setClipToPadding(boolean flag)
    {
        if (a != null)
        {
            a.setClipToPadding(flag);
        }
        i = flag;
    }

    public void setHorizontalScrollBarEnabled(boolean flag)
    {
        a.setHorizontalScrollBarEnabled(flag);
    }

    public void setOnCreateContextMenuListener(android.view.View.OnCreateContextMenuListener oncreatecontextmenulistener)
    {
        a.setOnCreateContextMenuListener(oncreatecontextmenulistener);
    }

    public void setOnTouchListener(android.view.View.OnTouchListener ontouchlistener)
    {
        if (ontouchlistener != null)
        {
            a.setOnTouchListener(new android.view.View.OnTouchListener(ontouchlistener) {

                final android.view.View.OnTouchListener a;
                final StickyListHeadersListView b;

                public boolean onTouch(View view, MotionEvent motionevent)
                {
                    return a.onTouch(b, motionevent);
                }

            
            {
                b = StickyListHeadersListView.this;
                a = ontouchlistener;
                super();
            }
            });
            return;
        } else
        {
            a.setOnTouchListener(null);
            return;
        }
    }

    public void setOverScrollMode(int i1)
    {
        if (q(9) && a != null)
        {
            a.setOverScrollMode(i1);
        }
    }

    public void setPadding(int i1, int j1, int k1, int l1)
    {
        l = i1;
        m = j1;
        n = k1;
        o = l1;
        if (a != null)
        {
            a.setPadding(i1, j1, k1, l1);
        }
        super.setPadding(0, 0, 0, 0);
        requestLayout();
    }

    public void setScrollBarStyle(int i1)
    {
        a.setScrollBarStyle(i1);
    }

    public void setVerticalScrollBarEnabled(boolean flag)
    {
        a.setVerticalScrollBarEnabled(flag);
    }

    public boolean showContextMenu()
    {
        return a.showContextMenu();
    }

    public long[] t()
    {
        if (q(8))
        {
            return a.getCheckedItemIds();
        } else
        {
            return null;
        }
    }

    public int u()
    {
        return a.getCheckedItemPosition();
    }

    public SparseBooleanArray v()
    {
        return a.getCheckedItemPositions();
    }

    public int w()
    {
        return a.getCount();
    }

    public void x()
    {
        a.invalidateViews();
    }

    protected void y()
    {
        setPadding(l, m, n, o);
    }

    public boolean z()
    {
        if (android.os.Build.VERSION.SDK_INT < 11)
        {
            return false;
        } else
        {
            return a.isFastScrollAlwaysVisible();
        }
    }
}
