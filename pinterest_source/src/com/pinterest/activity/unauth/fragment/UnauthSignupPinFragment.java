// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.activity.task.fragment.BaseFragment;
import com.pinterest.activity.unauth.UnauthHelper;
import com.pinterest.api.remote.AnalyticsApi;
import com.pinterest.api.remote.PinApi;
import com.pinterest.base.GooglePlayServices;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.imageview.WebImageView;

public class UnauthSignupPinFragment extends BaseFragment
{

    View _emailBt;
    View _gplusBt;
    View _gradient;
    WebImageView _pin;
    TextView _title;
    private com.pinterest.api.remote.PinApi.PinApiResponse onPinLoaded;

    public UnauthSignupPinFragment()
    {
        onPinLoaded = new _cls1();
    }

    void onButtonClick(View view)
    {
        if (_emailBt == view)
        {
            AnalyticsApi.a("email_signup_click");
            DialogHelper.goEmailSignup();
            return;
        } else
        {
            UnauthHelper.onClick(view, getActivity());
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f030115;
    }

    public void onStart()
    {
        super.onStart();
        AnalyticsApi.a("unauth_signup_pin");
        AnalyticsApi.a("unauth_home");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        ButterKnife.a(this, view);
        ViewHelper.setVisibility(_gplusBt, GooglePlayServices.isAvailable());
        _title.setText(Html.fromHtml(getString(0x7f0705e5)));
        showPin();
    }

    public void showPin()
    {
        PinApi.a(getArguments().getString("com.pinterest.EXTRA_PIN_ID"), false, onPinLoaded, getApiTag());
    }

    private class _cls1 extends com.pinterest.api.remote.PinApi.PinApiResponse
    {

        final UnauthSignupPinFragment this$0;

        public void onFailure(Throwable throwable, ApiResponse apiresponse)
        {
            PLog.error(throwable, (new StringBuilder("Could not load pin for warm app signup: ")).append(apiresponse.toString()).toString(), new Object[0]);
            throwable = getResources().getDrawable(0x7f020048);
            _pin.setImageDrawable(throwable, true);
            _pin.setPadding(0, (int)com.pinterest.kit.application.Resources.dimension(0x7f0a0162), 0, 0);
            _gradient.setVisibility(0);
        }

        public void onSuccess(Pin pin)
        {
            super.onSuccess(pin);
            _pin.loadUrl(pin.getImageLargeUrl());
            _pin.setCornerRadius((int)com.pinterest.kit.application.Resources.dimension(0x7f0a0181));
        }

        _cls1()
        {
            this$0 = UnauthSignupPinFragment.this;
            super();
        }
    }

}
