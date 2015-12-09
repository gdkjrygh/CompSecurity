// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.v7.internal.widget.LinearLayoutICS;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

// Referenced classes of package android.support.v7.internal.view.menu:
//            m, ActionMenuItemView, f, ActionMenuPresenter, 
//            h

public class ActionMenuView extends LinearLayoutICS
    implements f.b, m
{
    public static class LayoutParams extends android.widget.LinearLayout.LayoutParams
    {

        public boolean a;
        public int b;
        public int c;
        public boolean d;
        public boolean e;
        public boolean f;

        public LayoutParams(int j, int k)
        {
            super(j, k);
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
    }

    public static interface a
    {

        public abstract boolean c();

        public abstract boolean d();
    }


    private f a;
    private boolean b;
    private ActionMenuPresenter c;
    private boolean d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;

    public ActionMenuView(Context context)
    {
        this(context, null);
    }

    public ActionMenuView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setBaselineAligned(false);
        float f1 = context.getResources().getDisplayMetrics().density;
        f = (int)(56F * f1);
        g = (int)(f1 * 4F);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBar, android.support.v7.appcompat.R.attr.actionBarStyle, 0);
        i = context.getDimensionPixelSize(0, 0);
        context.recycle();
    }

    static int a(View view, int j, int k, int l, int i1)
    {
        boolean flag1 = false;
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        int j1 = android.view.View.MeasureSpec.makeMeasureSpec(android.view.View.MeasureSpec.getSize(l) - i1, android.view.View.MeasureSpec.getMode(l));
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
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (k > 0 && (i1 == 0 || k >= 2))
        {
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(j * k, 0x80000000), j1);
            int k1 = view.getMeasuredWidth();
            l = k1 / j;
            k = l;
            if (k1 % j != 0)
            {
                k = l + 1;
            }
            l = k;
            if (i1 != 0)
            {
                l = k;
                if (k < 2)
                {
                    l = 2;
                }
            }
        } else
        {
            l = 0;
        }
        flag = flag1;
        if (!layoutparams.a)
        {
            flag = flag1;
            if (i1 != 0)
            {
                flag = true;
            }
        }
        layoutparams.d = flag;
        layoutparams.b = l;
        view.measure(android.view.View.MeasureSpec.makeMeasureSpec(l * j, 0x40000000), j1);
        return l;
    }

    private void a(int j, int k)
    {
        int l3 = android.view.View.MeasureSpec.getMode(k);
        j = android.view.View.MeasureSpec.getSize(j);
        int k3 = android.view.View.MeasureSpec.getSize(k);
        k = getPaddingLeft();
        int l = getPaddingRight();
        int i3 = getPaddingTop() + getPaddingBottom();
        int k2;
        int i4;
        if (l3 == 0x40000000)
        {
            k2 = android.view.View.MeasureSpec.makeMeasureSpec(k3 - i3, 0x40000000);
        } else
        {
            k2 = android.view.View.MeasureSpec.makeMeasureSpec(Math.min(i, k3 - i3), 0x80000000);
        }
        i4 = j - (l + k);
        j = i4 / f;
        k = f;
        if (j == 0)
        {
            setMeasuredDimension(i4, 0);
            return;
        }
        int j4 = f + (i4 % k) / j;
        l = 0;
        int i2 = 0;
        int l1 = 0;
        int j2 = 0;
        int k1 = 0;
        long l4 = 0L;
        int k4 = getChildCount();
        int j1 = 0;
        while (j1 < k4) 
        {
            Object obj = getChildAt(j1);
            int i1;
            if (((View) (obj)).getVisibility() == 8)
            {
                k = i2;
                i1 = j;
                j = j2;
            } else
            {
                boolean flag = obj instanceof ActionMenuItemView;
                j2++;
                if (flag)
                {
                    ((View) (obj)).setPadding(g, 0, g, 0);
                }
                LayoutParams layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                layoutparams.f = false;
                layoutparams.c = 0;
                layoutparams.b = 0;
                layoutparams.d = false;
                layoutparams.leftMargin = 0;
                layoutparams.rightMargin = 0;
                int l2;
                int j3;
                if (flag && ((ActionMenuItemView)obj).b())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                layoutparams.e = flag;
                if (layoutparams.a)
                {
                    k = 1;
                } else
                {
                    k = j;
                }
                j3 = a(((View) (obj)), j4, k, k2, i3);
                i2 = Math.max(i2, j3);
                float f1;
                float f2;
                float f3;
                long l6;
                if (layoutparams.d)
                {
                    k = l1 + 1;
                } else
                {
                    k = l1;
                }
                if (layoutparams.a)
                {
                    i1 = 1;
                } else
                {
                    i1 = k1;
                }
                l2 = j - j3;
                l = Math.max(l, ((View) (obj)).getMeasuredHeight());
                if (j3 == 1)
                {
                    long l5 = 1 << j1;
                    j = j2;
                    l4 = l5 | l4;
                    l1 = k;
                    k = i2;
                    k1 = i1;
                    i1 = l2;
                } else
                {
                    l1 = k;
                    k = i2;
                    j = j2;
                    k1 = i1;
                    i1 = l2;
                }
            }
            j1++;
            j2 = j;
            j = i1;
            i2 = k;
        }
        if (k1 != 0 && j2 == 2)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        i1 = 0;
        j1 = j;
        if (l1 <= 0 || j1 <= 0) goto _L2; else goto _L1
_L1:
        j = 0x7fffffff;
        l6 = 0L;
        k = 0;
        i3 = 0;
        while (i3 < k4) 
        {
            obj = (LayoutParams)getChildAt(i3).getLayoutParams();
            if (!((LayoutParams) (obj)).d)
            {
                j3 = k;
                k = j;
                j = j3;
            } else
            if (((LayoutParams) (obj)).b < j)
            {
                k = ((LayoutParams) (obj)).b;
                l6 = 1 << i3;
                j = 1;
            } else
            if (((LayoutParams) (obj)).b == j)
            {
                l6 |= 1 << i3;
                j3 = k + 1;
                k = j;
                j = j3;
            } else
            {
                j3 = j;
                j = k;
                k = j3;
            }
            j3 = i3 + 1;
            i3 = k;
            k = j;
            j = i3;
            i3 = j3;
        }
        l4 |= l6;
        if (k <= j1) goto _L3; else goto _L2
_L3:
        i1 = 0;
        k = j1;
        while (i1 < k4) 
        {
            obj = getChildAt(i1);
            layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
            if (((long)(1 << i1) & l6) == 0L)
            {
                if (layoutparams.b == j + 1)
                {
                    l4 |= 1 << i1;
                }
            } else
            {
                if (l2 != 0 && layoutparams.e && k == 1)
                {
                    ((View) (obj)).setPadding(g + j4, 0, g, 0);
                }
                layoutparams.b = layoutparams.b + 1;
                layoutparams.f = true;
                k--;
            }
            i1++;
        }
        i1 = 1;
        j1 = k;
        break MISSING_BLOCK_LABEL_456;
_L2:
        if (k1 == 0 && j2 == 1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (j1 <= 0 || l4 == 0L || j1 >= j2 - 1 && j == 0 && i2 <= 1)
        {
            break MISSING_BLOCK_LABEL_1214;
        }
        f3 = Long.bitCount(l4);
        f2 = f3;
        if (j == 0)
        {
            f1 = f3;
            if ((1L & l4) != 0L)
            {
                f1 = f3;
                if (!((LayoutParams)getChildAt(0).getLayoutParams()).e)
                {
                    f1 = f3 - 0.5F;
                }
            }
            f2 = f1;
            if (((long)(1 << k4 - 1) & l4) != 0L)
            {
label0:
                {
                    f2 = f1;
                    if (!((LayoutParams)getChildAt(k4 - 1).getLayoutParams()).e)
                    {
                        f1 -= 0.5F;
                        break label0;
                    }
                }
            }
        }
        f1 = f2;
        if (f1 > 0.0F)
        {
            k = (int)((float)(j1 * j4) / f1);
        } else
        {
            k = 0;
        }
        j1 = 0;
        j = i1;
        i1 = j1;
        while (i1 < k4) 
        {
            if (((long)(1 << i1) & l4) != 0L)
            {
                obj = getChildAt(i1);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (obj instanceof ActionMenuItemView)
                {
                    layoutparams.c = k;
                    layoutparams.f = true;
                    if (i1 == 0 && !layoutparams.e)
                    {
                        layoutparams.leftMargin = -k / 2;
                    }
                    j = 1;
                } else
                if (layoutparams.a)
                {
                    layoutparams.c = k;
                    layoutparams.f = true;
                    layoutparams.rightMargin = -k / 2;
                    j = 1;
                } else
                {
                    if (i1 != 0)
                    {
                        layoutparams.leftMargin = k / 2;
                    }
                    if (i1 != k4 - 1)
                    {
                        layoutparams.rightMargin = k / 2;
                    }
                }
            }
            i1++;
        }
        k = 0;
_L5:
        if (j != 0)
        {
            j = 0;
            while (j < k4) 
            {
                obj = getChildAt(j);
                layoutparams = (LayoutParams)((View) (obj)).getLayoutParams();
                if (layoutparams.f)
                {
                    i1 = layoutparams.b;
                    ((View) (obj)).measure(android.view.View.MeasureSpec.makeMeasureSpec(layoutparams.c + i1 * j4, 0x40000000), k2);
                }
                j++;
            }
        }
        if (l3 == 0x40000000)
        {
            l = k3;
        }
        setMeasuredDimension(i4, l);
        h = k * j4;
        return;
        j = i1;
        k = j1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected LayoutParams a()
    {
        LayoutParams layoutparams = new LayoutParams(-2, -2);
        layoutparams.gravity = 16;
        return layoutparams;
    }

    public LayoutParams a(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected LayoutParams a(android.view.ViewGroup.LayoutParams layoutparams)
    {
        if (layoutparams instanceof LayoutParams)
        {
            layoutparams = new LayoutParams((LayoutParams)layoutparams);
            if (((LayoutParams) (layoutparams)).gravity <= 0)
            {
                layoutparams.gravity = 16;
            }
            return layoutparams;
        } else
        {
            return a();
        }
    }

    public void a(f f1)
    {
        a = f1;
    }

    protected boolean a(int j)
    {
        View view = getChildAt(j - 1);
        View view1 = getChildAt(j);
        boolean flag1 = false;
        boolean flag = flag1;
        if (j < getChildCount())
        {
            flag = flag1;
            if (view instanceof a)
            {
                flag = false | ((a)view).d();
            }
        }
        if (j > 0 && (view1 instanceof a))
        {
            return ((a)view1).c() | flag;
        } else
        {
            return flag;
        }
    }

    public boolean a(h h1)
    {
        return a.a(h1, 0);
    }

    public LayoutParams b()
    {
        LayoutParams layoutparams = a();
        layoutparams.a = true;
        return layoutparams;
    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams != null && (layoutparams instanceof LayoutParams);
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        return false;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return a();
    }

    protected android.widget.LinearLayout.LayoutParams generateDefaultLayoutParams()
    {
        return a();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
    }

    public android.widget.LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return a(attributeset);
    }

    protected android.widget.LinearLayout.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return a(layoutparams);
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
        c.c(false);
        if (c != null && c.e())
        {
            c.b();
            c.a();
        }
    }

    public void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        c.c();
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        if (!d)
        {
            super.onLayout(flag, j, k, l, i1);
        } else
        {
            int l4 = getChildCount();
            int k4 = (k + i1) / 2;
            int i5 = getSupportDividerWidth();
            i1 = 0;
            k = 0;
            int l1 = l - j - getPaddingRight() - getPaddingLeft();
            int j1 = 0;
            int j2 = 0;
            while (j2 < l4) 
            {
                View view = getChildAt(j2);
                int l2;
                int l3;
                if (view.getVisibility() == 8)
                {
                    int k2 = j1;
                    int k3 = l1;
                    l1 = i1;
                    j1 = k;
                    i1 = k3;
                    k = k2;
                } else
                {
                    LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                    if (layoutparams.a)
                    {
                        int i3 = view.getMeasuredWidth();
                        j1 = i3;
                        if (a(j2))
                        {
                            j1 = i3 + i5;
                        }
                        i3 = view.getMeasuredHeight();
                        int i4 = getWidth() - getPaddingRight() - layoutparams.rightMargin;
                        int j5 = k4 - i3 / 2;
                        view.layout(i4 - j1, j5, i4, i3 + j5);
                        i3 = l1 - j1;
                        i4 = 1;
                        j1 = k;
                        l1 = i1;
                        k = i4;
                        i1 = i3;
                    } else
                    {
                        int j4 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
                        int j3 = i1 + j4;
                        i1 = j3;
                        if (a(j2))
                        {
                            i1 = j3 + i5;
                        }
                        j3 = l1 - j4;
                        j4 = k + 1;
                        l1 = i1;
                        k = j1;
                        i1 = j3;
                        j1 = j4;
                    }
                }
                l3 = j2 + 1;
                j2 = l1;
                l2 = j1;
                j1 = k;
                l1 = i1;
                k = l2;
                i1 = j2;
                j2 = l3;
            }
            if (l4 == 1 && j1 == 0)
            {
                View view1 = getChildAt(0);
                k = view1.getMeasuredWidth();
                i1 = view1.getMeasuredHeight();
                j = (l - j) / 2 - k / 2;
                l = k4 - i1 / 2;
                view1.layout(j, l, k + j, i1 + l);
                return;
            }
            if (j1 != 0)
            {
                j = 0;
            } else
            {
                j = 1;
            }
            j = k - j;
            if (j > 0)
            {
                j = l1 / j;
            } else
            {
                j = 0;
            }
            l = Math.max(0, j);
            j = getPaddingLeft();
            k = 0;
            while (k < l4) 
            {
                View view2 = getChildAt(k);
                LayoutParams layoutparams1 = (LayoutParams)view2.getLayoutParams();
                if (view2.getVisibility() != 8 && !layoutparams1.a)
                {
                    j += layoutparams1.leftMargin;
                    i1 = view2.getMeasuredWidth();
                    int k1 = view2.getMeasuredHeight();
                    int i2 = k4 - k1 / 2;
                    view2.layout(j, i2, j + i1, k1 + i2);
                    j = layoutparams1.rightMargin + i1 + l + j;
                }
                k++;
            }
        }
    }

    protected void onMeasure(int j, int k)
    {
        boolean flag1 = d;
        int l;
        boolean flag;
        if (android.view.View.MeasureSpec.getMode(j) == 0x40000000)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        if (flag1 != d)
        {
            e = 0;
        }
        l = android.view.View.MeasureSpec.getMode(j);
        if (d && a != null && l != e)
        {
            e = l;
            a.b(true);
        }
        if (d)
        {
            a(j, k);
            return;
        }
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            LayoutParams layoutparams = (LayoutParams)getChildAt(i1).getLayoutParams();
            layoutparams.rightMargin = 0;
            layoutparams.leftMargin = 0;
        }

        super.onMeasure(j, k);
    }

    public void setOverflowReserved(boolean flag)
    {
        b = flag;
    }

    public void setPresenter(ActionMenuPresenter actionmenupresenter)
    {
        c = actionmenupresenter;
    }
}
