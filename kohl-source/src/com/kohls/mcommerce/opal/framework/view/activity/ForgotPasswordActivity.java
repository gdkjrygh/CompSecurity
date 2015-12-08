// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.framework.view.activity;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.kohls.mcommerce.opal.framework.view.fragment.FragmentFactory;
import com.kohls.mcommerce.opal.helper.actionbar.ActionBarHelper;

// Referenced classes of package com.kohls.mcommerce.opal.framework.view.activity:
//            BaseActivityWithoutSlider

public class ForgotPasswordActivity extends BaseActivityWithoutSlider
    implements com.kohls.mcommerce.opal.framework.view.fragment.ForgotPasswordFragment.PasswordChangedListener
{

    public ForgotPasswordActivity()
    {
    }

    private void attachActionItemListener()
    {
        getActionBarHelper().getItemView().setOnClickListener(new android.view.View.OnClickListener() {

            final ForgotPasswordActivity this$0;

            public void onClick(View view)
            {
                Toast.makeText(getApplicationContext(), getResources().getString(0x7f080129), 0).show();
            }

            
            {
                this$0 = ForgotPasswordActivity.this;
                super();
            }
        });
    }

    protected int getLayoutId()
    {
        return 0x7f03006b;
    }

    protected void initializeViews(Bundle bundle)
    {
        FragmentFactory.attachForgotPasswordFragment(this, getIntent().getExtras());
        getActionBarHelper().showActionBarWithDetail(getResources().getString(0x7f08021b));
        attachActionItemListener();
    }

    public void onPasswordChanged()
    {
        getActionBarHelper().showActionBarWithDetail(getResources().getString(0x7f080480));
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
