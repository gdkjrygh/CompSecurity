// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.wallet.analytics.AnalyticsCustomDimension;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.wobs.NewWobListFragment;

public class LoyaltyListFragment extends NewWobListFragment
{

    public LoyaltyListFragment()
    {
        super("OpenLoyaltyPrograms", "user_open_loyalty_programs");
    }

    protected final void onSplashViewInflated(View view)
    {
        Object obj = (ImageView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashImage);
        ((ImageView) (obj)).setImageResource(com.google.android.apps.walletnfcrel.R.drawable.img_intro_loyalty_color_540x351dp);
        ((ImageView) (obj)).setContentDescription(getString(com.google.android.apps.walletnfcrel.R.string.loyalty_splash_image_content_description));
        ((TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashHeaderText)).setText(com.google.android.apps.walletnfcrel.R.string.loyalty_splash_header);
        ((TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashSubText)).setText(com.google.android.apps.walletnfcrel.R.string.loyalty_splash_sub_message);
        obj = (TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.SplashInfoLink);
        ((TextView) (obj)).setText(com.google.android.apps.walletnfcrel.R.string.loyalty_splash_info_link);
        Views.setLinkOnClickListener(((TextView) (obj)), new android.view.View.OnClickListener() {

            final LoyaltyListFragment this$0;

            public final void onClick(View view1)
            {
                analyticsUtil.sendLinkTap("HelpLink", new AnalyticsCustomDimension[0]);
                view1 = HelpUrls.createAboutLoyaltyHelpUrl();
                getActivity().startActivity(UriIntents.create(getActivity(), view1));
            }

            
            {
                this$0 = LoyaltyListFragment.this;
                super();
            }
        });
        ((Button)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.ActionButton)).setVisibility(8);
    }
}
