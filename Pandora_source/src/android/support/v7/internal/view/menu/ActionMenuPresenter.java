// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import java.util.ArrayList;
import p.g.a;

// Referenced classes of package android.support.v7.internal.view.menu:
//            b, ActionMenuView, h, ActionMenuItemView, 
//            f, p, k, m, 
//            g

public class ActionMenuPresenter extends android.support.v7.internal.view.menu.b
    implements android.support.v4.view.d.a
{
    private static class SavedState
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public SavedState a(Parcel parcel)
            {
                return new SavedState(parcel);
            }

            public SavedState[] a(int i1)
            {
                return new SavedState[i1];
            }

            public Object createFromParcel(Parcel parcel)
            {
                return a(parcel);
            }

            public Object[] newArray(int i1)
            {
                return a(i1);
            }

        };
        public int a;

        public int describeContents()
        {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i1)
        {
            parcel.writeInt(a);
        }


        SavedState()
        {
        }

        SavedState(Parcel parcel)
        {
            a = parcel.readInt();
        }
    }

    private class a extends g
    {

        final ActionMenuPresenter a;

        public void onDismiss(DialogInterface dialoginterface)
        {
            super.onDismiss(dialoginterface);
            android.support.v7.internal.view.menu.ActionMenuPresenter.a(a, null);
            a.b = 0;
        }

        public a(p p1)
        {
            a = ActionMenuPresenter.this;
            super(p1);
            ActionMenuPresenter.this.a(ActionMenuPresenter.this.a);
        }
    }

    private class b
        implements Runnable
    {

        final ActionMenuPresenter a;
        private d b;

        public void run()
        {
            a.e.f();
            View view = (View)a.h;
            if (view != null && view.getWindowToken() != null && b.a())
            {
                android.support.v7.internal.view.menu.ActionMenuPresenter.a(a, b);
            }
            android.support.v7.internal.view.menu.ActionMenuPresenter.a(a, null);
        }

        public b(d d1)
        {
            a = ActionMenuPresenter.this;
            super();
            b = d1;
        }
    }

    private class c extends ImageButton
        implements ActionMenuView.a
    {

        final ActionMenuPresenter a;

        public boolean c()
        {
            return false;
        }

        public boolean d()
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
                a.a();
                return true;
            }
        }

        public c(Context context)
        {
            a = ActionMenuPresenter.this;
            super(context, null, android.support.v7.appcompat.R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
        }
    }

    private class d extends k
    {

        final ActionMenuPresenter a;

        public void onDismiss()
        {
            super.onDismiss();
            a.e.close();
            android.support.v7.internal.view.menu.ActionMenuPresenter.a(a, null);
        }

        public d(Context context, f f1, View view, boolean flag)
        {
            a = ActionMenuPresenter.this;
            super(context, f1, view, flag);
            a(ActionMenuPresenter.this.a);
        }
    }

    private class e
        implements l.a
    {

        final ActionMenuPresenter a;

        public void a(f f1, boolean flag)
        {
            if (f1 instanceof p)
            {
                ((p)f1).p().a(false);
            }
        }

        public boolean b(f f1)
        {
            if (f1 == null)
            {
                return false;
            } else
            {
                a.b = ((p)f1).getItem().getItemId();
                return false;
            }
        }

        private e()
        {
            a = ActionMenuPresenter.this;
            super();
        }

    }


    final e a = new e();
    int b;
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
    private d v;
    private a w;
    private b x;

    public ActionMenuPresenter(Context context)
    {
        super(context, android.support.v7.appcompat.R.layout.abc_action_menu_layout, android.support.v7.appcompat.R.layout.abc_action_menu_item_layout);
    }

    static a a(ActionMenuPresenter actionmenupresenter, a a1)
    {
        actionmenupresenter.w = a1;
        return a1;
    }

    static b a(ActionMenuPresenter actionmenupresenter, b b1)
    {
        actionmenupresenter.x = b1;
        return b1;
    }

    static d a(ActionMenuPresenter actionmenupresenter, d d1)
    {
        actionmenupresenter.v = d1;
        return d1;
    }

    private View a(MenuItem menuitem)
    {
        ViewGroup viewgroup = (ViewGroup)h;
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
        if (!(view1 instanceof m.a))
        {
            continue; /* Loop/switch isn't completed */
        }
        view = view1;
        if (((m.a)view1).getItemData() == menuitem) goto _L6; else goto _L5
_L5:
        i1++;
          goto _L7
_L4:
        return null;
    }

    public m a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public View a(h h1, View view, ViewGroup viewgroup)
    {
        View view1 = h1.getActionView();
        if (view1 == null || h1.n())
        {
            view1 = view;
            if (!(view instanceof ActionMenuItemView))
            {
                view1 = null;
            }
            view1 = super.a(h1, view1, viewgroup);
        }
        byte byte0;
        if (h1.isActionViewExpanded())
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        view1.setVisibility(byte0);
        h1 = (ActionMenuView)viewgroup;
        view = view1.getLayoutParams();
        if (!h1.checkLayoutParams(view))
        {
            view1.setLayoutParams(h1.a(view));
        }
        return view1;
    }

    public void a(int i1)
    {
        n = i1;
        o = true;
    }

    public void a(int i1, boolean flag)
    {
        l = i1;
        p = flag;
        q = true;
    }

    public void a(Context context, f f1)
    {
        super.a(context, f1);
        f1 = context.getResources();
        context = p.g.a.a(context);
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
        int i1 = l;
        if (j)
        {
            if (i == null)
            {
                i = new c(c);
                int j1 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
                i.measure(j1, j1);
            }
            i1 -= i.getMeasuredWidth();
        } else
        {
            i = null;
        }
        m = i1;
        s = (int)(56F * f1.getDisplayMetrics().density);
        u = null;
    }

    public void a(Configuration configuration)
    {
        if (!o)
        {
            n = d.getResources().getInteger(android.support.v7.appcompat.R.integer.abc_max_action_buttons);
        }
        if (e != null)
        {
            e.b(true);
        }
    }

    public void a(f f1, boolean flag)
    {
        c();
        super.a(f1, flag);
    }

    public void a(h h1, m.a a1)
    {
        a1.a(h1, 0);
        h1 = (ActionMenuView)h;
        ((ActionMenuItemView)a1).setItemInvoker(h1);
    }

    public void a(boolean flag)
    {
        if (flag)
        {
            super.a(null);
            return;
        } else
        {
            e.a(false);
            return;
        }
    }

    public boolean a()
    {
        if (j && !e() && e != null && h != null && x == null)
        {
            x = new b(new d(d, e, i, true));
            ((View)h).post(x);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean a(int i1, h h1)
    {
        return h1.i();
    }

    public boolean a(p p1)
    {
        if (!p1.hasVisibleItems())
        {
            return false;
        }
        p p2;
        for (p2 = p1; p2.s() != e; p2 = (p)p2.s()) { }
        if (a(p2.getItem()) == null)
        {
            if (i == null)
            {
                return false;
            }
            View view = i;
        }
        b = p1.getItem().getItemId();
        w = new a(p1);
        w.a(null);
        super.a(p1);
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
        r = flag;
    }

    public boolean b()
    {
        if (x != null && h != null)
        {
            ((View)h).removeCallbacks(x);
            x = null;
            return true;
        }
        d d1 = v;
        if (d1 != null)
        {
            d1.b();
            return true;
        } else
        {
            return false;
        }
    }

    public void c(boolean flag)
    {
        boolean flag1 = true;
        boolean flag2 = false;
        super.c(flag);
        if (h == null)
        {
            return;
        }
        if (e != null)
        {
            ArrayList arraylist = e.k();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                android.support.v4.view.d d1 = ((h)arraylist.get(i1)).m();
                if (d1 != null)
                {
                    d1.a(this);
                }
            }

        }
        Object obj;
        int j1;
        if (e != null)
        {
            obj = e.l();
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
                    if (!((h)((ArrayList) (obj)).get(0)).isActionViewExpanded())
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
            i = new c(c);
        }
        obj = (ViewGroup)i.getParent();
        if (obj != h)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(i);
            }
            obj = (ActionMenuView)h;
            ((ActionMenuView) (obj)).addView(i, ((ActionMenuView) (obj)).b());
        }
_L4:
        ((ActionMenuView)h).setOverflowReserved(j);
        return;
_L2:
        if (i != null && i.getParent() == h)
        {
            ((ViewGroup)h).removeView(i);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean c()
    {
        return b() | d();
    }

    public boolean d()
    {
        if (w != null)
        {
            w.a();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean e()
    {
        return v != null && v.c();
    }

    public boolean f()
    {
        return j;
    }

    public boolean g()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        int k1;
        int l1;
        int k3;
        int k4;
        int l4;
label0:
        {
            arraylist = e.i();
            k4 = arraylist.size();
            int i1 = n;
            k3 = m;
            l4 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)h;
            l1 = 0;
            int i2 = 0;
            boolean flag = false;
            k1 = 0;
            while (k1 < k4) 
            {
                h h1 = (h)arraylist.get(k1);
                if (h1.k())
                {
                    l1++;
                } else
                if (h1.j())
                {
                    i2++;
                } else
                {
                    flag = true;
                }
                if (r && h1.isActionViewExpanded())
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
        int j1 = 0;
        int k2;
        boolean flag1;
        int i3;
        int j3;
        if (p)
        {
            j1 = k3 / s;
            l1 = s;
            int j2 = s;
            i3 = (k3 % l1) / j1 + j2;
        } else
        {
            i3 = 0;
        }
        j3 = 0;
        flag1 = false;
        l1 = j1;
        j1 = k1;
        k2 = k3;
        k1 = ((flag1) ? 1 : 0);
        while (j3 < k4) 
        {
            h h2 = (h)arraylist.get(j3);
            int l2;
            if (h2.k())
            {
                View view = a(h2, u, viewgroup);
                if (u == null)
                {
                    u = view;
                }
                int l3;
                if (p)
                {
                    l2 = l1 - android.support.v7.internal.view.menu.ActionMenuView.a(view, i3, l1, l4, 0);
                } else
                {
                    view.measure(l4, l4);
                    l2 = l1;
                }
                l1 = view.getMeasuredWidth();
                if (k1 == 0)
                {
                    k1 = l1;
                }
                l3 = h2.getGroupId();
                if (l3 != 0)
                {
                    sparsebooleanarray.put(l3, true);
                }
                h2.d(true);
                k2 -= l1;
                l1 = j1;
                j1 = k2;
            } else
            if (h2.j())
            {
                int i5 = h2.getGroupId();
                boolean flag3 = sparsebooleanarray.get(i5);
                boolean flag2;
                if ((j1 > 0 || flag3) && k2 > 0 && (!p || l1 > 0))
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                if (flag2)
                {
                    View view1 = a(h2, u, viewgroup);
                    if (u == null)
                    {
                        u = view1;
                    }
                    int i4;
                    if (p)
                    {
                        l2 = android.support.v7.internal.view.menu.ActionMenuView.a(view1, i3, l1, l4, 0);
                        if (l2 == 0)
                        {
                            flag2 = false;
                        }
                        l1 -= l2;
                    } else
                    {
                        view1.measure(l4, l4);
                    }
                    l2 = view1.getMeasuredWidth();
                    i4 = k2 - l2;
                    k2 = k1;
                    if (k1 == 0)
                    {
                        k2 = l2;
                    }
                    if (p)
                    {
                        if (i4 >= 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = k2;
                        l2 = l1;
                        k2 = i4;
                        l1 = k1;
                        k1 = l2;
                    } else
                    {
                        if (i4 + k2 > 0)
                        {
                            k1 = 1;
                        } else
                        {
                            k1 = 0;
                        }
                        flag2 &= k1;
                        k1 = l1;
                        l1 = k2;
                        k2 = i4;
                    }
                } else
                {
                    l2 = k1;
                    k1 = l1;
                    l1 = l2;
                }
                if (flag2 && i5 != 0)
                {
                    sparsebooleanarray.put(i5, true);
                } else
                if (flag3)
                {
                    sparsebooleanarray.put(i5, false);
                    int j4 = 0;
                    while (j4 < j3) 
                    {
                        h h3 = (h)arraylist.get(j4);
                        l2 = j1;
                        if (h3.getGroupId() == i5)
                        {
                            l2 = j1;
                            if (h3.i())
                            {
                                l2 = j1 + 1;
                            }
                            h3.d(false);
                        }
                        j4++;
                        j1 = l2;
                    }
                }
                l2 = j1;
                if (flag2)
                {
                    l2 = j1 - 1;
                }
                h2.d(flag2);
                j1 = k2;
                k2 = l2;
                l2 = k1;
                k1 = l1;
                l1 = k2;
            } else
            {
                l2 = k2;
                k2 = j1;
                j1 = l2;
                l2 = l1;
                l1 = k2;
            }
            l3 = j3 + 1;
            j3 = l1;
            l1 = l2;
            k2 = j1;
            j1 = j3;
            j3 = l3;
        }
        return true;
    }
}
