// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import bI;
import bk;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, RecyclerView

public final class GridLayoutManager extends LinearLayoutManager
{
    public static class LayoutParams extends RecyclerView.LayoutParams
    {

        int a;
        int b;

        static int a(LayoutParams layoutparams)
        {
            return layoutparams.a;
        }

        static int a(LayoutParams layoutparams, int i)
        {
            layoutparams.b = i;
            return i;
        }

        static int b(LayoutParams layoutparams)
        {
            return layoutparams.b;
        }

        static int b(LayoutParams layoutparams, int i)
        {
            layoutparams.a = i;
            return i;
        }

        public LayoutParams()
        {
            a = -1;
            b = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = -1;
            b = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = -1;
            b = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            a = -1;
            b = 0;
        }
    }

    public static final class a extends b
    {

        public final int a(int i)
        {
            return 1;
        }

        public final int a(int i, int i1)
        {
            return i % i1;
        }

        public a()
        {
        }
    }

    public static abstract class b
    {

        final SparseIntArray a = new SparseIntArray();

        public abstract int a(int i);

        public int a(int i, int i1)
        {
            int j2 = a(i);
            if (j2 != i1) goto _L2; else goto _L1
_L1:
            return 0;
_L2:
            int j1;
            int k1;
            k1 = 0;
            j1 = 0;
_L4:
            int l1;
            int i2;
            if (k1 >= i)
            {
                continue; /* Loop/switch isn't completed */
            }
            l1 = a(k1);
            i2 = j1 + l1;
            if (i2 != i1)
            {
                break; /* Loop/switch isn't completed */
            }
            j1 = 0;
_L5:
            k1++;
            if (true) goto _L4; else goto _L3
_L3:
            j1 = l1;
            if (i2 <= i1)
            {
                j1 = i2;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
            if (j1 + j2 > i1) goto _L1; else goto _L7
_L7:
            return j1;
        }

        public final int b(int i, int i1)
        {
            int k2 = a(i);
            int l1 = 0;
            int j1 = 0;
            int k1 = 0;
            while (l1 < i) 
            {
                int i2 = a(l1);
                k1 += i2;
                if (k1 == i1)
                {
                    k1 = j1 + 1;
                    j1 = 0;
                } else
                if (k1 > i1)
                {
                    k1 = j1 + 1;
                    j1 = i2;
                } else
                {
                    int j2 = k1;
                    k1 = j1;
                    j1 = j2;
                }
                i2 = l1 + 1;
                l1 = j1;
                j1 = k1;
                k1 = l1;
                l1 = i2;
            }
            i = j1;
            if (k1 + k2 > i1)
            {
                i = j1 + 1;
            }
            return i;
        }

        public b()
        {
        }
    }


    private static int j = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    public int a;
    public b b;
    private boolean k;
    private int l[];
    private View m[];
    private SparseIntArray n;
    private SparseIntArray o;
    private Rect p;

    public GridLayoutManager()
    {
        super(1);
        k = false;
        a = -1;
        n = new SparseIntArray();
        o = new SparseIntArray();
        b = new a();
        p = new Rect();
        g(6);
    }

    public GridLayoutManager(int i)
    {
        k = false;
        a = -1;
        n = new SparseIntArray();
        o = new SparseIntArray();
        b = new a();
        p = new Rect();
        g(i);
    }

    private static int a(int i, int i1, int j1)
    {
        int k1;
        if (i1 != 0 || j1 != 0)
        {
            if ((k1 = android.view.View.MeasureSpec.getMode(i)) == 0x80000000 || k1 == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i) - i1 - j1, k1);
            }
        }
        return i;
    }

    private int a(RecyclerView.n n1, RecyclerView.s s, int i)
    {
        if (!s.j)
        {
            return b.b(i, a);
        }
        i = n1.a(i);
        if (i == -1)
        {
            return 0;
        } else
        {
            return b.b(i, a);
        }
    }

    private void a(RecyclerView.n n1, RecyclerView.s s, int i, boolean flag)
    {
        int i1;
        int j1;
        int k1;
        byte byte0;
        if (flag)
        {
            j1 = 1;
            boolean flag1 = false;
            k1 = i;
            i = ((flag1) ? 1 : 0);
        } else
        {
            i--;
            j1 = -1;
            k1 = -1;
        }
        if (c == 1 && k())
        {
            i1 = a;
            byte0 = -1;
            i1--;
        } else
        {
            byte0 = 1;
            i1 = 0;
        }
        while (i != k1) 
        {
            View view = m[i];
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            LayoutParams.a(layoutparams, c(n1, s, a(view)));
            if (byte0 == -1 && LayoutParams.b(layoutparams) > 1)
            {
                LayoutParams.b(layoutparams, i1 - (LayoutParams.b(layoutparams) - 1));
            } else
            {
                LayoutParams.b(layoutparams, i1);
            }
            i1 += LayoutParams.b(layoutparams) * byte0;
            i += j1;
        }
    }

    private void a(View view, int i, int i1)
    {
        Object obj = p;
        if (super.h == null)
        {
            ((Rect) (obj)).set(0, 0, 0, 0);
        } else
        {
            ((Rect) (obj)).set(super.h.e(view));
        }
        obj = (RecyclerView.LayoutParams)view.getLayoutParams();
        view.measure(a(i, ((RecyclerView.LayoutParams) (obj)).leftMargin + p.left, ((RecyclerView.LayoutParams) (obj)).rightMargin + p.right), a(i1, ((RecyclerView.LayoutParams) (obj)).topMargin + p.top, ((RecyclerView.LayoutParams) (obj)).bottomMargin + p.bottom));
    }

    private int b(RecyclerView.n n1, RecyclerView.s s, int i)
    {
        int i1;
        if (!s.j)
        {
            i1 = b.a(i, a);
        } else
        {
            int j1 = o.get(i, -1);
            i1 = j1;
            if (j1 == -1)
            {
                i = n1.a(i);
                if (i == -1)
                {
                    return 0;
                } else
                {
                    return b.a(i, a);
                }
            }
        }
        return i1;
    }

    private int c(RecyclerView.n n1, RecyclerView.s s, int i)
    {
        int i1;
        if (!s.j)
        {
            i1 = b.a(i);
        } else
        {
            int j1 = n.get(i, -1);
            i1 = j1;
            if (j1 == -1)
            {
                i = n1.a(i);
                if (i == -1)
                {
                    return 1;
                } else
                {
                    return b.a(i);
                }
            }
        }
        return i1;
    }

    private static int f(int i)
    {
        if (i < 0)
        {
            return j;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        }
    }

    private void g(int i)
    {
        if (i == a)
        {
            return;
        }
        k = true;
        if (i <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Span count should be at least 1. Provided ")).append(i).toString());
        } else
        {
            a = i;
            b.a.clear();
            return;
        }
    }

    public final int a(RecyclerView.n n1, RecyclerView.s s)
    {
        if (c == 0)
        {
            return a;
        }
        if (s.a() <= 0)
        {
            return 0;
        } else
        {
            return a(n1, s, s.a() - 1);
        }
    }

    public final RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
    {
        return new LayoutParams(context, attributeset);
    }

    public final RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof android.view.ViewGroup.MarginLayoutParams)
        {
            return new LayoutParams((android.view.ViewGroup.MarginLayoutParams)layoutparams);
        } else
        {
            return new LayoutParams(layoutparams);
        }
    }

    final View a(RecyclerView.n n1, RecyclerView.s s, int i, int i1, int j1)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                l();
                int l1 = d.b();
                int i2 = d.c();
                int k1;
                if (i1 > i)
                {
                    k1 = 1;
                } else
                {
                    k1 = -1;
                }
                view1 = null;
                while (i != i1) 
                {
                    View view2 = e(i);
                    int j2 = a(view2);
                    if (j2 >= 0 && j2 < j1 && b(n1, s, j2) == 0)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).c.o())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (d.a(view2) < i2)
                            {
                                view3 = view2;
                                if (d.b(view2) >= l1)
                                {
                                    break label1;
                                }
                            }
                            if (view == null)
                            {
                                view = view2;
                            }
                        }
                    }
                    i += k1;
                }
                if (view == null)
                {
                    break label0;
                }
                view3 = view;
            }
            return view3;
        }
        return view1;
    }

    public final void a()
    {
        b.a.clear();
    }

    final void a(RecyclerView.n n1, RecyclerView.s s, LinearLayoutManager.a a1)
    {
        int i1 = 0;
        super.a(n1, s, a1);
        int i;
        int j1;
        int l1;
        int i2;
        if (super.c == 1)
        {
            i = t() - x() - v();
        } else
        {
            i = u() - y() - w();
        }
        if (l == null || l.length != a + 1 || l[l.length - 1] != i)
        {
            l = new int[a + 1];
        }
        l[0] = 0;
        l1 = i / a;
        i2 = i % a;
        j1 = 1;
        i = 0;
        while (j1 <= a) 
        {
            i += i2;
            int k1;
            if (i > 0 && a - i < i2)
            {
                i -= a;
                k1 = l1 + 1;
            } else
            {
                k1 = l1;
            }
            i1 += k1;
            l[j1] = i1;
            j1++;
        }
        if (s.a() > 0 && !s.j)
        {
            for (i = b(n1, s, a1.a); i > 0 && a1.a > 0; i = b(n1, s, a1.a))
            {
                a1.a = a1.a - 1;
            }

        }
        if (m == null || m.length != a)
        {
            m = new View[a];
        }
    }

    final void a(RecyclerView.n n1, RecyclerView.s s, LinearLayoutManager.c c1, LinearLayoutManager.b b1)
    {
        int i;
        int l2;
        boolean flag;
        if (c1.e == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = a;
        int j1;
        int i2;
        int k2;
        int i3;
        int j3;
        if (!flag)
        {
            i = b(n1, s, c1.d) + c(n1, s, c1.d);
            l2 = 0;
        } else
        {
            l2 = 0;
        }
        do
        {
            if (l2 >= a || !c1.a(s) || i <= 0)
            {
                break;
            }
            int i1 = c1.d;
            int k1 = c(n1, s, i1);
            if (k1 > a)
            {
                throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(i1).append(" requires ").append(k1).append(" spans but GridLayoutManager has only ").append(a).append(" spans.").toString());
            }
            i -= k1;
            if (i < 0)
            {
                break;
            }
            View view = c1.a(n1);
            if (view == null)
            {
                break;
            }
            m[l2] = view;
            l2++;
        } while (true);
        if (l2 == 0)
        {
            b1.b = true;
            return;
        }
        i = 0;
        a(n1, s, l2, flag);
        j1 = 0;
        while (j1 < l2) 
        {
            n1 = m[j1];
            int l1;
            if (c1.j == null)
            {
                if (flag)
                {
                    a(n1, -1);
                } else
                {
                    a(((View) (n1)), 0);
                }
            } else
            if (flag)
            {
                super.a(n1, -1, true);
            } else
            {
                super.a(n1, 0, true);
            }
            s = (LayoutParams)n1.getLayoutParams();
            l1 = android.view.View.MeasureSpec.makeMeasureSpec(l[LayoutParams.a(s) + LayoutParams.b(s)] - l[LayoutParams.a(s)], 0x40000000);
            if (c == 1)
            {
                a(((View) (n1)), l1, f(((LayoutParams) (s)).height));
            } else
            {
                a(((View) (n1)), f(((LayoutParams) (s)).width), l1);
            }
            l1 = d.c(n1);
            if (l1 > i)
            {
                i = l1;
            }
            j1++;
        }
        i2 = f(i);
        j1 = 0;
        while (j1 < l2) 
        {
            n1 = m[j1];
            if (d.c(n1) != i)
            {
                s = (LayoutParams)n1.getLayoutParams();
                int j2 = android.view.View.MeasureSpec.makeMeasureSpec(l[LayoutParams.a(s) + LayoutParams.b(s)] - l[LayoutParams.a(s)], 0x40000000);
                if (c == 1)
                {
                    a(((View) (n1)), j2, i2);
                } else
                {
                    a(((View) (n1)), i2, j2);
                }
            }
            j1++;
        }
        b1.a = i;
        i2 = 0;
        k2 = 0;
        if (c == 1)
        {
            if (c1.f == -1)
            {
                k2 = c1.b;
                i = k2 - i;
                j1 = 0;
            } else
            {
                j1 = c1.b;
                k2 = j1 + i;
                i = j1;
                j1 = 0;
            }
        } else
        if (c1.f == -1)
        {
            j1 = c1.b;
            i2 = j1 - i;
            i = 0;
        } else
        {
            i2 = c1.b;
            j1 = i + i2;
            i = 0;
        }
        i3 = 0;
        j3 = i;
        i = j1;
        j1 = j3;
        while (i3 < l2) 
        {
            n1 = m[i3];
            s = (LayoutParams)n1.getLayoutParams();
            int l3;
            if (c == 1)
            {
                i = v() + l[LayoutParams.a(s)];
                int j4 = d.d(n1);
                int k3 = i;
                i2 = k2;
                i = j4 + i;
                k2 = k3;
            } else
            {
                j1 = w();
                j1 = l[LayoutParams.a(s)] + j1;
                k2 = d.d(n1);
                int i4 = k2 + j1;
                k2 = i2;
                i2 = i4;
            }
            a(((View) (n1)), k2 + ((LayoutParams) (s)).leftMargin, j1 + ((LayoutParams) (s)).topMargin, i - ((LayoutParams) (s)).rightMargin, i2 - ((LayoutParams) (s)).bottomMargin);
            if (((RecyclerView.LayoutParams) (s)).c.o() || ((RecyclerView.LayoutParams) (s)).c.m())
            {
                b1.c = true;
            }
            b1.d = b1.d | n1.isFocusable();
            l3 = i2;
            i3++;
            i2 = k2;
            k2 = l3;
        }
        Arrays.fill(m, null);
    }

    public final void a(RecyclerView.n n1, RecyclerView.s s, View view, bk bk1)
    {
        boolean flag2 = false;
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.a(view, bk1);
            return;
        }
        view = (LayoutParams)layoutparams;
        int i = a(n1, s, ((RecyclerView.LayoutParams) (view)).c.d());
        if (c == 0)
        {
            int i1 = ((LayoutParams) (view)).a;
            int k1 = ((LayoutParams) (view)).b;
            boolean flag;
            if (a > 1 && ((LayoutParams) (view)).b == a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bk1.a(bk.j.a(i1, k1, i, 1, flag));
            return;
        }
        int j1 = ((LayoutParams) (view)).a;
        int l1 = ((LayoutParams) (view)).b;
        boolean flag1 = flag2;
        if (a > 1)
        {
            flag1 = flag2;
            if (((LayoutParams) (view)).b == a)
            {
                flag1 = true;
            }
        }
        bk1.a(bk.j.a(i, 1, j1, l1, flag1));
    }

    public final boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int b(RecyclerView.n n1, RecyclerView.s s)
    {
        if (c == 1)
        {
            return a;
        }
        if (s.a() <= 0)
        {
            return 0;
        } else
        {
            return a(n1, s, s.a() - 1);
        }
    }

    public final void b()
    {
        b.a.clear();
    }

    public final void c()
    {
        b.a.clear();
    }

    public final void c(RecyclerView.n n1, RecyclerView.s s)
    {
        if (s.j)
        {
            int i1 = s();
            for (int i = 0; i < i1; i++)
            {
                LayoutParams layoutparams = (LayoutParams)e(i).getLayoutParams();
                int j1 = ((RecyclerView.LayoutParams) (layoutparams)).c.d();
                n.put(j1, layoutparams.b);
                o.put(j1, layoutparams.a);
            }

        }
        super.c(n1, s);
        n.clear();
        o.clear();
        if (!s.j)
        {
            k = false;
        }
    }

    public final void d()
    {
        b.a.clear();
    }

    public final void e()
    {
        b.a.clear();
    }

    public final RecyclerView.LayoutParams f()
    {
        return new LayoutParams();
    }

    public final boolean g()
    {
        return f == null && !k;
    }

}
