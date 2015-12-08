// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.support.v4.widget.SwipeRefreshLayout;
import com.pinterest.activity.commerce.api.PinterestCallbackWithDefaultFailure;
import com.pinterest.network.api.PinterestError;

// Referenced classes of package com.pinterest.activity.commerce:
//            CommerceSettingsFragment

abstract class <init> extends PinterestCallbackWithDefaultFailure
{

    final CommerceSettingsFragment this$0;

    public void failure(PinterestError pinteresterror)
    {
        super.failure(pinteresterror);
        CommerceSettingsFragment.access$300(CommerceSettingsFragment.this).oadMoreItem();
        CommerceSettingsFragment.access$602(CommerceSettingsFragment.this, false);
        refreshLayout.setRefreshing(false);
        CommerceSettingsFragment.access$700(CommerceSettingsFragment.this, false);
    }

    private ()
    {
        this$0 = CommerceSettingsFragment.this;
        super();
    }

    >(> >)
    {
        this();
    }
}
