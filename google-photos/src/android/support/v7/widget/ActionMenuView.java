// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import aay;
import abg;
import abh;
import abi;
import abj;
import abk;
import adg;
import adh;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.support.v7.internal.view.menu.ActionMenuItemView;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import vp;
import vu;
import vv;
import vw;
import vy;
import wk;
import wl;
import yo;

public class ActionMenuView extends adg
    implements vw, wl
{

    public vu a;
    public boolean b;
    public aay c;
    wk d;
    vv e;
    abk f;
    private Context j;
    private int k;
    private boolean l;
    private int m;
    private int n;
    private int o;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        super.g = false;
        float f1 = context.getResources().getDisplayMetrics().density;
        n = (int)(56F * f1);
        o = (int)(f1 * 4F);
        j = context;
        k = 0;
    }

    public static abk a(ActionMenuView actionmenuview)
    {
        return actionmenuview.f;
    }

    private abi b(AttributeSet attributeset)
    {
        return new abi(getContext(), attributeset);
    }

    public static vv b(ActionMenuView actionmenuview)
    {
        return actionmenuview.e;
    }

    private boolean c(int i)
    {
        boolean flag1 = false;
        if (i == 0)
        {
            return false;
        }
        View view = getChildAt(i - 1);
        View view1 = getChildAt(i);
        boolean flag = flag1;
        if (i < getChildCount())
        {
            flag = flag1;
            if (view instanceof abg)
            {
                flag = ((abg)view).e() | false;
            }
        }
        if (i > 0 && (view1 instanceof abg))
        {
            return ((abg)view1).d() | flag;
        } else
        {
            return flag;
        }
    }

    private static abi e()
    {
        abi abi1 = new abi(-2, -2);
        abi1.h = 16;
        return abi1;
    }

    public final abi a()
    {
        abi abi1 = e();
        abi1.a = true;
        return abi1;
    }

    public final abi a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof abi)
            {
                layoutparams = new abi((abi)layoutparams);
            } else
            {
                layoutparams = new abi(layoutparams);
            }
            if (((abi) (layoutparams)).h <= 0)
            {
                layoutparams.h = 16;
            }
            return layoutparams;
        } else
        {
            return e();
        }
    }

    public final adh a(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    public final void a(int i)
    {
label0:
        {
            if (k != i)
            {
                k = i;
                if (i != 0)
                {
                    break label0;
                }
                j = getContext();
            }
            return;
        }
        j = new ContextThemeWrapper(getContext(), i);
    }

    public final void a(aay aay1)
    {
        c = aay1;
        c.a(this);
    }

    public final void a(vu vu1)
    {
        a = vu1;
    }

    public final boolean a(vy vy)
    {
        return a.a(vy, null, 0);
    }

    protected final adh b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final Menu b()
    {
        if (a == null)
        {
            Object obj = getContext();
            a = new vu(((Context) (obj)));
            a.a(new abj(this));
            c = new aay(((Context) (obj)));
            c.c(true);
            aay aay1 = c;
            if (d != null)
            {
                obj = d;
            } else
            {
                obj = new abh(this);
            }
            aay1.d = ((wk) (obj));
            a.a(c, j);
            c.a(this);
        }
        return a;
    }

    public final void c()
    {
        if (c != null)
        {
            c.d();
        }
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof abi);
    }

    protected final adh d()
    {
        return e();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return e();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
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
            if (c.f())
            {
                c.c();
                c.b();
            }
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c();
    }

    protected void onLayout(boolean flag, int i, int i1, int j1, int k1)
    {
        if (l) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i, i1, j1, k1);
_L4:
        return;
_L2:
        int l3 = getChildCount();
        int k3 = (k1 - i1) / 2;
        int i4 = super.i;
        i1 = 0;
        int l1 = j1 - i - getPaddingRight() - getPaddingLeft();
        k1 = 0;
        flag = yo.a(this);
        int i2 = 0;
        while (i2 < l3) 
        {
            View view = getChildAt(i2);
            abi abi2;
            if (view.getVisibility() != 8)
            {
                abi abi1 = (abi)view.getLayoutParams();
                if (abi1.a)
                {
                    int j2 = view.getMeasuredWidth();
                    k1 = j2;
                    if (c(i2))
                    {
                        k1 = j2 + i4;
                    }
                    int j4 = view.getMeasuredHeight();
                    int i3;
                    int l4;
                    if (flag)
                    {
                        j2 = getPaddingLeft();
                        j2 = abi1.leftMargin + j2;
                        i3 = j2 + k1;
                    } else
                    {
                        i3 = getWidth() - getPaddingRight() - abi1.rightMargin;
                        j2 = i3 - k1;
                    }
                    l4 = k3 - j4 / 2;
                    view.layout(j2, l4, i3, j4 + l4);
                    k1 = l1 - k1;
                    j2 = 1;
                    l1 = i1;
                    i1 = j2;
                } else
                {
                    int j3 = view.getMeasuredWidth();
                    int k4 = abi1.leftMargin;
                    int i5 = abi1.rightMargin;
                    c(i2);
                    int k2 = i1 + 1;
                    l1 -= i5 + (j3 + k4);
                    i1 = k1;
                    k1 = l1;
                    l1 = k2;
                }
            } else
            {
                int l2 = i1;
                i1 = k1;
                k1 = l1;
                l1 = l2;
            }
            j2 = i2 + 1;
            i2 = l1;
            l1 = k1;
            k1 = i1;
            i1 = i2;
            i2 = j2;
        }
        if (l3 == 1 && k1 == 0)
        {
            view = getChildAt(0);
            i1 = view.getMeasuredWidth();
            k1 = view.getMeasuredHeight();
            i = (j1 - i) / 2 - i1 / 2;
            j1 = k3 - k1 / 2;
            view.layout(i, j1, i1 + i, k1 + j1);
            return;
        }
        if (k1 != 0)
        {
            i = 0;
        } else
        {
            i = 1;
        }
        i = i1 - i;
        if (i > 0)
        {
            i = l1 / i;
        } else
        {
            i = 0;
        }
        j1 = Math.max(0, i);
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        i = getWidth() - getPaddingRight();
        i1 = 0;
        while (i1 < l3) 
        {
            view = getChildAt(i1);
            abi2 = (abi)view.getLayoutParams();
            if (view.getVisibility() != 8 && !abi2.a)
            {
                i -= abi2.rightMargin;
                k1 = view.getMeasuredWidth();
                l1 = view.getMeasuredHeight();
                i2 = k3 - l1 / 2;
                view.layout(i - k1, i2, i, l1 + i2);
                i -= abi2.leftMargin + k1 + j1;
            }
            i1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i = getPaddingLeft();
        i1 = 0;
        while (i1 < l3) 
        {
            view = getChildAt(i1);
            abi2 = (abi)view.getLayoutParams();
            if (view.getVisibility() != 8 && !abi2.a)
            {
                i += abi2.leftMargin;
                k1 = view.getMeasuredWidth();
                l1 = view.getMeasuredHeight();
                i2 = k3 - l1 / 2;
                view.layout(i, i2, i + k1, l1 + i2);
                i = abi2.rightMargin + k1 + j1 + i;
            }
            i1++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onMeasure(int i, int i1)
    {
        int l1;
        int i4;
        int j4;
        int k4;
        int l4;
        int i5;
        boolean flag2 = l;
        int j1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        l = flag;
        if (flag2 != l)
        {
            m = 0;
        }
        j1 = android.view.View.MeasureSpec.getSize(i);
        if (l && a != null && j1 != m)
        {
            m = j1;
            a.b(true);
        }
        l1 = getChildCount();
        if (!l || l1 <= 0) goto _L2; else goto _L1
_L1:
        int i2;
        int j2;
        int k2;
        int l2;
        int i3;
        int j5;
        int k5;
        long l6;
        k4 = android.view.View.MeasureSpec.getMode(i1);
        i = android.view.View.MeasureSpec.getSize(i);
        j4 = android.view.View.MeasureSpec.getSize(i1);
        j1 = getPaddingLeft();
        l1 = getPaddingRight();
        i4 = getPaddingTop() + getPaddingBottom();
        l4 = getChildMeasureSpec(i1, i4, -2);
        i5 = i - (j1 + l1);
        i = i5 / n;
        i1 = n;
        if (i == 0)
        {
            setMeasuredDimension(i5, 0);
            return;
        }
        j5 = n + (i5 % i1) / i;
        i1 = 0;
        k2 = 0;
        j2 = 0;
        l2 = 0;
        i2 = 0;
        l6 = 0L;
        k5 = getChildCount();
        i3 = 0;
_L4:
        int k1;
        int j3;
        boolean flag1;
label0:
        {
            if (i3 >= k5)
            {
                break; /* Loop/switch isn't completed */
            }
            View view = getChildAt(i3);
            if (view.getVisibility() == 8)
            {
                break MISSING_BLOCK_LABEL_1620;
            }
            flag1 = view instanceof ActionMenuItemView;
            j3 = l2 + 1;
            if (flag1)
            {
                view.setPadding(o, 0, o, 0);
            }
            abi abi2 = (abi)view.getLayoutParams();
            abi2.f = false;
            abi2.c = 0;
            abi2.b = 0;
            abi2.d = false;
            abi2.leftMargin = 0;
            abi2.rightMargin = 0;
            ActionMenuItemView actionmenuitemview;
            abi abi3;
            int k3;
            int l5;
            long l7;
            if (flag1 && ((ActionMenuItemView)view).c())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            abi2.e = flag1;
            if (abi2.a)
            {
                k1 = 1;
            } else
            {
                k1 = i;
            }
            abi3 = (abi)view.getLayoutParams();
            l5 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(l4) - i4, android.view.View.MeasureSpec.getMode(l4));
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
            k3 = 0;
            l2 = k3;
            if (k1 <= 0)
            {
                break label0;
            }
            if (l1 != 0)
            {
                l2 = k3;
                if (k1 < 2)
                {
                    break label0;
                }
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j5 * k1, 0x80000000), l5);
            k3 = view.getMeasuredWidth();
            l2 = k3 / j5;
            k1 = l2;
            if (k3 % j5 != 0)
            {
                k1 = l2 + 1;
            }
            l2 = k1;
            if (l1 != 0)
            {
                l2 = k1;
                if (k1 < 2)
                {
                    l2 = 2;
                }
            }
        }
        if (!abi3.a && l1 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        abi3.d = flag1;
        abi3.b = l2;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l2 * j5, 0x40000000), l5);
        k2 = Math.max(k2, l2);
        float f1;
        float f2;
        float f3;
        Object obj;
        abi abi1;
        int l3;
        long l8;
        long l9;
        if (abi2.d)
        {
            k1 = j2 + 1;
        } else
        {
            k1 = j2;
        }
        if (abi2.a)
        {
            l1 = 1;
        } else
        {
            l1 = i2;
        }
        i -= l2;
        j2 = Math.max(i1, view.getMeasuredHeight());
        if (l2 == 1)
        {
            l7 = 1 << i3;
            i1 = j3;
            l2 = j2;
            l6 = l7 | l6;
            i2 = l1;
            j2 = k1;
            l1 = l2;
            k1 = k2;
        } else
        {
            i2 = l1;
            i1 = j3;
            l1 = j2;
            j2 = k1;
            k1 = k2;
        }
_L27:
        i3++;
        l2 = i1;
        k2 = k1;
        i1 = l1;
        if (true) goto _L4; else goto _L3
_L3:
        if (i2 != 0 && l2 == 2)
        {
            j3 = 1;
        } else
        {
            j3 = 0;
        }
        k1 = 0;
        i3 = i;
        i = k1;
_L18:
        l9 = l6;
        if (j2 <= 0) goto _L6; else goto _L5
_L5:
        l9 = l6;
        if (i3 <= 0) goto _L6; else goto _L7
_L7:
        k1 = 0x7fffffff;
        l8 = 0L;
        l1 = 0;
        l3 = 0;
_L14:
        if (l3 >= k5) goto _L9; else goto _L8
_L8:
        obj = (abi)getChildAt(l3).getLayoutParams();
        if (!((abi) (obj)).d) goto _L11; else goto _L10
_L10:
        if (((abi) (obj)).b >= k1) goto _L13; else goto _L12
_L12:
        l1 = ((abi) (obj)).b;
        l8 = 1 << l3;
        k1 = 1;
_L16:
        i4 = l3 + 1;
        l3 = l1;
        l1 = k1;
        k1 = l3;
        l3 = i4;
          goto _L14
_L13:
        if (((abi) (obj)).b != k1) goto _L11; else goto _L15
_L15:
        l8 |= 1 << l3;
        i4 = l1 + 1;
        l1 = k1;
        k1 = i4;
          goto _L16
_L9:
        l6 |= l8;
        l9 = l6;
        if (l1 > i3) goto _L6; else goto _L17
_L17:
        i = i3;
        l1 = 0;
        while (l1 < k5) 
        {
            obj = getChildAt(l1);
            abi1 = (abi)((View) (obj)).getLayoutParams();
            if (((long)(1 << l1) & l8) == 0L)
            {
                if (abi1.b == k1 + 1)
                {
                    l6 |= 1 << l1;
                }
            } else
            {
                if (j3 != 0 && abi1.e && i == 1)
                {
                    ((View) (obj)).setPadding(o + j5, 0, o, 0);
                }
                abi1.b = abi1.b + 1;
                abi1.f = true;
                i--;
            }
            l1++;
        }
        i3 = i;
        i = 1;
          goto _L18
_L6:
        if (i2 == 0 && l2 == 1)
        {
            k1 = 1;
        } else
        {
            k1 = 0;
        }
        if (i3 <= 0 || l9 == 0L || i3 >= l2 - 1 && k1 == 0 && k2 <= 1) goto _L20; else goto _L19
_L19:
        f3 = Long.bitCount(l9);
        f2 = f3;
        if (k1 != 0) goto _L22; else goto _L21
_L21:
        f1 = f3;
        if ((1L & l9) != 0L)
        {
            f1 = f3;
            if (!((abi)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << k5 - 1) & l9) == 0L) goto _L22; else goto _L23
_L23:
        f2 = f1;
        if (((abi)getChildAt(k5 - 1).getLayoutParams()).e) goto _L22; else goto _L24
_L24:
        f1 -= 0.5F;
_L26:
        if (f1 > 0.0F)
        {
            k1 = (int)((float)(i3 * j5) / f1);
        } else
        {
            k1 = 0;
        }
        l1 = 0;
        do
        {
            i2 = i;
            if (l1 >= k5)
            {
                break;
            }
            if (((long)(1 << l1) & l9) != 0L)
            {
                obj = getChildAt(l1);
                abi1 = (abi)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    abi1.c = k1;
                    abi1.f = true;
                    if (l1 == 0 && !abi1.e)
                    {
                        abi1.leftMargin = -k1 / 2;
                    }
                    i = 1;
                } else
                if (abi1.a)
                {
                    abi1.c = k1;
                    abi1.f = true;
                    abi1.rightMargin = -k1 / 2;
                    i = 1;
                } else
                {
                    if (l1 != 0)
                    {
                        abi1.leftMargin = k1 / 2;
                    }
                    if (l1 != k5 - 1)
                    {
                        abi1.rightMargin = k1 / 2;
                    }
                }
            }
            l1++;
        } while (true);
          goto _L25
_L20:
        i2 = i;
_L25:
        if (i2 != 0)
        {
            for (i = 0; i < k5; i++)
            {
                obj = getChildAt(i);
                abi1 = (abi)((View) (obj)).getLayoutParams();
                if (abi1.f)
                {
                    k1 = abi1.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(abi1.c + k1 * j5, 0x40000000), l4);
                }
            }

        }
        if (k4 == 0x40000000)
        {
            i1 = j4;
        }
        setMeasuredDimension(i5, i1);
        return;
_L2:
        for (k1 = 0; k1 < l1; k1++)
        {
            obj = (abi)getChildAt(k1).getLayoutParams();
            obj.rightMargin = 0;
            obj.leftMargin = 0;
        }

        super.onMeasure(i, i1);
        return;
_L22:
        f1 = f2;
        if (true) goto _L26; else goto _L11
_L11:
        i4 = k1;
        k1 = l1;
        l1 = i4;
          goto _L16
        k1 = k2;
        l1 = i1;
        i1 = l2;
          goto _L27
    }
}
