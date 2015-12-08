// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;

import android.content.Context;
import android.widget.TextView;

// Referenced classes of package com.viewpagerindicator:
//            TabPageIndicator

private class rStyle extends TextView
{

    private int mIndex;
    final TabPageIndicator this$0;

    public int getIndex()
    {
        return mIndex;
    }

    public void onMeasure(int i, int j)
    {
        super.onMeasure(i, j);
        if (TabPageIndicator.access$400(TabPageIndicator.this) > 0 && getMeasuredWidth() > TabPageIndicator.access$400(TabPageIndicator.this))
        {
            super.onMeasure(android.view.ureSpec(TabPageIndicator.access$400(TabPageIndicator.this), 0x40000000), j);
        }
    }


/*
    static int access$302( , int i)
    {
        .mIndex = i;
        return i;
    }

*/

    public mIndex(Context context)
    {
        this$0 = TabPageIndicator.this;
        super(context, null, rStyle);
    }
}
