// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class KohlsChargeActivity extends BaseActivityWithoutSlider
{

    public KohlsChargeActivity()
    {
    }

    protected int getLayoutId()
    {
        return 0x7f030092;
    }

    protected void initializeViews(Bundle bundle)
    {
        FragmentFactory.attachKohlsChargeFragment(this, getIntent().getExtras());
        bundle = getResources().getString(0x7f080267);
        getActionBarHelper().showActionBarWithDetail(bundle);
        getActionBarHelper().hideShoppinBagIcon();
        getActionBarHelper().hideShoppingBagCount();
    }

    protected void updateActionBarViews()
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }
}
