// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.support.v7.internal.view.menu.d;
import android.support.v7.internal.view.menu.i;
import android.support.v7.internal.view.menu.j;
import android.support.v7.internal.view.menu.k;
import android.support.v7.internal.view.menu.m;
import android.support.v7.internal.view.menu.w;
import android.support.v7.internal.view.menu.x;
import android.support.v7.internal.widget.at;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat, j, h, ActionMenuPresenter, 
//            k, i, l, v

public class ActionMenuView extends LinearLayoutCompat
    implements k, x
{

    i a;
    public boolean b;
    public ActionMenuPresenter c;
    private Context d;
    private int e;
    private w f;
    private j g;
    private boolean h;
    private int i;
    private int j;
    private int k;
    private l l;

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
        k = (int)(f1 * 4F);
        d = context;
        e = 0;
    }

    static int a(View view, int i1, int j1, int k1, int l1)
    {
        boolean flag1 = false;
        android.support.v7.widget.j j2 = (android.support.v7.widget.j)view.getLayoutParams();
        int i2 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(k1) - l1, android.view.View.MeasureSpec.getMode(k1));
        ActionMenuItemView actionmenuitemview;
        boolean flag;
        if (view instanceof ActionMenuItemView)
        {
            actionmenuitemview = (ActionMenuItemView)view;
        } else
        {
            actionmenuitemview = null;
        }
        if (actionmenuitemview != null && actionmenuitemview.b())
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (j1 > 0 && (l1 == 0 || j1 >= 2))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1 * j1, 0x80000000), i2);
            int k2 = view.getMeasuredWidth();
            k1 = k2 / i1;
            j1 = k1;
            if (k2 % i1 != 0)
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
        } else
        {
            k1 = 0;
        }
        flag = flag1;
        if (!j2.a)
        {
            flag = flag1;
            if (l1 != 0)
            {
                flag = true;
            }
        }
        j2.d = flag;
        j2.b = k1;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k1 * i1, 0x40000000), i2);
        return k1;
    }

    public static android.support.v7.widget.j a()
    {
        android.support.v7.widget.j j1 = d();
        j1.a = true;
        return j1;
    }

    protected static android.support.v7.widget.j a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof android.support.v7.widget.j)
            {
                layoutparams = new android.support.v7.widget.j((android.support.v7.widget.j)layoutparams);
            } else
            {
                layoutparams = new android.support.v7.widget.j(layoutparams);
            }
            if (((android.support.v7.widget.j) (layoutparams)).h <= 0)
            {
                layoutparams.h = 16;
            }
            return layoutparams;
        } else
        {
            return d();
        }
    }

    static l a(ActionMenuView actionmenuview)
    {
        return actionmenuview.l;
    }

    private boolean a(int i1)
    {
        boolean flag1 = false;
        if (i1 == 0)
        {
            return false;
        }
        View view = getChildAt(i1 - 1);
        View view1 = getChildAt(i1);
        boolean flag = flag1;
        if (i1 < getChildCount())
        {
            flag = flag1;
            if (view instanceof h)
            {
                flag = ((h)view).d() | false;
            }
        }
        if (i1 > 0 && (view1 instanceof h))
        {
            return ((h)view1).c() | flag;
        } else
        {
            return flag;
        }
    }

    static j b(ActionMenuView actionmenuview)
    {
        return actionmenuview.g;
    }

    private android.support.v7.widget.j b(AttributeSet attributeset)
    {
        return new android.support.v7.widget.j(getContext(), attributeset);
    }

    private static android.support.v7.widget.j d()
    {
        android.support.v7.widget.j j1 = new android.support.v7.widget.j();
        j1.h = 16;
        return j1;
    }

    public final v a(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    public final void a(i i1)
    {
        a = i1;
    }

    public final boolean a(m m)
    {
        return a.a(m, null, 0);
    }

    protected final v b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final void b()
    {
        if (c != null)
        {
            c.e();
        }
    }

    protected final v c()
    {
        return d();
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof android.support.v7.widget.j);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return d();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public Menu getMenu()
    {
        if (a == null)
        {
            Object obj = getContext();
            a = new i(((Context) (obj)));
            a.a(new android.support.v7.widget.k(this));
            c = new ActionMenuPresenter(((Context) (obj)));
            c.b();
            ActionMenuPresenter actionmenupresenter = c;
            if (f != null)
            {
                obj = f;
            } else
            {
                obj = new android.support.v7.widget.i(this);
            }
            actionmenupresenter.f = ((w) (obj));
            a.a(c, d);
            c.a(this);
        }
        return a;
    }

    public Drawable getOverflowIcon()
    {
        getMenu();
        ActionMenuPresenter actionmenupresenter = c;
        if (actionmenupresenter.i != null)
        {
            return actionmenupresenter.i.getDrawable();
        }
        if (actionmenupresenter.k)
        {
            return actionmenupresenter.j;
        } else
        {
            return null;
        }
    }

    public int getPopupTheme()
    {
        return e;
    }

    public int getWindowAnimations()
    {
        return 0;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        if (android.os.Build.VERSION.SDK_INT >= 8)
        {
            super.onConfigurationChanged(configuration);
        }
        if (c != null)
        {
            c.b(false);
            if (c.g())
            {
                c.d();
                c.c();
            }
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        b();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (h) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i1, j1, k1, l1);
_L4:
        return;
_L2:
        int k4 = getChildCount();
        int j4 = (l1 - j1) / 2;
        int l4 = getDividerWidth();
        j1 = 0;
        l1 = k1 - i1 - getPaddingRight() - getPaddingLeft();
        int k2 = 0;
        flag = at.a(this);
        int i2 = 0;
        while (i2 < k4) 
        {
            View view = getChildAt(i2);
            android.support.v7.widget.j j3;
            if (view.getVisibility() != 8)
            {
                android.support.v7.widget.j j2 = (android.support.v7.widget.j)view.getLayoutParams();
                if (j2.a)
                {
                    int l2 = view.getMeasuredWidth();
                    k2 = l2;
                    if (a(i2))
                    {
                        k2 = l2 + l4;
                    }
                    int i5 = view.getMeasuredHeight();
                    int l3;
                    int j5;
                    if (flag)
                    {
                        l2 = getPaddingLeft();
                        l2 = j2.leftMargin + l2;
                        l3 = l2 + k2;
                    } else
                    {
                        l3 = getWidth() - getPaddingRight() - j2.rightMargin;
                        l2 = l3 - k2;
                    }
                    j5 = j4 - i5 / 2;
                    view.layout(l2, j5, l3, i5 + j5);
                    l2 = l1 - k2;
                    k2 = 1;
                    l1 = j1;
                    j1 = l2;
                } else
                {
                    int i3 = view.getMeasuredWidth();
                    int i4 = j2.leftMargin;
                    l1 -= j2.rightMargin + (i3 + i4);
                    a(i2);
                    i3 = j1 + 1;
                    j1 = l1;
                    l1 = i3;
                }
            } else
            {
                int k3 = j1;
                j1 = l1;
                l1 = k3;
            }
            l2 = i2 + 1;
            i2 = l1;
            l1 = j1;
            j1 = i2;
            i2 = l2;
        }
        if (k4 == 1 && k2 == 0)
        {
            view = getChildAt(0);
            j1 = view.getMeasuredWidth();
            l1 = view.getMeasuredHeight();
            i1 = (k1 - i1) / 2 - j1 / 2;
            k1 = j4 - l1 / 2;
            view.layout(i1, k1, j1 + i1, l1 + k1);
            return;
        }
        if (k2 != 0)
        {
            i1 = 0;
        } else
        {
            i1 = 1;
        }
        i1 = j1 - i1;
        if (i1 > 0)
        {
            i1 = l1 / i1;
        } else
        {
            i1 = 0;
        }
        k1 = Math.max(0, i1);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i1 = getWidth() - getPaddingRight();
        j1 = 0;
        while (j1 < k4) 
        {
            view = getChildAt(j1);
            j3 = (android.support.v7.widget.j)view.getLayoutParams();
            if (view.getVisibility() != 8 && !j3.a)
            {
                i1 -= j3.rightMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                k2 = j4 - i2 / 2;
                view.layout(i1 - l1, k2, i1, i2 + k2);
                i1 -= j3.leftMargin + l1 + k1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = getPaddingLeft();
        j1 = 0;
        while (j1 < k4) 
        {
            view = getChildAt(j1);
            j3 = (android.support.v7.widget.j)view.getLayoutParams();
            if (view.getVisibility() != 8 && !j3.a)
            {
                i1 += j3.leftMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                k2 = j4 - i2 / 2;
                view.layout(i1, k2, i1 + l1, i2 + k2);
                i1 = j3.rightMargin + l1 + k1 + i1;
            }
            j1++;
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
        int l4 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        int k4 = android.view.View.MeasureSpec.getSize(j1);
        k1 = getPaddingLeft();
        i2 = getPaddingRight();
        int i4 = getPaddingTop() + getPaddingBottom();
        int i5 = getChildMeasureSpec(j1, i4, -2);
        int j5 = i1 - (k1 + i2);
        i1 = j5 / j;
        j1 = j;
        if (i1 == 0)
        {
            setMeasuredDimension(j5, 0);
            return;
        }
        int k5 = j + (j5 % j1) / i1;
        j1 = 0;
        int i3 = 0;
        int l2 = 0;
        int j3 = 0;
        int k2 = 0;
        long l6 = 0L;
        int l5 = getChildCount();
        int k3 = 0;
        while (k3 < l5) 
        {
            Object obj = getChildAt(k3);
            int l1;
            if (((View) (obj)).getVisibility() != 8)
            {
                boolean flag1 = obj instanceof ActionMenuItemView;
                j3++;
                if (flag1)
                {
                    ((View) (obj)).setPadding(k, 0, k, 0);
                }
                android.support.v7.widget.j j2 = (android.support.v7.widget.j)((View) (obj)).getLayoutParams();
                j2.f = false;
                j2.c = 0;
                j2.b = 0;
                j2.d = false;
                j2.leftMargin = 0;
                j2.rightMargin = 0;
                int l3;
                if (flag1 && ((ActionMenuItemView)obj).b())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                j2.e = flag1;
                if (j2.a)
                {
                    l1 = 1;
                } else
                {
                    l1 = i1;
                }
                l3 = a(((View) (obj)), k5, l1, i5, i4);
                i3 = Math.max(i3, l3);
                float f1;
                float f2;
                float f3;
                int j4;
                long l8;
                long l9;
                if (j2.d)
                {
                    l1 = l2 + 1;
                } else
                {
                    l1 = l2;
                }
                if (j2.a)
                {
                    i2 = 1;
                } else
                {
                    i2 = k2;
                }
                i1 -= l3;
                l2 = Math.max(j1, ((View) (obj)).getMeasuredHeight());
                if (l3 == 1)
                {
                    long l7 = 1 << k3;
                    j1 = l2;
                    k2 = i1;
                    l2 = l1;
                    l3 = i2;
                    l6 = l7 | l6;
                    i1 = j3;
                    i2 = k2;
                    l1 = j1;
                    k2 = l3;
                    j1 = i3;
                } else
                {
                    j1 = j3;
                    k2 = i3;
                    i3 = l2;
                    j3 = i1;
                    i1 = j1;
                    j1 = k2;
                    l2 = l1;
                    k2 = i2;
                    l1 = i3;
                    i2 = j3;
                }
            } else
            {
                l1 = j1;
                i2 = i1;
                j1 = i3;
                i1 = j3;
            }
            k3++;
            j3 = i1;
            i1 = i2;
            i3 = j1;
            j1 = l1;
        }
        if (k2 != 0 && j3 == 2)
        {
            l3 = 1;
        } else
        {
            l3 = 0;
        }
        l1 = 0;
        k3 = i1;
        i1 = l1;
        l9 = l6;
        if (l2 <= 0) goto _L4; else goto _L3
_L3:
        l9 = l6;
        if (k3 <= 0) goto _L4; else goto _L5
_L5:
        l1 = 0x7fffffff;
        l8 = 0L;
        i2 = 0;
        i4 = 0;
_L12:
        if (i4 >= l5) goto _L7; else goto _L6
_L6:
        obj = (android.support.v7.widget.j)getChildAt(i4).getLayoutParams();
        if (!((android.support.v7.widget.j) (obj)).d) goto _L9; else goto _L8
_L8:
        if (((android.support.v7.widget.j) (obj)).b >= l1) goto _L11; else goto _L10
_L10:
        i2 = ((android.support.v7.widget.j) (obj)).b;
        l8 = 1 << i4;
        l1 = 1;
_L14:
        j4 = i4 + 1;
        i4 = i2;
        i2 = l1;
        l1 = i4;
        i4 = j4;
          goto _L12
_L11:
        if (((android.support.v7.widget.j) (obj)).b != l1) goto _L9; else goto _L13
_L13:
        l8 |= 1 << i4;
        j4 = i2 + 1;
        i2 = l1;
        l1 = j4;
          goto _L14
_L7:
        l6 |= l8;
        l9 = l6;
        if (i2 <= k3)
        {
            i2 = 0;
            i1 = k3;
            while (i2 < l5) 
            {
                obj = getChildAt(i2);
                j2 = (android.support.v7.widget.j)((View) (obj)).getLayoutParams();
                if (((long)(1 << i2) & l8) == 0L)
                {
                    if (j2.b == l1 + 1)
                    {
                        l6 |= 1 << i2;
                    }
                } else
                {
                    if (l3 && j2.e && i1 == 1)
                    {
                        ((View) (obj)).setPadding(k + k5, 0, k, 0);
                    }
                    j2.b = j2.b + 1;
                    j2.f = true;
                    i1--;
                }
                i2++;
            }
            l1 = 1;
            k3 = i1;
            i1 = l1;
            break MISSING_BLOCK_LABEL_541;
        }
_L4:
        if (k2 == 0 && j3 == 1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (k3 <= 0 || l9 == 0L || k3 >= j3 - 1 && l1 == 0 && i3 <= 1) goto _L16; else goto _L15
_L15:
        f3 = Long.bitCount(l9);
        f2 = f3;
        if (l1 != 0) goto _L18; else goto _L17
_L17:
        f1 = f3;
        if ((1L & l9) != 0L)
        {
            f1 = f3;
            if (!((android.support.v7.widget.j)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << l5 - 1) & l9) == 0L) goto _L18; else goto _L19
_L19:
        f2 = f1;
        if (((android.support.v7.widget.j)getChildAt(l5 - 1).getLayoutParams()).e) goto _L18; else goto _L20
_L20:
        f1 -= 0.5F;
_L22:
        if (f1 > 0.0F)
        {
            l1 = (int)((float)(k3 * k5) / f1);
        } else
        {
            l1 = 0;
        }
        i2 = 0;
        do
        {
            k2 = i1;
            if (i2 >= l5)
            {
                break;
            }
            if (((long)(1 << i2) & l9) != 0L)
            {
                obj = getChildAt(i2);
                j2 = (android.support.v7.widget.j)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    j2.c = l1;
                    j2.f = true;
                    if (i2 == 0 && !j2.e)
                    {
                        j2.leftMargin = -l1 / 2;
                    }
                    i1 = 1;
                } else
                if (j2.a)
                {
                    j2.c = l1;
                    j2.f = true;
                    j2.rightMargin = -l1 / 2;
                    i1 = 1;
                } else
                {
                    if (i2 != 0)
                    {
                        j2.leftMargin = l1 / 2;
                    }
                    if (i2 != l5 - 1)
                    {
                        j2.rightMargin = l1 / 2;
                    }
                }
            }
            i2++;
        } while (true);
          goto _L21
_L16:
        k2 = i1;
_L21:
        if (k2 != 0)
        {
            for (i1 = 0; i1 < l5; i1++)
            {
                obj = getChildAt(i1);
                j2 = (android.support.v7.widget.j)((View) (obj)).getLayoutParams();
                if (j2.f)
                {
                    l1 = j2.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(j2.c + l1 * k5, 0x40000000), i5);
                }
            }

        }
        if (l4 == 0x40000000)
        {
            j1 = k4;
        }
        setMeasuredDimension(j5, j1);
        return;
_L2:
        for (l1 = 0; l1 < i2; l1++)
        {
            obj = (android.support.v7.widget.j)getChildAt(l1).getLayoutParams();
            obj.rightMargin = 0;
            obj.leftMargin = 0;
        }

        super.onMeasure(i1, j1);
        return;
_L18:
        f1 = f2;
        if (true) goto _L22; else goto _L9
_L9:
        j4 = l1;
        l1 = i2;
        i2 = j4;
          goto _L14
    }

    public void setExpandedActionViewsExclusive(boolean flag)
    {
        c.n = flag;
    }

    public void setMenuCallbacks(w w, j j1)
    {
        f = w;
        g = j1;
    }

    public void setOnMenuItemClickListener(l l1)
    {
        l = l1;
    }

    public void setOverflowIcon(Drawable drawable)
    {
        getMenu();
        ActionMenuPresenter actionmenupresenter = c;
        if (actionmenupresenter.i != null)
        {
            actionmenupresenter.i.setImageDrawable(drawable);
            return;
        } else
        {
            actionmenupresenter.k = true;
            actionmenupresenter.j = drawable;
            return;
        }
    }

    public void setOverflowReserved(boolean flag)
    {
        b = flag;
    }

    public void setPopupTheme(int i1)
    {
label0:
        {
            if (e != i1)
            {
                e = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                d = getContext();
            }
            return;
        }
        d = new ContextThemeWrapper(getContext(), i1);
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        c = actionmenupresenter;
        c.a(this);
    }
}
