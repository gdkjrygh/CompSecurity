// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aab;
import aac;
import aaf;
import aag;
import aah;
import aau;
import abd;
import abh;
import abm;
import abo;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;
import nb;
import nn;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, RecyclerView

public class GridLayoutManager extends LinearLayoutManager
{

    private static int m = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    public int a;
    public int b[];
    public View c[];
    public final SparseIntArray d = new SparseIntArray();
    public aac e;
    private boolean n;
    private SparseIntArray o;
    private Rect p;

    public GridLayoutManager(int i)
    {
        n = false;
        a = -1;
        o = new SparseIntArray();
        e = new aab();
        p = new Rect();
        if (i != a)
        {
            n = true;
            if (i <= 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Span count should be at least 1. Provided ")).append(i).toString());
            }
            a = i;
            e.a.clear();
        }
    }

    private static int a(int i, int j, int k)
    {
        int l;
        if (j != 0 || k != 0)
        {
            if ((l = android.view.View.MeasureSpec.getMode(i)) == 0x80000000 || l == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i) - j - k, l);
            }
        }
        return i;
    }

    private int a(abh abh1, abm abm1, int i)
    {
        if (!abm1.f)
        {
            return e.c(i, a);
        }
        int j = abh1.a(i);
        if (j == -1)
        {
            Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. ")).append(i).toString());
            return 0;
        } else
        {
            return e.c(j, a);
        }
    }

    private void a(abh abh1, abm abm1, int i, boolean flag)
    {
        int j;
        int k;
        int l;
        byte byte0;
        if (flag)
        {
            k = 1;
            boolean flag1 = false;
            l = i;
            i = ((flag1) ? 1 : 0);
        } else
        {
            i--;
            k = -1;
            l = -1;
        }
        if (f == 1 && i())
        {
            j = a;
            byte0 = -1;
            j--;
        } else
        {
            byte0 = 1;
            j = 0;
        }
        while (i != l) 
        {
            View view = c[i];
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            LayoutParams.a(layoutparams, c(abh1, abm1, b(view)));
            if (byte0 == -1 && LayoutParams.b(layoutparams) > 1)
            {
                LayoutParams.b(layoutparams, j - (LayoutParams.b(layoutparams) - 1));
            } else
            {
                LayoutParams.b(layoutparams, j);
            }
            j += LayoutParams.b(layoutparams) * byte0;
            i += k;
        }
    }

    private void a(View view, int i, int j, boolean flag)
    {
        RecyclerView.LayoutParams layoutparams;
        int k;
label0:
        {
            a(view, p);
            layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
            if (!flag)
            {
                k = i;
                if (f != 1)
                {
                    break label0;
                }
            }
            k = a(i, layoutparams.leftMargin + p.left, layoutparams.rightMargin + p.right);
        }
label1:
        {
            if (!flag)
            {
                i = j;
                if (f != 0)
                {
                    break label1;
                }
            }
            i = a(j, layoutparams.topMargin + p.top, layoutparams.bottomMargin + p.bottom);
        }
        view.measure(k, i);
    }

    private int b(abh abh1, abm abm1, int i)
    {
        int j;
        if (!abm1.f)
        {
            j = e.b(i, a);
        } else
        {
            int l = d.get(i, -1);
            j = l;
            if (l == -1)
            {
                int k = abh1.a(i);
                if (k == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i).toString());
                    return 0;
                } else
                {
                    return e.b(k, a);
                }
            }
        }
        return j;
    }

    private int c(abh abh1, abm abm1, int i)
    {
        int j;
        if (!abm1.f)
        {
            j = e.a(i);
        } else
        {
            int l = o.get(i, -1);
            j = l;
            if (l == -1)
            {
                int k = abh1.a(i);
                if (k == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i).toString());
                    return 1;
                } else
                {
                    return e.a(k);
                }
            }
        }
        return j;
    }

    private static int h(int i)
    {
        if (i < 0)
        {
            return m;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(i, 0x40000000);
        }
    }

    public final int a(abh abh1, abm abm1)
    {
        if (f == 0)
        {
            return a;
        }
        if (abm1.b() <= 0)
        {
            return 0;
        } else
        {
            return a(abh1, abm1, abm1.b() - 1);
        }
    }

    public final RecyclerView.LayoutParams a()
    {
        return new LayoutParams();
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

    final View a(abh abh1, abm abm1, int i, int j, int k)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                j();
                int i1 = g.b();
                int j1 = g.c();
                int l;
                if (j > i)
                {
                    l = 1;
                } else
                {
                    l = -1;
                }
                view1 = null;
                while (i != j) 
                {
                    View view2 = d(i);
                    int k1 = b(view2);
                    if (k1 >= 0 && k1 < k && b(abh1, abm1, k1) == 0)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).c.n())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (g.a(view2) < j1)
                            {
                                view3 = view2;
                                if (g.b(view2) >= i1)
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
                    i += l;
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

    public final void a(aac aac1)
    {
        e = aac1;
    }

    public void a(abh abh1, abm abm1, aaf aaf1)
    {
        int j = 0;
        super.a(abh1, abm1, aaf1);
        int i;
        int k;
        int i1;
        int j1;
        if (super.f == 1)
        {
            i = q() - u() - s();
        } else
        {
            i = r() - v() - t();
        }
        if (b == null || b.length != a + 1 || b[b.length - 1] != i)
        {
            b = new int[a + 1];
        }
        b[0] = 0;
        i1 = i / a;
        j1 = i % a;
        k = 1;
        i = 0;
        while (k <= a) 
        {
            i += j1;
            int l;
            if (i > 0 && a - i < j1)
            {
                i -= a;
                l = i1 + 1;
            } else
            {
                l = i1;
            }
            j += l;
            b[k] = j;
            k++;
        }
        if (abm1.b() > 0 && !abm1.f)
        {
            for (i = b(abh1, abm1, aaf1.a); i > 0 && aaf1.a > 0; i = b(abh1, abm1, aaf1.a))
            {
                aaf1.a = aaf1.a - 1;
            }

        }
        if (c == null || c.length != a)
        {
            c = new View[a];
        }
    }

    final void a(abh abh1, abm abm1, aah aah1, aag aag1)
    {
        int i;
        int j;
        int l1;
        boolean flag1;
        if (aah1.e == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        j = 0;
        i = a;
        l1 = j;
        if (!flag1)
        {
            i = b(abh1, abm1, aah1.d) + c(abh1, abm1, aah1.d);
            l1 = j;
        }
        do
        {
            if (l1 >= a || !aah1.a(abm1) || i <= 0)
            {
                break;
            }
            j = aah1.d;
            int k = c(abh1, abm1, j);
            if (k > a)
            {
                throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(j).append(" requires ").append(k).append(" spans but GridLayoutManager has only ").append(a).append(" spans.").toString());
            }
            i -= k;
            if (i < 0)
            {
                break;
            }
            View view = aah1.a(abh1);
            if (view == null)
            {
                break;
            }
            c[l1] = view;
            l1++;
        } while (true);
        if (l1 == 0)
        {
            aag1.b = true;
            return;
        }
        i = 0;
        a(abh1, abm1, l1, flag1);
        j = 0;
        while (j < l1) 
        {
            abh1 = c[j];
            int l;
            if (aah1.j == null)
            {
                if (flag1)
                {
                    super.a(abh1, -1, false);
                } else
                {
                    super.a(abh1, 0, false);
                }
            } else
            if (flag1)
            {
                super.a(abh1, -1, true);
            } else
            {
                super.a(abh1, 0, true);
            }
            abm1 = (LayoutParams)abh1.getLayoutParams();
            l = android.view.View.MeasureSpec.makeMeasureSpec(b[LayoutParams.a(abm1) + LayoutParams.b(abm1)] - b[LayoutParams.a(abm1)], 0x40000000);
            if (f == 1)
            {
                a(((View) (abh1)), l, h(((LayoutParams) (abm1)).height), false);
            } else
            {
                a(((View) (abh1)), h(((LayoutParams) (abm1)).width), l, false);
            }
            l = g.c(abh1);
            if (l > i)
            {
                i = l;
            }
            j++;
        }
        int i1 = h(i);
        j = 0;
        while (j < l1) 
        {
            abh1 = c[j];
            if (g.c(abh1) != i)
            {
                abm1 = (LayoutParams)abh1.getLayoutParams();
                int j1 = android.view.View.MeasureSpec.makeMeasureSpec(b[LayoutParams.a(abm1) + LayoutParams.b(abm1)] - b[LayoutParams.a(abm1)], 0x40000000);
                if (f == 1)
                {
                    a(((View) (abh1)), j1, i1, true);
                } else
                {
                    a(((View) (abh1)), i1, j1, true);
                }
            }
            j++;
        }
        aag1.a = i;
        i1 = 0;
        int k1 = 0;
        int i2;
        boolean flag;
        if (f == 1)
        {
            if (aah1.f == -1)
            {
                k1 = aah1.b;
                i = k1 - i;
                j = 0;
            } else
            {
                j = aah1.b;
                k1 = j + i;
                i = j;
                j = 0;
            }
        } else
        if (aah1.f == -1)
        {
            j = aah1.b;
            i1 = j - i;
            i = 0;
        } else
        {
            i1 = aah1.b;
            j = i + i1;
            i = 0;
        }
        flag = false;
        i2 = i;
        i = ((flag) ? 1 : 0);
        while (i < l1) 
        {
            abh1 = c[i];
            abm1 = (LayoutParams)abh1.getLayoutParams();
            if (f == 1)
            {
                i1 = s() + b[LayoutParams.a(abm1)];
                j = g.d(abh1) + i1;
            } else
            {
                k1 = t();
                i2 = b[LayoutParams.a(abm1)] + k1;
                k1 = g.d(abh1) + i2;
            }
            a(((View) (abh1)), ((LayoutParams) (abm1)).leftMargin + i1, ((LayoutParams) (abm1)).topMargin + i2, j - ((LayoutParams) (abm1)).rightMargin, k1 - ((LayoutParams) (abm1)).bottomMargin);
            if (((RecyclerView.LayoutParams) (abm1)).c.n() || ((RecyclerView.LayoutParams) (abm1)).c.t())
            {
                aag1.c = true;
            }
            aag1.d = aag1.d | abh1.isFocusable();
            i++;
        }
        Arrays.fill(c, null);
    }

    public final void a(abh abh1, abm abm1, View view, nb nb1)
    {
        boolean flag2 = false;
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.a(view, nb1);
            return;
        }
        view = (LayoutParams)layoutparams;
        int i = a(abh1, abm1, ((RecyclerView.LayoutParams) (view)).c.c());
        if (f == 0)
        {
            int j = ((LayoutParams) (view)).a;
            int l = ((LayoutParams) (view)).b;
            boolean flag;
            if (a > 1 && ((LayoutParams) (view)).b == a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            nb1.a(nn.a(j, l, i, 1, flag));
            return;
        }
        int k = ((LayoutParams) (view)).a;
        int i1 = ((LayoutParams) (view)).b;
        boolean flag1 = flag2;
        if (a > 1)
        {
            flag1 = flag2;
            if (((LayoutParams) (view)).b == a)
            {
                flag1 = true;
            }
        }
        nb1.a(nn.a(i, 1, k, i1, flag1));
    }

    public void a(RecyclerView recyclerview)
    {
        e.a.clear();
    }

    public void a(RecyclerView recyclerview, int i, int j)
    {
        e.a.clear();
    }

    public void a(RecyclerView recyclerview, int i, int j, int k)
    {
        e.a.clear();
    }

    public final boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int b(abh abh1, abm abm1)
    {
        if (f == 1)
        {
            return a;
        }
        if (abm1.b() <= 0)
        {
            return 0;
        } else
        {
            return a(abh1, abm1, abm1.b() - 1);
        }
    }

    public final aac b()
    {
        return e;
    }

    public void b(RecyclerView recyclerview, int i, int j)
    {
        e.a.clear();
    }

    public final int c()
    {
        return a;
    }

    public final void c(abh abh1, abm abm1)
    {
        if (abm1.f)
        {
            int j = p();
            for (int i = 0; i < j; i++)
            {
                LayoutParams layoutparams = (LayoutParams)d(i).getLayoutParams();
                int k = ((RecyclerView.LayoutParams) (layoutparams)).c.c();
                o.put(k, layoutparams.b);
                d.put(k, layoutparams.a);
            }

        }
        super.c(abh1, abm1);
        o.clear();
        d.clear();
        if (!abm1.f)
        {
            n = false;
        }
    }

    public final void c(RecyclerView recyclerview, int i, int j)
    {
        e.a.clear();
    }

    public final boolean d()
    {
        return i == null && !n;
    }


    private class LayoutParams extends RecyclerView.LayoutParams
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

}
