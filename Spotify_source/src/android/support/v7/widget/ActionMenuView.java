// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

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
import ub;
import ug;
import uh;
import ui;
import uk;
import uv;
import uw;
import we;
import yx;
import ze;
import zf;
import zg;
import zh;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutCompat

public class ActionMenuView extends LinearLayoutCompat
    implements ui, uw
{

    public ug a;
    public boolean b;
    public yx c;
    uv d;
    uh e;
    zh f;
    private Context i;
    private int j;
    private boolean k;
    private int l;
    private int m;
    private int n;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        super.g = false;
        float f1 = context.getResources().getDisplayMetrics().density;
        m = (int)(56F * f1);
        n = (int)(f1 * 4F);
        i = context;
        j = 0;
    }

    public static LayoutParams a()
    {
        LayoutParams layoutparams = e();
        layoutparams.a = true;
        return layoutparams;
    }

    public static LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams != null)
        {
            if (layoutparams instanceof LayoutParams)
            {
                layoutparams = new LayoutParams((LayoutParams)layoutparams);
            } else
            {
                layoutparams = new LayoutParams(layoutparams);
            }
            if (((LayoutParams) (layoutparams)).h <= 0)
            {
                layoutparams.h = 16;
            }
            return layoutparams;
        } else
        {
            return e();
        }
    }

    public static zh a(ActionMenuView actionmenuview)
    {
        return actionmenuview.f;
    }

    private LayoutParams b(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    public static uh b(ActionMenuView actionmenuview)
    {
        return actionmenuview.e;
    }

    private boolean b(int i1)
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
            if (view instanceof ze)
            {
                flag = ((ze)view).e() | false;
            }
        }
        if (i1 > 0 && (view1 instanceof ze))
        {
            return ((ze)view1).d() | flag;
        } else
        {
            return flag;
        }
    }

    private static LayoutParams e()
    {
        LayoutParams layoutparams = new LayoutParams();
        layoutparams.h = 16;
        return layoutparams;
    }

    public final LinearLayoutCompat.LayoutParams a(AttributeSet attributeset)
    {
        return b(attributeset);
    }

    public final void a(int i1)
    {
label0:
        {
            if (j != i1)
            {
                j = i1;
                if (i1 != 0)
                {
                    break label0;
                }
                i = getContext();
            }
            return;
        }
        i = new ContextThemeWrapper(getContext(), i1);
    }

    public final void a(ug ug1)
    {
        a = ug1;
    }

    public final void a(yx yx1)
    {
        c = yx1;
        c.a(this);
    }

    public final boolean a(uk uk)
    {
        return a.a(uk, null, 0);
    }

    protected final LinearLayoutCompat.LayoutParams b(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public final Menu b()
    {
        if (a == null)
        {
            Object obj = getContext();
            a = new ug(((Context) (obj)));
            a.a(new zg(this, (byte)0));
            c = new yx(((Context) (obj)));
            c.b();
            yx yx1 = c;
            if (d != null)
            {
                obj = d;
            } else
            {
                obj = new zf((byte)0);
            }
            yx1.d = ((uv) (obj));
            a.a(c, i);
            c.a(this);
        }
        return a;
    }

    public final void c()
    {
        if (c != null)
        {
            c.e();
        }
    }

    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
    }

    protected final LinearLayoutCompat.LayoutParams d()
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
            c.a(false);
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
        c();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        if (k) goto _L2; else goto _L1
_L1:
        super.onLayout(flag, i1, j1, k1, l1);
_L4:
        return;
_L2:
        int i4 = getChildCount();
        int l3 = (l1 - j1) / 2;
        int j4 = super.h;
        j1 = 0;
        l1 = k1 - i1 - getPaddingRight() - getPaddingLeft();
        int j2 = 0;
        flag = we.a(this);
        int i2 = 0;
        while (i2 < i4) 
        {
            View view = getChildAt(i2);
            LayoutParams layoutparams1;
            if (view.getVisibility() != 8)
            {
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                if (layoutparams.a)
                {
                    int k2 = view.getMeasuredWidth();
                    j2 = k2;
                    if (b(i2))
                    {
                        j2 = k2 + j4;
                    }
                    int k4 = view.getMeasuredHeight();
                    int j3;
                    int l4;
                    if (flag)
                    {
                        k2 = getPaddingLeft();
                        k2 = layoutparams.leftMargin + k2;
                        j3 = k2 + j2;
                    } else
                    {
                        j3 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        k2 = j3 - j2;
                    }
                    l4 = l3 - k4 / 2;
                    view.layout(k2, l4, j3, k4 + l4);
                    k2 = l1 - j2;
                    j2 = 1;
                    l1 = j1;
                    j1 = k2;
                } else
                {
                    int l2 = view.getMeasuredWidth();
                    int k3 = layoutparams.leftMargin;
                    l1 -= layoutparams.rightMargin + (l2 + k3);
                    b(i2);
                    l2 = j1 + 1;
                    j1 = l1;
                    l1 = l2;
                }
            } else
            {
                int i3 = j1;
                j1 = l1;
                l1 = i3;
            }
            k2 = i2 + 1;
            i2 = l1;
            l1 = j1;
            j1 = i2;
            i2 = k2;
        }
        if (i4 == 1 && j2 == 0)
        {
            view = getChildAt(0);
            j1 = view.getMeasuredWidth();
            l1 = view.getMeasuredHeight();
            i1 = (k1 - i1) / 2 - j1 / 2;
            k1 = l3 - l1 / 2;
            view.layout(i1, k1, j1 + i1, l1 + k1);
            return;
        }
        if (j2 != 0)
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
        while (j1 < i4) 
        {
            view = getChildAt(j1);
            layoutparams1 = (LayoutParams)view.getLayoutParams();
            if (view.getVisibility() != 8 && !layoutparams1.a)
            {
                i1 -= layoutparams1.rightMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                j2 = l3 - i2 / 2;
                view.layout(i1 - l1, j2, i1, i2 + j2);
                i1 -= layoutparams1.leftMargin + l1 + k1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L3
_L3:
        i1 = getPaddingLeft();
        j1 = 0;
        while (j1 < i4) 
        {
            view = getChildAt(j1);
            layoutparams1 = (LayoutParams)view.getLayoutParams();
            if (view.getVisibility() != 8 && !layoutparams1.a)
            {
                i1 += layoutparams1.leftMargin;
                l1 = view.getMeasuredWidth();
                i2 = view.getMeasuredHeight();
                j2 = l3 - i2 / 2;
                view.layout(i1, j2, i1 + l1, i2 + j2);
                i1 = layoutparams1.rightMargin + l1 + k1 + i1;
            }
            j1++;
        }
        if (true) goto _L4; else goto _L5
_L5:
    }

    protected void onMeasure(int i1, int j1)
    {
        int i2;
        int j4;
        int k4;
        int l4;
        int i5;
        int j5;
        boolean flag2 = k;
        int k1;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(i1) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        k = flag;
        if (flag2 != k)
        {
            l = 0;
        }
        k1 = android.view.View.MeasureSpec.getSize(i1);
        if (k && a != null && k1 != l)
        {
            l = k1;
            a.b(true);
        }
        i2 = getChildCount();
        if (!k || i2 <= 0) goto _L2; else goto _L1
_L1:
        int j2;
        int k2;
        int l2;
        int i3;
        int j3;
        int k5;
        int l5;
        long l6;
        l4 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(i1);
        k4 = android.view.View.MeasureSpec.getSize(j1);
        k1 = getPaddingLeft();
        i2 = getPaddingRight();
        j4 = getPaddingTop() + getPaddingBottom();
        i5 = getChildMeasureSpec(j1, j4, -2);
        j5 = i1 - (k1 + i2);
        i1 = j5 / m;
        j1 = m;
        if (i1 == 0)
        {
            setMeasuredDimension(j5, 0);
            return;
        }
        k5 = m + (j5 % j1) / i1;
        j1 = 0;
        l2 = 0;
        k2 = 0;
        i3 = 0;
        j2 = 0;
        l6 = 0L;
        l5 = getChildCount();
        j3 = 0;
_L4:
        int l1;
        int k3;
        boolean flag1;
label0:
        {
            if (j3 >= l5)
            {
                break; /* Loop/switch isn't completed */
            }
            View view = getChildAt(j3);
            if (view.getVisibility() == 8)
            {
                break MISSING_BLOCK_LABEL_1620;
            }
            flag1 = view instanceof ActionMenuItemView;
            k3 = i3 + 1;
            if (flag1)
            {
                view.setPadding(n, 0, n, 0);
            }
            LayoutParams layoutparams1 = (LayoutParams)view.getLayoutParams();
            layoutparams1.f = false;
            layoutparams1.c = 0;
            layoutparams1.b = 0;
            layoutparams1.d = false;
            layoutparams1.leftMargin = 0;
            layoutparams1.rightMargin = 0;
            ActionMenuItemView actionmenuitemview;
            LayoutParams layoutparams2;
            int l3;
            int i6;
            long l7;
            if (flag1 && ((ActionMenuItemView)view).c())
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            layoutparams1.e = flag1;
            if (layoutparams1.a)
            {
                l1 = 1;
            } else
            {
                l1 = i1;
            }
            layoutparams2 = (LayoutParams)view.getLayoutParams();
            i6 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(i5) - j4, android.view.View.MeasureSpec.getMode(i5));
            if (view instanceof ActionMenuItemView)
            {
                actionmenuitemview = (ActionMenuItemView)view;
            } else
            {
                actionmenuitemview = null;
            }
            if (actionmenuitemview != null && actionmenuitemview.c())
            {
                i2 = 1;
            } else
            {
                i2 = 0;
            }
            l3 = 0;
            i3 = l3;
            if (l1 <= 0)
            {
                break label0;
            }
            if (i2 != 0)
            {
                i3 = l3;
                if (l1 < 2)
                {
                    break label0;
                }
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(k5 * l1, 0x80000000), i6);
            l3 = view.getMeasuredWidth();
            i3 = l3 / k5;
            l1 = i3;
            if (l3 % k5 != 0)
            {
                l1 = i3 + 1;
            }
            i3 = l1;
            if (i2 != 0)
            {
                i3 = l1;
                if (l1 < 2)
                {
                    i3 = 2;
                }
            }
        }
        if (!layoutparams2.a && i2 != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        layoutparams2.d = flag1;
        layoutparams2.b = i3;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i3 * k5, 0x40000000), i6);
        l2 = Math.max(l2, i3);
        float f1;
        float f2;
        float f3;
        Object obj;
        LayoutParams layoutparams;
        int i4;
        long l8;
        long l9;
        if (layoutparams1.d)
        {
            l1 = k2 + 1;
        } else
        {
            l1 = k2;
        }
        if (layoutparams1.a)
        {
            i2 = 1;
        } else
        {
            i2 = j2;
        }
        i1 -= i3;
        k2 = Math.max(j1, view.getMeasuredHeight());
        if (i3 == 1)
        {
            l7 = 1 << j3;
            j1 = k3;
            i3 = k2;
            l6 = l7 | l6;
            j2 = i2;
            k2 = l1;
            i2 = i3;
            l1 = l2;
        } else
        {
            j2 = i2;
            j1 = k3;
            i2 = k2;
            k2 = l1;
            l1 = l2;
        }
_L27:
        j3++;
        i3 = j1;
        l2 = l1;
        j1 = i2;
        if (true) goto _L4; else goto _L3
_L3:
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
_L18:
        l9 = l6;
        if (k2 <= 0) goto _L6; else goto _L5
_L5:
        l9 = l6;
        if (j3 <= 0) goto _L6; else goto _L7
_L7:
        l1 = 0x7fffffff;
        l8 = 0L;
        i2 = 0;
        i4 = 0;
_L14:
        if (i4 >= l5) goto _L9; else goto _L8
_L8:
        obj = (LayoutParams)getChildAt(i4).getLayoutParams();
        if (!((LayoutParams) (obj)).d) goto _L11; else goto _L10
_L10:
        if (((LayoutParams) (obj)).b >= l1) goto _L13; else goto _L12
_L12:
        i2 = ((LayoutParams) (obj)).b;
        l8 = 1 << i4;
        l1 = 1;
_L16:
        j4 = i4 + 1;
        i4 = i2;
        i2 = l1;
        l1 = i4;
        i4 = j4;
          goto _L14
_L13:
        if (((LayoutParams) (obj)).b != l1) goto _L11; else goto _L15
_L15:
        l8 |= 1 << i4;
        j4 = i2 + 1;
        i2 = l1;
        l1 = j4;
          goto _L16
_L9:
        l6 |= l8;
        l9 = l6;
        if (i2 > j3) goto _L6; else goto _L17
_L17:
        i1 = j3;
        i2 = 0;
        while (i2 < l5) 
        {
            obj = getChildAt(i2);
            layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
            if (((long)(1 << i2) & l8) == 0L)
            {
                if (layoutparams.b == l1 + 1)
                {
                    l6 |= 1 << i2;
                }
            } else
            {
                if (k3 != 0 && layoutparams.e && i1 == 1)
                {
                    ((View) (obj)).setPadding(n + k5, 0, n, 0);
                }
                layoutparams.b = layoutparams.b + 1;
                layoutparams.f = true;
                i1--;
            }
            i2++;
        }
        j3 = i1;
        i1 = 1;
          goto _L18
_L6:
        if (j2 == 0 && i3 == 1)
        {
            l1 = 1;
        } else
        {
            l1 = 0;
        }
        if (j3 <= 0 || l9 == 0L || j3 >= i3 - 1 && l1 == 0 && l2 <= 1) goto _L20; else goto _L19
_L19:
        f3 = Long.bitCount(l9);
        f2 = f3;
        if (l1 != 0) goto _L22; else goto _L21
_L21:
        f1 = f3;
        if ((1L & l9) != 0L)
        {
            f1 = f3;
            if (!((LayoutParams)getChildAt(0).getLayoutParams()).e)
            {
                f1 = f3 - 0.5F;
            }
        }
        f2 = f1;
        if (((long)(1 << l5 - 1) & l9) == 0L) goto _L22; else goto _L23
_L23:
        f2 = f1;
        if (((LayoutParams)getChildAt(l5 - 1).getLayoutParams()).e) goto _L22; else goto _L24
_L24:
        f1 -= 0.5F;
_L26:
        if (f1 > 0.0F)
        {
            l1 = (int)((float)(j3 * k5) / f1);
        } else
        {
            l1 = 0;
        }
        i2 = 0;
        do
        {
            j2 = i1;
            if (i2 >= l5)
            {
                break;
            }
            if (((long)(1 << i2) & l9) != 0L)
            {
                obj = getChildAt(i2);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    layoutparams.c = l1;
                    layoutparams.f = true;
                    if (i2 == 0 && !layoutparams.e)
                    {
                        layoutparams.leftMargin = -l1 / 2;
                    }
                    i1 = 1;
                } else
                if (layoutparams.a)
                {
                    layoutparams.c = l1;
                    layoutparams.f = true;
                    layoutparams.rightMargin = -l1 / 2;
                    i1 = 1;
                } else
                {
                    if (i2 != 0)
                    {
                        layoutparams.leftMargin = l1 / 2;
                    }
                    if (i2 != l5 - 1)
                    {
                        layoutparams.rightMargin = l1 / 2;
                    }
                }
            }
            i2++;
        } while (true);
          goto _L25
_L20:
        j2 = i1;
_L25:
        if (j2 != 0)
        {
            for (i1 = 0; i1 < l5; i1++)
            {
                obj = getChildAt(i1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (layoutparams.f)
                {
                    l1 = layoutparams.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.c + l1 * k5, 0x40000000), i5);
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
            obj = (LayoutParams)getChildAt(l1).getLayoutParams();
            obj.rightMargin = 0;
            obj.leftMargin = 0;
        }

        super.onMeasure(i1, j1);
        return;
_L22:
        f1 = f2;
        if (true) goto _L26; else goto _L11
_L11:
        j4 = l1;
        l1 = i2;
        i2 = j4;
          goto _L16
        l1 = l2;
        i2 = j1;
        j1 = i3;
          goto _L27
    }

    private class LayoutParams extends LinearLayoutCompat.LayoutParams
    {

        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
        boolean f;

        public LayoutParams()
        {
            super(-2);
            a = false;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            a = layoutparams.a;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
        }
    }

}
