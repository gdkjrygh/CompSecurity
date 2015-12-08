// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.os.Bundle;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class EULAActivity extends BaseActivityWithoutSlider
{

    public EULAActivity()
    {
    }

    protected int getLayoutId()
    {
        return 0x7f030004;
    }

    protected void initializeViews(Bundle bundle)
    {
        FragmentFactory.attachEulaFragment(this, null);
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        setResult(111, new Intent());
        finish();
    }

    protected void onResume()
    {
        KohlsPhoneApplication.getInstance().setApplicationForeground();
        super.onResume();
    }

    protected void updateActionBarViews()
    {
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    protected void updateViewsOnSuccess(Object obj)
    {
    }
}
