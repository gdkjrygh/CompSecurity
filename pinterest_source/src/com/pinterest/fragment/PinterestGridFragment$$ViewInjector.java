// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.ui.grid.PinterestGridView;

// Referenced classes of package com.pinterest.fragment:
//            PinterestGridFragment

public class 
{

    public static void inject(butterknife.ewInjector ewinjector, PinterestGridFragment pinterestgridfragment, Object obj)
    {
        pinterestgridfragment._swipeVw = (SwipeRefreshLayout)ewinjector.ipeVw(obj, 0x7f0f0204);
        pinterestgridfragment._gridVw = (PinterestGridView)ewinjector.idVw(obj, 0x7f0f01e1, "field '_gridVw'");
    }

    public static void reset(PinterestGridFragment pinterestgridfragment)
    {
        pinterestgridfragment._swipeVw = null;
        pinterestgridfragment._gridVw = null;
    }

    public ()
    {
    }
}
