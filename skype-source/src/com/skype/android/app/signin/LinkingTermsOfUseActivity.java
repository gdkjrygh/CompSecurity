// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import com.skype.android.SkypeActivity;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.CircleImageView;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.signin:
//            SignInConstants, LinkingAccountsItem, LinkingUtil, LiveIdWebClient

public class LinkingTermsOfUseActivity extends SkypeActivity
    implements android.view.View.OnClickListener, SignInConstants
{

    private String accessToken;
    AccessibilityUtil accessibilityUtil;
    TextView accountText;
    CircleImageView avatarImg;
    Button continueBtn;
    EcsConfiguration ecsConfiguration;
    TextView firstnameText;
    TextView fullnameText;
    HttpUtil httpUtil;
    LayoutExperience layoutExperience;
    LinkingUtil linkingUtil;
    private String loginAccessToken;
    CheckBox marketingOption;
    private ArrayList microsoftAccounts;
    TextView noEmergencyCalls;
    private String refreshToken;
    SignInDurationReporter signInDurationReporter;
    private ArrayList suggestedAccounts;
    TextView termsPrivacy;
    private LiveIdWebClient webClient;

    public LinkingTermsOfUseActivity()
    {
    }

    private void displayMicrosoftAccounts(ArrayList arraylist)
    {
        arraylist = (LinkingAccountsItem)arraylist.get(0);
        firstnameText.setText(arraylist.getFirstName());
        String s = arraylist.getAvatar();
        linkingUtil.showMsaAvatar(webClient, s, avatarImg);
        s = (new StringBuilder()).append(arraylist.getFirstName()).append(" ").append(arraylist.getLastName()).toString();
        fullnameText.setText(s);
        arraylist = arraylist.getAccount();
        accountText.setText(arraylist);
    }

    private void goBack(boolean flag, int i)
    {
        Intent intent = new Intent();
        intent.putExtra("marketing", flag);
        intent.putExtra("accessToken", accessToken);
        intent.putExtra("refreshToken", refreshToken);
        intent.putExtra("loginAccessToken", loginAccessToken);
        intent.putParcelableArrayListExtra("suggestedAccounts", suggestedAccounts);
        intent.putParcelableArrayListExtra("microsoftAccounts", microsoftAccounts);
        setResult(i, intent);
        finish();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        goBack(false, 0);
    }

    public void onClick(View view)
    {
        if (getIntent().hasExtra("marketing"))
        {
            goBack(marketingOption.isChecked(), -1);
        } else
        if (getIntent().hasExtra("com.skype.nextIntent"))
        {
            startActivity((Intent)getIntent().getParcelableExtra("com.skype.nextIntent"));
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        bundle = Html.fromHtml(getString(0x7f08049a, new Object[] {
            getString(0x7f080352), getString(0x7f080351)
        }));
        termsPrivacy.setText(bundle, android.widget.TextView.BufferType.SPANNABLE);
        accessibilityUtil.a(termsPrivacy, bundle, accessibilityUtil.a());
        accessToken = getIntent().getStringExtra("accessToken");
        webClient = new LiveIdWebClient(accessToken, ecsConfiguration.getMSALoginScope(), httpUtil);
        refreshToken = getIntent().getStringExtra("refreshToken");
        loginAccessToken = getIntent().getStringExtra("loginAccessToken");
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        suggestedAccounts = getIntent().getParcelableArrayListExtra("suggestedAccounts");
        continueBtn.setOnClickListener(this);
        boolean flag = getIntent().getBooleanExtra("marketing", false);
        bundle = marketingOption;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        bundle.setVisibility(i);
        if (layoutExperience.isMultipane())
        {
            noEmergencyCalls.setVisibility(0);
        }
    }

    public void onResume()
    {
        super.onResume();
        displayMicrosoftAccounts(microsoftAccounts);
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.h);
    }
}
