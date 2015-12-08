// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.app.Fragment;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.ui.toast.ToastUtility;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.controller.impl.UpdateAccountControllerImpl;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.framework.view.fragment.utility.FragmentHelper;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;
import java.lang.ref.WeakReference;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class UpdateAccountActivity extends BaseActivityWithoutSlider
{

    public UpdateAccountActivity()
    {
    }

    private void showProcessDialog()
    {
        UtilityMethods.showKohlsProgressDialog(4002, null, getResources().getString(0x7f08052d), null, true, false, false, 0, this);
    }

    public ActionBarHelper getActivityActionBar()
    {
        return getActionBarHelper();
    }

    protected int getLayoutId()
    {
        return 0x7f030007;
    }

    protected void initializeViews(Bundle bundle)
    {
        FragmentFactory.attachSignInfoFragment(this, bundle);
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
label0:
        {
            super.onActivityResult(i, j, intent);
            if (j == -1)
            {
                if (!KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
                {
                    break label0;
                }
                showProcessDialog();
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().sendGetCustomerProfileReq(new UpdateAccountControllerImpl(this));
            }
            return;
        }
        setResult(7003, new Intent());
        finish();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        if (!KohlsPhoneApplication.getInstance().getAuthenticationUtils().isUserSignedIn())
        {
            setResult(-1, new Intent());
            finish();
        }
    }

    protected void onDestroy()
    {
        super.onDestroy();
        ToastUtility.hideAllCustomToast();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (keyevent.getKeyCode() == 4)
        {
            com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment basefragment = FragmentHelper.getFragmentonTop(new WeakReference(this));
            if (basefragment != null && ("tag-reset-password".equals(basefragment.getTag()) || "tag-confirm-password".equals(basefragment.getTag())))
            {
                FragmentFactory.attachSignInfoFragment(this, null);
                return false;
            }
        }
        return super.onKeyDown(i, keyevent);
    }

    protected void onResume()
    {
        super.onResume();
        KohlsPhoneApplication.getInstance().getAuthenticationUtils().startIdleTimer(this);
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
