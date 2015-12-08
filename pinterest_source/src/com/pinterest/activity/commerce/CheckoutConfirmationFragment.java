// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.base.Events;
import com.pinterest.kit.application.Resources;
import com.pinterest.ui.imageview.WebImageView;

public class CheckoutConfirmationFragment extends BaseFragment
{

    TextView _dismissTextView;
    private String _incentiveMessage;
    TextView _incentiveTextView;
    TextView _merchantEmailSentTextView;
    private String _merchantLogo;
    WebImageView _merchantLogoImageView;
    private String _merchantName;
    TextView _merchantWorkingTextView;
    private String _userEmail;

    public CheckoutConfirmationFragment()
    {
        _layoutId = 0x7f0300af;
        _menuId = 0x7f100002;
    }

    void confirmationCloseTextViewClicked()
    {
        Events.post(new com.pinterest.activity.task.model.Navigation.Remove(getNavigation()));
    }

    void confirmationDismissTextViewClicked()
    {
        Events.post(new com.pinterest.activity.task.model.Navigation.Remove(getNavigation()));
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        if (_merchantLogo != null)
        {
            _merchantLogoImageView.setOval(true);
            _merchantLogoImageView.loadUrl(_merchantLogo);
        }
        _merchantWorkingTextView.setText(Resources.string(0x7f07010e, new Object[] {
            _merchantName
        }));
        _merchantEmailSentTextView.setText(Resources.string(0x7f07010d, new Object[] {
            _userEmail
        }));
        if (_incentiveMessage != null)
        {
            _incentiveTextView.setText(_incentiveMessage);
            _incentiveTextView.setVisibility(0);
        }
    }

    public void setNavigation(Navigation navigation)
    {
        super.setNavigation(navigation);
        _merchantLogo = (String)navigation.getExtra("com.pinterest.EXTRA_URI");
        _merchantName = (String)navigation.getExtra("com.pinterest.EXTRA_MERCHANT_NAME");
        _userEmail = (String)navigation.getExtra("com.pinterest.EXTRA_EMAIL");
        if (_merchantName == null || _userEmail == null)
        {
            throw new IllegalStateException("CheckoutConfirmationFragment must receive a user email and merchant name");
        } else
        {
            _incentiveMessage = (String)navigation.getExtra("com.pinterest.EXTRA_COMMERCE_INCENTIVE_MESSSAGE");
            return;
        }
    }
}
