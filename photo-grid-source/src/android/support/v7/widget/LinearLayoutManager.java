// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.ViewCompat;
import android.support.v4.view.accessibility.AccessibilityEventCompat;
import android.support.v4.view.accessibility.AccessibilityRecordCompat;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            au, w, ad, y, 
//            x, bf, bl, bi, 
//            v, RecyclerView, aa, az, 
//            d

public class LinearLayoutManager extends au
{

    private y a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private boolean f;
    int j;
    ad k;
    boolean l;
    int m;
    int n;
    SavedState o;
    final w p;

    public LinearLayoutManager()
    {
        this((byte)0);
    }

    private LinearLayoutManager(byte byte0)
    {
        c = false;
        l = false;
        d = false;
        e = true;
        m = -1;
        n = 0x80000000;
        o = null;
        p = new w(this);
        i();
        a(((String) (null)));
        if (c)
        {
            c = false;
            n();
        }
    }

    private View B()
    {
        int i1;
        if (l)
        {
            i1 = 0;
        } else
        {
            i1 = r() - 1;
        }
        return c(i1);
    }

    private int a(int i1, az az1, bf bf1, boolean flag)
    {
        int j1 = k.d() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, az1, bf1);
            j1 = k1;
            if (flag)
            {
                i1 = k.d() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    k.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int a(az az1, y y1, bf bf1, boolean flag)
    {
        int k1 = y1.c;
        if (y1.g != 0x80000000)
        {
            if (y1.c < 0)
            {
                y1.g = y1.g + y1.c;
            }
            a(az1, y1);
        }
        int i1 = y1.c + y1.h;
        x x1 = new x();
label0:
        do
        {
            int j1;
            do
            {
label1:
                {
                    if (i1 <= 0 || !y1.a(bf1))
                    {
                        break label0;
                    }
                    x1.a = 0;
                    x1.b = false;
                    x1.c = false;
                    x1.d = false;
                    a(az1, bf1, y1, x1);
                    if (x1.b)
                    {
                        break label0;
                    }
                    y1.b = y1.b + x1.a * y1.f;
                    if (x1.c && a.k == null)
                    {
                        j1 = i1;
                        if (bf1.a())
                        {
                            break label1;
                        }
                    }
                    y1.c = y1.c - x1.a;
                    j1 = i1 - x1.a;
                }
                if (y1.g != 0x80000000)
                {
                    y1.g = y1.g + x1.a;
                    if (y1.c < 0)
                    {
                        y1.g = y1.g + y1.c;
                    }
                    a(az1, y1);
                }
                i1 = j1;
            } while (!flag);
            i1 = j1;
        } while (!x1.d);
        return k1 - y1.c;
    }

    private View a(int i1, int j1, boolean flag)
    {
        k();
        int k1 = k.c();
        int l1 = k.d();
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
            View view1 = c(i1);
            int i2 = k.a(view1);
            int j2 = k.b(view1);
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
        if (l)
        {
            return a(r() - 1, -1, flag);
        } else
        {
            return a(0, r(), flag);
        }
    }

    private void a(int i1, int j1, boolean flag, bf bf1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        a.h = g(bf1);
        a.f = i1;
        if (i1 == 1)
        {
            bf1 = a;
            bf1.h = ((y) (bf1)).h + k.g();
            bf1 = B();
            y y1 = a;
            if (l)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            y1.e = i1;
            a.d = e(bf1) + a.e;
            a.b = k.b(bf1);
            i1 = k.b(bf1) - k.d();
        } else
        {
            bf1 = d();
            y y2 = a;
            y2.h = y2.h + k.c();
            y2 = a;
            if (l)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            y2.e = i1;
            a.d = e(bf1) + a.e;
            a.b = k.a(bf1);
            i1 = -k.a(bf1) + k.c();
        }
        a.c = j1;
        if (flag)
        {
            bf1 = a;
            bf1.c = ((y) (bf1)).c - i1;
        }
        a.g = i1;
    }

    private void a(az az1, int i1, int j1)
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
            a(j1, az1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, az1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(az az1, y y1)
    {
        if (y1.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (y1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = y1.g;
        int j2 = r();
        if (i1 >= 0)
        {
            int l2 = k.e() - i1;
            if (l)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    y1 = c(j1);
                    if (k.a(y1) < l2)
                    {
                        a(az1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    y1 = c(k1);
                    if (k.a(y1) < l2)
                    {
                        a(az1, j2 - 1, k1);
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
        k2 = y1.g;
        if (k2 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = r();
        if (!l)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = i3 - 1;
        while (l1 >= 0) 
        {
            y1 = c(l1);
            if (k.b(y1) > k2)
            {
                a(az1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            y1 = c(i2);
            if (k.b(y1) > k2)
            {
                a(az1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private void a(w w1)
    {
        e(w1.a, w1.b);
    }

    private int b(int i1, az az1, bf bf1, boolean flag)
    {
        int j1 = i1 - k.c();
        if (j1 > 0)
        {
            int k1 = -d(j1, az1, bf1);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - k.c();
                j1 = k1;
                if (i1 > 0)
                {
                    k.a(-i1);
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
        if (l)
        {
            return a(0, r(), flag);
        } else
        {
            return a(r() - 1, -1, flag);
        }
    }

    private void b(w w1)
    {
        f(w1.a, w1.b);
    }

    private void c()
    {
        boolean flag = true;
        if (j != 1 && j()) goto _L2; else goto _L1
_L1:
        flag = c;
_L4:
        l = flag;
        return;
_L2:
        if (c)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private int d(int i1, az az1, bf bf1)
    {
        if (r() == 0 || i1 == 0)
        {
            return 0;
        }
        a.a = true;
        k();
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
        a(j1, k1, true, bf1);
        l1 = a.g + a(az1, a, bf1, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        k.a(-i1);
        a.j = i1;
        return i1;
    }

    private View d()
    {
        int i1;
        if (l)
        {
            i1 = r() - 1;
        } else
        {
            i1 = 0;
        }
        return c(i1);
    }

    private void e(int i1, int j1)
    {
        a.c = k.d() - j1;
        y y1 = a;
        int k1;
        if (l)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        y1.e = k1;
        a.d = i1;
        a.f = 1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private void f(int i1, int j1)
    {
        a.c = j1 - k.c();
        a.d = i1;
        y y1 = a;
        if (l)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        y1.e = i1;
        a.f = -1;
        a.b = j1;
        a.g = 0x80000000;
    }

    private int g(bf bf1)
    {
        if (bf1.d())
        {
            return k.f();
        } else
        {
            return 0;
        }
    }

    private View g(int i1)
    {
        return a(0, r(), i1);
    }

    private int h(bf bf1)
    {
        boolean flag1 = true;
        if (r() == 0)
        {
            return 0;
        }
        k();
        ad ad1 = k;
        View view;
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return bl.a(bf1, ad1, view, b(flag), this, e, l);
    }

    private View h(int i1)
    {
        return a(r() - 1, -1, i1);
    }

    private int i(bf bf1)
    {
        boolean flag1 = true;
        if (r() == 0)
        {
            return 0;
        }
        k();
        ad ad1 = k;
        View view;
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return bl.a(bf1, ad1, view, b(flag), this, e);
    }

    private int j(bf bf1)
    {
        boolean flag1 = true;
        if (r() == 0)
        {
            return 0;
        }
        k();
        ad ad1 = k;
        View view;
        boolean flag;
        if (!e)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!e)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return bl.b(bf1, ad1, view, b(flag), this, e);
    }

    private View k(bf bf1)
    {
        if (l)
        {
            return g(bf1.e());
        } else
        {
            return h(bf1.e());
        }
    }

    private View l(bf bf1)
    {
        if (l)
        {
            return h(bf1.e());
        } else
        {
            return g(bf1.e());
        }
    }

    public final int a(int i1, az az1, bf bf1)
    {
        if (j == 1)
        {
            return 0;
        } else
        {
            return d(i1, az1, bf1);
        }
    }

    public final int a(bf bf1)
    {
        return h(bf1);
    }

    public final View a(int i1)
    {
        int j1 = r();
        if (j1 != 0) goto _L2; else goto _L1
_L1:
        View view = null;
_L4:
        return view;
_L2:
        View view1;
        int k1 = i1 - e(c(0));
        if (k1 < 0 || k1 >= j1)
        {
            break; /* Loop/switch isn't completed */
        }
        view1 = c(k1);
        view = view1;
        if (e(view1) == i1) goto _L4; else goto _L3
_L3:
        return super.a(i1);
    }

    View a(int i1, int j1, int k1)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                k();
                int i2 = k.c();
                int j2 = k.d();
                int l1;
                if (j1 > i1)
                {
                    l1 = 1;
                } else
                {
                    l1 = -1;
                }
                view1 = null;
                while (i1 != j1) 
                {
                    View view2 = c(i1);
                    int k2 = e(view2);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).a.n())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (k.a(view2) < j2)
                            {
                                view3 = view2;
                                if (k.b(view2) >= i2)
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
                    i1 += l1;
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

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            o = (SavedState)parcelable;
            n();
        }
    }

    public final void a(RecyclerView recyclerview)
    {
        recyclerview = new v(this, recyclerview.getContext());
        recyclerview.b(0);
        a(((bd) (recyclerview)));
    }

    public final void a(RecyclerView recyclerview, az az1)
    {
        super.a(recyclerview, az1);
        if (f)
        {
            c(az1);
            az1.a();
        }
    }

    void a(az az1, bf bf1, y y1, x x1)
    {
        boolean flag2 = false;
        boolean flag = false;
        az1 = y1.a(az1);
        if (az1 == null)
        {
            x1.b = true;
            return;
        }
        bf1 = (RecyclerView.LayoutParams)az1.getLayoutParams();
        int i1;
        int j1;
        int k1;
        int l1;
        if (y1.k == null)
        {
            flag2 = l;
            if (y1.f == -1)
            {
                flag = true;
            }
            RecyclerView.LayoutParams layoutparams;
            Rect rect;
            if (flag2 == flag)
            {
                c(az1);
            } else
            {
                d(az1);
            }
        } else
        {
            boolean flag3 = l;
            boolean flag1 = flag2;
            if (y1.f == -1)
            {
                flag1 = true;
            }
            if (flag3 == flag1)
            {
                a(((View) (az1)));
            } else
            {
                b(az1);
            }
        }
        layoutparams = (RecyclerView.LayoutParams)az1.getLayoutParams();
        rect = super.r.e(az1);
        i1 = rect.left;
        j1 = rect.right;
        k1 = rect.top;
        l1 = rect.bottom;
        az1.measure(au.a(s(), i1 + j1 + 0 + (u() + w() + layoutparams.leftMargin + layoutparams.rightMargin), layoutparams.width, g()), au.a(t(), l1 + k1 + 0 + (v() + x() + layoutparams.topMargin + layoutparams.bottomMargin), layoutparams.height, h()));
        x1.a = k.c(az1);
        if (j == 1)
        {
            if (j())
            {
                i1 = s() - w();
                j1 = i1 - k.d(az1);
            } else
            {
                j1 = u();
                i1 = k.d(az1) + j1;
            }
            if (y1.f == -1)
            {
                k1 = y1.b;
                l1 = y1.b - x1.a;
            } else
            {
                l1 = y1.b;
                k1 = y1.b;
                int i2 = x1.a;
                k1 += i2;
            }
        } else
        {
            l1 = v();
            k1 = k.d(az1) + l1;
            if (y1.f == -1)
            {
                i1 = y1.b;
                j1 = y1.b - x1.a;
            } else
            {
                j1 = y1.b;
                i1 = y1.b + x1.a;
            }
        }
        a(((View) (az1)), j1 + ((RecyclerView.LayoutParams) (bf1)).leftMargin, l1 + ((RecyclerView.LayoutParams) (bf1)).topMargin, i1 - ((RecyclerView.LayoutParams) (bf1)).rightMargin, k1 - ((RecyclerView.LayoutParams) (bf1)).bottomMargin);
        if (((RecyclerView.LayoutParams) (bf1)).a.n() || ((RecyclerView.LayoutParams) (bf1)).a.l())
        {
            x1.c = true;
        }
        x1.d = az1.isFocusable();
    }

    void a(bf bf1, w w1)
    {
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        super.a(accessibilityevent);
        if (r() > 0)
        {
            accessibilityevent = AccessibilityEventCompat.asRecord(accessibilityevent);
            accessibilityevent.setFromIndex(l());
            accessibilityevent.setToIndex(m());
        }
    }

    public final void a(String s)
    {
        if (o == null)
        {
            super.a(s);
        }
    }

    public final int b(int i1, az az1, bf bf1)
    {
        if (j == 0)
        {
            return 0;
        } else
        {
            return d(i1, az1, bf1);
        }
    }

    public final int b(bf bf1)
    {
        return h(bf1);
    }

    public RecyclerView.LayoutParams b()
    {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    public final void b(int i1)
    {
        m = i1;
        n = 0x80000000;
        if (o != null)
        {
            o.a = -1;
        }
        n();
    }

    public final int c(bf bf1)
    {
        return i(bf1);
    }

    public final View c(int i1, az az1, bf bf1)
    {
        c();
        if (r() != 0) goto _L2; else goto _L1
_L1:
        return null;
_L2:
        i1;
        JVM INSTR lookupswitch 6: default 72
    //                   1: 180
    //                   2: 185
    //                   17: 228
    //                   33: 190
    //                   66: 246
    //                   130: 209;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L3:
        i1 = 0x80000000;
_L10:
        if (i1 != 0x80000000)
        {
            k();
            View view;
            if (i1 == -1)
            {
                view = l(bf1);
            } else
            {
                view = k(bf1);
            }
            if (view != null)
            {
                k();
                a(i1, (int)(0.33F * (float)k.f()), false, bf1);
                a.g = 0x80000000;
                a.a = false;
                a(az1, a, bf1, true);
                if (i1 == -1)
                {
                    az1 = d();
                } else
                {
                    az1 = B();
                }
                if (az1 != view && az1.isFocusable())
                {
                    return az1;
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
        if (j == 1)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L9:
        if (j == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L6:
        if (j == 0)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L8:
        if (j == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
    }

    public void c(az az1, bf bf1)
    {
        Object obj;
        Object obj1;
        int i1;
        int j1;
        int k1;
        int l1;
        if (o != null && o.a())
        {
            m = o.a;
        }
        k();
        a.a = false;
        c();
        obj = p;
        obj.a = -1;
        obj.b = 0x80000000;
        obj.c = false;
        p.c = l ^ d;
        obj1 = p;
        RecyclerView.LayoutParams layoutparams;
        int i2;
        if (bf1.a() || m == -1)
        {
            i1 = 0;
        } else
        if (m < 0 || m >= bf1.e())
        {
            m = -1;
            n = 0x80000000;
            i1 = 0;
        } else
        {
label0:
            {
                obj1.a = m;
                if (o == null || !o.a())
                {
                    break label0;
                }
                obj1.c = o.c;
                if (((w) (obj1)).c)
                {
                    obj1.b = k.d() - o.b;
                } else
                {
                    obj1.b = k.c() + o.b;
                }
                i1 = 1;
            }
        }
_L8:
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (r() == 0)
        {
            break MISSING_BLOCK_LABEL_1697;
        }
        boolean flag;
        if (super.r == null)
        {
            obj = null;
        } else
        {
            obj = super.r.getFocusedChild();
            if (obj == null || super.q.b(((View) (obj))))
            {
                obj = null;
            }
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        layoutparams = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
        if (!layoutparams.a.n() && layoutparams.a.c() >= 0 && layoutparams.a.c() < bf1.e())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        j1 = ((w) (obj1)).d.k.b();
        if (j1 >= 0)
        {
            ((w) (obj1)).a(((View) (obj)));
        } else
        {
            obj1.a = e(((View) (obj)));
            if (((w) (obj1)).c)
            {
                i1 = ((w) (obj1)).d.k.d() - j1 - ((w) (obj1)).d.k.b(((View) (obj)));
                obj1.b = ((w) (obj1)).d.k.d() - i1;
                if (i1 > 0)
                {
                    j1 = ((w) (obj1)).d.k.c(((View) (obj)));
                    k1 = ((w) (obj1)).b;
                    l1 = ((w) (obj1)).d.k.c();
                    j1 = k1 - j1 - (Math.min(((w) (obj1)).d.k.a(((View) (obj))) - l1, 0) + l1);
                    if (j1 < 0)
                    {
                        k1 = ((w) (obj1)).b;
                        obj1.b = Math.min(i1, -j1) + k1;
                    }
                }
            } else
            {
                k1 = ((w) (obj1)).d.k.a(((View) (obj)));
                i1 = k1 - ((w) (obj1)).d.k.c();
                obj1.b = k1;
                if (i1 > 0)
                {
                    l1 = ((w) (obj1)).d.k.c(((View) (obj)));
                    int j2 = ((w) (obj1)).d.k.d();
                    int l2 = ((w) (obj1)).d.k.b(((View) (obj)));
                    j1 = ((w) (obj1)).d.k.d() - Math.min(0, j2 - j1 - l2) - (k1 + l1);
                    if (j1 < 0)
                    {
                        obj1.b = ((w) (obj1)).b - Math.min(i1, -j1);
                    }
                }
            }
        }
        i1 = 1;
_L11:
        if (i1 == 0)
        {
            ((w) (obj1)).a();
            if (d)
            {
                i1 = bf1.e() - 1;
            } else
            {
                i1 = 0;
            }
            obj1.a = i1;
        }
_L2:
        i1 = g(bf1);
        if (a.j >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + k.c();
        l1 = i1 + k.g();
        i1 = l1;
        j1 = k1;
        if (bf1.a())
        {
            i1 = l1;
            j1 = k1;
            if (m != -1)
            {
                i1 = l1;
                j1 = k1;
                if (n != 0x80000000)
                {
                    obj = a(m);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        if (l)
                        {
                            i1 = k.d() - k.b(((View) (obj))) - n;
                        } else
                        {
                            i1 = k.a(((View) (obj)));
                            j1 = k.c();
                            i1 = n - (i1 - j1);
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
        a(bf1, p);
        a(az1);
        a.i = bf1.a();
        if (p.c)
        {
            b(p);
            a.h = j1;
            a(az1, a, bf1, false);
            l1 = a.b;
            i2 = a.d;
            j1 = i1;
            if (a.c > 0)
            {
                j1 = i1 + a.c;
            }
            a(p);
            a.h = j1;
            obj = a;
            obj.d = ((y) (obj)).d + a.e;
            a(az1, a, bf1, false);
            k1 = a.b;
            int k2;
            int i3;
            int j3;
            int k3;
            boolean flag1;
            if (a.c > 0)
            {
                i1 = a.c;
                f(i2, l1);
                a.h = i1;
                a(az1, a, bf1, false);
                i1 = a.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(p);
            a.h = i1;
            a(az1, a, bf1, false);
            k1 = a.b;
            k2 = a.d;
            i1 = j1;
            if (a.c > 0)
            {
                i1 = j1 + a.c;
            }
            b(p);
            a.h = i1;
            obj = a;
            obj.d = ((y) (obj)).d + a.e;
            a(az1, a, bf1, false);
            l1 = a.b;
            i1 = k1;
            j1 = l1;
            if (a.c > 0)
            {
                i1 = a.c;
                e(k2, k1);
                a.h = i1;
                a(az1, a, bf1, false);
                i1 = a.b;
                j1 = l1;
            }
        }
        if (r() > 0)
        {
            if (l ^ d)
            {
                k1 = a(i1, az1, bf1, true);
                l1 = j1 + k1;
                j1 = b(l1, az1, bf1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, az1, bf1, true);
                i1 += k1;
                k2 = a(i1, az1, bf1, false);
                l1 = j1 + k1 + k2;
                k1 = i1 + k2;
            }
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if (bf1.b() && r() != 0 && !bf1.a() && e())
        {
            i1 = 0;
            j1 = 0;
            obj = az1.b();
            j3 = ((List) (obj)).size();
            k3 = e(c(0));
            k2 = 0;
            while (k2 < j3) 
            {
                obj1 = (bi)((List) (obj)).get(k2);
                if (!((bi) (obj1)).n())
                {
                    if (((bi) (obj1)).c() < k3)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 != l)
                    {
                        i3 = -1;
                    } else
                    {
                        i3 = 1;
                    }
                    if (i3 == -1)
                    {
                        i3 = k.c(((bi) (obj1)).a) + i1;
                        i1 = j1;
                        j1 = i3;
                    } else
                    {
                        i3 = k.c(((bi) (obj1)).a) + j1;
                        j1 = i1;
                        i1 = i3;
                    }
                } else
                {
                    i3 = i1;
                    i1 = j1;
                    j1 = i3;
                }
                i3 = k2 + 1;
                k2 = j1;
                j1 = i1;
                i1 = k2;
                k2 = i3;
            }
            a.k = ((List) (obj));
            if (i1 > 0)
            {
                f(e(d()), l1);
                a.h = i1;
                a.c = 0;
                a.a(null);
                a(az1, a, bf1, false);
            }
            if (j1 > 0)
            {
                e(e(B()), k1);
                a.h = j1;
                a.c = 0;
                a.a(null);
                a(az1, a, bf1, false);
            }
            a.k = null;
        }
        if (!bf1.a())
        {
            m = -1;
            n = 0x80000000;
            k.a();
        }
        b = d;
        o = null;
        return;
        if (n != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1147;
        }
        obj = a(m);
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (k.c(((View) (obj))) > k.f())
        {
            ((w) (obj1)).a();
        } else
        if (k.a(((View) (obj))) - k.c() < 0)
        {
            obj1.b = k.c();
            obj1.c = false;
        } else
        {
label1:
            {
                if (k.d() - k.b(((View) (obj))) >= 0)
                {
                    break label1;
                }
                obj1.b = k.d();
                obj1.c = true;
            }
        }
_L10:
        i1 = 1;
          goto _L8
        if (((w) (obj1)).c)
        {
            i1 = k.b(((View) (obj))) + k.b();
        } else
        {
            i1 = k.a(((View) (obj)));
        }
        obj1.b = i1;
_L9:
        i1 = 1;
          goto _L8
_L7:
        if (r() > 0)
        {
            i1 = e(c(0));
            if (m < i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == l)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1.c = flag;
        }
        ((w) (obj1)).a();
          goto _L9
        obj1.c = l;
        if (l)
        {
            obj1.b = k.d() - n;
        } else
        {
            obj1.b = k.c() + n;
        }
          goto _L10
_L4:
        if (b != d)
        {
            break MISSING_BLOCK_LABEL_1697;
        }
        if (((w) (obj1)).c)
        {
            obj = k(bf1);
        } else
        {
            obj = l(bf1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1697;
        }
        ((w) (obj1)).a(((View) (obj)));
        if (!bf1.a() && e())
        {
            if (k.a(((View) (obj))) >= k.d() || k.b(((View) (obj))) < k.c())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (((w) (obj1)).c)
                {
                    i1 = k.d();
                } else
                {
                    i1 = k.c();
                }
                obj1.b = i1;
            }
        }
        i1 = 1;
          goto _L11
        i1 = 0;
          goto _L11
    }

    public final int d(bf bf1)
    {
        return i(bf1);
    }

    public final int e(bf bf1)
    {
        return j(bf1);
    }

    public boolean e()
    {
        return o == null && b == d;
    }

    public final int f(bf bf1)
    {
        return j(bf1);
    }

    public final Parcelable f()
    {
        if (o != null)
        {
            return new SavedState(o);
        }
        SavedState savedstate = new SavedState();
        if (r() > 0)
        {
            k();
            boolean flag = b ^ l;
            savedstate.c = flag;
            if (flag)
            {
                View view = B();
                savedstate.b = k.d() - k.b(view);
                savedstate.a = e(view);
                return savedstate;
            } else
            {
                View view1 = d();
                savedstate.a = e(view1);
                savedstate.b = k.a(view1) - k.c();
                return savedstate;
            }
        } else
        {
            savedstate.a = -1;
            return savedstate;
        }
    }

    public final boolean g()
    {
        return j == 0;
    }

    public final boolean h()
    {
        return j == 1;
    }

    public final void i()
    {
        a(((String) (null)));
        if (1 == j)
        {
            return;
        } else
        {
            j = 1;
            k = null;
            n();
            return;
        }
    }

    protected final boolean j()
    {
        return ViewCompat.getLayoutDirection(super.r) == 1;
    }

    final void k()
    {
        if (a == null)
        {
            a = new y();
        }
        if (k == null)
        {
            k = ad.a(this, j);
        }
    }

    public final int l()
    {
        View view = a(0, r(), false);
        if (view == null)
        {
            return -1;
        } else
        {
            return e(view);
        }
    }

    public final int m()
    {
        View view = a(r() - 1, -1, false);
        if (view == null)
        {
            return -1;
        } else
        {
            return e(view);
        }
    }

    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new z();
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
