// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.graphics.Rect;
import android.support.v4.view.x;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.lang.reflect.Field;

// Referenced classes of package com.tinder.utils:
//            v

public final class q extends LinearLayoutManager
{

    private static boolean a = true;
    private static Field b = null;
    private final int c[] = new int[2];
    private final RecyclerView d;
    private final Rect e = new Rect();
    private int f;
    private boolean g;
    private int h;

    public q(RecyclerView recyclerview)
    {
        super(recyclerview.getContext(), 1, false);
        f = 100;
        h = 0;
        d = recyclerview;
        h = x.a(recyclerview);
    }

    private static void a(int i)
    {
        v.b("LinearLayoutManager", (new StringBuilder("Can't measure child #")).append(i).append(", previously used dimensions will be reused. To remove this message either use #setChildSize() method or don't run RecyclerView animations").toString());
    }

    private static void a(android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
    {
        if (!a)
        {
            return;
        }
        try
        {
            if (b == null)
            {
                Field field = android/support/v7/widget/RecyclerView$LayoutParams.getDeclaredField("mInsetsDirty");
                b = field;
                field.setAccessible(true);
            }
            b.set(layoutparams, Boolean.valueOf(true));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
        {
            b();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v7.widget.RecyclerView.LayoutParams layoutparams)
        {
            b();
        }
    }

    private void a(android.support.v7.widget.RecyclerView.Recycler recycler, int i, int j, int k, int ai[])
    {
        View view = recycler.getViewForPosition(i);
        android.support.v7.widget.RecyclerView.LayoutParams layoutparams = (android.support.v7.widget.RecyclerView.LayoutParams)view.getLayoutParams();
        i = getPaddingLeft();
        int l = getPaddingRight();
        int i1 = getPaddingTop();
        int j1 = getPaddingBottom();
        int k1 = layoutparams.leftMargin;
        int l1 = layoutparams.rightMargin;
        int i2 = layoutparams.topMargin;
        int j2 = layoutparams.bottomMargin;
        a(layoutparams);
        calculateItemDecorationsForChild(view, e);
        int k2 = getRightDecorationWidth(view);
        int l2 = getLeftDecorationWidth(view);
        int i3 = getTopDecorationHeight(view);
        int j3 = getBottomDecorationHeight(view);
        view.measure(getChildMeasureSpec(j, i + l + (k1 + l1) + (k2 + l2), layoutparams.width, canScrollHorizontally()), getChildMeasureSpec(k, i1 + j1 + (i2 + j2) + (i3 + j3), layoutparams.height, canScrollVertically()));
        ai[0] = getDecoratedMeasuredWidth(view) + layoutparams.leftMargin + layoutparams.rightMargin;
        ai[1] = getDecoratedMeasuredHeight(view) + layoutparams.bottomMargin + layoutparams.topMargin;
        a(layoutparams);
        recycler.recycleView(view);
    }

    private static void b()
    {
        a = false;
        v.a("Can't make LayoutParams insets dirty, decorations measurements might be incorrect");
    }

    public final void a()
    {
        if (d == null)
        {
            throw new IllegalStateException("view == null");
        } else
        {
            h = 2;
            x.c(d, 2);
            return;
        }
    }

    public final void onMeasure(android.support.v7.widget.RecyclerView.Recycler recycler, android.support.v7.widget.RecyclerView.State state, int i, int j)
    {
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag4;
        int j2;
        int k2;
        int l2;
        int j1 = android.view.View.MeasureSpec.getMode(i);
        int k = android.view.View.MeasureSpec.getMode(j);
        j2 = android.view.View.MeasureSpec.getSize(i);
        k2 = android.view.View.MeasureSpec.getSize(j);
        if (j1 != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (k != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (j1 == 0x40000000)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        if (k == 0x40000000)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        l2 = android.view.View.MeasureSpec.makeMeasureSpec(0, 0);
        if (!flag4 || !flag2) goto _L2; else goto _L1
_L1:
        super.onMeasure(recycler, state, i, j);
_L10:
        return;
_L2:
        int l;
        int k1;
        int i3;
        boolean flag3;
        int l1;
        int j3;
        if (getOrientation() == 1)
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        if (c[0] == 0 && c[1] == 0)
        {
            if (flag3)
            {
                c[0] = j2;
                c[1] = f;
            } else
            {
                c[0] = f;
                c[1] = k2;
            }
        }
        i = 0;
        j = 0;
        recycler.clear();
        i3 = state.getItemCount();
        j3 = getItemCount();
        k1 = 0;
_L11:
        if (k1 >= j3) goto _L4; else goto _L3
_L3:
        if (!flag3) goto _L6; else goto _L5
_L5:
        if (!g)
        {
            if (k1 < i3)
            {
                a(recycler, k1, j2, l2, c);
            } else
            {
                a(k1);
            }
        }
        l1 = c[1] + j;
        if (k1 == 0)
        {
            i = c[0];
        }
        l = l1;
        j = i;
        if (!flag1) goto _L8; else goto _L7
_L7:
        l = l1;
        j = i;
        if (l1 < k2) goto _L8; else goto _L9
_L9:
        j = l1;
_L4:
        int i2;
        if (flag4)
        {
            i = j2;
        } else
        {
            i = getPaddingLeft() + getPaddingRight() + i;
            if (flag)
            {
                i = Math.min(i, j2);
            }
        }
        if (flag2)
        {
            j = k2;
        } else
        {
            int i1 = getPaddingTop() + getPaddingBottom() + j;
            j = i1;
            if (flag1)
            {
                j = Math.min(i1, k2);
            }
        }
        setMeasuredDimension(i, j);
        if (d != null && h == 1)
        {
            if (flag3 && (!flag1 || j < k2) || !flag3 && (!flag || i < j2))
            {
                i = 1;
            } else
            {
                i = 0;
            }
            recycler = d;
            if (i != 0)
            {
                i = 2;
            } else
            {
                i = 0;
            }
            x.c(recycler, i);
            return;
        }
          goto _L10
_L6:
        if (!g)
        {
            if (k1 < i3)
            {
                a(recycler, k1, l2, k2, c);
            } else
            {
                a(k1);
            }
        }
        i2 = i + c[0];
        if (k1 == 0)
        {
            i = c[1];
        } else
        {
            i = j;
        }
        l = i;
        j = i2;
        if (flag)
        {
            if (i2 >= j2)
            {
                break MISSING_BLOCK_LABEL_588;
            }
            j = i2;
            l = i;
        }
_L8:
        k1++;
        i = j;
        j = l;
          goto _L11
        j = i;
        i = i2;
          goto _L4
    }

    public final void setOrientation(int i)
    {
        if (c != null && getOrientation() != i)
        {
            c[0] = 0;
            c[1] = 0;
        }
        super.setOrientation(i);
    }

}
