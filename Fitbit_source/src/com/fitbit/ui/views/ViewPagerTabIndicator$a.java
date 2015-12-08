// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.views;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.fonts.a;

// Referenced classes of package com.fitbit.ui.views:
//            ViewPagerTabIndicator

private class  extends TextView
{

    final ViewPagerTabIndicator a;
    private int b;

    static int a( , int i)
    {
        .b = i;
        return i;
    }

    public int a()
    {
        return b;
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (ViewPagerTabIndicator.b(a) > 0 && getMeasuredWidth() > ViewPagerTabIndicator.b(a))
        {
            super.onMeasure(android.view.sureSpec(ViewPagerTabIndicator.b(a), 0x40000000), j);
        }
    }

    public (ViewPagerTabIndicator viewpagertabindicator, Context context)
    {
        this(viewpagertabindicator, context, null);
    }

    public <init>(ViewPagerTabIndicator viewpagertabindicator, Context context, AttributeSet attributeset)
    {
        this(viewpagertabindicator, context, attributeset, 0x7f01002a);
    }

    public <init>(ViewPagerTabIndicator viewpagertabindicator, Context context, AttributeSet attributeset, int i)
    {
        ViewPagerTabIndicator viewpagertabindicator1;
        a = viewpagertabindicator;
        super(context, attributeset, i);
        viewpagertabindicator1 = null;
        viewpagertabindicator = context.obtainStyledAttributes(attributeset, com.fitbit.FitbitMobile.t>, 0x1010084, 0);
        viewpagertabindicator1 = viewpagertabindicator;
        attributeset = FitbitFont.a(viewpagertabindicator);
        if (attributeset == null)
        {
            break MISSING_BLOCK_LABEL_49;
        }
        viewpagertabindicator1 = viewpagertabindicator;
        com.fitbit.util.fonts.a.a(context, this, attributeset);
        if (viewpagertabindicator != null)
        {
            viewpagertabindicator.recycle();
        }
_L2:
        return;
        viewpagertabindicator;
        if (viewpagertabindicator1 == null) goto _L2; else goto _L1
_L1:
        viewpagertabindicator1.recycle();
        return;
        viewpagertabindicator;
        attributeset = null;
        context = viewpagertabindicator;
_L4:
        if (attributeset != null)
        {
            attributeset.recycle();
        }
        throw context;
        context;
        attributeset = viewpagertabindicator;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
