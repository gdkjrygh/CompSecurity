// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.view;

import android.view.View;

// Referenced classes of package com.pinterest.kit.view:
//            MapViewGroup

class er.Callback extends android.support.v4.widget.Callback
{

    final MapViewGroup a;

    public int clampViewPositionVertical(View view, int i, int j)
    {
        j = a.getPaddingTop();
        int k = a.getViewBottomBound();
        return Math.min(Math.max(i, j), k);
    }

    public int getViewVerticalDragRange(View view)
    {
        if (view == a._gridVw)
        {
            return MapViewGroup.access$100(a);
        } else
        {
            return 0;
        }
    }

    public void onViewPositionChanged(View view, int i, int j, int k, int l)
    {
        MapViewGroup.access$002(a, j);
        a.requestLayout();
    }

    public boolean tryCaptureView(View view, int i)
    {
        return view == a._gridVw;
    }

    er.Callback(MapViewGroup mapviewgroup)
    {
        a = mapviewgroup;
        super();
    }
}
