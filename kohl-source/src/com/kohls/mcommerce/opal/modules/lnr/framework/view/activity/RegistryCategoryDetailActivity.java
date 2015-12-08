// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.view.activity;

import android.os.Bundle;
import com.kohls.mcommerce.opal.framework.view.activity.BaseActivityWithoutSlider;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.modules.lnr.framework.view.fragment.RegistryCategoryDetailFragment;

public class RegistryCategoryDetailActivity extends BaseActivityWithoutSlider
{

    public RegistryCategoryDetailActivity()
    {
    }

    protected int getLayoutId()
    {
        return 0x7f030001;
    }

    protected void initializeViews(Bundle bundle)
    {
        FragmentFactory.attachRegistryCategoryDetailFragment(this, bundle, new RegistryCategoryDetailFragment());
    }

    public void onBackPressed()
    {
        finish();
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
