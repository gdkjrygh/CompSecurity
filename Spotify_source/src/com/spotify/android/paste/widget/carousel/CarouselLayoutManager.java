// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.carousel;

import aav;
import abd;
import abh;
import abk;
import abm;
import abo;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import dgz;
import dha;
import dhb;
import dhc;
import dhd;
import dhe;
import dhg;
import dho;
import dhq;
import java.util.Iterator;
import java.util.LinkedList;
import km;

public class CarouselLayoutManager extends abd
    implements dhq
{

    private static final String b = com/spotify/android/paste/widget/carousel/CarouselLayoutManager.getSimpleName();
    public int a;
    private int c;
    private int d;
    private int e;
    private int f;
    private dho g;
    private int h;
    private boolean i;
    private boolean m;
    private boolean n;
    private final MeasureMode o;
    private boolean p;
    private final dhe q = new dhe((byte)0);
    private dhd r;
    private final SparseArray s = new SparseArray();
    private final LinkedList t = new LinkedList();
    private final dhg u = new dhg(this, (byte)0);

    public CarouselLayoutManager(MeasureMode measuremode)
    {
        h = -1;
        p = false;
        r = new dhc(this);
        if (measuremode == null)
        {
            throw new IllegalArgumentException("MeasureMode must not be null!");
        } else
        {
            o = measuremode;
            return;
        }
    }

    private int a(int i1, View view)
    {
        int j1 = -g(view);
        int k1 = s();
        int l1 = l(view);
        return Math.min(-i1, j1 + k1 + l1);
    }

    public static int a(CarouselLayoutManager carousellayoutmanager)
    {
        return carousellayoutmanager.k();
    }

    private void a(LayoutDirections layoutdirections, abh abh1, abm abm1)
    {
        int k1;
label0:
        {
            if (p() != 0)
            {
                if (!q.b)
                {
                    c(false);
                }
                for (int i1 = 0; i1 < p(); i1++)
                {
                    int i2 = e;
                    View view = d(i1);
                    s.put(i2 + i1, view);
                }

                for (int j1 = 0; j1 < s.size(); j1++)
                {
                    c((View)s.valueAt(j1));
                }

            }
            e = e + layoutdirections.mShift;
            int j2 = 0;
            k1 = -1;
            while (j2 < 3) 
            {
                int l2 = e + j2;
                if (l2 >= abm1.b() && !abm1.f)
                {
                    break;
                }
                layoutdirections = (View)s.get(l2);
                boolean flag;
                if (layoutdirections == null)
                {
                    layoutdirections = abh1.b(l2);
                    if (layoutdirections.getTag(0x7f1100e1) == null)
                    {
                        layoutdirections.setTag(0x7f1100e1, new dgz());
                    }
                    b(layoutdirections, j2);
                    t.add(layoutdirections);
                    a(layoutdirections, -1, false);
                } else
                {
                    t.add(layoutdirections);
                    s.remove(l2);
                    b(layoutdirections, j2);
                    a(layoutdirections, -1);
                }
                flag = k(layoutdirections);
                l2 = k();
                if (!flag)
                {
                    l2 = c;
                }
                layoutdirections.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(d, 0x40000000));
                if (((android.support.v7.widget.RecyclerView.LayoutParams)layoutdirections.getLayoutParams()).c.d() == q.c)
                {
                    k1 = j2;
                }
                j2++;
            }
            if (!n && q.a)
            {
                j2 = k1;
                if (k1 != -1)
                {
                    break label0;
                }
            }
            if (a > 0)
            {
                k1 = 1;
            } else
            {
                k1 = 0;
            }
            q.a = true;
            q.d = l((View)t.get(k1)) + s();
            q.b = false;
            j2 = k1;
        }
        k1 = q.d;
        for (j2--; j2 >= 0; j2--)
        {
            k1 -= ((View)t.get(j2)).getMeasuredWidth() + f;
        }

        layoutdirections = t.iterator();
        while (layoutdirections.hasNext()) 
        {
            abm1 = (View)layoutdirections.next();
            int k2 = t();
            int i3 = (r() - t() - v() - abm1.getMeasuredHeight()) / 2 + k2;
            boolean flag1 = k(abm1);
            k2 = k();
            if (!flag1)
            {
                k2 = c;
            }
            a(((View) (abm1)), k1, i3, k2 + k1, d + i3);
            k1 = abm1.getMeasuredWidth() + f + k1;
        }
        for (int l1 = 0; l1 < s.size(); l1++)
        {
            abh1.a((View)s.valueAt(l1));
        }

        layoutdirections = q;
        layoutdirections.a = false;
        layoutdirections.b = false;
        layoutdirections.c = -1;
        s.clear();
        t.clear();
        h(0);
    }

    private int b(int i1, View view)
    {
        int k1 = q();
        int l1 = u();
        int i2 = i(view);
        int j1;
        if (k(view))
        {
            j1 = 0;
        } else
        {
            j1 = r.a();
        }
        return Math.max(-i1, k1 - l1 - i2 - j1);
    }

    public static int b(CarouselLayoutManager carousellayoutmanager)
    {
        return carousellayoutmanager.c;
    }

    private void b(View view, int i1)
    {
        boolean flag = true;
        view = (dgz)view.getTag(0x7f1100e1);
        boolean flag1;
        if (g != null)
        {
            if (i1 == 0 && g.a() > 0 && a != 0)
            {
                view.c = -1;
                view.d = g.a();
            } else
            if (i1 == 2 && g.b() > 0)
            {
                view.c = 1;
                view.d = g.b();
            } else
            {
                view.c = 0;
            }
        } else
        {
            view.c = 0;
        }
        if (i1 == a - e)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (!((dgz) (view)).b && flag1)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        view.b = flag1;
        if (i1 != 0 && ((dgz) (view)).e != null)
        {
            ((dgz) (view)).e.F_();
        }
    }

    private void c(boolean flag)
    {
        View view;
        CarouselLayoutParams carousellayoutparams;
        if (p() > 1)
        {
            view = d(1);
        } else
        {
            view = d(0);
        }
        carousellayoutparams = (CarouselLayoutParams)view.getLayoutParams();
        q.c = ((android.support.v7.widget.RecyclerView.LayoutParams) (carousellayoutparams)).c.d();
        q.d = g(view);
        q.b = flag;
        q.a = true;
        if (flag && l(view) + s() == q.d)
        {
            q.a = false;
        }
    }

    private void h(int i1)
    {
        if (g != null)
        {
            int j1 = 0;
            while (j1 < p()) 
            {
                View view = d(j1);
                int k1 = l(view);
                if (g(view) < s() + k1)
                {
                    float f3 = (float)((k1 + s()) - g(view)) / (float)c;
                    float f1 = f3;
                    if (f3 > 1.0F)
                    {
                        f1 = 1.0F;
                    }
                    g.a(view, f1, i1);
                } else
                {
                    float f4 = (float)(g(view) - (k1 + s())) / (float)c;
                    float f2 = f4;
                    if (f4 > 1.0F)
                    {
                        f2 = 1.0F;
                    }
                    g.b(view, f2, i1);
                }
                j1++;
            }
        }
    }

    private int i(int i1)
    {
        int j1;
        if (w() == 0)
        {
            j1 = 0;
        } else
        {
            if (i1 > w() - 1)
            {
                return w() - 1;
            }
            j1 = i1;
            if (i1 < 0)
            {
                return 0;
            }
        }
        return j1;
    }

    private int j()
    {
        int i1 = 0;
        int j1 = 0x7fffffff;
        int k1 = 0;
        while (i1 < p()) 
        {
            View view = d(i1);
            int l1 = g(view);
            int i2 = (i(view) - g(view)) / 2;
            i2 = Math.abs((s() + k() / 2) - (i2 + l1));
            l1 = j1;
            if (i2 < j1)
            {
                k1 = i1;
                l1 = i2;
            }
            i1++;
            j1 = l1;
        }
        return k1;
    }

    private int k()
    {
        return q() - s() - u();
    }

    private static boolean k(View view)
    {
        return ((CarouselLayoutParams)view.getLayoutParams()).a;
    }

    private int l(View view)
    {
        if (k(view))
        {
            return 0;
        } else
        {
            return r.b();
        }
    }

    public final int a(int i1, int j1)
    {
        if (Math.abs(i1) >= 1500) goto _L2; else goto _L1
_L1:
        i1 = j() + e;
_L4:
        return i1;
_L2:
        j1 = a;
        if (i1 <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = j1;
        if (!m)
        {
            i1 = j1 + 1;
        }
_L5:
        j1 = i1;
        if (i1 < 0)
        {
            j1 = 0;
        }
        i1 = j1;
        if (j1 > w() - 1)
        {
            return w() - 1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = j1;
        if (!i)
        {
            i1 = j1 - 1;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final int a(int i1, abh abh1, abm abm1)
    {
        boolean flag5 = true;
        boolean flag4 = true;
        if (p() == 0)
        {
            return 0;
        }
        View view4 = d(0);
        View view3 = d(p() - 1);
        View view;
        View view1;
        int j1;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        if (e == 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (e + 3 >= w())
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        if (u.a)
        {
            int k1 = u.b - 1;
            j1 = u.b + 1;
            int i2 = Math.max(k1 - e, 0);
            int l1 = Math.min(j1 - e, p() - 1);
            view1 = d(i2);
            View view2;
            boolean flag;
            if (view1 != null)
            {
                if (a - 1 >= k1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
            } else
            {
                flag = false;
            }
            view = d(l1);
            if (view != null)
            {
                if (a + 1 <= j1)
                {
                    j1 = 1;
                    flag3 = flag;
                } else
                {
                    j1 = 0;
                    flag3 = flag;
                }
            } else
            {
                j1 = 0;
                flag3 = flag;
            }
        } else
        {
            j1 = 0;
            view = null;
            view1 = null;
            flag3 = false;
        }
        flag = flag1;
        view2 = view4;
        if (i)
        {
            flag = flag1;
            view2 = view4;
            if (a > 0)
            {
                flag = flag1;
                view2 = view4;
                if (p)
                {
                    view2 = d(a - e);
                    flag = true;
                }
            }
        }
        if (m && a < w() - 1 && p)
        {
            view3 = d(a - e);
            flag1 = true;
        } else
        {
            flag1 = flag2;
        }
        if (i1 > 0)
        {
            if (flag1 && m)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            if (flag1 && j1 == 0)
            {
                flag3 = flag4;
            } else
            {
                flag3 = false;
            }
            if (flag2 || flag3)
            {
                j1 = b(i1, view3);
            } else
            if (j1 != 0)
            {
                j1 = b(i1, view);
            } else
            {
                j1 = -i1;
            }
        } else
        {
            if (flag && i)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            if (flag && !flag3)
            {
                flag2 = flag5;
            } else
            {
                flag2 = false;
            }
            if (j1 != 0 || flag2)
            {
                j1 = a(i1, view2);
            } else
            if (flag3)
            {
                j1 = a(i1, view1);
            } else
            {
                j1 = -i1;
            }
        }
        e(j1);
        h(-j1);
        if (i1 > 0)
        {
            if (i(view2) < s() && !flag1)
            {
                a(LayoutDirections.c, abh1, abm1);
            } else
            {
                a(LayoutDirections.a, abh1, abm1);
            }
        } else
        if (g(view2) >= s() && !flag)
        {
            a(LayoutDirections.b, abh1, abm1);
        } else
        {
            a(LayoutDirections.a, abh1, abm1);
        }
        return -j1;
    }

    public final android.support.v7.widget.RecyclerView.LayoutParams a()
    {
        return new CarouselLayoutParams();
    }

    public final android.support.v7.widget.RecyclerView.LayoutParams a(Context context, AttributeSet attributeset)
    {
        return new CarouselLayoutParams(context, attributeset);
    }

    public final android.support.v7.widget.RecyclerView.LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new CarouselLayoutParams(layoutparams);
    }

    public final void a(aav aav, aav aav1)
    {
        Log.d(b, String.format("onAdapterChanged(oldAdapter='%s', newAdapter='%s')", new Object[] {
            aav, aav1
        }));
        o();
    }

    public final void a(abh abh1, abm abm1, int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int j2;
        l1 = 0;
        Log.d(b, String.format("onMeasure(recycler='%s', state='%s', widthSpec='%s', heightSpec='%s')", new Object[] {
            abh1, abm1, Integer.valueOf(i1), Integer.valueOf(j1)
        }));
        j2 = android.view.View.MeasureSpec.getMode(i1);
        i2 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        k1 = android.view.View.MeasureSpec.getSize(j1);
        j1 = i1;
        switch (j2)
        {
        default:
            j1 = km.o(super.k);
            // fall through

        case -2147483648: 
        case 1073741824: 
            j2 = s();
            break;
        }
        int k2 = u();
        i1 = l1;
        if (g != null)
        {
            i1 = g.a() + g.b() << 1;
        }
        j2 = j1 - j2 - k2 - i1;
        l1 = t() + j2 + v();
        i1 = l1;
        i2;
        JVM INSTR lookupswitch 3: default 220
    //                   -2147483648: 288
    //                   0: 228
    //                   1073741824: 282;
           goto _L1 _L2 _L3 _L4
_L2:
        break MISSING_BLOCK_LABEL_288;
_L3:
        break; /* Loop/switch isn't completed */
_L1:
        i1 = km.p(super.k);
_L5:
        b(j1, i1);
        if (o == MeasureMode.a)
        {
            i1 = Math.min(i1, j2);
            c = i1;
            d = i1;
        } else
        {
            c = j2;
            d = i1 - t() - v();
        }
        f = r.a(j2, c);
        return;
_L4:
        i1 = k1;
          goto _L5
        i1 = Math.min(k1, l1);
          goto _L5
    }

    public final void a(RecyclerView recyclerview)
    {
        Log.d(b, String.format("onItemsChanged(recyclerView='%s')", new Object[] {
            recyclerview
        }));
        n = true;
    }

    public final void a(RecyclerView recyclerview, int i1)
    {
        ScrollDirection scrolldirection;
        Log.d(b, String.format("smoothScrollToPosition(position='%s'), mCurrentPosition=%d", new Object[] {
            Integer.valueOf(i1), Integer.valueOf(a)
        }));
        if (i1 >= w())
        {
            return;
        }
        scrolldirection = ScrollDirection.a;
        if (i1 <= a) goto _L2; else goto _L1
_L1:
        scrolldirection = ScrollDirection.c;
_L4:
        recyclerview = r.a(recyclerview, scrolldirection);
        recyclerview.a = i1;
        a(((abk) (recyclerview)));
        a = i1;
        return;
_L2:
        if (i1 < a)
        {
            scrolldirection = ScrollDirection.b;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void a(RecyclerView recyclerview, int i1, int j1)
    {
        Log.d(b, String.format("onItemsAdded(recyclerView='%s', positionStart='%s', itemCount='%s')", new Object[] {
            recyclerview, Integer.valueOf(i1), Integer.valueOf(j1)
        }));
        if (p() != 0)
        {
            if (i1 <= a)
            {
                a = a + j1;
            }
            if (u.a)
            {
                recyclerview = u;
                if (i1 <= ((dhg) (recyclerview)).c.u.b)
                {
                    recyclerview = ((dhg) (recyclerview)).c.u;
                    recyclerview.b = ((dhg) (recyclerview)).b + j1;
                    return;
                }
            }
        }
    }

    public final void a(RecyclerView recyclerview, int i1, int j1, int k1)
    {
        Log.d(b, String.format("onItemsMoved(recyclerView='%s', from='%s', to='%s', itemCount='%s')", new Object[] {
            recyclerview, Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1)
        }));
        if (i1 + k1 < a)
        {
            if (j1 > a)
            {
                a = a - k1;
            }
        } else
        {
            if (i1 <= a && i1 + k1 >= a)
            {
                a = a + (j1 - i1);
                return;
            }
            if (i1 > a && j1 <= a)
            {
                a = a + k1;
                return;
            }
        }
    }

    public final void a(dho dho1)
    {
        g = dho1;
    }

    public final void a(boolean flag)
    {
        i = flag;
    }

    public final boolean a(int i1)
    {
        View view = d(i1 - e);
        return view == null || g(view) != l(view);
    }

    public final boolean a(android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof CarouselLayoutParams);
    }

    public final void b()
    {
        r = new dhb(this);
    }

    public final void b(RecyclerView recyclerview, int i1, int j1)
    {
        Log.d(b, String.format("onItemsRemoved(recyclerView='%s', positionStart='%s', itemCount='%s')", new Object[] {
            recyclerview, Integer.valueOf(i1), Integer.valueOf(j1)
        }));
        if (p() != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((i1 + j1) - 1 < a)
        {
            a = a - j1;
        } else
        if (i1 <= a && i1 + j1 >= a)
        {
            a = i(a);
        }
        if (!u.a) goto _L1; else goto _L3
_L3:
        recyclerview = u;
        if ((i1 + j1) - 1 < ((dhg) (recyclerview)).b)
        {
            recyclerview.b = ((dhg) (recyclerview)).b - j1;
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (i1 > ((dhg) (recyclerview)).b || i1 + j1 < ((dhg) (recyclerview)).b) goto _L1; else goto _L4
_L4:
        recyclerview.b = ((dhg) (recyclerview)).c.i(((dhg) (recyclerview)).b);
        return;
    }

    public final void b(boolean flag)
    {
        m = flag;
    }

    public final int c()
    {
        return j() + e;
    }

    public final void c(int i1)
    {
        Log.d(b, String.format("scrollToPosition(position='%s')", new Object[] {
            Integer.valueOf(i1)
        }));
        if (i1 >= w())
        {
            return;
        } else
        {
            e = Math.max(i1 - 1, 0);
            a = i1;
            h = i1;
            m();
            return;
        }
    }

    public final void c(abh abh1, abm abm1)
    {
        Log.d(b, String.format("onLayoutChildren(recycler='%s', state='%s')", new Object[] {
            abh1, abm1
        }));
        if (w() == 0)
        {
            a(abh1);
            return;
        }
        if (abm1.e && h != -1)
        {
            a = h;
        }
        if (a > w() - 1)
        {
            a = w() - 1;
        } else
        if (a < 0)
        {
            a = 0;
        }
        if (a != 0)
        {
            e = a - 1;
        } else
        {
            e = a;
        }
        if (p() != 0)
        {
            c(true);
        }
        a(abh1);
        a(LayoutDirections.a, abh1, abm1);
        n = false;
        h = -1;
    }

    public final boolean f()
    {
        return p() > 0;
    }

    public final void g(int i1)
    {
        super.g(i1);
        Log.d(b, String.format("onScrollStateChanged(state='%s')", new Object[] {
            Integer.valueOf(i1)
        }));
        boolean flag;
        if (i1 == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p = flag;
        if (p && !u.a && p() > 0)
        {
            dhg dhg1 = u;
            int j1;
            if (dhg1.c.p() > 1 && dhg1.c.a > 0)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            dhg1.b = j1 + dhg1.c.e;
            dhg1.a = true;
        }
        if (i1 == 0)
        {
            u.a = false;
        }
    }

    public final int h()
    {
        return a;
    }

    public final boolean i()
    {
        return p;
    }


    // Unreferenced inner class com/spotify/android/paste/widget/carousel/CarouselLayoutManager$1

/* anonymous class */
    public final class _cls1
    {

        public static final int a[];

        static 
        {
            a = new int[ScrollDirection.values().length];
            try
            {
                a[ScrollDirection.b.ordinal()] = 1;
            }
            catch (NoSuchFieldError nosuchfielderror1) { }
            try
            {
                a[ScrollDirection.c.ordinal()] = 2;
            }
            catch (NoSuchFieldError nosuchfielderror)
            {
                return;
            }
        }
    }


    private class LayoutDirections extends Enum
    {

        public static final LayoutDirections a;
        public static final LayoutDirections b;
        public static final LayoutDirections c;
        private static final LayoutDirections d[];
        int mShift;

        public static LayoutDirections valueOf(String s1)
        {
            return (LayoutDirections)Enum.valueOf(com/spotify/android/paste/widget/carousel/CarouselLayoutManager$LayoutDirections, s1);
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

        private LayoutDirections(String s1, int i1, int j1)
        {
            super(s1, i1);
            mShift = j1;
        }
    }


    private class CarouselLayoutParams extends android.support.v7.widget.RecyclerView.LayoutParams
    {

        boolean a;

        public final void a(boolean flag)
        {
            a = flag;
        }

        public CarouselLayoutParams()
        {
        }

        public CarouselLayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public CarouselLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }


    private class MeasureMode extends Enum
    {

        public static final MeasureMode a;
        public static final MeasureMode b;
        private static final MeasureMode c[];

        public static MeasureMode valueOf(String s1)
        {
            return (MeasureMode)Enum.valueOf(com/spotify/android/paste/widget/carousel/CarouselLayoutManager$MeasureMode, s1);
        }

        public static MeasureMode[] values()
        {
            return (MeasureMode[])c.clone();
        }

        static 
        {
            a = new MeasureMode("SQUARE", 0);
            b = new MeasureMode("FILL", 1);
            c = (new MeasureMode[] {
                a, b
            });
        }

        private MeasureMode(String s1, int i1)
        {
            super(s1, i1);
        }
    }


    private class ScrollDirection extends Enum
    {

        public static final ScrollDirection a;
        public static final ScrollDirection b;
        public static final ScrollDirection c;
        private static final ScrollDirection d[];

        public static ScrollDirection valueOf(String s1)
        {
            return (ScrollDirection)Enum.valueOf(com/spotify/android/paste/widget/carousel/CarouselLayoutManager$ScrollDirection, s1);
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

        private ScrollDirection(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
