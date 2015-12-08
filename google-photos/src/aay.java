// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.widget.ActionMenuView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

public final class aay extends vp
    implements kn
{

    abc f;
    public int g;
    public boolean h;
    abe i;
    aaz j;
    public abb k;
    final abf l = new abf(this);
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private final SparseBooleanArray r = new SparseBooleanArray();
    private View s;
    private aba t;

    public aay(Context context)
    {
        super(context, b.bt, b.bs);
    }

    public final View a(vy vy1, View view, ViewGroup viewgroup)
    {
        View view1 = vy1.getActionView();
        if (view1 == null || vy1.i())
        {
            view1 = super.a(vy1, view, viewgroup);
        }
        byte byte0;
        if (vy1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        vy1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!vy1.checkLayoutParams(view))
        {
            view1.setLayoutParams(vy1.a(view));
        }
        return view1;
    }

    public final wl a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).a(this);
        return viewgroup;
    }

    public final void a(Context context, vu vu1)
    {
        boolean flag = true;
        super.a(context, vu1);
        vu1 = context.getResources();
        context = vb.a(context);
        if (!n)
        {
            int i1;
            int j1;
            if (android.os.Build.VERSION.SDK_INT < 19 && mx.b(ViewConfiguration.get(((vb) (context)).a)))
            {
                flag = false;
            }
            m = flag;
        }
        o = ((vb) (context)).a.getResources().getDisplayMetrics().widthPixels / 2;
        g = ((vb) (context)).a.getResources().getInteger(b.bq);
        i1 = o;
        if (m)
        {
            if (f == null)
            {
                f = new abc(this, a);
                j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                f.measure(j1, j1);
            }
            i1 -= f.getMeasuredWidth();
        } else
        {
            f = null;
        }
        p = i1;
        q = (int)(56F * vu1.getDisplayMetrics().density);
        s = null;
    }

    public final void a(ActionMenuView actionmenuview)
    {
        e = actionmenuview;
        actionmenuview.a = c;
    }

    public final void a(vu vu1, boolean flag)
    {
        d();
        super.a(vu1, flag);
    }

    public final void a(vy vy1, wm wm1)
    {
        wm1.a(vy1, 0);
        vy1 = (ActionMenuView)e;
        wm1 = (ActionMenuItemView)wm1;
        wm1.a = vy1;
        if (t == null)
        {
            t = new aba(this);
        }
        wm1.b = t;
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

    public final boolean a()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int k1;
        int l1;
        int i4;
        int i5;
        int j5;
label0:
        {
            arraylist = c.h();
            i5 = arraylist.size();
            int i1 = g;
            i4 = p;
            j5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)e;
            l1 = 0;
            int i2 = 0;
            boolean flag = false;
            k1 = 0;
            while (k1 < i5) 
            {
                vy vy1 = (vy)arraylist.get(k1);
                if (vy1.h())
                {
                    l1++;
                } else
                if (vy1.g())
                {
                    i2++;
                } else
                {
                    flag = true;
                }
                if (h && vy1.isActionViewExpanded())
                {
                    i1 = 0;
                }
                k1++;
            }
            k1 = i1;
            if (!m)
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
        SparseBooleanArray sparsebooleanarray = r;
        sparsebooleanarray.clear();
        int l3 = 0;
        int j2 = i4;
        int j1 = k1 - l1;
        k1 = 0;
        l1 = j2;
        while (l3 < i5) 
        {
            vy vy2 = (vy)arraylist.get(l3);
            int l2;
            if (vy2.h())
            {
                View view = a(vy2, s, viewgroup);
                if (s == null)
                {
                    s = view;
                }
                view.measure(j5, j5);
                int k2 = view.getMeasuredWidth();
                if (k1 == 0)
                {
                    k1 = k2;
                }
                int j4 = vy2.getGroupId();
                if (j4 != 0)
                {
                    sparsebooleanarray.put(j4, true);
                }
                vy2.d(true);
                k2 = l1 - k2;
                l1 = j1;
                j1 = k2;
            } else
            if (vy2.g())
            {
                int k5 = vy2.getGroupId();
                boolean flag2 = sparsebooleanarray.get(k5);
                boolean flag1;
                if ((j1 > 0 || flag2) && l1 > 0)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    View view1 = a(vy2, s, viewgroup);
                    if (s == null)
                    {
                        s = view1;
                    }
                    view1.measure(j5, j5);
                    int k4 = view1.getMeasuredWidth();
                    int i3 = l1 - k4;
                    if (k1 == 0)
                    {
                        k1 = k4;
                    }
                    if (i3 + k1 > 0)
                    {
                        l1 = 1;
                    } else
                    {
                        l1 = 0;
                    }
                    flag1 = l1 & flag1;
                    l1 = i3;
                }
                if (flag1 && k5 != 0)
                {
                    sparsebooleanarray.put(k5, true);
                } else
                if (flag2)
                {
                    sparsebooleanarray.put(k5, false);
                    int l4 = 0;
                    while (l4 < l3) 
                    {
                        vy vy3 = (vy)arraylist.get(l4);
                        int j3 = j1;
                        if (vy3.getGroupId() == k5)
                        {
                            j3 = j1;
                            if (vy3.f())
                            {
                                j3 = j1 + 1;
                            }
                            vy3.d(false);
                        }
                        l4++;
                        j1 = j3;
                    }
                }
                i3 = j1;
                if (flag1)
                {
                    i3 = j1 - 1;
                }
                vy2.d(flag1);
                j1 = l1;
                l1 = i3;
            } else
            {
                vy2.d(false);
                int k3 = l1;
                l1 = j1;
                j1 = k3;
            }
            l3++;
            l2 = l1;
            l1 = j1;
            j1 = l2;
        }
        return true;
    }

    public final boolean a(ViewGroup viewgroup, int i1)
    {
        if (viewgroup.getChildAt(i1) == f)
        {
            return false;
        } else
        {
            return super.a(viewgroup, i1);
        }
    }

    public final boolean a(vy vy1)
    {
        return vy1.f();
    }

    public final boolean a(wo wo1)
    {
        MenuItem menuitem;
        ViewGroup viewgroup;
        if (!wo1.hasVisibleItems())
        {
            return false;
        }
        wo wo2;
        for (wo2 = wo1; wo2.k != c; wo2 = (wo)wo2.k) { }
        menuitem = wo2.getItem();
        viewgroup = (ViewGroup)e;
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
        if (!(view instanceof wm) || ((wm)view).a() != menuitem) goto _L5; else goto _L4
_L5:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
_L4:
        Object obj = view;
        if (view == null)
        {
            if (f == null)
            {
                return false;
            }
            obj = f;
        }
        wo1.getItem().getItemId();
        j = new aaz(this, b, wo1);
        j.b = ((View) (obj));
        j.b();
        super.a(wo1);
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final void b(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        ((View)e).getParent();
        super.b(flag);
        ((View)e).requestLayout();
        if (c != null)
        {
            Object obj = c;
            ((vu) (obj)).i();
            obj = ((vu) (obj)).d;
            int k1 = ((ArrayList) (obj)).size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                km km1 = ((vy)((ArrayList) (obj)).get(i1)).d;
                if (km1 != null)
                {
                    km1.b = this;
                }
            }

        }
        Object obj1;
        int j1;
        if (c != null)
        {
            obj1 = c.j();
        } else
        {
            obj1 = null;
        }
        j1 = ((flag2) ? 1 : 0);
        if (m)
        {
            j1 = ((flag2) ? 1 : 0);
            if (obj1 != null)
            {
                j1 = ((ArrayList) (obj1)).size();
                if (j1 == 1)
                {
                    if (!((vy)((ArrayList) (obj1)).get(0)).isActionViewExpanded())
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
        if (f == null)
        {
            f = new abc(this, a);
        }
        obj1 = (ViewGroup)f.getParent();
        if (obj1 != e)
        {
            if (obj1 != null)
            {
                ((ViewGroup) (obj1)).removeView(f);
            }
            obj1 = (ActionMenuView)e;
            ((ActionMenuView) (obj1)).addView(f, ((ActionMenuView) (obj1)).a());
        }
_L4:
        ((ActionMenuView)e).b = m;
        return;
_L2:
        if (f != null && f.getParent() == e)
        {
            ((ViewGroup)e).removeView(f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean b()
    {
        if (m && !f() && c != null && e != null && k == null && !c.j().isEmpty())
        {
            k = new abb(this, new abe(this, b, c, f, true));
            ((View)e).post(k);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public final void c(boolean flag)
    {
        m = true;
        n = true;
    }

    public final boolean c()
    {
        if (k != null && e != null)
        {
            ((View)e).removeCallbacks(k);
            k = null;
            return true;
        }
        abe abe1 = i;
        if (abe1 != null)
        {
            abe1.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean d()
    {
        return c() | e();
    }

    public final boolean e()
    {
        if (j != null)
        {
            j.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean f()
    {
        return i != null && i.e();
    }
}
