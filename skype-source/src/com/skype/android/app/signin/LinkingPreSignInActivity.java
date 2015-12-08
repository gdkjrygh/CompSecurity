// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.widget.CircleImageView;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractSignInActivity, LinkingAccountsItem, LinkingUtil

public class LinkingPreSignInActivity extends LinkingAbstractSignInActivity
{

    TextView accountText;
    CircleImageView avatarImg;
    TextView fullnameText;
    LinkingUtil linkingUtil;
    protected ArrayList microsoftAccounts;
    protected ArrayList suggestedAccounts;

    public LinkingPreSignInActivity()
    {
    }

    private void displaySuggestedAccounts(ArrayList arraylist)
    {
        arraylist = (LinkingAccountsItem)arraylist.get(0);
        String s = arraylist.getAvatar();
        linkingUtil.showSkypeAvatar(s, avatarImg);
        s = arraylist.getFirstName();
        fullnameText.setText(s);
        skypeName = arraylist.getAccount();
        accountText.setText(skypeName);
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
            goToAnimationView(skypeAccessToken, refreshToken, loginAccessToken, suggestedAccounts, microsoftAccounts);
            finish();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        skypeAccessToken = getIntent().getStringExtra("accessToken");
        refreshToken = getIntent().getStringExtra("refreshToken");
        loginAccessToken = getIntent().getStringExtra("loginAccessToken");
        allowSpam = getIntent().getBooleanExtra("marketing", false);
        suggestedAccounts = getIntent().getParcelableArrayListExtra("suggestedAccounts");
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        setPasswordEditListener();
        setButtonEvents();
        setupSignInHeader();
    }

    public void onResume()
    {
        super.onResume();
        displaySuggestedAccounts(suggestedAccounts);
    }

    protected void resetFields()
    {
        passwordEdit.setText("");
    }
}
