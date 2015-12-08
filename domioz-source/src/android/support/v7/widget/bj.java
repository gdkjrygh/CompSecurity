// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.ad;
import android.support.v4.view.a.f;
import android.support.v4.view.a.p;
import android.support.v4.view.bp;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView, bv, bs, n, 
//            p, o, bq, bm, 
//            bc

public abstract class bj
{

    private boolean a;
    private boolean b;
    n h;
    RecyclerView i;
    bq j;

    public bj()
    {
        a = false;
        b = false;
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

    static void a(bj bj1, bq bq1)
    {
        if (bj1.j == bq1)
        {
            bj1.j = null;
        }
    }

    public static void a(View view, int i1, int j1, int k1, int l1)
    {
        Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).b;
        view.layout(rect.left + i1, rect.top + j1, k1 - rect.right, l1 - rect.bottom);
    }

    private void a(View view, int i1, boolean flag)
    {
        bv bv1;
        RecyclerView.LayoutParams layoutparams;
        bv1 = RecyclerView.b(view);
        if (flag || bv1.isRemoved())
        {
            i.e.b(view);
        } else
        {
            i.e.a(view);
        }
        layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        if (!bv1.wasReturnedFromScrap() && !bv1.isScrap()) goto _L2; else goto _L1
_L1:
        if (bv1.isScrap())
        {
            bv1.unScrap();
        } else
        {
            bv1.clearReturnedFromScrapFlag();
        }
        h.a(view, i1, view.getLayoutParams(), false);
_L4:
        if (layoutparams.d)
        {
            bv1.itemView.invalidate();
            layoutparams.d = false;
        }
        return;
_L2:
        if (view.getParent() == i)
        {
            n n1 = h;
            int j1 = n1.a.a(view);
            int k1;
            if (j1 == -1)
            {
                j1 = -1;
            } else
            if (n1.b.b(j1))
            {
                j1 = -1;
            } else
            {
                j1 -= n1.b.d(j1);
            }
            k1 = i1;
            if (i1 == -1)
            {
                k1 = h.a();
            }
            if (j1 == -1)
            {
                throw new IllegalStateException((new StringBuilder("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:")).append(i.indexOfChild(view)).toString());
            }
            if (j1 != k1)
            {
                view = RecyclerView.e(i);
                View view1 = view.b(j1);
                if (view1 == null)
                {
                    throw new IllegalArgumentException((new StringBuilder("Cannot move a child from non-existing index:")).append(j1).toString());
                }
                view.g(j1);
                RecyclerView.LayoutParams layoutparams1 = (RecyclerView.LayoutParams)view1.getLayoutParams();
                bv bv2 = RecyclerView.b(view1);
                if (bv2.isRemoved())
                {
                    ((bj) (view)).i.e.b(view1);
                } else
                {
                    ((bj) (view)).i.e.a(view1);
                }
                ((bj) (view)).h.a(view1, k1, layoutparams1, bv2.isRemoved());
            }
        } else
        {
            h.a(view, i1, false);
            layoutparams.c = true;
            if (j != null && j.c())
            {
                j.a(view);
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    static boolean a(bj bj1)
    {
        return bj1.a;
    }

    static boolean b(bj bj1)
    {
        bj1.a = false;
        return false;
    }

    public static int c(View view)
    {
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).a.getLayoutPosition();
    }

    public static int d(View view)
    {
        Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).b;
        int i1 = view.getMeasuredWidth();
        int j1 = rect.left;
        return rect.right + (i1 + j1);
    }

    public static int e(View view)
    {
        Rect rect = ((RecyclerView.LayoutParams)view.getLayoutParams()).b;
        int i1 = view.getMeasuredHeight();
        int j1 = rect.top;
        return rect.bottom + (i1 + j1);
    }

    public static int f(View view)
    {
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).b.top;
    }

    private void f(int i1)
    {
        if (b(i1) != null)
        {
            h.a(i1);
        }
    }

    public static int g(View view)
    {
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).b.bottom;
    }

    private void g(int i1)
    {
        b(i1);
        h.d(i1);
    }

    public static int h(View view)
    {
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).b.left;
    }

    public static int i(View view)
    {
        return ((RecyclerView.LayoutParams)view.getLayoutParams()).b.right;
    }

    public int a(int i1, bm bm1, bs bs1)
    {
        return 0;
    }

    public int a(bs bs1)
    {
        return 0;
    }

    public abstract RecyclerView.LayoutParams a();

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

    public View a(int i1)
    {
        int k1 = j();
        for (int j1 = 0; j1 < k1; j1++)
        {
            View view = b(j1);
            bv bv1 = RecyclerView.b(view);
            if (bv1 != null && bv1.getLayoutPosition() == i1 && !bv1.shouldIgnore() && (i.e.a() || !bv1.isRemoved()))
            {
                return view;
            }
        }

        return null;
    }

    public void a(int i1, int j1)
    {
    }

    public final void a(int i1, bm bm1)
    {
        View view = b(i1);
        f(i1);
        bm1.a(view);
    }

    public void a(Parcelable parcelable)
    {
    }

    final void a(RecyclerView recyclerview)
    {
        if (recyclerview == null)
        {
            i = null;
            h = null;
            return;
        } else
        {
            i = recyclerview;
            h = recyclerview.c;
            return;
        }
    }

    public void a(RecyclerView recyclerview, bm bm1)
    {
    }

    public final void a(bm bm1)
    {
        int i1 = j() - 1;
        while (i1 >= 0) 
        {
            View view = b(i1);
            bv bv1 = RecyclerView.b(view);
            if (!bv1.shouldIgnore())
            {
                if (bv1.isInvalid() && !bv1.isRemoved() && !bv1.isChanged() && !RecyclerView.g(i).hasStableIds())
                {
                    f(i1);
                    bm1.a(bv1);
                } else
                {
                    g(i1);
                    bm1.c(view);
                }
            }
            i1--;
        }
    }

    public void a(bm bm1, bs bs1)
    {
        Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
    }

    public final void a(View view)
    {
        a(view, -1, false);
    }

    public final void a(View view, int i1)
    {
        a(view, i1, true);
    }

    final void a(View view, f f1)
    {
        bv bv1 = RecyclerView.b(view);
        if (bv1 != null && !bv1.isRemoved())
        {
            Object obj = i.a;
            obj = i.e;
            b(view, f1);
        }
    }

    public final void a(View view, bm bm1)
    {
        n n1 = h;
        int i1 = n1.a.a(view);
        if (i1 >= 0)
        {
            if (n1.b.c(i1))
            {
                n1.c.remove(view);
            }
            n1.a.a(i1);
        }
        bm1.a(view);
    }

    public void a(AccessibilityEvent accessibilityevent)
    {
        boolean flag1 = true;
        Object obj = i.a;
        obj = i.e;
        accessibilityevent = android.support.v4.view.a.a.a(accessibilityevent);
        if (i != null)
        {
            boolean flag = flag1;
            if (!bp.b(i, 1))
            {
                flag = flag1;
                if (!bp.b(i, -1))
                {
                    flag = flag1;
                    if (!bp.a(i, -1))
                    {
                        if (bp.a(i, 1))
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
            if (RecyclerView.g(i) != null)
            {
                accessibilityevent.a(RecyclerView.g(i).getItemCount());
                return;
            }
        }
    }

    public void a(String s1)
    {
        if (i != null)
        {
            i.a(s1);
        }
    }

    public boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams != null;
    }

    public final boolean a(Runnable runnable)
    {
        if (i != null)
        {
            return i.removeCallbacks(runnable);
        } else
        {
            return false;
        }
    }

    public int b(int i1, bm bm1, bs bs1)
    {
        return 0;
    }

    public int b(bm bm1, bs bs1)
    {
        while (i == null || RecyclerView.g(i) == null || !d()) 
        {
            return 1;
        }
        return RecyclerView.g(i).getItemCount();
    }

    public int b(bs bs1)
    {
        return 0;
    }

    public Parcelable b()
    {
        return null;
    }

    public final View b(int i1)
    {
        if (h != null)
        {
            return h.b(i1);
        } else
        {
            return null;
        }
    }

    public void b(int i1, int j1)
    {
    }

    final void b(RecyclerView recyclerview, bm bm1)
    {
        b = false;
        a(recyclerview, bm1);
    }

    final void b(bm bm1)
    {
        int j1 = bm1.a.size();
        for (int i1 = j1 - 1; i1 >= 0; i1--)
        {
            View view = ((bv)bm1.a.get(i1)).itemView;
            bv bv1 = RecyclerView.b(view);
            if (bv1.shouldIgnore())
            {
                continue;
            }
            if (bv1.isTmpDetached())
            {
                i.removeDetachedView(view, false);
            }
            bm1.b(view);
        }

        bm1.a.clear();
        if (j1 > 0)
        {
            i.invalidate();
        }
    }

    public final void b(View view)
    {
        a(view, 0, false);
    }

    public void b(View view, f f1)
    {
        int i1;
        int j1;
        if (d())
        {
            i1 = c(view);
        } else
        {
            i1 = 0;
        }
        if (c())
        {
            j1 = c(view);
        } else
        {
            j1 = 0;
        }
        f1.b(android.support.v4.view.a.p.a(i1, 1, j1, 1, false));
    }

    public int c(bm bm1, bs bs1)
    {
        while (i == null || RecyclerView.g(i) == null || !c()) 
        {
            return 1;
        }
        return RecyclerView.g(i).getItemCount();
    }

    public int c(bs bs1)
    {
        return 0;
    }

    public View c(int i1, bm bm1, bs bs1)
    {
        return null;
    }

    public void c(int i1)
    {
        if (i != null)
        {
            RecyclerView recyclerview = i;
            int k1 = recyclerview.c.a();
            for (int j1 = 0; j1 < k1; j1++)
            {
                recyclerview.c.b(j1).offsetLeftAndRight(i1);
            }

        }
    }

    public void c(int i1, int j1)
    {
    }

    public final void c(bm bm1)
    {
        for (int i1 = j() - 1; i1 >= 0; i1--)
        {
            if (!RecyclerView.b(b(i1)).shouldIgnore())
            {
                a(i1, bm1);
            }
        }

    }

    public boolean c()
    {
        return false;
    }

    public int d(bs bs1)
    {
        return 0;
    }

    public void d(int i1)
    {
        if (i != null)
        {
            RecyclerView recyclerview = i;
            int k1 = recyclerview.c.a();
            for (int j1 = 0; j1 < k1; j1++)
            {
                recyclerview.c.b(j1).offsetTopAndBottom(i1);
            }

        }
    }

    public void d(int i1, int j1)
    {
    }

    public boolean d()
    {
        return false;
    }

    public int e(bs bs1)
    {
        return 0;
    }

    public void e(int i1)
    {
    }

    public boolean e()
    {
        return false;
    }

    public int f(bs bs1)
    {
        return 0;
    }

    public final void f()
    {
        if (i != null)
        {
            i.requestLayout();
        }
    }

    final void g()
    {
        b = true;
    }

    public final boolean h()
    {
        return b;
    }

    public final boolean i()
    {
        return j != null && j.c();
    }

    public final int j()
    {
        if (h != null)
        {
            return h.a();
        } else
        {
            return 0;
        }
    }

    public final int k()
    {
        if (i != null)
        {
            return i.getWidth();
        } else
        {
            return 0;
        }
    }

    public final int l()
    {
        if (i != null)
        {
            return i.getHeight();
        } else
        {
            return 0;
        }
    }

    public final int m()
    {
        if (i != null)
        {
            return i.getPaddingLeft();
        } else
        {
            return 0;
        }
    }

    public final int n()
    {
        if (i != null)
        {
            return i.getPaddingTop();
        } else
        {
            return 0;
        }
    }

    public final int o()
    {
        if (i != null)
        {
            return i.getPaddingRight();
        } else
        {
            return 0;
        }
    }

    public final int p()
    {
        if (i != null)
        {
            return i.getPaddingBottom();
        } else
        {
            return 0;
        }
    }

    public void q()
    {
    }

    final void r()
    {
        if (j != null)
        {
            j.a();
        }
    }

    public final void s()
    {
        a = true;
    }
}
