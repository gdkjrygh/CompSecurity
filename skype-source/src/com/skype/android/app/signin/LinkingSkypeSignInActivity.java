// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import com.skype.android.widget.AccessibleAutoCompleteTextView;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractSignInActivity, LinkingErrorAccountMergedActivity, LinkingAccountsItem

public class LinkingSkypeSignInActivity extends LinkingAbstractSignInActivity
{

    protected ArrayList microsoftAccounts;
    protected ArrayList suggestedAccounts;

    public LinkingSkypeSignInActivity()
    {
    }

    public void accountsAlreadyMerged()
    {
        showErrorScreen(com/skype/android/app/signin/LinkingErrorAccountMergedActivity);
    }

    protected void nextIntent()
    {
        if (!interruptNavigatingHome)
        {
            signInWithMsa();
            return;
        } else
        {
            dismissDialog();
            suggestedAccounts = new ArrayList();
            suggestedAccounts.add(new LinkingAccountsItem("", "", "", skypeName));
            goToAnimationView(skypeAccessToken, refreshToken, loginAccessToken, suggestedAccounts, microsoftAccounts);
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        skypeAccessToken = getIntent().getStringExtra("accessToken");
        refreshToken = getIntent().getStringExtra("refreshToken");
        loginAccessToken = getIntent().getStringExtra("loginAccessToken");
        allowSpam = getIntent().getBooleanExtra("marketing", false);
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        setSkypeNameEditListener();
        setPasswordEditListener();
        setButtonEvents();
        setupAutoComplete();
        setupSignInHeader();
    }

    protected void resetFields()
    {
        skypeNameEdit.setText("");
        passwordEdit.setText("");
    }
}
