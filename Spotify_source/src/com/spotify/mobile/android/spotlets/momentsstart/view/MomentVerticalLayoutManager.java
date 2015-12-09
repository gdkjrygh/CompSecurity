// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.view;

import aav;
import abd;
import abh;
import abk;
import abm;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;
import dhq;
import evf;

public final class MomentVerticalLayoutManager extends abd
    implements dhq
{

    public int a;
    private int b;
    private int c;
    private int d;
    private ScrollDirection e;
    private int f;
    private boolean g;

    public MomentVerticalLayoutManager()
    {
    }

    private void a(LayoutDirections layoutdirections, int i, abh abh1, abm abm1)
    {
        boolean flag = false;
        SparseArray sparsearray = new SparseArray(p());
        i = t() + i;
        if (p() != 0)
        {
            int j = h(d(0));
            int l = layoutdirections.mShift;
            int j1 = c;
            for (i = 0; i < p(); i++)
            {
                sparsearray.put(a + i, d(i));
            }

            for (i = 0; i < sparsearray.size(); i++)
            {
                c((View)sparsearray.valueAt(i));
            }

            i = j + l * j1;
        }
        a = a + layoutdirections.mShift;
        int i1 = 0;
        int k = i;
        i = i1;
        do
        {
            i1 = ((flag) ? 1 : 0);
            if (i >= 3)
            {
                break;
            }
            int k1 = a + i;
            i1 = ((flag) ? 1 : 0);
            if (k1 >= abm1.b())
            {
                break;
            }
            layoutdirections = (View)sparsearray.get(k1);
            if (layoutdirections == null)
            {
                layoutdirections = abh1.b(k1);
                a(((View) (layoutdirections)));
                layoutdirections.measure(android.view.View.MeasureSpec.makeMeasureSpec(b, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(c, 0x40000000));
                a(((View) (layoutdirections)), 0, k, b + 0, c + k);
            } else
            {
                d(layoutdirections);
                sparsearray.remove(k1);
            }
            k += c;
            i++;
        } while (true);
        for (; i1 < sparsearray.size(); i1++)
        {
            abh1.a((View)sparsearray.valueAt(i1));
        }

    }

    private void a(LayoutDirections layoutdirections, abh abh1, abm abm1)
    {
        a(layoutdirections, 0, abh1, abm1);
    }

    private int b()
    {
        int i = 0;
        int j = 0x7fffffff;
        int k = 0;
        while (i < p()) 
        {
            View view = d(i);
            int l = h(view);
            int i1 = (j(view) - h(view)) / 2;
            i1 = Math.abs((t() + (r() - t() - t()) / 2) - (i1 + l));
            l = j;
            if (i1 < j)
            {
                k = i;
                l = i1;
            }
            i++;
            j = l;
        }
        return k;
    }

    private int h(int i)
    {
        return d(i).getTop() - t();
    }

    public final int a(int i, int j)
    {
        if (Math.abs(j) < 1500)
        {
            return b() + a;
        }
        if (j > 0)
        {
            d = d + 1;
        } else
        {
            d = d - 1;
        }
        if (d < 0)
        {
            d = 0;
        }
        if (d > w() - 1)
        {
            d = w() - 1;
        }
        return d;
    }

    public final android.support.v7.widget.RecyclerView.LayoutParams a()
    {
        return new android.support.v7.widget.RecyclerView.LayoutParams();
    }

    public final void a(aav aav, aav aav1)
    {
        o();
    }

    public final void a(abh abh1, abm abm1, int i, int j)
    {
        int l = android.view.View.MeasureSpec.getMode(i);
        int k = android.view.View.MeasureSpec.getMode(j);
        i = android.view.View.MeasureSpec.getSize(i);
        j = android.view.View.MeasureSpec.getSize(j);
        switch (l)
        {
        default:
            i = x();
            // fall through

        case -2147483648: 
        case 1073741824: 
            switch (k)
            {
            default:
                j = y();
                // fall through

            case -2147483648: 
            case 1073741824: 
                b(i, j);
                break;
            }
            break;
        }
        b = i - s() - u();
        c = j - t() - v();
    }

    public final void a(RecyclerView recyclerview)
    {
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (i >= w())
        {
            return;
        } else
        {
            recyclerview = new evf(recyclerview.getContext()) {

                public final int a(int j, int k, int l, int i1, int j1)
                {
                    return ((i1 - l - (k - j)) / 2 + l) - j;
                }

            };
            recyclerview.b(i);
            a(((abk) (recyclerview)));
            d = i;
            return;
        }
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        while (p() == 0 || i > d) 
        {
            return;
        }
        d = d + j;
    }

    public final void a(RecyclerView recyclerview, int i, int j, int k)
    {
        if (i + k < d)
        {
            if (j > d)
            {
                d = d - k;
            }
        } else
        {
            if (i <= d && i + k >= d)
            {
                d = d + (j - i);
                return;
            }
            if (i > d && j <= d)
            {
                d = d + k;
                return;
            }
        }
    }

    public final boolean a(int i)
    {
        View view = d(i - a);
        return view == null || h(view) != 0;
    }

    public final int b(int i, abh abh1, abm abm1)
    {
        View view;
        boolean flag;
        boolean flag1;
        int k = 1;
        if (p() == 0)
        {
            return 0;
        }
        View view1;
        int j;
        int i1;
        int k1;
        if (i > 0)
        {
            e = ScrollDirection.b;
        } else
        if (i < 0)
        {
            e = ScrollDirection.c;
        } else
        {
            e = ScrollDirection.a;
        }
        view = d(0);
        if (p() > 0 && d > 0)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        i1 = a + j;
        view1 = d(j);
        k1 = d;
        if (a == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (a > 0 && p() < 3)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (g && k1 - 1 >= i1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (!g || k1 + 1 > i1)
        {
            k = 0;
        }
        if (i > 0)
        {
            if (k != 0 || flag1)
            {
                j = r();
                k = v();
                int j1 = j(view1);
                j = Math.max(-i, j - k - j1);
            } else
            {
                j = -i;
            }
        } else
        if (j != 0 || flag)
        {
            j = -h(view1);
            int l = t();
            j = Math.min(-i, j + l);
        } else
        {
            j = -i;
        }
        f(j);
        if (i <= 0) goto _L2; else goto _L1
_L1:
        if (j(view) >= t() || flag1) goto _L4; else goto _L3
_L3:
        a(LayoutDirections.c, abh1, abm1);
_L6:
        f = f - j;
        return -j;
_L4:
        if (!flag1)
        {
            a(LayoutDirections.a, abh1, abm1);
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (h(view) > t() && !flag)
        {
            a(LayoutDirections.b, abh1, abm1);
        } else
        if (!flag)
        {
            a(LayoutDirections.a, abh1, abm1);
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void b(RecyclerView recyclerview, int i, int j)
    {
        if (p() != 0)
        {
            if ((i + j) - 1 < d)
            {
                d = d - j;
                return;
            }
            if (i <= d && i + j >= d && d > w() - 1)
            {
                d = w() - 1;
                return;
            }
        }
    }

    public final int c()
    {
        return d;
    }

    public final void c(int i)
    {
        if (i >= w())
        {
            return;
        } else
        {
            a = Math.max(i - 1, 0);
            d = i;
            m();
            return;
        }
    }

    public final void c(abh abh1, abm abm1)
    {
        if (w() == 0)
        {
            a(abh1);
            return;
        }
        int i = 0;
        if (d > w() - 1)
        {
            d = w() - 1;
        }
        int j;
        if (d != 0)
        {
            a = d - 1;
            i = 0 - c;
        } else
        {
            a = d;
        }
        j = i;
        if (p() != 0)
        {
            if (!g)
            {
                int l = b();
                int k = h(l);
                if (e == ScrollDirection.c && k > 0 && l > 0)
                {
                    j = h(l - 1);
                } else
                {
                    j = k;
                    if (e == ScrollDirection.b)
                    {
                        j = k;
                        if (k < 0)
                        {
                            j = k;
                            if (l < p() - 1)
                            {
                                j = h(l + 1);
                            }
                        }
                    }
                }
                j = i + j % c;
            } else
            {
                j = i - f;
            }
        }
        a(abh1);
        a(LayoutDirections.a, j, abh1, abm1);
    }

    public final void g(int i)
    {
        boolean flag = true;
        super.g(i);
        if (i != 1)
        {
            flag = false;
        }
        g = flag;
        if (g)
        {
            f = 0;
        }
        if (i == 0)
        {
            e = ScrollDirection.a;
        }
    }

    public final boolean g()
    {
        return true;
    }

    public final int h()
    {
        return d;
    }

    private class LayoutDirections extends Enum
    {

        public static final LayoutDirections a;
        public static final LayoutDirections b;
        public static final LayoutDirections c;
        private static final LayoutDirections d[];
        int mShift;

        public static LayoutDirections valueOf(String s)
        {
            return (LayoutDirections)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/view/MomentVerticalLayoutManager$LayoutDirections, s);
        }

        public static LayoutDirections[] values()
        {
            return (LayoutDirections[])d.clone();
        }

        static 
        {
            a = new LayoutDirections("NONE", 0, 0);
            b = new LayoutDirections("START", 1, -1);
            c = new LayoutDirections("END", 2, 1);
            d = (new LayoutDirections[] {
                a, b, c
            });
        }

        private LayoutDirections(String s, int i, int j)
        {
            super(s, i);
            mShift = j;
        }
    }


    private class ScrollDirection extends Enum
    {

        public static final ScrollDirection a;
        public static final ScrollDirection b;
        public static final ScrollDirection c;
        private static final ScrollDirection d[];

        public static ScrollDirection valueOf(String s)
        {
            return (ScrollDirection)Enum.valueOf(com/spotify/mobile/android/spotlets/momentsstart/view/MomentVerticalLayoutManager$ScrollDirection, s);
        }

        public static ScrollDirection[] values()
        {
            return (ScrollDirection[])d.clone();
        }

        static 
        {
            a = new ScrollDirection("NONE", 0);
            b = new ScrollDirection("START", 1);
            c = new ScrollDirection("END", 2);
            d = (new ScrollDirection[] {
                a, b, c
            });
        }

        private ScrollDirection(String s, int i)
        {
            super(s, i);
        }
    }

}
