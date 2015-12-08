// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;

public class CardPopUpContainer extends RelativeLayout
{

    private int a;
    private DisplayMetrics b;

    public CardPopUpContainer(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public CardPopUpContainer(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = getPaddingBottom();
        b = getResources().getDisplayMetrics();
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag1 = true;
        int k = 0;
        boolean flag;
        if (android.view.View.MeasureSpec.getSize(j) < (int)((float)b.heightPixels * 0.7F))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            k = a;
        }
        if (getPaddingBottom() != k)
        {
            setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), k);
        }
        super.onMeasure(i, j);
    }
}
