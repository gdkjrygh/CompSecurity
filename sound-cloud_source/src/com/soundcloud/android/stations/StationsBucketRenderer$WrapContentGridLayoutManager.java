// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.GridLayoutManager;
import android.view.View;

// Referenced classes of package com.soundcloud.android.stations:
//            StationsBucketRenderer

private static class Y extends GridLayoutManager
{

    private int getChildMeasuredHeight(int i, View view)
    {
        measureChild(view, i / getSpanCount());
        return getDecoratedMeasuredHeight(view);
    }

    private int getNumberOfRows(int i)
    {
        return (int)Math.ceil((double)i / (double)getSpanCount());
    }

    private void measureChild(View view, int i)
    {
        view.measure(android.view.tGridLayoutManager(i, 0x40000000), android.view.tGridLayoutManager(0, 0));
    }

    private int measureHeight(android.support.v7.widget.nager nager, android.support.v7.widget.nager nager1, int i)
    {
        if (getItemCount() == 0)
        {
            return 0;
        } else
        {
            View view = nager.getItemCount(0);
            i = getChildMeasuredHeight(i, view);
            int j = getNumberOfRows(nager1.getNumberOfRows());
            nager.getNumberOfRows(view);
            return j * i;
        }
    }

    public void onMeasure(android.support.v7.widget.nager nager, android.support.v7.widget.nager nager1, int i, int j)
    {
        i = android.view.tGridLayoutManager(i);
        setMeasuredDimension(i, measureHeight(nager, nager1, i));
    }

    public Y(Context context)
    {
        super(context, context.getResources().getInteger(0x7f0a0008));
    }
}
