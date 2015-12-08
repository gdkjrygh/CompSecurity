// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class abd
{

    public zu j;
    public RecyclerView k;
    abk l;

    public abd()
    {
    }

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
            j.a(i1);
        }
    }

    static void a(abd abd1, abk abk1)
    {
        if (abd1.l == abk1)
        {
            abd1.l = null;
        }
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        Rect rect = ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).d;
        view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
    }

    public static int b(View view)
    {
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).c.c();
    }

    public static int f(View view)
    {
        Rect rect = ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).d;
        int i1 = view.getMeasuredHeight();
        int j1 = rect.top;
        return rect.bottom + (i1 + j1);
    }

    public static int g(View view)
    {
        return view.getLeft() - ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).d.left;
    }

    public static int h(View view)
    {
        return view.getTop() - ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).d.top;
    }

    private void h(int i1)
    {
        d(i1);
        i(i1);
    }

    public static int i(View view)
    {
        int i1 = view.getRight();
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).d.right + i1;
    }

    private void i(int i1)
    {
        j.d(i1);
    }

    public static int j(View view)
    {
        int i1 = view.getBottom();
        return ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).d.bottom + i1;
    }

    public int a(int i1, abh abh1, abm abm1)
    {
        return 0;
    }

    public int a(abh abh1, abm abm1)
    {
        while (k == null || RecyclerView.g(k) == null || !g()) 
        {
            return 1;
        }
        return RecyclerView.g(k).b();
    }

    public int a(abm abm1)
    {
        return 0;
    }

    public abstract android.support.v7.widget.RecyclerView.LayoutParams a();

    public android.support.v7.widget.RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
    {
        return new android.support.v7.widget.RecyclerView.LayoutParams(context, attributeset);
    }

    public android.support.v7.widget.RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.support.v7.widget.RecyclerView.LayoutParams)
        {
            return new android.support.v7.widget.RecyclerView.LayoutParams((android.support.v7.widget.RecyclerView.LayoutParams)layoutparams);
        }
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new android.support.v7.widget.RecyclerView.LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new android.support.v7.widget.RecyclerView.LayoutParams(layoutparams);
        }
    }

    public final void a(int i1, abh abh1)
    {
        View view = d(i1);
        a(i1);
        abh1.a(view);
    }

    public void a(aav aav1, aav aav2)
    {
    }

    public final void a(abh abh1)
    {
        int i1 = p() - 1;
        while (i1 >= 0) 
        {
            View view = d(i1);
            abo abo1 = RecyclerView.b(view);
            if (!abo1.E_())
            {
                if (abo1.k() && !abo1.n() && !RecyclerView.g(k).b)
                {
                    a(i1);
                    abh1.a(abo1);
                } else
                {
                    h(i1);
                    abh1.c(view);
                }
            }
            i1--;
        }
    }

    public void a(abh abh1, abm abm1, int i1, int j1)
    {
        RecyclerView.b(k, i1, j1);
    }

    public void a(abh abh1, abm abm1, View view, nb nb1)
    {
        int i1;
        int j1;
        if (g())
        {
            i1 = b(view);
        } else
        {
            i1 = 0;
        }
        if (f())
        {
            j1 = b(view);
        } else
        {
            j1 = 0;
        }
        nb1.a(nn.a(i1, 1, j1, 1, false));
    }

    public final void a(abk abk1)
    {
        if (l != null && abk1 != l && l.e)
        {
            l.b();
        }
        l = abk1;
        abk1 = l;
        abk1.b = k;
        abk1.c = this;
        if (abk1.a == -1)
        {
            throw new IllegalArgumentException("Invalid target position");
        } else
        {
            abk1.b.q.a = abk1.a;
            abk1.e = true;
            abk1.d = true;
            int i1 = abk1.a;
            abk1.f = RecyclerView.f(abk1.b).b(i1);
            RecyclerView.u(abk1.b).a();
            return;
        }
    }

    public void a(Parcelable parcelable)
    {
    }

    public void a(RecyclerView recyclerview)
    {
    }

    public void a(RecyclerView recyclerview, int i1)
    {
        Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
    }

    public void a(RecyclerView recyclerview, int i1, int j1)
    {
    }

    public void a(RecyclerView recyclerview, int i1, int j1, int k1)
    {
    }

    public void a(RecyclerView recyclerview, abh abh1)
    {
    }

    public final void a(View view)
    {
        a(view, -1, false);
    }

    public final void a(View view, int i1)
    {
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
        abo abo1 = RecyclerView.b(view);
        if (abo1.n())
        {
            k.d.a(abo1);
        } else
        {
            k.d.b(abo1);
        }
        j.a(view, i1, layoutparams, abo1.n());
    }

    public final void a(View view, int i1, boolean flag)
    {
        abo abo1;
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams;
        abo1 = RecyclerView.b(view);
        if (flag || abo1.n())
        {
            k.d.a(abo1);
        } else
        {
            k.d.b(abo1);
        }
        layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
        if (!abo1.h() && !abo1.f()) goto _L2; else goto _L1
_L1:
        if (abo1.f())
        {
            abo1.g();
        } else
        {
            abo1.i();
        }
        j.a(view, i1, view.getLayoutParams(), false);
_L4:
        if (layoutparams.f)
        {
            abo1.a.invalidate();
            layoutparams.f = false;
        }
        return;
_L2:
        if (view.getParent() == k)
        {
            int k1 = j.c(view);
            int j1 = i1;
            if (i1 == -1)
            {
                j1 = j.a();
            }
            if (k1 == -1)
            {
                throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(k.indexOfChild(view)).toString());
            }
            if (k1 != j1)
            {
                view = RecyclerView.f(k);
                View view1 = view.d(k1);
                if (view1 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(k1).toString());
                }
                view.h(k1);
                view.a(view1, j1);
            }
        } else
        {
            j.a(view, i1, false);
            layoutparams.e = true;
            if (l != null && l.e)
            {
                abk abk1 = l;
                if (RecyclerView.d(view) == abk1.a)
                {
                    abk1.f = view;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(View view, abh abh1)
    {
        zu zu1 = j;
        int i1 = zu1.a.a(view);
        if (i1 >= 0)
        {
            if (zu1.b.d(i1))
            {
                zu1.b(view);
            }
            zu1.a.a(i1);
        }
        abh1.a(view);
    }

    public final void a(View view, Rect rect)
    {
        if (k == null)
        {
            rect.set(0, 0, 0, 0);
            return;
        } else
        {
            rect.set(k.e(view));
            return;
        }
    }

    public final void a(View view, nb nb1)
    {
        abo abo1 = RecyclerView.b(view);
        if (abo1 != null && !abo1.n() && !j.d(abo1.a))
        {
            a(k.a, k.q, view, nb1);
        }
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = true;
        Object obj = k.a;
        obj = k.q;
        accessibilityevent = mw.a(accessibilityevent);
        if (k != null)
        {
            boolean flag = flag1;
            if (!km.b(k, 1))
            {
                flag = flag1;
                if (!km.b(k, -1))
                {
                    flag = flag1;
                    if (!km.a(k, -1))
                    {
                        if (km.a(k, 1))
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
            if (RecyclerView.g(k) != null)
            {
                accessibilityevent.a(RecyclerView.g(k).b());
                return;
            }
        }
    }

    public void a(String s1)
    {
        if (k != null)
        {
            k.a(s1);
        }
    }

    public boolean a(android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams != null;
    }

    public int b(int i1, abh abh1, abm abm1)
    {
        return 0;
    }

    public int b(abh abh1, abm abm1)
    {
        while (k == null || RecyclerView.g(k) == null || !f()) 
        {
            return 1;
        }
        return RecyclerView.g(k).b();
    }

    public int b(abm abm1)
    {
        return 0;
    }

    public View b(int i1)
    {
        int k1 = p();
        for (int j1 = 0; j1 < k1; j1++)
        {
            View view = d(j1);
            abo abo1 = RecyclerView.b(view);
            if (abo1 != null && abo1.c() == i1 && !abo1.E_() && (k.q.f || !abo1.n()))
            {
                return view;
            }
        }

        return null;
    }

    public final void b(int i1, int j1)
    {
        RecyclerView.c(k, i1, j1);
    }

    public final void b(abh abh1)
    {
        int j1 = abh1.a.size();
        for (int i1 = j1 - 1; i1 >= 0; i1--)
        {
            View view = ((abo)abh1.a.get(i1)).a;
            abo abo1 = RecyclerView.b(view);
            if (abo1.E_())
            {
                continue;
            }
            abo1.a(false);
            if (abo1.o())
            {
                k.removeDetachedView(view, false);
            }
            if (k.n != null)
            {
                k.n.c(abo1);
            }
            abo1.a(true);
            abh1.b(view);
        }

        abh1.a.clear();
        if (abh1.b != null)
        {
            abh1.b.clear();
        }
        if (j1 > 0)
        {
            k.invalidate();
        }
    }

    public final void b(RecyclerView recyclerview)
    {
        if (recyclerview == null)
        {
            k = null;
            j = null;
            return;
        } else
        {
            k = recyclerview;
            j = recyclerview.c;
            return;
        }
    }

    public void b(RecyclerView recyclerview, int i1, int j1)
    {
    }

    public int c(abm abm1)
    {
        return 0;
    }

    public View c(int i1, abh abh1, abm abm1)
    {
        return null;
    }

    public void c(int i1)
    {
    }

    public final void c(abh abh1)
    {
        for (int i1 = p() - 1; i1 >= 0; i1--)
        {
            if (!RecyclerView.b(d(i1)).E_())
            {
                a(i1, abh1);
            }
        }

    }

    public void c(abh abh1, abm abm1)
    {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public void c(RecyclerView recyclerview)
    {
    }

    public void c(RecyclerView recyclerview, int i1, int j1)
    {
        d(recyclerview, i1, j1);
    }

    public final void c(View view)
    {
        int i1 = j.c(view);
        if (i1 >= 0)
        {
            i(i1);
        }
    }

    public int d(abm abm1)
    {
        return 0;
    }

    public final View d(int i1)
    {
        if (j != null)
        {
            return j.b(i1);
        } else
        {
            return null;
        }
    }

    public void d(RecyclerView recyclerview, int i1, int j1)
    {
    }

    public final void d(View view)
    {
        a(view, -1);
    }

    public boolean d()
    {
        return false;
    }

    public int e(abm abm1)
    {
        return 0;
    }

    public final int e(View view)
    {
        Rect rect = ((android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams()).d;
        int i1 = view.getMeasuredWidth();
        int j1 = rect.left;
        return rect.right + (i1 + j1);
    }

    public Parcelable e()
    {
        return null;
    }

    public void e(int i1)
    {
        if (k != null)
        {
            RecyclerView recyclerview = k;
            int k1 = recyclerview.c.a();
            for (int j1 = 0; j1 < k1; j1++)
            {
                recyclerview.c.b(j1).offsetLeftAndRight(i1);
            }

        }
    }

    public int f(abm abm1)
    {
        return 0;
    }

    public void f(int i1)
    {
        if (k != null)
        {
            RecyclerView recyclerview = k;
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

    public final void m()
    {
        if (k != null)
        {
            k.requestLayout();
        }
    }

    public final boolean n()
    {
        return l != null && l.e;
    }

    public final void o()
    {
        for (int i1 = p() - 1; i1 >= 0; i1--)
        {
            j.a(i1);
        }

    }

    public final int p()
    {
        if (j != null)
        {
            return j.a();
        } else
        {
            return 0;
        }
    }

    public final int q()
    {
        if (k != null)
        {
            return k.getWidth();
        } else
        {
            return 0;
        }
    }

    public final int r()
    {
        if (k != null)
        {
            return k.getHeight();
        } else
        {
            return 0;
        }
    }

    public final int s()
    {
        if (k != null)
        {
            return k.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    public final int t()
    {
        if (k != null)
        {
            return k.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    public final int u()
    {
        if (k != null)
        {
            return k.getPaddingRight();
        } else
        {
            return 0;
        }
    }

    public final int v()
    {
        if (k != null)
        {
            return k.getPaddingBottom();
        } else
        {
            return 0;
        }
    }

    public final int w()
    {
        aav aav1;
        if (k != null)
        {
            aav1 = k.e;
        } else
        {
            aav1 = null;
        }
        if (aav1 != null)
        {
            return aav1.b();
        } else
        {
            return 0;
        }
    }

    public final int x()
    {
        return km.o(k);
    }

    public final int y()
    {
        return km.p(k);
    }

    public final void z()
    {
        if (l != null)
        {
            l.b();
        }
    }
}
