// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.settings;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.skype.Account;
import com.skype.android.SkypeFragment;
import com.skype.android.SkypeFragmentComponent;
import com.skype.android.analytics.AnalyticsEvent;
import com.skype.android.app.LayoutExperience;
import com.skype.android.app.Navigation;
import com.skype.android.app.NavigationUrl;
import com.skype.android.app.mnv.MnvAnalytics;
import com.skype.android.app.mnv.MnvCases;
import com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient;
import com.skype.android.inject.AccountProvider;
import com.skype.android.util.AccountUtil;
import com.skype.android.util.ViewUtil;
import com.skype.android.widget.ProgressCircleView;
import java.util.List;

// Referenced classes of package com.skype.android.app.settings:
//            ManageAliasesAdapter

public class ManageAliasesFragment extends SkypeFragment
    implements android.view.View.OnClickListener, ManageAliasesAdapter.OnAliasSearchableStateUpdate
{

    private static final String LIGHTWEIGHT_LIVEID_PREFIX = "cid-(";
    AccountProvider accountProvider;
    ManageAliasesAdapter adapter;
    private TextView addLink;
    ListView aliasesList;
    RelativeLayout emptyView;
    private View footer;
    LayoutExperience layoutExperience;
    TextView manageLink;
    MnvAnalytics mnvAnalytics;
    MnvCases mnvCases;
    Navigation navigation;
    NavigationUrl navigationUrl;
    TextView primaryEmailIdTextView;
    private TextView progressMessagePrimary;
    ShortCircuitProfileWebClient scProfileWebClient;

    public ManageAliasesFragment()
    {
    }

    private void hideAliases()
    {
        emptyView.setVisibility(0);
        adapter.updateAliases(null);
        showSpinner();
    }

    private void hideSpinner()
    {
        ((ProgressCircleView)ViewUtil.a(emptyView, 0x7f1004d0)).setVisibility(4);
        CharSequence charsequence = getText(0x7f0804b6);
        progressMessagePrimary.setText(charsequence);
        progressMessagePrimary.setContentDescription(charsequence);
    }

    private boolean isMsaAccount()
    {
        return AccountUtil.a(accountProvider.get());
    }

    private void showAddLink()
    {
        if (mnvCases.isDeviceReady(com.skype.android.app.mnv.MnvCases.REFERRER.MANAGE_ALIASES, layoutExperience.isMultipane()))
        {
            aliasesList.addFooterView(footer);
            aliasesList.setDivider(null);
            aliasesList.setFooterDividersEnabled(false);
            addLink = (TextView)ViewUtil.a(footer, 0x7f100400);
            ViewUtil.a(this, new View[] {
                addLink
            });
            addLink.setVisibility(0);
        }
    }

    private void showManageLink()
    {
        if (isMsaAccount() || AccountUtil.c(accountProvider.get()))
        {
            manageLink.setVisibility(0);
            ViewUtil.a(this, new View[] {
                manageLink
            });
        }
    }

    private void showPrimaryEmailId()
    {
        if (isMsaAccount())
        {
            String s = accountProvider.get().getLiveidMembernameProp();
            if (!s.startsWith("cid-(") && s.contains("@"))
            {
                primaryEmailIdTextView.setText(s);
                primaryEmailIdTextView.setContentDescription(s);
                primaryEmailIdTextView.setVisibility(0);
            }
        }
    }

    private void showSpinner()
    {
        if (progressMessagePrimary.getVisibility() != 0)
        {
            CharSequence charsequence = getText(0x7f080486);
            progressMessagePrimary.setText(charsequence);
            progressMessagePrimary.setTextSize(0, getResources().getDimension(0x7f0c0091));
            progressMessagePrimary.setTextColor(getResources().getColor(0x7f0f0122));
            progressMessagePrimary.setContentDescription(charsequence);
            progressMessagePrimary.setVisibility(0);
        }
    }

    private void updateAdapter(List list)
    {
        adapter.updateAliases(list);
        updateUi();
    }

    private void updateUi()
    {
        if (adapter.isEmpty())
        {
            hideSpinner();
        } else
        {
            emptyView.setVisibility(8);
        }
        showManageLink();
    }

    public void onClick(View view)
    {
        if (view != manageLink) goto _L2; else goto _L1
_L1:
        if (!isMsaAccount()) goto _L4; else goto _L3
_L3:
        navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.u);
_L6:
        return;
_L4:
        if (AccountUtil.c(accountProvider.get()))
        {
            navigationUrl.goToUrl(getActivity(), com.skype.android.res.Urls.Type.v);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (view == addLink)
        {
            navigation.launchMobileVerification(com.skype.android.app.mnv.MnvCases.REFERRER.MANAGE_ALIASES);
            mnvAnalytics.report(AnalyticsEvent.cu);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getComponent().inject(this);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        footer = layoutinflater.inflate(0x7f0300a6, null);
        return layoutinflater.inflate(0x7f0300a5, null);
    }

    public void onEvent(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.OnGetVerifiedAliasesResult ongetverifiedaliasesresult)
    {
        updateAdapter(ongetverifiedaliasesresult.getVerifiedAliases());
    }

    public void onEvent(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.OnRemoveAlias onremovealias)
    {
        showSpinner();
        scProfileWebClient.getVerifiedAliases();
    }

    public void onResume()
    {
        super.onResume();
        hideAliases();
        scProfileWebClient.getVerifiedAliases();
    }

    public void onSearchableStateUpdate(com.skype.android.app.shortcircuit.ShortCircuitProfileWebClient.AliasInfo aliasinfo, boolean flag)
    {
        scProfileWebClient.updateAliasSearchableState(aliasinfo, flag);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        adapter.setOnAliasSearchableStateUpdateListener(this);
        progressMessagePrimary = (TextView)ViewUtil.a(emptyView, 0x7f1004d1);
        showAddLink();
        showPrimaryEmailId();
        showSpinner();
        aliasesList.setAdapter(adapter);
    }
}
