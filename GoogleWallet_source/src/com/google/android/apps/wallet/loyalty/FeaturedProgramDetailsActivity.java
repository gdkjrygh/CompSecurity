// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.loyalty;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.wallet.api.UriRegistry;
import com.google.android.apps.wallet.base.activity.WalletActivity;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.loyalty.discovery.LoyaltyDiscoveryApiClient;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.view.Views;
import com.google.android.apps.wallet.widgets.progressspinner.FullScreenProgressSpinnerManager;
import com.google.android.apps.wallet.wobs.list.LayoutMatcher;
import com.google.android.apps.wallet.wobs.wobl.WoblHolder;
import com.google.commerce.wobs.common.Entrypoint;
import com.google.commerce.wobs.common.uri.WobUris;
import com.google.common.base.Strings;
import com.google.wallet.wobl.exception.WoblException;
import com.google.wallet.wobl.exception.WoblParserException;
import java.util.List;
import java.util.concurrent.Callable;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.loyalty:
//            LoyaltyIntentFactory

public class FeaturedProgramDetailsActivity extends WalletActivity
{

    private static final String TAG = com/google/android/apps/wallet/loyalty/FeaturedProgramDetailsActivity.getSimpleName();
    private ViewGroup detailsContainer;
    private Button joinButton;
    LayoutMatcher layoutMatcher;
    private Button linkButton;
    LoyaltyDiscoveryApiClient loyaltyApiClient;
    LoyaltyIntentFactory loyaltyIntentFactory;
    private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram program;
    FullScreenProgressSpinnerManager progressSpinner;
    UriRegistry uriRegistry;
    UserEventLogger userEventLogger;
    Provider woblHolderProvider;

    public FeaturedProgramDetailsActivity()
    {
        super(com.google.android.apps.walletnfcrel.R.layout.wallet_navdrawer_container);
    }

    private View createDetailsWoblView()
    {
        com.google.wallet.proto.NanoWalletWobl.Layout layout = layoutMatcher.getLayoutForEntrypoint(program.renderOutput, new String[] {
            Entrypoint.DISCOVERABLE_DETAILS.toString()
        });
        if (layout == null)
        {
            break MISSING_BLOCK_LABEL_72;
        }
        WoblHolder woblholder = (WoblHolder)woblHolderProvider.get();
        woblholder.setSource(layout, WobUris.getLoyaltyProgramEntrypointUri(program.programId, Entrypoint.DISCOVERABLE_DETAILS));
        return woblholder.getView();
        WLog.e(TAG, "No WOBL layout for discoverable loyalty program details");
        userEventLogger.log(43, 232);
_L2:
        View view = getLayoutInflater().inflate(com.google.android.apps.walletnfcrel.R.layout.loyalty_details_wobl_error, null);
        ((TextView)Views.findViewById(view, com.google.android.apps.walletnfcrel.R.id.loyalty_ProgramName)).setText(program.nativeRenderingInfo.programName);
        return view;
        WoblException woblexception;
        woblexception;
        WLog.e(TAG, "Failed to render wobl for discoverable loyalty program details", woblexception);
        if (woblexception instanceof WoblParserException)
        {
            userEventLogger.log(43, 233);
        } else
        {
            userEventLogger.log(43, 234);
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    private void fetchProgram(Uri uri)
    {
        String as[];
label0:
        {
            progressSpinner.show();
            Object obj = null;
            if (!uri.getScheme().equals("https") || !uri.getHost().equals("wallet.google.com"))
            {
                break MISSING_BLOCK_LABEL_238;
            }
            List list = uri.getPathSegments();
            if (list.size() != 7 || !((String)list.get(0)).equals("m"))
            {
                as = obj;
                if (!((String)list.get(0)).equals("manage"))
                {
                    break label0;
                }
                as = obj;
                if (!((String)list.get(1)).equals("cgw"))
                {
                    break label0;
                }
                as = obj;
                if (!((String)list.get(2)).equals("loyalty"))
                {
                    break label0;
                }
                as = obj;
                if (!((String)list.get(3)).equals("discoverable"))
                {
                    break label0;
                }
                as = obj;
                if (!((String)list.get(5)).equals("view"))
                {
                    break label0;
                }
                as = obj;
                if (!((String)list.get(6)).equals("detail"))
                {
                    break label0;
                }
            }
            as = new String[1];
            as[0] = (String)list.get(4);
        }
_L1:
        if (as != null)
        {
            executeAction("fetch_program", new Callable() {

                final FeaturedProgramDetailsActivity this$0;
                final String val$discoverableId;

                private com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram call()
                    throws Exception
                {
                    return loyaltyApiClient.fetchFeaturedProgram(discoverableId);
                }

                public final volatile Object call()
                    throws Exception
                {
                    return call();
                }

            
            {
                this$0 = FeaturedProgramDetailsActivity.this;
                discoverableId = s;
                super();
            }
            });
            return;
        } else
        {
            WLog.efmt(TAG, "Could not parse program ID from URI %s", new Object[] {
                uri
            });
            return;
        }
        as = UriRegistry.parseVariables(3001, uri);
        if (as != null)
        {
            startActivity(loyaltyIntentFactory.createNewLoyaltyCardActivityIntent(as[0], false));
            finish();
            return;
        }
        as = UriRegistry.parseVariables(3000, uri);
          goto _L1
    }

    private void onProgramFetched(com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram discoverableloyaltyprogram)
    {
        boolean flag = false;
        if (Strings.isNullOrEmpty(discoverableloyaltyprogram.programDetailUrl))
        {
            startActivity(loyaltyIntentFactory.createNewLoyaltyCardActivityIntent(discoverableloyaltyprogram.programId, false));
            finish();
            return;
        }
        program = discoverableloyaltyprogram;
        setTitle(discoverableloyaltyprogram.nativeRenderingInfo.programName);
        progressSpinner.hide();
        detailsContainer.removeAllViews();
        Object obj = createDetailsWoblView();
        detailsContainer.addView(((View) (obj)));
        obj = joinButton;
        int i;
        if (discoverableloyaltyprogram.signupSupported.booleanValue())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((Button) (obj)).setVisibility(i);
        obj = linkButton;
        if (discoverableloyaltyprogram.linkingSupported.booleanValue())
        {
            i = ((flag) ? 1 : 0);
        } else
        {
            i = 8;
        }
        ((Button) (obj)).setVisibility(i);
    }

    protected final void doOnCreate(Bundle bundle)
    {
        super.doOnCreate(bundle);
        setContentView(com.google.android.apps.walletnfcrel.R.layout.loyalty_details_wobl);
        detailsContainer = (ViewGroup)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.DetailsContainer);
        bundle = new android.view.View.OnClickListener() {

            final FeaturedProgramDetailsActivity this$0;

            public final void onClick(View view)
            {
                boolean flag;
                if (view.getId() == joinButton.getId())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                startActivity(loyaltyIntentFactory.createNewLoyaltyCardActivityIntent(program.programId, flag));
            }

            
            {
                this$0 = FeaturedProgramDetailsActivity.this;
                super();
            }
        };
        joinButton = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.JoinButton);
        joinButton.setOnClickListener(bundle);
        linkButton = (Button)Views.findViewById(this, com.google.android.apps.walletnfcrel.R.id.LinkButton);
        linkButton.setOnClickListener(bundle);
        fetchProgram(getIntent().getData());
    }

    protected final boolean isWidthLimited()
    {
        return false;
    }

    public final void onActionSuccess(String s, Callable callable, Object obj)
    {
        if (s.equals("fetch_program"))
        {
            onProgramFetched((com.google.wallet.proto.api.NanoWalletLoyalty.DiscoverableLoyaltyProgram)obj);
            return;
        } else
        {
            super.onActionSuccess(s, callable, obj);
            return;
        }
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        setIntent(intent);
        fetchProgram(getIntent().getData());
    }

    protected final void onUpPressed()
    {
        navigateUpWithIntent(uriRegistry.createIntent(5, new Object[0]));
    }



}
