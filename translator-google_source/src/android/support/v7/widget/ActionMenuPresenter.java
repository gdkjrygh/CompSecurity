// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.view.cj;
import android.support.v4.view.n;
import android.support.v4.view.o;
import android.support.v7.a.h;
import android.support.v7.a.i;
import android.support.v7.internal.view.a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.ab;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.t;
import android.support.v7.internal.view.menu.x;
import android.support.v7.internal.view.menu.y;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            f, ActionMenuView, b, a, 
//            c, e

public final class ActionMenuPresenter extends d
    implements o
{

    private final SparseBooleanArray A = new SparseBooleanArray();
    private View B;
    private android.support.v7.widget.b C;
    OverflowMenuButton i;
    Drawable j;
    boolean k;
    public int l;
    public boolean m;
    boolean n;
    e o;
    android.support.v7.widget.a p;
    public c q;
    final f r = new f(this);
    int s;
    private boolean t;
    private boolean u;
    private int v;
    private int w;
    private boolean x;
    private boolean y;
    private int z;

    public ActionMenuPresenter(Context context)
    {
        super(context, i.abc_action_menu_layout, i.abc_action_menu_item_layout);
    }

    public final x a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public final View a(m m1, View view, ViewGroup viewgroup)
    {
        View view1 = m1.getActionView();
        if (view1 == null || m1.i())
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
        boolean flag = true;
        super.a(context, i1);
        i1 = context.getResources();
        context = android.support.v7.internal.view.a.a(context);
        if (!u)
        {
            int j1;
            int k1;
            if (android.os.Build.VERSION.SDK_INT < 19 && cj.b(ViewConfiguration.get(((a) (context)).a)))
            {
                flag = false;
            }
            t = flag;
        }
        if (!y)
        {
            v = ((a) (context)).a.getResources().getDisplayMetrics().widthPixels / 2;
        }
        if (!m)
        {
            l = ((a) (context)).a.getResources().getInteger(h.abc_max_action_buttons);
        }
        j1 = v;
        if (t)
        {
            if (i == null)
            {
                i = new OverflowMenuButton(a);
                if (k)
                {
                    i.setImageDrawable(j);
                    j = null;
                    k = false;
                }
                k1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(k1, k1);
            }
            j1 -= i.getMeasuredWidth();
        } else
        {
            i = null;
        }
        w = j1;
        z = (int)(56F * i1.getDisplayMetrics().density);
        B = null;
    }

    public final void a(android.support.v7.internal.view.menu.i i1, boolean flag)
    {
        e();
        super.a(i1, flag);
    }

    public final void a(m m1, y y1)
    {
        y1.a(m1);
        m1 = (ActionMenuView)g;
        y1 = (ActionMenuItemView)y1;
        y1.setItemInvoker(m1);
        if (C == null)
        {
            C = new android.support.v7.widget.b(this);
        }
        y1.setPopupCallback(C);
    }

    public final void a(ActionMenuView actionmenuview)
    {
        g = actionmenuview;
        actionmenuview.a = c;
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
        int l4;
        int j6;
        int k6;
label0:
        {
            arraylist = c.h();
            j6 = arraylist.size();
            int i1 = l;
            l4 = w;
            k6 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)g;
            l1 = 0;
            int i2 = 0;
            boolean flag = false;
            k1 = 0;
            while (k1 < j6) 
            {
                m m1 = (m)arraylist.get(k1);
                if (m1.h())
                {
                    l1++;
                } else
                if (m1.g())
                {
                    i2++;
                } else
                {
                    flag = true;
                }
                if (n && m1.isActionViewExpanded())
                {
                    i1 = 0;
                }
                k1++;
            }
            k1 = i1;
            if (!t)
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
        SparseBooleanArray sparsebooleanarray = A;
        sparsebooleanarray.clear();
        int j1;
        int k2;
        boolean flag1;
        int j4;
        int k4;
        if (x)
        {
            j1 = l4 / z;
            l1 = z;
            int j2 = z;
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
            if (m2.h())
            {
                View view = a(m2, B, viewgroup);
                if (B == null)
                {
                    B = view;
                }
                int l2;
                int i5;
                if (x)
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
                m2.c(true);
                l1 = k2 - l1;
                k2 = j1;
                j1 = l2;
            } else
            if (m2.g())
            {
                int l6 = m2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(l6);
                boolean flag2;
                if ((j1 > 0 || flag3) && k2 > 0 && (!x || l1 > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                int l3;
                if (flag2)
                {
                    View view1 = a(m2, B, viewgroup);
                    if (B == null)
                    {
                        B = view1;
                    }
                    int j3;
                    int k5;
                    if (x)
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
                    if (x)
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
                            if (m3.f())
                            {
                                k3 = j1 + 1;
                            }
                            m3.c(false);
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
                m2.c(flag2);
                l5 = l1;
                l1 = k2;
                k2 = j3;
                j1 = k1;
                k1 = l5;
            } else
            {
                m2.c(false);
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

    public final boolean a(ab ab1)
    {
        MenuItem menuitem;
        ViewGroup viewgroup;
        if (!ab1.hasVisibleItems())
        {
            return false;
        }
        ab ab2;
        for (ab2 = ab1; ab2.l != c; ab2 = (ab)ab2.l) { }
        menuitem = ab2.getItem();
        viewgroup = (ViewGroup)g;
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
        if (!(view instanceof y) || ((y)view).getItemData() != menuitem) goto _L5; else goto _L4
_L5:
        i1++;
        continue; /* Loop/switch isn't completed */
_L2:
        view = null;
_L4:
        Object obj = view;
        if (view == null)
        {
            if (i == null)
            {
                return false;
            }
            obj = i;
        }
        s = ab1.getItem().getItemId();
        p = new android.support.v7.widget.a(this, b, ab1);
        p.b = ((View) (obj));
        p.b();
        super.a(ab1);
        return true;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public final boolean a(m m1)
    {
        return m1.f();
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

    public final void b()
    {
        t = true;
        u = true;
    }

    public final void b(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        ((View)g).getParent();
        super.b(flag);
        ((View)g).requestLayout();
        if (c != null)
        {
            Object obj = c;
            ((android.support.v7.internal.view.menu.i) (obj)).i();
            obj = ((android.support.v7.internal.view.menu.i) (obj)).d;
            int k1 = ((ArrayList) (obj)).size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                n n1 = ((m)((ArrayList) (obj)).get(i1)).d;
                if (n1 != null)
                {
                    n1.a = this;
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
        if (t)
        {
            j1 = ((flag2) ? 1 : 0);
            if (obj1 != null)
            {
                j1 = ((ArrayList) (obj1)).size();
                if (j1 == 1)
                {
                    if (!((m)((ArrayList) (obj1)).get(0)).isActionViewExpanded())
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
            i = new OverflowMenuButton(a);
        }
        obj1 = (ViewGroup)i.getParent();
        if (obj1 != g)
        {
            if (obj1 != null)
            {
                ((ViewGroup) (obj1)).removeView(i);
            }
            ((ActionMenuView)g).addView(i, android.support.v7.widget.ActionMenuView.a());
        }
_L4:
        ((ActionMenuView)g).setOverflowReserved(t);
        return;
_L2:
        if (i != null && i.getParent() == g)
        {
            ((ViewGroup)g).removeView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean c()
    {
        if (t && !g() && c != null && g != null && q == null && !c.j().isEmpty())
        {
            q = new c(this, new e(this, b, c, i));
            ((View)g).post(q);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean d()
    {
        if (q != null && g != null)
        {
            ((View)g).removeCallbacks(q);
            q = null;
            return true;
        }
        e e1 = o;
        if (e1 != null)
        {
            e1.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean e()
    {
        return d() | f();
    }

    public final boolean f()
    {
        if (p != null)
        {
            p.d();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean g()
    {
        return o != null && o.e();
    }

    private class OverflowMenuButton extends TintImageView
        implements android.support.v7.widget.h
    {

        final ActionMenuPresenter a;
        private final float b[] = new float[2];

        public final boolean c()
        {
            return false;
        }

        public final boolean d()
        {
            return false;
        }

        public boolean performClick()
        {
            if (super.performClick())
            {
                return true;
            } else
            {
                playSoundEffect(0);
                a.c();
                return true;
            }
        }

        protected boolean setFrame(int i1, int j1, int k1, int l1)
        {
            boolean flag = super.setFrame(i1, j1, k1, l1);
            Drawable drawable = getDrawable();
            Drawable drawable1 = getBackground();
            if (drawable != null && drawable1 != null)
            {
                int i2 = getWidth();
                j1 = getHeight();
                i1 = Math.max(i2, j1) / 2;
                int j2 = getPaddingLeft();
                int k2 = getPaddingRight();
                k1 = getPaddingTop();
                l1 = getPaddingBottom();
                i2 = (i2 + (j2 - k2)) / 2;
                j1 = (j1 + (k1 - l1)) / 2;
                android.support.v4.a.a.a.a(drawable1, i2 - i1, j1 - i1, i2 + i1, j1 + i1);
            }
            return flag;
        }

        public OverflowMenuButton(Context context)
        {
            a = ActionMenuPresenter.this;
            super(context, null, b.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new android.support.v7.widget.d(this, this, ActionMenuPresenter.this));
        }
    }

}
