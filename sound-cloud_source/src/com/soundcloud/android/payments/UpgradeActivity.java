// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.payments;

import android.content.Intent;
import com.soundcloud.android.main.ScActivity;
import com.soundcloud.android.payments.googleplay.BillingResult;
import com.soundcloud.android.view.screen.BaseLayoutHelper;

// Referenced classes of package com.soundcloud.android.payments:
//            UpgradePresenter

public class UpgradeActivity extends ScActivity
{

    BaseLayoutHelper baseLayoutHelper;
    UpgradePresenter upgradePresenter;

    public UpgradeActivity()
    {
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        upgradePresenter.handleBillingResult(new BillingResult(i, j, intent));
    }

    public Object onRetainCustomNonConfigurationInstance()
    {
        return upgradePresenter.getState();
    }

    protected void setActivityContentView()
    {
        super.setContentView(0x7f0300d6);
        baseLayoutHelper.setupActionBar(this);
    }
}
