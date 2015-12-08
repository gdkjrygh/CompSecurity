// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.view;

import android.content.Context;
import android.widget.FrameLayout;

// Referenced classes of package com.roidapp.baselib.view:
//            HeaderFooterGridView

final class o extends FrameLayout
{

    final HeaderFooterGridView a;

    public o(HeaderFooterGridView headerfootergridview, Context context)
    {
        a = headerfootergridview;
        super(context);
    }

    protected final void onMeasure(int i, int j)
    {
        super.onMeasure(android.view.View.MeasureSpec.makeMeasureSpec(a.getMeasuredWidth() - a.getPaddingLeft() - a.getPaddingRight(), android.view.View.MeasureSpec.getMode(i)), j);
    }
}
