// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.view.d;
import android.support.v7.internal.view.a;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.b;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.o;
import android.support.v7.internal.widget.TintImageView;
import android.util.DisplayMetrics;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuView, j

public final class ActionMenuPresenter extends android.support.v7.internal.view.menu.b
    implements android.support.v4.view.d.a
{
    private static class SavedState
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

    private final class a extends k
    {

        final ActionMenuPresenter c;
        private o d;

        public final void onDismiss()
        {
            super.onDismiss();
            android.support.v7.widget.ActionMenuPresenter.f(c);
            c.h = 0;
        }

        public a(Context context, o o1)
        {
            c = ActionMenuPresenter.this;
            super(context, o1, null, false, android.support.v7.appcompat.a.a.actionOverflowMenuStyle);
            d = o1;
            int i1;
            if (!((h)o1.getItem()).j())
            {
                int j1;
                boolean flag;
                boolean flag1;
                if (android.support.v7.widget.ActionMenuPresenter.d(ActionMenuPresenter.this) == null)
                {
                    context = (View)ActionMenuPresenter.e(ActionMenuPresenter.this);
                } else
                {
                    context = android.support.v7.widget.ActionMenuPresenter.d(ActionMenuPresenter.this);
                }
                a(context);
            }
            a(g);
            flag1 = false;
            j1 = o1.size();
            i1 = 0;
            do
            {
label0:
                {
                    flag = flag1;
                    if (i1 < j1)
                    {
                        actionmenupresenter = o1.getItem(i1);
                        if (!isVisible() || getIcon() == null)
                        {
                            break label0;
                        }
                        flag = true;
                    }
                    b(flag);
                    return;
                }
                i1++;
            } while (true);
        }
    }

    private final class b extends android.support.v7.internal.view.menu.ActionMenuItemView.b
    {

        final ActionMenuPresenter a;

        public final j a()
        {
            if (ActionMenuPresenter.j(a) != null)
            {
                return ActionMenuPresenter.j(a).f();
            } else
            {
                return null;
            }
        }

        private b()
        {
            a = ActionMenuPresenter.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    private final class c
        implements Runnable
    {

        final ActionMenuPresenter a;
        private e b;

        public final void run()
        {
            ActionMenuPresenter.g(a).f();
            View view = (View)android.support.v7.widget.ActionMenuPresenter.h(a);
            if (view != null && view.getWindowToken() != null && b.g())
            {
                android.support.v7.widget.ActionMenuPresenter.a(a, b);
            }
            ActionMenuPresenter.i(a);
        }

        public c(e e1)
        {
            a = ActionMenuPresenter.this;
            super();
            b = e1;
        }
    }

    private final class d extends TintImageView
        implements ActionMenuView.a
    {

        final ActionMenuPresenter a;
        private final float b[] = new float[2];

        public final boolean d()
        {
            return false;
        }

        public final boolean e()
        {
            return false;
        }

        public final boolean performClick()
        {
            if (super.performClick())
            {
                return true;
            } else
            {
                playSoundEffect(0);
                a.g();
                return true;
            }
        }

        protected final boolean setFrame(int i1, int j1, int k1, int l1)
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
                android.support.v4.graphics.drawable.a.a(drawable1, i2 - i1, j1 - i1, i2 + i1, j1 + i1);
            }
            return flag;
        }

        public d(Context context)
        {
            a = ActionMenuPresenter.this;
            super(context, null, android.support.v7.appcompat.a.a.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            setOnTouchListener(new _cls1(this, this, ActionMenuPresenter.this));
        }
    }

    private final class e extends k
    {

        final ActionMenuPresenter c;

        public final void onDismiss()
        {
            super.onDismiss();
            ActionMenuPresenter.c(c).close();
            android.support.v7.widget.ActionMenuPresenter.a(c, null);
        }

        public e(Context context, android.support.v7.internal.view.menu.f f1, View view)
        {
            c = ActionMenuPresenter.this;
            super(context, f1, view, true, android.support.v7.appcompat.a.a.actionOverflowMenuStyle);
            c();
            a(g);
        }
    }

    private final class f
        implements android.support.v7.internal.view.menu.l.a
    {

        final ActionMenuPresenter a;

        public final void onCloseMenu(android.support.v7.internal.view.menu.f f1, boolean flag)
        {
            if (f1 instanceof o)
            {
                ((o)f1).o().a(false);
            }
            android.support.v7.internal.view.menu.l.a a1 = a.c();
            if (a1 != null)
            {
                a1.onCloseMenu(f1, flag);
            }
        }

        public final boolean onOpenSubMenu(android.support.v7.internal.view.menu.f f1)
        {
            if (f1 == null)
            {
                return false;
            }
            a.h = ((o)f1).getItem().getItemId();
            android.support.v7.internal.view.menu.l.a a1 = a.c();
            if (a1 != null)
            {
                return a1.onOpenSubMenu(f1);
            } else
            {
                return false;
            }
        }

        private f()
        {
            a = ActionMenuPresenter.this;
            super();
        }

        f(byte byte0)
        {
            this();
        }
    }


    private b A;
    final f g = new f((byte)0);
    int h;
    private d i;
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
    private e x;
    private a y;
    private c z;

    public ActionMenuPresenter(Context context)
    {
        super(context, android.support.v7.appcompat.a.h.abc_action_menu_layout, android.support.v7.appcompat.a.h.abc_action_menu_item_layout);
    }

    static e a(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.x;
    }

    static e a(ActionMenuPresenter actionmenupresenter, e e1)
    {
        actionmenupresenter.x = e1;
        return e1;
    }

    static c b(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.z;
    }

    static android.support.v7.internal.view.menu.f c(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.c;
    }

    static d d(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.i;
    }

    static m e(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.f;
    }

    static a f(ActionMenuPresenter actionmenupresenter)
    {
        actionmenupresenter.y = null;
        return null;
    }

    static android.support.v7.internal.view.menu.f g(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.c;
    }

    static m h(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.f;
    }

    static c i(ActionMenuPresenter actionmenupresenter)
    {
        actionmenupresenter.z = null;
        return null;
    }

    static a j(ActionMenuPresenter actionmenupresenter)
    {
        return actionmenupresenter.y;
    }

    public final m a(ViewGroup viewgroup)
    {
        viewgroup = super.a(viewgroup);
        ((ActionMenuView)viewgroup).setPresenter(this);
        return viewgroup;
    }

    public final View a(h h1, View view, ViewGroup viewgroup)
    {
        View view1 = h1.getActionView();
        if (view1 == null || h1.n())
        {
            view1 = super.a(h1, view, viewgroup);
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
            view1.setLayoutParams(android.support.v7.widget.ActionMenuView.a(view));
        }
        return view1;
    }

    public final void a(Context context, android.support.v7.internal.view.menu.f f1)
    {
        super.a(context, f1);
        f1 = context.getResources();
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
                i = new d(a);
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
        u = (int)(56F * f1.getDisplayMetrics().density);
        w = null;
    }

    public final void a(Drawable drawable)
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

    public final void a(Parcelable parcelable)
    {
        parcelable = (SavedState)parcelable;
        if (((SavedState) (parcelable)).a > 0)
        {
            parcelable = c.findItem(((SavedState) (parcelable)).a);
            if (parcelable != null)
            {
                a((o)parcelable.getSubMenu());
            }
        }
    }

    public final void a(android.support.v7.internal.view.menu.f f1, boolean flag)
    {
        i();
        super.a(f1, flag);
    }

    public final void a(h h1, android.support.v7.internal.view.menu.m.a a1)
    {
        a1.a(h1);
        h1 = (ActionMenuView)f;
        a1 = (ActionMenuItemView)a1;
        a1.setItemInvoker(h1);
        if (A == null)
        {
            A = new b((byte)0);
        }
        a1.setPopupCallback(A);
    }

    public final void a(ActionMenuView actionmenuview)
    {
        f = actionmenuview;
        actionmenuview.a(c);
    }

    public final void a(boolean flag)
    {
        ((View)f).getParent();
        super.a(flag);
        ((View)f).requestLayout();
        if (c != null)
        {
            ArrayList arraylist = c.m();
            int k1 = arraylist.size();
            for (int i1 = 0; i1 < k1; i1++)
            {
                android.support.v4.view.d d1 = ((h)arraylist.get(i1)).a();
                if (d1 != null)
                {
                    d1.a(this);
                }
            }

        }
        Object obj;
        int j1;
        boolean flag1;
        if (c != null)
        {
            obj = c.n();
        } else
        {
            obj = null;
        }
        flag1 = false;
        j1 = ((flag1) ? 1 : 0);
        if (l)
        {
            j1 = ((flag1) ? 1 : 0);
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
                    j1 = 1;
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
            i = new d(a);
        }
        obj = (ViewGroup)i.getParent();
        if (obj != f)
        {
            if (obj != null)
            {
                ((ViewGroup) (obj)).removeView(i);
            }
            ((ActionMenuView)f).addView(i, android.support.v7.widget.ActionMenuView.b());
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

    public final boolean a()
    {
        ArrayList arraylist;
        ViewGroup viewgroup;
        SparseBooleanArray sparsebooleanarray;
        int k1;
        int i2;
        int j2;
        int i3;
        int j4;
        int k4;
        int l4;
        int i5;
        boolean flag1;
label0:
        {
            arraylist = c.k();
            l4 = arraylist.size();
            int i1 = p;
            k4 = o;
            i5 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
            viewgroup = (ViewGroup)f;
            i2 = 0;
            int k2 = 0;
            flag1 = false;
            boolean flag = false;
            j2 = 0;
            while (j2 < l4) 
            {
                h h1 = (h)arraylist.get(j2);
                int j3;
                if (h1.l())
                {
                    i2++;
                } else
                if (h1.k())
                {
                    k2++;
                } else
                {
                    flag = true;
                }
                j3 = i1;
                if (t)
                {
                    j3 = i1;
                    if (h1.isActionViewExpanded())
                    {
                        j3 = 0;
                    }
                }
                j2++;
                i1 = j3;
            }
            j2 = i1;
            if (!l)
            {
                break label0;
            }
            if (!flag)
            {
                j2 = i1;
                if (i2 + k2 <= i1)
                {
                    break label0;
                }
            }
            j2 = i1 - 1;
        }
        j2 -= i2;
        sparsebooleanarray = v;
        sparsebooleanarray.clear();
        j4 = 0;
        i2 = 0;
        if (r)
        {
            i2 = k4 / u;
            int j1 = u;
            j4 = u + (k4 % j1) / i2;
        }
        k1 = 0;
        i3 = k4;
        k4 = k1;
        k1 = ((flag1) ? 1 : 0);
_L2:
        h h2;
        int l2;
        if (k4 >= l4)
        {
            break MISSING_BLOCK_LABEL_824;
        }
        h2 = (h)arraylist.get(k4);
        if (!h2.l())
        {
            break; /* Loop/switch isn't completed */
        }
        View view = a(h2, w, viewgroup);
        if (w == null)
        {
            w = view;
        }
        int k3;
        if (r)
        {
            i2 -= android.support.v7.widget.ActionMenuView.a(view, j4, i2, i5, 0);
        } else
        {
            view.measure(i5, i5);
        }
        k3 = view.getMeasuredWidth();
        l2 = i3 - k3;
        i3 = k1;
        if (k1 == 0)
        {
            i3 = k3;
        }
        k1 = h2.getGroupId();
        if (k1 != 0)
        {
            sparsebooleanarray.put(k1, true);
        }
        h2.d(true);
        k1 = i3;
_L5:
        k4++;
        i3 = l2;
        if (true) goto _L2; else goto _L1
_L1:
        int j5;
        boolean flag4;
        if (!h2.k())
        {
            break MISSING_BLOCK_LABEL_811;
        }
        j5 = h2.getGroupId();
        flag4 = sparsebooleanarray.get(j5);
        int l3;
        int i4;
        boolean flag2;
        boolean flag3;
        if ((j2 > 0 || flag4) && i3 > 0 && (!r || i2 > 0))
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        i4 = i2;
        l3 = k1;
        flag3 = flag2;
        l2 = i3;
        if (flag2)
        {
            View view1 = a(h2, w, viewgroup);
            if (w == null)
            {
                w = view1;
            }
            if (r)
            {
                l3 = android.support.v7.widget.ActionMenuView.a(view1, j4, i2, i5, 0);
                l2 = i2 - l3;
                i2 = l2;
                if (l3 == 0)
                {
                    flag2 = false;
                    i2 = l2;
                }
            } else
            {
                view1.measure(i5, i5);
            }
            i4 = view1.getMeasuredWidth();
            l2 = i3 - i4;
            l3 = k1;
            if (k1 == 0)
            {
                l3 = i4;
            }
            if (r)
            {
                if (l2 >= 0)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                flag3 = flag2 & k1;
                i4 = i2;
            } else
            {
                if (l2 + l3 > 0)
                {
                    k1 = 1;
                } else
                {
                    k1 = 0;
                }
                flag3 = flag2 & k1;
                i4 = i2;
            }
        }
        if (!flag3 || j5 == 0) goto _L4; else goto _L3
_L3:
        sparsebooleanarray.put(j5, true);
        k1 = j2;
_L7:
        j2 = k1;
        if (flag3)
        {
            j2 = k1 - 1;
        }
        h2.d(flag3);
        i2 = i4;
        k1 = l3;
          goto _L5
_L4:
        k1 = j2;
        if (!flag4) goto _L7; else goto _L6
_L6:
        sparsebooleanarray.put(j5, false);
        i2 = 0;
_L9:
        k1 = j2;
        if (i2 >= k4) goto _L7; else goto _L8
_L8:
        h h3 = (h)arraylist.get(i2);
        int l1 = j2;
        if (h3.getGroupId() == j5)
        {
            l1 = j2;
            if (h3.j())
            {
                l1 = j2 + 1;
            }
            h3.d(false);
        }
        i2++;
        j2 = l1;
          goto _L9
          goto _L7
        h2.d(false);
        l2 = i3;
          goto _L5
        return true;
    }

    public final boolean a(o o1)
    {
        MenuItem menuitem;
        ViewGroup viewgroup;
        if (!o1.hasVisibleItems())
        {
            return false;
        }
        o o2;
        for (o2 = o1; o2.r() != c; o2 = (o)o2.r()) { }
        menuitem = o2.getItem();
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
        if (!(view instanceof android.support.v7.internal.view.menu.m.a) || ((android.support.v7.internal.view.menu.m.a)view).a() != menuitem) goto _L5; else goto _L4
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
        h = o1.getItem().getItemId();
        y = new a(b, o1);
        y.a(((View) (obj)));
        y.e();
        super.a(o1);
        return true;
        if (true) goto _L7; else goto _L6
_L6:
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

    public final void b(boolean flag)
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

    public final void c(boolean flag)
    {
        t = flag;
    }

    public final boolean c(h h1)
    {
        return h1.j();
    }

    public final Parcelable d()
    {
        SavedState savedstate = new SavedState();
        savedstate.a = h;
        return savedstate;
    }

    public final void e()
    {
        if (!q)
        {
            p = b.getResources().getInteger(android.support.v7.appcompat.a.g.abc_max_action_buttons);
        }
        if (c != null)
        {
            c.b(true);
        }
    }

    public final void f()
    {
        l = true;
        m = true;
    }

    public final boolean g()
    {
        if (l && !k() && c != null && f != null && z == null && !c.n().isEmpty())
        {
            z = new c(new e(b, c, i));
            ((View)f).post(z);
            super.a(null);
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean h()
    {
        if (z != null && f != null)
        {
            ((View)f).removeCallbacks(z);
            z = null;
            return true;
        }
        e e1 = x;
        if (e1 != null)
        {
            e1.h();
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
        if (y != null)
        {
            y.h();
            return true;
        } else
        {
            return false;
        }
    }

    public final boolean k()
    {
        return x != null && x.i();
    }

    public final boolean l()
    {
        return z != null || k();
    }

    // Unreferenced inner class android/support/v7/widget/ActionMenuPresenter$d$1

/* anonymous class */
    final class d._cls1 extends j.b
    {

        final ActionMenuPresenter a;
        final d b;

        public final j a()
        {
            if (android.support.v7.widget.ActionMenuPresenter.a(b.a) == null)
            {
                return null;
            } else
            {
                return android.support.v7.widget.ActionMenuPresenter.a(b.a).f();
            }
        }

        public final boolean b()
        {
            b.a.g();
            return true;
        }

        public final boolean c()
        {
            if (android.support.v7.widget.ActionMenuPresenter.b(b.a) != null)
            {
                return false;
            } else
            {
                b.a.h();
                return true;
            }
        }

            
            {
                b = d1;
                a = actionmenupresenter;
                super(view);
            }
    }

}
