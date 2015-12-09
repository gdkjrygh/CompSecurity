// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class LinearLayoutICS extends LinearLayout
{

    private final Drawable a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;

    public LinearLayoutICS(Context context, AttributeSet attributeset)
    {
        boolean flag = true;
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.LinearLayoutICS);
        a = context.getDrawable(0);
        if (a != null)
        {
            b = a.getIntrinsicWidth();
            c = a.getIntrinsicHeight();
        } else
        {
            b = 0;
            c = 0;
        }
        d = context.getInt(1, 0);
        e = context.getDimensionPixelSize(2, 0);
        context.recycle();
        if (a != null)
        {
            flag = false;
        }
        setWillNotDraw(flag);
    }

    void a(Canvas canvas)
    {
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if (view != null && view.getVisibility() != 8 && a(i))
            {
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                a(canvas, view.getTop() - layoutparams.topMargin);
            }
        }

        if (a(k))
        {
            View view1 = getChildAt(k - 1);
            int j;
            if (view1 == null)
            {
                j = getHeight() - getPaddingBottom() - c;
            } else
            {
                j = view1.getBottom();
            }
            a(canvas, j);
        }
    }

    void a(Canvas canvas, int i)
    {
        a.setBounds(getPaddingLeft() + e, i, getWidth() - getPaddingRight() - e, c + i);
        a.draw(canvas);
    }

    protected boolean a(int i)
    {
        if (i != 0) goto _L2; else goto _L1
_L1:
        if ((d & 1) == 0) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (i != getChildCount())
        {
            break; /* Loop/switch isn't completed */
        }
        if ((d & 4) == 0)
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if ((d & 2) == 0)
        {
            break; /* Loop/switch isn't completed */
        }
        i--;
        do
        {
            if (i < 0)
            {
                break MISSING_BLOCK_LABEL_75;
            }
            if (getChildAt(i).getVisibility() != 8)
            {
                break;
            }
            i--;
        } while (true);
        if (true) goto _L3; else goto _L6
_L6:
        return false;
        return false;
    }

    void b(Canvas canvas)
    {
        int k = getChildCount();
        for (int i = 0; i < k; i++)
        {
            View view = getChildAt(i);
            if (view != null && view.getVisibility() != 8 && a(i))
            {
                android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
                b(canvas, view.getLeft() - layoutparams.leftMargin);
            }
        }

        if (a(k))
        {
            View view1 = getChildAt(k - 1);
            int j;
            if (view1 == null)
            {
                j = getWidth() - getPaddingRight() - b;
            } else
            {
                j = view1.getRight();
            }
            b(canvas, j);
        }
    }

    void b(Canvas canvas, int i)
    {
        a.setBounds(i, getPaddingTop() + e, b + i, getHeight() - getPaddingBottom() - e);
        a.draw(canvas);
    }

    public int getSupportDividerWidth()
    {
        return b;
    }

    protected void measureChildWithMargins(View view, int i, int j, int k, int l)
    {
        if (a == null) goto _L2; else goto _L1
_L1:
        android.widget.LinearLayout.LayoutParams layoutparams;
        int i1;
        int j1;
        i1 = indexOfChild(view);
        j1 = getChildCount();
        layoutparams = (android.widget.LinearLayout.LayoutParams)view.getLayoutParams();
        if (getOrientation() != 1) goto _L4; else goto _L3
_L3:
        if (!a(i1)) goto _L6; else goto _L5
_L5:
        layoutparams.topMargin = c;
_L2:
        super.measureChildWithMargins(view, i, j, k, l);
        return;
_L6:
        if (i1 == j1 - 1 && a(j1))
        {
            layoutparams.bottomMargin = c;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (a(i1))
        {
            layoutparams.leftMargin = b;
        } else
        if (i1 == j1 - 1 && a(j1))
        {
            layoutparams.rightMargin = b;
        }
        if (true) goto _L2; else goto _L7
_L7:
    }

    protected void onDraw(Canvas canvas)
    {
        if (a == null)
        {
            return;
        }
        if (getOrientation() == 1)
        {
            a(canvas);
            return;
        } else
        {
            b(canvas);
            return;
        }
    }
}
