// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.util.SignInDurationReporter;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.accessibility.AccessibilityUtil;
import com.skype.android.widget.CircleImageView;
import com.skype.android.widget.YesNoButtons;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractActivity, SignInConstants, LinkingAccountsItem, LinkingUtil, 
//            LinkingPreSignInActivity, LinkingPickSuggestedAccountsActivity

public class LinkingSkypeNamesFoundActivity extends LinkingAbstractActivity
    implements android.view.View.OnClickListener, SignInConstants, com.skype.android.widget.YesNoButtons.Callback
{

    AccessibilityUtil accessibilityUtil;
    private boolean allowSpam;
    CircleImageView firstAvatarImg;
    TextView fullnametext;
    LayoutExperience layoutExperience;
    Button linkDiffSkype;
    ViewGroup linkDiffSkypeContainer;
    TextView linkingTheseAccountsText;
    LinkingUtil linkingUtil;
    TextView matchesSkypeAccountsText;
    TextView microsoftAccountText;
    private ArrayList microsoftAccounts;
    TextView microsoftFullnameText;
    TextView moreSkypeNamesText;
    ViewGroup msaBottomContainer;
    CircleImageView secondAvatarImg;
    SignInDurationReporter signInDurationReporter;
    RelativeLayout skypeAvatars;
    LinearLayout skypeContainer;
    TextView skypeNamesText;
    private ArrayList suggestedAccounts;
    CircleImageView thirdAvatarImg;
    UserPreferences userPrefs;
    YesNoButtons yesNoButtons;

    public LinkingSkypeNamesFoundActivity()
    {
    }

    private void disableAccessibilityForAllChildren(ViewGroup viewgroup)
    {
        for (int i = 0; i < viewgroup.getChildCount(); i++)
        {
            AccessibilityUtil.a(new View[] {
                viewgroup.getChildAt(i)
            });
        }

    }

    private void displayMicrosoftAccounts(ArrayList arraylist)
    {
        arraylist = (LinkingAccountsItem)arraylist.get(0);
        microsoftAccountText.setText(arraylist.getAccount());
        microsoftFullnameText.setText(arraylist.getFullname());
    }

    private void displaySuggestedAccounts(ArrayList arraylist)
    {
        int i;
        int j;
        j = arraylist.size();
        updateMatchesSkypeAccountText(j);
        if (j <= 1)
        {
            break MISSING_BLOCK_LABEL_170;
        }
        i = 0;
_L6:
        LinkingAccountsItem linkingaccountsitem;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        linkingaccountsitem = (LinkingAccountsItem)arraylist.get(i);
        i;
        JVM INSTR tableswitch 0 2: default 64
    //                   0 78
    //                   1 105
    //                   2 132;
           goto _L1 _L2 _L3 _L4
_L4:
        break MISSING_BLOCK_LABEL_132;
_L2:
        break; /* Loop/switch isn't completed */
_L1:
        showMoreSkypeName(i, "");
_L7:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
        linkingUtil.showSkypeAvatar(linkingaccountsitem.getAvatar(), firstAvatarImg);
        showMoreSkypeName(i, linkingaccountsitem.getAccount());
          goto _L7
_L3:
        linkingUtil.showSkypeAvatar(linkingaccountsitem.getAvatar(), secondAvatarImg);
        showMoreSkypeName(i, linkingaccountsitem.getAccount());
          goto _L7
        linkingUtil.showSkypeAvatar(linkingaccountsitem.getAvatar(), thirdAvatarImg);
        linkingUtil.centerAvatar(thirdAvatarImg);
        showMoreSkypeName(i, linkingaccountsitem.getAccount());
          goto _L7
        showSingleSuggestedAccount((LinkingAccountsItem)arraylist.get(0));
    }

    private void pickSuggestedAccounts()
    {
        Intent intent;
        if (suggestedAccounts.size() == 1)
        {
            intent = new Intent(this, com/skype/android/app/signin/LinkingPreSignInActivity);
        } else
        {
            intent = new Intent(this, com/skype/android/app/signin/LinkingPickSuggestedAccountsActivity);
        }
        intent.putParcelableArrayListExtra("suggestedAccounts", suggestedAccounts);
        intent.putParcelableArrayListExtra("microsoftAccounts", microsoftAccounts);
        intent.putExtra("accessToken", skypeAccessToken);
        intent.putExtra("refreshToken", refreshToken);
        intent.putExtra("loginAccessToken", loginAccessToken);
        intent.putExtra("marketing", allowSpam);
        startActivity(intent);
    }

    private void showFullname(String s)
    {
        fullnametext.setText(s);
        fullnametext.setVisibility(0);
    }

    private void showMoreSkypeName(int i, String s)
    {
        if (i == 0)
        {
            skypeNamesText.setText(s);
            return;
        }
        if (i == 1)
        {
            skypeNamesText.append(getString(0x7f080499, new Object[] {
                s
            }));
            return;
        } else
        {
            i--;
            s = getResources().getQuantityString(0x7f0b0019, i, new Object[] {
                Integer.valueOf(i)
            });
            moreSkypeNamesText.setText(s);
            moreSkypeNamesText.setVisibility(0);
            return;
        }
    }

    private void showSingleSuggestedAccount(LinkingAccountsItem linkingaccountsitem)
    {
        linkingUtil.centerAvatar(thirdAvatarImg);
        linkingUtil.showSkypeAvatar(linkingaccountsitem.getAvatar(), thirdAvatarImg);
        showFullname(linkingaccountsitem.getFirstName());
        showSkypeName(linkingaccountsitem.getAccount());
    }

    private void showSkypeName(String s)
    {
        skypeNamesText.setText(s);
    }

    private void updateMatchesSkypeAccountText(int i)
    {
        String s = getResources().getQuantityString(0x7f0b0018, i, new Object[] {
            "", Integer.valueOf(i)
        });
        matchesSkypeAccountsText.setText(s);
        String s1 = (new StringBuilder()).append(((LinkingAccountsItem)microsoftAccounts.get(0)).getFullname()).append(" ").append(s).append(", ").append(skypeNamesText.getText()).toString();
        s = s1;
        if (moreSkypeNamesText.getVisibility() == 0)
        {
            s = (new StringBuilder()).append(s1).append(" ").append(moreSkypeNamesText.getText()).toString();
        }
        msaBottomContainer.setContentDescription((new StringBuilder()).append(s).append(", ").append(linkingTheseAccountsText.getText()).toString());
        disableAccessibilityForAllChildren(msaBottomContainer);
    }

    protected void accountStatusLoggedIn()
    {
        if (!interruptNavigatingHome)
        {
            userPrefs.setNewUser();
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

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131756008: 
        case 2131756012: 
            onYesClick();
            return;

        case 2131755996: 
            signInDiffSkypeAccount(skypeAccessToken, refreshToken, loginAccessToken, allowSpam, microsoftAccounts);
            return;
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
        skypeAccessToken = getIntent().getStringExtra("accessToken");
        refreshToken = getIntent().getStringExtra("refreshToken");
        loginAccessToken = getIntent().getStringExtra("loginAccessToken");
        allowSpam = getIntent().getBooleanExtra("marketing", false);
        suggestedAccounts = getIntent().getParcelableArrayListExtra("suggestedAccounts");
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        ViewUtil.a(this, new View[] {
            skypeAvatars, skypeContainer, linkDiffSkype
        });
        yesNoButtons.setCallback(this);
        if (accessibilityUtil.a())
        {
            linkDiffSkypeContainer.post(accessibilityUtil.a(linkDiffSkypeContainer, linkDiffSkype, 1));
            accessibilityUtil.a(linkDiffSkypeContainer);
        }
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
        displaySuggestedAccounts(suggestedAccounts);
        displayMicrosoftAccounts(microsoftAccounts);
    }

    public void onYesClick()
    {
        pickSuggestedAccounts();
    }
}
