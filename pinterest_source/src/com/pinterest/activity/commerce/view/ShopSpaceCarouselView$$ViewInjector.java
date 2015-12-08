// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.view;

import com.pinterest.ui.view.PeekViewPager;

// Referenced classes of package com.pinterest.activity.commerce.view:
//            ShopSpaceCarouselView

public class 
{

    public static void inject(butterknife.rouselView rouselview, ShopSpaceCarouselView shopspacecarouselview, Object obj)
    {
        shopspacecarouselview.peekViewPager = (PeekViewPager)rouselview.peekViewPager(obj, 0x7f0f0424, "field 'peekViewPager'");
    }

    public static void reset(ShopSpaceCarouselView shopspacecarouselview)
    {
        shopspacecarouselview.peekViewPager = null;
    }

    public ()
    {
    }
}
