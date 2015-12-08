// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.timehop.stickyheadersrecyclerview.util;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

// Referenced classes of package com.timehop.stickyheadersrecyclerview.util:
//            OrientationProvider

public class LinearLayoutOrientationProvider
    implements OrientationProvider
{

    public LinearLayoutOrientationProvider()
    {
    }

    public int getOrientation(RecyclerView recyclerview)
    {
        recyclerview = recyclerview.getLayoutManager();
        if (recyclerview instanceof LinearLayoutManager)
        {
            return ((LinearLayoutManager)recyclerview).getOrientation();
        } else
        {
            throw new IllegalStateException("StickyListHeadersDecoration can only be used with a LinearLayoutManager.");
        }
    }
}
