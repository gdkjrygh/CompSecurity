// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import com.roidapp.baselib.i;
import java.util.ArrayList;
import java.util.List;

public class FlowLayout extends ViewGroup
{

    private int a;
    private final List b;
    private final List c;
    private final List d;

    public FlowLayout(Context context)
    {
        this(context, null);
    }

    public FlowLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public FlowLayout(Context context, AttributeSet attributeset, int j)
    {
        int k;
        int l = 0x800003;
        super(context, attributeset, j);
        if (a())
        {
            k = 0x800003;
        } else
        {
            k = 3;
        }
        a = k | 0x30;
        b = new ArrayList();
        c = new ArrayList();
        d = new ArrayList();
        context = context.obtainStyledAttributes(attributeset, i.k, j, 0);
        k = context.getInt(i.n, -1);
        if (k <= 0) goto _L2; else goto _L1
_L1:
        if (a == k) goto _L2; else goto _L3
_L3:
        j = k;
        if ((0x800007 & k) != 0) goto _L5; else goto _L4
_L7:
        a = k;
        requestLayout();
_L2:
        context.recycle();
        return;
        attributeset;
        context.recycle();
        throw attributeset;
_L4:
        if (a())
        {
            j = l;
        } else
        {
            j = 3;
        }
        j = k | j;
_L5:
        k = j;
        if ((j & 0x70) == 0)
        {
            k = j | 0x30;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static boolean a()
    {
        return android.os.Build.VERSION.SDK_INT >= 14;
    }

    protected android.view.ViewGroup.LayoutParams generateDefaultLayoutParams()
    {
        return new LayoutParams();
    }

    public android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeset)
    {
        return new LayoutParams(getContext(), attributeset);
    }

    protected android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
    {
        return new LayoutParams(layoutparams);
    }

    protected void onLayout(boolean flag, int j, int k, int l, int i1)
    {
        Object obj;
        int l2;
        int i3;
        b.clear();
        c.clear();
        d.clear();
        i3 = getWidth();
        l2 = getHeight();
        k = getPaddingTop();
        obj = new ArrayList();
        a & 7;
        JVM INSTR lookupswitch 2: default 88
    //                   1: 345
    //                   5: 352;
           goto _L1 _L2 _L3
_L1:
        float f = 0.0F;
_L5:
        j = 0;
        l = 0;
        for (int j1 = 0; j1 < getChildCount();)
        {
            View view1 = getChildAt(j1);
            Object obj1 = obj;
            int j2 = l;
            int l1 = j;
            i1 = k;
            if (view1.getVisibility() != 8)
            {
                obj1 = (LayoutParams)view1.getLayoutParams();
                int l4 = view1.getMeasuredWidth() + ((LayoutParams) (obj1)).leftMargin + ((LayoutParams) (obj1)).rightMargin;
                int j3 = view1.getMeasuredHeight();
                int l3 = ((LayoutParams) (obj1)).bottomMargin;
                int j4 = ((LayoutParams) (obj1)).topMargin;
                obj1 = obj;
                l1 = l;
                j2 = j;
                i1 = k;
                if (j + l4 > i3)
                {
                    c.add(Integer.valueOf(l));
                    b.add(obj);
                    d.add(Integer.valueOf((int)((float)(i3 - j) * f) + getPaddingLeft()));
                    i1 = k + l;
                    l1 = 0;
                    j2 = 0;
                    obj1 = new ArrayList();
                }
                j = j2 + l4;
                j2 = Math.max(l1, j4 + (j3 + l3));
                ((List) (obj1)).add(view1);
                l1 = j;
            }
            j1++;
            obj = obj1;
            l = j2;
            j = l1;
            k = i1;
        }

        break; /* Loop/switch isn't completed */
_L2:
        f = 0.5F;
        continue; /* Loop/switch isn't completed */
_L3:
        f = 1.0F;
        if (true) goto _L5; else goto _L4
_L4:
        c.add(Integer.valueOf(l));
        b.add(obj);
        d.add(Integer.valueOf((int)(f * (float)(i3 - j)) + getPaddingLeft()));
        k += l;
        a & 0x70;
        JVM INSTR lookupswitch 2: default 452
    //                   16: 801
    //                   80: 811;
           goto _L6 _L7 _L8
_L6:
        k = 0;
_L22:
        int i2;
        int k2;
        i3 = b.size();
        i2 = getPaddingTop();
        k2 = 0;
_L20:
        int k3;
        int i4;
        if (k2 >= i3)
        {
            break; /* Loop/switch isn't completed */
        }
        k3 = ((Integer)c.get(k2)).intValue();
        obj = (List)b.get(k2);
        l = ((Integer)d.get(k2)).intValue();
        i4 = ((List) (obj)).size();
        l2 = 0;
_L18:
        if (l2 >= i4) goto _L10; else goto _L9
_L9:
        View view = (View)((List) (obj)).get(l2);
        if (view.getVisibility() == 8) goto _L12; else goto _L11
_L11:
        LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
        if (layoutparams.height == -1)
        {
            int k1;
            int k4;
            int i5;
            if (layoutparams.width == -1)
            {
                k1 = 0x40000000;
                i1 = j;
            } else
            if (layoutparams.width >= 0)
            {
                k1 = 0x40000000;
                i1 = layoutparams.width;
            } else
            {
                k1 = 0x80000000;
                i1 = j;
            }
            view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i1, k1), android.view.View.MeasureSpec.makeMeasureSpec(k3 - layoutparams.topMargin - layoutparams.bottomMargin, 0x40000000));
        }
        k4 = view.getMeasuredWidth();
        i5 = view.getMeasuredHeight();
        k1 = 0;
        i1 = k1;
        if (!Gravity.isVertical(layoutparams.a)) goto _L14; else goto _L13
_L13:
        layoutparams.a;
        JVM INSTR lookupswitch 3: default 716
    //                   16: 841
    //                   17: 841
    //                   80: 865;
           goto _L15 _L16 _L16 _L17
_L15:
        i1 = k1;
_L14:
        view.layout(layoutparams.leftMargin + l, layoutparams.topMargin + i2 + i1 + k, l + k4 + layoutparams.leftMargin, i1 + (i5 + i2 + layoutparams.topMargin) + k);
        l = layoutparams.leftMargin + k4 + layoutparams.rightMargin + l;
_L12:
        l2++;
          goto _L18
_L7:
        k = (l2 - k) / 2;
        continue; /* Loop/switch isn't completed */
_L8:
        k = l2 - k;
        continue; /* Loop/switch isn't completed */
_L16:
        i1 = (k3 - i5 - layoutparams.topMargin - layoutparams.bottomMargin) / 2;
          goto _L14
_L17:
        i1 = k3 - i5 - layoutparams.topMargin - layoutparams.bottomMargin;
          goto _L14
_L10:
        k2++;
        i2 += k3;
        if (true) goto _L20; else goto _L19
_L19:
        return;
        if (true) goto _L22; else goto _L21
_L21:
    }

    protected void onMeasure(int j, int k)
    {
        super.onMeasure(j, k);
        int k3 = android.view.View.MeasureSpec.getSize(j) - getPaddingLeft() - getPaddingRight();
        int j3 = android.view.View.MeasureSpec.getSize(k);
        int k4 = android.view.View.MeasureSpec.getMode(j);
        int j4 = android.view.View.MeasureSpec.getMode(k);
        int j1 = 0;
        int i1 = getPaddingTop() + getPaddingBottom();
        int i4 = 0;
        int l = 0;
        int l4 = getChildCount();
        int l3 = 0;
        while (l3 < l4) 
        {
            View view = getChildAt(l3);
            int l1;
            boolean flag;
            if (l3 == l4 - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (view.getVisibility() == 8)
            {
                if (flag)
                {
                    j1 = Math.max(j1, i4);
                    i1 += l;
                    int k1 = l;
                    l = j1;
                    j1 = k1;
                } else
                {
                    int j2 = j1;
                    j1 = l;
                    l = j2;
                }
            } else
            {
                measureChildWithMargins(view, j, i4, k, i1);
                LayoutParams layoutparams = (LayoutParams)view.getLayoutParams();
                int i2;
                int k2;
                int l2;
                int i3;
                if (layoutparams.width == -1)
                {
                    k2 = 0x40000000;
                    i2 = k3 - (layoutparams.leftMargin + layoutparams.rightMargin);
                } else
                if (layoutparams.width >= 0)
                {
                    k2 = 0x40000000;
                    i2 = layoutparams.width;
                } else
                {
                    k2 = 0x80000000;
                    i2 = k3;
                }
                if (layoutparams.height >= 0)
                {
                    i3 = 0x40000000;
                    l2 = layoutparams.height;
                } else
                if (j4 == 0)
                {
                    i3 = 0;
                    l2 = 0;
                } else
                {
                    i3 = 0x80000000;
                    l2 = j3;
                }
                view.measure(android.view.View.MeasureSpec.makeMeasureSpec(i2, k2), android.view.View.MeasureSpec.makeMeasureSpec(l2, i3));
                k2 = view.getMeasuredWidth() + layoutparams.leftMargin + layoutparams.rightMargin;
                if (i4 + k2 > k3)
                {
                    i3 = Math.max(j1, i4);
                    l2 = i1 + l;
                    l = view.getMeasuredHeight();
                    i1 = layoutparams.topMargin;
                    i2 = layoutparams.bottomMargin + (l + i1);
                } else
                {
                    k2 = i4 + k2;
                    i2 = view.getMeasuredHeight();
                    l2 = layoutparams.topMargin;
                    i2 = Math.max(l, layoutparams.bottomMargin + (i2 + l2));
                    i3 = j1;
                    l2 = i1;
                }
                j1 = i2;
                l = i3;
                i4 = k2;
                i1 = l2;
                if (flag)
                {
                    l = Math.max(i3, k2);
                    i1 = l2 + i2;
                    j1 = i2;
                    i4 = k2;
                }
            }
            l3++;
            l1 = l;
            l = j1;
            j1 = l1;
        }
        j = getPaddingLeft();
        k = getPaddingRight();
        if (k4 != 0x40000000)
        {
            k3 = j + k + j1;
        }
        if (j4 != 0x40000000)
        {
            j3 = i1;
        }
        setMeasuredDimension(k3, j3);
    }

    private class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int a;

        public LayoutParams()
        {
            super(-1, -1);
            a = -1;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            a = -1;
            context = context.obtainStyledAttributes(attributeset, i.l);
            a = context.getInt(i.m, -1);
            context.recycle();
            return;
            attributeset;
            context.recycle();
            throw attributeset;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            a = -1;
        }
    }

}
