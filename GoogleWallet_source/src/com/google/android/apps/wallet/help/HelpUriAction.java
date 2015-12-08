// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help;

import android.accounts.Account;
import android.app.Activity;
import com.google.android.apps.wallet.analytics.AnalyticsUtil;
import com.google.android.apps.wallet.api.InternalIntents;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.help.api.HelpUrls;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.GoogleHelpLauncher;
import javax.inject.Provider;

// Referenced classes of package com.google.android.apps.wallet.help:
//            HelpContextProvider, LicenseDisclosureActivity

public class HelpUriAction
    implements Runnable
{

    private final Provider account;
    private final Activity activity;
    private final AnalyticsUtil analyticsUtil;
    private final HelpContextProvider helpContextProvider;

    HelpUriAction(Activity activity1, HelpContextProvider helpcontextprovider, Provider provider, AnalyticsUtil analyticsutil)
    {
        activity = activity1;
        helpContextProvider = helpcontextprovider;
        account = provider;
        analyticsUtil = analyticsutil;
    }

    public void run()
    {
        android.content.Intent intent = GoogleHelp.newInstance(helpContextProvider.getHelpContextKey()).setGoogleAccount((Account)account.get()).setFallbackSupportUri(HelpUrls.createTopLevelTopicUrl()).addSupportPhoneNumber("8554925538").addAdditionalOverflowMenuItem(0, activity.getString(com.google.android.apps.walletnfcrel.R.string.about_software_notices_label), InternalIntents.forClass(activity, com/google/android/apps/wallet/help/LicenseDisclosureActivity)).addAdditionalOverflowMenuItem(1, activity.getString(com.google.android.apps.walletnfcrel.R.string.legal_agreements_label), UriIntents.create(activity, HelpUrls.createLegalAgreementsHelpUrl())).buildHelpIntent(activity);
        (new GoogleHelpLauncher(activity)).launch(intent);
        analyticsUtil.endTiming("OpenHelpAndFeedback", null);
    }
}
