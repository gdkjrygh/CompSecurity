// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import java.util.Arrays;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, s, t, bf, 
//            az, ad, bi, y, 
//            x, w

public final class GridLayoutManager extends LinearLayoutManager
{

    static final int a = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    boolean b;
    int c;
    int d[];
    View e[];
    final SparseIntArray f = new SparseIntArray();
    final SparseIntArray g = new SparseIntArray();
    t h;
    final Rect i = new Rect();

    public GridLayoutManager(int j)
    {
        b = false;
        c = -1;
        h = new s();
        if (j != c)
        {
            b = true;
            if (j <= 0)
            {
                throw new IllegalArgumentException((new StringBuilder("Span count should be at least 1. Provided ")).append(j).toString());
            }
            c = j;
            h.a.clear();
        }
    }

    private int a(az az1, bf bf1, int j)
    {
        if (!bf1.a())
        {
            return h.c(j, c);
        }
        int k = az1.a(j);
        if (k == -1)
        {
            Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. ")).append(j).toString());
            return 0;
        } else
        {
            return h.c(k, c);
        }
    }

    private void a(az az1, bf bf1, int j, boolean flag)
    {
        int k;
        int l;
        int i1;
        byte byte0;
        if (flag)
        {
            l = 1;
            boolean flag1 = false;
            i1 = j;
            j = ((flag1) ? 1 : 0);
        } else
        {
            j--;
            l = -1;
            i1 = -1;
        }
        if (this.j == 1 && j())
        {
            k = c;
            byte0 = -1;
            k--;
        } else
        {
            byte0 = 1;
            k = 0;
        }
        while (j != i1) 
        {
            View view = e[j];
            LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
            LayoutParams.a(layoutparams, b(az1, bf1, e(view)));
            if (byte0 == -1 && LayoutParams.b(layoutparams) > 1)
            {
                LayoutParams.b(layoutparams, k - (LayoutParams.b(layoutparams) - 1));
            } else
            {
                LayoutParams.b(layoutparams, k);
            }
            k += LayoutParams.b(layoutparams) * byte0;
            j += l;
        }
    }

    private void a(View view, int j, int k)
    {
        a(view, i);
        RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)view.getLayoutParams();
        view.measure(b(j, layoutparams.leftMargin + i.left, layoutparams.rightMargin + i.right), b(k, layoutparams.topMargin + i.top, layoutparams.bottomMargin + i.bottom));
    }

    private static int b(int j, int k, int l)
    {
        int i1;
        if (k != 0 || l != 0)
        {
            if ((i1 = android.view.View.MeasureSpec.getMode(j)) == 0x80000000 || i1 == 0x40000000)
            {
                return android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(j) - k - l, i1);
            }
        }
        return j;
    }

    private int b(az az1, bf bf1, int j)
    {
        int k;
        if (!bf1.a())
        {
            k = h.a(j);
        } else
        {
            int i1 = f.get(j, -1);
            k = i1;
            if (i1 == -1)
            {
                int l = az1.a(j);
                if (l == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(j).toString());
                    return 1;
                } else
                {
                    return h.a(l);
                }
            }
        }
        return k;
    }

    private static int g(int j)
    {
        if (j < 0)
        {
            return a;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        }
    }

    public final int a(az az1, bf bf1)
    {
        if (j == 0)
        {
            return c;
        }
        if (bf1.e() <= 0)
        {
            return 0;
        } else
        {
            return a(az1, bf1, bf1.e() - 1);
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

    final View a(int j, int k, int l)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                k();
                int j1 = this.k.c();
                int k1 = this.k.d();
                int i1;
                if (k > j)
                {
                    i1 = 1;
                } else
                {
                    i1 = -1;
                }
                view1 = null;
                while (j != k) 
                {
                    View view2 = c(j);
                    int l1 = e(view2);
                    if (l1 >= 0 && l1 < l && h.b(l1, c) == 0)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).a.n())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (this.k.a(view2) < k1)
                            {
                                view3 = view2;
                                if (this.k.b(view2) >= j1)
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
                    j += i1;
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
        h.a.clear();
    }

    public final void a(int j, int k)
    {
        h.a.clear();
    }

    final void a(az az1, bf bf1, y y1, x x1)
    {
        int j;
        int i2;
        int l2;
        boolean flag1;
        int l;
        if (y1.e == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        l = 0;
        j = c;
        l2 = l;
        if (flag1) goto _L2; else goto _L1
_L1:
        i2 = y1.d;
        if (bf1.a()) goto _L4; else goto _L3
_L3:
        j = h.b(i2, c);
_L7:
        j += b(az1, bf1, y1.d);
        l2 = l;
_L2:
        if (l2 >= c || !y1.a(bf1) || j <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        l = y1.d;
        int j1 = b(az1, bf1, l);
        if (j1 > c)
        {
            throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(l).append(" requires ").append(j1).append(" spans but GridLayoutManager has only ").append(c).append(" spans.").toString());
        }
        j -= j1;
        if (j < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        View view = y1.a(az1);
        if (view == null)
        {
            break; /* Loop/switch isn't completed */
        }
        e[l2] = view;
        l2++;
        continue; /* Loop/switch isn't completed */
_L4:
        j1 = g.get(i2, -1);
        j = j1;
        if (j1 == -1)
        {
            j = az1.a(i2);
            if (j == -1)
            {
                Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(i2).toString());
                j = 0;
            } else
            {
                j = h.b(j, c);
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L2; else goto _L5
_L5:
        if (l2 == 0)
        {
            x1.b = true;
            return;
        }
        int k = 0;
        a(az1, bf1, l2, flag1);
        int i1 = 0;
        while (i1 < l2) 
        {
            az1 = e[i1];
            int k1;
            if (y1.k == null)
            {
                if (flag1)
                {
                    c(az1);
                } else
                {
                    d(az1);
                }
            } else
            if (flag1)
            {
                a(((View) (az1)));
            } else
            {
                b(az1);
            }
            bf1 = (LayoutParams)az1.getLayoutParams();
            k1 = android.view.View.MeasureSpec.makeMeasureSpec(d[LayoutParams.a(bf1) + LayoutParams.b(bf1)] - d[LayoutParams.a(bf1)], 0x40000000);
            if (this.j == 1)
            {
                a(((View) (az1)), k1, g(((LayoutParams) (bf1)).height));
            } else
            {
                a(((View) (az1)), g(((LayoutParams) (bf1)).width), k1);
            }
            k1 = this.k.c(az1);
            if (k1 > k)
            {
                k = k1;
            }
            i1++;
        }
        int l1 = g(k);
        i1 = 0;
        while (i1 < l2) 
        {
            az1 = e[i1];
            if (this.k.c(az1) != k)
            {
                bf1 = (LayoutParams)az1.getLayoutParams();
                int j2 = android.view.View.MeasureSpec.makeMeasureSpec(d[LayoutParams.a(bf1) + LayoutParams.b(bf1)] - d[LayoutParams.a(bf1)], 0x40000000);
                if (this.j == 1)
                {
                    a(((View) (az1)), j2, l1);
                } else
                {
                    a(((View) (az1)), l1, j2);
                }
            }
            i1++;
        }
        x1.a = k;
        l1 = 0;
        int k2 = 0;
        int i3;
        boolean flag;
        if (this.j == 1)
        {
            if (y1.f == -1)
            {
                k2 = y1.b;
                k = k2 - k;
                i1 = 0;
            } else
            {
                i1 = y1.b;
                k2 = i1 + k;
                k = i1;
                i1 = 0;
            }
        } else
        if (y1.f == -1)
        {
            i1 = y1.b;
            l1 = i1 - k;
            k = 0;
        } else
        {
            l1 = y1.b;
            i1 = k + l1;
            k = 0;
        }
        flag = false;
        i3 = k;
        k = ((flag) ? 1 : 0);
        while (k < l2) 
        {
            az1 = e[k];
            bf1 = (LayoutParams)az1.getLayoutParams();
            if (this.j == 1)
            {
                l1 = u() + d[LayoutParams.a(bf1)];
                i1 = this.k.d(az1) + l1;
            } else
            {
                k2 = v();
                i3 = d[LayoutParams.a(bf1)] + k2;
                k2 = this.k.d(az1) + i3;
            }
            a(((View) (az1)), ((LayoutParams) (bf1)).leftMargin + l1, ((LayoutParams) (bf1)).topMargin + i3, i1 - ((LayoutParams) (bf1)).rightMargin, k2 - ((LayoutParams) (bf1)).bottomMargin);
            if (((RecyclerView.LayoutParams) (bf1)).a.n() || ((RecyclerView.LayoutParams) (bf1)).a.l())
            {
                x1.c = true;
            }
            x1.d = x1.d | az1.isFocusable();
            k++;
        }
        Arrays.fill(e, null);
        return;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void a(az az1, bf bf1, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.a(view, accessibilitynodeinfocompat);
            return;
        }
        view = (LayoutParams)layoutparams;
        int j = a(az1, bf1, ((RecyclerView.LayoutParams) (view)).a.c());
        if (this.j == 0)
        {
            int k = view.a();
            int i1 = view.b();
            boolean flag;
            if (c > 1 && view.b() == c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(k, i1, j, 1, flag, false));
            return;
        }
        int l = view.a();
        int j1 = view.b();
        boolean flag1;
        if (c > 1 && view.b() == c)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        accessibilitynodeinfocompat.setCollectionItemInfo(android.support.v4.view.accessibility.AccessibilityNodeInfoCompat.CollectionItemInfoCompat.obtain(j, 1, l, j1, flag1, false));
    }

    final void a(bf bf1, w w1)
    {
        int k = 0;
        super.a(bf1, w1);
        int j;
        int l;
        int j1;
        int k1;
        if (super.j == 1)
        {
            j = s() - w() - u();
        } else
        {
            j = t() - x() - v();
        }
        if (d == null || d.length != c + 1 || d[d.length - 1] != j)
        {
            d = new int[c + 1];
        }
        d[0] = 0;
        j1 = j / c;
        k1 = j % c;
        l = 1;
        j = 0;
        while (l <= c) 
        {
            j += k1;
            int i1;
            if (j > 0 && c - j < k1)
            {
                j -= c;
                i1 = j1 + 1;
            } else
            {
                i1 = j1;
            }
            k += i1;
            d[l] = k;
            l++;
        }
        if (bf1.e() > 0 && !bf1.a())
        {
            for (j = h.b(w1.a, c); j > 0 && w1.a > 0; j = h.b(w1.a, c))
            {
                w1.a = w1.a - 1;
            }

        }
        if (e == null || e.length != c)
        {
            e = new View[c];
        }
    }

    public final void a(t t1)
    {
        h = t1;
    }

    public final boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int b(az az1, bf bf1)
    {
        if (j == 1)
        {
            return c;
        }
        if (bf1.e() <= 0)
        {
            return 0;
        } else
        {
            return a(az1, bf1, bf1.e() - 1);
        }
    }

    public final RecyclerView.LayoutParams b()
    {
        return new LayoutParams();
    }

    public final void b(int j, int k)
    {
        h.a.clear();
    }

    public final t c()
    {
        return h;
    }

    public final void c(int j, int k)
    {
        h.a.clear();
    }

    public final void c(az az1, bf bf1)
    {
        if (bf1.a())
        {
            int k = r();
            for (int j = 0; j < k; j++)
            {
                LayoutParams layoutparams = (LayoutParams)c(j).getLayoutParams();
                int l = ((RecyclerView.LayoutParams) (layoutparams)).a.c();
                f.put(l, layoutparams.b());
                g.put(l, layoutparams.a());
            }

        }
        super.c(az1, bf1);
        f.clear();
        g.clear();
        if (!bf1.a())
        {
            b = false;
        }
    }

    public final int d()
    {
        return c;
    }

    public final void d(int j, int k)
    {
        h.a.clear();
    }

    public final boolean e()
    {
        return o == null && !b;
    }


    private class LayoutParams extends RecyclerView.LayoutParams
    {

        private int e;
        private int f;

        static int a(LayoutParams layoutparams)
        {
            return layoutparams.e;
        }

        static int a(LayoutParams layoutparams, int j)
        {
            layoutparams.f = j;
            return j;
        }

        static int b(LayoutParams layoutparams)
        {
            return layoutparams.f;
        }

        static int b(LayoutParams layoutparams, int j)
        {
            layoutparams.e = j;
            return j;
        }

        public final int a()
        {
            return e;
        }

        public final int b()
        {
            return f;
        }

        public LayoutParams()
        {
            super(-2, -2);
            e = -1;
            f = 0;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            e = -1;
            f = 0;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            e = -1;
            f = 0;
        }

        public LayoutParams(android.view.ViewGroup.MarginLayoutParams marginlayoutparams)
        {
            super(marginlayoutparams);
            e = -1;
            f = 0;
        }
    }

}
