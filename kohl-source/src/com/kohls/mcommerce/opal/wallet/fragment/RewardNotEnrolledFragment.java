// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.framework.view.activity.HomeActivity;
import com.kohls.mcommerce.opal.wallet.manager.ActionListener;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            BaseWalletFragment

public class RewardNotEnrolledFragment extends BaseWalletFragment
    implements android.view.View.OnClickListener, ActionListener
{

    private View mFragmentView;

    public RewardNotEnrolledFragment()
    {
    }

    private void showAccountSignupActivity()
    {
        UtilityMethods.openAccountActivity(getActivity(), true, false);
        getActivity().finish();
    }

    private void showRewardFragment()
    {
        getActivity().finish();
        Intent intent = new Intent(getActivity(), com/kohls/mcommerce/opal/framework/view/activity/HomeActivity);
        intent.putExtra("open_screen_key", "open_my_wallet");
        startActivity(intent);
    }

    public View doOnCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentView = layoutinflater.inflate(0x7f0300f6, viewgroup, false);
        mFragmentView.findViewById(0x7f0d0072).setPadding(0, getResources().getDimensionPixelSize(0x7f090073), 0, 0);
        mFragmentView.findViewById(0x7f0d0656).setPadding(getResources().getDimensionPixelSize(0x7f09001d), 0, getResources().getDimensionPixelSize(0x7f09001d), 0);
        ((TextView)mFragmentView.findViewById(0x7f0d0072)).setTypeface(WalletFontCache.getGothamBold(getActivity()));
        ((TextView)mFragmentView.findViewById(0x7f0d0074)).setTypeface(WalletFontCache.getGothamBold(getActivity()), 1);
        ((TextView)mFragmentView.findViewById(0x7f0d0076)).setTypeface(WalletFontCache.getGothamBold(getActivity()), 1);
        ((TextView)mFragmentView.findViewById(0x7f0d0078)).setTypeface(WalletFontCache.getGothamBold(getActivity()), 1);
        ((TextView)mFragmentView.findViewById(0x7f0d0075)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        ((TextView)mFragmentView.findViewById(0x7f0d0077)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        ((TextView)mFragmentView.findViewById(0x7f0d0079)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        mFragmentView.findViewById(0x7f0d0656).setOnClickListener(this);
        return mFragmentView;
    }

    protected View getProgressbarContainer()
    {
        return null;
    }

    public void onActionPerformed()
    {
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131560022: 
            ((HomeActivity)getActivity()).attachLoyaltySignupFragment(null);
            break;
        }
    }

    public void onResume()
    {
        if (isUserEnrolledToLoyalty())
        {
            showRewardFragment();
        } else
        {
            setupView();
        }
        super.onResume();
    }

    public void setupView()
    {
    }
}
