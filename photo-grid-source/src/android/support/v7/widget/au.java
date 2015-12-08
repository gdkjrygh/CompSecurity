// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, bi, bf, d, 
//            f, e, bd, al, 
//            az

public abstract class au
{

    private boolean a;
    private boolean b;
    d q;
    RecyclerView r;
    bd s;

    public au()
    {
        a = false;
        b = false;
    }

    public static int a(int l, int i1, int j1, boolean flag)
    {
        int k1;
        int l1;
        l1 = 0x40000000;
        k1 = Math.max(0, l - i1);
        if (!flag) goto _L2; else goto _L1
_L1:
        if (j1 >= 0)
        {
            l = j1;
            i1 = l1;
        } else
        {
            i1 = 0;
            l = 0;
        }
_L4:
        return android.view.View.MeasureSpec.makeMeasureSpec(l, i1);
_L2:
        i1 = l1;
        l = j1;
        if (j1 < 0)
        {
            if (j1 == -1)
            {
                l = k1;
                i1 = l1;
            } else
            if (j1 == -2)
            {
                i1 = 0x80000000;
                l = k1;
            } else
            {
                i1 = 0;
                l = 0;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static void a(au au1, bd bd1)
    {
        if (au1.s == bd1)
        {
            au1.s = null;
        }
    }

    public static void a(View view, int l, int i1, int j1, int k1)
    {
        Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).b;
        view.layout(rect.left + l, rect.top + i1, j1 - rect.right, k1 - rect.bottom);
    }

    private void a(View view, int l, boolean flag)
    {
        bi bi1;
        RecyclerView.LayoutParams layoutparams;
        bi1 = RecyclerView.b(view);
        if (flag || bi1.n())
        {
            r.e.b(view);
        } else
        {
            r.e.a(view);
        }
        layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        if (!bi1.g() && !bi1.e()) goto _L2; else goto _L1
_L1:
        if (bi1.e())
        {
            bi1.f();
        } else
        {
            bi1.h();
        }
        q.a(view, l, view.getLayoutParams(), false);
_L4:
        if (layoutparams.d)
        {
            bi1.a.invalidate();
            layoutparams.d = false;
        }
        return;
_L2:
        if (view.getParent() == r)
        {
            d d1 = q;
            int i1 = d1.a.a(view);
            int j1;
            if (i1 == -1)
            {
                i1 = -1;
            } else
            if (d1.b.b(i1))
            {
                i1 = -1;
            } else
            {
                i1 -= d1.b.d(i1);
            }
            j1 = l;
            if (l == -1)
            {
                j1 = q.a();
            }
            if (i1 == -1)
            {
                throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(r.indexOfChild(view)).toString());
            }
            if (i1 != j1)
            {
                view = RecyclerView.e(r);
                View view1 = view.c(i1);
                if (view1 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(i1).toString());
                }
                view.h(i1);
                RecyclerView.LayoutParams layoutparams1 = (RecyclerView.LayoutParams)view1.getLayoutParams();
                bi bi2 = RecyclerView.b(view1);
                if (bi2.n())
                {
                    ((au) (view)).r.e.b(view1);
                } else
                {
                    ((au) (view)).r.e.a(view1);
                }
                ((au) (view)).q.a(view1, j1, layoutparams1, bi2.n());
            }
        } else
        {
            q.a(view, l, false);
            layoutparams.c = true;
            if (s != null && s.e())
            {
                s.a(view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(au au1)
    {
        return au1.a;
    }

    static boolean b(au au1)
    {
        au1.a = false;
        return false;
    }

    public static int e(View view)
    {
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).a.c();
    }

    public static int f(View view)
    {
        Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).b;
        int l = view.getMeasuredWidth();
        int i1 = rect.left;
        return rect.right + (l + i1);
    }

    public static int g(View view)
    {
        Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).b;
        int l = view.getMeasuredHeight();
        int i1 = rect.top;
        return rect.bottom + (l + i1);
    }

    private void g(int l)
    {
        if (c(l) != null)
        {
            q.a(l);
        }
    }

    public static int h(View view)
    {
        return view.getLeft() - ((RecyclerView.LayoutParams)view.getLayoutParams()).b.left;
    }

    private void h(int l)
    {
        c(l);
        q.d(l);
    }

    public static int i(View view)
    {
        return view.getTop() - ((RecyclerView.LayoutParams)view.getLayoutParams()).b.top;
    }

    public static int j(View view)
    {
        int l = view.getRight();
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).b.right + l;
    }

    public static int k(View view)
    {
        int l = view.getBottom();
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).b.bottom + l;
    }

    public final void A()
    {
        a = true;
    }

    public int a(int l, az az1, bf bf1)
    {
        return 0;
    }

    public int a(az az1, bf bf1)
    {
        while (r == null || RecyclerView.g(r) == null || !h()) 
        {
            return 1;
        }
        return RecyclerView.g(r).a();
    }

    public int a(bf bf1)
    {
        return 0;
    }

    public RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
    {
        return new RecyclerView.LayoutParams(context, attributeset);
    }

    public RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof RecyclerView.LayoutParams)
        {
            return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new RecyclerView.LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new RecyclerView.LayoutParams(layoutparams);
        }
    }

    public View a(int l)
    {
        int j1 = r();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = c(i1);
            bi bi1 = RecyclerView.b(view);
            if (bi1 != null && bi1.c() == l && !bi1.b() && (r.e.a() || !bi1.n()))
            {
                return view;
            }
        }

        return null;
    }

    public void a()
    {
    }

    public void a(int l, int i1)
    {
    }

    public final void a(int l, az az1)
    {
        View view = c(l);
        g(l);
        az1.a(view);
    }

    public void a(Parcelable parcelable)
    {
    }

    public void a(RecyclerView recyclerview)
    {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void a(RecyclerView recyclerview, az az1)
    {
    }

    public final void a(az az1)
    {
        int l = r() - 1;
        while (l >= 0) 
        {
            View view = c(l);
            bi bi1 = RecyclerView.b(view);
            if (!bi1.b())
            {
                if (bi1.j() && !bi1.n() && !bi1.l() && !RecyclerView.g(r).k_())
                {
                    g(l);
                    az1.a(bi1);
                } else
                {
                    h(l);
                    az1.c(view);
                }
            }
            l--;
        }
    }

    public void a(az az1, bf bf1, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        int l;
        int i1;
        if (h())
        {
            l = e(view);
        } else
        {
            l = 0;
        }
        if (g())
        {
            i1 = e(view);
        } else
        {
            i1 = 0;
        }
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(l, 1, i1, 1, false, false));
    }

    public final void a(bd bd1)
    {
        if (s != null && bd1 != s && s.e())
        {
            s.c();
        }
        s = bd1;
        s.a(r, this);
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
        bi bi1 = RecyclerView.b(view);
        if (bi1 != null && !bi1.n())
        {
            a(r.a, r.e, view, accessibilitynodeinfocompat);
        }
    }

    public final void a(View view, az az1)
    {
        d d1 = q;
        int l = d1.a.a(view);
        if (l >= 0)
        {
            if (d1.b.c(l))
            {
                d1.c.remove(view);
            }
            d1.a.a(l);
        }
        az1.a(view);
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

    public boolean a(RecyclerView.LayoutParams layoutparams)
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

    public int b(int l, az az1, bf bf1)
    {
        return 0;
    }

    public int b(az az1, bf bf1)
    {
        while (r == null || RecyclerView.g(r) == null || !g()) 
        {
            return 1;
        }
        return RecyclerView.g(r).a();
    }

    public int b(bf bf1)
    {
        return 0;
    }

    public abstract RecyclerView.LayoutParams b();

    public void b(int l)
    {
    }

    public void b(int l, int i1)
    {
    }

    final void b(RecyclerView recyclerview)
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

    final void b(RecyclerView recyclerview, az az1)
    {
        b = false;
        a(recyclerview, az1);
    }

    final void b(az az1)
    {
        int i1 = az1.a.size();
        for (int l = i1 - 1; l >= 0; l--)
        {
            View view = ((bi)az1.a.get(l)).a;
            bi bi1 = RecyclerView.b(view);
            if (bi1.b())
            {
                continue;
            }
            if (bi1.p())
            {
                r.removeDetachedView(view, false);
            }
            az1.b(view);
        }

        az1.a.clear();
        if (i1 > 0)
        {
            r.invalidate();
        }
    }

    public final void b(View view)
    {
        a(view, 0, true);
    }

    public int c(bf bf1)
    {
        return 0;
    }

    public final View c(int l)
    {
        if (q != null)
        {
            return q.b(l);
        } else
        {
            return null;
        }
    }

    public View c(int l, az az1, bf bf1)
    {
        return null;
    }

    public void c(int l, int i1)
    {
    }

    public final void c(az az1)
    {
        for (int l = r() - 1; l >= 0; l--)
        {
            if (!RecyclerView.b(c(l)).b())
            {
                a(l, az1);
            }
        }

    }

    public void c(az az1, bf bf1)
    {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public final void c(View view)
    {
        a(view, -1, false);
    }

    public int d(bf bf1)
    {
        return 0;
    }

    public void d(int l)
    {
        if (r != null)
        {
            RecyclerView recyclerview = r;
            int j1 = recyclerview.c.a();
            for (int i1 = 0; i1 < j1; i1++)
            {
                recyclerview.c.b(i1).offsetLeftAndRight(l);
            }

        }
    }

    public void d(int l, int i1)
    {
    }

    public final void d(View view)
    {
        a(view, 0, false);
    }

    public int e(bf bf1)
    {
        return 0;
    }

    public void e(int l)
    {
        if (r != null)
        {
            RecyclerView recyclerview = r;
            int j1 = recyclerview.c.a();
            for (int i1 = 0; i1 < j1; i1++)
            {
                recyclerview.c.b(i1).offsetTopAndBottom(l);
            }

        }
    }

    public boolean e()
    {
        return false;
    }

    public int f(bf bf1)
    {
        return 0;
    }

    public Parcelable f()
    {
        return null;
    }

    public void f(int l)
    {
    }

    public boolean g()
    {
        return false;
    }

    public boolean h()
    {
        return false;
    }

    public final void n()
    {
        if (r != null)
        {
            r.requestLayout();
        }
    }

    final void o()
    {
        b = true;
    }

    public final boolean p()
    {
        return b;
    }

    public final boolean q()
    {
        return s != null && s.e();
    }

    public final int r()
    {
        if (q != null)
        {
            return q.a();
        } else
        {
            return 0;
        }
    }

    public final int s()
    {
        if (r != null)
        {
            return r.getWidth();
        } else
        {
            return 0;
        }
    }

    public final int t()
    {
        if (r != null)
        {
            return r.getHeight();
        } else
        {
            return 0;
        }
    }

    public final int u()
    {
        if (r != null)
        {
            return r.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    public final int v()
    {
        if (r != null)
        {
            return r.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    public final int w()
    {
        if (r != null)
        {
            return r.getPaddingRight();
        } else
        {
            return 0;
        }
    }

    public final int x()
    {
        if (r != null)
        {
            return r.getPaddingBottom();
        } else
        {
            return 0;
        }
    }

    public final int y()
    {
        al al1;
        if (r != null)
        {
            al1 = r.a();
        } else
        {
            al1 = null;
        }
        if (al1 != null)
        {
            return al1.a();
        } else
        {
            return 0;
        }
    }

    final void z()
    {
        if (s != null)
        {
            s.c();
        }
    }
}
