// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aaf;
import aag;
import aah;
import aai;
import aau;
import abd;
import abh;
import abk;
import abm;
import abo;
import abq;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
import km;
import mw;
import nx;
import zu;

// Referenced classes of package android.support.v7.widget:
//            RecyclerView

public class LinearLayoutManager extends abd
{

    private aah a;
    private boolean b;
    private int c;
    private int d;
    private aaf e;
    public int f;
    public aau g;
    boolean h;
    SavedState i;

    public LinearLayoutManager()
    {
        this(1);
    }

    public LinearLayoutManager(int i1)
    {
        h = false;
        b = true;
        c = -1;
        d = 0x80000000;
        i = null;
        e = new aaf(this);
        a(i1);
        a(((String) (null)));
    }

    private View A()
    {
        int i1;
        if (h)
        {
            i1 = 0;
        } else
        {
            i1 = p() - 1;
        }
        return d(i1);
    }

    private int a(int i1, abh abh1, abm abm1, boolean flag)
    {
        int j1 = g.c() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, abh1, abm1);
            j1 = k1;
            if (flag)
            {
                i1 = g.c() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    g.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int a(abh abh1, aah aah1, abm abm1, boolean flag)
    {
        int k1 = aah1.c;
        if (aah1.g != 0x80000000)
        {
            if (aah1.c < 0)
            {
                aah1.g = aah1.g + aah1.c;
            }
            a(abh1, aah1);
        }
        int i1 = aah1.c + aah1.h;
        aag aag1 = new aag();
label0:
        do
        {
            int j1;
            do
            {
label1:
                {
                    if (i1 <= 0 || !aah1.a(abm1))
                    {
                        break label0;
                    }
                    aag1.a = 0;
                    aag1.b = false;
                    aag1.c = false;
                    aag1.d = false;
                    a(abh1, abm1, aah1, aag1);
                    if (aag1.b)
                    {
                        break label0;
                    }
                    aah1.b = aah1.b + aag1.a * aah1.f;
                    if (aag1.c && a.j == null)
                    {
                        j1 = i1;
                        if (abm1.f)
                        {
                            break label1;
                        }
                    }
                    aah1.c = aah1.c - aag1.a;
                    j1 = i1 - aag1.a;
                }
                if (aah1.g != 0x80000000)
                {
                    aah1.g = aah1.g + aag1.a;
                    if (aah1.c < 0)
                    {
                        aah1.g = aah1.g + aah1.c;
                    }
                    a(abh1, aah1);
                }
                i1 = j1;
            } while (!flag);
            i1 = j1;
        } while (!aag1.d);
        return k1 - aah1.c;
    }

    private View a(int i1, int j1, boolean flag)
    {
        j();
        int k1 = g.b();
        int l1 = g.c();
        View view;
        byte byte0;
        if (j1 > i1)
        {
            byte0 = 1;
        } else
        {
            byte0 = -1;
        }
        view = null;
        for (; i1 != j1; i1 += byte0)
        {
            View view1 = d(i1);
            int i2 = g.a(view1);
            int j2 = g.b(view1);
            if (i2 >= l1 || j2 <= k1)
            {
                continue;
            }
            if (!flag || i2 >= k1 && j2 <= l1)
            {
                return view1;
            }
            if (view == null)
            {
                view = view1;
            }
        }

        return view;
    }

    private View a(boolean flag)
    {
        if (h)
        {
            return a(p() - 1, -1, flag);
        } else
        {
            return a(0, p(), flag);
        }
    }

    private void a(int i1, int j1, boolean flag, abm abm1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        a.h = g(abm1);
        a.f = i1;
        if (i1 == 1)
        {
            abm1 = a;
            abm1.h = ((aah) (abm1)).h + g.f();
            abm1 = A();
            aah aah1 = a;
            if (h)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            aah1.e = i1;
            a.d = b(abm1) + a.e;
            a.b = g.b(abm1);
            i1 = g.b(abm1) - g.c();
        } else
        {
            abm1 = c();
            aah aah2 = a;
            aah2.h = aah2.h + g.b();
            aah2 = a;
            if (h)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            aah2.e = i1;
            a.d = b(abm1) + a.e;
            a.b = g.a(abm1);
            i1 = -g.a(abm1) + g.b();
        }
        a.c = j1;
        if (flag)
        {
            abm1 = a;
            abm1.c = ((aah) (abm1)).c - i1;
        }
        a.g = i1;
    }

    private void a(aaf aaf1)
    {
        c(aaf1.a, aaf1.b);
    }

    private void a(abh abh1, int i1, int j1)
    {
        if (i1 != j1) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int k1;
        k1 = i1;
        if (j1 <= i1)
        {
            break; /* Loop/switch isn't completed */
        }
        j1--;
        while (j1 >= i1) 
        {
            a(j1, abh1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, abh1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(abh abh1, aah aah1)
    {
        if (aah1.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (aah1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = aah1.g;
        int j2 = p();
        if (i1 >= 0)
        {
            int l2 = g.d() - i1;
            if (h)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    aah1 = d(j1);
                    if (g.a(aah1) < l2)
                    {
                        a(abh1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    aah1 = d(k1);
                    if (g.a(aah1) < l2)
                    {
                        a(abh1, j2 - 1, k1);
                        return;
                    }
                    k1--;
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        int k2;
        int i3;
        k2 = aah1.g;
        if (k2 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = p();
        if (!h)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = i3 - 1;
        while (l1 >= 0) 
        {
            aah1 = d(l1);
            if (g.b(aah1) > k2)
            {
                a(abh1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            aah1 = d(i2);
            if (g.b(aah1) > k2)
            {
                a(abh1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private int b(int i1, abh abh1, abm abm1, boolean flag)
    {
        int j1 = i1 - g.b();
        if (j1 > 0)
        {
            int k1 = -d(j1, abh1, abm1);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - g.b();
                j1 = k1;
                if (i1 > 0)
                {
                    g.a(-i1);
                    j1 = k1 - i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private View b(boolean flag)
    {
        if (h)
        {
            return a(0, p(), flag);
        } else
        {
            return a(p() - 1, -1, flag);
        }
    }

    private void b()
    {
        boolean flag = true;
        if (f == 1 || !i())
        {
            flag = false;
        }
        h = flag;
    }

    private void b(aaf aaf1)
    {
        d(aaf1.a, aaf1.b);
    }

    private View c()
    {
        int i1;
        if (h)
        {
            i1 = p() - 1;
        } else
        {
            i1 = 0;
        }
        return d(i1);
    }

    private void c(int i1, int j1)
    {
        a.c = g.c() - j1;
        aah aah1 = a;
        int k1;
        if (h)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        aah1.e = k1;
        a.d = i1;
        a.f = 1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private int d(int i1, abh abh1, abm abm1)
    {
        if (p() == 0 || i1 == 0)
        {
            return 0;
        }
        a.a = true;
        j();
        int j1;
        int k1;
        int l1;
        if (i1 > 0)
        {
            j1 = 1;
        } else
        {
            j1 = -1;
        }
        k1 = Math.abs(i1);
        a(j1, k1, true, abm1);
        l1 = a.g + a(abh1, a, abm1, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        g.a(-i1);
        a.i = i1;
        return i1;
    }

    private View d(abh abh1, abm abm1)
    {
        if (h)
        {
            return f(abh1, abm1);
        } else
        {
            return g(abh1, abm1);
        }
    }

    private void d(int i1, int j1)
    {
        a.c = j1 - g.b();
        a.d = i1;
        aah aah1 = a;
        if (h)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        aah1.e = i1;
        a.f = -1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private View e(abh abh1, abm abm1)
    {
        if (h)
        {
            return g(abh1, abm1);
        } else
        {
            return f(abh1, abm1);
        }
    }

    private View f(abh abh1, abm abm1)
    {
        return a(abh1, abm1, 0, p(), abm1.b());
    }

    private int g(abm abm1)
    {
        int i1 = 0;
        boolean flag;
        if (abm1.a != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            i1 = g.e();
        }
        return i1;
    }

    private View g(abh abh1, abm abm1)
    {
        return a(abh1, abm1, p() - 1, -1, abm1.b());
    }

    private int h(abm abm1)
    {
        boolean flag1 = true;
        if (p() == 0)
        {
            return 0;
        }
        j();
        aau aau1 = g;
        View view;
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!b)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return abq.a(abm1, aau1, view, b(flag), this, b, h);
    }

    private int i(abm abm1)
    {
        boolean flag1 = true;
        if (p() == 0)
        {
            return 0;
        }
        j();
        aau aau1 = g;
        View view;
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!b)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return abq.a(abm1, aau1, view, b(flag), this, b);
    }

    private int j(abm abm1)
    {
        boolean flag1 = true;
        if (p() == 0)
        {
            return 0;
        }
        j();
        aau aau1 = g;
        View view;
        boolean flag;
        if (!b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!b)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return abq.b(abm1, aau1, view, b(flag), this, b);
    }

    public final int a(int i1, abh abh1, abm abm1)
    {
        if (f == 1)
        {
            return 0;
        } else
        {
            return d(i1, abh1, abm1);
        }
    }

    public final int a(abm abm1)
    {
        return h(abm1);
    }

    public RecyclerView.LayoutParams a()
    {
        return new RecyclerView.LayoutParams();
    }

    View a(abh abh1, abm abm1, int i1, int j1, int k1)
    {
label0:
        {
            Object obj;
label1:
            {
                abh1 = null;
                j();
                int i2 = g.b();
                int j2 = g.c();
                int l1;
                if (j1 > i1)
                {
                    l1 = 1;
                } else
                {
                    l1 = -1;
                }
                abm1 = null;
                while (i1 != j1) 
                {
                    View view = d(i1);
                    int k2 = b(view);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((RecyclerView.LayoutParams)view.getLayoutParams()).c.n())
                        {
                            if (abm1 == null)
                            {
                                abm1 = view;
                            }
                        } else
                        {
                            if (g.a(view) < j2)
                            {
                                obj = view;
                                if (g.b(view) >= i2)
                                {
                                    break label1;
                                }
                            }
                            if (abh1 == null)
                            {
                                abh1 = view;
                            }
                        }
                    }
                    i1 += l1;
                }
                if (abh1 == null)
                {
                    break label0;
                }
                obj = abh1;
            }
            return ((View) (obj));
        }
        return abm1;
    }

    public final void a(int i1)
    {
        if (i1 != 0 && i1 != 1)
        {
            throw new IllegalArgumentException((new StringBuilder("invalid orientation:")).append(i1).toString());
        }
        a(((String) (null)));
        if (i1 == f)
        {
            return;
        } else
        {
            f = i1;
            g = null;
            m();
            return;
        }
    }

    public final void a(int i1, int j1)
    {
        c = i1;
        d = j1;
        if (i != null)
        {
            i.a = -1;
        }
        m();
    }

    public void a(abh abh1, abm abm1, aaf aaf1)
    {
    }

    void a(abh abh1, abm abm1, aah aah1, aag aag1)
    {
        abh1 = aah1.a(abh1);
        if (abh1 == null)
        {
            aag1.b = true;
            return;
        }
        abm1 = (RecyclerView.LayoutParams)abh1.getLayoutParams();
        int i1;
        int j1;
        int k1;
        int l1;
        if (aah1.j == null)
        {
            boolean flag2 = h;
            RecyclerView.LayoutParams layoutparams;
            Rect rect;
            boolean flag;
            if (aah1.f == -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag2 == flag)
            {
                super.a(abh1, -1, false);
            } else
            {
                super.a(abh1, 0, false);
            }
        } else
        {
            boolean flag3 = h;
            boolean flag1;
            if (aah1.f == -1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag3 == flag1)
            {
                super.a(abh1, -1, true);
            } else
            {
                super.a(abh1, 0, true);
            }
        }
        layoutparams = (RecyclerView.LayoutParams)abh1.getLayoutParams();
        rect = super.k.e(abh1);
        i1 = rect.left;
        j1 = rect.right;
        k1 = rect.top;
        l1 = rect.bottom;
        abh1.measure(abd.a(q(), i1 + j1 + 0 + (s() + u() + layoutparams.leftMargin + layoutparams.rightMargin), layoutparams.width, f()), abd.a(r(), l1 + k1 + 0 + (t() + v() + layoutparams.topMargin + layoutparams.bottomMargin), layoutparams.height, g()));
        aag1.a = g.c(abh1);
        if (f == 1)
        {
            if (i())
            {
                i1 = q() - u();
                j1 = i1 - g.d(abh1);
            } else
            {
                j1 = s();
                i1 = g.d(abh1) + j1;
            }
            if (aah1.f == -1)
            {
                k1 = aah1.b;
                l1 = aah1.b - aag1.a;
            } else
            {
                l1 = aah1.b;
                k1 = aah1.b;
                int i2 = aag1.a;
                k1 += i2;
            }
        } else
        {
            l1 = t();
            k1 = g.d(abh1) + l1;
            if (aah1.f == -1)
            {
                i1 = aah1.b;
                j1 = aah1.b - aag1.a;
            } else
            {
                j1 = aah1.b;
                i1 = aah1.b + aag1.a;
            }
        }
        a(((View) (abh1)), j1 + ((RecyclerView.LayoutParams) (abm1)).leftMargin, l1 + ((RecyclerView.LayoutParams) (abm1)).topMargin, i1 - ((RecyclerView.LayoutParams) (abm1)).rightMargin, k1 - ((RecyclerView.LayoutParams) (abm1)).bottomMargin);
        if (((RecyclerView.LayoutParams) (abm1)).c.n() || ((RecyclerView.LayoutParams) (abm1)).c.t())
        {
            aag1.c = true;
        }
        aag1.d = abh1.isFocusable();
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            i = (SavedState)parcelable;
            m();
        }
    }

    public final void a(RecyclerView recyclerview, int i1)
    {
        recyclerview = new aai(recyclerview.getContext()) {

            private LinearLayoutManager g;

            public final PointF a(int j1)
            {
                boolean flag = true;
                boolean flag1 = false;
                LinearLayoutManager linearlayoutmanager = g;
                if (linearlayoutmanager.p() == 0)
                {
                    return null;
                }
                if (j1 < LinearLayoutManager.b(linearlayoutmanager.d(0)))
                {
                    flag1 = true;
                }
                j1 = ((flag) ? 1 : 0);
                if (flag1 != linearlayoutmanager.h)
                {
                    j1 = -1;
                }
                if (linearlayoutmanager.f == 0)
                {
                    return new PointF(j1, 0.0F);
                } else
                {
                    return new PointF(0.0F, j1);
                }
            }

            
            {
                g = LinearLayoutManager.this;
                super(context);
            }
        };
        recyclerview.a = i1;
        a(((abk) (recyclerview)));
    }

    public void a(RecyclerView recyclerview, abh abh1)
    {
        super.a(recyclerview, abh1);
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        super.a(accessibilityevent);
        if (p() > 0)
        {
            accessibilityevent = mw.a(accessibilityevent);
            accessibilityevent.b(k());
            accessibilityevent.c(l());
        }
    }

    public final void a(String s)
    {
        if (i == null)
        {
            super.a(s);
        }
    }

    public final int b(int i1, abh abh1, abm abm1)
    {
        if (f == 0)
        {
            return 0;
        } else
        {
            return d(i1, abh1, abm1);
        }
    }

    public final int b(abm abm1)
    {
        return h(abm1);
    }

    public final View b(int i1)
    {
        int j1 = p();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - b(d(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = d(k1);
        view = view1;
        if (b(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.b(i1);
    }

    public final int c(abm abm1)
    {
        return i(abm1);
    }

    public final View c(int i1, abh abh1, abm abm1)
    {
        b();
        if (p() != 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        i1;
        JVM INSTR lookupswitch 6: default 72
    //                   1: 181
    //                   2: 186
    //                   17: 229
    //                   33: 191
    //                   66: 247
    //                   130: 210;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i1 = 0x80000000;
_L10:
        if (i1 != 0x80000000)
        {
            j();
            View view;
            if (i1 == -1)
            {
                view = e(abh1, abm1);
            } else
            {
                view = d(abh1, abm1);
            }
            if (view != null)
            {
                j();
                a(i1, (int)(0.33F * (float)g.e()), false, abm1);
                a.g = 0x80000000;
                a.a = false;
                a(abh1, a, abm1, true);
                if (i1 == -1)
                {
                    abh1 = c();
                } else
                {
                    abh1 = A();
                }
                if (abh1 != view && abh1.isFocusable())
                {
                    return abh1;
                }
            }
        }
        if (true) goto _L1; else goto _L4
_L4:
        i1 = -1;
          goto _L10
_L5:
        i1 = 1;
          goto _L10
_L7:
        if (f == 1)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L9:
        if (f == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L6:
        if (f == 0)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L8:
        if (f == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
    }

    public final void c(int i1)
    {
        c = i1;
        d = 0x80000000;
        if (i != null)
        {
            i.a = -1;
        }
        m();
    }

    public void c(abh abh1, abm abm1)
    {
        Object obj;
        Object obj1;
        int i1;
        int j1;
        if ((i != null || c != -1) && abm1.b() == 0)
        {
            c(abh1);
            return;
        }
        if (i != null && i.a())
        {
            c = i.a;
        }
        j();
        a.a = false;
        b();
        obj = e;
        obj.a = -1;
        obj.b = 0x80000000;
        obj.c = false;
        e.c = h;
        obj1 = e;
        RecyclerView.LayoutParams layoutparams;
        int i2;
        if (abm1.f || c == -1)
        {
            i1 = 0;
        } else
        if (c < 0 || c >= abm1.b())
        {
            c = -1;
            d = 0x80000000;
            i1 = 0;
        } else
        {
label0:
            {
                obj1.a = c;
                if (i == null || !i.a())
                {
                    break label0;
                }
                obj1.c = i.c;
                if (((aaf) (obj1)).c)
                {
                    obj1.b = g.c() - i.b;
                } else
                {
                    obj1.b = g.b() + i.b;
                }
                i1 = 1;
            }
        }
_L8:
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (p() == 0)
        {
            break MISSING_BLOCK_LABEL_1678;
        }
        boolean flag;
        if (super.k == null)
        {
            obj = null;
        } else
        {
            obj = super.k.getFocusedChild();
            if (obj == null || super.j.d(((View) (obj))))
            {
                obj = null;
            }
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        layoutparams = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
        if (!layoutparams.c.n() && layoutparams.c.c() >= 0 && layoutparams.c.c() < abm1.b())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        j1 = ((aaf) (obj1)).d.g.a();
        if (j1 >= 0)
        {
            ((aaf) (obj1)).a(((View) (obj)));
        } else
        {
            obj1.a = b(((View) (obj)));
            if (((aaf) (obj1)).c)
            {
                i1 = ((aaf) (obj1)).d.g.c() - j1 - ((aaf) (obj1)).d.g.b(((View) (obj)));
                obj1.b = ((aaf) (obj1)).d.g.c() - i1;
                if (i1 > 0)
                {
                    j1 = ((aaf) (obj1)).d.g.c(((View) (obj)));
                    k1 = ((aaf) (obj1)).b;
                    l1 = ((aaf) (obj1)).d.g.b();
                    j1 = k1 - j1 - (Math.min(((aaf) (obj1)).d.g.a(((View) (obj))) - l1, 0) + l1);
                    if (j1 < 0)
                    {
                        k1 = ((aaf) (obj1)).b;
                        obj1.b = Math.min(i1, -j1) + k1;
                    }
                }
            } else
            {
                k1 = ((aaf) (obj1)).d.g.a(((View) (obj)));
                i1 = k1 - ((aaf) (obj1)).d.g.b();
                obj1.b = k1;
                if (i1 > 0)
                {
                    l1 = ((aaf) (obj1)).d.g.c(((View) (obj)));
                    int j2 = ((aaf) (obj1)).d.g.c();
                    int l2 = ((aaf) (obj1)).d.g.b(((View) (obj)));
                    j1 = ((aaf) (obj1)).d.g.c() - Math.min(0, j2 - j1 - l2) - (k1 + l1);
                    if (j1 < 0)
                    {
                        obj1.b = ((aaf) (obj1)).b - Math.min(i1, -j1);
                    }
                }
            }
        }
        i1 = 1;
_L11:
        if (i1 == 0)
        {
            ((aaf) (obj1)).a();
            obj1.a = 0;
        }
_L2:
        i1 = g(abm1);
        int k1;
        int l1;
        if (a.i >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + g.b();
        l1 = i1 + g.f();
        i1 = l1;
        j1 = k1;
        if (abm1.f)
        {
            i1 = l1;
            j1 = k1;
            if (c != -1)
            {
                i1 = l1;
                j1 = k1;
                if (d != 0x80000000)
                {
                    obj = b(c);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        if (h)
                        {
                            i1 = g.c() - g.b(((View) (obj))) - d;
                        } else
                        {
                            i1 = g.a(((View) (obj)));
                            j1 = g.b();
                            i1 = d - (i1 - j1);
                        }
                        if (i1 > 0)
                        {
                            j1 = k1 + i1;
                            i1 = l1;
                        } else
                        {
                            i1 = l1 - i1;
                            j1 = k1;
                        }
                    }
                }
            }
        }
        a(abh1, abm1, e);
        a(abh1);
        if (e.c)
        {
            b(e);
            a.h = j1;
            a(abh1, a, abm1, false);
            l1 = a.b;
            i2 = a.d;
            j1 = i1;
            if (a.c > 0)
            {
                j1 = i1 + a.c;
            }
            a(e);
            a.h = j1;
            obj = a;
            obj.d = ((aah) (obj)).d + a.e;
            a(abh1, a, abm1, false);
            k1 = a.b;
            int k2;
            int i3;
            int j3;
            int k3;
            boolean flag1;
            if (a.c > 0)
            {
                i1 = a.c;
                d(i2, l1);
                a.h = i1;
                a(abh1, a, abm1, false);
                i1 = a.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(e);
            a.h = i1;
            a(abh1, a, abm1, false);
            k1 = a.b;
            k2 = a.d;
            i1 = j1;
            if (a.c > 0)
            {
                i1 = j1 + a.c;
            }
            b(e);
            a.h = i1;
            obj = a;
            obj.d = ((aah) (obj)).d + a.e;
            a(abh1, a, abm1, false);
            l1 = a.b;
            i1 = k1;
            j1 = l1;
            if (a.c > 0)
            {
                i1 = a.c;
                c(k2, k1);
                a.h = i1;
                a(abh1, a, abm1, false);
                i1 = a.b;
                j1 = l1;
            }
        }
        if (p() > 0)
        {
            if (h)
            {
                k1 = a(i1, abh1, abm1, true);
                l1 = j1 + k1;
                j1 = b(l1, abh1, abm1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, abh1, abm1, true);
                i1 += k1;
                k2 = a(i1, abh1, abm1, false);
                l1 = j1 + k1 + k2;
                k1 = i1 + k2;
            }
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if (abm1.h && p() != 0 && !abm1.f && d())
        {
            i1 = 0;
            j1 = 0;
            obj = abh1.d;
            j3 = ((List) (obj)).size();
            k3 = b(d(0));
            k2 = 0;
            while (k2 < j3) 
            {
                obj1 = (abo)((List) (obj)).get(k2);
                if (!((abo) (obj1)).n())
                {
                    if (((abo) (obj1)).c() < k3)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 != h)
                    {
                        i3 = -1;
                    } else
                    {
                        i3 = 1;
                    }
                    if (i3 == -1)
                    {
                        i3 = g.c(((abo) (obj1)).a) + i1;
                        i1 = j1;
                        j1 = i3;
                    } else
                    {
                        i3 = g.c(((abo) (obj1)).a) + j1;
                        j1 = i1;
                        i1 = i3;
                    }
                } else
                {
                    i3 = i1;
                    i1 = j1;
                    j1 = i3;
                }
                i3 = j1;
                k2++;
                j1 = i1;
                i1 = i3;
            }
            a.j = ((List) (obj));
            if (i1 > 0)
            {
                d(b(c()), l1);
                a.h = i1;
                a.c = 0;
                a.a(null);
                a(abh1, a, abm1, false);
            }
            if (j1 > 0)
            {
                c(b(A()), k1);
                a.h = j1;
                a.c = 0;
                a.a(null);
                a(abh1, a, abm1, false);
            }
            a.j = null;
        }
        if (!abm1.f)
        {
            c = -1;
            d = 0x80000000;
            abh1 = g;
            abh1.b = abh1.e();
        }
        i = null;
        return;
        if (d != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1137;
        }
        obj = b(c);
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (g.c(((View) (obj))) > g.e())
        {
            ((aaf) (obj1)).a();
        } else
        if (g.a(((View) (obj))) - g.b() < 0)
        {
            obj1.b = g.b();
            obj1.c = false;
        } else
        {
label1:
            {
                if (g.c() - g.b(((View) (obj))) >= 0)
                {
                    break label1;
                }
                obj1.b = g.c();
                obj1.c = true;
            }
        }
_L10:
        i1 = 1;
          goto _L8
        if (((aaf) (obj1)).c)
        {
            i1 = g.b(((View) (obj))) + g.a();
        } else
        {
            i1 = g.a(((View) (obj)));
        }
        obj1.b = i1;
_L9:
        i1 = 1;
          goto _L8
_L7:
        if (p() > 0)
        {
            i1 = b(d(0));
            if (c < i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == h)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1.c = flag;
        }
        ((aaf) (obj1)).a();
          goto _L9
        obj1.c = h;
        if (h)
        {
            obj1.b = g.c() - d;
        } else
        {
            obj1.b = g.b() + d;
        }
          goto _L10
_L4:
        if (((aaf) (obj1)).c)
        {
            obj = d(abh1, abm1);
        } else
        {
            obj = e(abh1, abm1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1678;
        }
        ((aaf) (obj1)).a(((View) (obj)));
        if (!abm1.f && d())
        {
            if (g.a(((View) (obj))) >= g.c() || g.b(((View) (obj))) < g.b())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (((aaf) (obj1)).c)
                {
                    i1 = g.c();
                } else
                {
                    i1 = g.b();
                }
                obj1.b = i1;
            }
        }
        i1 = 1;
          goto _L11
        i1 = 0;
          goto _L11
    }

    public final int d(abm abm1)
    {
        return i(abm1);
    }

    public boolean d()
    {
        return i == null;
    }

    public final int e(abm abm1)
    {
        return j(abm1);
    }

    public final Parcelable e()
    {
        if (i != null)
        {
            return new SavedState(i);
        }
        SavedState savedstate = new SavedState();
        if (p() > 0)
        {
            j();
            boolean flag = h ^ false;
            savedstate.c = flag;
            if (flag)
            {
                View view = A();
                savedstate.b = g.c() - g.b(view);
                savedstate.a = b(view);
                return savedstate;
            } else
            {
                View view1 = c();
                savedstate.a = b(view1);
                savedstate.b = g.a(view1) - g.b();
                return savedstate;
            }
        } else
        {
            savedstate.a = -1;
            return savedstate;
        }
    }

    public final int f(abm abm1)
    {
        return j(abm1);
    }

    public final boolean f()
    {
        return f == 0;
    }

    public final boolean g()
    {
        return f == 1;
    }

    public final int h()
    {
        return f;
    }

    protected final boolean i()
    {
        return km.h(super.k) == 1;
    }

    final void j()
    {
        if (a == null)
        {
            a = new aah();
        }
        if (g == null)
        {
            g = aau.a(this, f);
        }
    }

    public final int k()
    {
        View view = a(0, p(), false);
        if (view == null)
        {
            return -1;
        } else
        {
            return b(view);
        }
    }

    public final int l()
    {
        View view = a(p() - 1, -1, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return b(view);
        }
    }

    private class SavedState
        implements Parcelable
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
        int a;
        int b;
        boolean c;

        final boolean a()
        {
            return a >= 0;
        }

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a);
            parcel.writeInt(b);
            if (c)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            parcel.writeInt(i1);
        }


        public SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            boolean flag = true;
            super();
            a = parcel.readInt();
            b = parcel.readInt();
            if (parcel.readInt() != 1)
            {
                flag = false;
            }
            c = flag;
        }

        public SavedState(SavedState savedstate)
        {
            a = savedstate.a;
            b = savedstate.b;
            c = savedstate.c;
        }
    }

}
