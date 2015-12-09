// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.lang.reflect.Array;

public class CellLayout extends ViewGroup
{
    public static final class a
        implements android.view.ContextMenu.ContextMenuInfo
    {

        View a;
        public int b;
        public int c;
        public int d;
        public int e;
        public int f;
        final Rect g = new Rect();

        public String toString()
        {
            StringBuilder stringbuilder = (new StringBuilder()).append("Cell[view=");
            Object obj;
            if (a == null)
            {
                obj = "null";
            } else
            {
                obj = a.getClass();
            }
            return stringbuilder.append(obj).append(", x=").append(b).append("]").toString();
        }

        public a()
        {
        }
    }

    public static class b extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;
        public int b;
        public int c;
        public int d;
        int e;
        int f;
        boolean g;

        public void a(int i1, int j1, int k1, int l1, int i2, int j2)
        {
            int k2 = c;
            int l2 = d;
            int i3 = a;
            int j3 = b;
            width = ((k2 - 1) * k1 + k2 * i1) - leftMargin - rightMargin;
            height = (l2 * j1 + (l2 - 1) * l1) - topMargin - bottomMargin;
            e = (i1 + k1) * i3 + i2 + leftMargin;
            f = (j1 + l1) * j3 + j2 + topMargin;
        }

        public b(int i1, int j1, int k1, int l1)
        {
            super(-1, -1);
            a = i1;
            b = j1;
            c = k1;
            d = l1;
        }

        public b(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            c = 1;
            d = 1;
            a = -1;
            b = -1;
        }

        public b(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            c = 1;
            d = 1;
            a = -1;
            b = -1;
        }
    }


    public final a a;
    int b[];
    boolean c[][];
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private int i;
    private int j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;
    private int p;
    private boolean q;

    public CellLayout(Context context)
    {
        this(context, null);
    }

    public CellLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CellLayout(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        a = new a();
        b = new int[2];
        q = false;
        context = context.obtainStyledAttributes(attributeset, com.aviary.android.feather.sdk.R.styleable.AviaryCellLayout, i1, 0);
        o = context.getDimensionPixelSize(5, 0);
        p = context.getDimensionPixelSize(6, 0);
        g = context.getDimensionPixelSize(1, 0);
        h = context.getDimensionPixelSize(2, 0);
        i = context.getDimensionPixelSize(3, 0);
        j = context.getDimensionPixelSize(4, 0);
        d = context.getInteger(0, 0);
        l = context.getInt(7, 4);
        k = context.getInt(8, 1);
        context.recycle();
        b();
    }

    private boolean a(int i1, int j1, int k1, int l1)
    {
        if (i1 < c.length && j1 < c[i1].length && !c[i1][j1])
        {
            boolean flag;
            if (k1 > 1)
            {
                flag = a(i1 + 1, j1, k1 - 1, 1);
            } else
            {
                flag = true;
            }
            if (l1 > 1)
            {
                i1 = flag & a(i1, j1 + 1, 1, l1 - 1);
            } else
            {
                i1 = flag & true;
            }
            if (i1 != 0)
            {
                return true;
            }
        }
        return false;
    }

    private void b()
    {
        if (d == 0)
        {
            int i1 = l;
            int k1 = k;
            c = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
                i1, k1
            });
            return;
        } else
        {
            int j1 = k;
            int l1 = l;
            c = (boolean[][])Array.newInstance(Boolean.TYPE, new int[] {
                j1, l1
            });
            return;
        }
    }

    public a a()
    {
        return a(1, 1);
    }

    public a a(int i1, int j1)
    {
        if (i1 > l)
        {
            return null;
        }
        if (j1 > k)
        {
            return null;
        }
        if (d == 0)
        {
            for (int k1 = 0; k1 < c.length; k1++)
            {
                for (int i2 = 0; i2 < c[k1].length; i2++)
                {
                    if (a(k1, i2, i1, j1))
                    {
                        a a1 = new a();
                        a1.b = k1;
                        a1.c = i2;
                        a1.d = i1;
                        a1.e = j1;
                        a1.f = a.f;
                        return a1;
                    }
                }

            }

        } else
        {
            for (int l1 = 0; l1 < c.length; l1++)
            {
                for (int j2 = 0; j2 < c[l1].length; j2++)
                {
                    if (a(l1, j2, i1, j1))
                    {
                        a a2 = new a();
                        a2.b = j2;
                        a2.c = l1;
                        a2.d = i1;
                        a2.e = j1;
                        a2.f = a.f;
                        return a2;
                    }
                }

            }

        }
        return null;
    }

    public void addView(View view, int i1, android.view.ViewGroup.LayoutParams layoutparams)
    {
        b b1 = (b)layoutparams;
        b1.g = true;
        if (d == 0)
        {
            c[b1.a][b1.b] = true;
        } else
        {
            c[b1.b][b1.a] = true;
        }
        super.addView(view, i1, layoutparams);
    }

    public void cancelLongPress()
    {
        super.cancelLongPress();
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            getChildAt(i1).cancelLongPress();
        }

    }

    protected boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return layoutparams instanceof b;
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new b(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new b(layoutparams);
    }

    public int getBottomPadding()
    {
        return j;
    }

    public int getCellHeight()
    {
        return f;
    }

    public int getCellWidth()
    {
        return e;
    }

    public int getCountX()
    {
        return l;
    }

    public int getCountY()
    {
        return k;
    }

    public int getLeftPadding()
    {
        return g;
    }

    public int getRightPadding()
    {
        return h;
    }

    public int getTopPadding()
    {
        return i;
    }

    protected void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        a.f = ((ViewGroup)getParent()).indexOfChild(this);
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
    }

    protected void onLayout(boolean flag, int i1, int j1, int k1, int l1)
    {
        j1 = getChildCount();
        for (i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            if (view.getVisibility() != 8)
            {
                b b1 = (b)view.getLayoutParams();
                k1 = b1.e;
                l1 = b1.f;
                view.layout(k1, l1, b1.width + k1, b1.height + l1);
            }
        }

    }

    protected void onMeasure(int i1, int j1)
    {
        int l1 = android.view.View.MeasureSpec.getMode(i1);
        int k1 = android.view.View.MeasureSpec.getSize(i1);
        i1 = android.view.View.MeasureSpec.getMode(j1);
        j1 = android.view.View.MeasureSpec.getSize(j1);
        if (l1 == 0 || i1 == 0)
        {
            throw new RuntimeException("CellLayout cannot have UNSPECIFIED dimensions");
        }
        i1 = l - 1;
        int i2 = k - 1;
        int k2 = o;
        int l2 = p;
        l1 = k1 - (g + h);
        int j2 = j1 - (i + j);
        e = (l1 - k2 * i1) / l;
        f = (j2 - l2 * i2) / k;
        n = 0;
        m = 0;
        k2 = f;
        l2 = k;
        try
        {
            n = (j2 - k2 * l2) / i2;
        }
        catch (ArithmeticException arithmeticexception) { }
        i2 = e;
        j2 = l;
        if (i1 > 0)
        {
            m = (l1 - i2 * j2) / i1;
        }
        l1 = getChildCount();
        for (i1 = 0; i1 < l1; i1++)
        {
            View view = getChildAt(i1);
            b b1 = (b)view.getLayoutParams();
            b1.a(e, f, m, n, g, i);
            if (b1.g)
            {
                view.setId((getId() & 0xff) << 16 | (b1.a & 0xff) << 8 | b1.b & 0xff);
                b1.g = false;
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(b1.width, 0x40000000), android.view.View.MeasureSpec.makeMeasureSpec(b1.height, 0x40000000));
        }

        setMeasuredDimension(k1, j1);
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        return true;
    }

    public void removeAllViews()
    {
        super.removeAllViews();
        b();
    }

    public void requestChildFocus(View view, View view1)
    {
        super.requestChildFocus(view, view1);
        if (view != null)
        {
            view1 = new Rect();
            view.getDrawingRect(view1);
            requestRectangleOnScreen(view1);
        }
    }

    public boolean requestFocus(int i1, Rect rect)
    {
        return super.requestFocus(i1, rect);
    }

    public void setChildrenDrawingCacheEnabled(boolean flag)
    {
        setDrawingCacheEnabled(flag);
        int j1 = getChildCount();
        for (int i1 = 0; i1 < j1; i1++)
        {
            View view = getChildAt(i1);
            view.setDrawingCacheEnabled(flag);
            view.buildDrawingCache(true);
        }

    }

    public void setChildrenDrawnWithCacheEnabled(boolean flag)
    {
        super.setChildrenDrawnWithCacheEnabled(flag);
    }

    public void setEnabled(boolean flag)
    {
        super.setEnabled(flag);
        for (int i1 = 0; i1 < getChildCount(); i1++)
        {
            getChildAt(i1).setEnabled(flag);
        }

    }

    public void setNumCols(int i1)
    {
        if (l != i1)
        {
            l = i1;
            b();
        }
    }

    public void setNumRows(int i1)
    {
        if (i1 != k)
        {
            k = i1;
            b();
        }
    }
}
