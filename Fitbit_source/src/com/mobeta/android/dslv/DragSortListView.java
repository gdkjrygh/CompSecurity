// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobeta.android.dslv;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.os.Environment;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.Checkable;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Referenced classes of package com.mobeta.android.dslv:
//            b, d, e

public class DragSortListView extends ListView
{
    private class a extends BaseAdapter
    {

        final DragSortListView a;
        private ListAdapter b;

        public ListAdapter a()
        {
            return b;
        }

        public boolean areAllItemsEnabled()
        {
            return b.areAllItemsEnabled();
        }

        public int getCount()
        {
            return b.getCount();
        }

        public Object getItem(int i1)
        {
            return b.getItem(i1);
        }

        public long getItemId(int i1)
        {
            return b.getItemId(i1);
        }

        public int getItemViewType(int i1)
        {
            return b.getItemViewType(i1);
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            if (view != null)
            {
                viewgroup = (com.mobeta.android.dslv.d)view;
                View view1 = viewgroup.getChildAt(0);
                View view2 = b.getView(i1, view1, a);
                view = viewgroup;
                if (view2 != view1)
                {
                    if (view1 != null)
                    {
                        viewgroup.removeViewAt(0);
                    }
                    viewgroup.addView(view2);
                    view = viewgroup;
                }
            } else
            {
                viewgroup = b.getView(i1, null, a);
                if (viewgroup instanceof Checkable)
                {
                    view = new com.mobeta.android.dslv.e(a.getContext());
                } else
                {
                    view = new com.mobeta.android.dslv.d(a.getContext());
                }
                view.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
                view.addView(viewgroup);
            }
            DragSortListView.a(a, a.getHeaderViewsCount() + i1, view, true);
            return view;
        }

        public int getViewTypeCount()
        {
            return b.getViewTypeCount();
        }

        public boolean hasStableIds()
        {
            return b.hasStableIds();
        }

        public boolean isEmpty()
        {
            return b.isEmpty();
        }

        public boolean isEnabled(int i1)
        {
            return b.isEnabled(i1);
        }

        public a(ListAdapter listadapter)
        {
            a = DragSortListView.this;
            super();
            b = listadapter;
            b.registerDataSetObserver(new _cls1(this, DragSortListView.this));
        }
    }

    public static interface b
    {

        public abstract void b(int i1, int j1);
    }

    public static interface c
    {

        public abstract float a(float f1, long l1);
    }

    private class d
        implements Runnable
    {

        public static final int a = -1;
        public static final int b = 0;
        public static final int c = 1;
        final DragSortListView d;
        private boolean e;
        private long f;
        private long g;
        private int h;
        private float i;
        private long j;
        private int k;
        private float l;
        private boolean m;
        private int n;
        private int o;

        public void a(int i1)
        {
            if (!m)
            {
                e = false;
                m = true;
                j = SystemClock.uptimeMillis();
                f = j;
                k = i1;
                d.post(this);
            }
        }

        public void a(boolean flag)
        {
            if (flag)
            {
                d.removeCallbacks(this);
                m = false;
                return;
            } else
            {
                e = true;
                return;
            }
        }

        public boolean a()
        {
            return m;
        }

        public int b()
        {
            if (m)
            {
                return k;
            } else
            {
                return -1;
            }
        }

        public void run()
        {
            if (e)
            {
                m = false;
                return;
            }
            int j1 = d.getFirstVisiblePosition();
            int i1 = d.getLastVisiblePosition();
            int l1 = d.getCount();
            int k1 = d.getPaddingTop();
            int i2 = d.getHeight() - k1 - d.getPaddingBottom();
            int j2 = Math.min(DragSortListView.f(d), DragSortListView.r(d) + DragSortListView.d(d));
            int k2 = Math.max(DragSortListView.f(d), DragSortListView.r(d) - DragSortListView.d(d));
            View view1;
            if (k == 0)
            {
                View view = d.getChildAt(0);
                if (view == null)
                {
                    m = false;
                    return;
                }
                if (j1 == 0 && view.getTop() == k1)
                {
                    m = false;
                    return;
                }
                l = DragSortListView.u(d).a((DragSortListView.s(d) - (float)k2) / DragSortListView.t(d), f);
            } else
            {
                View view2 = d.getChildAt(i1 - j1);
                if (view2 == null)
                {
                    m = false;
                    return;
                }
                if (i1 == l1 - 1 && view2.getBottom() <= i2 + k1)
                {
                    m = false;
                    return;
                }
                l = -DragSortListView.u(d).a(((float)j2 - DragSortListView.v(d)) / DragSortListView.w(d), f);
            }
            g = SystemClock.uptimeMillis();
            i = g - f;
            h = Math.round(l * i);
            if (h >= 0)
            {
                h = Math.min(i2, h);
                i1 = j1;
            } else
            {
                h = Math.max(-i2, h);
            }
            view1 = d.getChildAt(i1 - j1);
            l1 = view1.getTop() + h;
            j1 = l1;
            if (i1 == 0)
            {
                j1 = l1;
                if (l1 > k1)
                {
                    j1 = k1;
                }
            }
            DragSortListView.b(d, true);
            d.setSelectionFromTop(i1, j1 - k1);
            d.layoutChildren();
            d.invalidate();
            DragSortListView.b(d, false);
            DragSortListView.c(d, i1, view1, false);
            f = g;
            d.post(this);
        }

        public d()
        {
            d = DragSortListView.this;
            super();
            m = false;
        }
    }

    public static interface e
        extends b, h, m
    {
    }

    private class f
    {

        StringBuilder a;
        File b;
        final DragSortListView c;
        private int d;
        private int e;
        private boolean f;

        public void a()
        {
            a.append("<DSLVStates>\n");
            e = 0;
            f = true;
        }

        public void b()
        {
            if (f)
            {
                a.append("<DSLVState>\n");
                int i2 = c.getChildCount();
                int j2 = c.getFirstVisiblePosition();
                a.append("    <Positions>");
                for (int i1 = 0; i1 < i2; i1++)
                {
                    a.append(j2 + i1).append(",");
                }

                a.append("</Positions>\n");
                a.append("    <Tops>");
                for (int j1 = 0; j1 < i2; j1++)
                {
                    a.append(c.getChildAt(j1).getTop()).append(",");
                }

                a.append("</Tops>\n");
                a.append("    <Bottoms>");
                for (int k1 = 0; k1 < i2; k1++)
                {
                    a.append(c.getChildAt(k1).getBottom()).append(",");
                }

                a.append("</Bottoms>\n");
                a.append("    <FirstExpPos>").append(DragSortListView.l(c)).append("</FirstExpPos>\n");
                a.append("    <FirstExpBlankHeight>").append(DragSortListView.c(c, DragSortListView.l(c)) - DragSortListView.d(c, DragSortListView.l(c))).append("</FirstExpBlankHeight>\n");
                a.append("    <SecondExpPos>").append(DragSortListView.m(c)).append("</SecondExpPos>\n");
                a.append("    <SecondExpBlankHeight>").append(DragSortListView.c(c, DragSortListView.m(c)) - DragSortListView.d(c, DragSortListView.m(c))).append("</SecondExpBlankHeight>\n");
                a.append("    <SrcPos>").append(DragSortListView.h(c)).append("</SrcPos>\n");
                a.append("    <SrcHeight>").append(DragSortListView.j(c) + c.getDividerHeight()).append("</SrcHeight>\n");
                a.append("    <ViewHeight>").append(c.getHeight()).append("</ViewHeight>\n");
                a.append("    <LastY>").append(DragSortListView.x(c)).append("</LastY>\n");
                a.append("    <FloatY>").append(DragSortListView.r(c)).append("</FloatY>\n");
                a.append("    <ShuffleEdges>");
                for (int l1 = 0; l1 < i2; l1++)
                {
                    a.append(DragSortListView.a(c, j2 + l1, c.getChildAt(l1).getTop())).append(",");
                }

                a.append("</ShuffleEdges>\n");
                a.append("</DSLVState>\n");
                d = d + 1;
                if (d > 1000)
                {
                    c();
                    d = 0;
                    return;
                }
            }
        }

        public void c()
        {
            boolean flag;
            flag = false;
            if (!f)
            {
                return;
            }
            FileWriter filewriter;
            IOException ioexception;
            if (e != 0)
            {
                flag = true;
            }
            filewriter = new FileWriter(b, flag);
            filewriter.write(a.toString());
            a.delete(0, a.length());
            filewriter.flush();
            filewriter.close();
            e = e + 1;
            return;
            ioexception;
        }

        public void d()
        {
            if (f)
            {
                a.append("</DSLVStates>\n");
                c();
                f = false;
            }
        }

        public f()
        {
            c = DragSortListView.this;
            super();
            a = new StringBuilder();
            d = 0;
            e = 0;
            f = false;
            b = new File(Environment.getExternalStorageDirectory(), "dslv_state.txt");
            if (b.exists())
            {
                break MISSING_BLOCK_LABEL_77;
            }
            b.createNewFile();
            Log.d("mobeta", "file created");
            return;
            dragsortlistview;
            Log.w("mobeta", "Could not create dslv_state.txt");
            Log.d("mobeta", getMessage());
            return;
        }
    }

    private class g extends n
    {

        final DragSortListView a;
        private int d;
        private int e;
        private float f;
        private float g;

        private int e()
        {
            int i1 = a.getFirstVisiblePosition();
            int j1 = (DragSortListView.i(a) + a.getDividerHeight()) / 2;
            View view = a.getChildAt(d - i1);
            if (view != null)
            {
                if (d == e)
                {
                    return view.getTop();
                }
                if (d < e)
                {
                    return view.getTop() - j1;
                } else
                {
                    return (view.getBottom() + j1) - DragSortListView.j(a);
                }
            } else
            {
                d();
                return -1;
            }
        }

        public void a()
        {
            d = DragSortListView.g(a);
            e = DragSortListView.h(a);
            DragSortListView.b(a, 2);
            f = DragSortListView.e(a).y - e();
            g = DragSortListView.e(a).x - a.getPaddingLeft();
        }

        public void a(float f1, float f2)
        {
            int i1 = e();
            int j1 = a.getPaddingLeft();
            f1 = DragSortListView.e(a).y - i1;
            float f3 = DragSortListView.e(a).x - j1;
            f2 = 1.0F - f2;
            if (f2 < Math.abs(f1 / f) || f2 < Math.abs(f3 / g))
            {
                DragSortListView.e(a).y = i1 + (int)(f * f2);
                DragSortListView.e(a).x = a.getPaddingLeft() + (int)(g * f2);
                DragSortListView.a(a, true);
            }
        }

        public void b()
        {
            DragSortListView.k(a);
        }

        public g(float f1, int i1)
        {
            a = DragSortListView.this;
            super(f1, i1);
        }
    }

    public static interface h
    {

        public abstract void a(int i1, int j1);
    }

    public static interface i
    {

        public abstract View a(int i1);

        public abstract void a(View view);

        public abstract void a(View view, Point point, Point point1);
    }

    private class j
    {

        final DragSortListView a;
        private SparseIntArray b;
        private ArrayList c;
        private int d;

        public int a(int i1)
        {
            return b.get(i1, -1);
        }

        public void a()
        {
            b.clear();
            c.clear();
        }

        public void a(int i1, int j1)
        {
            int k1 = b.get(i1, -1);
            if (k1 != j1)
            {
                if (k1 == -1)
                {
                    if (b.size() == d)
                    {
                        b.delete(((Integer)c.remove(0)).intValue());
                    }
                } else
                {
                    c.remove(Integer.valueOf(i1));
                }
                b.put(i1, j1);
                c.add(Integer.valueOf(i1));
            }
        }

        public j(int i1)
        {
            a = DragSortListView.this;
            super();
            b = new SparseIntArray(i1);
            c = new ArrayList(i1);
            d = i1;
        }
    }

    private class k extends n
    {

        final DragSortListView a;
        private float d;
        private float e;

        public void a()
        {
            d = DragSortListView.c(a);
            e = DragSortListView.d(a);
        }

        public void a(float f1, float f2)
        {
            if (DragSortListView.b(a) != 4)
            {
                d();
                return;
            } else
            {
                DragSortListView.a(a, (int)(e * f2 + (1.0F - f2) * d));
                DragSortListView.e(a).y = DragSortListView.f(a) - DragSortListView.c(a);
                DragSortListView.a(a, true);
                return;
            }
        }

        public k(float f1, int i1)
        {
            a = DragSortListView.this;
            super(f1, i1);
        }
    }

    private class l extends n
    {

        final DragSortListView a;
        private float d;
        private float e;
        private float f;
        private int g;
        private int h;
        private int i;
        private int j;
        private int k;

        public void a()
        {
            float f1;
            int i1;
            i1 = -1;
            g = -1;
            h = -1;
            i = DragSortListView.l(a);
            j = DragSortListView.m(a);
            k = DragSortListView.h(a);
            DragSortListView.b(a, 1);
            d = DragSortListView.e(a).x;
            if (!DragSortListView.n(a))
            {
                break MISSING_BLOCK_LABEL_205;
            }
            f1 = (float)a.getWidth() * 2.0F;
            if (DragSortListView.o(a) != 0.0F) goto _L2; else goto _L1
_L1:
            DragSortListView dragsortlistview = a;
            if (d >= 0.0F)
            {
                i1 = 1;
            }
            DragSortListView.a(dragsortlistview, (float)i1 * f1);
_L4:
            return;
_L2:
            f1 *= 2.0F;
            if (DragSortListView.o(a) < 0.0F && DragSortListView.o(a) > -f1)
            {
                DragSortListView.a(a, -f1);
                return;
            }
            if (DragSortListView.o(a) <= 0.0F || DragSortListView.o(a) >= f1) goto _L4; else goto _L3
_L3:
            DragSortListView.a(a, f1);
            return;
            DragSortListView.p(a);
            return;
        }

        public void a(float f1, float f2)
        {
            View view;
            int l1;
            f1 = 1.0F - f2;
            l1 = a.getFirstVisiblePosition();
            view = a.getChildAt(i - l1);
            if (!DragSortListView.n(a)) goto _L2; else goto _L1
_L1:
            f2 = (float)(SystemClock.uptimeMillis() - b) / 1000F;
            if (f2 != 0.0F) goto _L4; else goto _L3
_L3:
            return;
_L4:
            float f3 = DragSortListView.o(a);
            int i2 = a.getWidth();
            DragSortListView dragsortlistview = a;
            int i1;
            if (DragSortListView.o(a) > 0.0F)
            {
                i1 = 1;
            } else
            {
                i1 = -1;
            }
            DragSortListView.b(dragsortlistview, (float)i1 * f2 * (float)i2);
            d = d + f3 * f2;
            DragSortListView.e(a).x = (int)d;
            if (d < (float)i2 && d > (float)(-i2))
            {
                b = SystemClock.uptimeMillis();
                DragSortListView.a(a, true);
                return;
            }
_L2:
            if (view != null)
            {
                if (g == -1)
                {
                    g = DragSortListView.b(a, i, view, false);
                    e = view.getHeight() - g;
                }
                int j1 = Math.max((int)(e * f1), 1);
                android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
                layoutparams.height = j1 + g;
                view.setLayoutParams(layoutparams);
            }
            if (j != i)
            {
                View view1 = a.getChildAt(j - l1);
                if (view1 != null)
                {
                    if (h == -1)
                    {
                        h = DragSortListView.b(a, j, view1, false);
                        f = view1.getHeight() - h;
                    }
                    int k1 = Math.max((int)(f * f1), 1);
                    android.view.ViewGroup.LayoutParams layoutparams1 = view1.getLayoutParams();
                    layoutparams1.height = k1 + h;
                    view1.setLayoutParams(layoutparams1);
                    return;
                }
            }
            if (true) goto _L3; else goto _L5
_L5:
        }

        public void b()
        {
            DragSortListView.q(a);
        }

        public l(float f1, int i1)
        {
            a = DragSortListView.this;
            super(f1, i1);
            g = -1;
            h = -1;
        }
    }

    public static interface m
    {

        public abstract void a(int i1);
    }

    private class n
        implements Runnable
    {

        private float a;
        protected long b;
        final DragSortListView c;
        private float d;
        private float e;
        private float f;
        private float g;
        private float h;
        private boolean i;

        public float a(float f1)
        {
            if (f1 < d)
            {
                return e * f1 * f1;
            }
            if (f1 < 1.0F - d)
            {
                return f + g * f1;
            } else
            {
                return 1.0F - h * (f1 - 1.0F) * (f1 - 1.0F);
            }
        }

        public void a()
        {
        }

        public void a(float f1, float f2)
        {
        }

        public void b()
        {
        }

        public void c()
        {
            b = SystemClock.uptimeMillis();
            i = false;
            a();
            c.post(this);
        }

        public void d()
        {
            i = true;
        }

        public void run()
        {
            if (i)
            {
                return;
            }
            float f1 = (float)(SystemClock.uptimeMillis() - b) / a;
            if (f1 >= 1.0F)
            {
                a(1.0F, 1.0F);
                b();
                return;
            } else
            {
                a(f1, a(f1));
                c.post(this);
                return;
            }
        }

        public n(float f1, int i1)
        {
            c = DragSortListView.this;
            super();
            d = f1;
            a = i1;
            f1 = 1.0F / (d * 2.0F * (1.0F - d));
            h = f1;
            e = f1;
            f = d / ((d - 1.0F) * 2.0F);
            g = 1.0F / (1.0F - d);
        }
    }


    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 4;
    public static final int a = 1;
    private static final int ak = 0;
    private static final int al = 1;
    private static final int am = 2;
    private static final int av = 3;
    public static final int b = 2;
    public static final int c = 4;
    public static final int d = 8;
    private boolean A;
    private int G;
    private int H;
    private int I;
    private int J;
    private int K;
    private View L[];
    private d M;
    private float N;
    private float O;
    private int P;
    private int Q;
    private float R;
    private float S;
    private float T;
    private float U;
    private float V;
    private c W;
    private boolean aA;
    private float aB;
    private boolean aC;
    private boolean aD;
    private int aa;
    private int ab;
    private int ac;
    private int ad;
    private int ae;
    private int af;
    private boolean ag;
    private boolean ah;
    private i ai;
    private MotionEvent aj;
    private int an;
    private float ao;
    private float ap;
    private a aq;
    private boolean ar;
    private f as;
    private boolean at;
    private boolean au;
    private j aw;
    private l ax;
    private k ay;
    private g az;
    private View e;
    private Point f;
    private Point g;
    private int h;
    private boolean i;
    private DataSetObserver j;
    private float k;
    private float l;
    private int m;
    private int n;
    private int o;
    private boolean p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private b v;
    private h w;
    private m x;
    private boolean y;
    private boolean z;

    public DragSortListView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        f = new Point();
        g = new Point();
        i = false;
        k = 1.0F;
        l = 1.0F;
        p = false;
        y = true;
        z = false;
        A = false;
        G = 0;
        H = 1;
        K = 0;
        L = new View[1];
        N = 0.3333333F;
        O = 0.3333333F;
        V = 0.5F;
        W = new c() {

            final DragSortListView a;

            public float a(float f1, long l3)
            {
                return DragSortListView.a(a) * f1;
            }

            
            {
                a = DragSortListView.this;
                super();
            }
        };
        af = 0;
        ag = false;
        ah = false;
        ai = null;
        an = 0;
        ao = 0.25F;
        ap = 0.0F;
        ar = false;
        at = false;
        au = false;
        aw = new j(3);
        aB = 0.0F;
        aC = false;
        aD = false;
        int j1 = 150;
        int i1;
        if (attributeset != null)
        {
            context = getContext().obtainStyledAttributes(attributeset, R.styleable.DragSortListView, 0, 0);
            H = Math.max(1, context.getDimensionPixelSize(R.styleable.DragSortListView_collapsed_height, 1));
            ar = context.getBoolean(R.styleable.DragSortListView_track_drag_sort, false);
            if (ar)
            {
                as = new f();
            }
            k = context.getFloat(R.styleable.DragSortListView_float_alpha, k);
            l = k;
            y = context.getBoolean(R.styleable.DragSortListView_drag_enabled, y);
            z = context.getBoolean(R.styleable.DragSortListView_drag_enabled_include_headers, z);
            A = context.getBoolean(R.styleable.DragSortListView_drag_enabled_include_footers, A);
            ao = Math.max(0.0F, Math.min(1.0F, 1.0F - context.getFloat(R.styleable.DragSortListView_slide_shuffle_speed, 0.75F)));
            boolean flag;
            if (ao > 0.0F)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p = flag;
            c(context.getFloat(R.styleable.DragSortListView_drag_scroll_start, N));
            V = context.getFloat(R.styleable.DragSortListView_max_drag_scroll_speed, V);
            j1 = context.getInt(R.styleable.DragSortListView_remove_animation_duration, 150);
            i1 = context.getInt(R.styleable.DragSortListView_drop_animation_duration, 150);
            if (context.getBoolean(R.styleable.DragSortListView_use_default_controller, true))
            {
                flag = context.getBoolean(R.styleable.DragSortListView_remove_enabled, false);
                int k1 = context.getInt(R.styleable.DragSortListView_remove_mode, 1);
                boolean flag1 = context.getBoolean(R.styleable.DragSortListView_sort_enabled, true);
                int l1 = context.getInt(R.styleable.DragSortListView_drag_start_mode, 0);
                int i2 = context.getResourceId(R.styleable.DragSortListView_drag_handle_id, 0);
                int j2 = context.getResourceId(R.styleable.DragSortListView_fling_handle_id, 0);
                int k2 = context.getResourceId(R.styleable.DragSortListView_click_remove_id, 0);
                int l2 = context.getColor(R.styleable.DragSortListView_float_background_color, 0xff000000);
                attributeset = new com.mobeta.android.dslv.b(this, i2, l1, k1, k2, j2);
                attributeset.b(flag);
                attributeset.a(flag1);
                attributeset.g(l2);
                ai = attributeset;
                setOnTouchListener(attributeset);
            }
            context.recycle();
        } else
        {
            i1 = 150;
        }
        M = new d();
        if (j1 > 0)
        {
            ax = new l(0.5F, j1);
        }
        if (i1 > 0)
        {
            az = new g(0.5F, i1);
        }
        aj = MotionEvent.obtain(0L, 0L, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0, 0.0F, 0.0F, 0, 0);
        j = new DataSetObserver() {

            final DragSortListView a;

            private void a()
            {
                if (DragSortListView.b(a) == 4)
                {
                    a.c();
                }
            }

            public void onChanged()
            {
                a();
            }

            public void onInvalidated()
            {
                a();
            }

            
            {
                a = DragSortListView.this;
                super();
            }
        };
    }

    static float a(DragSortListView dragsortlistview)
    {
        return dragsortlistview.V;
    }

    static float a(DragSortListView dragsortlistview, float f1)
    {
        dragsortlistview.aB = f1;
        return f1;
    }

    private int a(int i1, View view, int j1, int k1)
    {
        int l1 = f(i1);
        int k2 = view.getHeight();
        int l2 = e(i1, l1);
        int i2;
        int j2;
        int i3;
        if (i1 != q)
        {
            i2 = k2 - l1;
            l1 = l2 - l1;
        } else
        {
            l1 = l2;
            i2 = k2;
        }
        i3 = I;
        j2 = i3;
        if (q != n)
        {
            j2 = i3;
            if (q != o)
            {
                j2 = i3 - H;
            }
        }
        if (i1 <= j1)
        {
            if (i1 > n)
            {
                return (j2 - l1) + 0;
            }
        } else
        {
            if (i1 == k1)
            {
                if (i1 <= n)
                {
                    return (i2 - j2) + 0;
                }
                if (i1 == o)
                {
                    return (k2 - l2) + 0;
                } else
                {
                    return 0 + i2;
                }
            }
            if (i1 <= n)
            {
                return 0 - j2;
            }
            if (i1 == o)
            {
                return 0 - l1;
            }
        }
        return 0;
    }

    private static int a(SparseBooleanArray sparsebooleanarray, int i1)
    {
        int j1 = 0;
        for (int k1 = sparsebooleanarray.size(); k1 - j1 > 0;)
        {
            int l1 = j1 + k1 >> 1;
            if (sparsebooleanarray.keyAt(l1) < i1)
            {
                j1 = l1 + 1;
            } else
            {
                k1 = l1;
            }
        }

        return j1;
    }

    private static int a(SparseBooleanArray sparsebooleanarray, int i1, int j1)
    {
        int k1;
label0:
        {
            k1 = sparsebooleanarray.size();
            for (i1 = a(sparsebooleanarray, i1); i1 < k1 && sparsebooleanarray.keyAt(i1) < j1 && !sparsebooleanarray.valueAt(i1); i1++) { }
            if (i1 != k1)
            {
                k1 = i1;
                if (sparsebooleanarray.keyAt(i1) < j1)
                {
                    break label0;
                }
            }
            k1 = -1;
        }
        return k1;
    }

    private static int a(SparseBooleanArray sparsebooleanarray, int i1, int j1, int ai1[], int ai2[])
    {
        int l1 = a(sparsebooleanarray, i1, j1);
        if (l1 == -1)
        {
            return 0;
        }
        int j2 = sparsebooleanarray.keyAt(l1);
        int k1 = j2 + 1;
        l1++;
        int i2 = 0;
        do
        {
            if (l1 >= sparsebooleanarray.size())
            {
                break;
            }
            int k2 = sparsebooleanarray.keyAt(l1);
            if (k2 >= j1)
            {
                break;
            }
            if (sparsebooleanarray.valueAt(l1))
            {
                if (k2 == k1)
                {
                    k1++;
                } else
                {
                    ai1[i2] = j2;
                    ai2[i2] = k1;
                    i2++;
                    k1 = k2 + 1;
                    j2 = k2;
                }
            }
            l1++;
        } while (true);
        l1 = k1;
        if (k1 == j1)
        {
            l1 = i1;
        }
        ai1[i2] = j2;
        ai2[i2] = l1;
        k1 = i2 + 1;
        j1 = k1;
        if (k1 > 1)
        {
            j1 = k1;
            if (ai1[0] == i1)
            {
                j1 = k1;
                if (ai2[k1 - 1] == i1)
                {
                    ai1[0] = ai1[k1 - 1];
                    j1 = k1 - 1;
                }
            }
        }
        return j1;
    }

    static int a(DragSortListView dragsortlistview, int i1)
    {
        dragsortlistview.s = i1;
        return i1;
    }

    static int a(DragSortListView dragsortlistview, int i1, int j1)
    {
        return dragsortlistview.c(i1, j1);
    }

    private void a(int i1, Canvas canvas)
    {
        Drawable drawable = getDivider();
        int i2 = getDividerHeight();
        if (drawable != null && i2 != 0)
        {
            ViewGroup viewgroup = (ViewGroup)getChildAt(i1 - getFirstVisiblePosition());
            if (viewgroup != null)
            {
                int k1 = getPaddingLeft();
                int l1 = getWidth() - getPaddingRight();
                int j1 = viewgroup.getChildAt(0).getHeight();
                if (i1 > q)
                {
                    j1 += viewgroup.getTop();
                    i1 = j1 + i2;
                } else
                {
                    i1 = viewgroup.getBottom() - j1;
                    j1 = i1 - i2;
                }
                canvas.save();
                canvas.clipRect(k1, j1, l1, i1);
                drawable.setBounds(k1, j1, l1, i1);
                drawable.draw(canvas);
                canvas.restore();
            }
        }
    }

    private void a(int i1, View view, boolean flag)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        int j1;
        boolean flag1;
        int k1;
        if (i1 != q && i1 != n && i1 != o)
        {
            j1 = -2;
        } else
        {
            j1 = c(i1, view, flag);
        }
        if (j1 != layoutparams.height)
        {
            layoutparams.height = j1;
            view.setLayoutParams(layoutparams);
        }
        if (i1 != n && i1 != o) goto _L2; else goto _L1
_L1:
        if (i1 >= q) goto _L4; else goto _L3
_L3:
        ((com.mobeta.android.dslv.d)view).a(80);
_L2:
        k1 = view.getVisibility();
        flag1 = false;
        j1 = ((flag1) ? 1 : 0);
        if (i1 == q)
        {
            j1 = ((flag1) ? 1 : 0);
            if (e != null)
            {
                j1 = 4;
            }
        }
        if (j1 != k1)
        {
            view.setVisibility(j1);
        }
        return;
_L4:
        if (i1 > q)
        {
            ((com.mobeta.android.dslv.d)view).a(48);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    private void a(View view)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        Object obj = layoutparams;
        if (layoutparams == null)
        {
            obj = new android.widget.AbsListView.LayoutParams(-1, -2);
            view.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        int j1 = ViewGroup.getChildMeasureSpec(K, getListPaddingLeft() + getListPaddingRight(), ((android.view.ViewGroup.LayoutParams) (obj)).width);
        int i1;
        if (((android.view.ViewGroup.LayoutParams) (obj)).height > 0)
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(((android.view.ViewGroup.LayoutParams) (obj)).height, 0x40000000);
        } else
        {
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        view.measure(j1, i1);
    }

    static void a(DragSortListView dragsortlistview, int i1, View view, boolean flag)
    {
        dragsortlistview.a(i1, view, flag);
    }

    static void a(DragSortListView dragsortlistview, boolean flag)
    {
        dragsortlistview.e(flag);
    }

    static float b(DragSortListView dragsortlistview, float f1)
    {
        f1 = dragsortlistview.aB + f1;
        dragsortlistview.aB = f1;
        return f1;
    }

    private static int b(int i1, int j1, int k1, int l1)
    {
        int i2 = l1 - k1;
        j1 = i1 + j1;
        if (j1 < k1)
        {
            i1 = j1 + i2;
        } else
        {
            i1 = j1;
            if (j1 >= l1)
            {
                return j1 - i2;
            }
        }
        return i1;
    }

    private int b(int i1, View view, boolean flag)
    {
        boolean flag1 = false;
        if (i1 == q)
        {
            i1 = ((flag1) ? 1 : 0);
        } else
        {
            View view1 = view;
            if (i1 >= getHeaderViewsCount())
            {
                if (i1 >= getCount() - getFooterViewsCount())
                {
                    view1 = view;
                } else
                {
                    view1 = ((ViewGroup)view).getChildAt(0);
                }
            }
            view = view1.getLayoutParams();
            if (view != null && ((android.view.ViewGroup.LayoutParams) (view)).height > 0)
            {
                return ((android.view.ViewGroup.LayoutParams) (view)).height;
            }
            i1 = view1.getHeight();
            if (i1 == 0 || flag)
            {
                a(view1);
                return view1.getMeasuredHeight();
            }
        }
        return i1;
    }

    static int b(DragSortListView dragsortlistview)
    {
        return dragsortlistview.G;
    }

    static int b(DragSortListView dragsortlistview, int i1)
    {
        dragsortlistview.G = i1;
        return i1;
    }

    static int b(DragSortListView dragsortlistview, int i1, View view, boolean flag)
    {
        return dragsortlistview.b(i1, view, flag);
    }

    private void b(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction() & 0xff;
        if (i1 != 0)
        {
            ac = aa;
            ad = ab;
        }
        aa = (int)motionevent.getX();
        ab = (int)motionevent.getY();
        if (i1 == 0)
        {
            ac = aa;
            ad = ab;
        }
        t = (int)motionevent.getRawX() - aa;
        u = (int)motionevent.getRawY() - ab;
    }

    static boolean b(DragSortListView dragsortlistview, boolean flag)
    {
        dragsortlistview.at = flag;
        return flag;
    }

    private int c(int i1)
    {
        View view = getChildAt(i1 - getFirstVisiblePosition());
        if (view != null)
        {
            return view.getHeight();
        } else
        {
            return e(i1, f(i1));
        }
    }

    private int c(int i1, int j1)
    {
        int k1 = getHeaderViewsCount();
        int l1 = getFooterViewsCount();
        if (i1 <= k1 || i1 >= getCount() - l1)
        {
            return j1;
        }
        l1 = getDividerHeight();
        int j2 = I - H;
        int i2 = f(i1);
        int k2 = c(i1);
        if (o <= q)
        {
            if (i1 == o && n != o)
            {
                if (i1 == q)
                {
                    k1 = (j1 + k2) - I;
                } else
                {
                    k1 = ((k2 - i2) + j1) - j2;
                }
            } else
            {
                k1 = j1;
                if (i1 > o)
                {
                    k1 = j1;
                    if (i1 <= q)
                    {
                        k1 = j1 - j2;
                    }
                }
            }
        } else
        if (i1 > q && i1 <= n)
        {
            k1 = j1 + j2;
        } else
        {
            k1 = j1;
            if (i1 == o)
            {
                k1 = j1;
                if (n != o)
                {
                    k1 = j1 + (k2 - i2);
                }
            }
        }
        if (i1 <= q)
        {
            return (I - l1 - f(i1 - 1)) / 2 + k1;
        } else
        {
            return (i2 - l1 - I) / 2 + k1;
        }
    }

    private int c(int i1, View view, boolean flag)
    {
        return e(i1, b(i1, view, flag));
    }

    static int c(DragSortListView dragsortlistview)
    {
        return dragsortlistview.s;
    }

    static int c(DragSortListView dragsortlistview, int i1)
    {
        return dragsortlistview.c(i1);
    }

    static void c(DragSortListView dragsortlistview, int i1, View view, boolean flag)
    {
        dragsortlistview.d(i1, view, flag);
    }

    static int d(DragSortListView dragsortlistview)
    {
        return dragsortlistview.J;
    }

    static int d(DragSortListView dragsortlistview, int i1)
    {
        return dragsortlistview.f(i1);
    }

    private void d(int i1)
    {
        G = 1;
        if (x != null)
        {
            x.a(i1);
        }
        t();
        m();
        j();
        if (ah)
        {
            G = 3;
            return;
        } else
        {
            G = 0;
            return;
        }
    }

    private void d(int i1, int j1)
    {
        f.x = i1 - r;
        f.y = j1 - s;
        e(true);
        i1 = Math.min(j1, h + J);
        j1 = Math.max(j1, h - J);
        int k1 = M.b();
        if (i1 > ad && i1 > Q && k1 != 1)
        {
            if (k1 != -1)
            {
                M.a(true);
            }
            M.a(1);
        } else
        {
            if (j1 < ad && j1 < P && k1 != 0)
            {
                if (k1 != -1)
                {
                    M.a(true);
                }
                M.a(0);
                return;
            }
            if (j1 >= P && i1 <= Q && M.a())
            {
                M.a(true);
                return;
            }
        }
    }

    private void d(int i1, View view, boolean flag)
    {
        at = true;
        s();
        int j1 = n;
        int k1 = o;
        boolean flag1 = i();
        if (flag1)
        {
            p();
            setSelectionFromTop(i1, (a(i1, view, j1, k1) + view.getTop()) - getPaddingTop());
            layoutChildren();
        }
        if (flag1 || flag)
        {
            invalidate();
        }
        at = false;
    }

    private int e(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        getDividerHeight();
        if (p && n != o)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        l1 = I - H;
        i2 = (int)(ap * (float)l1);
        if (i1 != q) goto _L2; else goto _L1
_L1:
        if (q != n) goto _L4; else goto _L3
_L3:
        if (k1 == 0) goto _L6; else goto _L5
_L5:
        k1 = i2 + H;
_L8:
        return k1;
_L6:
        return I;
_L4:
        if (q == o)
        {
            return I - i2;
        } else
        {
            return H;
        }
_L2:
        if (i1 == n)
        {
            if (k1 != 0)
            {
                return j1 + i2;
            } else
            {
                return j1 + l1;
            }
        }
        k1 = j1;
        if (i1 == o)
        {
            return (j1 + l1) - i2;
        }
        if (true) goto _L8; else goto _L7
_L7:
    }

    static Point e(DragSortListView dragsortlistview)
    {
        return dragsortlistview.f;
    }

    private void e(int i1)
    {
        View view = getChildAt(i1 - getFirstVisiblePosition());
        if (view != null)
        {
            a(i1, view, false);
        }
    }

    private void e(boolean flag)
    {
        int i1 = getFirstVisiblePosition();
        int j1 = getChildCount() / 2;
        View view = getChildAt(getChildCount() / 2);
        if (view == null)
        {
            return;
        } else
        {
            d(i1 + j1, view, flag);
            return;
        }
    }

    private int f(int i1)
    {
        int j1 = 0;
        if (i1 != q)
        {
            View view = getChildAt(i1 - getFirstVisiblePosition());
            if (view != null)
            {
                return b(i1, view, false);
            }
            int l1 = aw.a(i1);
            j1 = l1;
            if (l1 == -1)
            {
                Object obj = getAdapter();
                int k1 = ((ListAdapter) (obj)).getItemViewType(i1);
                int i2 = ((ListAdapter) (obj)).getViewTypeCount();
                if (i2 != L.length)
                {
                    L = new View[i2];
                }
                if (k1 >= 0)
                {
                    if (L[k1] == null)
                    {
                        obj = ((ListAdapter) (obj)).getView(i1, null, this);
                        L[k1] = ((View) (obj));
                    } else
                    {
                        obj = ((ListAdapter) (obj)).getView(i1, L[k1], this);
                    }
                } else
                {
                    obj = ((ListAdapter) (obj)).getView(i1, null, this);
                }
                k1 = b(i1, ((View) (obj)), true);
                aw.a(i1, k1);
                return k1;
            }
        }
        return j1;
    }

    static int f(DragSortListView dragsortlistview)
    {
        return dragsortlistview.ab;
    }

    static int g(DragSortListView dragsortlistview)
    {
        return dragsortlistview.m;
    }

    static int h(DragSortListView dragsortlistview)
    {
        return dragsortlistview.q;
    }

    private void h()
    {
        Log.d("mobeta", (new StringBuilder()).append("mSrcPos=").append(q).append(" mFirstExpPos=").append(n).append(" mSecondExpPos=").append(o).toString());
    }

    static int i(DragSortListView dragsortlistview)
    {
        return dragsortlistview.H;
    }

    private boolean i()
    {
        int i1;
        int j1;
        int k2;
        int l2;
        int j3;
        i1 = getFirstVisiblePosition();
        j1 = n;
        View view1 = getChildAt(j1 - i1);
        View view = view1;
        if (view1 == null)
        {
            j1 = i1 + getChildCount() / 2;
            view = getChildAt(j1 - i1);
        }
        k2 = view.getTop();
        l2 = view.getHeight();
        i1 = c(j1, k2);
        j3 = getDividerHeight();
        if (h >= i1) goto _L2; else goto _L1
_L1:
        int i2;
        int j2;
        int k1 = i1;
        i2 = i1;
        i1 = k1;
        j2 = j1;
_L8:
        int l1;
        j1 = j2;
        l1 = i2;
        if (j2 < 0) goto _L4; else goto _L3
_L3:
        j2--;
        i1 = c(j2);
        if (j2 != 0) goto _L6; else goto _L5
_L5:
        i1 = k2 - j3 - i1;
        l1 = i2;
        j1 = j2;
_L4:
        j2 = getHeaderViewsCount();
        int i3 = getFooterViewsCount();
        k2 = n;
        l2 = o;
        float f1 = ap;
        boolean flag;
        if (p)
        {
            j3 = Math.abs(i1 - l1);
            float f2;
            int k3;
            if (h >= i1)
            {
                i2 = l1;
                l1 = i1;
                i1 = i2;
            }
            f2 = ao;
            i2 = (int)((float)j3 * (f2 * 0.5F));
            f2 = i2;
            l1 += i2;
            if (h < l1)
            {
                n = j1 - 1;
                o = j1;
                ap = ((float)(l1 - h) * 0.5F) / f2;
            } else
            if (h < i1 - i2)
            {
                n = j1;
                o = j1;
            } else
            {
                n = j1;
                o = j1 + 1;
                ap = (1.0F + (float)(i1 - h) / f2) * 0.5F;
            }
        } else
        {
            n = j1;
            o = j1;
        }
        if (n < j2)
        {
            n = j2;
            o = j2;
            j1 = j2;
        } else
        if (o >= getCount() - i3)
        {
            j1 = getCount() - i3 - 1;
            n = j1;
            o = j1;
        }
        if (n != k2 || o != l2 || ap != f1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j1 != m)
        {
            if (v != null)
            {
                v.b(m - j2, j1 - j2);
            }
            m = j1;
            return true;
        } else
        {
            return flag;
        }
_L6:
        l2 = k2 - (i1 + j3);
        k2 = c(j2, l2);
        j1 = j2;
        l1 = i2;
        i1 = k2;
        if (h >= k2) goto _L4; else goto _L7
_L7:
        i2 = k2;
        i1 = k2;
        k2 = l2;
          goto _L8
_L2:
        k3 = getCount();
        l1 = i1;
        j2 = i1;
        i1 = l1;
        i2 = j1;
_L10:
        j1 = i2;
        l1 = j2;
        if (i2 < k3)
        {
label0:
            {
                if (i2 != k3 - 1)
                {
                    break label0;
                }
                i1 = k2 + j3 + l2;
                j1 = i2;
                l1 = j2;
            }
        }
          goto _L4
        i3 = k2 + (j3 + l2);
        l2 = c(i2 + 1);
        k2 = c(i2 + 1, i3);
        j1 = i2;
        l1 = j2;
        i1 = k2;
        if (h < k2) goto _L4; else goto _L9
_L9:
        i2++;
        j2 = k2;
        i1 = k2;
        k2 = i3;
          goto _L10
    }

    static int j(DragSortListView dragsortlistview)
    {
        return dragsortlistview.I;
    }

    private void j()
    {
        q = -1;
        n = -1;
        o = -1;
        m = -1;
    }

    private void k()
    {
        G = 2;
        if (w != null && m >= 0 && m < getCount())
        {
            int i1 = getHeaderViewsCount();
            w.a(q - i1, m - i1);
        }
        t();
        m();
        j();
        p();
        if (ah)
        {
            G = 3;
            return;
        } else
        {
            G = 0;
            return;
        }
    }

    static void k(DragSortListView dragsortlistview)
    {
        dragsortlistview.k();
    }

    static int l(DragSortListView dragsortlistview)
    {
        return dragsortlistview.n;
    }

    private void l()
    {
        d(q - getHeaderViewsCount());
    }

    static int m(DragSortListView dragsortlistview)
    {
        return dragsortlistview.o;
    }

    private void m()
    {
        int i1 = 0;
        int j1 = getFirstVisiblePosition();
        if (q < j1)
        {
            View view = getChildAt(0);
            if (view != null)
            {
                i1 = view.getTop();
            }
            setSelectionFromTop(j1 - 1, i1 - getPaddingTop());
        }
    }

    private void n()
    {
        an = 0;
        ah = false;
        if (G == 3)
        {
            G = 0;
        }
        l = k;
        aC = false;
        aw.a();
    }

    static boolean n(DragSortListView dragsortlistview)
    {
        return dragsortlistview.aA;
    }

    static float o(DragSortListView dragsortlistview)
    {
        return dragsortlistview.aB;
    }

    private void o()
    {
        int i1 = getPaddingTop();
        int j1 = getHeight() - i1 - getPaddingBottom();
        float f1 = j1;
        S = (float)i1 + N * f1;
        float f2 = i1;
        R = f1 * (1.0F - O) + f2;
        P = (int)S;
        Q = (int)R;
        T = S - (float)i1;
        U = (float)(i1 + j1) - R;
    }

    private void p()
    {
        int j1 = getFirstVisiblePosition();
        int k1 = getLastVisiblePosition();
        int i1 = Math.max(0, getHeaderViewsCount() - j1);
        for (k1 = Math.min(k1 - j1, getCount() - 1 - getFooterViewsCount() - j1); i1 <= k1; i1++)
        {
            View view = getChildAt(i1);
            if (view != null)
            {
                a(j1 + i1, view, false);
            }
        }

    }

    static void p(DragSortListView dragsortlistview)
    {
        dragsortlistview.t();
    }

    private void q()
    {
        if (e != null)
        {
            a(e);
            I = e.getMeasuredHeight();
            J = I / 2;
        }
    }

    static void q(DragSortListView dragsortlistview)
    {
        dragsortlistview.l();
    }

    static int r(DragSortListView dragsortlistview)
    {
        return dragsortlistview.h;
    }

    private void r()
    {
        aD = true;
    }

    static float s(DragSortListView dragsortlistview)
    {
        return dragsortlistview.S;
    }

    private void s()
    {
        int j1 = 0;
        if (ai != null)
        {
            g.set(aa, ab);
            ai.a(e, f, g);
        }
        int i1 = f.x;
        int l1 = f.y;
        int k1 = getPaddingLeft();
        int i2;
        int j2;
        int k2;
        if ((af & 1) == 0 && i1 > k1)
        {
            f.x = k1;
        } else
        if ((af & 2) == 0 && i1 < k1)
        {
            f.x = k1;
        }
        if (z)
        {
            i1 = 0;
        } else
        {
            i1 = getHeaderViewsCount();
        }
        if (!A)
        {
            j1 = getFooterViewsCount();
        }
        i2 = getFirstVisiblePosition();
        j2 = getLastVisiblePosition();
        k1 = getPaddingTop();
        if (i2 < i1)
        {
            i1 = getChildAt(i1 - i2 - 1).getBottom();
        } else
        {
            i1 = k1;
        }
        k1 = i1;
        if ((af & 8) == 0)
        {
            k1 = i1;
            if (i2 <= q)
            {
                k1 = Math.max(getChildAt(q - i2).getTop(), i1);
            }
        }
        i1 = getHeight();
        k2 = getPaddingBottom();
        if (j2 >= getCount() - j1 - 1)
        {
            i1 = getChildAt(getCount() - j1 - 1 - i2).getBottom();
        } else
        {
            i1 -= k2;
        }
        j1 = i1;
        if ((af & 4) == 0)
        {
            j1 = i1;
            if (j2 >= q)
            {
                j1 = Math.min(getChildAt(q - i2).getBottom(), i1);
            }
        }
        if (l1 < k1)
        {
            f.y = k1;
        } else
        if (I + l1 > j1)
        {
            f.y = j1 - I;
        }
        h = f.y + J;
    }

    static float t(DragSortListView dragsortlistview)
    {
        return dragsortlistview.T;
    }

    private void t()
    {
        if (e != null)
        {
            e.setVisibility(8);
            if (ai != null)
            {
                ai.a(e);
            }
            e = null;
            invalidate();
        }
    }

    static c u(DragSortListView dragsortlistview)
    {
        return dragsortlistview.W;
    }

    static float v(DragSortListView dragsortlistview)
    {
        return dragsortlistview.R;
    }

    static float w(DragSortListView dragsortlistview)
    {
        return dragsortlistview.U;
    }

    static int x(DragSortListView dragsortlistview)
    {
        return dragsortlistview.ad;
    }

    public float a()
    {
        return l;
    }

    public void a(float f1)
    {
        l = f1;
    }

    public void a(float f1, float f2)
    {
        if (f2 > 0.5F)
        {
            O = 0.5F;
        } else
        {
            O = f2;
        }
        if (f1 > 0.5F)
        {
            N = 0.5F;
        } else
        {
            N = f1;
        }
        if (getHeight() != 0)
        {
            o();
        }
    }

    public void a(int i1)
    {
        aA = false;
        a(i1, 0.0F);
    }

    public void a(int i1, float f1)
    {
        if (G != 0 && G != 4) goto _L2; else goto _L1
_L1:
        if (G == 0)
        {
            q = getHeaderViewsCount() + i1;
            n = q;
            o = q;
            m = q;
            View view = getChildAt(q - getFirstVisiblePosition());
            if (view != null)
            {
                view.setVisibility(4);
            }
        }
        G = 1;
        aB = f1;
        if (!ah) goto _L4; else goto _L3
_L3:
        an;
        JVM INSTR tableswitch 1 2: default 124
    //                   1 139
    //                   2 151;
           goto _L4 _L5 _L6
_L4:
        if (ax == null)
        {
            break; /* Loop/switch isn't completed */
        }
        ax.c();
_L2:
        return;
_L5:
        super.onTouchEvent(aj);
        continue; /* Loop/switch isn't completed */
_L6:
        super.onInterceptTouchEvent(aj);
        if (true) goto _L4; else goto _L7
_L7:
        d(i1);
        return;
    }

    public void a(int i1, int j1)
    {
        if (w != null)
        {
            int k1 = b().getCount();
            if (i1 >= 0 && i1 < k1 && j1 >= 0 && j1 < k1)
            {
                w.a(i1, j1);
            }
        }
    }

    public void a(b b1)
    {
        v = b1;
    }

    public void a(c c1)
    {
        if (c1 != null)
        {
            W = c1;
        }
    }

    public void a(e e1)
    {
        a(((h) (e1)));
        a(((b) (e1)));
        a(((m) (e1)));
    }

    public void a(h h1)
    {
        w = h1;
    }

    public void a(i i1)
    {
        ai = i1;
    }

    public void a(m m1)
    {
        x = m1;
    }

    public boolean a(int i1, int j1, int k1, int l1)
    {
        View view;
        if (ah && ai != null)
        {
            if ((view = ai.a(i1)) != null)
            {
                return a(i1, view, j1, k1, l1);
            }
        }
        return false;
    }

    public boolean a(int i1, View view, int j1, int k1, int l1)
    {
        boolean flag = true;
        if (G == 0 && ah && e == null && view != null && y) goto _L2; else goto _L1
_L1:
        flag = false;
_L4:
        return flag;
_L2:
        if (getParent() != null)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        i1 = getHeaderViewsCount() + i1;
        n = i1;
        o = i1;
        q = i1;
        m = i1;
        G = 4;
        af = 0;
        af = af | j1;
        e = view;
        q();
        r = k1;
        s = l1;
        ae = ab;
        f.x = aa - r;
        f.y = ab - s;
        view = getChildAt(q - getFirstVisiblePosition());
        if (view != null)
        {
            view.setVisibility(4);
        }
        if (ar)
        {
            as.a();
        }
        switch (an)
        {
        default:
            break;

        case 1: // '\001'
            break; /* Loop/switch isn't completed */

        case 2: // '\002'
            break;
        }
        break MISSING_BLOCK_LABEL_260;
_L5:
        requestLayout();
        if (ay != null)
        {
            ay.c();
            return true;
        }
        if (true) goto _L4; else goto _L3
_L3:
        super.onTouchEvent(aj);
          goto _L5
        super.onInterceptTouchEvent(aj);
          goto _L5
    }

    protected boolean a(MotionEvent motionevent)
    {
        motionevent.getAction();
        motionevent.getAction() & 0xff;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 61
    //                   2 82
    //                   3 42;
           goto _L1 _L2 _L3 _L4
_L1:
        return true;
_L4:
        if (G == 4)
        {
            c();
        }
        n();
        continue; /* Loop/switch isn't completed */
_L2:
        if (G == 4)
        {
            a(false);
        }
        n();
        continue; /* Loop/switch isn't completed */
_L3:
        d((int)motionevent.getX(), (int)motionevent.getY());
        if (true) goto _L1; else goto _L5
_L5:
    }

    public boolean a(boolean flag)
    {
        aA = false;
        return b(flag, 0.0F);
    }

    public boolean a(boolean flag, float f1)
    {
        aA = true;
        return b(flag, f1);
    }

    public ListAdapter b()
    {
        if (aq == null)
        {
            return null;
        } else
        {
            return aq.a();
        }
    }

    public void b(float f1)
    {
        V = f1;
    }

    public void b(int i1)
    {
        SparseBooleanArray sparsebooleanarray = getCheckedItemPositions();
        if (sparsebooleanarray.size() != 0)
        {
            int ai1[] = new int[sparsebooleanarray.size()];
            int ai2[] = new int[sparsebooleanarray.size()];
            int k1 = sparsebooleanarray.keyAt(sparsebooleanarray.size() - 1) + 1;
            int l1 = a(sparsebooleanarray, i1, k1, ai1, ai2);
            int j1 = 0;
            while (j1 != l1) 
            {
                if (ai1[j1] != i1 && (ai2[j1] >= ai1[j1] || ai2[j1] <= i1))
                {
                    setItemChecked(b(ai1[j1], -1, i1, k1), true);
                }
                setItemChecked(b(ai2[j1], -1, i1, k1), false);
                j1++;
            }
        }
    }

    public void b(int i1, int j1)
    {
        SparseBooleanArray sparsebooleanarray = getCheckedItemPositions();
        int ai1[];
        int ai2[];
        int k1;
        int l1;
        int i2;
        if (j1 < i1)
        {
            l1 = i1;
            k1 = j1;
        } else
        {
            l1 = j1;
            k1 = i1;
        }
        i2 = l1 + 1;
        ai1 = new int[sparsebooleanarray.size()];
        ai2 = new int[sparsebooleanarray.size()];
        l1 = a(sparsebooleanarray, k1, i2, ai1, ai2);
        if (l1 != 1 || ai1[0] != ai2[0]) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (i1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = 0;
        while (i1 != l1) 
        {
            setItemChecked(b(ai1[i1], -1, k1, i2), true);
            setItemChecked(b(ai2[i1], -1, k1, i2), false);
            i1++;
        }
        if (true) goto _L1; else goto _L3
_L3:
        i1 = 0;
        while (i1 != l1) 
        {
            setItemChecked(ai1[i1], false);
            setItemChecked(ai2[i1], true);
            i1++;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void b(boolean flag)
    {
        y = flag;
    }

    public boolean b(boolean flag, float f1)
    {
        if (e != null)
        {
            M.a(true);
            if (flag)
            {
                a(q - getHeaderViewsCount(), f1);
            } else
            if (az != null)
            {
                az.c();
            } else
            {
                k();
            }
            if (ar)
            {
                as.d();
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void c()
    {
label0:
        {
            if (G == 4)
            {
                M.a(true);
                t();
                j();
                p();
                if (!ah)
                {
                    break label0;
                }
                G = 3;
            }
            return;
        }
        G = 0;
    }

    public void c(float f1)
    {
        a(f1, f1);
    }

    public void c(boolean flag)
    {
        z = flag;
    }

    public void d(boolean flag)
    {
        A = flag;
    }

    public boolean d()
    {
        return aC;
    }

    protected void dispatchDraw(Canvas canvas)
    {
        super.dispatchDraw(canvas);
        if (G != 0)
        {
            if (n != q)
            {
                a(n, canvas);
            }
            if (o != n && o != q)
            {
                a(o, canvas);
            }
        }
        if (e != null)
        {
            int k1 = e.getWidth();
            int l1 = e.getHeight();
            int j1 = f.x;
            int i2 = getWidth();
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = -j1;
            }
            float f1;
            if (i1 < i2)
            {
                f1 = (float)(i2 - i1) / (float)i2;
                f1 *= f1;
            } else
            {
                f1 = 0.0F;
            }
            i1 = (int)(f1 * (255F * l));
            canvas.save();
            canvas.translate(f.x, f.y);
            canvas.clipRect(0, 0, k1, l1);
            canvas.saveLayerAlpha(0.0F, 0.0F, k1, l1, i1, 31);
            e.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
    }

    public boolean e()
    {
        return y;
    }

    public boolean f()
    {
        return z;
    }

    public boolean g()
    {
        return A;
    }

    protected void layoutChildren()
    {
        super.layoutChildren();
        if (e != null)
        {
            if (e.isLayoutRequested() && !i)
            {
                q();
            }
            e.layout(0, 0, e.getMeasuredWidth(), e.getMeasuredHeight());
            i = false;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        if (ar)
        {
            as.b();
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        if (!y)
        {
            return super.onInterceptTouchEvent(motionevent);
        }
        b(motionevent);
        ag = true;
        i1 = motionevent.getAction() & 0xff;
        if (i1 == 0)
        {
            if (G != 0)
            {
                au = true;
                return true;
            }
            ah = true;
        }
        if (e == null) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        if (i1 == 1 || i1 == 3)
        {
            ah = false;
        }
        return flag;
_L2:
        if (super.onInterceptTouchEvent(motionevent))
        {
            aC = true;
            flag = true;
        } else
        {
            flag = false;
        }
        switch (i1)
        {
        case 2: // '\002'
        default:
            if (flag)
            {
                an = 1;
            } else
            {
                an = 2;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            n();
            break;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected void onMeasure(int i1, int j1)
    {
        super.onMeasure(i1, j1);
        if (e != null)
        {
            if (e.isLayoutRequested())
            {
                q();
            }
            i = true;
        }
        K = i1;
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        o();
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        boolean flag;
        boolean flag2;
        flag2 = false;
        flag = false;
        if (!au) goto _L2; else goto _L1
_L1:
        au = false;
        flag2 = flag;
_L4:
        return flag2;
_L2:
        if (!y)
        {
            return super.onTouchEvent(motionevent);
        }
        boolean flag1 = ag;
        ag = false;
        if (!flag1)
        {
            b(motionevent);
        }
        if (G == 4)
        {
            a(motionevent);
            return true;
        }
        flag1 = flag2;
        if (G == 0)
        {
            flag1 = flag2;
            if (super.onTouchEvent(motionevent))
            {
                flag1 = true;
            }
        }
        switch (motionevent.getAction() & 0xff)
        {
        case 2: // '\002'
        default:
            flag2 = flag1;
            if (flag1)
            {
                an = 1;
                return flag1;
            }
            break;

        case 1: // '\001'
        case 3: // '\003'
            n();
            return flag1;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void requestLayout()
    {
        if (!at)
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
        if (listadapter != null)
        {
            aq = new a(listadapter);
            listadapter.registerDataSetObserver(j);
            if (listadapter instanceof h)
            {
                a((h)listadapter);
            }
            if (listadapter instanceof b)
            {
                a((b)listadapter);
            }
            if (listadapter instanceof m)
            {
                a((m)listadapter);
            }
        } else
        {
            aq = null;
        }
        super.setAdapter(aq);
    }

    // Unreferenced inner class com/mobeta/android/dslv/DragSortListView$a$1

/* anonymous class */
    class a._cls1 extends DataSetObserver
    {

        final DragSortListView a;
        final a b;

        public void onChanged()
        {
            b.notifyDataSetChanged();
        }

        public void onInvalidated()
        {
            b.notifyDataSetInvalidated();
        }

            
            {
                b = a1;
                a = dragsortlistview;
                super();
            }
    }

}
