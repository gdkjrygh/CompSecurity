// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.kohls.mcommerce.opal.wallet.util.PointsIndicatorUtil;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            DonateToCharityFragment, ShareWithFriendsFragment

public class SharePointsActivity extends Activity
    implements android.view.View.OnClickListener
{

    private String mCharityPosition;
    private String mEmailStr;
    private String mMsgStr;
    private String mPhoneStr;
    private String mPtToShareStr;
    private String mRewardIdStr;

    public SharePointsActivity()
    {
        mPtToShareStr = "1";
    }

    private Fragment getDonateFragment()
    {
        DonateToCharityFragment donatetocharityfragment = new DonateToCharityFragment();
        Bundle bundle = new Bundle();
        bundle.putString("position", mCharityPosition);
        donatetocharityfragment.setArguments(bundle);
        return donatetocharityfragment;
    }

    private Fragment getShareFragment()
    {
        Object obj = getFragmentManager().findFragmentByTag("share");
        boolean flag = getIntent().getExtras().getBoolean("myrewards", false);
        if (obj == null)
        {
            obj = new Bundle();
            ((Bundle) (obj)).putString("email", mEmailStr);
            ((Bundle) (obj)).putString("phone", mPhoneStr);
            ((Bundle) (obj)).putString("rewardid", mRewardIdStr);
            ((Bundle) (obj)).putString("message", mMsgStr);
            ((Bundle) (obj)).putString("points_to_share", mPtToShareStr);
            ((Bundle) (obj)).putBoolean("myrewards", flag);
            ShareWithFriendsFragment sharewithfriendsfragment = new ShareWithFriendsFragment();
            sharewithfriendsfragment.setArguments(((Bundle) (obj)));
            return sharewithfriendsfragment;
        } else
        {
            ((Fragment) (obj)).getArguments().putString("email", mEmailStr);
            ((Fragment) (obj)).getArguments().putString("phone", mPhoneStr);
            ((Fragment) (obj)).getArguments().putString("rewardid", mRewardIdStr);
            ((Fragment) (obj)).getArguments().putString("message", mMsgStr);
            ((Fragment) (obj)).getArguments().putString("points_to_share", mPtToShareStr);
            return ((Fragment) (obj));
        }
    }

    private void initializeViews()
    {
        Button button = (Button)findViewById(0x7f0d00f4);
        Button button1 = (Button)findViewById(0x7f0d00f3);
        if (!TextUtils.isEmpty(getIntent().getExtras().getString("point_balance")))
        {
            (new PointsIndicatorUtil()).setPointsIndicatorBar(this, Integer.parseInt(getIntent().getExtras().getString("point_balance")));
        }
        button1.setTypeface(WalletFontCache.getGothamBold(getApplicationContext()));
        button.setTypeface(WalletFontCache.getGothamBold(getApplicationContext()));
        button1.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    private void setDonateBtnEnabled()
    {
        Button button = (Button)findViewById(0x7f0d00f3);
        Button button1 = (Button)findViewById(0x7f0d00f4);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            button.setBackground(getResources().getDrawable(0x7f0201b6));
            button1.setBackground(getResources().getDrawable(0x7f0201e7));
        } else
        {
            button.setBackgroundDrawable(getResources().getDrawable(0x7f0201b6));
            button1.setBackgroundDrawable(getResources().getDrawable(0x7f0201e7));
        }
        button.setTextColor(getResources().getColor(0x7f0c0048));
        button1.setTextColor(getResources().getColor(0x7f0c010a));
    }

    private void setDonatePointsFragment()
    {
        if (getFragmentManager().findFragmentById(0x7f0d0030) instanceof ShareWithFriendsFragment)
        {
            setDonateBtnEnabled();
            mEmailStr = ((EditText)findViewById(0x7f0d030a)).getText().toString();
            mPhoneStr = ((EditText)findViewById(0x7f0d030c)).getText().toString();
            mRewardIdStr = ((EditText)findViewById(0x7f0d030e)).getText().toString();
            mMsgStr = ((EditText)findViewById(0x7f0d0693)).getText().toString();
            mPtToShareStr = ((TextView)findViewById(0x7f0d0690)).getText().toString();
            Fragment fragment = getFragmentManager().findFragmentByTag("donate");
            FragmentTransaction fragmenttransaction1;
            if (fragment != null)
            {
                fragment.getArguments().putString("position", mCharityPosition);
            } else
            {
                fragment = getDonateFragment();
            }
            fragmenttransaction1 = getFragmentManager().beginTransaction();
            fragmenttransaction1.replace(0x7f0d0030, fragment, "donate");
            fragmenttransaction1.addToBackStack(null);
            fragmenttransaction1.commit();
            return;
        } else
        {
            FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
            fragmenttransaction.replace(0x7f0d0030, getDonateFragment(), "donate");
            fragmenttransaction.addToBackStack(null);
            fragmenttransaction.commit();
            return;
        }
    }

    private void setShareBtnEnabled()
    {
        Button button = (Button)findViewById(0x7f0d00f3);
        Button button1 = (Button)findViewById(0x7f0d00f4);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            button.setBackground(getResources().getDrawable(0x7f0201e7));
            button1.setBackground(getResources().getDrawable(0x7f0201b6));
        } else
        {
            button.setBackgroundDrawable(getResources().getDrawable(0x7f0201e7));
            button1.setBackgroundDrawable(getResources().getDrawable(0x7f0201b6));
        }
        button.setTextColor(getResources().getColor(0x7f0c010a));
        button1.setTextColor(getResources().getColor(0x7f0c0048));
    }

    private void setSharePointsFragment()
    {
        setShareBtnEnabled();
        FragmentTransaction fragmenttransaction = getFragmentManager().beginTransaction();
        fragmenttransaction.replace(0x7f0d0030, getShareFragment(), "share");
        fragmenttransaction.addToBackStack(null);
        fragmenttransaction.commit();
    }

    private void setUpActionBar()
    {
        ActionBar actionbar = getActionBar();
        if (actionbar != null)
        {
            actionbar.setTitle(getResources().getString(0x7f080512));
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayUseLogoEnabled(false);
            actionbar.show();
        }
    }

    public void hideHeaderView()
    {
        findViewById(0x7f0d00b9).setVisibility(8);
        ((TextView)findViewById(0x7f0d00f0)).setVisibility(8);
        ((RelativeLayout)findViewById(0x7f0d00f1)).setVisibility(8);
    }

    public void onBackPressed()
    {
        Object obj1 = getFragmentManager().findFragmentByTag("charitydetail");
        if (obj1 != null)
        {
            findViewById(0x7f0d00f2).setVisibility(0);
            findViewById(0x7f0d00f3).setVisibility(0);
            findViewById(0x7f0d00f4).setVisibility(0);
            findViewById(0x7f0d00f0).setVisibility(0);
            setDonateBtnEnabled();
            Object obj = new Bundle();
            mCharityPosition = ((Fragment) (obj1)).getArguments().getString("position");
            ((Bundle) (obj)).putString("position", mCharityPosition);
            obj1 = new DonateToCharityFragment();
            ((Fragment) (obj1)).setArguments(((Bundle) (obj)));
            obj = getFragmentManager().beginTransaction();
            getFragmentManager().popBackStack(null, 1);
            ((FragmentTransaction) (obj)).replace(0x7f0d0030, ((Fragment) (obj1)), "donate");
            ((FragmentTransaction) (obj)).addToBackStack(null);
            ((FragmentTransaction) (obj)).commit();
            return;
        } else
        {
            finish();
            return;
        }
    }

    public void onClick(View view)
    {
        if (view.getId() == 0x7f0d00f3)
        {
            showHeaderView();
            setSharePointsFragment();
        } else
        if (view.getId() == 0x7f0d00f4)
        {
            showHeaderView();
            setDonatePointsFragment();
            return;
        }
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f03001a);
        setUpActionBar();
        initializeViews();
        setSharePointsFragment();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 4)
        {
            onBackPressed();
        }
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        onBackPressed();
        return true;
    }

    public void showHeaderView()
    {
        findViewById(0x7f0d00b9).setVisibility(0);
        ((TextView)findViewById(0x7f0d00f0)).setVisibility(0);
        ((RelativeLayout)findViewById(0x7f0d00f1)).setVisibility(0);
    }
}
