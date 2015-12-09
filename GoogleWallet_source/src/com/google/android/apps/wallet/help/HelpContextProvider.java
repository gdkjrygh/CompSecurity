// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.help;

import com.google.android.apps.wallet.config.featurecontrol.Feature;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.help.api.WalletHelpContext;

public class HelpContextProvider
{

    private WalletHelpContext currentContext;
    private final FeatureManager featureManager;

    HelpContextProvider(FeatureManager featuremanager)
    {
        featureManager = featuremanager;
    }

    public final String getHelpContextKey()
    {
        String s;
        String s1;
        if (featureManager.isFeatureEnabled(Feature.NFC_HCE_PPMS))
        {
            s = "general_tap_and_pay";
        } else
        {
            s = "general_non_tap_and_pay";
        }
        s1 = s;
        if (currentContext != null)
        {
            s1 = String.valueOf(currentContext.getContextKey());
            s1 = (new StringBuilder(String.valueOf(s1).length() + 1 + String.valueOf(s).length())).append(s1).append(":").append(s).toString();
        }
        return s1;
    }

    public final void setWalletHelpContext(WalletHelpContext wallethelpcontext)
    {
        currentContext = wallethelpcontext;
    }
}
