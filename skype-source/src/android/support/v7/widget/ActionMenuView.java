// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.f;
import android.support.v7.internal.view.menu.h;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.widget.r;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, ActionMenuPresenter

public class ActionMenuView extends LinearLayoutCompat
    implements android.support.v7.internal.view.menu.f.b, m
{
    public static interface a
    {

        public abstract boolean d();

        public abstract boolean e();
    }

    private final class b
        implements android.support.v7.internal.view.menu.l.a
    {

        final ActionMenuView a;

        public final void onCloseMenu(f f1, boolean flag)
        {
        }

        public final boolean onOpenSubMenu(f f1)
        {
            return false;
        }

        private b()
        {
            a = ActionMenuView.this;
            super();
        }

        b(byte byte0)
        {
            this();
        }
    }

    public static final class c extends LinearLayoutCompat.a
    {

        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
        boolean f;

        public c(int i1, int j1)
        {
            super(i1, j1);
            a = false;
        }

        public c(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public c(c c1)
        {
            super(c1);
            a = c1.a;
        }

        public c(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

    private final class d
        implements android.support.v7.internal.view.menu.f.a
    {

        final ActionMenuView a;

        public final boolean onMenuItemSelected(f f1, MenuItem menuitem)
        {
            return ActionMenuView.a(a) != null && ActionMenuView.a(a).a(menuitem);
        }

        public final void onMenuModeChange(f f1)
        {
            if (ActionMenuView.b(a) != null)
            {
                ActionMenuView.b(a).onMenuModeChange(f1);
            }
        }

        private d()
        {
            a = ActionMenuView.this;
            super();
        }

        d(byte byte0)
        {
            this();
        }
    }

    public static interface e
    {

        public abstract boolean a(MenuItem menuitem);
    }


    private f a;
    private Context b;
    private int c;
    private boolean d;
    private ActionMenuPresenter e;
    private android.support.v7.internal.view.menu.l.a f;
    private android.support.v7.internal.view.menu.f.a g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private e l;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBaselineAligned(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        j = (int)(56F * f1);
        k = (int)(4F * f1);
        b = context;
        c = 0;
    }

    static int a(View view, int i1, int j1, int k1, int l1)
    {
        boolean flag;
label0:
        {
            c c1 = (c)view.getLayoutParams();
            int j2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k1) - l1, android.view.View.MeasureSpec.getMode(k1));
            ActionMenuItemView actionmenuitemview;
            int i2;
            if (view instanceof ActionMenuItemView)
            {
                actionmenuitemview = (ActionMenuItemView)view;
            } else
            {
                actionmenuitemview = null;
            }
            if (actionmenuitemview != null && actionmenuitemview.c())
            {
                l1 = 1;
            } else
            {
                l1 = 0;
            }
            i2 = 0;
            k1 = i2;
            if (j1 <= 0)
            {
                break label0;
            }
            if (l1 != 0)
            {
                k1 = i2;
                if (j1 < 2)
                {
                    break label0;
                }
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 * j1, 0x80000000), j2);
            i2 = view.getMeasuredWidth();
            k1 = i2 / i1;
            j1 = k1;
            if (i2 % i1 != 0)
            {
                j1 = k1 + 1;
            }
            k1 = j1;
            if (l1 != 0)
            {
                k1 = j1;
                if (j1 < 2)
                {
                    k1 = 2;
                }
            }
        }
        if (!c1.a && l1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c1.d = flag;
        c1.b = k1;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 * i1, 0x40000000), j2);
        return k1;
    }

    protected static c a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof c)
            {
                layoutparams = new c((c)layoutparams);
            } else
            {
                layoutparams = new c(layoutparams);
            }
            if (((c) (layoutparams)).h <= 0)
            {
                layoutparams.h = 16;
            }
            return layoutparams;
        } else
        {
            return l();
        }
    }

    static e a(ActionMenuView actionmenuview)
    {
        return actionmenuview.l;
    }

    private boolean a(int i1)
    {
        boolean flag1;
        if (i1 == 0)
        {
            flag1 = false;
        } else
        {
            View view = getChildAt(i1 - 1);
            View view1 = getChildAt(i1);
            flag1 = false;
            boolean flag = flag1;
            if (i1 < getChildCount())
            {
                flag = flag1;
                if (view instanceof a)
                {
                    flag = ((a)view).e() | false;
                }
            }
            flag1 = flag;
            if (i1 > 0)
            {
                flag1 = flag;
                if (view1 instanceof a)
                {
                    return flag | ((a)view1).d();
                }
            }
        }
        return flag1;
    }

    static android.support.v7.internal.view.menu.f.a b(ActionMenuView actionmenuview)
    {
        return actionmenuview.g;
    }

    public static c b()
    {
        c c1 = l();
        c1.a = true;
        return c1;
    }

    private c b(AttributeSet attributeset)
    {
        return new c(getContext(), attributeset);
    }

    private static c l()
    {
        c c1 = new c(-2, -2);
        c1.h = 16;
        return c1;
    }

    public final LinearLayoutCompat.a a(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    public final void a(f f1)
    {
        a = f1;
    }

    public final boolean a()
    {
        return d;
    }

    public final boolean a(h h1)
    {
        return a.b(h1);
    }

    protected final LinearLayoutCompat.a b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final Menu c()
    {
        if (a == null)
        {
            Object obj = getContext();
            a = new f(((Context) (obj)));
            a.a(new d((byte)0));
            e = new ActionMenuPresenter(((Context) (obj)));
            e.f();
            ActionMenuPresenter actionmenupresenter = e;
            if (f != null)
            {
                obj = f;
            } else
            {
                obj = new b((byte)0);
            }
            actionmenupresenter.a(((android.support.v7.internal.view.menu.l.a) (obj)));
            a.a(e, b);
            e.a(this);
        }
        return a;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof c);
    }

    public final f d()
    {
        return a;
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    public final boolean e()
    {
        return e != null && e.g();
    }

    public final boolean f()
    {
        return e != null && e.h();
    }

    public final boolean g()
    {
        return e != null && e.k();
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return l();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final boolean h()
    {
        return e != null && e.l();
    }

    public final void i()
    {
        if (e != null)
        {
            e.i();
        }
    }

    protected final LinearLayoutCompat.a j()
    {
        return l();
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        if (e != null)
        {
            e.a(false);
            if (e.k())
            {
                e.h();
                e.g();
            }
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        i();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (h) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i1, j1, k1, l1);
_L4:
        return;
_L2:
        int j4;
        int k4;
        k4 = getChildCount();
        j4 = (l1 - j1) / 2;
        int l4 = k();
        l1 = 0;
        int i2 = k1 - i1 - getPaddingRight() - getPaddingLeft();
        int k3 = 0;
        flag = r.a(this);
        int l2 = 0;
        while (l2 < k4) 
        {
            View view = getChildAt(l2);
            int l3 = k3;
            int i4 = l1;
            j1 = i2;
            if (view.getVisibility() != 8)
            {
                c c1 = (c)view.getLayoutParams();
                if (c1.a)
                {
                    k3 = view.getMeasuredWidth();
                    j1 = k3;
                    if (a(l2))
                    {
                        j1 = k3 + l4;
                    }
                    i4 = view.getMeasuredHeight();
                    int i5;
                    if (flag)
                    {
                        k3 = getPaddingLeft() + c1.leftMargin;
                        l3 = k3 + j1;
                    } else
                    {
                        l3 = getWidth() - getPaddingRight() - c1.rightMargin;
                        k3 = l3 - j1;
                    }
                    i5 = j4 - i4 / 2;
                    view.layout(k3, i5, l3, i5 + i4);
                    j1 = i2 - j1;
                    l3 = 1;
                    i4 = l1;
                } else
                {
                    j1 = i2 - (view.getMeasuredWidth() + c1.leftMargin + c1.rightMargin);
                    a(l2);
                    i4 = l1 + 1;
                    l3 = k3;
                }
            }
            l2++;
            k3 = l3;
            l1 = i4;
            i2 = j1;
        }
        if (k4 == 1 && k3 == 0)
        {
            View view1 = getChildAt(0);
            j1 = view1.getMeasuredWidth();
            l1 = view1.getMeasuredHeight();
            i1 = (k1 - i1) / 2 - j1 / 2;
            k1 = j4 - l1 / 2;
            view1.layout(i1, k1, i1 + j1, k1 + l1);
            return;
        }
        if (k3 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        i1 = l1 - i1;
        if (i1 > 0)
        {
            i1 = i2 / i1;
        } else
        {
            i1 = 0;
        }
        l1 = Math.max(0, i1);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        j1 = getWidth() - getPaddingRight();
        i1 = 0;
        while (i1 < k4) 
        {
            View view2 = getChildAt(i1);
            c c2 = (c)view2.getLayoutParams();
            k1 = j1;
            if (view2.getVisibility() != 8)
            {
                k1 = j1;
                if (!c2.a)
                {
                    j1 -= c2.rightMargin;
                    k1 = view2.getMeasuredWidth();
                    int j2 = view2.getMeasuredHeight();
                    int i3 = j4 - j2 / 2;
                    view2.layout(j1 - k1, i3, j1, i3 + j2);
                    k1 = j1 - (c2.leftMargin + k1 + l1);
                }
            }
            i1++;
            j1 = k1;
        }
        if (true) goto _L4; else goto _L3
_L3:
        j1 = getPaddingLeft();
        i1 = 0;
        while (i1 < k4) 
        {
            View view3 = getChildAt(i1);
            c c3 = (c)view3.getLayoutParams();
            k1 = j1;
            if (view3.getVisibility() != 8)
            {
                k1 = j1;
                if (!c3.a)
                {
                    j1 += c3.leftMargin;
                    k1 = view3.getMeasuredWidth();
                    int k2 = view3.getMeasuredHeight();
                    int j3 = j4 - k2 / 2;
                    view3.layout(j1, j3, j1 + k1, j3 + k2);
                    k1 = j1 + (c3.rightMargin + k1 + l1);
                }
            }
            i1++;
            j1 = k1;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        boolean flag2 = h;
        int k1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (flag2 != h)
        {
            i = 0;
        }
        k1 = android.view.View.MeasureSpec.getSize(i1);
        if (h && a != null && k1 != i)
        {
            i = k1;
            a.b(true);
        }
        i2 = getChildCount();
        if (!h || i2 <= 0) goto _L2; else goto _L1
_L1:
        int k4 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        int j4 = android.view.View.MeasureSpec.getSize(j1);
        k1 = getPaddingLeft();
        i2 = getPaddingRight();
        int l3 = getPaddingTop() + getPaddingBottom();
        int l4 = getChildMeasureSpec(j1, l3, -2);
        int i5 = i1 - (k1 + i2);
        i1 = i5 / j;
        j1 = j;
        if (i1 == 0)
        {
            setMeasuredDimension(i5, 0);
            return;
        }
        int j5 = j + (i5 % j1) / i1;
        j1 = 0;
        int l2 = 0;
        int k2 = 0;
        int i3 = 0;
        int j2 = 0;
        long l5 = 0L;
        int k5 = getChildCount();
        int j3 = 0;
        while (j3 < k5) 
        {
            Object obj = getChildAt(j3);
            int l1;
            if (((View) (obj)).getVisibility() != 8)
            {
                boolean flag1 = obj instanceof ActionMenuItemView;
                i3++;
                if (flag1)
                {
                    ((View) (obj)).setPadding(k, 0, k, 0);
                }
                c c1 = (c)((View) (obj)).getLayoutParams();
                c1.f = false;
                c1.c = 0;
                c1.b = 0;
                c1.d = false;
                c1.leftMargin = 0;
                c1.rightMargin = 0;
                int k3;
                if (flag1 && ((ActionMenuItemView)obj).c())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                c1.e = flag1;
                if (c1.a)
                {
                    l1 = 1;
                } else
                {
                    l1 = i1;
                }
                k3 = a(((View) (obj)), j5, l1, l4, l3);
                l2 = Math.max(l2, k3);
                float f1;
                float f2;
                float f3;
                int i4;
                long l7;
                long l8;
                if (c1.d)
                {
                    l1 = k2 + 1;
                } else
                {
                    l1 = k2;
                }
                if (c1.a)
                {
                    i2 = 1;
                } else
                {
                    i2 = j2;
                }
                i1 -= k3;
                k2 = Math.max(j1, ((View) (obj)).getMeasuredHeight());
                if (k3 == 1)
                {
                    long l6 = 1 << j3;
                    j1 = k2;
                    j2 = i1;
                    k2 = l1;
                    k3 = i2;
                    l5 = l6 | l5;
                    i1 = i3;
                    i2 = j2;
                    l1 = j1;
                    j2 = k3;
                    j1 = l2;
                } else
                {
                    j1 = i3;
                    j2 = l2;
                    l2 = k2;
                    i3 = i1;
                    i1 = j1;
                    j1 = j2;
                    k2 = l1;
                    j2 = i2;
                    l1 = l2;
                    i2 = i3;
                }
            } else
            {
                l1 = j1;
                i2 = i1;
                j1 = l2;
                i1 = i3;
            }
            j3++;
            i3 = i1;
            i1 = i2;
            l2 = j1;
            j1 = l1;
        }
        if (j2 != 0 && i3 == 2)
        {
            k3 = 1;
        } else
        {
            k3 = 0;
        }
        l1 = 0;
        j3 = i1;
        i1 = l1;
        l8 = l5;
        if (k2 <= 0) goto _L4; else goto _L3
_L3:
        l8 = l5;
        if (j3 <= 0) goto _L4; else goto _L5
_L5:
        l1 = 0x7fffffff;
        l7 = 0L;
        i2 = 0;
        l3 = 0;
_L12:
        if (l3 >= k5) goto _L7; else goto _L6
_L6:
        obj = (c)getChildAt(l3).getLayoutParams();
        if (!((c) (obj)).d) goto _L9; else goto _L8
_L8:
        if (((c) (obj)).b >= l1) goto _L11; else goto _L10
_L10:
        i2 = ((c) (obj)).b;
        l7 = 1 << l3;
        l1 = 1;
_L14:
        i4 = l3 + 1;
        l3 = i2;
        i2 = l1;
        l1 = l3;
        l3 = i4;
          goto _L12
_L11:
        if (((c) (obj)).b != l1) goto _L9; else goto _L13
_L13:
        l7 |= 1 << l3;
        i4 = i2 + 1;
        i2 = l1;
        l1 = i4;
          goto _L14
_L7:
        l5 |= l7;
        l8 = l5;
        if (i2 <= j3)
        {
            i2 = 0;
            i1 = j3;
            while (i2 < k5) 
            {
                obj = getChildAt(i2);
                c1 = (c)((View) (obj)).getLayoutParams();
                if (((long)(1 << i2) & l7) == 0L)
                {
                    if (c1.b == l1 + 1)
                    {
                        l5 |= 1 << i2;
                    }
                } else
                {
                    if (k3 && c1.e && i1 == 1)
                    {
                        ((View) (obj)).setPadding(k + j5, 0, k, 0);
                    }
                    c1.b = c1.b + 1;
                    c1.f = true;
                    i1--;
                }
                i2++;
            }
            l1 = 1;
            j3 = i1;
            i1 = l1;
            break MISSING_BLOCK_LABEL_541;
        }
_L4:
        if (j2 == 0 && i3 == 1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (j3 <= 0 || l8 == 0L || j3 >= i3 - 1 && l1 == 0 && l2 <= 1) goto _L16; else goto _L15
_L15:
        f3 = Long.bitCount(l8);
        f2 = f3;
        if (l1 != 0) goto _L18; else goto _L17
_L17:
        f1 = f3;
        if ((1L & l8) != 0L)
        {
            f1 = f3;
            if (!((c)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << k5 - 1) & l8) == 0L) goto _L18; else goto _L19
_L19:
        f2 = f1;
        if (((c)getChildAt(k5 - 1).getLayoutParams()).e) goto _L18; else goto _L20
_L20:
        f1 -= 0.5F;
_L22:
        if (f1 > 0.0F)
        {
            l1 = (int)((float)(j3 * j5) / f1);
        } else
        {
            l1 = 0;
        }
        i2 = 0;
        do
        {
            j2 = i1;
            if (i2 >= k5)
            {
                break;
            }
            if (((long)(1 << i2) & l8) != 0L)
            {
                obj = getChildAt(i2);
                c1 = (c)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    c1.c = l1;
                    c1.f = true;
                    if (i2 == 0 && !c1.e)
                    {
                        c1.leftMargin = -l1 / 2;
                    }
                    i1 = 1;
                } else
                if (c1.a)
                {
                    c1.c = l1;
                    c1.f = true;
                    c1.rightMargin = -l1 / 2;
                    i1 = 1;
                } else
                {
                    if (i2 != 0)
                    {
                        c1.leftMargin = l1 / 2;
                    }
                    if (i2 != k5 - 1)
                    {
                        c1.rightMargin = l1 / 2;
                    }
                }
            }
            i2++;
        } while (true);
          goto _L21
_L16:
        j2 = i1;
_L21:
        if (j2 != 0)
        {
            for (i1 = 0; i1 < k5; i1++)
            {
                obj = getChildAt(i1);
                c1 = (c)((View) (obj)).getLayoutParams();
                if (c1.f)
                {
                    l1 = c1.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(c1.c + l1 * j5, 0x40000000), l4);
                }
            }

        }
        if (k4 == 0x40000000)
        {
            j1 = j4;
        }
        setMeasuredDimension(i5, j1);
        return;
_L2:
        for (l1 = 0; l1 < i2; l1++)
        {
            obj = (c)getChildAt(l1).getLayoutParams();
            obj.rightMargin = 0;
            obj.leftMargin = 0;
        }

        super.onMeasure(i1, j1);
        return;
_L18:
        f1 = f2;
        if (true) goto _L22; else goto _L9
_L9:
        i4 = l1;
        l1 = i2;
        i2 = i4;
          goto _L14
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        e.c(flag);
    }

    public void setMenuCallbacks(android.support.v7.internal.view.menu.l.a a1, android.support.v7.internal.view.menu.f.a a2)
    {
        f = a1;
        g = a2;
    }

    public void setOnMenuItemClickListener(e e1)
    {
        l = e1;
    }

    public void setOverflowIcon(Drawable drawable)
    {
        c();
        e.a(drawable);
    }

    public void setOverflowReserved(boolean flag)
    {
        d = flag;
    }

    public void setPopupTheme(int i1)
    {
label0:
        {
            if (c != i1)
            {
                c = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                b = getContext();
            }
            return;
        }
        b = new ContextThemeWrapper(getContext(), i1);
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        e = actionmenupresenter;
        e.a(this);
    }
}
