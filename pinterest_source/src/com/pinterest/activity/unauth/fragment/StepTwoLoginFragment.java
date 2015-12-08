// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import butterknife.ButterKnife;
import com.pinterest.activity.signin.dialog.LoginDialogView;
import com.pinterest.activity.signin.dialog.ResetPasswordDialog;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.base.Application;
import com.pinterest.base.Events;
import com.pinterest.kit.utils.SignupFormUtils;
import com.pinterest.schemas.event.ElementType;
import com.pinterest.ui.text.PEditText;
import org.apache.commons.lang3.StringUtils;

public class StepTwoLoginFragment extends BaseFragment
{

    private String _email_address;
    PEditText _passwordEt;

    public StepTwoLoginFragment()
    {
    }

    private void setUpPasswordField()
    {
        SignupFormUtils.setUpField(_passwordEt, new _cls1());
    }

    private void verifyPasswordAndContinue()
    {
        String s = _passwordEt.getText().toString();
        if (StringUtils.isEmpty(s))
        {
            _passwordEt.setBackgroundResource(0x7f020219);
            _passwordEt.requestFocus();
            _passwordEt.setSelection(s.length());
            Application.showToast(0x7f070352);
            return;
        } else
        {
            AnalyticsApi.a("multistep_signup_login");
            Pinalytics.a(ElementType.LOGIN_BUTTON);
            (new LoginDialogView(getContext(), new BaseDialog())).doLoginFromMultiStep(_email_address, s);
            return;
        }
    }

    void onButtonClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131689847: 
            verifyPasswordAndContinue();
            return;

        case 2131689846: 
            Pinalytics.a(ElementType.RESET_BUTTON);
            Events.post(new DialogEvent(new ResetPasswordDialog(_email_address)));
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f03010c;
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        _actionBar.setTitle(0x7f070348);
        _actionBar.getMenu().clear();
        setUpPasswordField();
        _email_address = getArguments().getString("com.pinterest.EXTRA_EMAIL");
        LoginDialogView.lastEmailInput = _email_address;
    }


    private class _cls1
        implements com.pinterest.kit.utils.SignupFormUtils.OnKeyboardEnter
    {

        final StepTwoLoginFragment this$0;

        public void callback()
        {
            verifyPasswordAndContinue();
        }

        _cls1()
        {
            this$0 = StepTwoLoginFragment.this;
            super();
        }
    }

}
