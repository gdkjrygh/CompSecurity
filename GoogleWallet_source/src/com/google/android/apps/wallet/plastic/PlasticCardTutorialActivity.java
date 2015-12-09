// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.plastic;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.widget.Button;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.apps.wallet.ui.listener.OnActionListener;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.libraries.view.pagingindicator.PagingIndicator;

// Referenced classes of package com.google.android.apps.wallet.plastic:
//            PlasticCardTutorialAdapter

public class PlasticCardTutorialActivity extends WalletActivity
{

    private Button actionButton;
    PlasticCardTutorialAdapter adapter;
    UriRegistry uriRegistry;

    public PlasticCardTutorialActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        setTitle(com.google.android.apps.walletnfcrel.R.string.plastic_card_tutorial_title);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.tutorial_container);
        bundle = (PagingIndicator)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.PagingIndicator);
        ViewPager viewpager = (ViewPager)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.Pager);
        viewpager.setAdapter(adapter);
        bundle.setViewPager(viewpager);
        actionButton = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.ActionButton);
        adapter.setOnLearnMore(new OnActionListener() {

            final PlasticCardTutorialActivity this$0;

            private void onAction(Void void1)
            {
                void1 = UriIntents.create(PlasticCardTutorialActivity.this, HelpUrls.createWalletCardFaqUrl());
                startActivity(void1);
            }

            public final volatile void onAction(Object obj)
            {
                onAction((Void)obj);
            }

            
            {
                this$0 = PlasticCardTutorialActivity.this;
                super();
            }
        });
    }

    protected final void doOnResume()
    {
        actionButton.setOnClickListener(new android.view.View.OnClickListener() {

            final PlasticCardTutorialActivity this$0;

            public final void onClick(View view)
            {
                finish();
                startActivity(uriRegistry.createIntent(6000, new Object[0]));
            }

            
            {
                this$0 = PlasticCardTutorialActivity.this;
                super();
            }
        });
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(2, new Object[0]));
    }
}
