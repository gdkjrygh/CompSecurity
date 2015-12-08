// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.loyalty;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.kohls.mcommerce.opal.common.app.KohlsPhoneApplication;
import com.kohls.mcommerce.opal.common.util.UtilityMethods;
import com.kohls.mcommerce.opal.common.util.auth.AuthUtil;
import com.kohls.mcommerce.opal.framework.view.fragment.BaseFragment;
import com.kohls.mcommerce.opal.wallet.fragment.ProgramDetailLinkActivity;
import com.kohls.mcommerce.opal.wallet.util.WalletFontCache;

// Referenced classes of package com.kohls.mcommerce.opal.loyalty:
//            CMSDataRetriver

public class LoyaltyGuestFragment extends BaseFragment
{

    private CMSDataRetriver mCmsDataRetriver;

    public LoyaltyGuestFragment()
    {
    }

    private void showAccountSignupActivity()
    {
        UtilityMethods.openAccountActivity(getActivity(), true, "loyalty", 7001);
    }

    protected void initializeAttributes()
    {
    }

    protected void initializeController()
    {
    }

    protected void initializeViews(Bundle bundle)
    {
        ((TextView)getFragmentView().findViewById(0x7f0d0074)).setTypeface(WalletFontCache.getGothamBold(getActivity()), 1);
        ((TextView)getFragmentView().findViewById(0x7f0d0076)).setTypeface(WalletFontCache.getGothamBold(getActivity()), 1);
        ((TextView)getFragmentView().findViewById(0x7f0d0078)).setTypeface(WalletFontCache.getGothamBold(getActivity()), 1);
        ((TextView)getFragmentView().findViewById(0x7f0d0075)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        ((TextView)getFragmentView().findViewById(0x7f0d0077)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        ((TextView)getFragmentView().findViewById(0x7f0d0079)).setTypeface(WalletFontCache.getGothamBook(getActivity()));
        getFragmentView().findViewById(0x7f0d02a9).setOnClickListener(this);
        mCmsDataRetriver = new CMSDataRetriver(getActivity());
        mCmsDataRetriver.getCMSAdapterValues();
    }

    protected int intializaLayoutId()
    {
        return 0x7f030075;
    }

    protected void loadContent()
    {
        setupView();
    }

    public boolean onBackPress()
    {
        return false;
    }

    public void onClick(View view)
    {
        view.getId();
        JVM INSTR tableswitch 2131559081 2131559081: default 24
    //                   2131559081 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if ((view = mCmsDataRetriver.getPropertiesFromLoyaltyHelpVO()) != null)
        {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (!TextUtils.isEmpty(view.getProgram_details_image()))
            {
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setProgramDetailsHeader(view.getProgram_details_image());
            }
            if (!TextUtils.isEmpty(view.getProgram_details_content()))
            {
                KohlsPhoneApplication.getInstance().getAuthenticationUtils().setProgramDetailsContent(view.getProgram_details_content());
            }
            intent.putExtra("pagetitle", getResources().getString(0x7f080452));
            intent.setClass(getActivity(), com/kohls/mcommerce/opal/wallet/fragment/ProgramDetailLinkActivity);
            startActivity(intent);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void setupView()
    {
        View view = getFragmentView().findViewById(0x7f0d02af);
        if (view == null)
        {
            return;
        } else
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final LoyaltyGuestFragment this$0;

                public void onClick(View view1)
                {
                    showAccountSignupActivity();
                }

            
            {
                this$0 = LoyaltyGuestFragment.this;
                super();
            }
            });
            return;
        }
    }

    public void updateViewsOnFailure(Object obj)
    {
    }

    public void updateViewsOnSuccess(Object obj)
    {
    }

}
