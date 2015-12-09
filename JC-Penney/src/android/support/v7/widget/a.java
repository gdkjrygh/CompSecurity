// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v7.b.g;
import android.support.v7.b.h;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.aa;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.s;
import android.support.v7.internal.view.menu.w;
import android.support.v7.internal.view.menu.x;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            i, ActionMenuView, f, d, 
//            c, e, h

public class a extends d
    implements o
{

    private android.support.v7.widget.d A;
    final i g = new i(this, null);
    int h;
    private f i;
    private Drawable j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private int o;
    private int p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private int u;
    private final SparseBooleanArray v = new SparseBooleanArray();
    private View w;
    private android.support.v7.widget.h x;
    private c y;
    private e z;

    public a(Context context)
    {
        super(context, h.abc_action_menu_layout, h.abc_action_menu_item_layout);
    }

    static c a(a a1, c c1)
    {
        a1.y = c1;
        return c1;
    }

    static e a(a a1, e e1)
    {
        a1.z = e1;
        return e1;
    }

    static android.support.v7.widget.h a(a a1)
    {
        return a1.x;
    }

    static android.support.v7.widget.h a(a a1, android.support.v7.widget.h h1)
    {
        a1.x = h1;
        return h1;
    }

    private View a(MenuItem menuitem)
    {
        ViewGroup viewgroup = (ViewGroup)f;
        if (viewgroup != null) goto _L2; else goto _L1
_L1:
        View view = null;
_L6:
        return view;
_L2:
        int i1;
        int j1;
        j1 = viewgroup.getChildCount();
        i1 = 0;
_L7:
        if (i1 >= j1) goto _L4; else goto _L3
_L3:
        View view1;
        view1 = viewgroup.getChildAt(i1);
        if (!(view1 instanceof x))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((x)view1).getItemData() == menuitem) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
_L4:
        return null;
    }

    static e b(a a1)
    {
        return a1.z;
    }

    static android.support.v7.internal.view.menu.g c(a a1)
    {
        return a1.c;
    }

    static f d(a a1)
    {
        return a1.i;
    }

    static w e(a a1)
    {
        return a1.f;
    }

    static android.support.v7.internal.view.menu.g f(a a1)
    {
        return a1.c;
    }

    static w g(a a1)
    {
        return a1.f;
    }

    static c h(a a1)
    {
        return a1.y;
    }

    public View a(j j1, View view, ViewGroup viewgroup)
    {
        View view1 = j1.getActionView();
        if (view1 == null || j1.n())
        {
            view1 = super.a(j1, view, viewgroup);
        }
        byte byte0;
        if (j1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        j1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!j1.checkLayoutParams(view))
        {
            view1.setLayoutParams(j1.a(view));
        }
        return view1;
    }

    public void a(Context context, android.support.v7.internal.view.menu.g g1)
    {
        super.a(context, g1);
        g1 = context.getResources();
        context = android.support.v7.internal.view.a.a(context);
        if (!m)
        {
            l = context.b();
        }
        if (!s)
        {
            n = context.c();
        }
        if (!q)
        {
            p = context.a();
        }
        int i1 = n;
        if (l)
        {
            if (i == null)
            {
                i = new f(this, a);
                if (k)
                {
                    i.setImageDrawable(j);
                    j = null;
                    k = false;
                }
                int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(j1, j1);
            }
            i1 -= i.getMeasuredWidth();
        } else
        {
            i = null;
        }
        o = i1;
        u = (int)(56F * g1.getDisplayMetrics().density);
        w = null;
    }

    public void a(Configuration configuration)
    {
        if (!q)
        {
            p = b.getResources().getInteger(g.abc_max_action_buttons);
        }
        if (c != null)
        {
            c.b(true);
        }
    }

    public void a(Drawable drawable)
    {
        if (i != null)
        {
            i.setImageDrawable(drawable);
            return;
        } else
        {
            k = true;
            j = drawable;
            return;
        }
    }

    public void a(android.support.v7.internal.view.menu.g g1, boolean flag)
    {
        f();
        super.a(g1, flag);
    }

    public void a(j j1, x x1)
    {
        x1.a(j1, 0);
        j1 = (ActionMenuView)f;
        x1 = (ActionMenuItemView)x1;
        x1.setItemInvoker(j1);
        if (A == null)
        {
            A = new android.support.v7.widget.d(this, null);
        }
        x1.setPopupCallback(A);
    }

    public void a(ActionMenuView actionmenuview)
    {
        f = actionmenuview;
        actionmenuview.a(c);
    }

    public void a(boolean flag)
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

    public boolean a(int i1, j j1)
    {
        return j1.j();
    }

    public boolean a(aa aa1)
    {
        if (!aa1.hasVisibleItems())
        {
            return false;
        }
        Object obj;
        for (obj = aa1; ((aa) (obj)).o() != c; obj = (aa)((aa) (obj)).o()) { }
        View view = a(((aa) (obj)).getItem());
        obj = view;
        if (view == null)
        {
            if (i == null)
            {
                return false;
            }
            obj = i;
        }
        h = aa1.getItem().getItemId();
        y = new c(this, b, aa1);
        y.a(((View) (obj)));
        y.a();
        super.a(aa1);
        return true;
    }

    public boolean a(ViewGroup viewgroup, int i1)
    {
        if (viewgroup.getChildAt(i1) == i)
        {
            return false;
        } else
        {
            return super.a(viewgroup, i1);
        }
    }

    public void b(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        Object obj = (ViewGroup)((View)f).getParent();
        if (obj != null)
        {
            android.support.v7.internal.b.a.a(((ViewGroup) (obj)));
        }
        super.b(flag);
        ((View)f).requestLayout();
        if (c != null)
        {
            obj = c.j();
            int k1 = ((ArrayList) (obj)).size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                n n1 = ((j)((ArrayList) (obj)).get(i1)).a();
                if (n1 != null)
                {
                    n1.a(this);
                }
            }

        }
        int j1;
        if (c != null)
        {
            obj = c.k();
        } else
        {
            obj = null;
        }
        j1 = ((flag2) ? 1 : 0);
        if (l)
        {
            j1 = ((flag2) ? 1 : 0);
            if (obj != null)
            {
                j1 = ((ArrayList) (obj)).size();
                if (j1 == 1)
                {
                    if (!((j)((ArrayList) (obj)).get(0)).isActionViewExpanded())
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
            i = new f(this, a);
        }
        obj = (ViewGroup)i.getParent();
        if (obj != f)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(i);
            }
            obj = (ActionMenuView)f;
            ((ActionMenuView) (obj)).addView(i, ((ActionMenuView) (obj)).b());
        }
_L4:
        ((ActionMenuView)f).setOverflowReserved(l);
        return;
_L2:
        if (i != null && i.getParent() == f)
        {
            ((ViewGroup)f).removeView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean b()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int l1;
        int i2;
        int k4;
        int k5;
        int l5;
label0:
        {
            arraylist = c.h();
            k5 = arraylist.size();
            int i1 = p;
            k4 = o;
            l5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)f;
            i2 = 0;
            int k2 = 0;
            boolean flag = false;
            l1 = 0;
            while (l1 < k5) 
            {
                j j1 = (j)arraylist.get(l1);
                if (j1.l())
                {
                    i2++;
                } else
                if (j1.k())
                {
                    k2++;
                } else
                {
                    flag = true;
                }
                if (t && j1.isActionViewExpanded())
                {
                    i1 = 0;
                }
                l1++;
            }
            l1 = i1;
            if (!l)
            {
                break label0;
            }
            if (!flag)
            {
                l1 = i1;
                if (i2 + k2 <= i1)
                {
                    break label0;
                }
            }
            l1 = i1 - 1;
        }
        l1 -= i2;
        SparseBooleanArray sparsebooleanarray = v;
        sparsebooleanarray.clear();
        int k1 = 0;
        int i3;
        boolean flag1;
        int i4;
        int j4;
        if (r)
        {
            k1 = k4 / u;
            i2 = u;
            int l2 = u;
            i4 = (k4 % i2) / k1 + l2;
        } else
        {
            i4 = 0;
        }
        j4 = 0;
        flag1 = false;
        i2 = k1;
        k1 = l1;
        i3 = k4;
        l1 = ((flag1) ? 1 : 0);
        while (j4 < k5) 
        {
            j j2 = (j)arraylist.get(j4);
            int k3;
            if (j2.l())
            {
                View view = a(j2, w, viewgroup);
                if (w == null)
                {
                    w = view;
                }
                int l4;
                if (r)
                {
                    k3 = i2 - ActionMenuView.a(view, i4, i2, l5, 0);
                } else
                {
                    view.measure(l5, l5);
                    k3 = i2;
                }
                i2 = view.getMeasuredWidth();
                if (l1 == 0)
                {
                    l1 = i2;
                }
                l4 = j2.getGroupId();
                if (l4 != 0)
                {
                    sparsebooleanarray.put(l4, true);
                }
                j2.d(true);
                i3 -= i2;
                i2 = k1;
                k1 = i3;
            } else
            if (j2.k())
            {
                int i6 = j2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(i6);
                boolean flag2;
                if ((k1 > 0 || flag3) && i3 > 0 && (!r || i2 > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag2)
                {
                    View view1 = a(j2, w, viewgroup);
                    if (w == null)
                    {
                        w = view1;
                    }
                    int i5;
                    if (r)
                    {
                        k3 = ActionMenuView.a(view1, i4, i2, l5, 0);
                        if (k3 == 0)
                        {
                            flag2 = false;
                        }
                        i2 -= k3;
                    } else
                    {
                        view1.measure(l5, l5);
                    }
                    k3 = view1.getMeasuredWidth();
                    i5 = i3 - k3;
                    i3 = l1;
                    if (l1 == 0)
                    {
                        i3 = k3;
                    }
                    if (r)
                    {
                        if (i5 >= 0)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        flag2 &= l1;
                        l1 = i3;
                        k3 = i2;
                        i3 = i5;
                        i2 = l1;
                        l1 = k3;
                    } else
                    {
                        if (i5 + i3 > 0)
                        {
                            l1 = 1;
                        } else
                        {
                            l1 = 0;
                        }
                        flag2 &= l1;
                        l1 = i2;
                        i2 = i3;
                        i3 = i5;
                    }
                } else
                {
                    int l3 = l1;
                    l1 = i2;
                    i2 = l3;
                }
                if (flag2 && i6 != 0)
                {
                    sparsebooleanarray.put(i6, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(i6, false);
                    int j5 = 0;
                    while (j5 < j4) 
                    {
                        j j3 = (j)arraylist.get(j5);
                        k3 = k1;
                        if (j3.getGroupId() == i6)
                        {
                            k3 = k1;
                            if (j3.j())
                            {
                                k3 = k1 + 1;
                            }
                            j3.d(false);
                        }
                        j5++;
                        k1 = k3;
                    }
                }
                k3 = k1;
                if (flag2)
                {
                    k3 = k1 - 1;
                }
                j2.d(flag2);
                k1 = i3;
                i3 = k3;
                k3 = l1;
                l1 = i2;
                i2 = i3;
            } else
            {
                j2.d(false);
                k3 = i3;
                i3 = k1;
                k1 = k3;
                k3 = i2;
                i2 = i3;
            }
            l4 = j4 + 1;
            j4 = i2;
            i2 = k3;
            i3 = k1;
            k1 = j4;
            j4 = l4;
        }
        return true;
    }

    public Drawable c()
    {
        if (i != null)
        {
            return i.getDrawable();
        }
        if (k)
        {
            return j;
        } else
        {
            return null;
        }
    }

    public void c(boolean flag)
    {
        l = flag;
        m = true;
    }

    public void d(boolean flag)
    {
        t = flag;
    }

    public boolean d()
    {
        if (l && !h() && c != null && f != null && z == null && !c.k().isEmpty())
        {
            z = new e(this, new android.support.v7.widget.h(this, b, c, i, true));
            ((View)f).post(z);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean e()
    {
        if (z != null && f != null)
        {
            ((View)f).removeCallbacks(z);
            z = null;
            return true;
        }
        android.support.v7.widget.h h1 = x;
        if (h1 != null)
        {
            h1.e();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean f()
    {
        return e() | g();
    }

    public boolean g()
    {
        if (y != null)
        {
            y.e();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean h()
    {
        return x != null && x.f();
    }
}
