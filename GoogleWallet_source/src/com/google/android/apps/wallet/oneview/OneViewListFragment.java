// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.oneview;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.giftcard.api.GiftCardApi;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.loyalty.api.LoyaltyApi;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.NewWobListFragment;
import com.google.android.libraries.commerce.ocr.wobs.pub.ImageCapturePrerequisiteChecker;

public class OneViewListFragment extends NewWobListFragment
{

    ImageCapturePrerequisiteChecker imageCapturePrerequisiteChecker;

    public OneViewListFragment()
    {
        super("OpenOneView", "user_open_one_view");
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        splashLayout = com.google.android.apps.walletnfcrel.R.layout.one_view_list_splash;
    }

    public final void onSplashViewInflated(View view)
    {
        ((ImageView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashImage)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_loyalty_emptystate_color_360x218dp);
        Views.setLinkOnClickListener((TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.AddLoyaltyCards), new android.view.View.OnClickListener() {

            final OneViewListFragment this$0;

            public final void onClick(View view1)
            {
                startActivity(LoyaltyApi.createStartNewAdhocLoyaltyCardFlowIntent(getActivity(), imageCapturePrerequisiteChecker.check()));
            }

            
            {
                this$0 = OneViewListFragment.this;
                super();
            }
        });
        Views.setLinkOnClickListener((TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.AddGiftCards), new android.view.View.OnClickListener() {

            final OneViewListFragment this$0;

            public final void onClick(View view1)
            {
                startActivity(GiftCardApi.createStartNewGiftCardFlowIntent(getActivity(), imageCapturePrerequisiteChecker.check()));
            }

            
            {
                this$0 = OneViewListFragment.this;
                super();
            }
        });
        Views.setLinkOnClickListener((TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.FindOffers), new android.view.View.OnClickListener() {

            final OneViewListFragment this$0;

            public final void onClick(View view1)
            {
                view1 = HelpUrls.createFindOffersHelpUrl();
                startActivity(UriIntents.create(getActivity(), view1));
            }

            
            {
                this$0 = OneViewListFragment.this;
                super();
            }
        });
    }
}
