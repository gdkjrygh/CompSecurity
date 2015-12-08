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
//            LinearLayoutManager, q

public final class GridLayoutManager extends LinearLayoutManager
{
    public static class LayoutParams extends RecyclerView.LayoutParams
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

    public static final class a extends b
    {

        public final int a(int j)
        {
            return 1;
        }

        public final int a(int j, int k)
        {
            return j % k;
        }

        public a()
        {
        }
    }

    public static abstract class b
    {

        final SparseIntArray a = new SparseIntArray();
        private boolean b;

        public abstract int a(int j);

        public int a(int j, int k)
        {
            int j2 = a(j);
            if (j2 != k) goto _L2; else goto _L1
_L1:
            return 0;
_L2:
            int l;
            int i1;
            if (!b || a.size() <= 0)
            {
                break MISSING_BLOCK_LABEL_216;
            }
            i1 = a.size() - 1;
            for (l = 0; l <= i1;)
            {
                int j1 = l + i1 >>> 1;
                if (a.keyAt(j1) < j)
                {
                    l = j1 + 1;
                } else
                {
                    i1 = j1 - 1;
                }
            }

            l--;
            int k1;
            if (l >= 0 && l < a.size())
            {
                l = a.keyAt(l);
            } else
            {
                l = -1;
            }
            if (l < 0)
            {
                break MISSING_BLOCK_LABEL_216;
            }
            i1 = a.get(l) + a(l);
            k1 = l + 1;
            l = i1;
            i1 = k1;
_L4:
            do
            {
                if (i1 >= j)
                {
                    continue; /* Loop/switch isn't completed */
                }
                int l1 = a(i1);
                int i2 = l + l1;
                if (i2 == k)
                {
                    l = 0;
                } else
                {
                    l = l1;
                    if (i2 <= k)
                    {
                        l = i2;
                    }
                }
                i1++;
            } while (true);
            if (l + j2 > k) goto _L1; else goto _L3
_L3:
            return l;
            i1 = 0;
            l = 0;
              goto _L4
        }

        final int b(int j, int k)
        {
            int l;
            if (!b)
            {
                l = a(j, k);
            } else
            {
                int i1 = a.get(j, -1);
                l = i1;
                if (i1 == -1)
                {
                    k = a(j, k);
                    a.put(j, k);
                    return k;
                }
            }
            return l;
        }

        public final int c(int j, int k)
        {
            int i2 = a(j);
            int j1 = 0;
            int l = 0;
            int i1 = 0;
            while (j1 < j) 
            {
                int k1 = a(j1);
                i1 += k1;
                if (i1 == k)
                {
                    i1 = l + 1;
                    l = 0;
                } else
                if (i1 > k)
                {
                    i1 = l + 1;
                    l = k1;
                } else
                {
                    int l1 = i1;
                    i1 = l;
                    l = l1;
                }
                k1 = j1 + 1;
                j1 = l;
                l = i1;
                i1 = j1;
                j1 = k1;
            }
            j = l;
            if (i1 + i2 > k)
            {
                j = l + 1;
            }
            return j;
        }

        public b()
        {
            b = false;
        }
    }


    static final int a = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
    boolean b;
    int c;
    int d[];
    View e[];
    final SparseIntArray f = new SparseIntArray();
    final SparseIntArray g = new SparseIntArray();
    b h;
    final Rect i = new Rect();

    public GridLayoutManager()
    {
        b = false;
        c = -1;
        h = new a();
        a(1);
    }

    private static int a(int j, int k, int l)
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

    private int a(RecyclerView.m m, RecyclerView.q q1, int j)
    {
        if (!q1.a())
        {
            return h.c(j, c);
        }
        int k = m.a(j);
        if (k == -1)
        {
            Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. ")).append(j).toString());
            return 0;
        } else
        {
            return h.c(k, c);
        }
    }

    private void a(RecyclerView.m m, RecyclerView.q q1, int j, boolean flag)
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
        if (this.j == 1 && h())
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
            LayoutParams.a(layoutparams, c(m, q1, e(view)));
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
        view.measure(a(j, layoutparams.leftMargin + i.left, layoutparams.rightMargin + i.right), a(k, layoutparams.topMargin + i.top, layoutparams.bottomMargin + i.bottom));
    }

    private int b(RecyclerView.m m, RecyclerView.q q1, int j)
    {
        int k;
        if (!q1.a())
        {
            k = h.b(j, c);
        } else
        {
            int i1 = g.get(j, -1);
            k = i1;
            if (i1 == -1)
            {
                int l = m.a(j);
                if (l == -1)
                {
                    Log.w("GridLayoutManager", (new StringBuilder("Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:")).append(j).toString());
                    return 0;
                } else
                {
                    return h.b(l, c);
                }
            }
        }
        return k;
    }

    private int c(RecyclerView.m m, RecyclerView.q q1, int j)
    {
        int k;
        if (!q1.a())
        {
            k = h.a(j);
        } else
        {
            int i1 = f.get(j, -1);
            k = i1;
            if (i1 == -1)
            {
                int l = m.a(j);
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

    private static int h(int j)
    {
        if (j < 0)
        {
            return a;
        } else
        {
            return android.view.View.MeasureSpec.makeMeasureSpec(j, 0x40000000);
        }
    }

    public final int a(RecyclerView.m m, RecyclerView.q q1)
    {
        if (j == 0)
        {
            return c;
        }
        if (q1.e() <= 0)
        {
            return 0;
        } else
        {
            return a(m, q1, q1.e() - 1);
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

    final View a(RecyclerView.m m, RecyclerView.q q1, int j, int k, int l)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                i();
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
                    View view2 = d(j);
                    int l1 = e(view2);
                    if (l1 >= 0 && l1 < l && b(m, q1, l1) == 0)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).a.m())
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

    public final void a(int j)
    {
        if (j == c)
        {
            return;
        }
        b = true;
        if (j <= 0)
        {
            throw new IllegalArgumentException((new StringBuilder("Span count should be at least 1. Provided ")).append(j).toString());
        } else
        {
            c = j;
            h.a.clear();
            return;
        }
    }

    public final void a(int j, int k)
    {
        h.a.clear();
    }

    public final void a(b b1)
    {
        h = b1;
    }

    final void a(RecyclerView.m m, RecyclerView.q q1, LinearLayoutManager.a a1)
    {
        int k = 0;
        super.a(m, q1, a1);
        int j;
        int l;
        int j1;
        int k1;
        if (super.j == 1)
        {
            j = q() - u() - s();
        } else
        {
            j = r() - v() - t();
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
        if (q1.e() > 0 && !q1.a())
        {
            for (j = b(m, q1, a1.a); j > 0 && a1.a > 0; j = b(m, q1, a1.a))
            {
                a1.a = a1.a - 1;
            }

        }
        if (e == null || e.length != c)
        {
            e = new View[c];
        }
    }

    final void a(RecyclerView.m m, RecyclerView.q q1, LinearLayoutManager.c c1, LinearLayoutManager.b b1)
    {
        int j;
        int k;
        int i2;
        boolean flag1;
        if (c1.e == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        k = 0;
        j = c;
        i2 = k;
        if (!flag1)
        {
            j = b(m, q1, c1.d) + c(m, q1, c1.d);
            i2 = k;
        }
        do
        {
            if (i2 >= c || !c1.a(q1) || j <= 0)
            {
                break;
            }
            k = c1.d;
            int l = c(m, q1, k);
            if (l > c)
            {
                throw new IllegalArgumentException((new StringBuilder("Item at position ")).append(k).append(" requires ").append(l).append(" spans but GridLayoutManager has only ").append(c).append(" spans.").toString());
            }
            j -= l;
            if (j < 0)
            {
                break;
            }
            View view = c1.a(m);
            if (view == null)
            {
                break;
            }
            e[i2] = view;
            i2++;
        } while (true);
        if (i2 == 0)
        {
            b1.b = true;
            return;
        }
        j = 0;
        a(m, q1, i2, flag1);
        k = 0;
        while (k < i2) 
        {
            m = e[k];
            int i1;
            if (c1.k == null)
            {
                if (flag1)
                {
                    c(m);
                } else
                {
                    d(m);
                }
            } else
            if (flag1)
            {
                a(((View) (m)));
            } else
            {
                b(m);
            }
            q1 = (LayoutParams)m.getLayoutParams();
            i1 = android.view.View.MeasureSpec.makeMeasureSpec(d[LayoutParams.a(q1) + LayoutParams.b(q1)] - d[LayoutParams.a(q1)], 0x40000000);
            if (this.j == 1)
            {
                a(((View) (m)), i1, h(((LayoutParams) (q1)).height));
            } else
            {
                a(((View) (m)), h(((LayoutParams) (q1)).width), i1);
            }
            i1 = this.k.c(m);
            if (i1 > j)
            {
                j = i1;
            }
            k++;
        }
        int j1 = h(j);
        k = 0;
        while (k < i2) 
        {
            m = e[k];
            if (this.k.c(m) != j)
            {
                q1 = (LayoutParams)m.getLayoutParams();
                int k1 = android.view.View.MeasureSpec.makeMeasureSpec(d[LayoutParams.a(q1) + LayoutParams.b(q1)] - d[LayoutParams.a(q1)], 0x40000000);
                if (this.j == 1)
                {
                    a(((View) (m)), k1, j1);
                } else
                {
                    a(((View) (m)), j1, k1);
                }
            }
            k++;
        }
        b1.a = j;
        j1 = 0;
        int l1 = 0;
        int j2;
        boolean flag;
        if (this.j == 1)
        {
            if (c1.f == -1)
            {
                l1 = c1.b;
                j = l1 - j;
                k = 0;
            } else
            {
                k = c1.b;
                l1 = k + j;
                j = k;
                k = 0;
            }
        } else
        if (c1.f == -1)
        {
            k = c1.b;
            j1 = k - j;
            j = 0;
        } else
        {
            j1 = c1.b;
            k = j + j1;
            j = 0;
        }
        flag = false;
        j2 = j;
        j = ((flag) ? 1 : 0);
        while (j < i2) 
        {
            m = e[j];
            q1 = (LayoutParams)m.getLayoutParams();
            if (this.j == 1)
            {
                j1 = s() + d[LayoutParams.a(q1)];
                k = this.k.d(m) + j1;
            } else
            {
                l1 = t();
                j2 = d[LayoutParams.a(q1)] + l1;
                l1 = this.k.d(m) + j2;
            }
            a(((View) (m)), ((LayoutParams) (q1)).leftMargin + j1, ((LayoutParams) (q1)).topMargin + j2, k - ((LayoutParams) (q1)).rightMargin, l1 - ((LayoutParams) (q1)).bottomMargin);
            if (((RecyclerView.LayoutParams) (q1)).a.m() || ((RecyclerView.LayoutParams) (q1)).a.k())
            {
                b1.c = true;
            }
            b1.d = b1.d | m.isFocusable();
            j++;
        }
        Arrays.fill(e, null);
    }

    public final void a(RecyclerView.m m, RecyclerView.q q1, View view, AccessibilityNodeInfoCompat accessibilitynodeinfocompat)
    {
        android.view.ViewGroup.LayoutParams layoutparams = view.getLayoutParams();
        if (!(layoutparams instanceof LayoutParams))
        {
            super.a(view, accessibilitynodeinfocompat);
            return;
        }
        view = (LayoutParams)layoutparams;
        int j = a(m, q1, ((RecyclerView.LayoutParams) (view)).a.c());
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

    public final boolean a(RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams instanceof LayoutParams;
    }

    public final int b(RecyclerView.m m, RecyclerView.q q1)
    {
        if (j == 1)
        {
            return c;
        }
        if (q1.e() <= 0)
        {
            return 0;
        } else
        {
            return a(m, q1, q1.e() - 1);
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

    public final int c()
    {
        return c;
    }

    public final void c(int j, int k)
    {
        h.a.clear();
    }

    public final void c(RecyclerView.m m, RecyclerView.q q1)
    {
        if (q1.a())
        {
            int k = p();
            for (int j = 0; j < k; j++)
            {
                LayoutParams layoutparams = (LayoutParams)d(j).getLayoutParams();
                int l = ((RecyclerView.LayoutParams) (layoutparams)).a.c();
                f.put(l, layoutparams.b());
                g.put(l, layoutparams.a());
            }

        }
        super.c(m, q1);
        f.clear();
        g.clear();
        if (!q1.a())
        {
            b = false;
        }
    }

    public final void d(int j, int k)
    {
        h.a.clear();
    }

    public final boolean d()
    {
        return o == null && !b;
    }

}
