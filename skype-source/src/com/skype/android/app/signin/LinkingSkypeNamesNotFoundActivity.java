// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.widget.YesNoButtons;
import java.util.ArrayList;
import javax.inject.Provider;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractActivity, SignInConstants, LinkingAccountsItem

public class LinkingSkypeNamesNotFoundActivity extends LinkingAbstractActivity
    implements SignInConstants, com.skype.android.widget.YesNoButtons.Callback
{

    private boolean allowSpam;
    TextView circleText;
    private ArrayList microsoftAccounts;
    SignInDurationReporter signInDurationReporter;
    Provider userPrefsProvider;
    YesNoButtons yesNoButtons;

    public LinkingSkypeNamesNotFoundActivity()
    {
    }

    private void displayMicrosoftAccounts(ArrayList arraylist)
    {
        arraylist = (LinkingAccountsItem)arraylist.get(0);
        arraylist = getString(0x7f0803e3, new Object[] {
            (new StringBuilder()).append(arraylist.getFirstName()).append(" ").append(arraylist.getLastName()).toString()
        });
        circleText.setText(arraylist);
        findViewById(0x7f1003f2).setContentDescription(arraylist);
    }

    protected void accountStatusLoggedIn()
    {
        if (!interruptNavigatingHome)
        {
            ((UserPreferences)userPrefsProvider.get()).setNewUser();
        }
        super.accountStatusLoggedIn();
    }

    protected void nextIntent()
    {
        signInWithMsa();
    }

    public void onBackPressed()
    {
        cancelAndStartAgain();
        super.onBackPressed();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        if (!layoutExperience.isMultipane())
        {
            setRequestedOrientation(7);
        }
        skypeAccessToken = getIntent().getStringExtra("accessToken");
        refreshToken = getIntent().getStringExtra("refreshToken");
        loginAccessToken = getIntent().getStringExtra("loginAccessToken");
        allowSpam = getIntent().getBooleanExtra("marketing", false);
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        yesNoButtons.setCallback(this);
    }

    public void onNoClick()
    {
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.d);
        showProgress();
        interruptNavigatingHome = false;
        mergeMsaWithTechAccount(skypeAccessToken, allowSpam);
    }

    public void onResume()
    {
        super.onResume();
        displayMicrosoftAccounts(microsoftAccounts);
    }

    public void onYesClick()
    {
        signInDiffSkypeAccount(skypeAccessToken, refreshToken, loginAccessToken, allowSpam, microsoftAccounts);
    }
}
