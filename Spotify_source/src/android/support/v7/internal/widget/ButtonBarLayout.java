// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import sr;

public class ButtonBarLayout extends LinearLayout
{

    private boolean a;
    private int b;

    public ButtonBarLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = -1;
        context = context.obtainStyledAttributes(attributeset, sr.N);
        a = context.getBoolean(sr.O, false);
        context.recycle();
    }

    private void a(boolean flag)
    {
        View view;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        setOrientation(i);
        if (flag)
        {
            i = 5;
        } else
        {
            i = 80;
        }
        setGravity(i);
        view = findViewById(0x7f110270);
        if (view != null)
        {
            if (flag)
            {
                i = 8;
            } else
            {
                i = 4;
            }
            view.setVisibility(i);
        }
        for (i = getChildCount() - 2; i >= 0; i--)
        {
            bringChildToFront(getChildAt(i));
        }

    }

    private boolean a()
    {
        return getOrientation() == 1;
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag = false;
        int k = android.view.View.MeasureSpec.getSize(i);
        if (a)
        {
            if (k > b && a())
            {
                a(false);
            }
            b = k;
        }
        if (!a() && android.view.View.MeasureSpec.getMode(i) == 0x40000000)
        {
            k = android.view.View.MeasureSpec.makeMeasureSpec(k, 0x80000000);
            flag = true;
        } else
        {
            k = i;
        }
        super.onMeasure(k, j);
        k = ((flag) ? 1 : 0);
        if (a)
        {
            k = ((flag) ? 1 : 0);
            if (!a())
            {
                k = ((flag) ? 1 : 0);
                if ((getMeasuredWidthAndState() & 0xff000000) == 0x1000000)
                {
                    a(true);
                    k = 1;
                }
            }
        }
        if (k != 0)
        {
            super.onMeasure(i, j);
        }
    }
}
