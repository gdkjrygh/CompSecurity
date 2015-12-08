// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;

import android.os.Bundle;
import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.fragment.WalletFragment;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.ui.listener.OnActionListener;

// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycFragmentInterface, SplashScreenDisplay, KycUiModel, KycNavListener

public class KycOowIntroFragment extends WalletFragment
    implements KycFragmentInterface
{

    SplashScreenDisplay display;
    private KycUiModel model;
    private KycNavListener navListener;
    UriRegistry uriRegistry;

    public KycOowIntroFragment()
    {
        setArguments(new Bundle());
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        display.createView(layoutinflater, viewgroup);
        display.setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_kyc_caution_large);
        display.setHeadLine(getString(com.google.android.apps.walletnfcrel.R.string.kyc_oow_intro_headline));
        display.setBodyText1(getString(com.google.android.apps.walletnfcrel.R.string.kyc_oow_intro_body_text1));
        display.setBodyText2(getString(com.google.android.apps.walletnfcrel.R.string.kyc_oow_intro_body_text2));
        display.setLinkText(getString(com.google.android.apps.walletnfcrel.R.string.button_learn_more));
        display.setButtonText(getString(com.google.android.apps.walletnfcrel.R.string.kyc_oow_intro_get_started));
        display.setLinkOnActionListener(new OnActionListener() {

            final KycOowIntroFragment this$0;

            private void onAction(Void void1)
            {
                void1 = UriIntents.create(getActivity(), HelpUrls.createKycHelpUrl());
                startActivity(void1);
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = KycOowIntroFragment.this;
                super();
            }
        });
        display.setButtonOnActionListener(new OnActionListener() {

            final KycOowIntroFragment this$0;

            private void onAction(Void void1)
            {
                if (model.getOowQuizDurationAllowedMillis() - (SystemClock.elapsedRealtime() - model.getOowQuizStartTimeMillis()) <= 0L)
                {
                    navListener.onRequestNav(KycNavListener.NavState.REFERRED);
                    return;
                } else
                {
                    navListener.onRequestNav(KycNavListener.NavState.ENTER_OOW);
                    return;
                }
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = KycOowIntroFragment.this;
                super();
            }
        });
        return display.getView();
    }

    public final void setKycNavListener(KycNavListener kycnavlistener)
    {
        navListener = kycnavlistener;
    }

    public final void setKycUiModel(KycUiModel kycuimodel)
    {
        model = kycuimodel;
    }


}
