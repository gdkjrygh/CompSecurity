// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.ui.view;

import android.support.v4.view.ViewPager;

// Referenced classes of package com.pinterest.ui.view:
//            PeekViewPager

public class 
{

    public static void inject(butterknife.wInjector winjector, PeekViewPager peekviewpager, Object obj)
    {
        peekviewpager._pager = (ViewPager)winjector.er(obj, 0x7f0f03bc, "field '_pager'");
    }

    public static void reset(PeekViewPager peekviewpager)
    {
        peekviewpager._pager = null;
    }

    public ()
    {
    }
}
