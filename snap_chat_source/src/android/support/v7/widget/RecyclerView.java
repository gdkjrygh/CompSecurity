// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aP;
import aQ;
import aR;
import aW;
import aX;
import aY;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
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
import au;
import av;
import bA;
import bD;
import bE;
import bF;
import bJ;
import bb;
import bj;
import bk;
import bo;
import bx;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RecyclerView extends ViewGroup
    implements aQ, aW
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public v c;
        final Rect d;
        boolean e;
        boolean f;

        public LayoutParams()
        {
            super(-2, -2);
            d = new Rect();
            e = true;
            f = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            d = new Rect();
            e = true;
            f = false;
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            d = new Rect();
            e = true;
            f = false;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            d = new Rect();
            e = true;
            f = false;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            d = new Rect();
            e = true;
            f = false;
        }
    }

    static class SavedState extends android.view.View.BaseSavedState
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public final Object createFromParcel(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public final volatile Object[] newArray(int i1)
            {
                return new SavedState[i1];
            }

        };
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

        public final b a = new b();
        boolean b;

        public final void S_()
        {
            if (a.a())
            {
                throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
            } else
            {
                b = true;
                return;
            }
        }

        public int a(int i1)
        {
            return 0;
        }

        public abstract v a(ViewGroup viewgroup, int i1);

        public final void a(int i1, int j1)
        {
            a.d(i1, j1);
        }

        public final void a(c c1)
        {
            a.registerObserver(c1);
        }

        public void a(v v1)
        {
        }

        public abstract void a(v v1, int i1);

        public void a(RecyclerView recyclerview)
        {
        }

        public abstract int b();

        public long b(int i1)
        {
            return -1L;
        }

        public final void b(c c1)
        {
            a.unregisterObserver(c1);
        }

        public void b(v v1)
        {
        }

        public final void b(v v1, int i1)
        {
            v1.b = i1;
            if (b)
            {
                v1.d = b(i1);
            }
            v1.a(1, 519);
            au.a("RV OnBindView");
            a(v1, i1);
            au.a();
        }

        public final void c(int i1)
        {
            a.a(i1, 1);
        }

        public final void d(int i1)
        {
            a.b(i1, 1);
        }

        public final void e(int i1)
        {
            a.c(i1, 1);
        }

        public a()
        {
            b = false;
        }
    }

    public static final class b extends Observable
    {

        public final void a(int i1, int j1)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).a(i1, j1);
            }

        }

        public final boolean a()
        {
            return !mObservers.isEmpty();
        }

        public final void b()
        {
            for (int i1 = mObservers.size() - 1; i1 >= 0; i1--)
            {
                ((c)mObservers.get(i1)).a();
            }

        }

        public final void b(int i1, int j1)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).b(i1, j1);
            }

        }

        public final void c(int i1, int j1)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).c(i1, j1);
            }

        }

        public final void d(int i1, int j1)
        {
            for (int k1 = mObservers.size() - 1; k1 >= 0; k1--)
            {
                ((c)mObservers.get(k1)).d(i1, j1);
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

        public void a(int i1, int j1)
        {
        }

        public void b(int i1, int j1)
        {
        }

        public void c(int i1, int j1)
        {
        }

        public void d(int i1, int j1)
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

        private ArrayList a;
        b h;
        public long i;
        public long j;
        public long k;
        public long l;
        public boolean m;

        public abstract void T_();

        public final boolean a(a a1)
        {
            boolean flag;
label0:
            {
                flag = b();
                if (a1 != null)
                {
                    if (flag)
                    {
                        break label0;
                    }
                    a1.a();
                }
                return flag;
            }
            a.add(a1);
            return flag;
        }

        public abstract boolean a(v v1);

        public abstract boolean a(v v1, int i1, int j1, int k1, int l1);

        public abstract boolean a(v v1, v v2, int i1, int j1, int k1, int l1);

        public abstract boolean b();

        public abstract boolean b(v v1);

        public abstract void c(v v1);

        public abstract void d();

        public final void d(v v1)
        {
            if (h != null)
            {
                h.a(v1);
            }
        }

        public final void e()
        {
            int j1 = a.size();
            for (int i1 = 0; i1 < j1; i1++)
            {
                ((a)a.get(i1)).a();
            }

            a.clear();
        }

        public final void e(v v1)
        {
            g();
            if (h != null)
            {
                h.c(v1);
            }
        }

        public void f()
        {
        }

        public final void f(v v1)
        {
            f();
            if (h != null)
            {
                h.b(v1);
            }
        }

        public void g()
        {
        }

        public final void g(v v1)
        {
            if (h != null)
            {
                h.d(v1);
            }
        }

        public void h(v v1)
        {
        }

        public void i(v v1)
        {
        }

        public e()
        {
            h = null;
            a = new ArrayList();
            i = 120L;
            j = 120L;
            k = 250L;
            l = 250L;
            m = true;
        }
    }

    public static interface e.a
    {

        public abstract void a();
    }

    static interface e.b
    {

        public abstract void a(v v1);

        public abstract void b(v v1);

        public abstract void c(v v1);

        public abstract void d(v v1);
    }

    final class f
        implements e.b
    {

        private RecyclerView a;

        public final void a(v v1)
        {
            v1.a(true);
            if (!RecyclerView.c(a, v1.a) && v1.p())
            {
                a.removeDetachedView(v1.a, false);
            }
        }

        public final void b(v v1)
        {
            v1.a(true);
            if (!v.a(v1))
            {
                RecyclerView.c(a, v1.a);
            }
        }

        public final void c(v v1)
        {
            v1.a(true);
            if (!v.a(v1))
            {
                RecyclerView.c(a, v1.a);
            }
        }

        public final void d(v v1)
        {
            v1.a(true);
            if (v1.g != null && v1.h == null)
            {
                v1.g = null;
                v1.a(-65, v1.i);
            }
            v1.h = null;
            if (!v.a(v1))
            {
                RecyclerView.c(a, v1.a);
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

        public void a(Canvas canvas, RecyclerView recyclerview, s s1)
        {
        }

        public void a(Rect rect, View view, RecyclerView recyclerview, s s1)
        {
            view.getLayoutParams();
            rect.set(0, 0, 0, 0);
        }

        public g()
        {
        }
    }

    static final class h
    {

        v a;
        int b;
        int c;

        h(v v1, int i1, int j1)
        {
            a = v1;
            b = i1;
            c = j1;
        }
    }

    public static abstract class i
    {

        bE g;
        public RecyclerView h;
        r i;

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

        public static int a(View view)
        {
            return ((LayoutParams)view.getLayoutParams()).c.d();
        }

        static void a(i i1, r r1)
        {
            if (i1.i == r1)
            {
                i1.i = null;
            }
        }

        public static int b(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).d;
            int i1 = view.getMeasuredWidth();
            int j1 = rect.left;
            return rect.right + (i1 + j1);
        }

        public static int c(View view)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).d;
            int i1 = view.getMeasuredHeight();
            int j1 = rect.top;
            return rect.bottom + (i1 + j1);
        }

        public static int d(View view)
        {
            return view.getLeft() - ((LayoutParams)view.getLayoutParams()).d.left;
        }

        public static int e(View view)
        {
            return view.getTop() - ((LayoutParams)view.getLayoutParams()).d.top;
        }

        public static int f(View view)
        {
            int i1 = view.getRight();
            return ((LayoutParams)view.getLayoutParams()).d.right + i1;
        }

        public static int g(View view)
        {
            int i1 = view.getBottom();
            return ((LayoutParams)view.getLayoutParams()).d.bottom + i1;
        }

        final void A()
        {
            if (i != null)
            {
                i.b();
            }
        }

        public int a(int i1, n n1, s s1)
        {
            return 0;
        }

        public int a(n n1, s s1)
        {
            while (h == null || RecyclerView.g(h) == null || !j()) 
            {
                return 1;
            }
            return RecyclerView.g(h).b();
        }

        public int a(s s1)
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

        public View a(int i1)
        {
            int k1 = s();
            for (int j1 = 0; j1 < k1; j1++)
            {
                View view = e(j1);
                v v1 = RecyclerView.b(view);
                if (v1 != null && v1.d() == i1 && !v1.L_() && (h.o.j || !v1.o()))
                {
                    return view;
                }
            }

            return null;
        }

        public void a()
        {
        }

        public final void a(int i1, n n1)
        {
            View view = e(i1);
            c(i1);
            n1.a(view);
        }

        public void a(Parcelable parcelable)
        {
        }

        final void a(n n1)
        {
            int j1 = n1.a.size();
            for (int i1 = j1 - 1; i1 >= 0; i1--)
            {
                View view = ((v)n1.a.get(i1)).a;
                v v1 = RecyclerView.b(view);
                if (v1.L_())
                {
                    continue;
                }
                v1.a(false);
                if (v1.p())
                {
                    h.removeDetachedView(view, false);
                }
                if (h.m != null)
                {
                    h.m.c(v1);
                }
                v1.a(true);
                n1.b(view);
            }

            n1.a.clear();
            if (j1 > 0)
            {
                h.invalidate();
            }
        }

        public void a(n n1, s s1, View view, bk bk1)
        {
            int i1;
            int j1;
            if (j())
            {
                i1 = a(view);
            } else
            {
                i1 = 0;
            }
            if (i())
            {
                j1 = a(view);
            } else
            {
                j1 = 0;
            }
            bk1.a(bk.j.a(i1, 1, j1, 1, false));
        }

        public final void a(r r1)
        {
            if (i != null && r1 != i && i.e)
            {
                i.b();
            }
            i = r1;
            r1 = i;
            r1.b = h;
            r1.c = this;
            if (r1.a == -1)
            {
                throw new IllegalArgumentException("Invalid target position");
            } else
            {
                r1.b.o.a = r1.a;
                r1.e = true;
                r1.d = true;
                int i1 = r1.a;
                r1.f = RecyclerView.e(r1.b).a(i1);
                RecyclerView.w(r1.b).a();
                return;
            }
        }

        final void a(RecyclerView recyclerview)
        {
            if (recyclerview == null)
            {
                h = null;
                g = null;
                return;
            } else
            {
                h = recyclerview;
                g = recyclerview.c;
                return;
            }
        }

        public void a(RecyclerView recyclerview, int i1)
        {
        }

        public void a(View view, int i1)
        {
            a(view, i1, false);
        }

        public void a(View view, int i1, int j1, int k1, int l1)
        {
            Rect rect = ((LayoutParams)view.getLayoutParams()).d;
            view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
        }

        final void a(View view, int i1, boolean flag)
        {
            v v1;
            LayoutParams layoutparams;
            v1 = RecyclerView.b(view);
            if (flag || v1.o())
            {
                h.o.b(view);
            } else
            {
                h.o.a(view);
            }
            layoutparams = (LayoutParams)view.getLayoutParams();
            if (!v1.h() && !v1.f()) goto _L2; else goto _L1
_L1:
            if (v1.f())
            {
                v1.g();
            } else
            {
                v1.i();
            }
            g.a(view, i1, view.getLayoutParams(), false);
_L4:
            if (layoutparams.f)
            {
                v1.a.invalidate();
                layoutparams.f = false;
            }
            return;
_L2:
            if (view.getParent() == h)
            {
                bE be = g;
                int j1 = be.a.a(view);
                int k1;
                if (j1 == -1)
                {
                    j1 = -1;
                } else
                if (be.b.b(j1))
                {
                    j1 = -1;
                } else
                {
                    j1 -= be.b.d(j1);
                }
                k1 = i1;
                if (i1 == -1)
                {
                    k1 = g.a();
                }
                if (j1 == -1)
                {
                    throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(h.indexOfChild(view)).toString());
                }
                if (j1 != k1)
                {
                    view = RecyclerView.e(h);
                    View view1 = view.e(j1);
                    if (view1 == null)
                    {
                        throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(j1).toString());
                    }
                    view.d(j1);
                    LayoutParams layoutparams1 = (LayoutParams)view1.getLayoutParams();
                    v v2 = RecyclerView.b(view1);
                    if (v2.o())
                    {
                        ((i) (view)).h.o.b(view1);
                    } else
                    {
                        ((i) (view)).h.o.a(view1);
                    }
                    ((i) (view)).g.a(view1, k1, layoutparams1, v2.o());
                }
            } else
            {
                g.a(view, i1, false);
                layoutparams.e = true;
                if (i != null && i.e)
                {
                    r r1 = i;
                    if (RecyclerView.d(view) == r1.a)
                    {
                        r1.f = view;
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        public final void a(View view, bk bk1)
        {
            v v1 = RecyclerView.b(view);
            if (v1 != null && !v1.o() && !g.a(v1.a))
            {
                a(h.a, h.o, view, bk1);
            }
        }

        public void a(AccessibilityEvent accessibilityevent)
        {
            boolean flag1 = true;
            Object obj = h.a;
            obj = h.o;
            accessibilityevent = bj.a(accessibilityevent);
            if (h != null)
            {
                boolean flag = flag1;
                if (!aY.b(h, 1))
                {
                    flag = flag1;
                    if (!aY.b(h, -1))
                    {
                        flag = flag1;
                        if (!aY.a(h, -1))
                        {
                            if (aY.a(h, 1))
                            {
                                flag = flag1;
                            } else
                            {
                                flag = false;
                            }
                        }
                    }
                }
                accessibilityevent.a(flag);
                if (RecyclerView.g(h) != null)
                {
                    accessibilityevent.a(RecyclerView.g(h).b());
                    return;
                }
            }
        }

        public void a(String s1)
        {
            if (h != null)
            {
                h.a(s1);
            }
        }

        public boolean a(LayoutParams layoutparams)
        {
            return layoutparams != null;
        }

        public int b(int i1, n n1, s s1)
        {
            return 0;
        }

        public int b(n n1, s s1)
        {
            while (h == null || RecyclerView.g(h) == null || !i()) 
            {
                return 1;
            }
            return RecyclerView.g(h).b();
        }

        public int b(s s1)
        {
            return 0;
        }

        public void b()
        {
        }

        public void b(int i1)
        {
        }

        public int c(s s1)
        {
            return 0;
        }

        public View c(int i1, n n1, s s1)
        {
            return null;
        }

        public void c()
        {
        }

        public final void c(int i1)
        {
            if (e(i1) != null)
            {
                bE be = g;
                i1 = be.a(i1);
                View view = be.a.b(i1);
                if (view != null)
                {
                    if (be.b.c(i1))
                    {
                        be.c.remove(view);
                    }
                    be.a.a(i1);
                }
            }
        }

        public void c(n n1, s s1)
        {
        }

        public int d(s s1)
        {
            return 0;
        }

        public void d()
        {
        }

        public final void d(int i1)
        {
            e(i1);
            bE be = g;
            i1 = be.a(i1);
            be.b.c(i1);
            be.a.c(i1);
        }

        public int e(s s1)
        {
            return 0;
        }

        public final View e(int i1)
        {
            if (g != null)
            {
                return g.b(i1);
            } else
            {
                return null;
            }
        }

        public void e()
        {
        }

        public int f(s s1)
        {
            return 0;
        }

        public abstract LayoutParams f();

        public boolean g()
        {
            return false;
        }

        public Parcelable h()
        {
            return null;
        }

        public boolean i()
        {
            return false;
        }

        public boolean j()
        {
            return false;
        }

        public final void q()
        {
            if (h != null)
            {
                h.requestLayout();
            }
        }

        public final boolean r()
        {
            return h != null && RecyclerView.v(h);
        }

        public final int s()
        {
            if (g != null)
            {
                return g.a();
            } else
            {
                return 0;
            }
        }

        public final int t()
        {
            if (h != null)
            {
                return h.getWidth();
            } else
            {
                return 0;
            }
        }

        public final int u()
        {
            if (h != null)
            {
                return h.getHeight();
            } else
            {
                return 0;
            }
        }

        public final int v()
        {
            if (h != null)
            {
                return h.getPaddingLeft();
            } else
            {
                return 0;
            }
        }

        public final int w()
        {
            if (h != null)
            {
                return h.getPaddingTop();
            } else
            {
                return 0;
            }
        }

        public final int x()
        {
            if (h != null)
            {
                return h.getPaddingRight();
            } else
            {
                return 0;
            }
        }

        public int y()
        {
            if (h != null)
            {
                return h.getPaddingBottom();
            } else
            {
                return 0;
            }
        }

        public final int z()
        {
            a a1;
            if (h != null)
            {
                a1 = h.d;
            } else
            {
                a1 = null;
            }
            if (a1 != null)
            {
                return a1.b();
            } else
            {
                return 0;
            }
        }

        public i()
        {
        }
    }

    public static interface j
    {

        public abstract void a();

        public abstract void b();
    }

    public static interface k
    {

        public abstract boolean a(MotionEvent motionevent);
    }

    public static abstract class l
    {

        public void a(RecyclerView recyclerview, int i1)
        {
        }

        public void a(RecyclerView recyclerview, int i1, int j1)
        {
        }

        public l()
        {
        }
    }

    public static final class m
    {

        SparseArray a;
        SparseIntArray b;
        int c;

        final void a()
        {
            c = c + 1;
        }

        final void b()
        {
            c = c - 1;
        }

        public m()
        {
            a = new SparseArray();
            b = new SparseIntArray();
            c = 0;
        }
    }

    public final class n
    {

        final ArrayList a = new ArrayList();
        ArrayList b;
        final ArrayList c = new ArrayList();
        final List d;
        int e;
        m f;
        t g;
        final RecyclerView h;

        private v a(long l1, int i1)
        {
            for (int j1 = a.size() - 1; j1 >= 0; j1--)
            {
                v v1 = (v)a.get(j1);
                if (v1.d != l1 || v1.h())
                {
                    continue;
                }
                if (i1 == v1.e)
                {
                    v1.b(32);
                    if (v1.o() && !h.o.j)
                    {
                        v1.a(2, 14);
                    }
                    return v1;
                }
                a.remove(j1);
                h.removeDetachedView(v1.a, false);
                b(v1.a);
            }

            for (int k1 = c.size() - 1; k1 >= 0; k1--)
            {
                v v2 = (v)c.get(k1);
                if (v2.d != l1)
                {
                    continue;
                }
                if (i1 == v2.e)
                {
                    c.remove(k1);
                    return v2;
                }
                c(k1);
            }

            return null;
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

        private void c(v v1)
        {
            aY.a(v1.a, null);
            if (RecyclerView.u(h) != null)
            {
                RecyclerView.u(h).a_(v1);
            }
            if (RecyclerView.g(h) != null)
            {
                RecyclerView.g(h).a(v1);
            }
            Object obj = h.o;
            h.o.a(v1);
            v1.k = null;
            m m1 = c();
            int i1 = v1.e;
            ArrayList arraylist = (ArrayList)m1.a.get(i1);
            obj = arraylist;
            if (arraylist == null)
            {
                ArrayList arraylist1 = new ArrayList();
                m1.a.put(i1, arraylist1);
                obj = arraylist1;
                if (m1.b.indexOfKey(i1) < 0)
                {
                    m1.b.put(i1, 5);
                    obj = arraylist1;
                }
            }
            if (m1.b.get(i1) > ((ArrayList) (obj)).size())
            {
                v1.q();
                ((ArrayList) (obj)).add(v1);
            }
        }

        private v d(int i1)
        {
            boolean flag;
            int k1;
label0:
            {
                flag = false;
                if (b != null)
                {
                    k1 = b.size();
                    if (k1 != 0)
                    {
                        break label0;
                    }
                }
                return null;
            }
            for (int j1 = 0; j1 < k1; j1++)
            {
                v v1 = (v)b.get(j1);
                if (!v1.h() && v1.d() == i1)
                {
                    v1.b(32);
                    return v1;
                }
            }

            if (RecyclerView.g(h).b)
            {
                i1 = h.b.a(i1, 0);
                if (i1 > 0 && i1 < RecyclerView.g(h).b())
                {
                    long l1 = RecyclerView.g(h).b(i1);
                    for (i1 = ((flag) ? 1 : 0); i1 < k1; i1++)
                    {
                        v v2 = (v)b.get(i1);
                        if (!v2.h() && v2.d == l1)
                        {
                            v2.b(32);
                            return v2;
                        }
                    }

                }
            }
            return null;
        }

        private v e(int i1)
        {
            bE be;
            int k1;
            boolean flag;
            int l1;
            flag = false;
            l1 = a.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                v v1 = (v)a.get(j1);
                if (!v1.h() && v1.d() == i1 && !v1.k() && (h.o.j || !v1.o()))
                {
                    v1.b(32);
                    return v1;
                }
            }

            be = h.c;
            l1 = be.c.size();
            k1 = 0;
_L7:
            if (k1 >= l1) goto _L2; else goto _L1
_L1:
            Object obj;
            v v2;
            obj = (View)be.c.get(k1);
            v2 = be.a.b(((View) (obj)));
            if (v2.d() != i1 || v2.k()) goto _L4; else goto _L3
_L3:
            if (obj != null)
            {
                h.m.c(h.a(((View) (obj))));
            }
            l1 = c.size();
            k1 = ((flag) ? 1 : 0);
_L5:
            if (k1 >= l1)
            {
                break MISSING_BLOCK_LABEL_272;
            }
            obj = (v)c.get(k1);
            if (!((v) (obj)).k() && ((v) (obj)).d() == i1)
            {
                c.remove(k1);
                return ((v) (obj));
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

        public final int a(int i1)
        {
            if (i1 < 0 || i1 >= h.o.a())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("invalid position ")).append(i1).append(". State item count is ").append(h.o.a()).toString());
            }
            if (!h.o.j)
            {
                return i1;
            } else
            {
                return h.b.a(i1);
            }
        }

        public final void a()
        {
            a.clear();
            b();
        }

        final void a(v v1)
        {
            boolean flag;
            boolean flag3 = true;
            boolean flag2 = false;
            if (v1.f() || v1.a.getParent() != null)
            {
                StringBuilder stringbuilder = (new StringBuilder("Scrapped or attached views may not be recycled. isScrap:")).append(v1.f()).append(" isAttached:");
                if (v1.a.getParent() == null)
                {
                    flag3 = false;
                }
                throw new IllegalArgumentException(stringbuilder.append(flag3).toString());
            }
            if (v1.p())
            {
                throw new IllegalArgumentException((new StringBuilder("Tmp detached view should be removed from RecyclerView before it can be recycled: ")).append(v1).toString());
            }
            if (v1.L_())
            {
                throw new IllegalArgumentException("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.");
            }
            int i1;
            boolean flag1;
            if ((v1.i & 0x10) == 0 && aY.c(v1.a))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (RecyclerView.g(h) != null && flag1)
            {
                RecyclerView.g(h);
            }
            if (!v1.r())
            {
                break MISSING_BLOCK_LABEL_293;
            }
            if (v1.a(78)) goto _L2; else goto _L1
_L1:
            i1 = c.size();
            if (i1 == e && i1 > 0)
            {
                c(0);
            }
            if (i1 >= e) goto _L2; else goto _L3
_L3:
            c.add(v1);
            flag = true;
_L4:
            if (!flag)
            {
                c(v1);
                flag2 = true;
            }
_L5:
            h.o.a(v1);
            if (!flag && !flag2 && flag1)
            {
                v1.k = null;
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
            v v1;
            v1 = RecyclerView.b(view);
            if (v1.p())
            {
                h.removeDetachedView(view, false);
            }
            if (!v1.f()) goto _L2; else goto _L1
_L1:
            v1.g();
_L4:
            a(v1);
            return;
_L2:
            if (v1.h())
            {
                v1.i();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        final View b(int i1)
        {
            boolean flag1 = true;
            if (i1 < 0 || i1 >= h.o.a())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Invalid item position ")).append(i1).append("(").append(i1).append("). Item count:").append(h.o.a()).toString());
            }
            Object obj;
            Object obj1;
            View view;
            boolean flag;
            int j1;
            int k1;
            if (h.o.j)
            {
                obj1 = d(i1);
                if (obj1 != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                j1 = ((flag) ? 1 : 0);
            } else
            {
                obj1 = null;
                j1 = 0;
            }
            obj = obj1;
            flag = j1;
            if (obj1 != null) goto _L2; else goto _L1
_L1:
            obj1 = e(i1);
            obj = obj1;
            flag = j1;
            if (obj1 == null) goto _L2; else goto _L3
_L3:
            if (((v) (obj1)).o()) goto _L5; else goto _L4
_L4:
            if (((v) (obj1)).b < 0 || ((v) (obj1)).b >= RecyclerView.g(h).b())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid view holder adapter position")).append(obj1).toString());
            }
            if (h.o.j || RecyclerView.g(h).a(((v) (obj1)).b) == ((v) (obj1)).e) goto _L7; else goto _L6
_L6:
            flag = false;
_L17:
            if (!flag)
            {
                ((v) (obj1)).b(4);
                if (((v) (obj1)).f())
                {
                    h.removeDetachedView(((v) (obj1)).a, false);
                    ((v) (obj1)).g();
                } else
                if (((v) (obj1)).h())
                {
                    ((v) (obj1)).i();
                }
                a(((v) (obj1)));
                obj = null;
                flag = j1;
            } else
            {
                flag = true;
                obj = obj1;
            }
_L2:
            if (obj != null) goto _L9; else goto _L8
_L8:
            k1 = h.b.a(i1);
            if (k1 < 0 || k1 >= RecyclerView.g(h).b())
            {
                throw new IndexOutOfBoundsException((new StringBuilder("Inconsistency detected. Invalid item position ")).append(i1).append("(offset:").append(k1).append(").state:").append(h.o.a()).toString());
            }
            j1 = RecyclerView.g(h).a(k1);
              goto _L10
_L7:
            if (RecyclerView.g(h).b && ((v) (obj1)).d != RecyclerView.g(h).b(((v) (obj1)).b))
            {
                flag = false;
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = true;
            continue; /* Loop/switch isn't completed */
_L10:
            if (!RecyclerView.g(h).b) goto _L12; else goto _L11
_L11:
            obj1 = a(RecyclerView.g(h).b(k1), j1);
            obj = obj1;
            if (obj1 == null) goto _L12; else goto _L13
_L13:
            obj1.b = k1;
            flag = true;
_L15:
            obj = obj1;
            if (obj1 == null)
            {
                obj = obj1;
                if (g != null)
                {
                    view = g.a();
                    obj = obj1;
                    if (view != null)
                    {
                        obj1 = h.a(view);
                        if (obj1 == null)
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view which does not have a ViewHolder");
                        }
                        obj = obj1;
                        if (((v) (obj1)).L_())
                        {
                            throw new IllegalArgumentException("getViewForPositionAndType returned a view that is ignored. You must call stopIgnoring before returning this view.");
                        }
                    }
                }
            }
            obj1 = obj;
            if (obj == null)
            {
                obj1 = (ArrayList)c().a.get(j1);
                if (obj1 != null && !((ArrayList) (obj1)).isEmpty())
                {
                    k1 = ((ArrayList) (obj1)).size() - 1;
                    obj = (v)((ArrayList) (obj1)).get(k1);
                    ((ArrayList) (obj1)).remove(k1);
                } else
                {
                    obj = null;
                }
                if (obj != null)
                {
                    ((v) (obj)).q();
                    if (RecyclerView.i() && (((v) (obj)).a instanceof ViewGroup))
                    {
                        a((ViewGroup)((v) (obj)).a, false);
                    }
                }
                obj1 = obj;
            }
            if (obj1 == null)
            {
                obj = RecyclerView.g(h);
                obj1 = h;
                au.a("RV CreateView");
                obj = ((a) (obj)).a(((ViewGroup) (obj1)), j1);
                obj.e = j1;
                au.a();
            } else
            {
                obj = obj1;
            }
_L9:
            if (h.o.j && ((v) (obj)).n())
            {
                obj.f = i1;
                i1 = 0;
            } else
            if (!((v) (obj)).n() || ((v) (obj)).l() || ((v) (obj)).k())
            {
                j1 = h.b.a(i1);
                obj.k = h;
                RecyclerView.g(h).b(((v) (obj)), j1);
                obj1 = ((v) (obj)).a;
                if (RecyclerView.s(h) != null && RecyclerView.s(h).isEnabled())
                {
                    if (aY.e(((View) (obj1))) == 0)
                    {
                        aY.c(((View) (obj1)), 1);
                    }
                    if (!aY.b(((View) (obj1))))
                    {
                        aY.a(((View) (obj1)), RecyclerView.t(h).c);
                    }
                }
                if (h.o.j)
                {
                    obj.f = i1;
                }
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            obj1 = ((v) (obj)).a.getLayoutParams();
            if (obj1 == null)
            {
                obj1 = (LayoutParams)h.generateDefaultLayoutParams();
                ((v) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            } else
            if (!h.checkLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1))))
            {
                obj1 = (LayoutParams)h.generateLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
                ((v) (obj)).a.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
            } else
            {
                obj1 = (LayoutParams)obj1;
            }
            obj1.c = ((v) (obj));
            if (!flag || i1 == 0)
            {
                flag1 = false;
            }
            obj1.f = flag1;
            return ((v) (obj)).a;
_L12:
            obj1 = obj;
            if (true) goto _L15; else goto _L14
_L14:
            if (true) goto _L17; else goto _L16
_L16:
        }

        final void b()
        {
            for (int i1 = c.size() - 1; i1 >= 0; i1--)
            {
                c(i1);
            }

            c.clear();
        }

        final void b(v v1)
        {
            if (!v1.m() || !RecyclerView.i(h) || b == null)
            {
                a.remove(v1);
            } else
            {
                b.remove(v1);
            }
            v1.j = null;
            v1.i();
        }

        final void b(View view)
        {
            view = RecyclerView.b(view);
            view.j = null;
            view.i();
            a(view);
        }

        final m c()
        {
            if (f == null)
            {
                f = new m();
            }
            return f;
        }

        final void c(int i1)
        {
            c((v)c.get(i1));
            c.remove(i1);
        }

        public n()
        {
            h = RecyclerView.this;
            super();
            b = null;
            d = Collections.unmodifiableList(a);
            e = 2;
        }
    }

    public static interface o
    {

        public abstract void a_(v v1);
    }

    final class p extends c
    {

        private RecyclerView a;

        private void b()
        {
            if (RecyclerView.n(a) && RecyclerView.o(a) && RecyclerView.p(a))
            {
                aY.a(a, RecyclerView.q(a));
                return;
            } else
            {
                RecyclerView.r(a);
                a.requestLayout();
                return;
            }
        }

        public final void a()
        {
            a.a(null);
            RecyclerView.g(a);
            a.o.i = true;
            RecyclerView.m(a);
            if (!a.b.d())
            {
                a.requestLayout();
            }
        }

        public final void a(int i1, int j1)
        {
            boolean flag = true;
            a.a(null);
            bD bd = a.b;
            bd.a.add(bd.a(2, i1, j1));
            if (bd.a.size() == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                b();
            }
        }

        public final void b(int i1, int j1)
        {
            boolean flag = true;
            a.a(null);
            bD bd = a.b;
            bd.a.add(bd.a(0, i1, j1));
            if (bd.a.size() == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                b();
            }
        }

        public final void c(int i1, int j1)
        {
            boolean flag = true;
            a.a(null);
            bD bd = a.b;
            bd.a.add(bd.a(1, i1, j1));
            if (bd.a.size() == 1)
            {
                i1 = ((flag) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                b();
            }
        }

        public final void d(int i1, int j1)
        {
            bD bd;
            boolean flag;
            flag = true;
            a.a(null);
            bd = a.b;
            if (i1 == j1) goto _L2; else goto _L1
_L1:
            bd.a.add(bd.a(3, i1, j1));
            if (bd.a.size() != 1) goto _L2; else goto _L3
_L3:
            i1 = ((flag) ? 1 : 0);
_L5:
            if (i1 != 0)
            {
                b();
            }
            return;
_L2:
            i1 = 0;
            if (true) goto _L5; else goto _L4
_L4:
        }

        private p()
        {
            a = RecyclerView.this;
            super();
        }

        p(byte byte0)
        {
            this();
        }
    }

    public static class q
        implements k
    {

        public boolean a(MotionEvent motionevent)
        {
            return false;
        }

        public q()
        {
        }
    }

    public static abstract class r
    {

        public int a;
        public RecyclerView b;
        public i c;
        boolean d;
        boolean e;
        View f;
        private final a g = new a();

        static void a(r r1, int i1, int j1)
        {
label0:
            {
                boolean flag = false;
                RecyclerView recyclerview = r1.b;
                if (!r1.e || r1.a == -1 || recyclerview == null)
                {
                    r1.b();
                }
                r1.d = false;
                if (r1.f != null)
                {
                    if (RecyclerView.d(r1.f) == r1.a)
                    {
                        View view = r1.f;
                        s s2 = recyclerview.o;
                        r1.a(view, r1.g);
                        a.a(r1.g, recyclerview);
                        r1.b();
                    } else
                    {
                        r1.f = null;
                    }
                }
                if (r1.e)
                {
                    s s1 = recyclerview.o;
                    r1.a(i1, j1, r1.g);
                    i1 = ((flag) ? 1 : 0);
                    if (r1.g.a >= 0)
                    {
                        i1 = 1;
                    }
                    a.a(r1.g, recyclerview);
                    if (i1 != 0)
                    {
                        if (!r1.e)
                        {
                            break label0;
                        }
                        r1.d = true;
                        RecyclerView.w(recyclerview).a();
                    }
                }
                return;
            }
            r1.b();
        }

        public abstract void a();

        public abstract void a(int i1, int j1, a a1);

        public abstract void a(View view, a a1);

        public final void b()
        {
            if (!e)
            {
                return;
            } else
            {
                a();
                b.o.a = -1;
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

        public r()
        {
            a = -1;
        }
    }

    public static final class r.a
    {

        public int a;
        private int b;
        private int c;
        private int d;
        private Interpolator e;
        private boolean f;
        private int g;

        static void a(r.a a1, RecyclerView recyclerview)
        {
            if (a1.a >= 0)
            {
                int i1 = a1.a;
                a1.a = -1;
                RecyclerView.c(recyclerview, i1);
                a1.f = false;
                return;
            }
            if (a1.f)
            {
                if (a1.e != null && a1.d <= 0)
                {
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                }
                if (a1.d <= 0)
                {
                    throw new IllegalStateException("Scroll duration must be a positive number");
                }
                if (a1.e == null)
                {
                    if (a1.d == 0x80000000)
                    {
                        RecyclerView.w(recyclerview).a(a1.b, a1.c);
                    } else
                    {
                        RecyclerView.w(recyclerview).a(a1.b, a1.c, a1.d);
                    }
                } else
                {
                    RecyclerView.w(recyclerview).a(a1.b, a1.c, a1.d, a1.e);
                }
                a1.g = a1.g + 1;
                a1.f = false;
                return;
            } else
            {
                a1.g = 0;
                return;
            }
        }

        public final void a(int i1, int j1, int k1, Interpolator interpolator)
        {
            b = i1;
            c = j1;
            d = k1;
            e = interpolator;
            f = true;
        }

        public r.a()
        {
            this((byte)0);
        }

        private r.a(byte byte0)
        {
            a = -1;
            f = false;
            g = 0;
            b = 0;
            c = 0;
            d = 0x80000000;
            e = null;
        }
    }

    public static final class s
    {

        int a;
        av b;
        av c;
        av d;
        final List e = new ArrayList();
        int f;
        int g;
        int h;
        boolean i;
        boolean j;
        boolean k;
        boolean l;

        public final int a()
        {
            if (j)
            {
                return g - h;
            } else
            {
                return f;
            }
        }

        final void a(v v1)
        {
            b.remove(v1);
            c.remove(v1);
            if (d == null) goto _L2; else goto _L1
_L1:
            av av1;
            int i1;
            av1 = d;
            i1 = av1.size() - 1;
_L7:
            if (i1 < 0) goto _L2; else goto _L3
_L3:
            if (v1 != av1.c(i1)) goto _L5; else goto _L4
_L4:
            av1.d(i1);
_L2:
            e.remove(v1.a);
            return;
_L5:
            i1--;
            if (true) goto _L7; else goto _L6
_L6:
        }

        final void a(View view)
        {
            e.remove(view);
        }

        final void b(View view)
        {
            if (!e.contains(view))
            {
                e.add(view);
            }
        }

        public final String toString()
        {
            return (new StringBuilder("State{mTargetPosition=")).append(a).append(", mPreLayoutHolderMap=").append(b).append(", mPostLayoutHolderMap=").append(c).append(", mData=").append(null).append(", mItemCount=").append(f).append(", mPreviousLayoutItemCount=").append(g).append(", mDeletedInvisibleItemCountSincePreviousLayout=").append(h).append(", mStructureChanged=").append(i).append(", mInPreLayout=").append(j).append(", mRunSimpleAnimations=").append(k).append(", mRunPredictiveAnimations=").append(l).append('}').toString();
        }

        public s()
        {
            a = -1;
            b = new av();
            c = new av();
            d = new av();
            f = 0;
            g = 0;
            h = 0;
            i = false;
            j = false;
            k = false;
            l = false;
        }
    }

    public static abstract class t
    {

        public abstract View a();
    }

    final class u
        implements Runnable
    {

        int a;
        int b;
        bA c;
        final RecyclerView d;
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
                d.removeCallbacks(this);
                aY.a(d, this);
                return;
            }
        }

        public final void a(int i1, int j1)
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
                k1 = d.getWidth();
            } else
            {
                k1 = d.getHeight();
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

        public final void a(int i1, int j1, int k1)
        {
            a(i1, j1, k1, RecyclerView.h());
        }

        public final void a(int i1, int j1, int k1, Interpolator interpolator)
        {
            if (e != interpolator)
            {
                e = interpolator;
                c = bA.a(d.getContext(), interpolator);
            }
            RecyclerView.b(d, 2);
            b = 0;
            a = 0;
            c.a(0, 0, i1, j1, k1);
            a();
        }

        public final void run()
        {
            bA ba;
            r r1;
            g = false;
            f = true;
            RecyclerView.f(d);
            ba = c;
            r1 = RecyclerView.e(d).i;
            if (!ba.g()) goto _L2; else goto _L1
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
            k3 = ba.b();
            l3 = ba.c();
            i3 = k3 - a;
            j3 = l3 - b;
            j2 = 0;
            i1 = 0;
            k2 = 0;
            l1 = 0;
            a = k3;
            b = l3;
            l2 = 0;
            j1 = 0;
            i2 = 0;
            k1 = 0;
            if (RecyclerView.g(d) == null)
            {
                break MISSING_BLOCK_LABEL_906;
            }
            d.a();
            RecyclerView.h(d);
            au.a("RV Scroll");
            if (i3 != 0)
            {
                i1 = RecyclerView.e(d).a(i3, d.a, d.o);
                j1 = i3 - i1;
            }
            if (j3 != 0)
            {
                l1 = RecyclerView.e(d).b(j3, d.a, d.o);
                k1 = j3 - l1;
            }
            au.a();
            if (RecyclerView.i(d))
            {
                j2 = d.c.a();
                for (i2 = 0; i2 < j2; i2++)
                {
                    View view = d.c.b(i2);
                    Object obj = d.a(view);
                    if (obj == null || ((v) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((v) (obj)).h.a;
                    k2 = view.getLeft();
                    l2 = view.getTop();
                    if (k2 != ((View) (obj)).getLeft() || l2 != ((View) (obj)).getTop())
                    {
                        ((View) (obj)).layout(k2, l2, ((View) (obj)).getWidth() + k2, ((View) (obj)).getHeight() + l2);
                    }
                }

            }
            RecyclerView.j(d);
            d.a(false);
            i2 = k1;
            k2 = l1;
            l2 = j1;
            j2 = i1;
            if (r1 == null)
            {
                break MISSING_BLOCK_LABEL_906;
            }
            i2 = k1;
            k2 = l1;
            l2 = j1;
            j2 = i1;
            if (r1.d)
            {
                break MISSING_BLOCK_LABEL_906;
            }
            i2 = k1;
            k2 = l1;
            l2 = j1;
            j2 = i1;
            if (!r1.e)
            {
                break MISSING_BLOCK_LABEL_906;
            }
            i2 = d.o.a();
            if (i2 != 0) goto _L4; else goto _L3
_L3:
            r1.b();
            j2 = i1;
_L5:
            if (!RecyclerView.k(d).isEmpty())
            {
                d.invalidate();
            }
            if (aY.a(d) != 2)
            {
                RecyclerView.a(d, i3, j3);
            }
            if (j1 != 0 || k1 != 0)
            {
                i2 = (int)ba.f();
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
                if (aY.a(d) != 2)
                {
                    RecyclerView recyclerview = d;
                    if (k2 < 0)
                    {
                        recyclerview.b();
                        recyclerview.i.a(-k2);
                    } else
                    if (k2 > 0)
                    {
                        recyclerview.c();
                        recyclerview.k.a(k2);
                    }
                    if (i1 < 0)
                    {
                        recyclerview.d();
                        recyclerview.j.a(-i1);
                    } else
                    if (i1 > 0)
                    {
                        recyclerview.e();
                        recyclerview.l.a(i1);
                    }
                    if (k2 != 0 || i1 != 0)
                    {
                        aY.d(recyclerview);
                    }
                }
                if ((k2 != 0 || j1 == k3 || ba.d() == 0) && (i1 != 0 || k1 == l3 || ba.e() == 0))
                {
                    ba.h();
                }
            }
            if (j2 != 0 || l1 != 0)
            {
                d.a(j2, l1);
            }
            if (!RecyclerView.l(d))
            {
                d.invalidate();
            }
            if (j3 != 0 && RecyclerView.e(d).j() && l1 == j3)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i3 != 0 && RecyclerView.e(d).i() && j2 == i3)
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
            if (ba.a() || i1 == 0)
            {
                RecyclerView.b(d, 0);
            } else
            {
                a();
            }
_L2:
            if (r1 != null)
            {
                if (r1.d)
                {
                    r.a(r1, 0, 0);
                }
                if (!g)
                {
                    r1.b();
                }
            }
            f = false;
            if (g)
            {
                a();
            }
            return;
_L4:
            if (r1.a >= i2)
            {
                r1.a = i2 - 1;
            }
            r.a(r1, i3 - j1, j3 - k1);
            j2 = i1;
            l2 = j1;
            k2 = l1;
            i2 = k1;
            l1 = k2;
            j1 = l2;
            k1 = i2;
              goto _L5
        }

        public u()
        {
            d = RecyclerView.this;
            super();
            e = RecyclerView.h();
            f = false;
            g = false;
            c = bA.a(getContext(), RecyclerView.h());
        }
    }

    public static abstract class v
    {

        public final View a;
        int b;
        int c;
        long d;
        int e;
        int f;
        v g;
        v h;
        int i;
        n j;
        RecyclerView k;
        private int l;

        static boolean a(v v1)
        {
            return (v1.i & 0x10) != 0;
        }

        final boolean L_()
        {
            return (i & 0x80) != 0;
        }

        final void a()
        {
            c = -1;
            f = -1;
        }

        final void a(int i1, int j1)
        {
            i = i & ~j1 | i1 & j1;
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
                ((LayoutParams)a.getLayoutParams()).e = true;
            }
        }

        public final void a(boolean flag)
        {
            int i1;
            if (flag)
            {
                i1 = l - 1;
            } else
            {
                i1 = l + 1;
            }
            l = i1;
            if (l < 0)
            {
                l = 0;
                (new StringBuilder("isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for ")).append(this);
            } else
            {
                if (!flag && l == 1)
                {
                    i = i | 0x10;
                    return;
                }
                if (flag && l == 0)
                {
                    i = i & 0xffffffef;
                    return;
                }
            }
        }

        final boolean a(int i1)
        {
            return (i & i1) != 0;
        }

        final void b(int i1)
        {
            i = i | i1;
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

        public final int d()
        {
            if (f == -1)
            {
                return b;
            } else
            {
                return f;
            }
        }

        public final int e()
        {
            if (k == null)
            {
                return -1;
            } else
            {
                return RecyclerView.a(k, this);
            }
        }

        final boolean f()
        {
            return j != null;
        }

        final void g()
        {
            j.b(this);
        }

        final boolean h()
        {
            return (i & 0x20) != 0;
        }

        final void i()
        {
            i = i & 0xffffffdf;
        }

        final void j()
        {
            i = i & 0xfffffeff;
        }

        final boolean k()
        {
            return (i & 4) != 0;
        }

        final boolean l()
        {
            return (i & 2) != 0;
        }

        final boolean m()
        {
            return (i & 0x40) != 0;
        }

        final boolean n()
        {
            return (i & 1) != 0;
        }

        final boolean o()
        {
            return (i & 8) != 0;
        }

        final boolean p()
        {
            return (i & 0x100) != 0;
        }

        final void q()
        {
            i = 0;
            b = -1;
            c = -1;
            d = -1L;
            f = -1;
            l = 0;
            g = null;
            h = null;
        }

        public final boolean r()
        {
            return (i & 0x10) == 0 && !aY.c(a);
        }

        public String toString()
        {
            StringBuilder stringbuilder = new StringBuilder((new StringBuilder("ViewHolder{")).append(Integer.toHexString(hashCode())).append(" position=").append(b).append(" id=").append(d).append(", oldPos=").append(c).append(", pLpos:").append(f).toString());
            if (f())
            {
                stringbuilder.append(" scrap");
            }
            if (k())
            {
                stringbuilder.append(" invalid");
            }
            if (!n())
            {
                stringbuilder.append(" unbound");
            }
            if (l())
            {
                stringbuilder.append(" update");
            }
            if (o())
            {
                stringbuilder.append(" removed");
            }
            if (L_())
            {
                stringbuilder.append(" ignored");
            }
            if (m())
            {
                stringbuilder.append(" changed");
            }
            if (p())
            {
                stringbuilder.append(" tmpDetached");
            }
            if (!r())
            {
                stringbuilder.append((new StringBuilder(" not recyclable(")).append(l).append(")").toString());
            }
            boolean flag;
            if ((i & 0x200) != 0 || k())
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

        public v(View view)
        {
            b = -1;
            c = -1;
            d = -1L;
            e = -1;
            f = -1;
            g = null;
            h = null;
            l = 0;
            j = null;
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


    private static final Interpolator al = new Interpolator() {

        public final float getInterpolation(float f1)
        {
            f1--;
            return f1 * (f1 * f1 * f1 * f1) + 1.0F;
        }

    };
    private static final boolean r;
    private static final Class s[];
    private final ArrayList A;
    private k B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private int G;
    private boolean H;
    private final boolean I;
    private final AccessibilityManager J;
    private int K;
    private int L;
    private VelocityTracker M;
    private int N;
    private int O;
    private int P;
    private int Q;
    private int R;
    private final int S;
    private final int T;
    private float U;
    private u V;
    private l W;
    public final n a;
    private List aa;
    private e.b ab;
    private boolean ac;
    private bJ ad;
    private d ae;
    private final int af[];
    private final aR ag;
    private final int ah[];
    private final int ai[];
    private final int aj[];
    private Runnable ak;
    public bD b;
    public bE c;
    public a d;
    public i e;
    public boolean f;
    public List g;
    public boolean h;
    bx i;
    bx j;
    bx k;
    bx l;
    public e m;
    public int n;
    public final s o;
    boolean p;
    boolean q;
    private final p t;
    private SavedState u;
    private boolean v;
    private final Runnable w;
    private final Rect x;
    private o y;
    private final ArrayList z;

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
        t = new p((byte)0);
        a = new n();
        w = new Runnable() {

            private RecyclerView a;

            public final void run()
            {
                if (RecyclerView.a(a)) goto _L2; else goto _L1
_L1:
                return;
_L2:
                if (RecyclerView.b(a))
                {
                    au.a("RV FullInvalidate");
                    a.g();
                    au.a();
                    return;
                }
                if (!a.b.d()) goto _L1; else goto _L3
_L3:
                RecyclerView recyclerview;
                int j1;
                int k1;
                au.a("RV PartialInvalidate");
                a.a();
                a.b.b();
                if (RecyclerView.c(a))
                {
                    break MISSING_BLOCK_LABEL_221;
                }
                recyclerview = a;
                k1 = recyclerview.c.a();
                j1 = 0;
_L5:
                v v1;
                if (j1 >= k1)
                {
                    break MISSING_BLOCK_LABEL_221;
                }
                v1 = RecyclerView.b(recyclerview.c.b(j1));
                if (v1 != null && !v1.L_())
                {
                    if (!v1.o() && !v1.k())
                    {
                        break; /* Loop/switch isn't completed */
                    }
                    recyclerview.requestLayout();
                }
_L7:
                j1++;
                if (true) goto _L5; else goto _L4
_L4:
                if (!v1.l()) goto _L7; else goto _L6
_L6:
label0:
                {
                    int l1 = recyclerview.d.a(v1.b);
                    if (v1.e != l1)
                    {
                        break label0;
                    }
                    if (!v1.m() || !recyclerview.f())
                    {
                        recyclerview.d.b(v1, v1.b);
                    } else
                    {
                        recyclerview.requestLayout();
                    }
                }
                  goto _L7
                recyclerview.requestLayout();
                a.a(true);
                au.a();
                return;
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        };
        x = new Rect();
        z = new ArrayList();
        A = new ArrayList();
        h = false;
        K = 0;
        m = new bF();
        n = 0;
        L = -1;
        U = 1.401298E-45F;
        V = new u();
        o = new s();
        p = false;
        q = false;
        ab = new f((byte)0);
        ac = false;
        af = new int[2];
        ah = new int[2];
        ai = new int[2];
        aj = new int[2];
        ak = new Runnable() {

            private RecyclerView a;

            public final void run()
            {
                if (a.m != null)
                {
                    a.m.T_();
                }
                RecyclerView.d(a);
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        };
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
        I = flag;
        obj = ViewConfiguration.get(context);
        R = ((ViewConfiguration) (obj)).getScaledTouchSlop();
        S = ((ViewConfiguration) (obj)).getScaledMinimumFlingVelocity();
        T = ((ViewConfiguration) (obj)).getScaledMaximumFlingVelocity();
        if (aY.a(this) == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setWillNotDraw(flag);
        m.h = ab;
        b = new bD(new bD.a() {

            private RecyclerView a;

            private void c(bD.b b1)
            {
                switch (b1.a)
                {
                default:
                    return;

                case 0: // '\0'
                    RecyclerView.e(a).a();
                    return;

                case 1: // '\001'
                    RecyclerView.e(a).c();
                    return;

                case 2: // '\002'
                    RecyclerView.e(a).d();
                    return;

                case 3: // '\003'
                    RecyclerView.e(a).e();
                    break;
                }
            }

            public final v a(int j1)
            {
                v v1;
                for (v1 = a.a(j1, true); v1 == null || a.c.a(v1.a);)
                {
                    return null;
                }

                return v1;
            }

            public final void a(int j1, int k1)
            {
                a.a(j1, k1, true);
                a.p = true;
                s s1 = a.o;
                s1.h = s1.h + k1;
            }

            public final void a(bD.b b1)
            {
                c(b1);
            }

            public final void b(int j1, int k1)
            {
                a.a(j1, k1, false);
                a.p = true;
            }

            public final void b(bD.b b1)
            {
                c(b1);
            }

            public final void c(int j1, int k1)
            {
                Object obj2 = a;
                int j2 = ((RecyclerView) (obj2)).c.b();
                for (int l1 = 0; l1 < j2; l1++)
                {
                    View view = ((RecyclerView) (obj2)).c.c(l1);
                    v v2 = RecyclerView.b(view);
                    if (v2 == null || v2.L_() || v2.b < j1 || v2.b >= j1 + k1)
                    {
                        continue;
                    }
                    v2.b(2);
                    if (((RecyclerView) (obj2)).f())
                    {
                        v2.b(64);
                    }
                    ((LayoutParams)view.getLayoutParams()).e = true;
                }

                obj2 = ((RecyclerView) (obj2)).a;
                for (int i2 = ((n) (obj2)).c.size() - 1; i2 >= 0; i2--)
                {
                    v v1 = (v)((n) (obj2)).c.get(i2);
                    if (v1 == null)
                    {
                        continue;
                    }
                    int k2 = v1.d();
                    if (k2 >= j1 && k2 < j1 + k1)
                    {
                        v1.b(2);
                        ((n) (obj2)).c(i2);
                    }
                }

                a.q = true;
            }

            public final void d(int j1, int k1)
            {
                RecyclerView recyclerview = a;
                int j2 = recyclerview.c.b();
                for (int l1 = 0; l1 < j2; l1++)
                {
                    v v1 = RecyclerView.b(recyclerview.c.c(l1));
                    if (v1 != null && !v1.L_() && v1.b >= j1)
                    {
                        v1.a(k1, false);
                        recyclerview.o.i = true;
                    }
                }

                n n1 = recyclerview.a;
                j2 = n1.c.size();
                for (int i2 = 0; i2 < j2; i2++)
                {
                    v v2 = (v)n1.c.get(i2);
                    if (v2 != null && v2.d() >= j1)
                    {
                        v2.a(k1, true);
                    }
                }

                recyclerview.requestLayout();
                a.p = true;
            }

            public final void e(int j1, int k1)
            {
                int k2 = -1;
                RecyclerView recyclerview = a;
                int l2 = recyclerview.c.b();
                byte byte0;
                int l1;
                int i2;
                int j2;
                if (j1 < k1)
                {
                    byte0 = -1;
                    l1 = k1;
                    i2 = j1;
                } else
                {
                    byte0 = 1;
                    l1 = j1;
                    i2 = k1;
                }
                j2 = 0;
                while (j2 < l2) 
                {
                    v v1 = RecyclerView.b(recyclerview.c.c(j2));
                    if (v1 != null && v1.b >= i2 && v1.b <= l1)
                    {
                        if (v1.b == j1)
                        {
                            v1.a(k1 - j1, false);
                        } else
                        {
                            v1.a(byte0, false);
                        }
                        recyclerview.o.i = true;
                    }
                    j2++;
                }
                n n1 = recyclerview.a;
                if (j1 < k1)
                {
                    l1 = k1;
                    i2 = j1;
                    byte0 = k2;
                } else
                {
                    byte0 = 1;
                    l1 = j1;
                    i2 = k1;
                }
                k2 = n1.c.size();
                j2 = 0;
                while (j2 < k2) 
                {
                    v v2 = (v)n1.c.get(j2);
                    if (v2 != null && v2.b >= i2 && v2.b <= l1)
                    {
                        if (v2.b == j1)
                        {
                            v2.a(k1 - j1, false);
                        } else
                        {
                            v2.a(byte0, false);
                        }
                    }
                    j2++;
                }
                recyclerview.requestLayout();
                a.p = true;
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        });
        c = new bE(new bE.b() {

            private RecyclerView a;

            public final int a()
            {
                return a.getChildCount();
            }

            public final int a(View view)
            {
                return a.indexOfChild(view);
            }

            public final void a(int j1)
            {
                View view = a.getChildAt(j1);
                if (view != null)
                {
                    RecyclerView.b(a, view);
                }
                a.removeViewAt(j1);
            }

            public final void a(View view, int j1)
            {
                a.addView(view, j1);
                RecyclerView.a(a, view);
            }

            public final void a(View view, int j1, android.view.ViewGroup.LayoutParams layoutparams)
            {
                v v1 = RecyclerView.b(view);
                if (v1 != null)
                {
                    if (!v1.p() && !v1.L_())
                    {
                        throw new IllegalArgumentException((new StringBuilder("Called attach on a child which is not detached: ")).append(v1).toString());
                    }
                    v1.j();
                }
                RecyclerView.a(a, view, j1, layoutparams);
            }

            public final v b(View view)
            {
                return RecyclerView.b(view);
            }

            public final View b(int j1)
            {
                return a.getChildAt(j1);
            }

            public final void b()
            {
                int k1 = a.getChildCount();
                for (int j1 = 0; j1 < k1; j1++)
                {
                    RecyclerView.b(a, b(j1));
                }

                a.removeAllViews();
            }

            public final void c(int j1)
            {
                Object obj2 = b(j1);
                if (obj2 != null)
                {
                    obj2 = RecyclerView.b(((View) (obj2)));
                    if (obj2 != null)
                    {
                        if (((v) (obj2)).p() && !((v) (obj2)).L_())
                        {
                            throw new IllegalArgumentException((new StringBuilder("called detach on an already detached child ")).append(obj2).toString());
                        }
                        ((v) (obj2)).b(256);
                    }
                }
                RecyclerView.a(a, j1);
            }

            
            {
                a = RecyclerView.this;
                super();
            }
        });
        if (aY.e(this) == 0)
        {
            aY.c(this, 1);
        }
        J = (AccessibilityManager)getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new bJ(this));
        if (attributeset == null) goto _L2; else goto _L1
_L1:
        obj = context.obtainStyledAttributes(attributeset, bC.a.RecyclerView, i1, 0);
        obj1 = ((TypedArray) (obj)).getString(bC.a.RecyclerView_layoutManager);
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
        obj1 = class1.getConstructor(s);
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
            setLayoutManager((i)((Constructor) (obj1)).newInstance(context));
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
        ag = new aR(this);
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

    static int a(RecyclerView recyclerview, v v1)
    {
        return recyclerview.c(v1);
    }

    private void a(a a1, boolean flag, boolean flag1)
    {
        if (d != null)
        {
            d.b(t);
        }
        if (!flag || flag1)
        {
            if (m != null)
            {
                m.d();
            }
            if (e != null)
            {
                i i1 = e;
                n n1 = a;
                for (int j1 = i1.s() - 1; j1 >= 0; j1--)
                {
                    if (!b(i1.e(j1)).L_())
                    {
                        i1.a(j1, n1);
                    }
                }

                e.a(a);
            }
            a.a();
        }
        b.a();
        a a2 = d;
        d = a1;
        if (a1 != null)
        {
            a1.a(t);
            a1.a(this);
        }
        Object obj = a;
        a1 = d;
        ((n) (obj)).a();
        obj = ((n) (obj)).c();
        if (a2 != null)
        {
            ((m) (obj)).b();
        }
        if (!flag && ((m) (obj)).c == 0)
        {
            ((m) (obj)).a.clear();
        }
        if (a1 != null)
        {
            ((m) (obj)).a();
        }
        o.i = true;
        x();
    }

    private void a(h h1)
    {
        View view = h1.a.a;
        a(h1.a);
        int i1 = h1.b;
        int j1 = h1.c;
        int k1 = view.getLeft();
        int l1 = view.getTop();
        if (!h1.a.o() && (i1 != k1 || j1 != l1))
        {
            h1.a.a(false);
            view.layout(k1, l1, view.getWidth() + k1, view.getHeight() + l1);
            if (m.a(h1.a, i1, j1, k1, l1))
            {
                s();
            }
            return;
        } else
        {
            h1.a.a(false);
            m.a(h1.a);
            s();
            return;
        }
    }

    private void a(v v1)
    {
        View view = v1.a;
        boolean flag;
        if (view.getParent() == this)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.b(a(view));
        if (v1.p())
        {
            c.a(view, -1, view.getLayoutParams(), true);
            return;
        }
        if (!flag)
        {
            c.a(view, -1, true);
            return;
        }
        v1 = c;
        int i1 = ((bE) (v1)).a.a(view);
        if (i1 < 0)
        {
            throw new IllegalArgumentException((new StringBuilder("view is not a child, cannot hide ")).append(view).toString());
        } else
        {
            ((bE) (v1)).b.a(i1);
            ((bE) (v1)).c.add(view);
            return;
        }
    }

    static void a(RecyclerView recyclerview, int i1)
    {
        recyclerview.detachViewFromParent(i1);
    }

    static void a(RecyclerView recyclerview, int i1, int j1)
    {
        recyclerview.b(i1, j1);
    }

    static void a(RecyclerView recyclerview, View view)
    {
        b(view);
        if (recyclerview.g != null)
        {
            for (int i1 = recyclerview.g.size() - 1; i1 >= 0; i1--)
            {
                ((j)recyclerview.g.get(i1)).a();
            }

        }
    }

    static void a(RecyclerView recyclerview, View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        recyclerview.attachViewToParent(view, i1, layoutparams);
    }

    private void a(MotionEvent motionevent)
    {
        int i1 = aP.b(motionevent);
        if (aP.b(motionevent, i1) == L)
        {
            int j1;
            if (i1 == 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            L = aP.b(motionevent, i1);
            j1 = (int)(aP.c(motionevent, i1) + 0.5F);
            P = j1;
            N = j1;
            i1 = (int)(aP.d(motionevent, i1) + 0.5F);
            Q = i1;
            O = i1;
        }
    }

    private void a(av av1)
    {
        List list = o.e;
        int i1 = list.size() - 1;
        while (i1 >= 0) 
        {
            View view = (View)list.get(i1);
            Object obj = b(view);
            Object obj1 = (h)o.b.remove(obj);
            if (!o.j)
            {
                o.c.remove(obj);
            }
            if (av1.remove(view) != null)
            {
                obj1 = e;
                obj = a;
                obj1 = ((i) (obj1)).g;
                int j1 = ((bE) (obj1)).a.a(view);
                if (j1 >= 0)
                {
                    if (((bE) (obj1)).b.c(j1))
                    {
                        ((bE) (obj1)).c.remove(view);
                    }
                    ((bE) (obj1)).a.a(j1);
                }
                ((n) (obj)).a(view);
            } else
            if (obj1 != null)
            {
                a(((h) (obj1)));
            } else
            {
                int k1 = view.getLeft();
                int l1 = view.getTop();
                view.getRight();
                view.getBottom();
                a(new h(((v) (obj)), k1, l1));
            }
            i1--;
        }
        list.clear();
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
        j();
        if (d != null)
        {
            a();
            p();
            au.a("RV Scroll");
            l1 = ((flag4) ? 1 : 0);
            if (i1 != 0)
            {
                k1 = e.a(i1, a, o);
                l1 = i1 - k1;
            }
            i2 = ((flag3) ? 1 : 0);
            j2 = ((flag2) ? 1 : 0);
            if (j1 != 0)
            {
                i2 = e.b(j1, a, o);
                j2 = j1 - i2;
            }
            au.a();
            if (f())
            {
                int l2 = c.a();
                k2 = 0;
                while (k2 < l2) 
                {
                    View view = c.b(k2);
                    Object obj = a(view);
                    if (obj == null || ((v) (obj)).h == null)
                    {
                        continue;
                    }
                    obj = ((v) (obj)).h;
                    int i3;
                    int j3;
                    if (obj != null)
                    {
                        obj = ((v) (obj)).a;
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
            q();
            a(false);
            k2 = k1;
        }
        if (!z.isEmpty())
        {
            invalidate();
        }
        if (dispatchNestedScroll(k2, i2, l1, j2, ah))
        {
            P = P - ah[0];
            Q = Q - ah[1];
            if (motionevent != null)
            {
                motionevent.offsetLocation(ah[0], ah[1]);
            }
            motionevent = aj;
            motionevent[0] = motionevent[0] + ah[0];
            motionevent = aj;
            motionevent[1] = motionevent[1] + ah[1];
        } else
        if (aY.a(this) != 2)
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
                    b();
                    flag = flag1;
                    if (i.a(-f2 / (float)getWidth(), 1.0F - f3 / (float)getHeight()))
                    {
                        flag = true;
                    }
                } else
                {
                    flag = flag1;
                    if (f2 > 0.0F)
                    {
                        c();
                        flag = flag1;
                        if (k.a(f2 / (float)getWidth(), f3 / (float)getHeight()))
                        {
                            flag = true;
                        }
                    }
                }
                if (f4 < 0.0F)
                {
                    d();
                    flag1 = flag;
                    if (j.a(-f4 / (float)getHeight(), f1 / (float)getWidth()))
                    {
                        flag1 = true;
                    }
                } else
                {
                    flag1 = flag;
                    if (f4 > 0.0F)
                    {
                        e();
                        flag1 = flag;
                        if (l.a(f4 / (float)getHeight(), 1.0F - f1 / (float)getWidth()))
                        {
                            flag1 = true;
                        }
                    }
                }
                if (flag1 || f2 != 0.0F || f4 != 0.0F)
                {
                    aY.d(this);
                }
            }
            b(i1, j1);
        }
        if (k2 != 0 || i2 != 0)
        {
            a(k2, i2);
        }
        if (!awakenScrollBars())
        {
            invalidate();
        }
        return k2 != 0 || i2 != 0;
    }

    static boolean a(RecyclerView recyclerview)
    {
        return recyclerview.f;
    }

    private long b(v v1)
    {
        if (d.b)
        {
            return v1.d;
        } else
        {
            return (long)v1.b;
        }
    }

    static v b(View view)
    {
        if (view == null)
        {
            return null;
        } else
        {
            return ((LayoutParams)view.getLayoutParams()).c;
        }
    }

    private void b(int i1, int j1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i != null)
        {
            flag = flag1;
            if (!i.a())
            {
                flag = flag1;
                if (i1 > 0)
                {
                    flag = i.c();
                }
            }
        }
        flag1 = flag;
        if (k != null)
        {
            flag1 = flag;
            if (!k.a())
            {
                flag1 = flag;
                if (i1 < 0)
                {
                    flag1 = flag | k.c();
                }
            }
        }
        flag = flag1;
        if (j != null)
        {
            flag = flag1;
            if (!j.a())
            {
                flag = flag1;
                if (j1 > 0)
                {
                    flag = flag1 | j.c();
                }
            }
        }
        flag1 = flag;
        if (l != null)
        {
            flag1 = flag;
            if (!l.a())
            {
                flag1 = flag;
                if (j1 < 0)
                {
                    flag1 = flag | l.c();
                }
            }
        }
        if (flag1)
        {
            aY.d(this);
        }
    }

    static void b(RecyclerView recyclerview, int i1)
    {
        recyclerview.d(i1);
    }

    static void b(RecyclerView recyclerview, View view)
    {
        recyclerview.f(view);
    }

    static boolean b(RecyclerView recyclerview)
    {
        return recyclerview.h;
    }

    private int c(v v1)
    {
        if (!v1.a(524) && v1.n()) goto _L2; else goto _L1
_L1:
        int i1 = -1;
_L4:
        return i1;
_L2:
        bD bd;
        int j1;
        int l1;
        int i2;
        bd = b;
        j1 = v1.b;
        i2 = bd.a.size();
        l1 = 0;
_L10:
        i1 = j1;
        if (l1 >= i2) goto _L4; else goto _L3
_L3:
        v1 = (bD.b)bd.a.get(l1);
        i1 = j1;
        ((bD.b) (v1)).a;
        JVM INSTR tableswitch 0 3: default 104
    //                   0 119
    //                   1 142
    //                   2 107
    //                   3 181;
           goto _L5 _L6 _L7 _L8 _L9
_L9:
        break MISSING_BLOCK_LABEL_181;
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
        if (((bD.b) (v1)).b <= j1)
        {
            i1 = j1 + ((bD.b) (v1)).c;
        }
          goto _L11
_L7:
        i1 = j1;
        if (((bD.b) (v1)).b <= j1)
        {
            if (((bD.b) (v1)).b + ((bD.b) (v1)).c > j1)
            {
                return -1;
            }
            i1 = j1 - ((bD.b) (v1)).c;
        }
          goto _L11
        if (((bD.b) (v1)).b == j1)
        {
            i1 = ((bD.b) (v1)).c;
        } else
        {
            int k1 = j1;
            if (((bD.b) (v1)).b < j1)
            {
                k1 = j1 - 1;
            }
            i1 = k1;
            if (((bD.b) (v1)).c <= k1)
            {
                i1 = k1 + 1;
            }
        }
          goto _L11
    }

    public static int c(View view)
    {
        view = b(view);
        if (view != null)
        {
            return view.e();
        } else
        {
            return -1;
        }
    }

    private void c(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        switch (l1)
        {
        default:
            i1 = aY.m(this);
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k1)
            {
            default:
                j1 = aY.n(this);
                // fall through

            case -2147483648: 
            case 1073741824: 
                setMeasuredDimension(i1, j1);
                break;
            }
            break;
        }
    }

    static void c(RecyclerView recyclerview, int i1)
    {
        if (recyclerview.e != null)
        {
            recyclerview.e.b(i1);
            recyclerview.awakenScrollBars();
        }
    }

    static boolean c(RecyclerView recyclerview)
    {
        return recyclerview.F;
    }

    static boolean c(RecyclerView recyclerview, View view)
    {
        boolean flag = true;
        recyclerview.a();
        bE be = recyclerview.c;
        int i1 = be.a.a(view);
        if (i1 == -1)
        {
            be.c.remove(view);
        } else
        if (be.b.b(i1))
        {
            be.b.c(i1);
            be.c.remove(view);
            be.a.a(i1);
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
            return view.d();
        } else
        {
            return -1;
        }
    }

    private void d(int i1)
    {
        if (i1 != n) goto _L2; else goto _L1
_L1:
        return;
_L2:
        n = i1;
        if (i1 != 2)
        {
            l();
        }
        if (W != null)
        {
            W.a(this, i1);
        }
        if (aa != null)
        {
            int j1 = aa.size() - 1;
            while (j1 >= 0) 
            {
                ((l)aa.get(j1)).a(this, i1);
                j1--;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    private boolean d(int i1, int j1)
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
            v v1 = b(c.b(k1));
            if (!v1.L_())
            {
                int i2 = v1.d();
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

    static boolean d(RecyclerView recyclerview)
    {
        recyclerview.ac = false;
        return false;
    }

    public static i e(RecyclerView recyclerview)
    {
        return recyclerview.e;
    }

    static void f(RecyclerView recyclerview)
    {
        recyclerview.j();
    }

    private void f(View view)
    {
        view = b(view);
        if (d != null && view != null)
        {
            d.b(view);
        }
        if (g != null)
        {
            for (int i1 = g.size() - 1; i1 >= 0; i1--)
            {
                ((j)g.get(i1)).b();
            }

        }
    }

    static a g(RecyclerView recyclerview)
    {
        return recyclerview.d;
    }

    static Interpolator h()
    {
        return al;
    }

    static void h(RecyclerView recyclerview)
    {
        recyclerview.p();
    }

    static boolean i()
    {
        return r;
    }

    static boolean i(RecyclerView recyclerview)
    {
        return recyclerview.f();
    }

    private void j()
    {
        w.run();
    }

    static void j(RecyclerView recyclerview)
    {
        recyclerview.q();
    }

    static ArrayList k(RecyclerView recyclerview)
    {
        return recyclerview.z;
    }

    private void k()
    {
        d(0);
        l();
    }

    private void l()
    {
        u u1 = V;
        u1.d.removeCallbacks(u1);
        u1.c.h();
        if (e != null)
        {
            e.A();
        }
    }

    static boolean l(RecyclerView recyclerview)
    {
        return recyclerview.awakenScrollBars();
    }

    private void m()
    {
        boolean flag1 = false;
        if (i != null)
        {
            flag1 = i.c();
        }
        boolean flag = flag1;
        if (j != null)
        {
            flag = flag1 | j.c();
        }
        flag1 = flag;
        if (k != null)
        {
            flag1 = flag | k.c();
        }
        flag = flag1;
        if (l != null)
        {
            flag = flag1 | l.c();
        }
        if (flag)
        {
            aY.d(this);
        }
    }

    static void m(RecyclerView recyclerview)
    {
        recyclerview.w();
    }

    private void n()
    {
        l = null;
        j = null;
        k = null;
        i = null;
    }

    static boolean n(RecyclerView recyclerview)
    {
        return recyclerview.I;
    }

    private void o()
    {
        if (M != null)
        {
            M.clear();
        }
        stopNestedScroll();
        m();
        d(0);
    }

    static boolean o(RecyclerView recyclerview)
    {
        return recyclerview.D;
    }

    private void p()
    {
        K = K + 1;
    }

    static boolean p(RecyclerView recyclerview)
    {
        return recyclerview.C;
    }

    static Runnable q(RecyclerView recyclerview)
    {
        return recyclerview.w;
    }

    private void q()
    {
        K = K - 1;
        if (K <= 0)
        {
            K = 0;
            int i1 = G;
            G = 0;
            if (i1 != 0 && J != null && J.isEnabled())
            {
                AccessibilityEvent accessibilityevent = AccessibilityEvent.obtain();
                accessibilityevent.setEventType(2048);
                bj.a(accessibilityevent, i1);
                sendAccessibilityEventUnchecked(accessibilityevent);
            }
        }
    }

    private boolean r()
    {
        return K > 0;
    }

    static boolean r(RecyclerView recyclerview)
    {
        recyclerview.H = true;
        return true;
    }

    static AccessibilityManager s(RecyclerView recyclerview)
    {
        return recyclerview.J;
    }

    private void s()
    {
        if (!ac && C)
        {
            aY.a(this, ak);
            ac = true;
        }
    }

    static bJ t(RecyclerView recyclerview)
    {
        return recyclerview.ad;
    }

    private void t()
    {
        boolean flag;
        boolean flag1;
        boolean flag2 = true;
        if (h)
        {
            b.a();
            x();
            e.b();
        }
        s s1;
        if (m != null && e.g())
        {
            b.b();
        } else
        {
            b.e();
        }
        if (p && !q || p || q && f())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        s1 = o;
        if (f && m != null && (h || flag) && (!h || d.b))
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1.k = flag1;
        s1 = o;
        if (!o.k || !flag || h) goto _L2; else goto _L1
_L1:
        if (m != null && e.g())
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
        s1.l = flag1;
        return;
_L2:
        flag1 = false;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static o u(RecyclerView recyclerview)
    {
        return recyclerview.y;
    }

    private void u()
    {
        boolean flag = false;
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((LayoutParams)c.c(i1).getLayoutParams()).e = true;
        }

        n n1 = a;
        k1 = n1.c.size();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            LayoutParams layoutparams = (LayoutParams)((v)n1.c.get(j1)).a.getLayoutParams();
            if (layoutparams != null)
            {
                layoutparams.e = true;
            }
        }

    }

    private void v()
    {
        boolean flag = false;
        int i2 = c.b();
        for (int i1 = 0; i1 < i2; i1++)
        {
            v v1 = b(c.c(i1));
            if (!v1.L_())
            {
                v1.a();
            }
        }

        n n1 = a;
        i2 = n1.c.size();
        for (int j1 = 0; j1 < i2; j1++)
        {
            ((v)n1.c.get(j1)).a();
        }

        i2 = n1.a.size();
        for (int k1 = 0; k1 < i2; k1++)
        {
            ((v)n1.a.get(k1)).a();
        }

        if (n1.b != null)
        {
            int j2 = n1.b.size();
            for (int l1 = ((flag) ? 1 : 0); l1 < j2; l1++)
            {
                ((v)n1.b.get(l1)).a();
            }

        }
    }

    static boolean v(RecyclerView recyclerview)
    {
        return recyclerview.v;
    }

    static u w(RecyclerView recyclerview)
    {
        return recyclerview.V;
    }

    private void w()
    {
        if (!h)
        {
            h = true;
            int k1 = c.b();
            for (int i1 = 0; i1 < k1; i1++)
            {
                v v1 = b(c.c(i1));
                if (v1 != null && !v1.L_())
                {
                    v1.b(512);
                }
            }

            n n1 = a;
            k1 = n1.c.size();
            int j1 = 0;
            while (j1 < k1) 
            {
                v v2 = (v)n1.c.get(j1);
                if (v2 != null)
                {
                    v2.b(512);
                }
                j1++;
            }
        }
    }

    private void x()
    {
        int k1 = c.b();
        for (int i1 = 0; i1 < k1; i1++)
        {
            v v1 = b(c.c(i1));
            if (v1 != null && !v1.L_())
            {
                v1.b(6);
            }
        }

        u();
        n n1 = a;
        if (n1.h.d != null && n1.h.d.b)
        {
            int l1 = n1.c.size();
            for (int j1 = 0; j1 < l1; j1++)
            {
                v v2 = (v)n1.c.get(j1);
                if (v2 != null)
                {
                    v2.b(6);
                }
            }

        } else
        {
            n1.b();
        }
    }

    public final v a(int i1, boolean flag)
    {
        int k1 = c.b();
        for (int j1 = 0; j1 < k1; j1++)
        {
            v v1 = b(c.c(j1));
            if (v1 != null && !v1.o() && (flag ? v1.b == i1 : v1.d() == i1))
            {
                return v1;
            }
        }

        return null;
    }

    public final v a(View view)
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

    final void a()
    {
        if (!E)
        {
            E = true;
            F = false;
        }
    }

    public final void a(int i1)
    {
        k();
        if (e == null)
        {
            return;
        } else
        {
            e.b(i1);
            awakenScrollBars();
            return;
        }
    }

    final void a(int i1, int j1)
    {
        int k1 = getScrollX();
        int i2 = getScrollY();
        onScrollChanged(k1, i2, k1, i2);
        if (W != null)
        {
            W.a(this, i1, j1);
        }
        if (aa != null)
        {
            for (int l1 = aa.size() - 1; l1 >= 0; l1--)
            {
                ((l)aa.get(l1)).a(this, i1, j1);
            }

        }
    }

    final void a(int i1, int j1, boolean flag)
    {
        int l1 = c.b();
        int k1 = 0;
        while (k1 < l1) 
        {
            v v1 = b(c.c(k1));
            if (v1 != null && !v1.L_())
            {
                if (v1.b >= i1 + j1)
                {
                    v1.a(-j1, flag);
                    o.i = true;
                } else
                if (v1.b >= i1)
                {
                    int i2 = -j1;
                    v1.b(8);
                    v1.a(i2, flag);
                    v1.b = i1 - 1;
                    o.i = true;
                }
            }
            k1++;
        }
        n n1 = a;
        k1 = n1.c.size() - 1;
        while (k1 >= 0) 
        {
            v v2 = (v)n1.c.get(k1);
            if (v2 != null)
            {
                if (v2.d() >= i1 + j1)
                {
                    v2.a(-j1, flag);
                } else
                if (v2.d() >= i1)
                {
                    v2.b(8);
                    n1.c(k1);
                }
            }
            k1--;
        }
        requestLayout();
    }

    public final void a(a a1)
    {
        a(a1, true, false);
        w();
        requestLayout();
    }

    public final void a(g g1)
    {
        if (e != null)
        {
            e.a("Cannot add item decoration during a scroll  or layout");
        }
        if (z.isEmpty())
        {
            setWillNotDraw(false);
        }
        z.add(g1);
        u();
        requestLayout();
    }

    public final void a(k k1)
    {
        A.add(k1);
    }

    public final void a(l l1)
    {
        if (aa == null)
        {
            aa = new ArrayList();
        }
        aa.add(l1);
    }

    final void a(String s1)
    {
        if (r())
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
        if (E)
        {
            if (flag && F && e != null && d != null)
            {
                g();
            }
            E = false;
            F = false;
        }
    }

    public void addFocusables(ArrayList arraylist, int i1, int j1)
    {
        super.addFocusables(arraylist, i1, j1);
    }

    final void b()
    {
        if (i != null)
        {
            return;
        }
        i = new bx(getContext());
        if (v)
        {
            i.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            i.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    public final void b(int i1)
    {
        if (e == null)
        {
            return;
        } else
        {
            e.a(this, i1);
            return;
        }
    }

    public final void b(l l1)
    {
        if (aa != null)
        {
            aa.remove(l1);
        }
    }

    public final v c(int i1)
    {
        if (!h)
        {
            int k1 = c.b();
            int j1 = 0;
            while (j1 < k1) 
            {
                v v1 = b(c.c(j1));
                if (v1 != null && !v1.o() && c(v1) == i1)
                {
                    return v1;
                }
                j1++;
            }
        }
        return null;
    }

    final void c()
    {
        if (k != null)
        {
            return;
        }
        k = new bx(getContext());
        if (v)
        {
            k.a(getMeasuredHeight() - getPaddingTop() - getPaddingBottom(), getMeasuredWidth() - getPaddingLeft() - getPaddingRight());
            return;
        } else
        {
            k.a(getMeasuredHeight(), getMeasuredWidth());
            return;
        }
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return (layoutparams instanceof LayoutParams) && e.a((LayoutParams)layoutparams);
    }

    public int computeHorizontalScrollExtent()
    {
        if (e.i())
        {
            return e.c(o);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollOffset()
    {
        if (e.i())
        {
            return e.a(o);
        } else
        {
            return 0;
        }
    }

    public int computeHorizontalScrollRange()
    {
        if (e.i())
        {
            return e.e(o);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollExtent()
    {
        if (e.j())
        {
            return e.d(o);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollOffset()
    {
        if (e.j())
        {
            return e.b(o);
        } else
        {
            return 0;
        }
    }

    public int computeVerticalScrollRange()
    {
        if (e.j())
        {
            return e.f(o);
        } else
        {
            return 0;
        }
    }

    final void d()
    {
        if (j != null)
        {
            return;
        }
        j = new bx(getContext());
        if (v)
        {
            j.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            j.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    public boolean dispatchNestedFling(float f1, float f2, boolean flag)
    {
        return ag.a(f1, f2, flag);
    }

    public boolean dispatchNestedPreFling(float f1, float f2)
    {
        return ag.a(f1, f2);
    }

    public boolean dispatchNestedPreScroll(int i1, int j1, int ai1[], int ai2[])
    {
        return ag.a(i1, j1, ai1, ai2);
    }

    public boolean dispatchNestedScroll(int i1, int j1, int k1, int l1, int ai1[])
    {
        return ag.a(i1, j1, k1, l1, ai1);
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
        int k1 = z.size();
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((g)z.get(i1)).a(canvas, this, o);
        }

        int j1;
        if (i != null && !i.a())
        {
            int l1 = canvas.save();
            int i2;
            if (v)
            {
                j1 = getPaddingBottom();
            } else
            {
                j1 = 0;
            }
            canvas.rotate(270F);
            canvas.translate(j1 + -getHeight(), 0.0F);
            if (i != null && i.a(canvas))
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
        if (j != null)
        {
            j1 = k1;
            if (!j.a())
            {
                l1 = canvas.save();
                if (v)
                {
                    canvas.translate(getPaddingLeft(), getPaddingTop());
                }
                if (j != null && j.a(canvas))
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
        if (k != null)
        {
            k1 = j1;
            if (!k.a())
            {
                l1 = canvas.save();
                i2 = getWidth();
                if (v)
                {
                    k1 = getPaddingTop();
                } else
                {
                    k1 = 0;
                }
                canvas.rotate(90F);
                canvas.translate(-k1, -i2);
                if (k != null && k.a(canvas))
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
        if (l != null)
        {
            j1 = k1;
            if (!l.a())
            {
                l1 = canvas.save();
                canvas.rotate(180F);
                if (v)
                {
                    canvas.translate(-getWidth() + getPaddingRight(), -getHeight() + getPaddingBottom());
                } else
                {
                    canvas.translate(-getWidth(), -getHeight());
                }
                j1 = ((flag1) ? 1 : 0);
                if (l != null)
                {
                    j1 = ((flag1) ? 1 : 0);
                    if (l.a(canvas))
                    {
                        j1 = 1;
                    }
                }
                j1 = k1 | j1;
                canvas.restoreToCount(l1);
            }
        }
        if (j1 == 0 && m != null && z.size() > 0 && m.b())
        {
            j1 = ((flag) ? 1 : 0);
        }
        if (j1 != 0)
        {
            aY.d(this);
        }
    }

    public boolean drawChild(Canvas canvas, View view, long l1)
    {
        return super.drawChild(canvas, view, l1);
    }

    final Rect e(View view)
    {
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (!layoutparams.e)
        {
            return layoutparams.d;
        }
        Rect rect = layoutparams.d;
        rect.set(0, 0, 0, 0);
        int j1 = z.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            x.set(0, 0, 0, 0);
            ((g)z.get(i1)).a(x, view, this, o);
            rect.left = rect.left + x.left;
            rect.top = rect.top + x.top;
            rect.right = rect.right + x.right;
            rect.bottom = rect.bottom + x.bottom;
        }

        layoutparams.e = false;
        return rect;
    }

    final void e()
    {
        if (l != null)
        {
            return;
        }
        l = new bx(getContext());
        if (v)
        {
            l.a(getMeasuredWidth() - getPaddingLeft() - getPaddingRight(), getMeasuredHeight() - getPaddingTop() - getPaddingBottom());
            return;
        } else
        {
            l.a(getMeasuredWidth(), getMeasuredHeight());
            return;
        }
    }

    final boolean f()
    {
        return m != null && m.m;
    }

    public View focusSearch(View view, int i1)
    {
        View view2 = FocusFinder.getInstance().findNextFocus(this, view, i1);
        View view1 = view2;
        if (view2 == null)
        {
            view1 = view2;
            if (d != null)
            {
                view1 = view2;
                if (e != null)
                {
                    view1 = view2;
                    if (!r())
                    {
                        a();
                        view1 = e.c(i1, a, o);
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

    final void g()
    {
_L2:
        return;
        if (d == null || e == null) goto _L2; else goto _L1
_L1:
        Object obj;
        int l3;
        o.e.clear();
        a();
        p();
        t();
        Object obj2 = o;
        av av1;
        int i1;
        int k1;
        int i2;
        int k2;
        if (o.k && q && f())
        {
            obj = new av();
        } else
        {
            obj = null;
        }
        obj2.d = ((av) (obj));
        q = false;
        p = false;
        o.j = o.l;
        o.f = d.b();
        obj = af;
        l3 = c.a();
        if (l3 != 0) goto _L4; else goto _L3
_L3:
        obj[0] = 0;
        obj[1] = 0;
_L8:
        if (o.k)
        {
            o.b.clear();
            o.c.clear();
            k1 = c.a();
            for (i1 = 0; i1 < k1; i1++)
            {
                obj = b(c.b(i1));
                if (!((v) (obj)).L_() && (!((v) (obj)).k() || d.b))
                {
                    obj2 = ((v) (obj)).a;
                    av1 = o.b;
                    i2 = ((View) (obj2)).getLeft();
                    k2 = ((View) (obj2)).getTop();
                    ((View) (obj2)).getRight();
                    ((View) (obj2)).getBottom();
                    av1.put(obj, new h(((v) (obj)), i2, k2));
                }
            }

        }
          goto _L5
_L4:
        int j1;
        int j2;
        int i3;
        j1 = 0x7fffffff;
        j2 = 0x80000000;
        i3 = 0;
_L7:
        int l1;
        int l2;
        if (i3 >= l3)
        {
            break; /* Loop/switch isn't completed */
        }
        v v1 = b(c.b(i3));
        l2 = j1;
        if (v1.L_())
        {
            break MISSING_BLOCK_LABEL_2028;
        }
        int k3 = v1.d();
        l1 = j1;
        if (k3 < j1)
        {
            l1 = k3;
        }
        l2 = l1;
        if (k3 <= j2)
        {
            break MISSING_BLOCK_LABEL_2028;
        }
        j1 = k3;
_L21:
        i3++;
        j2 = j1;
        j1 = l1;
        if (true) goto _L7; else goto _L6
_L6:
        obj[0] = j1;
        obj[1] = j2;
          goto _L8
_L5:
        if (!o.l) goto _L10; else goto _L9
_L9:
        Object obj3;
        l1 = c.b();
        for (j1 = 0; j1 < l1; j1++)
        {
            obj = b(c.c(j1));
            if (!((v) (obj)).L_() && ((v) (obj)).c == -1)
            {
                obj.c = ((v) (obj)).b;
            }
        }

        if (o.d != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj = b(c.b(j1));
                if (((v) (obj)).m() && !((v) (obj)).o() && !((v) (obj)).L_())
                {
                    long l4 = b(((v) (obj)));
                    o.d.put(Long.valueOf(l4), obj);
                    o.b.remove(obj);
                }
            }

        }
        boolean flag = o.i;
        o.i = false;
        e.c(a, o);
        o.i = flag;
        obj3 = new av();
        j1 = 0;
_L17:
        if (j1 >= c.a()) goto _L12; else goto _L11
_L11:
        obj = c.b(j1);
        if (b(((View) (obj))).L_()) goto _L14; else goto _L13
_L13:
        l1 = 0;
_L18:
        if (l1 >= o.b.size())
        {
            break MISSING_BLOCK_LABEL_2022;
        }
        if (((v)o.b.b(l1)).a != obj) goto _L16; else goto _L15
_L15:
        l1 = 1;
_L20:
        if (l1 == 0)
        {
            ((av) (obj3)).put(obj, new Rect(((View) (obj)).getLeft(), ((View) (obj)).getTop(), ((View) (obj)).getRight(), ((View) (obj)).getBottom()));
        }
_L14:
        j1++;
          goto _L17
_L16:
        l1++;
          goto _L18
_L12:
        v();
        b.c();
_L19:
        o.f = d.b();
        o.h = 0;
        o.j = false;
        e.c(a, o);
        o.i = false;
        u = null;
        s s1 = o;
        boolean flag1;
        if (o.k && m != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        s1.k = flag1;
        if (o.k)
        {
            Object obj1;
            if (o.d != null)
            {
                obj1 = new av();
            } else
            {
                obj1 = null;
            }
            l1 = c.a();
            j1 = 0;
            while (j1 < l1) 
            {
                v v2 = b(c.b(j1));
                if (!v2.L_())
                {
                    View view = v2.a;
                    long l5 = b(v2);
                    if (obj1 != null && o.d.get(Long.valueOf(l5)) != null)
                    {
                        ((av) (obj1)).put(Long.valueOf(l5), v2);
                    } else
                    {
                        av av2 = o.c;
                        j2 = view.getLeft();
                        l2 = view.getTop();
                        view.getRight();
                        view.getBottom();
                        av2.put(v2, new h(v2, j2, l2));
                    }
                }
                j1++;
            }
            a(((av) (obj3)));
            for (j1 = o.b.size() - 1; j1 >= 0; j1--)
            {
                v v3 = (v)o.b.b(j1);
                if (!o.c.containsKey(v3))
                {
                    h h1 = (h)o.b.c(j1);
                    o.b.d(j1);
                    a.b(h1.a);
                    a(h1);
                }
            }

            j1 = o.c.size();
            if (j1 > 0)
            {
                j1--;
                while (j1 >= 0) 
                {
                    v v5 = (v)o.c.b(j1);
                    h h4 = (h)o.c.c(j1);
                    if (o.b.isEmpty() || !o.b.containsKey(v5))
                    {
                        o.c.d(j1);
                        Rect rect;
                        if (obj3 != null)
                        {
                            rect = (Rect)((av) (obj3)).get(v5.a);
                        } else
                        {
                            rect = null;
                        }
                        l1 = h4.b;
                        j2 = h4.c;
                        if (rect != null && (rect.left != l1 || rect.top != j2))
                        {
                            v5.a(false);
                            if (m.a(v5, rect.left, rect.top, l1, j2))
                            {
                                s();
                            }
                        } else
                        {
                            v5.a(false);
                            m.b(v5);
                            s();
                        }
                    }
                    j1--;
                }
            }
            l1 = o.c.size();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj3 = (v)o.c.b(j1);
                h h2 = (h)o.c.c(j1);
                h h3 = (h)o.b.get(obj3);
                if (h3 == null || h2 == null || h3.b == h2.b && h3.c == h2.c)
                {
                    continue;
                }
                ((v) (obj3)).a(false);
                if (m.a(((v) (obj3)), h3.b, h3.c, h2.b, h2.c))
                {
                    s();
                }
            }

            if (o.d != null)
            {
                j1 = o.d.size();
            } else
            {
                j1 = 0;
            }
            j1--;
            while (j1 >= 0) 
            {
                long l6 = ((Long)o.d.b(j1)).longValue();
                obj3 = (v)o.d.get(Long.valueOf(l6));
                if (!((v) (obj3)).L_() && a.b != null && a.b.contains(obj3))
                {
                    v v4 = (v)((av) (obj1)).get(Long.valueOf(l6));
                    ((v) (obj3)).a(false);
                    a(((v) (obj3)));
                    obj3.g = v4;
                    a.b(((v) (obj3)));
                    l2 = ((v) (obj3)).a.getLeft();
                    int j3 = ((v) (obj3)).a.getTop();
                    if (v4 == null || v4.L_())
                    {
                        j2 = j3;
                        l1 = l2;
                    } else
                    {
                        l1 = v4.a.getLeft();
                        j2 = v4.a.getTop();
                        v4.a(false);
                        v4.h = ((v) (obj3));
                    }
                    m.a(((v) (obj3)), v4, l2, j3, l1, j2);
                    s();
                }
                j1--;
            }
        }
        a(false);
        e.a(a);
        o.g = o.f;
        h = false;
        o.k = false;
        o.l = false;
        q();
        if (a.b != null)
        {
            a.b.clear();
        }
        o.d = null;
        if (d(af[0], af[1]))
        {
            a(0, 0);
            return;
        }
          goto _L2
_L10:
        v();
        b.e();
        if (o.d != null)
        {
            l1 = c.a();
            for (j1 = 0; j1 < l1; j1++)
            {
                obj1 = b(c.b(j1));
                if (((v) (obj1)).m() && !((v) (obj1)).o() && !((v) (obj1)).L_())
                {
                    l5 = b(((v) (obj1)));
                    o.d.put(Long.valueOf(l5), obj1);
                    o.b.remove(obj1);
                }
            }

        }
        obj3 = null;
          goto _L19
        l1 = 0;
          goto _L20
        j1 = j2;
        l1 = l2;
          goto _L21
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        if (e == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return e.f();
        }
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        if (e == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return e.a(getContext(), attributeset);
        }
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (e == null)
        {
            throw new IllegalStateException("RecyclerView has no LayoutManager");
        } else
        {
            return e.a(layoutparams);
        }
    }

    public int getBaseline()
    {
        if (e != null)
        {
            return -1;
        } else
        {
            return super.getBaseline();
        }
    }

    protected int getChildDrawingOrder(int i1, int j1)
    {
        if (ae == null)
        {
            return super.getChildDrawingOrder(i1, j1);
        } else
        {
            return ae.a();
        }
    }

    public boolean hasNestedScrollingParent()
    {
        return ag.a();
    }

    public boolean isAttachedToWindow()
    {
        return C;
    }

    public boolean isNestedScrollingEnabled()
    {
        return ag.a;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        K = 0;
        C = true;
        f = false;
        ac = false;
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (m != null)
        {
            m.d();
        }
        f = false;
        k();
        C = false;
        removeCallbacks(ak);
    }

    public void onDraw(Canvas canvas)
    {
        super.onDraw(canvas);
        int j1 = z.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            z.get(i1);
        }

    }

    public boolean onGenericMotionEvent(MotionEvent motionevent)
    {
        float f3;
        f3 = 0.0F;
        break MISSING_BLOCK_LABEL_3;
        if (e != null && (aP.d(motionevent) & 2) != 0 && motionevent.getAction() == 8)
        {
            float f1;
            float f2;
            if (e.j())
            {
                f1 = -aP.e(motionevent, 9);
            } else
            {
                f1 = 0.0F;
            }
            if (e.i())
            {
                f2 = aP.e(motionevent, 10);
            } else
            {
                f2 = 0.0F;
            }
            if (f1 != 0.0F || f2 != 0.0F)
            {
label0:
                {
                    if (U == 1.401298E-45F)
                    {
                        TypedValue typedvalue = new TypedValue();
                        if (!getContext().getTheme().resolveAttribute(0x101004d, typedvalue, true))
                        {
                            break label0;
                        }
                        U = typedvalue.getDimension(getContext().getResources().getDisplayMetrics());
                    }
                    f3 = U;
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
        int j1;
        byte byte0;
        int i2;
        byte0 = -1;
        j1 = motionevent.getAction();
        if (j1 == 3 || j1 == 0)
        {
            B = null;
        }
        i2 = A.size();
        i1 = 0;
_L7:
        if (i1 >= i2) goto _L2; else goto _L1
_L1:
        k k1 = (k)A.get(i1);
        if (!k1.a(motionevent) || j1 == 3) goto _L4; else goto _L3
_L3:
        B = k1;
        i1 = 1;
_L8:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        o();
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
        if (e == null)
        {
            return false;
        }
        flag = e.i();
        flag1 = e.j();
        if (M == null)
        {
            M = VelocityTracker.obtain();
        }
        M.addMovement(motionevent);
        j1 = aP.a(motionevent);
        i1 = aP.b(motionevent);
        j1;
        JVM INSTR tableswitch 0 6: default 204
    //                   0 214
    //                   1 598
    //                   2 373
    //                   3 612
    //                   4 204
    //                   5 316
    //                   6 590;
           goto _L9 _L10 _L11 _L12 _L13 _L9 _L14 _L15
_L9:
        break; /* Loop/switch isn't completed */
_L13:
        break MISSING_BLOCK_LABEL_612;
_L17:
        if (n != 1)
        {
            return false;
        }
          goto _L16
_L10:
        L = aP.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        P = i1;
        N = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        Q = i1;
        O = i1;
        if (n == 2)
        {
            getParent().requestDisallowInterceptTouchEvent(true);
            d(1);
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
        L = aP.b(motionevent, i1);
        l1 = (int)(aP.c(motionevent, i1) + 0.5F);
        P = l1;
        N = l1;
        i1 = (int)(aP.d(motionevent, i1) + 0.5F);
        Q = i1;
        O = i1;
          goto _L17
_L12:
        l1 = aP.a(motionevent, L);
        if (l1 < 0)
        {
            (new StringBuilder("Error processing scroll; pointer index for id ")).append(L).append(" not found. Did any MotionEvents get skipped?");
            return false;
        }
        i1 = (int)(aP.c(motionevent, l1) + 0.5F);
        l1 = (int)(aP.d(motionevent, l1) + 0.5F);
        if (n != 1)
        {
            i1 -= N;
            j2 = l1 - O;
            if (flag && Math.abs(i1) > R)
            {
                l1 = N;
                k2 = R;
                if (i1 < 0)
                {
                    i1 = -1;
                } else
                {
                    i1 = 1;
                }
                P = i1 * k2 + l1;
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            l1 = i1;
            if (flag1)
            {
                l1 = i1;
                if (Math.abs(j2) > R)
                {
                    l1 = O;
                    k2 = R;
                    if (j2 < 0)
                    {
                        i1 = byte0;
                    } else
                    {
                        i1 = 1;
                    }
                    Q = l1 + i1 * k2;
                    l1 = 1;
                }
            }
            if (l1 != 0)
            {
                d(1);
            }
        }
          goto _L17
_L15:
        a(motionevent);
          goto _L17
_L11:
        M.clear();
        stopNestedScroll();
          goto _L17
        o();
          goto _L17
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        a();
        au.a("RV OnLayout");
        g();
        au.a();
        a(false);
        f = true;
    }

    public void onMeasure(int i1, int j1)
    {
        if (H)
        {
            a();
            t();
            if (o.l)
            {
                o.j = true;
            } else
            {
                b.e();
                o.j = false;
            }
            H = false;
            a(false);
        }
        if (d != null)
        {
            o.f = d.b();
        } else
        {
            o.f = 0;
        }
        if (e == null)
        {
            c(i1, j1);
        } else
        {
            e.h.c(i1, j1);
        }
        o.j = false;
    }

    protected void onRestoreInstanceState(Parcelable parcelable)
    {
        u = (SavedState)parcelable;
        super.onRestoreInstanceState(u.getSuperState());
        if (e != null && u.a != null)
        {
            e.a(u.a);
        }
    }

    protected Parcelable onSaveInstanceState()
    {
        SavedState savedstate = new SavedState(super.onSaveInstanceState());
        if (u != null)
        {
            SavedState.a(savedstate, u);
            return savedstate;
        }
        if (e != null)
        {
            savedstate.a = e.h();
            return savedstate;
        } else
        {
            savedstate.a = null;
            return savedstate;
        }
    }

    public void onSizeChanged(int i1, int j1, int k1, int l1)
    {
        super.onSizeChanged(i1, j1, k1, l1);
        if (i1 != k1 || j1 != l1)
        {
            n();
        }
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        int i1 = motionevent.getAction();
        if (B == null) goto _L2; else goto _L1
_L1:
        if (i1 != 0) goto _L4; else goto _L3
_L3:
        B = null;
_L2:
        if (i1 == 0) goto _L6; else goto _L5
_L5:
        int j1;
        j1 = A.size();
        i1 = 0;
_L29:
        if (i1 >= j1) goto _L6; else goto _L7
_L7:
        Object obj = (k)A.get(i1);
        if (!((k) (obj)).a(motionevent)) goto _L9; else goto _L8
_L8:
        B = ((k) (obj));
        i1 = 1;
_L11:
        if (i1 != 0)
        {
            o();
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        if (i1 == 3 || i1 == 1)
        {
            B = null;
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
        if (e == null)
        {
            return false;
        }
        flag = e.i();
        flag1 = e.j();
        if (M == null)
        {
            M = VelocityTracker.obtain();
        }
        M.addMovement(motionevent);
        obj = MotionEvent.obtain(motionevent);
        j1 = aP.a(motionevent);
        i1 = aP.b(motionevent);
        if (j1 == 0)
        {
            int ai1[] = aj;
            aj[1] = 0;
            ai1[0] = 0;
        }
        ((MotionEvent) (obj)).offsetLocation(aj[0], aj[1]);
        j1;
        JVM INSTR tableswitch 0 6: default 284
    //                   0 291
    //                   1 871
    //                   2 442
    //                   3 1200
    //                   4 284
    //                   5 379
    //                   6 863;
           goto _L12 _L13 _L14 _L15 _L16 _L12 _L17 _L18
_L12:
        ((MotionEvent) (obj)).recycle();
        return true;
_L13:
        L = aP.b(motionevent, 0);
        i1 = (int)(motionevent.getX() + 0.5F);
        P = i1;
        N = i1;
        i1 = (int)(motionevent.getY() + 0.5F);
        Q = i1;
        O = i1;
        float f1;
        float f2;
        bA ba;
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
        L = aP.b(motionevent, i1);
        k1 = (int)(aP.c(motionevent, i1) + 0.5F);
        P = k1;
        N = k1;
        i1 = (int)(aP.d(motionevent, i1) + 0.5F);
        Q = i1;
        O = i1;
        continue; /* Loop/switch isn't completed */
_L15:
        i1 = aP.a(motionevent, L);
        if (i1 < 0)
        {
            (new StringBuilder("Error processing scroll; pointer index for id ")).append(L).append(" not found. Did any MotionEvents get skipped?");
            return false;
        }
        l2 = (int)(aP.c(motionevent, i1) + 0.5F);
        i3 = (int)(aP.d(motionevent, i1) + 0.5F);
        i2 = P - l2;
        l1 = Q - i3;
        i1 = l1;
        k1 = i2;
        if (dispatchNestedPreScroll(i2, l1, ai, ah))
        {
            k1 = i2 - ai[0];
            i1 = l1 - ai[1];
            ((MotionEvent) (obj)).offsetLocation(ah[0], ah[1]);
            motionevent = aj;
            motionevent[0] = motionevent[0] + ah[0];
            motionevent = aj;
            motionevent[1] = motionevent[1] + ah[1];
        }
        l1 = i1;
        j2 = k1;
        if (n != 1)
        {
            if (flag && Math.abs(k1) > R)
            {
                if (k1 > 0)
                {
                    k1 -= R;
                } else
                {
                    k1 += R;
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
                if (Math.abs(i1) > R)
                {
                    if (i1 > 0)
                    {
                        i2 = i1 - R;
                    } else
                    {
                        i2 = i1 + R;
                    }
                    k2 = 1;
                }
            }
            l1 = i2;
            j2 = k1;
            if (k2 != 0)
            {
                d(1);
                j2 = k1;
                l1 = i2;
            }
        }
        if (n == 1)
        {
            P = l2 - ah[0];
            Q = i3 - ah[1];
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
        M.computeCurrentVelocity(1000, T);
        if (flag)
        {
            f1 = -aX.a(M, L);
        } else
        {
            f1 = 0.0F;
        }
        if (flag1)
        {
            f2 = -aX.b(M, L);
        } else
        {
            f2 = 0.0F;
        }
        if (f1 == 0.0F && f2 == 0.0F) goto _L20; else goto _L19
_L19:
        i1 = (int)f1;
        k1 = (int)f2;
        if (e == null) goto _L22; else goto _L21
_L21:
        flag = e.i();
        flag1 = e.j();
        if (!flag || Math.abs(i1) < S)
        {
            i1 = 0;
        }
        if (!flag1 || Math.abs(k1) < S)
        {
            k1 = 0;
        }
        if (i1 == 0 && k1 == 0 || dispatchNestedPreFling(i1, k1)) goto _L22; else goto _L23
_L23:
        if (flag || flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        dispatchNestedFling(i1, k1, flag);
        if (!flag) goto _L22; else goto _L24
_L24:
        i1 = Math.max(-T, Math.min(i1, T));
        k1 = Math.max(-T, Math.min(k1, T));
        motionevent = V;
        b(((u) (motionevent)).d, 2);
        motionevent.b = 0;
        motionevent.a = 0;
        ba = ((u) (motionevent)).c;
        ba.b.a(ba.a, i1, k1);
        motionevent.a();
        i1 = 1;
_L26:
        if (i1 != 0) goto _L25; else goto _L20
_L20:
        d(0);
_L25:
        M.clear();
        m();
        continue; /* Loop/switch isn't completed */
_L22:
        i1 = 0;
        if (true) goto _L26; else goto _L16
_L16:
        o();
        if (true) goto _L12; else goto _L27
_L27:
        if (true) goto _L29; else goto _L28
_L28:
    }

    protected void removeDetachedView(View view, boolean flag)
    {
        v v1 = b(view);
        if (v1 != null)
        {
            if (v1.p())
            {
                v1.j();
            } else
            if (!v1.L_())
            {
                throw new IllegalArgumentException((new StringBuilder("Called removeDetachedView with a view which is not flagged as tmp detached.")).append(v1).toString());
            }
        }
        f(view);
        super.removeDetachedView(view, flag);
    }

    public void requestChildFocus(View view, View view1)
    {
        i i1 = e;
        int j1;
        if (i1.i != null && i1.i.e)
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 != 0 || r())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0 && view1 != null)
        {
            x.set(0, 0, view1.getWidth(), view1.getHeight());
            Object obj = view1.getLayoutParams();
            if (obj instanceof LayoutParams)
            {
                obj = (LayoutParams)obj;
                if (!((LayoutParams) (obj)).e)
                {
                    obj = ((LayoutParams) (obj)).d;
                    Rect rect = x;
                    rect.left = rect.left - ((Rect) (obj)).left;
                    rect = x;
                    rect.right = rect.right + ((Rect) (obj)).right;
                    rect = x;
                    rect.top = rect.top - ((Rect) (obj)).top;
                    rect = x;
                    j1 = rect.bottom;
                    rect.bottom = ((Rect) (obj)).bottom + j1;
                }
            }
            offsetDescendantRectToMyCoords(view1, x);
            offsetRectIntoDescendantCoords(view, x);
            obj = x;
            boolean flag;
            if (!f)
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
        i i1 = e;
        int l2 = i1.v();
        int i2 = i1.w();
        int i3 = i1.t() - i1.x();
        int k2 = i1.u();
        int l3 = i1.y();
        int j3 = view.getLeft() + rect.left;
        int j2 = view.getTop() + rect.top;
        int k3 = j3 + rect.width();
        int i4 = rect.height();
        int j1 = Math.min(0, j3 - l2);
        int k1 = Math.min(0, j2 - i2);
        int l1 = Math.max(0, k3 - i3);
        k2 = Math.max(0, (j2 + i4) - (k2 - l3));
        if (aY.h(i1.h) == 1)
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
            if (e != null)
            {
                if (!e.i())
                {
                    j1 = 0;
                }
                if (!e.j())
                {
                    k1 = 0;
                }
                if (j1 != 0 || k1 != 0)
                {
                    V.a(j1, k1);
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
        int j1 = A.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            A.get(i1);
        }

        super.requestDisallowInterceptTouchEvent(flag);
    }

    public void requestLayout()
    {
        if (!E)
        {
            super.requestLayout();
            return;
        } else
        {
            F = true;
            return;
        }
    }

    public void scrollBy(int i1, int j1)
    {
        if (e != null)
        {
            boolean flag = e.i();
            boolean flag1 = e.j();
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
        if (r())
        {
            if (accessibilityevent != null)
            {
                i1 = bj.b(accessibilityevent);
            } else
            {
                i1 = 0;
            }
            if (i1 == 0)
            {
                i1 = ((flag) ? 1 : 0);
            }
            G = i1 | G;
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

    public void setAccessibilityDelegateCompat(bJ bj1)
    {
        ad = bj1;
        aY.a(this, ad);
    }

    public void setAdapter(a a1)
    {
        a(a1, false, true);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(d d1)
    {
        if (d1 == ae)
        {
            return;
        }
        ae = d1;
        boolean flag;
        if (ae != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        setChildrenDrawingOrderEnabled(flag);
    }

    public void setClipToPadding(boolean flag)
    {
        if (flag != v)
        {
            n();
        }
        v = flag;
        super.setClipToPadding(flag);
        if (f)
        {
            requestLayout();
        }
    }

    public void setHasFixedSize(boolean flag)
    {
        D = flag;
    }

    public void setItemAnimator(e e1)
    {
        if (m != null)
        {
            m.d();
            m.h = null;
        }
        m = e1;
        if (m != null)
        {
            m.h = ab;
        }
    }

    public void setItemViewCacheSize(int i1)
    {
        n n1 = a;
        n1.e = i1;
        for (int j1 = n1.c.size() - 1; j1 >= 0 && n1.c.size() > i1; j1--)
        {
            n1.c(j1);
        }

    }

    public void setLayoutManager(i i1)
    {
        if (i1 == e)
        {
            return;
        }
        if (e != null)
        {
            e.a(null);
        }
        a.a();
        bE be = c;
        bE.a a1 = be.b;
        do
        {
            a1.a = 0L;
            if (a1.b == null)
            {
                break;
            }
            a1 = a1.b;
        } while (true);
        be.c.clear();
        be.a.b();
        e = i1;
        if (i1 != null)
        {
            if (i1.h != null)
            {
                throw new IllegalArgumentException((new StringBuilder("LayoutManager ")).append(i1).append(" is already attached to a RecyclerView: ").append(i1.h).toString());
            }
            e.a(this);
        }
        requestLayout();
    }

    public void setNestedScrollingEnabled(boolean flag)
    {
        ag.a(flag);
    }

    public void setOnScrollListener(l l1)
    {
        W = l1;
    }

    public void setRecycledViewPool(m m1)
    {
        n n1 = a;
        if (n1.f != null)
        {
            n1.f.b();
        }
        n1.f = m1;
        if (m1 != null)
        {
            n1.f.a();
        }
    }

    public void setRecyclerListener(o o1)
    {
        y = o1;
    }

    public void setScrollingTouchSlop(int i1)
    {
        ViewConfiguration viewconfiguration = ViewConfiguration.get(getContext());
        switch (i1)
        {
        default:
            (new StringBuilder("setScrollingTouchSlop(): bad argument constant ")).append(i1).append("; using default value");
            // fall through

        case 0: // '\0'
            R = viewconfiguration.getScaledTouchSlop();
            return;

        case 1: // '\001'
            R = bb.a(viewconfiguration);
            break;
        }
    }

    public void setViewCacheExtension(t t1)
    {
        a.g = t1;
    }

    public boolean startNestedScroll(int i1)
    {
        return ag.a(i1);
    }

    public void stopNestedScroll()
    {
        ag.b();
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
        r = flag;
        s = (new Class[] {
            android/content/Context, android/util/AttributeSet, Integer.TYPE, Integer.TYPE
        });
    }
}
