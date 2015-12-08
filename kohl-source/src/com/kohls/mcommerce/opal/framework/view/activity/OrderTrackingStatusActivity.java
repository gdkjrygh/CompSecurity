// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.res.Resources;
import android.os.Bundle;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class OrderTrackingStatusActivity extends BaseActivityWithoutSlider
{

    public OrderTrackingStatusActivity()
    {
    }

    protected int getLayoutId()
    {
        return 0x7f030005;
    }

    protected void initializeViews(Bundle bundle)
    {
        FragmentFactory.attachOrderTrackStatusFragment(this, bundle);
    }

    protected void updateActionBarViews()
    {
        getActionBarHelper().showActionBarWithDetail(getResources().getString(0x7f08051c));
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
