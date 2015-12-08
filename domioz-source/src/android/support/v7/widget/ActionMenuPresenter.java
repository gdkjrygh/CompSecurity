// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v7.a.h;
import android.support.v7.a.i;
import android.support.v7.internal.view.a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.ad;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.v;
import android.support.v7.internal.view.menu.z;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            g, ActionMenuView, d, b, 
//            a, c, f

public final class ActionMenuPresenter extends d
    implements o
{

    final g g = new g(this, (byte)0);
    int h;
    private View i;
    private boolean j;
    private boolean k;
    private int l;
    private int m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private int s;
    private final SparseBooleanArray t = new SparseBooleanArray();
    private View u;
    private f v;
    private android.support.v7.widget.a w;
    private c x;
    private b y;

    public ActionMenuPresenter(Context context)
    {
        super(context, i.c, i.b);
    }

    static f a(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.v;
    }

    static f a(ActionMenuPresenter actionmenupresenter, f f1)
    {
        actionmenupresenter.v = f1;
        return f1;
    }

    static c b(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.x;
    }

    static android.support.v7.internal.view.menu.i c(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.c;
    }

    static View d(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.i;
    }

    static z e(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.f;
    }

    static android.support.v7.widget.a f(ActionMenuPresenter actionmenupresenter)
    {
        actionmenupresenter.w = null;
        return null;
    }

    static android.support.v7.internal.view.menu.i g(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.c;
    }

    static z h(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.f;
    }

    static c i(ActionMenuPresenter actionmenupresenter)
    {
        actionmenupresenter.x = null;
        return null;
    }

    static android.support.v7.widget.a j(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.w;
    }

    public final z a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).a(this);
        return viewgroup;
    }

    public final View a(m m1, View view, ViewGroup viewgroup)
    {
        View view1 = m1.getActionView();
        if (view1 == null || m1.m())
        {
            view1 = super.a(m1, view, viewgroup);
        }
        byte byte0;
        if (m1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        m1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!m1.checkLayoutParams(view))
        {
            view1.setLayoutParams(android.support.v7.widget.ActionMenuView.a(view));
        }
        return view1;
    }

    public final void a(Context context, android.support.v7.internal.view.menu.i i1)
    {
        super.a(context, i1);
        i1 = context.getResources();
        context = android.support.v7.internal.view.a.a(context);
        if (!k)
        {
            j = context.b();
        }
        if (!q)
        {
            l = context.c();
        }
        if (!o)
        {
            n = context.a();
        }
        int j1 = l;
        if (j)
        {
            if (i == null)
            {
                i = new android.support.v7.widget.d(this, a);
                int k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(k1, k1);
            }
            j1 -= i.getMeasuredWidth();
        } else
        {
            i = null;
        }
        m = j1;
        s = (int)(56F * i1.getDisplayMetrics().density);
        u = null;
    }

    public final void a(android.support.v7.internal.view.menu.i i1, boolean flag)
    {
        i();
        super.a(i1, flag);
    }

    public final void a(m m1, aa aa1)
    {
        aa1.a(m1);
        m1 = (ActionMenuView)f;
        aa1 = (ActionMenuItemView)aa1;
        aa1.a(m1);
        if (y == null)
        {
            y = new b(this, (byte)0);
        }
        aa1.a(y);
    }

    public final void a(ActionMenuView actionmenuview)
    {
        f = actionmenuview;
        actionmenuview.a(c);
    }

    public final void a(boolean flag)
    {
        if (flag)
        {
            super.a(null);
            return;
        } else
        {
            c.a(false);
            return;
        }
    }

    public final boolean a(ad ad1)
    {
        MenuItem menuitem;
        ViewGroup viewgroup;
        if (!ad1.hasVisibleItems())
        {
            return false;
        }
        ad ad2;
        for (ad2 = ad1; ad2.r() != c; ad2 = (ad)ad2.r()) { }
        menuitem = ad2.getItem();
        viewgroup = (ViewGroup)f;
        if (viewgroup == null) goto _L2; else goto _L1
_L1:
        int i1;
        int j1;
        j1 = viewgroup.getChildCount();
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L2; else goto _L3
_L3:
        View view = viewgroup.getChildAt(i1);
        if (!(view instanceof aa) || ((aa)view).a() != menuitem) goto _L5; else goto _L4
_L5:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
_L4:
        View view1 = view;
        if (view == null)
        {
            if (i == null)
            {
                return false;
            }
            view1 = i;
        }
        h = ad1.getItem().getItemId();
        w = new android.support.v7.widget.a(this, b, ad1);
        w.a(view1);
        w.c();
        super.a(ad1);
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean a(m m1)
    {
        return m1.i();
    }

    public final boolean a(ViewGroup viewgroup, int i1)
    {
        if (viewgroup.getChildAt(i1) == i)
        {
            return false;
        } else
        {
            return super.a(viewgroup, i1);
        }
    }

    public final void b(int i1)
    {
        l = i1;
        p = true;
        q = true;
    }

    public final void b(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        ((View)f).getParent();
        super.b(flag);
        ((View)f).requestLayout();
        if (c != null)
        {
            ArrayList arraylist = c.m();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                n n1 = ((m)arraylist.get(i1)).a();
                if (n1 != null)
                {
                    n1.a(this);
                }
            }

        }
        Object obj;
        int j1;
        if (c != null)
        {
            obj = c.n();
        } else
        {
            obj = null;
        }
        j1 = ((flag2) ? 1 : 0);
        if (j)
        {
            j1 = ((flag2) ? 1 : 0);
            if (obj != null)
            {
                j1 = ((ArrayList) (obj)).size();
                if (j1 == 1)
                {
                    if (!((m)((ArrayList) (obj)).get(0)).isActionViewExpanded())
                    {
                        j1 = 1;
                    } else
                    {
                        j1 = 0;
                    }
                } else
                if (j1 > 0)
                {
                    j1 = ((flag1) ? 1 : 0);
                } else
                {
                    j1 = 0;
                }
            }
        }
        if (j1 == 0) goto _L2; else goto _L1
_L1:
        if (i == null)
        {
            i = new android.support.v7.widget.d(this, a);
        }
        obj = (ViewGroup)i.getParent();
        if (obj != f)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(i);
            }
            ((ActionMenuView)f).addView(i, ActionMenuView.b());
        }
_L4:
        ((ActionMenuView)f).a(j);
        return;
_L2:
        if (i != null && i.getParent() == f)
        {
            ((ViewGroup)f).removeView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int k1;
        int l1;
        int l4;
        int j6;
        int k6;
label0:
        {
            arraylist = c.k();
            j6 = arraylist.size();
            int i1 = n;
            l4 = m;
            k6 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)f;
            l1 = 0;
            int i2 = 0;
            boolean flag = false;
            k1 = 0;
            while (k1 < j6) 
            {
                m m1 = (m)arraylist.get(k1);
                if (m1.k())
                {
                    l1++;
                } else
                if (m1.j())
                {
                    i2++;
                } else
                {
                    flag = true;
                }
                if (r && m1.isActionViewExpanded())
                {
                    i1 = 0;
                }
                k1++;
            }
            k1 = i1;
            if (!j)
            {
                break label0;
            }
            if (!flag)
            {
                k1 = i1;
                if (l1 + i2 <= i1)
                {
                    break label0;
                }
            }
            k1 = i1 - 1;
        }
        k1 -= l1;
        SparseBooleanArray sparsebooleanarray = t;
        sparsebooleanarray.clear();
        int j1;
        int k2;
        boolean flag1;
        int j4;
        int k4;
        if (p)
        {
            j1 = l4 / s;
            l1 = s;
            int j2 = s;
            j4 = (l4 % l1) / j1 + j2;
        } else
        {
            j4 = 0;
            j1 = 0;
        }
        flag1 = false;
        k4 = 0;
        l1 = j1;
        j1 = k1;
        k2 = l4;
        k1 = ((flag1) ? 1 : 0);
        while (k4 < j6) 
        {
            m m2 = (m)arraylist.get(k4);
            if (m2.k())
            {
                View view = a(m2, u, viewgroup);
                if (u == null)
                {
                    u = view;
                }
                int l2;
                int i5;
                if (p)
                {
                    l2 = l1 - android.support.v7.widget.ActionMenuView.a(view, j4, l1, k6, 0);
                } else
                {
                    view.measure(k6, k6);
                    l2 = l1;
                }
                l1 = view.getMeasuredWidth();
                if (k1 == 0)
                {
                    k1 = l1;
                }
                i5 = m2.getGroupId();
                if (i5 != 0)
                {
                    sparsebooleanarray.put(i5, true);
                }
                m2.d(true);
                l1 = k2 - l1;
                k2 = j1;
                j1 = l2;
            } else
            if (m2.j())
            {
                int l6 = m2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(l6);
                boolean flag2;
                if ((j1 > 0 || flag3) && k2 > 0 && (!p || l1 > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                int l3;
                if (flag2)
                {
                    View view1 = a(m2, u, viewgroup);
                    if (u == null)
                    {
                        u = view1;
                    }
                    int j3;
                    int k5;
                    if (p)
                    {
                        int j5 = android.support.v7.widget.ActionMenuView.a(view1, j4, l1, k6, 0);
                        int i3 = l1 - j5;
                        l1 = i3;
                        if (j5 == 0)
                        {
                            flag2 = false;
                            l1 = i3;
                        }
                    } else
                    {
                        view1.measure(k6, k6);
                    }
                    k5 = view1.getMeasuredWidth();
                    k2 -= k5;
                    j3 = k1;
                    if (k1 == 0)
                    {
                        j3 = k5;
                    }
                    if (p)
                    {
                        int l5;
                        if (k2 >= 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = l1;
                        l1 = j3;
                    } else
                    {
                        if (k2 + j3 > 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = l1;
                        l1 = j3;
                    }
                } else
                {
                    int i4 = l1;
                    l1 = k1;
                    k1 = i4;
                }
                if (flag2 && l6 != 0)
                {
                    sparsebooleanarray.put(l6, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(l6, false);
                    int i6 = 0;
                    while (i6 < k4) 
                    {
                        m m3 = (m)arraylist.get(i6);
                        int k3 = j1;
                        if (m3.getGroupId() == l6)
                        {
                            k3 = j1;
                            if (m3.i())
                            {
                                k3 = j1 + 1;
                            }
                            m3.d(false);
                        }
                        i6++;
                        j1 = k3;
                    }
                }
                j3 = j1;
                if (flag2)
                {
                    j3 = j1 - 1;
                }
                m2.d(flag2);
                l5 = l1;
                l1 = k2;
                k2 = j3;
                j1 = k1;
                k1 = l5;
            } else
            {
                m2.d(false);
                l3 = j1;
                j1 = l1;
                l1 = k2;
                k2 = l3;
            }
            i5 = k4 + 1;
            l2 = l1;
            k4 = k2;
            l1 = j1;
            k2 = l2;
            j1 = k4;
            k4 = i5;
        }
        return true;
    }

    public final void c()
    {
        if (!o)
        {
            n = b.getResources().getInteger(h.a);
        }
        if (c != null)
        {
            c.b(true);
        }
    }

    public final void d()
    {
        j = true;
        k = true;
    }

    public final void e()
    {
        n = 0x7fffffff;
        o = true;
    }

    public final void f()
    {
        r = true;
    }

    public final boolean g()
    {
        if (j && !k() && c != null && f != null && x == null && !c.n().isEmpty())
        {
            x = new c(this, new f(this, b, c, i));
            ((View)f).post(x);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean h()
    {
        if (x != null && f != null)
        {
            ((View)f).removeCallbacks(x);
            x = null;
            return true;
        }
        f f1 = v;
        if (f1 != null)
        {
            f1.f();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean i()
    {
        return h() | j();
    }

    public final boolean j()
    {
        if (w != null)
        {
            w.f();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean k()
    {
        return v != null && v.g();
    }

    public final boolean l()
    {
        return x != null || k();
    }
}
