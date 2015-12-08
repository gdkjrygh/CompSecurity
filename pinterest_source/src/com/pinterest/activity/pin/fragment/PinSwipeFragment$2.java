// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import com.pinterest.analytics.Pinalytics;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinSwipeFragment

class hangeListener extends android.support.v4.view.impleOnPageChangeListener
{

    final PinSwipeFragment this$0;

    public void onPageSelected(int i)
    {
        Pinalytics.a(PinSwipeFragment.this);
    }

    hangeListener()
    {
        this$0 = PinSwipeFragment.this;
        super();
    }
}
