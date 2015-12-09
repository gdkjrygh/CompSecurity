// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.ad;
import android.support.v4.view.bp;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

// Referenced classes of package android.support.v7.widget:
//            bj, ad, au, af, 
//            ae, bs, bv, bm, 
//            RecyclerView, by, n

public final class LinearLayoutManager extends bj
{

    int a;
    au b;
    boolean c;
    int d;
    int e;
    SavedState f;
    final android.support.v7.widget.ad g;
    private af k;
    private boolean l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public LinearLayoutManager()
    {
        this((byte)0);
    }

    private LinearLayoutManager(byte byte0)
    {
        m = false;
        c = false;
        n = false;
        o = true;
        d = -1;
        e = 0x80000000;
        f = null;
        g = new android.support.v7.widget.ad(this);
        a(((String) (null)));
        if (1 != a)
        {
            a = 1;
            b = null;
            f();
        }
        a(((String) (null)));
        if (m)
        {
            m = false;
            f();
        }
    }

    private int a(int i1, bm bm1, bs bs1, boolean flag)
    {
        int j1 = b.d() - i1;
        if (j1 > 0)
        {
            int k1 = -d(-j1, bm1, bs1);
            j1 = k1;
            if (flag)
            {
                i1 = b.d() - (i1 + k1);
                j1 = k1;
                if (i1 > 0)
                {
                    b.a(i1);
                    j1 = k1 + i1;
                }
            }
            return j1;
        } else
        {
            return 0;
        }
    }

    private int a(bm bm1, af af1, bs bs1, boolean flag)
    {
        ae ae1;
        int k1;
        int l2;
        l2 = af1.c;
        if (af1.g != 0x80000000)
        {
            if (af1.c < 0)
            {
                af1.g = af1.g + af1.c;
            }
            a(bm1, af1);
        }
        int i1 = af1.c;
        k1 = af1.h;
        ae1 = new ae();
        k1 = i1 + k1;
_L11:
        if (k1 <= 0) goto _L2; else goto _L1
_L1:
        Object obj;
        int j1;
        int l1;
        if (af1.d >= 0 && af1.d < bs1.e())
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        if (j1 == 0) goto _L2; else goto _L3
_L3:
        ae1.a = 0;
        ae1.b = false;
        ae1.c = false;
        ae1.d = false;
        if (af1.k == null)
        {
            break MISSING_BLOCK_LABEL_379;
        }
        l1 = af1.k.size();
        j1 = 0;
_L8:
        if (j1 >= l1) goto _L5; else goto _L4
_L4:
        obj = (bv)af1.k.get(j1);
        if (((bv) (obj)).isRemoved() || af1.d != ((bv) (obj)).getLayoutPosition()) goto _L7; else goto _L6
_L6:
        af1.a(((bv) (obj)));
        obj = ((bv) (obj)).itemView;
_L9:
        if (obj == null)
        {
            ae1.b = true;
        } else
        {
            RecyclerView.LayoutParams layoutparams = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
            int i2;
            int j2;
            int k2;
            if (af1.k == null)
            {
                boolean flag3 = c;
                RecyclerView.LayoutParams layoutparams1;
                Rect rect;
                int i3;
                boolean flag1;
                if (af1.f == -1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag3 == flag1)
                {
                    a(((View) (obj)));
                } else
                {
                    b(((View) (obj)));
                }
            } else
            {
                boolean flag4 = c;
                boolean flag2;
                if (af1.f == -1)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag4 == flag2)
                {
                    a(((View) (obj)), -1);
                } else
                {
                    a(((View) (obj)), 0);
                }
            }
            layoutparams1 = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
            rect = super.i.d(((View) (obj)));
            j1 = rect.left;
            i2 = rect.right;
            j2 = rect.top;
            k2 = rect.bottom;
            ((View) (obj)).measure(android.support.v7.widget.bj.a(k(), j1 + i2 + 0 + (m() + o() + layoutparams1.leftMargin + layoutparams1.rightMargin), layoutparams1.width, c()), android.support.v7.widget.bj.a(l(), k2 + j2 + 0 + (n() + p() + layoutparams1.topMargin + layoutparams1.bottomMargin), layoutparams1.height, d()));
            ae1.a = b.c(((View) (obj)));
            if (a == 1)
            {
                if (u())
                {
                    i2 = k() - o();
                    j1 = i2 - b.d(((View) (obj)));
                } else
                {
                    j1 = m();
                    i2 = b.d(((View) (obj))) + j1;
                }
                if (af1.f == -1)
                {
                    k2 = af1.b;
                    j2 = af1.b;
                    i3 = ae1.a;
                    j2 -= i3;
                } else
                {
                    j2 = af1.b;
                    k2 = af1.b + ae1.a;
                }
            } else
            {
                j2 = n();
                k2 = j2 + b.d(((View) (obj)));
                if (af1.f == -1)
                {
                    i2 = af1.b;
                    j1 = af1.b - ae1.a;
                } else
                {
                    j1 = af1.b;
                    i2 = af1.b + ae1.a;
                }
            }
            a(((View) (obj)), j1 + layoutparams.leftMargin, j2 + layoutparams.topMargin, i2 - layoutparams.rightMargin, k2 - layoutparams.bottomMargin);
            if (layoutparams.a.isRemoved() || layoutparams.a.isChanged())
            {
                ae1.c = true;
            }
            ae1.d = ((View) (obj)).isFocusable();
        }
        if (!ae1.b)
        {
            af1.b = af1.b + ae1.a * af1.f;
            if (!ae1.c || k.k != null || !bs1.a())
            {
                af1.c = af1.c - ae1.a;
                j1 = k1 - ae1.a;
            } else
            {
                j1 = k1;
            }
            if (af1.g != 0x80000000)
            {
                af1.g = af1.g + ae1.a;
                if (af1.c < 0)
                {
                    af1.g = af1.g + af1.c;
                }
                a(bm1, af1);
            }
            if (!flag || !ae1.d)
            {
                break MISSING_BLOCK_LABEL_941;
            }
        }
_L2:
        return l2 - af1.c;
_L7:
        j1++;
          goto _L8
_L5:
        obj = null;
          goto _L9
        obj = bm1.a(af1.d);
        af1.d = af1.d + af1.e;
          goto _L9
        k1 = j1;
        if (true) goto _L11; else goto _L10
_L10:
    }

    private View a(int i1, int j1, int k1)
    {
        View view1;
label0:
        {
            View view3;
label1:
            {
                View view = null;
                v();
                int i2 = b.c();
                int j2 = b.d();
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
                    View view2 = b(i1);
                    int k2 = c(view2);
                    if (k2 >= 0 && k2 < k1)
                    {
                        if (((RecyclerView.LayoutParams)view2.getLayoutParams()).a.isRemoved())
                        {
                            if (view1 == null)
                            {
                                view1 = view2;
                            }
                        } else
                        {
                            if (b.a(view2) < j2)
                            {
                                view3 = view2;
                                if (b.b(view2) >= i2)
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

    private View a(int i1, int j1, boolean flag)
    {
        v();
        int k1 = b.c();
        int l1 = b.d();
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
            View view1 = b(i1);
            int i2 = b.a(view1);
            int j2 = b.b(view1);
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
        if (c)
        {
            return a(j() - 1, -1, flag);
        } else
        {
            return a(0, j(), flag);
        }
    }

    private void a(int i1, int j1, boolean flag, bs bs1)
    {
        byte byte0 = -1;
        boolean flag1 = true;
        k.h = g(bs1);
        k.f = i1;
        if (i1 == 1)
        {
            bs1 = k;
            bs1.h = ((af) (bs1)).h + b.g();
            bs1 = x();
            af af1 = k;
            if (c)
            {
                i1 = byte0;
            } else
            {
                i1 = 1;
            }
            af1.e = i1;
            k.d = c(bs1) + k.e;
            k.b = b.b(bs1);
            i1 = b.b(bs1) - b.d();
        } else
        {
            bs1 = w();
            af af2 = k;
            af2.h = af2.h + b.c();
            af2 = k;
            if (c)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = -1;
            }
            af2.e = i1;
            k.d = c(bs1) + k.e;
            k.b = b.a(bs1);
            i1 = -b.a(bs1) + b.c();
        }
        k.c = j1;
        if (flag)
        {
            bs1 = k;
            bs1.c = ((af) (bs1)).c - i1;
        }
        k.g = i1;
    }

    private void a(android.support.v7.widget.ad ad1)
    {
        e(ad1.a, ad1.b);
    }

    private void a(bm bm1, int i1, int j1)
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
            a(j1, bm1);
            j1--;
        }
        if (true) goto _L1; else goto _L3
_L3:
        while (k1 > j1) 
        {
            a(k1, bm1);
            k1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    private void a(bm bm1, af af1)
    {
        if (af1.a) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (af1.f != -1)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = af1.g;
        int j2 = j();
        if (i1 >= 0)
        {
            int l2 = b.e() - i1;
            if (c)
            {
                int j1 = 0;
                while (j1 < j2) 
                {
                    af1 = b(j1);
                    if (b.a(af1) < l2)
                    {
                        a(bm1, 0, j1);
                        return;
                    }
                    j1++;
                }
            } else
            {
                int k1 = j2 - 1;
                while (k1 >= 0) 
                {
                    af1 = b(k1);
                    if (b.a(af1) < l2)
                    {
                        a(bm1, j2 - 1, k1);
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
        k2 = af1.g;
        if (k2 < 0)
        {
            continue; /* Loop/switch isn't completed */
        }
        i3 = j();
        if (!c)
        {
            break; /* Loop/switch isn't completed */
        }
        int l1 = i3 - 1;
        while (l1 >= 0) 
        {
            af1 = b(l1);
            if (b.b(af1) > k2)
            {
                a(bm1, i3 - 1, l1);
                return;
            }
            l1--;
        }
        if (true) goto _L1; else goto _L4
_L4:
        int i2 = 0;
        while (i2 < i3) 
        {
            af1 = b(i2);
            if (b.b(af1) > k2)
            {
                a(bm1, 0, i2);
                return;
            }
            i2++;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    private int b(int i1, bm bm1, bs bs1, boolean flag)
    {
        int j1 = i1 - b.c();
        if (j1 > 0)
        {
            int k1 = -d(j1, bm1, bs1);
            j1 = k1;
            if (flag)
            {
                i1 = (i1 + k1) - b.c();
                j1 = k1;
                if (i1 > 0)
                {
                    b.a(-i1);
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
        if (c)
        {
            return a(0, j(), flag);
        } else
        {
            return a(j() - 1, -1, flag);
        }
    }

    private void b(android.support.v7.widget.ad ad1)
    {
        f(ad1.a, ad1.b);
    }

    private int d(int i1, bm bm1, bs bs1)
    {
        if (j() == 0 || i1 == 0)
        {
            return 0;
        }
        k.a = true;
        v();
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
        a(j1, k1, true, bs1);
        l1 = k.g + a(bm1, k, bs1, false);
        if (l1 < 0)
        {
            return 0;
        }
        if (k1 > l1)
        {
            i1 = j1 * l1;
        }
        b.a(-i1);
        k.j = i1;
        return i1;
    }

    private void e(int i1, int j1)
    {
        k.c = b.d() - j1;
        af af1 = k;
        int k1;
        if (c)
        {
            k1 = -1;
        } else
        {
            k1 = 1;
        }
        af1.e = k1;
        k.d = i1;
        k.f = 1;
        k.b = j1;
        k.g = 0x80000000;
    }

    private View f(int i1)
    {
        return a(0, j(), i1);
    }

    private void f(int i1, int j1)
    {
        k.c = j1 - b.c();
        k.d = i1;
        af af1 = k;
        if (c)
        {
            i1 = 1;
        } else
        {
            i1 = -1;
        }
        af1.e = i1;
        k.f = -1;
        k.b = j1;
        k.g = 0x80000000;
    }

    private int g(bs bs1)
    {
        if (bs1.d())
        {
            return b.f();
        } else
        {
            return 0;
        }
    }

    private View g(int i1)
    {
        return a(j() - 1, -1, i1);
    }

    private int h(bs bs1)
    {
        boolean flag1 = true;
        if (j() == 0)
        {
            return 0;
        }
        v();
        au au1 = b;
        View view;
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!o)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return android.support.v7.widget.by.a(bs1, au1, view, b(flag), this, o, c);
    }

    private int i(bs bs1)
    {
        boolean flag1 = true;
        if (j() == 0)
        {
            return 0;
        }
        v();
        au au1 = b;
        View view;
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!o)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return android.support.v7.widget.by.a(bs1, au1, view, b(flag), this, o);
    }

    private int j(bs bs1)
    {
        boolean flag1 = true;
        if (j() == 0)
        {
            return 0;
        }
        v();
        au au1 = b;
        View view;
        boolean flag;
        if (!o)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view = a(flag);
        if (!o)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return by.b(bs1, au1, view, b(flag), this, o);
    }

    private View k(bs bs1)
    {
        if (c)
        {
            return f(bs1.e());
        } else
        {
            return g(bs1.e());
        }
    }

    private View l(bs bs1)
    {
        if (c)
        {
            return g(bs1.e());
        } else
        {
            return f(bs1.e());
        }
    }

    private void t()
    {
        boolean flag = true;
        if (a != 1 && u()) goto _L2; else goto _L1
_L1:
        flag = m;
_L4:
        c = flag;
        return;
_L2:
        if (m)
        {
            flag = false;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean u()
    {
        return bp.h(super.i) == 1;
    }

    private void v()
    {
        if (k == null)
        {
            k = new af();
        }
        if (b == null)
        {
            b = android.support.v7.widget.au.a(this, a);
        }
    }

    private View w()
    {
        int i1;
        if (c)
        {
            i1 = j() - 1;
        } else
        {
            i1 = 0;
        }
        return b(i1);
    }

    private View x()
    {
        int i1;
        if (c)
        {
            i1 = 0;
        } else
        {
            i1 = j() - 1;
        }
        return b(i1);
    }

    public final int a(int i1, bm bm1, bs bs1)
    {
        if (a == 1)
        {
            return 0;
        } else
        {
            return d(i1, bm1, bs1);
        }
    }

    public final int a(bs bs1)
    {
        return h(bs1);
    }

    public final RecyclerView.LayoutParams a()
    {
        return new RecyclerView.LayoutParams();
    }

    public final View a(int i1)
    {
        int j1 = j();
        if (j1 != 0)
        {
            if ((i1 -= c(b(0))) >= 0 && i1 < j1)
            {
                return b(i1);
            }
        }
        return null;
    }

    public final void a(Parcelable parcelable)
    {
        if (parcelable instanceof SavedState)
        {
            f = (SavedState)parcelable;
            f();
        }
    }

    public final void a(RecyclerView recyclerview, bm bm1)
    {
        super.a(recyclerview, bm1);
        if (p)
        {
            c(bm1);
            bm1.a();
        }
    }

    public final void a(bm bm1, bs bs1)
    {
        Object obj;
        Object obj1;
        int i1;
        int j1;
        int k1;
        int l1;
        if (f != null && f.a())
        {
            d = f.a;
        }
        v();
        k.a = false;
        t();
        obj = g;
        obj.a = -1;
        obj.b = 0x80000000;
        obj.c = false;
        g.c = c ^ n;
        obj1 = g;
        RecyclerView.LayoutParams layoutparams;
        int i2;
        if (bs1.a() || d == -1)
        {
            i1 = 0;
        } else
        if (d < 0 || d >= bs1.e())
        {
            d = -1;
            e = 0x80000000;
            i1 = 0;
        } else
        {
label0:
            {
                obj1.a = d;
                if (f == null || !f.a())
                {
                    break label0;
                }
                obj1.c = f.c;
                if (((android.support.v7.widget.ad) (obj1)).c)
                {
                    obj1.b = b.d() - f.b;
                } else
                {
                    obj1.b = b.c() + f.b;
                }
                i1 = 1;
            }
        }
_L8:
        if (i1 != 0) goto _L2; else goto _L1
_L1:
        if (j() == 0)
        {
            break MISSING_BLOCK_LABEL_1688;
        }
        boolean flag;
        if (super.i == null)
        {
            obj = null;
        } else
        {
            obj = super.i.getFocusedChild();
            if (obj == null || super.h.b(((View) (obj))))
            {
                obj = null;
            }
        }
        if (obj == null) goto _L4; else goto _L3
_L3:
        layoutparams = (RecyclerView.LayoutParams)((View) (obj)).getLayoutParams();
        if (!layoutparams.a.isRemoved() && layoutparams.a.getLayoutPosition() >= 0 && layoutparams.a.getLayoutPosition() < bs1.e())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L4; else goto _L5
_L5:
        j1 = ((android.support.v7.widget.ad) (obj1)).d.b.b();
        if (j1 >= 0)
        {
            ((android.support.v7.widget.ad) (obj1)).a(((View) (obj)));
        } else
        {
            obj1.a = c(((View) (obj)));
            if (((android.support.v7.widget.ad) (obj1)).c)
            {
                i1 = ((android.support.v7.widget.ad) (obj1)).d.b.d() - j1 - ((android.support.v7.widget.ad) (obj1)).d.b.b(((View) (obj)));
                obj1.b = ((android.support.v7.widget.ad) (obj1)).d.b.d() - i1;
                if (i1 > 0)
                {
                    j1 = ((android.support.v7.widget.ad) (obj1)).d.b.c(((View) (obj)));
                    k1 = ((android.support.v7.widget.ad) (obj1)).b;
                    l1 = ((android.support.v7.widget.ad) (obj1)).d.b.c();
                    j1 = k1 - j1 - (Math.min(((android.support.v7.widget.ad) (obj1)).d.b.a(((View) (obj))) - l1, 0) + l1);
                    if (j1 < 0)
                    {
                        k1 = ((android.support.v7.widget.ad) (obj1)).b;
                        obj1.b = Math.min(i1, -j1) + k1;
                    }
                }
            } else
            {
                k1 = ((android.support.v7.widget.ad) (obj1)).d.b.a(((View) (obj)));
                i1 = k1 - ((android.support.v7.widget.ad) (obj1)).d.b.c();
                obj1.b = k1;
                if (i1 > 0)
                {
                    l1 = ((android.support.v7.widget.ad) (obj1)).d.b.c(((View) (obj)));
                    int j2 = ((android.support.v7.widget.ad) (obj1)).d.b.d();
                    int l2 = ((android.support.v7.widget.ad) (obj1)).d.b.b(((View) (obj)));
                    j1 = ((android.support.v7.widget.ad) (obj1)).d.b.d() - Math.min(0, j2 - j1 - l2) - (k1 + l1);
                    if (j1 < 0)
                    {
                        obj1.b = ((android.support.v7.widget.ad) (obj1)).b - Math.min(i1, -j1);
                    }
                }
            }
        }
        i1 = 1;
_L11:
        if (i1 == 0)
        {
            ((android.support.v7.widget.ad) (obj1)).a();
            if (n)
            {
                i1 = bs1.e() - 1;
            } else
            {
                i1 = 0;
            }
            obj1.a = i1;
        }
_L2:
        i1 = g(bs1);
        if (k.j >= 0)
        {
            j1 = 0;
        } else
        {
            j1 = i1;
            i1 = 0;
        }
        k1 = j1 + b.c();
        l1 = i1 + b.g();
        i1 = l1;
        j1 = k1;
        if (bs1.a())
        {
            i1 = l1;
            j1 = k1;
            if (d != -1)
            {
                i1 = l1;
                j1 = k1;
                if (e != 0x80000000)
                {
                    obj = a(d);
                    i1 = l1;
                    j1 = k1;
                    if (obj != null)
                    {
                        if (c)
                        {
                            i1 = b.d() - b.b(((View) (obj))) - e;
                        } else
                        {
                            i1 = b.a(((View) (obj)));
                            j1 = b.c();
                            i1 = e - (i1 - j1);
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
        a(bm1);
        k.i = bs1.a();
        if (g.c)
        {
            b(g);
            k.h = j1;
            a(bm1, k, bs1, false);
            l1 = k.b;
            i2 = k.d;
            j1 = i1;
            if (k.c > 0)
            {
                j1 = i1 + k.c;
            }
            a(g);
            k.h = j1;
            obj = k;
            obj.d = ((af) (obj)).d + k.e;
            a(bm1, k, bs1, false);
            k1 = k.b;
            int k2;
            int i3;
            int j3;
            int k3;
            boolean flag1;
            if (k.c > 0)
            {
                i1 = k.c;
                f(i2, l1);
                k.h = i1;
                a(bm1, k, bs1, false);
                i1 = k.b;
            } else
            {
                i1 = l1;
            }
            j1 = i1;
            i1 = k1;
        } else
        {
            a(g);
            k.h = i1;
            a(bm1, k, bs1, false);
            k1 = k.b;
            k2 = k.d;
            i1 = j1;
            if (k.c > 0)
            {
                i1 = j1 + k.c;
            }
            b(g);
            k.h = i1;
            obj = k;
            obj.d = ((af) (obj)).d + k.e;
            a(bm1, k, bs1, false);
            l1 = k.b;
            i1 = k1;
            j1 = l1;
            if (k.c > 0)
            {
                i1 = k.c;
                e(k2, k1);
                k.h = i1;
                a(bm1, k, bs1, false);
                i1 = k.b;
                j1 = l1;
            }
        }
        if (j() > 0)
        {
            if (c ^ n)
            {
                k1 = a(i1, bm1, bs1, true);
                l1 = j1 + k1;
                j1 = b(l1, bm1, bs1, false);
                l1 += j1;
                k1 = i1 + k1 + j1;
            } else
            {
                k1 = b(j1, bm1, bs1, true);
                i1 += k1;
                k2 = a(i1, bm1, bs1, false);
                l1 = j1 + k1 + k2;
                k1 = i1 + k2;
            }
        } else
        {
            k1 = i1;
            l1 = j1;
        }
        if (bs1.b() && j() != 0 && !bs1.a() && e())
        {
            i1 = 0;
            j1 = 0;
            obj = bm1.b();
            j3 = ((List) (obj)).size();
            k3 = c(b(0));
            k2 = 0;
            while (k2 < j3) 
            {
                obj1 = (bv)((List) (obj)).get(k2);
                if (!((bv) (obj1)).isRemoved())
                {
                    if (((bv) (obj1)).getLayoutPosition() < k3)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if (flag1 != c)
                    {
                        i3 = -1;
                    } else
                    {
                        i3 = 1;
                    }
                    if (i3 == -1)
                    {
                        i3 = b.c(((bv) (obj1)).itemView) + i1;
                        i1 = j1;
                        j1 = i3;
                    } else
                    {
                        i3 = b.c(((bv) (obj1)).itemView) + j1;
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
            k.k = ((List) (obj));
            if (i1 > 0)
            {
                f(c(w()), l1);
                k.h = i1;
                k.c = 0;
                k.a(null);
                a(bm1, k, bs1, false);
            }
            if (j1 > 0)
            {
                e(c(x()), k1);
                k.h = j1;
                k.c = 0;
                k.a(null);
                a(bm1, k, bs1, false);
            }
            k.k = null;
        }
        if (!bs1.a())
        {
            d = -1;
            e = 0x80000000;
            b.a();
        }
        l = n;
        f = null;
        return;
        if (e != 0x80000000)
        {
            break MISSING_BLOCK_LABEL_1138;
        }
        obj = a(d);
        if (obj == null) goto _L7; else goto _L6
_L6:
        if (b.c(((View) (obj))) > b.f())
        {
            ((android.support.v7.widget.ad) (obj1)).a();
        } else
        if (b.a(((View) (obj))) - b.c() < 0)
        {
            obj1.b = b.c();
            obj1.c = false;
        } else
        {
label1:
            {
                if (b.d() - b.b(((View) (obj))) >= 0)
                {
                    break label1;
                }
                obj1.b = b.d();
                obj1.c = true;
            }
        }
_L10:
        i1 = 1;
          goto _L8
        if (((android.support.v7.widget.ad) (obj1)).c)
        {
            i1 = b.b(((View) (obj))) + b.b();
        } else
        {
            i1 = b.a(((View) (obj)));
        }
        obj1.b = i1;
_L9:
        i1 = 1;
          goto _L8
_L7:
        if (j() > 0)
        {
            i1 = c(b(0));
            if (d < i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag == c)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj1.c = flag;
        }
        ((android.support.v7.widget.ad) (obj1)).a();
          goto _L9
        obj1.c = c;
        if (c)
        {
            obj1.b = b.d() - e;
        } else
        {
            obj1.b = b.c() + e;
        }
          goto _L10
_L4:
        if (l != n)
        {
            break MISSING_BLOCK_LABEL_1688;
        }
        if (((android.support.v7.widget.ad) (obj1)).c)
        {
            obj = k(bs1);
        } else
        {
            obj = l(bs1);
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_1688;
        }
        ((android.support.v7.widget.ad) (obj1)).a(((View) (obj)));
        if (!bs1.a() && e())
        {
            if (b.a(((View) (obj))) >= b.d() || b.b(((View) (obj))) < b.c())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                if (((android.support.v7.widget.ad) (obj1)).c)
                {
                    i1 = b.d();
                } else
                {
                    i1 = b.c();
                }
                obj1.b = i1;
            }
        }
        i1 = 1;
          goto _L11
        i1 = 0;
          goto _L11
    }

    public final void a(AccessibilityEvent accessibilityevent)
    {
        byte byte0 = -1;
        super.a(accessibilityevent);
        if (j() > 0)
        {
            accessibilityevent = android.support.v4.view.a.a.a(accessibilityevent);
            View view = a(0, j(), false);
            int i1;
            if (view == null)
            {
                i1 = -1;
            } else
            {
                i1 = c(view);
            }
            accessibilityevent.b(i1);
            view = a(j() - 1, -1, false);
            if (view == null)
            {
                i1 = byte0;
            } else
            {
                i1 = c(view);
            }
            accessibilityevent.c(i1);
        }
    }

    public final void a(String s)
    {
        if (f == null)
        {
            super.a(s);
        }
    }

    public final int b(int i1, bm bm1, bs bs1)
    {
        if (a == 0)
        {
            return 0;
        } else
        {
            return d(i1, bm1, bs1);
        }
    }

    public final int b(bs bs1)
    {
        return h(bs1);
    }

    public final Parcelable b()
    {
        if (f != null)
        {
            return new SavedState(f);
        }
        SavedState savedstate = new SavedState();
        if (j() > 0)
        {
            v();
            boolean flag = l ^ c;
            savedstate.c = flag;
            if (flag)
            {
                View view = x();
                savedstate.b = b.d() - b.b(view);
                savedstate.a = c(view);
                return savedstate;
            } else
            {
                View view1 = w();
                savedstate.a = c(view1);
                savedstate.b = b.a(view1) - b.c();
                return savedstate;
            }
        } else
        {
            savedstate.a = -1;
            return savedstate;
        }
    }

    public final int c(bs bs1)
    {
        return i(bs1);
    }

    public final View c(int i1, bm bm1, bs bs1)
    {
        t();
        if (j() != 0) goto _L2; else goto _L1
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
            v();
            View view;
            if (i1 == -1)
            {
                view = l(bs1);
            } else
            {
                view = k(bs1);
            }
            if (view != null)
            {
                v();
                a(i1, (int)(0.33F * (float)b.f()), false, bs1);
                k.g = 0x80000000;
                k.a = false;
                a(bm1, k, bs1, true);
                if (i1 == -1)
                {
                    bm1 = w();
                } else
                {
                    bm1 = x();
                }
                if (bm1 != view && bm1.isFocusable())
                {
                    return bm1;
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
        if (a == 1)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L9:
        if (a == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L6:
        if (a == 0)
        {
            i1 = -1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
_L8:
        if (a == 0)
        {
            i1 = 1;
        } else
        {
            i1 = 0x80000000;
        }
          goto _L10
    }

    public final boolean c()
    {
        return a == 0;
    }

    public final int d(bs bs1)
    {
        return i(bs1);
    }

    public final boolean d()
    {
        return a == 1;
    }

    public final int e(bs bs1)
    {
        return j(bs1);
    }

    public final boolean e()
    {
        return f == null && l == n;
    }

    public final int f(bs bs1)
    {
        return j(bs1);
    }

    private class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new ag();
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
