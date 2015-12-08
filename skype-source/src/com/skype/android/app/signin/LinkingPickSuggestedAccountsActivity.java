// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.signin;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.skype.android.SkypeActivityComponent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.CircleImageView;
import java.util.ArrayList;

// Referenced classes of package com.skype.android.app.signin:
//            LinkingAbstractActivity, SignInConstants, LinkingAccountsItem, LinkingUtil, 
//            LinkingPreSignInActivity

public class LinkingPickSuggestedAccountsActivity extends LinkingAbstractActivity
    implements android.view.View.OnClickListener, SignInConstants
{

    private String accessToken;
    private boolean allowSpam;
    LinearLayout linearLayout;
    Button linkDiffAccount;
    LinkingUtil linkingUtil;
    private String loginAccessToken;
    private ArrayList microsoftAccounts;
    private ArrayList pickedAccount;
    private String refreshToken;
    private ArrayList suggestedAccounts;

    public LinkingPickSuggestedAccountsActivity()
    {
    }

    private void pickAccount(View view)
    {
        view = (LinkingAccountsItem)view.getTag();
        if (view != null && suggestedAccounts.contains(view))
        {
            pickedAccount = new ArrayList();
            pickedAccount.add(view);
            pickedAccount.add(new LinkingAccountsItem(view.getAvatar(), view.getFirstName(), "", view.getAccount()));
            nextIntent();
        }
    }

    private void showSuggestedAccounts(ArrayList arraylist)
    {
        int i1 = arraylist.size();
        int i = 2;
        int j = (int)Math.ceil((double)i1 / 2D);
        if (ViewUtil.a(this))
        {
            i = i1;
            j = 1;
            linearLayout.setOrientation(0);
        }
        linearLayout.removeAllViews();
        for (int k = 0; k < j; k++)
        {
            LinearLayout linearlayout = new LinearLayout(this);
            linearlayout.setGravity(1);
            linearlayout.setOrientation(0);
            linearlayout.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -2, 1.0F));
            if (k < j - 1 && !ViewUtil.a(this))
            {
                linearlayout.setPadding(0, 0, 0, getResources().getDimensionPixelSize(0x7f0c0037));
            }
            for (int l = 0; l < i; l++)
            {
                int j1 = l + k * i;
                if (j1 >= i1)
                {
                    break;
                }
                LinkingAccountsItem linkingaccountsitem = (LinkingAccountsItem)arraylist.get(j1);
                if (linkingaccountsitem == null)
                {
                    continue;
                }
                LinearLayout linearlayout1 = (LinearLayout)getLayoutInflater().inflate(0x7f03009a, null);
                if (linearlayout1 != null)
                {
                    linearlayout1.setTag(linkingaccountsitem);
                    ViewUtil.a(this, new View[] {
                        linearlayout1
                    });
                    CircleImageView circleimageview = (CircleImageView)linearlayout1.findViewById(0x7f1003bd);
                    linkingUtil.showSkypeAvatar(linkingaccountsitem.getAvatar(), circleimageview);
                    ((TextView)linearlayout1.findViewById(0x7f1003be)).setText((new StringBuilder()).append(linkingaccountsitem.getFirstName()).append(" ").append(linkingaccountsitem.getLastName()).toString());
                    ((TextView)linearlayout1.findViewById(0x7f1003bf)).setText(linkingaccountsitem.getAccount());
                    linearlayout.addView(linearlayout1);
                }
            }

            linearLayout.addView(linearlayout);
        }

        i = arraylist.size();
        arraylist = getResources().getQuantityString(0x7f0b001a, i, new Object[] {
            Integer.valueOf(i)
        });
        findViewById(0x7f1003db).setContentDescription(arraylist);
    }

    protected void nextIntent()
    {
        Intent intent = new Intent(this, com/skype/android/app/signin/LinkingPreSignInActivity);
        intent.putParcelableArrayListExtra("suggestedAccounts", pickedAccount);
        intent.putParcelableArrayListExtra("microsoftAccounts", microsoftAccounts);
        intent.putExtra("accessToken", accessToken);
        intent.putExtra("refreshToken", refreshToken);
        intent.putExtra("marketing", allowSpam);
        startActivity(intent);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131755964: 
            pickAccount(view);
            return;

        case 2131755996: 
            signInDiffSkypeAccount(accessToken, refreshToken, loginAccessToken, allowSpam, microsoftAccounts);
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
        refreshToken = getIntent().getStringExtra("refreshToken");
        loginAccessToken = getIntent().getStringExtra("loginAccessToken");
        allowSpam = getIntent().getBooleanExtra("marketing", false);
        suggestedAccounts = getIntent().getParcelableArrayListExtra("suggestedAccounts");
        microsoftAccounts = getIntent().getParcelableArrayListExtra("microsoftAccounts");
        ViewUtil.a(this, new View[] {
            linkDiffAccount
        });
    }

    public void onResume()
    {
        super.onResume();
        showSuggestedAccounts(suggestedAccounts);
    }
}
