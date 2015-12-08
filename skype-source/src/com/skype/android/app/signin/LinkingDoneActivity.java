// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.HttpUtil;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.CircleImageView;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractActivity, LinkingAccountsItem, LinkingUtil, LiveIdWebClient

public class LinkingDoneActivity extends LinkingAbstractActivity
    implements android.view.View.OnClickListener
{

    private String accessToken;
    TextView accountText;
    CircleImageView avatarImg;
    TextView fullnameText;
    HttpUtil httpUtil;
    LinkingUtil linkingUtil;
    private ArrayList microsoftAccounts;
    Button okBtn;
    SignInDurationReporter signInDurationReporter;
    private Bitmap skypeAvatarBitmap;
    private String skypeName;
    private LiveIdWebClient webClient;

    public LinkingDoneActivity()
    {
    }

    private void displayMicrosoftAccounts(ArrayList arraylist)
    {
        arraylist = (LinkingAccountsItem)arraylist.get(0);
        String s = arraylist.getAvatar();
        linkingUtil.showMsaAvatar(webClient, s, avatarImg);
        s = (new StringBuilder()).append(arraylist.getFirstName()).append(" ").append(arraylist.getLastName()).toString();
        fullnameText.setText(s);
        arraylist = arraylist.getAccount();
        accountText.setText(arraylist);
    }

    private void displaySkypeAccount()
    {
        if (skypeAvatarBitmap == null && !TextUtils.isEmpty(skypeName))
        {
            skypeAvatarBitmap = linkingUtil.getBitmap(skypeName);
            if (skypeAvatarBitmap != null)
            {
                avatarImg.setImageBitmap(skypeAvatarBitmap);
            }
        }
    }

    protected void nextIntent()
    {
        navigation.home();
        finish();
    }

    public void onBackPressed()
    {
        super.onBackPressed();
        nextIntent();
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755981: 
            nextIntent();
            break;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
        if (!layoutExperience.isMultipane())
        {
            setRequestedOrientation(7);
        }
        accessToken = getIntent().getStringExtra("accessToken");
        webClient = new LiveIdWebClient(accessToken, configuration.getMSALoginScope(), httpUtil);
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        skypeName = getIntent().getStringExtra("username");
        ViewUtil.a(this, new View[] {
            okBtn
        });
    }

    public void onEvent(com.skype.android.gen.SkyLibListener.OnAccountAvatarResult onaccountavatarresult)
    {
        if (onaccountavatarresult.getCode() == com.skype.SkyLib.AUTH_RESULT.AUTH_OK && skypeAvatarBitmap == null && !TextUtils.isEmpty(skypeName))
        {
            skypeAvatarBitmap = linkingUtil.retrieveSkypeAvatar(skypeName, onaccountavatarresult.getData());
            if (skypeAvatarBitmap != null)
            {
                avatarImg.setImageBitmap(skypeAvatarBitmap);
            }
        }
    }

    public void onResume()
    {
        super.onResume();
        displayMicrosoftAccounts(microsoftAccounts);
        displaySkypeAccount();
        signInDurationReporter.a(com.skype.android.util.SignInDurationReporter.CheckPoint.i);
    }
}
