// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.TraceCompat;
import android.support.v4.util.ArrayMap;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.NestedScrollingChild;
import android.support.v4.view.NestedScrollingChildHelper;
import android.support.v4.view.ScrollingView;
import android.support.v4.view.VelocityTrackerCompat;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.support.v4.widget.EdgeEffectCompat;
import android.support.v4.widget.ScrollerCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            v, t, c, u, 
//            a, x, b, w, 
//            RecyclerViewAccessibilityDelegate, y

public class RecyclerView extends ViewGroup
    implements NestedScrollingChild, ScrollingView
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        t a;
        final Rect b;
        boolean c;
        boolean d;

        public LayoutParams(int i1, int j1)
        {
            super(i1, j1);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            b = new Rect();
            c = true;
            d = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            b = new Rect();
            c = true;
            d = false;
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new y();
        Parcelable a;

        static void a(SavedState savedstate, SavedState savedstate1)
        {
            savedstate.a = savedstate1.a;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            super.writeToParcel(parcel, i1);
            parcel.writeParcelable(a, 0);
        }


        SavedState(Parcel parcel)
        {
            super(parcel);
            a = parcel.readParcelable(android/support/v7/widget/RecyclerView$i.getClassLoader());
        }

        SavedState(Parcelable parcelable)
        {
            super(parcelable);
        }
    }

    public static abstract class a
    {

        private final b a = new b();
        private boolean b;

        public abstract int a();

        public int a(int i1)
        {
            return 0;
        }

        public abstract t a(ViewGroup viewgroup, int i1);

        public final void a(c c1)
        {
            a.registerObserver(c1);
        }

        public void a(t t1)
        {
        }

        public abstract void a(t t1, int i1);

        public final void b(c c1)
        {
            a.unregisterObserver(c1);
        }

        public void b(t t1)
        {
        }

        public final void b(t t1, int i1)
        {
            t1.b = i1;
            if (b)
            {
                t1.d = -1L;
            }
            t1.a(1, 519);
            TraceCompat.beginSection("RV OnBindView");
            a(t1, i1);
            TraceCompat.endSection();
        }

        public final boolean b()
        {
            return b;
        }

        public final void c()
        {
            a.a();
        }

        public a()
        {
            b = false;
        }
    }

    static final class b extends Observable
    {

        public final void a()
        {
            for (int i1 = mObservers.size() - 1; i1 >= 0; i1--)
            {
                ((c)mObservers.get(i1)).a();
            }

        }

        b()
        {
        }
    }

    public static abstract class c
    {

        public void a()
        {
        }

        public c()
        {
        }
    }

    public static interface d
    {

        public abstract int a();
    }

    public static abstract class e
    {

        private a a;
        private ArrayList b;
        private long c;
        private long d;
        private long e;
        private long f;
        private boolean g;

        public abstract void a();

        final void a(a a1)
        {
            a = a1;
        }

        public abstract boolean a(t t1);

        public abstract boolean a(t t1, int i1, int j1, int k1, int l1);

        public abstract boolean a(t t1, t t2, int i1, int j1, int k1, int l1);

        public abstract boolean b();

        public abstract boolean b(t t1);

        public abstract void c();

        public abstract void c(t t1);

        public final long d()
        {
            return e;
        }

        public final void d(t t1)
        {
            if (a != null)
            {
                a.a(t1);
            }
        }

        public final long e()
        {
            return c;
        }

        public final void e(t t1)
        {
            if (a != null)
            {
                a.c(t1);
            }
        }

        public final long f()
        {
            return d;
        }

        public final void f(t t1)
        {
            if (a != null)
            {
                a.b(t1);
            }
        }

        public final long g()
        {
            return f;
        }

        public final void g(t t1)
        {
            if (a != null)
            {
                a.d(t1);
            }
        }

        public final boolean h()
        {
            return g;
        }

        public final void i()
        {
            int j1 = b.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                b.get(i1);
            }

            b.clear();
        }

        public e()
        {
            a = null;
            b = new ArrayList();
            c = 120L;
            d = 120L;
            e = 250L;
            f = 250L;
            g = true;
        }
    }

    static interface e.a
    {

        public abstract void a(t t1);

        public abstract void b(t t1);

        public abstract void c(t t1);

        public abstract void d(t t1);
    }

    private final class f
        implements e.a
    {

        final RecyclerView a;

        public final void a(t t1)
        {
            t1.a(true);
            if (!RecyclerView.c(a, t1.a) && t1.n())
            {
                a.removeDetachedView(t1.a, false);
            }
        }

        public final void b(t t1)
        {
            t1.a(true);
            if (!t.c(t1))
            {
                RecyclerView.c(a, t1.a);
            }
        }

        public final void c(t t1)
        {
            t1.a(true);
            if (!t.c(t1))
            {
                RecyclerView.c(a, t1.a);
            }
        }

        public final void d(t t1)
        {
            t1.a(true);
            if (t1.g != null && t1.h == null)
            {
                t1.g = null;
                t1.a(-65, t.d(t1));
            }
            t1.h = null;
            if (!t.c(t1))
            {
                RecyclerView.c(a, t1.a);
            }
        }

        private f()
        {
            a = RecyclerView.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }

    public static abstract class g
    {

        public void a(Rect rect, View view)
        {
            view.getLayoutParams();
            rect.set(0, 0, 0, 0);
        }

        public g()
        {
        }
    }

    private static final class h
    {

        t a;
        int b;
        int c;
        int d;
        int e;

        h(t t1, int i1, int j1, int k1, int l1)
        {
            a = t1;
            b = i1;
            c = j1;
            d = k1;
            e = l1;
        }
    }

    public static abstract class i
    {

        private boolean a;
        private boolean b;
        android.support.v7.widget.b q;
        RecyclerView r;
        p s;

        public static int a(int i1, int j1, int k1, boolean flag)
        {
            int l1;
            int i2;
            i2 = 0x40000000;
            l1 = Math.max(0, i1 - j1);
            if (!flag) goto _L2; else goto _L1
_L1:
            if (k1 >= 0)
            {
                i1 = k1;
                j1 = i2;
            } else
            {
                j1 = 0;
                i1 = 0;
            }
_L4:
            return android.view.View.MeasureSpec.makeMeasureSpec(i1, j1);
_L2:
            j1 = i2;
            i1 = k1;
            if (k1 < 0)
            {
                if (k1 == -1)
                {
                    i1 = l1;
                    j1 = i2;
                } else
                if (k1 == -2)
                {
                    j1 = 0x80000000;
                    i1 = l1;
                } else
                {
                    j1 = 0;
                    i1 = 0;
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        private void a(int i1)
        {
            if (d(i1) != null)
            {
                q.a(i1);
            }
        }

        static void a(i i1, p p1)
        {
            if (i1.s == p1)
            {
                i1.s = null;
            }
        }

        public static void a(View view, int i1, int j1, int k1, int l1)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).b;
            view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
        }

        private void a(View view, int i1, boolean flag)
        {
            t t1;
            LayoutParams layoutparams;
            t1 = RecyclerView.b(view);
            if (flag || t1.m())
            {
                r.e.b(view);
            } else
            {
                r.e.a(view);
            }
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!t1.f() && !t1.d()) goto _L2; else goto _L1
_L1:
            if (t1.d())
            {
                t1.e();
            } else
            {
                t1.g();
            }
            q.a(view, i1, view.getLayoutParams(), false);
_L4:
            if (layoutparams.d)
            {
                t1.a.invalidate();
                layoutparams.d = false;
            }
            return;
_L2:
            if (view.getParent() == r)
            {
                android.support.v7.widget.b b1 = q;
                int j1 = b1.a.a(view);
                int k1;
                if (j1 == -1)
                {
                    j1 = -1;
                } else
                if (b1.b.b(j1))
                {
                    j1 = -1;
                } else
                {
                    j1 -= b1.b.d(j1);
                }
                k1 = i1;
                if (i1 == -1)
                {
                    k1 = q.a();
                }
                if (j1 == -1)
                {
                    throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(r.indexOfChild(view)).toString());
                }
                if (j1 != k1)
                {
                    view = RecyclerView.e(r);
                    View view1 = view.d(j1);
                    if (view1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(j1).toString());
                    }
                    view.h(j1);
                    LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                    t t2 = RecyclerView.b(view1);
                    if (t2.m())
                    {
                        ((i) (view)).r.e.b(view1);
                    } else
                    {
                        ((i) (view)).r.e.a(view1);
                    }
                    ((i) (view)).q.a(view1, k1, layoutparams1, t2.m());
                }
            } else
            {
                q.a(view, i1, false);
                layoutparams.c = true;
                if (s != null && s.e())
                {
                    s.a(view);
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        static boolean a(i i1)
        {
            return i1.a;
        }

        static boolean b(i i1)
        {
            i1.a = false;
            return false;
        }

        public static int e(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).a.c();
        }

        public static int f(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).b;
            int i1 = view.getMeasuredWidth();
            int j1 = rect.left;
            return rect.right + (i1 + j1);
        }

        public static int g(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).b;
            int i1 = view.getMeasuredHeight();
            int j1 = rect.top;
            return rect.bottom + (i1 + j1);
        }

        public static int h(View view)
        {
            return view.getLeft() - ((LayoutParams)view.getLayoutParams()).b.left;
        }

        private void h(int i1)
        {
            d(i1);
            q.d(i1);
        }

        public static int i(View view)
        {
            return view.getTop() - ((LayoutParams)view.getLayoutParams()).b.top;
        }

        public static int j(View view)
        {
            int i1 = view.getRight();
            return ((LayoutParams)view.getLayoutParams()).b.right + i1;
        }

        public static int k(View view)
        {
            int i1 = view.getBottom();
            return ((LayoutParams)view.getLayoutParams()).b.bottom + i1;
        }

        public int a(int i1, m m1, q q1)
        {
            return 0;
        }

        public int a(m m1, q q1)
        {
            while (r == null || RecyclerView.g(r) == null || !g()) 
            {
                return 1;
            }
            return RecyclerView.g(r).a();
        }

        public int a(q q1)
        {
            return 0;
        }

        public LayoutParams a(Context context, AttributeSet attributeset)
        {
            return new LayoutParams(context, attributeset);
        }

        public LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
        {
            if (layoutparams instanceof LayoutParams)
            {
                return new LayoutParams((LayoutParams)layoutparams);
            }
            if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
            {
                return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
            } else
            {
                return new LayoutParams(layoutparams);
            }
        }

        public void a()
        {
        }

        public void a(int i1, int j1)
        {
        }

        public final void a(int i1, m m1)
        {
            View view = d(i1);
            a(i1);
            m1.a(view);
        }

        public void a(Parcelable parcelable)
        {
        }

        public final void a(m m1)
        {
            int i1 = p() - 1;
            while (i1 >= 0) 
            {
                View view = d(i1);
                t t1 = RecyclerView.b(view);
                if (!t1.b())
                {
                    if (t1.i() && !t1.m() && !t1.k() && !RecyclerView.g(r).b())
                    {
                        a(i1);
                        m1.a(t1);
                    } else
                    {
                        h(i1);
                        m1.c(view);
                    }
                }
                i1--;
            }
        }

        public void a(m m1, q q1, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            int i1;
            int j1;
            if (g())
            {
                i1 = e(view);
            } else
            {
                i1 = 0;
            }
            if (f())
            {
                j1 = e(view);
            } else
            {
                j1 = 0;
            }
            accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(i1, 1, j1, 1, false, false));
        }

        public final void a(p p1)
        {
            if (s != null && p1 != s && s.e())
            {
                s.c();
            }
            s = p1;
            s.a(r, this);
        }

        final void a(RecyclerView recyclerview)
        {
            if (recyclerview == null)
            {
                r = null;
                q = null;
                return;
            } else
            {
                r = recyclerview;
                q = recyclerview.c;
                return;
            }
        }

        public void a(RecyclerView recyclerview, int i1)
        {
            Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void a(RecyclerView recyclerview, m m1)
        {
        }

        public final void a(View view)
        {
            a(view, -1, true);
        }

        public final void a(View view, Rect rect)
        {
            if (r == null)
            {
                rect.set(0, 0, 0, 0);
                return;
            } else
            {
                rect.set(r.e(view));
                return;
            }
        }

        final void a(View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
        {
            t t1 = RecyclerView.b(view);
            if (t1 != null && !t1.m() && !q.b(t1.a))
            {
                a(r.a, r.e, view, accessibilitynodeinfocompat);
            }
        }

        public final void a(View view, m m1)
        {
            android.support.v7.widget.b b1 = q;
            int i1 = b1.a.a(view);
            if (i1 >= 0)
            {
                if (b1.b.c(i1))
                {
                    b1.c.remove(view);
                }
                b1.a.a(i1);
            }
            m1.a(view);
        }

        public void a(AccessibilityEvent accessibilityevent)
        {
            boolean flag1 = true;
            Object obj = r.a;
            obj = r.e;
            accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
            if (r != null && accessibilityevent != null)
            {
                boolean flag = flag1;
                if (!ViewCompat.canScrollVertically(r, 1))
                {
                    flag = flag1;
                    if (!ViewCompat.canScrollVertically(r, -1))
                    {
                        flag = flag1;
                        if (!ViewCompat.canScrollHorizontally(r, -1))
                        {
                            if (ViewCompat.canScrollHorizontally(r, 1))
                            {
                                flag = flag1;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                accessibilityevent.setScrollable(flag);
                if (RecyclerView.g(r) != null)
                {
                    accessibilityevent.setItemCount(RecyclerView.g(r).a());
                    return;
                }
            }
        }

        public void a(String s1)
        {
            if (r != null)
            {
                r.a(s1);
            }
        }

        public boolean a(LayoutParams layoutparams)
        {
            return layoutparams != null;
        }

        public final boolean a(Runnable runnable)
        {
            if (r != null)
            {
                return r.removeCallbacks(runnable);
            } else
            {
                return false;
            }
        }

        public int b(int i1, m m1, q q1)
        {
            return 0;
        }

        public int b(m m1, q q1)
        {
            while (r == null || RecyclerView.g(r) == null || !f()) 
            {
                return 1;
            }
            return RecyclerView.g(r).a();
        }

        public int b(q q1)
        {
            return 0;
        }

        public abstract LayoutParams b();

        public View b(int i1)
        {
            int k1 = p();
            for (int j1 = 0; j1 < k1; j1++)
            {
                View view = d(j1);
                t t1 = RecyclerView.b(view);
                if (t1 != null && t1.c() == i1 && !t1.b() && (r.e.a() || !t1.m()))
                {
                    return view;
                }
            }

            return null;
        }

        public void b(int i1, int j1)
        {
        }

        final void b(m m1)
        {
            int j1 = m1.a.size();
            for (int i1 = j1 - 1; i1 >= 0; i1--)
            {
                View view = ((t)m1.a.get(i1)).a;
                t t1 = RecyclerView.b(view);
                if (t1.b())
                {
                    continue;
                }
                t1.a(false);
                if (t1.n())
                {
                    r.removeDetachedView(view, false);
                }
                if (r.d != null)
                {
                    r.d.c(t1);
                }
                t1.a(true);
                m1.b(view);
            }

            m1.a.clear();
            if (j1 > 0)
            {
                r.invalidate();
            }
        }

        final void b(RecyclerView recyclerview, m m1)
        {
            b = false;
            a(recyclerview, m1);
        }

        public final void b(View view)
        {
            a(view, 0, true);
        }

        public int c(q q1)
        {
            return 0;
        }

        public View c(int i1, m m1, q q1)
        {
            return null;
        }

        public void c(int i1)
        {
        }

        public void c(int i1, int j1)
        {
        }

        public final void c(m m1)
        {
            for (int i1 = p() - 1; i1 >= 0; i1--)
            {
                if (!RecyclerView.b(d(i1)).b())
                {
                    a(i1, m1);
                }
            }

        }

        public void c(m m1, q q1)
        {
            Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public final void c(View view)
        {
            a(view, -1, false);
        }

        public int d(q q1)
        {
            return 0;
        }

        public final View d(int i1)
        {
            if (q != null)
            {
                return q.b(i1);
            } else
            {
                return null;
            }
        }

        public void d(int i1, int j1)
        {
        }

        public final void d(View view)
        {
            a(view, 0, false);
        }

        public boolean d()
        {
            return false;
        }

        public int e(q q1)
        {
            return 0;
        }

        public Parcelable e()
        {
            return null;
        }

        public void e(int i1)
        {
            if (r != null)
            {
                RecyclerView recyclerview = r;
                int k1 = recyclerview.c.a();
                for (int j1 = 0; j1 < k1; j1++)
                {
                    recyclerview.c.b(j1).offsetLeftAndRight(i1);
                }

            }
        }

        public int f(q q1)
        {
            return 0;
        }

        public void f(int i1)
        {
            if (r != null)
            {
                RecyclerView recyclerview = r;
                int k1 = recyclerview.c.a();
                for (int j1 = 0; j1 < k1; j1++)
                {
                    recyclerview.c.b(j1).offsetTopAndBottom(i1);
                }

            }
        }

        public boolean f()
        {
            return false;
        }

        public void g(int i1)
        {
        }

        public boolean g()
        {
            return false;
        }

        public final void l()
        {
            if (r != null)
            {
                r.requestLayout();
            }
        }

        final void m()
        {
            b = true;
        }

        public final boolean n()
        {
            return b;
        }

        public final boolean o()
        {
            return s != null && s.e();
        }

        public final int p()
        {
            if (q != null)
            {
                return q.a();
            } else
            {
                return 0;
            }
        }

        public final int q()
        {
            if (r != null)
            {
                return r.getWidth();
            } else
            {
                return 0;
            }
        }

        public final int r()
        {
            if (r != null)
            {
                return r.getHeight();
            } else
            {
                return 0;
            }
        }

        public final int s()
        {
            if (r != null)
            {
                return r.getPaddingLeft();
            } else
            {
                return 0;
            }
        }

        public final int t()
        {
            if (r != null)
            {
                return r.getPaddingTop();
            } else
            {
                return 0;
            }
        }

        public final int u()
        {
            if (r != null)
            {
                return r.getPaddingRight();
            } else
            {
                return 0;
            }
        }

        public final int v()
        {
            if (r != null)
            {
                return r.getPaddingBottom();
            } else
            {
                return 0;
            }
        }

        final void w()
        {
            if (s != null)
            {
                s.c();
            }
        }

        public final void x()
        {
            a = true;
        }

        public i()
        {
            a = false;
            b = false;
        }
    }

    public static interface j
    {

        public abstract boolean a();
    }

    public static abstract class k
    {

        public void a(int i1)
        {
        }

        public k()
        {
        }
    }

    public static final class l
    {

        private SparseArray a;
        private SparseIntArray b;
        private int c;

        public final t a(int i1)
        {
            ArrayList arraylist = (ArrayList)a.get(i1);
            if (arraylist != null && !arraylist.isEmpty())
            {
                i1 = arraylist.size() - 1;
                t t1 = (t)arraylist.get(i1);
                arraylist.remove(i1);
                return t1;
            } else
            {
                return null;
            }
        }

        final void a(a a1, a a2)
        {
            if (a1 != null)
            {
                c = c - 1;
            }
            if (c == 0)
            {
                a.clear();
            }
            if (a2 != null)
            {
                c = c + 1;
            }
        }

        public final void a(t t1)
        {
            int i1 = t1.e;
            ArrayList arraylist1 = (ArrayList)a.get(i1);
            ArrayList arraylist = arraylist1;
            if (arraylist1 == null)
            {
                ArrayList arraylist2 = new ArrayList();
                a.put(i1, arraylist2);
                arraylist = arraylist2;
                if (b.indexOfKey(i1) < 0)
                {
                    b.put(i1, 5);
                    arraylist = arraylist2;
                }
            }
            if (b.get(i1) <= arraylist.size())
            {
                return;
            } else
            {
                t1.o();
                arraylist.add(t1);
                return;
            }
        }

        public l()
        {
            a = new SparseArray();
            b = new SparseIntArray();
            c = 0;
        }
    }

    public final class m
    {

        final ArrayList a = new ArrayList();
        final ArrayList b = new ArrayList();
        final RecyclerView c;
        private ArrayList d;
        private final List e;
        private int f;
        private l g;
        private r h;

        static ArrayList a(m m1)
        {
            return m1.d;
        }

        private void a(ViewGroup viewgroup, boolean flag)
        {
            for (int i1 = viewgroup.getChildCount() - 1; i1 >= 0; i1--)
            {
                View view = viewgroup.getChildAt(i1);
                if (view instanceof ViewGroup)
                {
                    a((ViewGroup)view, true);
                }
            }

            if (!flag)
            {
                return;
            }
            if (viewgroup.getVisibility() == 4)
            {
                viewgroup.setVisibility(0);
                viewgroup.setVisibility(4);
                return;
            } else
            {
                int j1 = viewgroup.getVisibility();
                viewgroup.setVisibility(4);
                viewgroup.setVisibility(j1);
                return;
            }
        }

        private void c(t t1)
        {
            ViewCompat.setAccessibilityDelegate(t1.a, null);
            if (RecyclerView.p(c) != null)
            {
                RecyclerView.p(c);
            }
            if (RecyclerView.g(c) != null)
            {
                RecyclerView.g(c);
            }
            if (c.e != null)
            {
                c.e.a(t1);
            }
            t1.i = null;
            d().a(t1);
        }

        private t d(int i1)
        {
            boolean flag;
            int k1;
label0:
            {
                flag = false;
                if (d != null)
                {
                    k1 = d.size();
                    if (k1 != 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            for (int j1 = 0; j1 < k1; j1++)
            {
                t t1 = (t)d.get(j1);
                if (!t1.f() && t1.c() == i1)
                {
                    t1.b(32);
                    return t1;
                }
            }

            if (RecyclerView.g(c).b())
            {
                i1 = c.b.a(i1, 0);
                if (i1 > 0 && i1 < RecyclerView.g(c).a())
                {
                    RecyclerView.g(c);
                    for (i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
                    {
                        t t2 = (t)d.get(i1);
                        if (!t2.f() && t2.d == -1L)
                        {
                            t2.b(32);
                            return t2;
                        }
                    }

                }
            }
            return null;
        }

        private t e(int i1)
        {
            android.support.v7.widget.b b1;
            int k1;
            boolean flag;
            int l1;
            flag = false;
            l1 = a.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                t t1 = (t)a.get(j1);
                if (!t1.f() && t1.c() == i1 && !t1.i() && (q.e(c.e) || !t1.m()))
                {
                    t1.b(32);
                    return t1;
                }
            }

            b1 = c.c;
            l1 = b1.c.size();
            k1 = 0;
_L7:
            if (k1 >= l1) goto _L2; else goto _L1
_L1:
            Object obj;
            t t2;
            obj = (View)b1.c.get(k1);
            t2 = b1.a.b(((View) (obj)));
            if (t2.c() != i1 || t2.i()) goto _L4; else goto _L3
_L3:
            if (obj != null)
            {
                c.d.c(c.a(((View) (obj))));
            }
            l1 = b.size();
            k1 = ((flag) ? 1 : 0);
_L5:
            if (k1 >= l1)
            {
                break MISSING_BLOCK_LABEL_272;
            }
            obj = (t)b.get(k1);
            if (!((t) (obj)).i() && ((t) (obj)).c() == i1)
            {
                b.remove(k1);
                return ((t) (obj));
            }
            break MISSING_BLOCK_LABEL_263;
_L4:
            k1++;
            continue; /* Loop/switch isn't completed */
_L2:
            obj = null;
              goto _L3
            k1++;
              goto _L5
            return null;
            if (true) goto _L7; else goto _L6
_L6:
        }

        private t f(int i1)
        {
            for (int j1 = a.size() - 1; j1 >= 0; j1--)
            {
                t t1 = (t)a.get(j1);
                if (t1.d != -1L || t1.f())
                {
                    continue;
                }
                if (i1 == t1.e)
                {
                    t1.b(32);
                    if (t1.m() && !c.e.a())
                    {
                        t1.a(2, 14);
                    }
                    return t1;
                }
                a.remove(j1);
                c.removeDetachedView(t1.a, false);
                b(t1.a);
            }

            for (int k1 = b.size() - 1; k1 >= 0; k1--)
            {
                t t2 = (t)b.get(k1);
                if (t2.d != -1L)
                {
                    continue;
                }
                if (i1 == t2.e)
                {
                    b.remove(k1);
                    return t2;
                }
                c(k1);
            }

            return null;
        }

        public final int a(int i1)
        {
            if (i1 < 0 || i1 >= c.e.e())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i1).append(". State item count is ").append(c.e.e()).toString());
            }
            if (!c.e.a())
            {
                return i1;
            } else
            {
                return c.b.a(i1);
            }
        }

        public final void a()
        {
            a.clear();
            c();
        }

        final void a(t t1)
        {
            boolean flag1;
            boolean flag2;
            flag2 = true;
            flag1 = false;
            if (t1.d() || t1.a.getParent() != null)
            {
                StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(t1.d()).append(" isAttached:");
                if (t1.a.getParent() == null)
                {
                    flag2 = false;
                }
                throw new IllegalArgumentException(stringbuilder.append(flag2).toString());
            }
            if (t1.n())
            {
                throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(t1).toString());
            }
            if (t1.b())
            {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            }
            flag2 = t.a(t1);
            if (RecyclerView.g(c) != null && flag2)
            {
                RecyclerView.g(c);
            }
            if (!t1.p())
            {
                break MISSING_BLOCK_LABEL_266;
            }
            if (t1.a(78)) goto _L2; else goto _L1
_L1:
            int i1;
            i1 = b.size();
            if (i1 == f && i1 > 0)
            {
                c(0);
            }
            if (i1 >= f) goto _L2; else goto _L3
_L3:
            boolean flag;
            b.add(t1);
            flag = true;
_L4:
            if (!flag)
            {
                c(t1);
                flag1 = true;
            }
_L5:
            c.e.a(t1);
            if (!flag && !flag1 && flag2)
            {
                t1.i = null;
            }
            return;
_L2:
            flag = false;
              goto _L4
            flag = false;
              goto _L5
        }

        public final void a(View view)
        {
            t t1;
            t1 = RecyclerView.b(view);
            if (t1.n())
            {
                c.removeDetachedView(view, false);
            }
            if (!t1.d()) goto _L2; else goto _L1
_L1:
            t1.e();
_L4:
            a(t1);
            return;
_L2:
            if (t1.f())
            {
                t1.g();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final View b(int i1)
        {
            boolean flag1 = true;
            if (i1 < 0 || i1 >= c.e.e())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i1).append("(").append(i1).append("). Item count:").append(c.e.e()).toString());
            }
            Object obj;
            Object obj1;
            Object obj2;
            int j1;
            boolean flag;
            int k1;
            int l1;
            int i2;
            long l2;
            if (c.e.a())
            {
                obj1 = d(i1);
                if (obj1 != null)
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
            } else
            {
                obj1 = null;
                j1 = 0;
            }
            obj = obj1;
            if (obj1 != null) goto _L2; else goto _L1
_L1:
            obj1 = e(i1);
            obj = obj1;
            if (obj1 == null) goto _L2; else goto _L3
_L3:
            if (((t) (obj1)).m()) goto _L5; else goto _L4
_L4:
            if (((t) (obj1)).b < 0 || ((t) (obj1)).b >= RecyclerView.g(c).a())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
            }
            if (c.e.a() || RecyclerView.g(c).a(((t) (obj1)).b) == ((t) (obj1)).e) goto _L7; else goto _L6
_L6:
            flag = false;
_L15:
            if (!flag)
            {
                ((t) (obj1)).b(4);
                if (((t) (obj1)).d())
                {
                    c.removeDetachedView(((t) (obj1)).a, false);
                    ((t) (obj1)).e();
                } else
                if (((t) (obj1)).f())
                {
                    ((t) (obj1)).g();
                }
                a(((t) (obj1)));
                obj = null;
            } else
            {
                j1 = 1;
                obj = obj1;
            }
_L2:
            obj2 = obj;
            l1 = j1;
            if (obj != null) goto _L9; else goto _L8
_L8:
            l1 = c.b.a(i1);
            if (l1 < 0 || l1 >= RecyclerView.g(c).a())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i1).append("(offset:").append(l1).append(").state:").append(c.e.e()).toString());
            }
            i2 = RecyclerView.g(c).a(l1);
            obj1 = obj;
            flag = j1;
            if (RecyclerView.g(c).b())
            {
                RecyclerView.g(c);
                obj = f(i2);
                obj1 = obj;
                flag = j1;
                if (obj != null)
                {
                    obj.b = l1;
                    flag = true;
                    obj1 = obj;
                }
            }
            obj = obj1;
            if (obj1 == null)
            {
                obj = obj1;
                if (h != null)
                {
                    obj2 = h.a();
                    obj = obj1;
                    if (obj2 != null)
                    {
                        obj1 = c.a(((View) (obj2)));
                        if (obj1 == null)
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                        }
                        obj = obj1;
                        if (((t) (obj1)).b())
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                        }
                    }
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = d().a(i2);
                if (obj1 != null)
                {
                    ((t) (obj1)).o();
                    if (RecyclerView.h() && (((t) (obj1)).a instanceof ViewGroup))
                    {
                        a((ViewGroup)((t) (obj1)).a, false);
                    }
                }
            }
            obj2 = obj1;
            l1 = ((flag) ? 1 : 0);
              goto _L10
_L7:
            if (RecyclerView.g(c).b())
            {
                l2 = ((t) (obj1)).d;
                RecyclerView.g(c);
                if (l2 != -1L)
                {
                    flag = false;
                    continue; /* Loop/switch isn't completed */
                }
            }
_L5:
            flag = true;
            continue; /* Loop/switch isn't completed */
_L10:
            if (obj1 != null) goto _L9; else goto _L11
_L11:
            obj = RecyclerView.g(c);
            obj1 = c;
            TraceCompat.beginSection("RV CreateView");
            obj1 = ((a) (obj)).a(((ViewGroup) (obj1)), i2);
            obj1.e = i2;
            j1 = ((flag) ? 1 : 0);
            TraceCompat.endSection();
_L13:
            if (c.e.a() && ((t) (obj1)).l())
            {
                obj1.f = i1;
                i1 = 0;
            } else
            if (!((t) (obj1)).l() || ((t) (obj1)).j() || ((t) (obj1)).i())
            {
                k1 = c.b.a(i1);
                obj1.i = c;
                RecyclerView.g(c).b(((t) (obj1)), k1);
                obj = ((t) (obj1)).a;
                if (RecyclerView.n(c) != null && RecyclerView.n(c).isEnabled())
                {
                    if (ViewCompat.getImportantForAccessibility(((View) (obj))) == 0)
                    {
                        ViewCompat.setImportantForAccessibility(((View) (obj)), 1);
                    }
                    if (!ViewCompat.hasAccessibilityDelegate(((View) (obj))))
                    {
                        ViewCompat.setAccessibilityDelegate(((View) (obj)), RecyclerView.o(c).b);
                    }
                }
                if (c.e.a())
                {
                    obj1.f = i1;
                }
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            obj = ((t) (obj1)).a.getLayoutParams();
            if (obj == null)
            {
                obj = (LayoutParams)c.generateDefaultLayoutParams();
                ((t) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            if (!c.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj))))
            {
                obj = (LayoutParams)c.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
                ((t) (obj1)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
            } else
            {
                obj = (LayoutParams)obj;
            }
            obj.a = ((t) (obj1));
            if (j1 == 0 || i1 == 0)
            {
                flag1 = false;
            }
            obj.d = flag1;
            return ((t) (obj1)).a;
_L9:
            j1 = l1;
            obj1 = obj2;
            if (true) goto _L13; else goto _L12
_L12:
            if (true) goto _L15; else goto _L14
_L14:
        }

        public final List b()
        {
            return e;
        }

        final void b(t t1)
        {
            if (!t1.k() || !RecyclerView.i(c) || d == null)
            {
                a.remove(t1);
            } else
            {
                d.remove(t1);
            }
            t.b(t1);
            t1.g();
        }

        final void b(View view)
        {
            view = RecyclerView.b(view);
            t.b(view);
            view.g();
            a(view);
        }

        final void c()
        {
            for (int i1 = b.size() - 1; i1 >= 0; i1--)
            {
                c(i1);
            }

            b.clear();
        }

        final void c(int i1)
        {
            c((t)b.get(i1));
            b.remove(i1);
        }

        final void c(View view)
        {
            view = RecyclerView.b(view);
            view.a(this);
            if (!view.k() || !RecyclerView.i(c))
            {
                if (view.i() && !view.m() && !RecyclerView.g(c).b())
                {
                    throw new IllegalArgumentException("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.");
                } else
                {
                    a.add(view);
                    return;
                }
            }
            if (d == null)
            {
                d = new ArrayList();
            }
            d.add(view);
        }

        final l d()
        {
            if (g == null)
            {
                g = new l();
            }
            return g;
        }

        final void e()
        {
            boolean flag = false;
            int l1 = b.size();
            for (int i1 = 0; i1 < l1; i1++)
            {
                ((t)b.get(i1)).a();
            }

            l1 = a.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                ((t)a.get(j1)).a();
            }

            if (d != null)
            {
                int i2 = d.size();
                for (int k1 = ((flag) ? 1 : 0); k1 < i2; k1++)
                {
                    ((t)d.get(k1)).a();
                }

            }
        }

        public m()
        {
            c = RecyclerView.this;
            super();
            d = null;
            e = Collections.unmodifiableList(a);
            f = 2;
        }
    }

    public static interface n
    {
    }

    private final class o extends c
    {

        final RecyclerView a;

        public final void a()
        {
            a.a(null);
            if (RecyclerView.g(a).b())
            {
                q.a(a.e, true);
                RecyclerView.m(a);
            } else
            {
                q.a(a.e, true);
                RecyclerView.m(a);
            }
            if (!a.b.d())
            {
                a.requestLayout();
            }
        }

        private o()
        {
            a = RecyclerView.this;
            super();
        }

        o(byte byte0)
        {
            this();
        }
    }

    public static abstract class p
    {

        private int a;
        private RecyclerView b;
        private i c;
        private boolean d;
        private boolean e;
        private View f;
        private final a g = new a();

        static void a(p p1, int i1, int j1)
        {
label0:
            {
                RecyclerView recyclerview = p1.b;
                if (!p1.e || p1.a == -1 || recyclerview == null)
                {
                    p1.c();
                }
                p1.d = false;
                if (p1.f != null)
                {
                    if (RecyclerView.d(p1.f) == p1.a)
                    {
                        View view = p1.f;
                        q q2 = recyclerview.e;
                        p1.a(view, p1.g);
                        a.a(p1.g, recyclerview);
                        p1.c();
                    } else
                    {
                        Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
                        p1.f = null;
                    }
                }
                if (p1.e)
                {
                    q q1 = recyclerview.e;
                    p1.a(i1, j1, p1.g);
                    boolean flag = p1.g.a();
                    a.a(p1.g, recyclerview);
                    if (flag)
                    {
                        if (!p1.e)
                        {
                            break label0;
                        }
                        p1.d = true;
                        RecyclerView.r(recyclerview).a();
                    }
                }
                return;
            }
            p1.c();
        }

        protected abstract void a();

        protected abstract void a(int i1, int j1, a a1);

        final void a(RecyclerView recyclerview, i i1)
        {
            b = recyclerview;
            c = i1;
            if (a == -1)
            {
                throw new IllegalArgumentException("Invalid target position");
            } else
            {
                q.c(b.e, a);
                e = true;
                d = true;
                int j1 = a;
                f = RecyclerView.e(b).b(j1);
                RecyclerView.r(b).a();
                return;
            }
        }

        protected final void a(View view)
        {
            if (RecyclerView.d(view) == a)
            {
                f = view;
            }
        }

        protected abstract void a(View view, a a1);

        public final i b()
        {
            return c;
        }

        public final void b(int i1)
        {
            a = i1;
        }

        protected final void c()
        {
            if (!e)
            {
                return;
            } else
            {
                a();
                q.c(b.e, -1);
                f = null;
                a = -1;
                d = false;
                e = false;
                i.a(c, this);
                c = null;
                b = null;
                return;
            }
        }

        public final boolean d()
        {
            return d;
        }

        public final boolean e()
        {
            return e;
        }

        public final int f()
        {
            return a;
        }

        public final int g()
        {
            return RecyclerView.e(b).p();
        }

        public p()
        {
            a = -1;
        }
    }

    public static final class p.a
    {

        private int a;
        private int b;
        private int c;
        private int d;
        private Interpolator e;
        private boolean f;
        private int g;

        static void a(p.a a1, RecyclerView recyclerview)
        {
            if (a1.d >= 0)
            {
                int i1 = a1.d;
                a1.d = -1;
                RecyclerView.c(recyclerview, i1);
                a1.f = false;
                return;
            }
            if (a1.f)
            {
                if (a1.e != null && a1.c <= 0)
                {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (a1.c <= 0)
                {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                if (a1.e == null)
                {
                    if (a1.c == 0x80000000)
                    {
                        RecyclerView.r(recyclerview).b(a1.a, a1.b);
                    } else
                    {
                        RecyclerView.r(recyclerview).a(a1.a, a1.b, a1.c);
                    }
                } else
                {
                    RecyclerView.r(recyclerview).a(a1.a, a1.b, a1.c, a1.e);
                }
                a1.g = a1.g + 1;
                if (a1.g > 10)
                {
                    Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                }
                a1.f = false;
                return;
            } else
            {
                a1.g = 0;
                return;
            }
        }

        public final void a(int i1)
        {
            d = i1;
        }

        public final void a(int i1, int j1, int k1, Interpolator interpolator)
        {
            a = i1;
            b = j1;
            c = k1;
            e = interpolator;
            f = true;
        }

        final boolean a()
        {
            return d >= 0;
        }

        public p.a()
        {
            this((byte)0);
        }

        private p.a(byte byte0)
        {
            d = -1;
            f = false;
            g = 0;
            a = 0;
            b = 0;
            c = 0x80000000;
            e = null;
        }
    }

    public static final class q
    {

        ArrayMap a;
        ArrayMap b;
        ArrayMap c;
        final List d = new ArrayList();
        int e;
        private int f;
        private SparseArray g;
        private int h;
        private int i;
        private boolean j;
        private boolean k;
        private boolean l;
        private boolean m;

        static int a(q q1, int i1)
        {
            i1 = q1.i + i1;
            q1.i = i1;
            return i1;
        }

        static boolean a(q q1)
        {
            return q1.m;
        }

        static boolean a(q q1, boolean flag)
        {
            q1.j = flag;
            return flag;
        }

        static int b(q q1, int i1)
        {
            q1.h = i1;
            return i1;
        }

        static boolean b(q q1)
        {
            return q1.l;
        }

        static boolean b(q q1, boolean flag)
        {
            q1.k = flag;
            return flag;
        }

        static int c(q q1, int i1)
        {
            q1.f = i1;
            return i1;
        }

        static boolean c(q q1)
        {
            return q1.j;
        }

        static boolean c(q q1, boolean flag)
        {
            q1.l = flag;
            return flag;
        }

        static int d(q q1)
        {
            q1.i = 0;
            return 0;
        }

        static boolean d(q q1, boolean flag)
        {
            q1.m = flag;
            return flag;
        }

        static boolean e(q q1)
        {
            return q1.k;
        }

        final void a(t t1)
        {
            a.remove(t1);
            b.remove(t1);
            if (c == null) goto _L2; else goto _L1
_L1:
            ArrayMap arraymap;
            int i1;
            arraymap = c;
            i1 = arraymap.size() - 1;
_L7:
            if (i1 < 0) goto _L2; else goto _L3
_L3:
            if (t1 != arraymap.valueAt(i1)) goto _L5; else goto _L4
_L4:
            arraymap.removeAt(i1);
_L2:
            d.remove(t1.a);
            return;
_L5:
            i1--;
            if (true) goto _L7; else goto _L6
_L6:
        }

        final void a(View view)
        {
            d.remove(view);
        }

        public final boolean a()
        {
            return k;
        }

        final void b(View view)
        {
            if (!d.contains(view))
            {
                d.add(view);
            }
        }

        public final boolean b()
        {
            return m;
        }

        public final int c()
        {
            return f;
        }

        public final boolean d()
        {
            return f != -1;
        }

        public final int e()
        {
            if (k)
            {
                return h - i;
            } else
            {
                return e;
            }
        }

        public final String toString()
        {
            return (new StringBuilder("State{mTargetPosition=")).append(f).append(", mPreLayoutHolderMap=").append(a).append(", mPostLayoutHolderMap=").append(b).append(", mData=").append(g).append(", mItemCount=").append(e).append(", mPreviousLayoutItemCount=").append(h).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(i).append(", mStructureChanged=").append(j).append(", mInPreLayout=").append(k).append(", mRunSimpleAnimations=").append(l).append(", mRunPredictiveAnimations=").append(m).append('}').toString();
        }

        public q()
        {
            f = -1;
            a = new ArrayMap();
            b = new ArrayMap();
            c = new ArrayMap();
            e = 0;
            h = 0;
            i = 0;
            j = false;
            k = false;
            l = false;
            m = false;
        }
    }

    public static abstract class r
    {

        public abstract View a();
    }

    private final class s
        implements Runnable
    {

        final RecyclerView a;
        private int b;
        private int c;
        private ScrollerCompat d;
        private Interpolator e;
        private boolean f;
        private boolean g;

        final void a()
        {
            if (f)
            {
                g = true;
                return;
            } else
            {
                a.removeCallbacks(this);
                ViewCompat.postOnAnimation(a, this);
                return;
            }
        }

        public final void a(int i1, int j1)
        {
            RecyclerView.b(a, 2);
            c = 0;
            b = 0;
            d.fling(0, 0, i1, j1, 0x80000000, 0x7fffffff, 0x80000000, 0x7fffffff);
            a();
        }

        public final void a(int i1, int j1, int k1)
        {
            a(i1, j1, k1, RecyclerView.g());
        }

        public final void a(int i1, int j1, int k1, Interpolator interpolator)
        {
            if (e != interpolator)
            {
                e = interpolator;
                d = ScrollerCompat.create(a.getContext(), interpolator);
            }
            RecyclerView.b(a, 2);
            c = 0;
            b = 0;
            d.startScroll(0, 0, i1, j1, k1);
            a();
        }

        public final void b()
        {
            a.removeCallbacks(this);
            d.abortAnimation();
        }

        public final void b(int i1, int j1)
        {
            int i2 = Math.abs(i1);
            int j2 = Math.abs(j1);
            float f1;
            float f2;
            float f3;
            int k1;
            boolean flag;
            int k2;
            int l2;
            int i3;
            if (i2 > j2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            k2 = (int)Math.sqrt(0.0D);
            l2 = (int)Math.sqrt(i1 * i1 + j1 * j1);
            if (flag)
            {
                k1 = a.getWidth();
            } else
            {
                k1 = a.getHeight();
            }
            i3 = k1 / 2;
            f3 = Math.min(1.0F, ((float)l2 * 1.0F) / (float)k1);
            f1 = i3;
            f2 = i3;
            f3 = (float)Math.sin((float)((double)(f3 - 0.5F) * 0.4712389167638204D));
            if (k2 > 0)
            {
                k1 = Math.round(1000F * Math.abs((f3 * f2 + f1) / (float)k2)) * 4;
            } else
            {
                int l1;
                if (flag)
                {
                    l1 = i2;
                } else
                {
                    l1 = j2;
                }
                k1 = (int)(((float)l1 / (float)k1 + 1.0F) * 300F);
            }
            a(i1, j1, Math.min(k1, 2000));
        }

        public final void run()
        {
            ScrollerCompat scrollercompat;
            p p1;
            g = false;
            f = true;
            RecyclerView.f(a);
            scrollercompat = d;
            p1 = RecyclerView.e(a).s;
            if (!scrollercompat.computeScrollOffset()) goto _L2; else goto _L1
_L1:
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            int l2;
            int i3;
            int j3;
            int k3;
            int l3;
            k3 = scrollercompat.getCurrX();
            l3 = scrollercompat.getCurrY();
            i3 = k3 - b;
            j3 = l3 - c;
            j2 = 0;
            i1 = 0;
            k2 = 0;
            l1 = 0;
            b = k3;
            c = l3;
            l2 = 0;
            j1 = 0;
            i2 = 0;
            k1 = 0;
            if (RecyclerView.g(a) == null)
            {
                break MISSING_BLOCK_LABEL_856;
            }
            a.c();
            RecyclerView.h(a);
            TraceCompat.beginSection("RV Scroll");
            if (i3 != 0)
            {
                i1 = RecyclerView.e(a).a(i3, a.a, a.e);
                j1 = i3 - i1;
            }
            if (j3 != 0)
            {
                l1 = RecyclerView.e(a).b(j3, a.a, a.e);
                k1 = j3 - l1;
            }
            TraceCompat.endSection();
            if (RecyclerView.i(a))
            {
                j2 = a.c.a();
                for (i2 = 0; i2 < j2; i2++)
                {
                    View view = a.c.b(i2);
                    Object obj = a.a(view);
                    if (obj == null || ((t) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((t) (obj)).h.a;
                    k2 = view.getLeft();
                    l2 = view.getTop();
                    if (k2 != ((View) (obj)).getLeft() || l2 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(k2, l2, ((View) (obj)).getWidth() + k2, ((View) (obj)).getHeight() + l2);
                    }
                }

            }
            RecyclerView.j(a);
            a.a(false);
            i2 = k1;
            k2 = l1;
            l2 = j1;
            j2 = i1;
            if (p1 == null)
            {
                break MISSING_BLOCK_LABEL_856;
            }
            i2 = k1;
            k2 = l1;
            l2 = j1;
            j2 = i1;
            if (p1.d())
            {
                break MISSING_BLOCK_LABEL_856;
            }
            i2 = k1;
            k2 = l1;
            l2 = j1;
            j2 = i1;
            if (!p1.e())
            {
                break MISSING_BLOCK_LABEL_856;
            }
            i2 = a.e.e();
            if (i2 != 0) goto _L4; else goto _L3
_L3:
            p1.c();
            j2 = i1;
_L5:
            if (!RecyclerView.k(a).isEmpty())
            {
                a.invalidate();
            }
            if (ViewCompat.getOverScrollMode(a) != 2)
            {
                RecyclerView.a(a, i3, j3);
            }
            if (j1 != 0 || k1 != 0)
            {
                i2 = (int)scrollercompat.getCurrVelocity();
                if (j1 != k3)
                {
                    if (j1 < 0)
                    {
                        i1 = -i2;
                    } else
                    if (j1 > 0)
                    {
                        i1 = i2;
                    } else
                    {
                        i1 = 0;
                    }
                    k2 = i1;
                } else
                {
                    k2 = 0;
                }
                if (k1 != l3)
                {
                    if (k1 < 0)
                    {
                        i1 = -i2;
                    } else
                    {
                        i1 = i2;
                        if (k1 <= 0)
                        {
                            i1 = 0;
                        }
                    }
                } else
                {
                    i1 = 0;
                }
                if (ViewCompat.getOverScrollMode(a) != 2)
                {
                    a.a(k2, i1);
                }
                if ((k2 != 0 || j1 == k3 || scrollercompat.getFinalX() == 0) && (i1 != 0 || k1 == l3 || scrollercompat.getFinalY() == 0))
                {
                    scrollercompat.abortAnimation();
                }
            }
            if (j2 != 0 || l1 != 0)
            {
                a.b(l1);
            }
            if (!RecyclerView.l(a))
            {
                a.invalidate();
            }
            if (j3 != 0 && RecyclerView.e(a).g() && l1 == j3)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i3 != 0 && RecyclerView.e(a).f() && j2 == i3)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (i3 == 0 && j3 == 0 || j1 != 0 || i1 != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (scrollercompat.isFinished() || i1 == 0)
            {
                RecyclerView.b(a, 0);
            } else
            {
                a();
            }
_L2:
            if (p1 != null)
            {
                if (p1.d())
                {
                    p.a(p1, 0, 0);
                }
                if (!g)
                {
                    p1.c();
                }
            }
            f = false;
            if (g)
            {
                a();
            }
            return;
_L4:
            if (p1.f() >= i2)
            {
                p1.b(i2 - 1);
            }
            p.a(p1, i3 - j1, j3 - k1);
            j2 = i1;
            l2 = j1;
            k2 = l1;
            i2 = k1;
            l1 = k2;
            j1 = l2;
            k1 = i2;
              goto _L5
        }

        public s()
        {
            a = RecyclerView.this;
            super();
            e = RecyclerView.g();
            f = false;
            g = false;
            d = ScrollerCompat.create(getContext(), RecyclerView.g());
        }
    }

    public static abstract class t
    {

        public final View a;
        int b;
        int c;
        long d;
        int e;
        int f;
        t g;
        t h;
        RecyclerView i;
        private int j;
        private int k;
        private m l;

        static boolean a(t t1)
        {
            return (t1.j & 0x10) == 0 && ViewCompat.hasTransientState(t1.a);
        }

        static m b(t t1)
        {
            t1.l = null;
            return null;
        }

        static boolean c(t t1)
        {
            return (t1.j & 0x10) != 0;
        }

        static int d(t t1)
        {
            return t1.j;
        }

        final void a()
        {
            c = -1;
            f = -1;
        }

        final void a(int i1, int j1)
        {
            j = j & ~j1 | i1 & j1;
        }

        final void a(int i1, boolean flag)
        {
            if (c == -1)
            {
                c = b;
            }
            if (f == -1)
            {
                f = b;
            }
            if (flag)
            {
                f = f + i1;
            }
            b = b + i1;
            if (a.getLayoutParams() != null)
            {
                ((LayoutParams)a.getLayoutParams()).c = true;
            }
        }

        final void a(m m1)
        {
            l = m1;
        }

        public final void a(boolean flag)
        {
            int i1;
            if (flag)
            {
                i1 = k - 1;
            } else
            {
                i1 = k + 1;
            }
            k = i1;
            if (k < 0)
            {
                k = 0;
                Log.e("View", (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this).toString());
            } else
            {
                if (!flag && k == 1)
                {
                    j = j | 0x10;
                    return;
                }
                if (flag && k == 0)
                {
                    j = j & 0xffffffef;
                    return;
                }
            }
        }

        final boolean a(int i1)
        {
            return (j & i1) != 0;
        }

        final void b(int i1)
        {
            j = j | i1;
        }

        final boolean b()
        {
            return (j & 0x80) != 0;
        }

        public final int c()
        {
            if (f == -1)
            {
                return b;
            } else
            {
                return f;
            }
        }

        final boolean d()
        {
            return l != null;
        }

        final void e()
        {
            l.b(this);
        }

        final boolean f()
        {
            return (j & 0x20) != 0;
        }

        final void g()
        {
            j = j & 0xffffffdf;
        }

        final void h()
        {
            j = j & 0xfffffeff;
        }

        final boolean i()
        {
            return (j & 4) != 0;
        }

        final boolean j()
        {
            return (j & 2) != 0;
        }

        final boolean k()
        {
            return (j & 0x40) != 0;
        }

        final boolean l()
        {
            return (j & 1) != 0;
        }

        final boolean m()
        {
            return (j & 8) != 0;
        }

        final boolean n()
        {
            return (j & 0x100) != 0;
        }

        final void o()
        {
            j = 0;
            b = -1;
            c = -1;
            d = -1L;
            f = -1;
            k = 0;
            g = null;
            h = null;
        }

        public final boolean p()
        {
            return (j & 0x10) == 0 && !ViewCompat.hasTransientState(a);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(b).append(" id=").append(d).append(", oldPos=").append(c).append(", pLpos:").append(f).toString());
            if (d())
            {
                stringbuilder.append(" scrap");
            }
            if (i())
            {
                stringbuilder.append(" invalid");
            }
            if (!l())
            {
                stringbuilder.append(" unbound");
            }
            if (j())
            {
                stringbuilder.append(" update");
            }
            if (m())
            {
                stringbuilder.append(" removed");
            }
            if (b())
            {
                stringbuilder.append(" ignored");
            }
            if (k())
            {
                stringbuilder.append(" changed");
            }
            if (n())
            {
                stringbuilder.append(" tmpDetached");
            }
            if (!p())
            {
                stringbuilder.append((new StringBuilder(" not recyclable(")).append(k).append(")").toString());
            }
            boolean flag;
            if ((j & 0x200) != 0 || i())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                stringbuilder.append("undefined adapter position");
            }
            if (a.getParent() == null)
            {
                stringbuilder.append(" no parent");
            }
            stringbuilder.append("}");
            return stringbuilder.toString();
        }

        public t(View view)
        {
            b = -1;
            c = -1;
            d = -1L;
            e = -1;
            f = -1;
            g = null;
            h = null;
            k = 0;
            l = null;
            if (view == null)
            {
                throw new IllegalArgumentException("itemView may not be null");
            } else
            {
                a = view;
                return;
            }
        }
    }


    private static final Interpolator ak = new v();
    private static final boolean h;
    private static final Class i[];
    private final boolean A;
    private final AccessibilityManager B;
    private List C;
    private boolean D;
    private int E;
    private EdgeEffectCompat F;
    private EdgeEffectCompat G;
    private EdgeEffectCompat H;
    private EdgeEffectCompat I;
    private int J;
    private int K;
    private VelocityTracker L;
    private int M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private final int R;
    private final int S;
    private float T;
    private final s U;
    private k V;
    private List W;
    final m a;
    private e.a aa;
    private boolean ab;
    private RecyclerViewAccessibilityDelegate ac;
    private d ad;
    private final int ae[];
    private final NestedScrollingChildHelper af;
    private final int ag[];
    private final int ah[];
    private final int ai[];
    private Runnable aj;
    android.support.v7.widget.a b;
    android.support.v7.widget.b c;
    e d;
    final q e;
    boolean f;
    boolean g;
    private final o j;
    private SavedState k;
    private boolean l;
    private final Runnable m;
    private final Rect n;
    private a o;
    private i p;
    private n q;
    private final ArrayList r;
    private final ArrayList s;
    private j t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public RecyclerView(Context context)
    {
        this(context, null);
    }

    public RecyclerView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public RecyclerView(Context context, AttributeSet attributeset, int i1)
    {
        Object obj;
        Object obj1;
        Class class1;
        super(context, attributeset, i1);
        j = new o((byte)0);
        a = new m();
        m = new android.support.v7.widget.t(this);
        n = new Rect();
        r = new ArrayList();
        s = new ArrayList();
        D = false;
        E = 0;
        d = new android.support.v7.widget.c();
        J = 0;
        K = -1;
        T = 1.401298E-45F;
        U = new s();
        e = new q();
        f = false;
        g = false;
        aa = new f((byte)0);
        ab = false;
        ae = new int[2];
        ag = new int[2];
        ah = new int[2];
        ai = new int[2];
        aj = new u(this);
        setFocusableInTouchMode(true);
        Object aobj[];
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        A = flag;
        obj = ViewConfiguration.get(context);
        Q = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        R = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        S = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
        if (ViewCompat.getOverScrollMode(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        d.a(aa);
        b = new android.support.v7.widget.a(new x(this));
        c = new android.support.v7.widget.b(new w(this));
        if (ViewCompat.getImportantForAccessibility(this) == 0)
        {
            ViewCompat.setImportantForAccessibility(this, 1);
        }
        B = (AccessibilityManager)getContext().getSystemService("accessibility");
        ac = new RecyclerViewAccessibilityDelegate(this);
        ViewCompat.setAccessibilityDelegate(this, ac);
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        obj = context.obtainStyledAttributes(attributeset, android.support.v7.a.a.a.a, i1, 0);
        obj1 = ((TypedArray) (obj)).getString(android.support.v7.a.a.a.b);
        ((TypedArray) (obj)).recycle();
        if (obj1 == null) goto _L2; else goto _L3
_L3:
        obj = ((String) (obj1)).trim();
        if (((String) (obj)).length() == 0) goto _L2; else goto _L4
_L4:
        if (((String) (obj)).charAt(0) == '.')
        {
            obj = (new StringBuilder()).append(context.getPackageName()).append(((String) (obj))).toString();
        } else
        if (!((String) (obj)).contains("."))
        {
            obj = (new StringBuilder()).append(android/support/v7/widget/RecyclerView.getPackage().getName()).append('.').append(((String) (obj))).toString();
        }
_L9:
        if (!isInEditMode()) goto _L6; else goto _L5
_L5:
        obj1 = getClass().getClassLoader();
_L7:
        class1 = ((ClassLoader) (obj1)).loadClass(((String) (obj))).asSubclass(android/support/v7/widget/RecyclerView$i);
        obj1 = class1.getConstructor(i);
        aobj = new Object[4];
        aobj[0] = context;
        aobj[1] = attributeset;
        aobj[2] = Integer.valueOf(i1);
        aobj[3] = Integer.valueOf(0);
        context = ((Context) (aobj));
_L8:
        NoSuchMethodException nosuchmethodexception;
        try
        {
            ((Constructor) (obj1)).setAccessible(true);
            a((i)((Constructor) (obj1)).newInstance(context));
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Unable to find LayoutManager ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Could not instantiate the LayoutManager: ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Cannot access non-public constructor ").append(((String) (obj))).toString(), context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Class is not a LayoutManager ").append(((String) (obj))).toString(), context);
        }
_L2:
        af = new NestedScrollingChildHelper(this);
        setNestedScrollingEnabled(true);
        return;
_L6:
        obj1 = context.getClassLoader();
          goto _L7
        context;
        obj1 = class1.getConstructor(new Class[0]);
        context = null;
          goto _L8
        nosuchmethodexception;
        nosuchmethodexception.initCause(context);
        throw new IllegalStateException((new StringBuilder()).append(attributeset.getPositionDescription()).append(": Error creating LayoutManager ").append(((String) (obj))).toString(), nosuchmethodexception);
          goto _L9
    }

    private void a(ArrayMap arraymap)
    {
        List list = e.d;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            t t1 = b(view);
            h h1 = (h)e.a.remove(t1);
            if (!e.a())
            {
                e.b.remove(t1);
            }
            if (arraymap.remove(view) != null)
            {
                p.a(view, a);
            } else
            if (h1 != null)
            {
                a(h1);
            } else
            {
                a(new h(t1, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            }
            i1--;
        }
        list.clear();
    }

    private void a(h h1)
    {
        View view = h1.a.a;
        a(h1.a);
        int i1 = h1.b;
        int j1 = h1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (!h1.a.m() && (i1 != k1 || j1 != l1))
        {
            h1.a.a(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (d.a(h1.a, i1, j1, k1, l1))
            {
                v();
            }
            return;
        } else
        {
            h1.a.a(false);
            d.a(h1.a);
            v();
            return;
        }
    }

    private void a(t t1)
    {
        View view = t1.a;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (t1.n())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view);
            return;
        }
        t1 = c;
        int i1 = ((android.support.v7.widget.b) (t1)).a.a(view);
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            ((android.support.v7.widget.b) (t1)).b.a(i1);
            ((android.support.v7.widget.b) (t1)).c.add(view);
            return;
        }
    }

    static void a(RecyclerView recyclerview, int i1)
    {
        recyclerview.detachViewFromParent(i1);
    }

    static void a(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.c(i1, j1);
    }

    static void a(RecyclerView recyclerview, View view)
    {
        view = b(view);
        if (recyclerview.o != null && view != null)
        {
            recyclerview.o.a(view);
        }
        if (recyclerview.C != null)
        {
            for (int i1 = recyclerview.C.size() - 1; i1 >= 0; i1--)
            {
                recyclerview.C.get(i1);
            }

        }
    }

    static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        recyclerview.attachViewToParent(view, i1, layoutparams);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = MotionEventCompat.getActionIndex(motionevent);
        if (MotionEventCompat.getPointerId(motionevent, i1) == K)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            K = MotionEventCompat.getPointerId(motionevent, i1);
            j1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
            O = j1;
            M = j1;
            i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
            P = i1;
            N = i1;
        }
    }

    private boolean a(int i1, int j1, MotionEvent motionevent)
    {
        int l1 = 0;
        boolean flag4 = false;
        int j2 = 0;
        boolean flag2 = false;
        int k2 = 0;
        int k1 = 0;
        int i2 = 0;
        boolean flag3 = false;
        i();
        if (o != null)
        {
            c();
            r();
            TraceCompat.beginSection("RV Scroll");
            l1 = ((flag4) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = p.a(i1, a, e);
                l1 = i1 - k1;
            }
            i2 = ((flag3) ? 1 : 0);
            j2 = ((flag2) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = p.b(j1, a, e);
                j2 = j1 - i2;
            }
            TraceCompat.endSection();
            if (u())
            {
                int l2 = c.a();
                k2 = 0;
                while (k2 < l2) 
                {
                    View view = c.b(k2);
                    Object obj = a(view);
                    if (obj == null || ((t) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((t) (obj)).h;
                    int i3;
                    int j3;
                    if (obj != null)
                    {
                        obj = ((t) (obj)).a;
                    } else
                    {
                        obj = null;
                    }
                    if (obj == null)
                    {
                        continue;
                    }
                    i3 = view.getLeft();
                    j3 = view.getTop();
                    if (i3 != ((View) (obj)).getLeft() || j3 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(i3, j3, ((View) (obj)).getWidth() + i3, ((View) (obj)).getHeight() + j3);
                    }
                    k2++;
                }
            }
            s();
            a(false);
            k2 = k1;
        }
        if (!r.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k2, i2, l1, j2, ag))
        {
            O = O - ag[0];
            P = P - ag[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(ag[0], ag[1]);
            }
            motionevent = ai;
            motionevent[0] = motionevent[0] + ag[0];
            motionevent = ai;
            motionevent[1] = motionevent[1] + ag[1];
        } else
        if (ViewCompat.getOverScrollMode(this) != 2)
        {
            if (motionevent != null)
            {
                float f1 = motionevent.getX();
                float f2 = l1;
                float f3 = motionevent.getY();
                float f4 = j2;
                boolean flag1 = false;
                boolean flag;
                if (f2 < 0.0F)
                {
                    l();
                    flag = flag1;
                    if (F.onPull(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
                    {
                        flag = true;
                    }
                } else
                {
                    flag = flag1;
                    if (f2 > 0.0F)
                    {
                        m();
                        flag = flag1;
                        if (H.onPull(f2 / (float)getWidth(), f3 / (float)getHeight()))
                        {
                            flag = true;
                        }
                    }
                }
                if (f4 < 0.0F)
                {
                    n();
                    flag1 = flag;
                    if (G.onPull(-f4 / (float)getHeight(), f1 / (float)getWidth()))
                    {
                        flag1 = true;
                    }
                } else
                {
                    flag1 = flag;
                    if (f4 > 0.0F)
                    {
                        o();
                        flag1 = flag;
                        if (I.onPull(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
                        {
                            flag1 = true;
                        }
                    }
                }
                if (flag1 || f2 != 0.0F || f4 != 0.0F)
                {
                    ViewCompat.postInvalidateOnAnimation(this);
                }
            }
            c(i1, j1);
        }
        if (k2 != 0 || i2 != 0)
        {
            b(i2);
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k2 != 0 || i2 != 0;
    }

    static boolean a(RecyclerView recyclerview)
    {
        return recyclerview.v;
    }

    private long b(t t1)
    {
        if (o.b())
        {
            return t1.d;
        } else
        {
            return (long)t1.b;
        }
    }

    static t b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).a;
        }
    }

    static void b(RecyclerView recyclerview, int i1)
    {
        recyclerview.c(i1);
    }

    static void b(RecyclerView recyclerview, View view)
    {
        recyclerview.f(view);
    }

    static boolean b(RecyclerView recyclerview)
    {
        return recyclerview.D;
    }

    private void c(int i1)
    {
        if (i1 != J) goto _L2; else goto _L1
_L1:
        return;
_L2:
        J = i1;
        if (i1 != 2)
        {
            j();
        }
        if (p != null)
        {
            p.g(i1);
        }
        if (W != null)
        {
            i1 = W.size() - 1;
            while (i1 >= 0) 
            {
                W.get(i1);
                i1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private void c(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (F != null)
        {
            flag = flag1;
            if (!F.isFinished())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = F.onRelease();
                }
            }
        }
        flag1 = flag;
        if (H != null)
        {
            flag1 = flag;
            if (!H.isFinished())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | H.onRelease();
                }
            }
        }
        flag = flag1;
        if (G != null)
        {
            flag = flag1;
            if (!G.isFinished())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | G.onRelease();
                }
            }
        }
        flag1 = flag;
        if (I != null)
        {
            flag1 = flag;
            if (!I.isFinished())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | I.onRelease();
                }
            }
        }
        if (flag1)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    static void c(RecyclerView recyclerview, int i1)
    {
        if (recyclerview.p != null)
        {
            recyclerview.p.c(i1);
            recyclerview.awakenScrollBars();
        }
    }

    static boolean c(RecyclerView recyclerview)
    {
        return recyclerview.x;
    }

    static boolean c(RecyclerView recyclerview, View view)
    {
        boolean flag = true;
        recyclerview.c();
        android.support.v7.widget.b b1 = recyclerview.c;
        int i1 = b1.a.a(view);
        if (i1 == -1)
        {
            b1.c.remove(view);
        } else
        if (b1.b.b(i1))
        {
            b1.b.c(i1);
            b1.c.remove(view);
            b1.a.a(i1);
        } else
        {
            flag = false;
        }
        if (flag)
        {
            view = b(view);
            recyclerview.a.b(view);
            recyclerview.a.a(view);
        }
        recyclerview.a(false);
        return flag;
    }

    public static int d(View view)
    {
        view = b(view);
        if (view != null)
        {
            return view.c();
        } else
        {
            return -1;
        }
    }

    private void d(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        switch (l1)
        {
        default:
            i1 = ViewCompat.getMinimumWidth(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = ViewCompat.getMinimumHeight(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                break;
            }
            break;
        }
    }

    static boolean d(RecyclerView recyclerview)
    {
        recyclerview.ab = false;
        return false;
    }

    static i e(RecyclerView recyclerview)
    {
        return recyclerview.p;
    }

    private boolean e(int i1, int j1)
    {
        int l1;
        boolean flag1;
        flag1 = false;
        l1 = c.a();
        if (l1 != 0) goto _L2; else goto _L1
_L1:
        boolean flag;
label0:
        {
            if (i1 == 0)
            {
                flag = flag1;
                if (j1 == 0)
                {
                    break label0;
                }
            }
            flag = true;
        }
_L4:
        return flag;
_L2:
        int k1 = 0;
        do
        {
            flag = flag1;
            if (k1 >= l1)
            {
                continue;
            }
            t t1 = b(c.b(k1));
            if (!t1.b())
            {
                int i2 = t1.c();
                if (i2 < i1 || i2 > j1)
                {
                    return true;
                }
            }
            k1++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void f(RecyclerView recyclerview)
    {
        recyclerview.i();
    }

    private void f(View view)
    {
        view = b(view);
        if (o != null && view != null)
        {
            o.b(view);
        }
        if (C != null)
        {
            for (int i1 = C.size() - 1; i1 >= 0; i1--)
            {
                C.get(i1);
            }

        }
    }

    static a g(RecyclerView recyclerview)
    {
        return recyclerview.o;
    }

    static Interpolator g()
    {
        return ak;
    }

    static void h(RecyclerView recyclerview)
    {
        recyclerview.r();
    }

    static boolean h()
    {
        return h;
    }

    private void i()
    {
        m.run();
    }

    static boolean i(RecyclerView recyclerview)
    {
        return recyclerview.u();
    }

    private void j()
    {
        U.b();
        if (p != null)
        {
            p.w();
        }
    }

    static void j(RecyclerView recyclerview)
    {
        recyclerview.s();
    }

    static ArrayList k(RecyclerView recyclerview)
    {
        return recyclerview.r;
    }

    private void k()
    {
        boolean flag1 = false;
        if (F != null)
        {
            flag1 = F.onRelease();
        }
        boolean flag = flag1;
        if (G != null)
        {
            flag = flag1 | G.onRelease();
        }
        flag1 = flag;
        if (H != null)
        {
            flag1 = flag | H.onRelease();
        }
        flag = flag1;
        if (I != null)
        {
            flag = flag1 | I.onRelease();
        }
        if (flag)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    private void l()
    {
        if (F != null)
        {
            return;
        }
        F = new EdgeEffectCompat(getContext());
        if (l)
        {
            F.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            F.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    static boolean l(RecyclerView recyclerview)
    {
        return recyclerview.awakenScrollBars();
    }

    private void m()
    {
        if (H != null)
        {
            return;
        }
        H = new EdgeEffectCompat(getContext());
        if (l)
        {
            H.setSize(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            H.setSize(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    static void m(RecyclerView recyclerview)
    {
        if (!recyclerview.D)
        {
            recyclerview.D = true;
            int k1 = recyclerview.c.b();
            for (int i1 = 0; i1 < k1; i1++)
            {
                t t1 = b(recyclerview.c.c(i1));
                if (t1 != null && !t1.b())
                {
                    t1.b(512);
                }
            }

            recyclerview = recyclerview.a;
            k1 = ((m) (recyclerview)).b.size();
            for (int j1 = 0; j1 < k1; j1++)
            {
                t t2 = (t)((m) (recyclerview)).b.get(j1);
                if (t2 != null)
                {
                    t2.b(512);
                }
            }

        }
    }

    static AccessibilityManager n(RecyclerView recyclerview)
    {
        return recyclerview.B;
    }

    private void n()
    {
        if (G != null)
        {
            return;
        }
        G = new EdgeEffectCompat(getContext());
        if (l)
        {
            G.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            G.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    static RecyclerViewAccessibilityDelegate o(RecyclerView recyclerview)
    {
        return recyclerview.ac;
    }

    private void o()
    {
        if (I != null)
        {
            return;
        }
        I = new EdgeEffectCompat(getContext());
        if (l)
        {
            I.setSize(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            I.setSize(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    static n p(RecyclerView recyclerview)
    {
        return recyclerview.q;
    }

    private void p()
    {
        I = null;
        G = null;
        H = null;
        F = null;
    }

    private void q()
    {
        if (L != null)
        {
            L.clear();
        }
        stopNestedScroll();
        k();
        c(0);
    }

    static boolean q(RecyclerView recyclerview)
    {
        return recyclerview.l;
    }

    static s r(RecyclerView recyclerview)
    {
        return recyclerview.U;
    }

    private void r()
    {
        E = E + 1;
    }

    private void s()
    {
        E = E - 1;
        if (E <= 0)
        {
            E = 0;
            int i1 = y;
            y = 0;
            if (i1 != 0 && B != null && B.isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(2048);
                AccessibilityEventCompat.setContentChangeTypes(accessibilityevent, i1);
                sendAccessibilityEventUnchecked(accessibilityevent);
            }
        }
    }

    private boolean t()
    {
        return E > 0;
    }

    private boolean u()
    {
        return d != null && d.h();
    }

    private void v()
    {
        if (!ab && u)
        {
            ViewCompat.postOnAnimation(this, aj);
            ab = true;
        }
    }

    private void w()
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (D)
        {
            b.a();
            z();
            p.a();
        }
        q q1;
        if (d != null && p.d())
        {
            b.b();
        } else
        {
            b.e();
        }
        if (f && !g || f || g && u())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        q1 = e;
        if (v && d != null && (D || flag || i.a(p)) && (!D || o.b()))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        q.c(q1, flag1);
        q1 = e;
        if (!q.b(e) || !flag || D) goto _L2; else goto _L1
_L1:
        if (d != null && p.d())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L3
_L3:
        flag1 = flag2;
_L5:
        q.d(q1, flag1);
        return;
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    private void x()
    {
        boolean flag = false;
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((LayoutParams)c.c(i1).getLayoutParams()).c = true;
        }

        m m1 = a;
        k1 = m1.b.size();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            LayoutParams layoutparams = (LayoutParams)((t)m1.b.get(j1)).a.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.c = true;
            }
        }

    }

    private void y()
    {
        int j1 = c.b();
        for (int i1 = 0; i1 < j1; i1++)
        {
            t t1 = b(c.c(i1));
            if (!t1.b())
            {
                t1.a();
            }
        }

        a.e();
    }

    private void z()
    {
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            t t1 = b(c.c(i1));
            if (t1 != null && !t1.b())
            {
                t1.b(6);
            }
        }

        x();
        m m1 = a;
        if (m1.c.o != null && m1.c.o.b())
        {
            int l1 = m1.b.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                t t2 = (t)m1.b.get(j1);
                if (t2 != null)
                {
                    t2.b(6);
                }
            }

        } else
        {
            m1.c();
        }
    }

    public final a a()
    {
        return o;
    }

    public final t a(View view)
    {
        ViewParent viewparent = view.getParent();
        if (viewparent != null && viewparent != this)
        {
            throw new IllegalArgumentException((new StringBuilder("View ")).append(view).append(" is not a direct child of ").append(this).toString());
        } else
        {
            return b(view);
        }
    }

    public final void a(int i1)
    {
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            return;
        } else
        {
            p.a(this, i1);
            return;
        }
    }

    final void a(int i1, int j1)
    {
        if (i1 < 0)
        {
            l();
            F.onAbsorb(-i1);
        } else
        if (i1 > 0)
        {
            m();
            H.onAbsorb(i1);
        }
        if (j1 < 0)
        {
            n();
            G.onAbsorb(-j1);
        } else
        if (j1 > 0)
        {
            o();
            I.onAbsorb(j1);
        }
        if (i1 != 0 || j1 != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    final void a(int i1, int j1, boolean flag)
    {
        int l1 = c.b();
        int k1 = 0;
        while (k1 < l1) 
        {
            t t1 = b(c.c(k1));
            if (t1 != null && !t1.b())
            {
                if (t1.b >= i1 + j1)
                {
                    t1.a(-j1, flag);
                    q.a(e, true);
                } else
                if (t1.b >= i1)
                {
                    int i2 = -j1;
                    t1.b(8);
                    t1.a(i2, flag);
                    t1.b = i1 - 1;
                    q.a(e, true);
                }
            }
            k1++;
        }
        m m1 = a;
        k1 = m1.b.size() - 1;
        while (k1 >= 0) 
        {
            t t2 = (t)m1.b.get(k1);
            if (t2 != null)
            {
                if (t2.c() >= i1 + j1)
                {
                    t2.a(-j1, flag);
                } else
                if (t2.c() >= i1)
                {
                    t2.b(8);
                    m1.c(k1);
                }
            }
            k1--;
        }
        requestLayout();
    }

    public final void a(a a1)
    {
        if (o != null)
        {
            o.b(j);
        }
        if (d != null)
        {
            d.c();
        }
        if (p != null)
        {
            p.c(a);
            p.b(a);
        }
        a.a();
        b.a();
        a a2 = o;
        o = a1;
        if (a1 != null)
        {
            a1.a(j);
        }
        a1 = a;
        a a3 = o;
        a1.a();
        a1.d().a(a2, a3);
        q.a(e, true);
        z();
        requestLayout();
    }

    public final void a(g g1)
    {
        if (p != null)
        {
            p.a("Cannot add item decoration during a scroll  or layout");
        }
        if (r.isEmpty())
        {
            setWillNotDraw(false);
        }
        r.add(g1);
        x();
        requestLayout();
    }

    public final void a(i i1)
    {
        if (i1 == p)
        {
            return;
        }
        if (p != null)
        {
            if (u)
            {
                p.b(this, a);
            }
            p.a(null);
        }
        a.a();
        android.support.v7.widget.b b1 = c;
        b.a a1 = b1.b;
        do
        {
            a1.a = 0L;
            if (a1.b == null)
            {
                break;
            }
            a1 = a1.b;
        } while (true);
        b1.c.clear();
        b1.a.b();
        p = i1;
        if (i1 != null)
        {
            if (i1.r != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(i1).append(" is already attached to a RecyclerView: ").append(i1.r).toString());
            }
            p.a(this);
            if (u)
            {
                p.m();
            }
        }
        requestLayout();
    }

    public final void a(k k1)
    {
        if (W == null)
        {
            W = new ArrayList();
        }
        W.add(k1);
    }

    final void a(String s1)
    {
        if (t())
        {
            if (s1 == null)
            {
                throw new IllegalStateException("Cannot call this method while RecyclerView is computing a layout or scrolling");
            } else
            {
                throw new IllegalStateException(s1);
            }
        } else
        {
            return;
        }
    }

    final void a(boolean flag)
    {
        if (w)
        {
            if (flag && x && p != null && o != null)
            {
                d();
            }
            w = false;
            x = false;
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        super.addFocusables(arraylist, i1, j1);
    }

    public final i b()
    {
        return p;
    }

    final void b(int i1)
    {
        int j1 = getScrollX();
        int l1 = getScrollY();
        onScrollChanged(j1, l1, j1, l1);
        if (V != null)
        {
            V.a(i1);
        }
        if (W != null)
        {
            for (int k1 = W.size() - 1; k1 >= 0; k1--)
            {
                ((k)W.get(k1)).a(i1);
            }

        }
    }

    final void b(int i1, int j1)
    {
        int i2 = c.b();
        for (int k1 = 0; k1 < i2; k1++)
        {
            View view = c.c(k1);
            t t1 = b(view);
            if (t1 == null || t1.b() || t1.b < i1 || t1.b >= i1 + j1)
            {
                continue;
            }
            t1.b(2);
            if (u())
            {
                t1.b(64);
            }
            ((LayoutParams)view.getLayoutParams()).c = true;
        }

        m m1 = a;
        for (int l1 = m1.b.size() - 1; l1 >= 0; l1--)
        {
            t t2 = (t)m1.b.get(l1);
            if (t2 == null)
            {
                continue;
            }
            int j2 = t2.c();
            if (j2 >= i1 && j2 < i1 + j1)
            {
                t2.b(2);
                m1.c(l1);
            }
        }

    }

    public int c(View view)
    {
        Object obj;
        view = b(view);
        if (view == null || ((t) (view)).i == null)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        obj = ((t) (view)).i;
        if (!view.a(524) && view.l()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        int j1;
        int l1;
        int i2;
        obj = ((RecyclerView) (obj)).b;
        j1 = ((t) (view)).b;
        i2 = ((android.support.v7.widget.a) (obj)).a.size();
        l1 = 0;
_L10:
        i1 = j1;
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        view = (a.b)((android.support.v7.widget.a) (obj)).a.get(l1);
        i1 = j1;
        ((a.b) (view)).a;
        JVM INSTR tableswitch 0 3: default 124
    //                   0 139
    //                   1 162
    //                   2 127
    //                   3 199;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_199;
_L8:
        break; /* Loop/switch isn't completed */
_L5:
        i1 = j1;
_L11:
        l1++;
        j1 = i1;
          goto _L10
_L6:
        i1 = j1;
        if (((a.b) (view)).b <= j1)
        {
            i1 = j1 + ((a.b) (view)).c;
        }
          goto _L11
_L7:
        i1 = j1;
        if (((a.b) (view)).b <= j1)
        {
            if (((a.b) (view)).b + ((a.b) (view)).c > j1)
            {
                break MISSING_BLOCK_LABEL_255;
            }
            i1 = j1 - ((a.b) (view)).c;
        }
          goto _L11
        if (((a.b) (view)).b == j1)
        {
            i1 = ((a.b) (view)).c;
        } else
        {
            int k1 = j1;
            if (((a.b) (view)).b < j1)
            {
                k1 = j1 - 1;
            }
            i1 = k1;
            if (((a.b) (view)).c <= k1)
            {
                i1 = k1 + 1;
            }
        }
          goto _L11
        return -1;
    }

    final void c()
    {
        if (!w)
        {
            w = true;
            x = false;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && p.a((LayoutParams)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (p.f())
        {
            return p.c(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (p.f())
        {
            return p.a(e);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (p.f())
        {
            return p.e(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (p.g())
        {
            return p.d(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (p.g())
        {
            return p.b(e);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (p.g())
        {
            return p.f(e);
        } else
        {
            return 0;
        }
    }

    final void d()
    {
        if (o != null) goto _L2; else goto _L1
_L1:
        Log.e("RecyclerView", "No adapter attached; skipping layout");
_L19:
        return;
_L2:
        Object obj;
        int j3;
        if (p == null)
        {
            Log.e("RecyclerView", "No layout manager attached; skipping layout");
            return;
        }
        e.d.clear();
        c();
        r();
        w();
        Object obj2 = e;
        int i1;
        int k1;
        if (q.b(e) && g && u())
        {
            obj = new ArrayMap();
        } else
        {
            obj = null;
        }
        obj2.c = ((ArrayMap) (obj));
        g = false;
        f = false;
        q.b(e, q.a(e));
        e.e = o.a();
        obj = ae;
        j3 = c.a();
        if (j3 != 0) goto _L4; else goto _L3
_L3:
        obj[0] = 0;
        obj[1] = 0;
_L8:
        if (q.b(e))
        {
            e.a.clear();
            e.b.clear();
            k1 = c.a();
            for (i1 = 0; i1 < k1; i1++)
            {
                obj = b(c.b(i1));
                if (!((t) (obj)).b() && (!((t) (obj)).i() || o.b()))
                {
                    obj2 = ((t) (obj)).a;
                    e.a.put(obj, new h(((t) (obj)), ((View) (obj2)).getLeft(), ((View) (obj2)).getTop(), ((View) (obj2)).getRight(), ((View) (obj2)).getBottom()));
                }
            }

        }
          goto _L5
_L4:
        int j1;
        int i2;
        int k2;
        j1 = 0x7fffffff;
        i2 = 0x80000000;
        k2 = 0;
_L7:
        int l1;
        int j2;
        if (k2 >= j3)
        {
            break; /* Loop/switch isn't completed */
        }
        t t1 = b(c.b(k2));
        j2 = j1;
        if (t1.b())
        {
            break MISSING_BLOCK_LABEL_2039;
        }
        int i3 = t1.c();
        l1 = j1;
        if (i3 < j1)
        {
            l1 = i3;
        }
        j2 = l1;
        if (i3 <= i2)
        {
            break MISSING_BLOCK_LABEL_2039;
        }
        j1 = i3;
_L22:
        k2++;
        i2 = j1;
        j1 = l1;
        if (true) goto _L7; else goto _L6
_L6:
        obj[0] = j1;
        obj[1] = i2;
          goto _L8
_L5:
        if (!q.a(e)) goto _L10; else goto _L9
_L9:
        Object obj3;
        l1 = c.b();
        for (j1 = 0; j1 < l1; j1++)
        {
            obj = b(c.c(j1));
            if (!((t) (obj)).b() && ((t) (obj)).c == -1)
            {
                obj.c = ((t) (obj)).b;
            }
        }

        if (e.c != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj = b(c.b(j1));
                if (((t) (obj)).k() && !((t) (obj)).m() && !((t) (obj)).b())
                {
                    long l3 = b(((t) (obj)));
                    e.c.put(Long.valueOf(l3), obj);
                    e.a.remove(obj);
                }
            }

        }
        boolean flag = q.c(e);
        q.a(e, false);
        p.c(a, e);
        q.a(e, flag);
        obj3 = new ArrayMap();
        j1 = 0;
_L17:
        if (j1 >= c.a()) goto _L12; else goto _L11
_L11:
        obj = c.b(j1);
        if (b(((View) (obj))).b()) goto _L14; else goto _L13
_L13:
        l1 = 0;
_L18:
        if (l1 >= e.a.size())
        {
            break MISSING_BLOCK_LABEL_2033;
        }
        if (((t)e.a.keyAt(l1)).a != obj) goto _L16; else goto _L15
_L15:
        l1 = 1;
_L21:
        if (l1 == 0)
        {
            ((ArrayMap) (obj3)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
        }
_L14:
        j1++;
          goto _L17
_L16:
        l1++;
          goto _L18
_L12:
        y();
        b.c();
_L20:
        e.e = o.a();
        q.d(e);
        q.b(e, false);
        p.c(a, e);
        q.a(e, false);
        k = null;
        q q1 = e;
        boolean flag1;
        if (q.b(e) && d != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        q.c(q1, flag1);
        if (q.b(e))
        {
            Object obj1;
            if (e.c != null)
            {
                obj1 = new ArrayMap();
            } else
            {
                obj1 = null;
            }
            l1 = c.a();
            j1 = 0;
            while (j1 < l1) 
            {
                t t2 = b(c.b(j1));
                if (!t2.b())
                {
                    View view = t2.a;
                    long l4 = b(t2);
                    if (obj1 != null && e.c.get(Long.valueOf(l4)) != null)
                    {
                        ((ArrayMap) (obj1)).put(Long.valueOf(l4), t2);
                    } else
                    {
                        e.b.put(t2, new h(t2, view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
                    }
                }
                j1++;
            }
            a(((ArrayMap) (obj3)));
            for (j1 = e.a.size() - 1; j1 >= 0; j1--)
            {
                t t3 = (t)e.a.keyAt(j1);
                if (!e.b.containsKey(t3))
                {
                    h h1 = (h)e.a.valueAt(j1);
                    e.a.removeAt(j1);
                    a.b(h1.a);
                    a(h1);
                }
            }

            j1 = e.b.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    t t5 = (t)e.b.keyAt(j1);
                    h h4 = (h)e.b.valueAt(j1);
                    if (e.a.isEmpty() || !e.a.containsKey(t5))
                    {
                        e.b.removeAt(j1);
                        Rect rect;
                        if (obj3 != null)
                        {
                            rect = (Rect)((ArrayMap) (obj3)).get(t5.a);
                        } else
                        {
                            rect = null;
                        }
                        l1 = h4.b;
                        i2 = h4.c;
                        if (rect != null && (rect.left != l1 || rect.top != i2))
                        {
                            t5.a(false);
                            if (d.a(t5, rect.left, rect.top, l1, i2))
                            {
                                v();
                            }
                        } else
                        {
                            t5.a(false);
                            d.b(t5);
                            v();
                        }
                    }
                    j1--;
                }
            }
            l1 = e.b.size();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj3 = (t)e.b.keyAt(j1);
                h h2 = (h)e.b.valueAt(j1);
                h h3 = (h)e.a.get(obj3);
                if (h3 == null || h2 == null || h3.b == h2.b && h3.c == h2.c)
                {
                    continue;
                }
                ((t) (obj3)).a(false);
                if (d.a(((t) (obj3)), h3.b, h3.c, h2.b, h2.c))
                {
                    v();
                }
            }

            if (e.c != null)
            {
                j1 = e.c.size();
            } else
            {
                j1 = 0;
            }
            j1--;
            while (j1 >= 0) 
            {
                long l5 = ((Long)e.c.keyAt(j1)).longValue();
                obj3 = (t)e.c.get(Long.valueOf(l5));
                if (!((t) (obj3)).b() && m.a(a) != null && m.a(a).contains(obj3))
                {
                    t t4 = (t)((ArrayMap) (obj1)).get(Long.valueOf(l5));
                    ((t) (obj3)).a(false);
                    a(((t) (obj3)));
                    obj3.g = t4;
                    a.b(((t) (obj3)));
                    j2 = ((t) (obj3)).a.getLeft();
                    int l2 = ((t) (obj3)).a.getTop();
                    if (t4 == null || t4.b())
                    {
                        i2 = l2;
                        l1 = j2;
                    } else
                    {
                        l1 = t4.a.getLeft();
                        i2 = t4.a.getTop();
                        t4.a(false);
                        t4.h = ((t) (obj3));
                    }
                    d.a(((t) (obj3)), t4, j2, l2, l1, i2);
                    v();
                }
                j1--;
            }
        }
        a(false);
        p.b(a);
        q.b(e, e.e);
        D = false;
        q.c(e, false);
        q.d(e, false);
        s();
        i.b(p);
        if (m.a(a) != null)
        {
            m.a(a).clear();
        }
        e.c = null;
        if (e(ae[0], ae[1]))
        {
            b(0);
            return;
        }
          goto _L19
_L10:
        y();
        b.e();
        if (e.c != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj1 = b(c.b(j1));
                if (((t) (obj1)).k() && !((t) (obj1)).m() && !((t) (obj1)).b())
                {
                    l4 = b(((t) (obj1)));
                    e.c.put(Long.valueOf(l4), obj1);
                    e.a.remove(obj1);
                }
            }

        }
        obj3 = null;
          goto _L20
        l1 = 0;
          goto _L21
        j1 = i2;
        l1 = j2;
          goto _L22
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return af.dispatchNestedFling(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return af.dispatchNestedPreFling(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
    {
        return af.dispatchNestedPreScroll(i1, j1, ai1, ai2);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
    {
        return af.dispatchNestedScroll(i1, j1, k1, l1, ai1);
    }

    protected void dispatchRestoreInstanceState(SparseArray sparsearray)
    {
        dispatchThawSelfOnly(sparsearray);
    }

    protected void dispatchSaveInstanceState(SparseArray sparsearray)
    {
        dispatchFreezeSelfOnly(sparsearray);
    }

    public void draw(Canvas canvas)
    {
        boolean flag = true;
        boolean flag1 = false;
        super.draw(canvas);
        int k1 = r.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            r.get(i1);
        }

        int j1;
        if (F != null && !F.isFinished())
        {
            int l1 = canvas.save();
            int i2;
            if (l)
            {
                j1 = getPaddingBottom();
            } else
            {
                j1 = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j1 + -getHeight(), 0.0F);
            if (F != null && F.draw(canvas))
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            canvas.restoreToCount(l1);
        } else
        {
            k1 = 0;
        }
        j1 = k1;
        if (G != null)
        {
            j1 = k1;
            if (!G.isFinished())
            {
                l1 = canvas.save();
                if (l)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (G != null && G.draw(canvas))
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        k1 = j1;
        if (H != null)
        {
            k1 = j1;
            if (!H.isFinished())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (l)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (H != null && H.draw(canvas))
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                k1 = j1 | k1;
                canvas.restoreToCount(l1);
            }
        }
        j1 = k1;
        if (I != null)
        {
            j1 = k1;
            if (!I.isFinished())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (l)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j1 = ((flag1) ? 1 : 0);
                if (I != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (I.draw(canvas))
                    {
                        j1 = 1;
                    }
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        if (j1 == 0 && d != null && r.size() > 0 && d.b())
        {
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            ViewCompat.postInvalidateOnAnimation(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    final Rect e(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.c)
        {
            return layoutparams.b;
        }
        Rect rect = layoutparams.b;
        rect.set(0, 0, 0, 0);
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            n.set(0, 0, 0, 0);
            ((g)r.get(i1)).a(n, view);
            rect.left = rect.left + n.left;
            rect.top = rect.top + n.top;
            rect.right = rect.right + n.right;
            rect.bottom = rect.bottom + n.bottom;
        }

        layoutparams.c = false;
        return rect;
    }

    final void e()
    {
        int i1;
        int j1;
        j1 = c.a();
        i1 = 0;
_L2:
        t t1;
        if (i1 >= j1)
        {
            break MISSING_BLOCK_LABEL_132;
        }
        t1 = b(c.b(i1));
        if (t1 != null && !t1.b())
        {
            if (!t1.m() && !t1.i())
            {
                break; /* Loop/switch isn't completed */
            }
            requestLayout();
        }
_L4:
        i1++;
        if (true) goto _L2; else goto _L1
_L1:
        if (!t1.j()) goto _L4; else goto _L3
_L3:
label0:
        {
            int k1 = o.a(t1.b);
            if (t1.e != k1)
            {
                break label0;
            }
            if (!t1.k() || !u())
            {
                o.b(t1, t1.b);
            } else
            {
                requestLayout();
            }
        }
          goto _L4
        requestLayout();
    }

    public final boolean f()
    {
        return !v || D || b.d();
    }

    public View focusSearch(View view, int i1)
    {
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (o != null)
            {
                view1 = view2;
                if (p != null)
                {
                    view1 = view2;
                    if (!t())
                    {
                        c();
                        view1 = p.c(i1, a, e);
                        a(false);
                    }
                }
            }
        }
        if (view1 != null)
        {
            return view1;
        } else
        {
            return super.focusSearch(view, i1);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.b();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.a(getContext(), attributeset);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (p == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return p.a(layoutparams);
        }
    }

    public int getBaseline()
    {
        if (p != null)
        {
            return -1;
        } else
        {
            return super.getBaseline();
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (ad == null)
        {
            return super.getChildDrawingOrder(i1, j1);
        } else
        {
            return ad.a();
        }
    }

    public boolean hasNestedScrollingParent()
    {
        return af.hasNestedScrollingParent();
    }

    public boolean isAttachedToWindow()
    {
        return u;
    }

    public boolean isNestedScrollingEnabled()
    {
        return af.isNestedScrollingEnabled();
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        E = 0;
        u = true;
        v = false;
        if (p != null)
        {
            p.m();
        }
        ab = false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (d != null)
        {
            d.c();
        }
        v = false;
        c(0);
        j();
        u = false;
        if (p != null)
        {
            p.b(this, a);
        }
        removeCallbacks(aj);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = r.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            r.get(i1);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
        if (p != null && (MotionEventCompat.getSource(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (p.g())
            {
                f1 = -MotionEventCompat.getAxisValue(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (p.f())
            {
                f2 = MotionEventCompat.getAxisValue(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
label0:
                {
                    if (T == 1.401298E-45F)
                    {
                        TypedValue typedvalue = new TypedValue();
                        if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                        {
                            break label0;
                        }
                        T = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    f3 = T;
                }
                a((int)(f2 * f3), (int)(f1 * f3), motionevent);
                return false;
            }
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionevent)
    {
        int i1;
        int k1;
        byte byte0;
        int i2;
        byte0 = -1;
        k1 = motionevent.getAction();
        if (k1 == 3 || k1 == 0)
        {
            t = null;
        }
        i2 = s.size();
        i1 = 0;
_L7:
        if (i1 >= i2) goto _L2; else goto _L1
_L1:
        j j1 = (j)s.get(i1);
        if (!j1.a() || k1 == 3) goto _L4; else goto _L3
_L3:
        t = j1;
        i1 = 1;
_L8:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        q();
_L16:
        return true;
_L4:
        i1++;
          goto _L7
_L2:
        i1 = 0;
          goto _L8
_L6:
        boolean flag;
        boolean flag1;
        if (p == null)
        {
            return false;
        }
        flag = p.f();
        flag1 = p.g();
        if (L == null)
        {
            L = VelocityTracker.obtain();
        }
        L.addMovement(motionevent);
        k1 = MotionEventCompat.getActionMasked(motionevent);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        k1;
        JVM INSTR tableswitch 0 6: default 204
    //                   0 214
    //                   1 607
    //                   2 373
    //                   3 621
    //                   4 204
    //                   5 316
    //                   6 599;
           goto _L9 _L10 _L11 _L12 _L13 _L9 _L14 _L15
_L9:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_621;
_L17:
        if (J != 1)
        {
            return false;
        }
          goto _L16
_L10:
        K = MotionEventCompat.getPointerId(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        O = i1;
        M = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        P = i1;
        N = i1;
        if (J == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            c(1);
        }
        int l1;
        int j2;
        int k2;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        l1 = i1;
        if (flag1)
        {
            l1 = i1 | 2;
        }
        startNestedScroll(l1);
          goto _L17
_L14:
        K = MotionEventCompat.getPointerId(motionevent, i1);
        l1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        O = l1;
        M = l1;
        i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        P = i1;
        N = i1;
          goto _L17
_L12:
        l1 = MotionEventCompat.findPointerIndex(motionevent, K);
        if (l1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(K).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        i1 = (int)(MotionEventCompat.getX(motionevent, l1) + 0.5F);
        l1 = (int)(MotionEventCompat.getY(motionevent, l1) + 0.5F);
        if (J != 1)
        {
            i1 -= M;
            j2 = l1 - N;
            if (flag && Math.abs(i1) > Q)
            {
                l1 = M;
                k2 = Q;
                if (i1 < 0)
                {
                    i1 = -1;
                } else
                {
                    i1 = 1;
                }
                O = i1 * k2 + l1;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            l1 = i1;
            if (flag1)
            {
                l1 = i1;
                if (Math.abs(j2) > Q)
                {
                    l1 = N;
                    k2 = Q;
                    if (j2 < 0)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 1;
                    }
                    P = l1 + i1 * k2;
                    l1 = 1;
                }
            }
            if (l1 != 0)
            {
                c(1);
            }
        }
          goto _L17
_L15:
        a(motionevent);
          goto _L17
_L11:
        L.clear();
        stopNestedScroll();
          goto _L17
        q();
          goto _L17
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        c();
        TraceCompat.beginSection("RV OnLayout");
        d();
        TraceCompat.endSection();
        a(false);
        v = true;
    }

    protected void onMeasure(int i1, int j1)
    {
        if (z)
        {
            c();
            w();
            if (q.a(e))
            {
                q.b(e, true);
            } else
            {
                b.e();
                q.b(e, false);
            }
            z = false;
            a(false);
        }
        if (o != null)
        {
            e.e = o.a();
        } else
        {
            e.e = 0;
        }
        if (p == null)
        {
            d(i1, j1);
        } else
        {
            p.r.d(i1, j1);
        }
        q.b(e, false);
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        k = (SavedState)parcelable;
        super.onRestoreInstanceState(k.getSuperState());
        if (p != null && k.a != null)
        {
            p.a(k.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (k != null)
        {
            SavedState.a(savedstate, k);
            return savedstate;
        }
        if (p != null)
        {
            savedstate.a = p.e();
            return savedstate;
        } else
        {
            savedstate.a = null;
            return savedstate;
        }
    }

    protected void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            p();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        if (t == null) goto _L2; else goto _L1
_L1:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        t = null;
_L2:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = s.size();
        i1 = 0;
_L30:
        if (i1 >= j1) goto _L6; else goto _L7
_L7:
        Object obj = (j)s.get(i1);
        if (!((j) (obj)).a()) goto _L9; else goto _L8
_L8:
        t = ((j) (obj));
        i1 = 1;
_L11:
        if (i1 != 0)
        {
            q();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i1 == 3 || i1 == 1)
        {
            t = null;
        }
        i1 = 1;
        continue; /* Loop/switch isn't completed */
_L9:
        i1++;
        continue; /* Loop/switch isn't completed */
_L6:
        i1 = 0;
        if (true) goto _L11; else goto _L10
_L10:
        boolean flag;
        boolean flag1;
        if (p == null)
        {
            return false;
        }
        flag = p.f();
        flag1 = p.g();
        if (L == null)
        {
            L = VelocityTracker.obtain();
        }
        L.addMovement(motionevent);
        obj = MotionEvent.obtain(motionevent);
        j1 = MotionEventCompat.getActionMasked(motionevent);
        i1 = MotionEventCompat.getActionIndex(motionevent);
        if (j1 == 0)
        {
            int ai1[] = ai;
            ai[1] = 0;
            ai1[0] = 0;
        }
        ((MotionEvent) (obj)).offsetLocation(ai[0], ai[1]);
        j1;
        JVM INSTR tableswitch 0 6: default 284
    //                   0 291
    //                   1 880
    //                   2 442
    //                   3 1178
    //                   4 284
    //                   5 379
    //                   6 872;
           goto _L12 _L13 _L14 _L15 _L16 _L12 _L17 _L18
_L12:
        ((MotionEvent) (obj)).recycle();
        return true;
_L13:
        K = MotionEventCompat.getPointerId(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        O = i1;
        M = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        P = i1;
        N = i1;
        float f1;
        float f2;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        if (flag)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        k1 = i1;
        if (flag1)
        {
            k1 = i1 | 2;
        }
        startNestedScroll(k1);
        continue; /* Loop/switch isn't completed */
_L17:
        K = MotionEventCompat.getPointerId(motionevent, i1);
        k1 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        O = k1;
        M = k1;
        i1 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        P = i1;
        N = i1;
        continue; /* Loop/switch isn't completed */
_L15:
        i1 = MotionEventCompat.findPointerIndex(motionevent, K);
        if (i1 < 0)
        {
            Log.e("RecyclerView", (new StringBuilder("Error processing scroll; pointer index for id ")).append(K).append(" not found. Did any MotionEvents get skipped?").toString());
            return false;
        }
        l2 = (int)(MotionEventCompat.getX(motionevent, i1) + 0.5F);
        i3 = (int)(MotionEventCompat.getY(motionevent, i1) + 0.5F);
        i2 = O - l2;
        l1 = P - i3;
        i1 = l1;
        k1 = i2;
        if (dispatchNestedPreScroll(i2, l1, ah, ag))
        {
            k1 = i2 - ah[0];
            i1 = l1 - ah[1];
            ((MotionEvent) (obj)).offsetLocation(ag[0], ag[1]);
            motionevent = ai;
            motionevent[0] = motionevent[0] + ag[0];
            motionevent = ai;
            motionevent[1] = motionevent[1] + ag[1];
        }
        l1 = i1;
        j2 = k1;
        if (J != 1)
        {
            if (flag && Math.abs(k1) > Q)
            {
                if (k1 > 0)
                {
                    k1 -= Q;
                } else
                {
                    k1 += Q;
                }
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            i2 = i1;
            k2 = l1;
            if (flag1)
            {
                i2 = i1;
                k2 = l1;
                if (Math.abs(i1) > Q)
                {
                    if (i1 > 0)
                    {
                        i2 = i1 - Q;
                    } else
                    {
                        i2 = i1 + Q;
                    }
                    k2 = 1;
                }
            }
            l1 = i2;
            j2 = k1;
            if (k2 != 0)
            {
                c(1);
                j2 = k1;
                l1 = i2;
            }
        }
        if (J == 1)
        {
            O = l2 - ag[0];
            P = i3 - ag[1];
            if (!flag)
            {
                j2 = 0;
            }
            if (!flag1)
            {
                l1 = 0;
            }
            if (a(j2, l1, ((MotionEvent) (obj))))
            {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
        }
        continue; /* Loop/switch isn't completed */
_L18:
        a(motionevent);
        continue; /* Loop/switch isn't completed */
_L14:
        L.computeCurrentVelocity(1000, S);
        if (flag)
        {
            f1 = -VelocityTrackerCompat.getXVelocity(L, K);
        } else
        {
            f1 = 0.0F;
        }
        if (flag1)
        {
            f2 = -VelocityTrackerCompat.getYVelocity(L, K);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F) goto _L20; else goto _L19
_L19:
        i1 = (int)f1;
        k1 = (int)f2;
        if (p != null) goto _L22; else goto _L21
_L21:
        Log.e("RecyclerView", "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument.");
_L25:
        i1 = 0;
_L27:
        if (i1 != 0) goto _L23; else goto _L20
_L20:
        c(0);
_L23:
        L.clear();
        k();
        continue; /* Loop/switch isn't completed */
_L22:
        flag = p.f();
        flag1 = p.g();
        if (!flag || Math.abs(i1) < R)
        {
            i1 = 0;
        }
        if (!flag1 || Math.abs(k1) < R)
        {
            k1 = 0;
        }
        if (i1 == 0 && k1 == 0 || dispatchNestedPreFling(i1, k1)) goto _L25; else goto _L24
_L24:
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dispatchNestedFling(i1, k1, flag);
        if (!flag) goto _L25; else goto _L26
_L26:
        i1 = Math.max(-S, Math.min(i1, S));
        k1 = Math.max(-S, Math.min(k1, S));
        U.a(i1, k1);
        i1 = 1;
          goto _L27
_L16:
        q();
        if (true) goto _L12; else goto _L28
_L28:
        if (true) goto _L30; else goto _L29
_L29:
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        t t1 = b(view);
        if (t1 != null)
        {
            if (t1.n())
            {
                t1.h();
            } else
            if (!t1.b())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(t1).toString());
            }
        }
        f(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        int i1;
        if (p.o() || t())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0 && view1 != null)
        {
            n.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof LayoutParams)
            {
                obj = (LayoutParams)obj;
                if (!((LayoutParams) (obj)).c)
                {
                    obj = ((LayoutParams) (obj)).b;
                    Rect rect = n;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = n;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = n;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = n;
                    i1 = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + i1;
                }
            }
            offsetDescendantRectToMyCoords(view1, n);
            offsetRectIntoDescendantCoords(view, n);
            obj = n;
            boolean flag;
            if (!v)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            requestChildRectangleOnScreen(view, ((Rect) (obj)), flag);
        }
        super.requestChildFocus(view, view1);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean flag)
    {
        i i1 = p;
        int l2 = i1.s();
        int i2 = i1.t();
        int i3 = i1.q() - i1.u();
        int k2 = i1.r();
        int l3 = i1.v();
        int j3 = view.getLeft() + rect.left;
        int j2 = view.getTop() + rect.top;
        int k3 = j3 + rect.width();
        int i4 = rect.height();
        int j1 = Math.min(0, j3 - l2);
        int k1 = Math.min(0, j2 - i2);
        int l1 = Math.max(0, k3 - i3);
        k2 = Math.max(0, (j2 + i4) - (k2 - l3));
        if (ViewCompat.getLayoutDirection(i1.r) == 1)
        {
            if (l1 != 0)
            {
                j1 = l1;
            } else
            {
                j1 = Math.max(j1, k3 - i3);
            }
        } else
        if (j1 == 0)
        {
            j1 = Math.min(j3 - l2, l1);
        }
        if (k1 == 0)
        {
            k1 = Math.min(j2 - i2, k2);
        }
        if (j1 != 0 || k1 != 0)
        {
            if (flag)
            {
                scrollBy(j1, k1);
            } else
            if (p == null)
            {
                Log.e("RecyclerView", "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else
            {
                if (!p.f())
                {
                    j1 = 0;
                }
                if (!p.g())
                {
                    k1 = 0;
                }
                if (j1 != 0 || k1 != 0)
                {
                    U.b(j1, k1);
                }
            }
            return true;
        } else
        {
            return false;
        }
    }

    public void requestDisallowInterceptTouchEvent(boolean flag)
    {
        int j1 = s.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            s.get(i1);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!w)
        {
            super.requestLayout();
            return;
        } else
        {
            x = true;
            return;
        }
    }

    public void scrollBy(int i1, int j1)
    {
        if (p == null)
        {
            Log.e("RecyclerView", "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else
        {
            boolean flag = p.f();
            boolean flag1 = p.g();
            if (flag || flag1)
            {
                if (!flag)
                {
                    i1 = 0;
                }
                if (!flag1)
                {
                    j1 = 0;
                }
                a(i1, j1, ((MotionEvent) (null)));
                return;
            }
        }
    }

    public void scrollTo(int i1, int j1)
    {
        throw new UnsupportedOperationException("RecyclerView does not support scrolling to an absolute position.");
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityevent)
    {
        int i1 = 0;
        boolean flag = false;
        if (t())
        {
            if (accessibilityevent != null)
            {
                i1 = AccessibilityEventCompat.getContentChangeTypes(accessibilityevent);
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            y = i1 | y;
            i1 = 1;
        }
        if (i1 != 0)
        {
            return;
        } else
        {
            super.sendAccessibilityEventUnchecked(accessibilityevent);
            return;
        }
    }

    public void setClipToPadding(boolean flag)
    {
        if (flag != l)
        {
            p();
        }
        l = flag;
        super.setClipToPadding(flag);
        if (v)
        {
            requestLayout();
        }
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        af.setNestedScrollingEnabled(flag);
    }

    public boolean startNestedScroll(int i1)
    {
        return af.startNestedScroll(i1);
    }

    public void stopNestedScroll()
    {
        af.stopNestedScroll();
    }

    static 
    {
        boolean flag;
        if (android.os.Build.VERSION.SDK_INT == 18 || android.os.Build.VERSION.SDK_INT == 19 || android.os.Build.VERSION.SDK_INT == 20)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        i = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }
}
