// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.DialogHelper;
import com.pinterest.api.remote.AnalyticsApi;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            PinvitationalUnauthWallBaseFragment

public class PinvitationalSignupFragment extends PinvitationalUnauthWallBaseFragment
{

    Button _button;
    private String _inviteCode;
    View _loginContainerView;
    TextView _subtitleTextView;
    TextView _titleTextView;

    public PinvitationalSignupFragment()
    {
    }

    private void init(View view)
    {
        _titleTextView.setText(getString(0x7f070432));
        _subtitleTextView.setVisibility(8);
        view = new android.widget.LinearLayout.LayoutParams(_button.getLayoutParams());
        view.setMargins(((android.widget.LinearLayout.LayoutParams) (view)).leftMargin, 24, ((android.widget.LinearLayout.LayoutParams) (view)).rightMargin, ((android.widget.LinearLayout.LayoutParams) (view)).bottomMargin);
        _button.setLayoutParams(view);
        _button.setText(getString(0x7f07042b));
        _loginContainerView.setVisibility(8);
        _inviteCode = getArguments().getString("com.pinterest.EXTRA_SIGNUP_INVITE_CODE");
    }

    void onButtonClick(View view)
    {
        AnalyticsApi.c("rg_dg_opened");
        DialogHelper.goEmailSignup(_inviteCode);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        _layoutId = 0x7f0300fa;
    }

    public void onResume()
    {
        super.onResume();
        AnalyticsApi.c("rg_landed");
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ButterKnife.a(this, view);
        init(view);
    }
}
